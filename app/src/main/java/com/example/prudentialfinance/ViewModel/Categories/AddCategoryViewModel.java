package com.example.prudentialfinance.ViewModel.Categories;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.prudentialfinance.API.HTTPRequest;
import com.example.prudentialfinance.API.HTTPService;
import com.example.prudentialfinance.Activities.Transaction.TransactionCreationActivity;
import com.example.prudentialfinance.Activities.Transaction.TransactionUpdateActivity;
import com.example.prudentialfinance.Container.CategoryAdd;
import com.example.prudentialfinance.Model.Category;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AddCategoryViewModel extends ViewModel {
    private MutableLiveData<CategoryAdd> object;
    private Retrofit service;
    private MutableLiveData<Boolean> isLoading;

    public LiveData<Boolean> isLoading() {
        if (isLoading == null) {
            isLoading = new MutableLiveData<>();
        }
        return isLoading;
    }
    public AddCategoryViewModel() {
        object = new MutableLiveData<>();
        service = HTTPService.getInstance();
        isLoading = new MutableLiveData<>();
    }
    public LiveData<CategoryAdd> getObject()
    {
        if (object == null) {
            object = new MutableLiveData<>();
        }
        return object;
    }

    public void saveData(Map<String, String> headers, Category data){
        isLoading.setValue(true);
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);

        Call<CategoryAdd> container;
        System.out.println(data.toString());
        if(data.getType() == 1){
            container = api.addNewIncomeCategory(headers, data.getName(), data.getDescription(), data.getColor());
        }else{
            container = api.addNewExpenseCategory(headers, data.getName(), data.getDescription(), data.getColor());
        }
        container.enqueue(new Callback<CategoryAdd>() {
            @Override
            public void onResponse(@NonNull Call<CategoryAdd> call, @NonNull Response<CategoryAdd> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    CategoryAdd resource = response.body();
                    assert resource != null;
                    object.setValue(resource);
                    return;
                }
                object.setValue(null);
            }

            @Override
            public void onFailure(@NonNull Call<CategoryAdd> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                object.setValue(null);
            }
        });
    }


    // Tạo mới giao dịch chi tiêu
    public void updateData1(Map<String, String> headers, Category data){
        TransactionCreationActivity transactionCreationActivity = new TransactionCreationActivity();
        isLoading.setValue(true);
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);
        System.out.println("Id = "+transactionCreationActivity.getCategoryId()+"   balance = "+transactionCreationActivity.getCategory_balance_result());
        Call<CategoryAdd> container;
        if(data.getType() == 1){
//            container = api.editIncomeCategory(headers, data.getId(), data.getName(), data.getDescription(), data.getColor());
            container = api.editIncomeCategory(headers,Integer.parseInt(transactionCreationActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionCreationActivity.getCategory_balance_result_income() );
        }else{
            System.out.println("93 OKOK");
            container = api.editExpenseCategory(headers,Integer.parseInt(transactionCreationActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionCreationActivity.getCategory_balance_result() );
        }
        container.enqueue(new Callback<CategoryAdd>() {
            @Override
            public void onResponse(@NonNull Call<CategoryAdd> call, @NonNull Response<CategoryAdd> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    System.out.println("101 okok");
                    CategoryAdd resource = response.body();
                    assert resource != null;
                    object.setValue(resource);
                    return;
                }
                object.setValue(null);
            }

            @Override
            public void onFailure(@NonNull Call<CategoryAdd> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                object.setValue(null);
            }
        });
    }

    // sua o day
    public void updateData2(Map<String, String> headers, Category data){
        TransactionUpdateActivity transactionUpdateActivity = new TransactionUpdateActivity();
        isLoading.setValue(true);
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);
        System.out.println("121 ...... Id = "+transactionUpdateActivity.getCategoryId()+"   balance = "+transactionUpdateActivity.getCategory_balance_result());
        Call<CategoryAdd> container;
        if(data.getType() == 1){
//            container = api.editIncomeCategory(headers, data.getId(), data.getName(), data.getDescription(), data.getColor());
            container = api.editIncomeCategory(headers,Integer.parseInt(transactionUpdateActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionUpdateActivity.getCategory_balance_result_income() );
        }else{
            System.out.println("127 OKOK");
            container = api.editExpenseCategory(headers,Integer.parseInt(transactionUpdateActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionUpdateActivity.getCategory_balance_result() );
        }
        container.enqueue(new Callback<CategoryAdd>() {
            @Override
            public void onResponse(@NonNull Call<CategoryAdd> call, @NonNull Response<CategoryAdd> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    System.out.println("101 okok");
                    CategoryAdd resource = response.body();
                    assert resource != null;
                    object.setValue(resource);
                    return;
                }
                object.setValue(null);
            }

            @Override
            public void onFailure(@NonNull Call<CategoryAdd> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                object.setValue(null);
            }
        });
    }
    // ket thuc sua
    public void updateDataIncome(Map<String, String> headers, Category data){
        TransactionCreationActivity transactionCreationActivity = new TransactionCreationActivity();
        isLoading.setValue(true);
        this.service = HTTPService.getInstance();
        HTTPRequest api = service.create(HTTPRequest.class);
        System.out.println("Idf = "+transactionCreationActivity.getCategoryId()+"   balancef = "+transactionCreationActivity.getCategory_balance_result_income());
        Call<CategoryAdd> container;
        if(data.getType() == 1){
//            container = api.editIncomeCategory(headers, data.getId(), data.getName(), data.getDescription(), data.getColor());
            container = api.editIncomeCategory(headers,Integer.parseInt(transactionCreationActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionCreationActivity.getCategory_balance_result_income() );
            System.out.println("123 OKOKê ffffffffff");
        }else{
            System.out.println("123 OKOKê");
            container = api.editExpenseCategory(headers,Integer.parseInt(transactionCreationActivity.getCategoryId()), data.getName(), data.getDescription(), data.getColor(),transactionCreationActivity.getCategory_balance_result() );
        }
        container.enqueue(new Callback<CategoryAdd>() {
            @Override
            public void onResponse(@NonNull Call<CategoryAdd> call, @NonNull Response<CategoryAdd> response) {
                isLoading.setValue(false);
                if (response.isSuccessful()) {
                    System.out.println("131 okokee");
                    CategoryAdd resource = response.body();
                    assert resource != null;
                    object.setValue(resource);
                    return;
                }
                object.setValue(null);
            }

            @Override
            public void onFailure(@NonNull Call<CategoryAdd> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                object.setValue(null);
            }
        });
    }
}