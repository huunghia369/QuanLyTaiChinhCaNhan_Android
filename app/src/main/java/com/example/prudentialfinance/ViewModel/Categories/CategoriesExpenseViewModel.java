package com.example.prudentialfinance.ViewModel.Categories;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.prudentialfinance.API.HTTPRequest;
import com.example.prudentialfinance.API.HTTPService;
import com.example.prudentialfinance.Container.CategoryAdd;
import com.example.prudentialfinance.Container.CategoryGetAll;
import com.example.prudentialfinance.Container.ReportTotalBalance;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CategoriesExpenseViewModel extends ViewModel {

    private final MutableLiveData<Double> totalBalance = new MutableLiveData<>();

    // Chia % thu nhập
    public MutableLiveData<Double> getTotalBalance() {
        return totalBalance;
    }


    private final MutableLiveData<Boolean> animation = new MutableLiveData<>();
    public MutableLiveData<Boolean> getAnimation() {
        return animation;
    }

    private MutableLiveData<CategoryGetAll> object;
    private Retrofit service;
    private MutableLiveData<Boolean> isLoading;
    private int start = 0;
    private int length = 50;

    public LiveData<Boolean> isLoading() {
        if (isLoading == null) {
            isLoading = new MutableLiveData<>();
        }
        return isLoading;
    }

    public LiveData<CategoryGetAll> getObject()
    {
        if (object == null) {
            object = new MutableLiveData<>();
        }
        return object;
    }

    // Chia % thu nhập
    public void instanciate(Map<String, String> headers)
    {
        /*Step 1*/
        Retrofit service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);

        /*Step 2*/
        retrieveTotalBalanceIncomeAndSplitBalance(headers, api);
    }
    // Chia % thu nhập


    public void getData(Map<String, String> headers,  String query){
        isLoading.setValue(true);
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);

        Call<CategoryGetAll> container = api.searchExpenseCategories(headers, query, start, length, "id", "decs");
        container.enqueue(new Callback<CategoryGetAll>() {
            @Override
            public void onResponse(@NonNull Call<CategoryGetAll> call, @NonNull Response<CategoryGetAll> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    CategoryGetAll resource = response.body();
                    assert resource != null;
                    object.setValue(resource);
                    return;
                }
                object.setValue(null);
            }

            @Override
            public void onFailure(@NonNull Call<CategoryGetAll> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                object.setValue(null);
            }
        });
    }

    public void deteteItem(Map<String, String> headers, Integer id){
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);

        Call<CategoryAdd> container = api.removeExpenseCategories(headers, id);
        container.enqueue(new Callback<CategoryAdd>() {
            @Override
            public void onResponse(@NonNull Call<CategoryAdd> call, @NonNull Response<CategoryAdd> response) {
            }

            @Override
            public void onFailure(@NonNull Call<CategoryAdd> call, @NonNull Throwable t) {

            }
        });
    }

    public void retrieveTotalBalanceIncomeAndSplitBalance(Map<String, String> headers, HTTPRequest api)
    {
        animation.setValue(true);
        /*Step 2*/
        System.out.println("GOI API THANH CONG");
        Call<ReportTotalBalance> container = api.reportTotalBalanceIncomeAndSplitBalance(headers, "month");

        System.out.println("CHIA % CHUA THANH CONG");
        /*Step 3*/
        container.enqueue(new Callback<ReportTotalBalance>() {
            @Override
            public void onResponse(@NonNull Call<ReportTotalBalance> call, @NonNull Response<ReportTotalBalance> response) {
                animation.setValue(false);
                if(response.isSuccessful())
                {
                    System.out.println("CHIA % THANH CONG");
                    ReportTotalBalance resource = response.body();
                    assert resource != null;
                    totalBalance.setValue(resource.getMonth());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ReportTotalBalance> call,@NonNull Throwable t) {
                System.out.println("CHIA % LOIIIIII");
                animation.setValue(false);
                totalBalance.setValue(9.0);
            }
        });
    }


}