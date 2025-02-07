// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddCategoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final ImageButton catColor;

  @NonNull
  public final EditText categoryDesc;

  @NonNull
  public final EditText categoryName;

  @NonNull
  public final AppCompatButton saveBtn;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView topTitle;

  private ActivityAddCategoryBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backBtn,
      @NonNull ImageButton catColor, @NonNull EditText categoryDesc, @NonNull EditText categoryName,
      @NonNull AppCompatButton saveBtn, @NonNull ScrollView scrollView,
      @NonNull TextView topTitle) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.catColor = catColor;
    this.categoryDesc = categoryDesc;
    this.categoryName = categoryName;
    this.saveBtn = saveBtn;
    this.scrollView = scrollView;
    this.topTitle = topTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.cat_color;
      ImageButton catColor = ViewBindings.findChildViewById(rootView, id);
      if (catColor == null) {
        break missingId;
      }

      id = R.id.category_desc;
      EditText categoryDesc = ViewBindings.findChildViewById(rootView, id);
      if (categoryDesc == null) {
        break missingId;
      }

      id = R.id.category_name;
      EditText categoryName = ViewBindings.findChildViewById(rootView, id);
      if (categoryName == null) {
        break missingId;
      }

      id = R.id.saveBtn;
      AppCompatButton saveBtn = ViewBindings.findChildViewById(rootView, id);
      if (saveBtn == null) {
        break missingId;
      }

      id = R.id.scrollView;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.topTitle;
      TextView topTitle = ViewBindings.findChildViewById(rootView, id);
      if (topTitle == null) {
        break missingId;
      }

      return new ActivityAddCategoryBinding((LinearLayout) rootView, backBtn, catColor,
          categoryDesc, categoryName, saveBtn, scrollView, topTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
