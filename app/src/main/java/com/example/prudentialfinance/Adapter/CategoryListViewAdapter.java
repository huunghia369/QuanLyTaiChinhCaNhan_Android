package com.example.prudentialfinance.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.prudentialfinance.Helpers.Helper;
import com.example.prudentialfinance.Model.Category;
import com.example.prudentialfinance.R;

import java.util.ArrayList;

public class CategoryListViewAdapter extends ArrayAdapter<Category> {

    private ArrayList<Category> categories = new ArrayList<>();
    private Context context;


    public CategoryListViewAdapter(Context context, ArrayList<Category> categories) {
        super(context, 0, categories);
        this.categories = categories;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return instanciate(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return instanciate(position, convertView, parent);
    }


    private View instanciate(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.spinner_category_element, parent, false);
        }

        TextView categoryTitle = convertView.findViewById(R.id.categoryTitle);
        TextView categoryBalance = convertView.findViewById(R.id.categoryBalance);

        Category category = getItem(position);
        String name = category.getName();
        String balance = Helper.formatNumber(category.getBalance());

        if (category.getType() == 1) {
            categoryBalance.setText(" ");
        } else {
            categoryBalance.setText(balance);
        }

        categoryTitle.setText(name);
        return convertView;
    }

}
