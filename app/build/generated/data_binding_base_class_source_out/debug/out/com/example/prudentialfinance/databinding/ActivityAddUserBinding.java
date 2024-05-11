// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
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

public final class ActivityAddUserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final AppCompatButton saveBtn;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final Spinner spnAccountType;

  @NonNull
  public final Switch swActive;

  @NonNull
  public final TextView topTitle;

  @NonNull
  public final EditText txtEmail;

  @NonNull
  public final EditText txtFirstname;

  @NonNull
  public final EditText txtLastname;

  private ActivityAddUserBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backBtn,
      @NonNull AppCompatButton saveBtn, @NonNull ScrollView scrollView,
      @NonNull Spinner spnAccountType, @NonNull Switch swActive, @NonNull TextView topTitle,
      @NonNull EditText txtEmail, @NonNull EditText txtFirstname, @NonNull EditText txtLastname) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.saveBtn = saveBtn;
    this.scrollView = scrollView;
    this.spnAccountType = spnAccountType;
    this.swActive = swActive;
    this.topTitle = topTitle;
    this.txtEmail = txtEmail;
    this.txtFirstname = txtFirstname;
    this.txtLastname = txtLastname;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
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

      id = R.id.spnAccountType;
      Spinner spnAccountType = ViewBindings.findChildViewById(rootView, id);
      if (spnAccountType == null) {
        break missingId;
      }

      id = R.id.swActive;
      Switch swActive = ViewBindings.findChildViewById(rootView, id);
      if (swActive == null) {
        break missingId;
      }

      id = R.id.topTitle;
      TextView topTitle = ViewBindings.findChildViewById(rootView, id);
      if (topTitle == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      EditText txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtFirstname;
      EditText txtFirstname = ViewBindings.findChildViewById(rootView, id);
      if (txtFirstname == null) {
        break missingId;
      }

      id = R.id.txtLastname;
      EditText txtLastname = ViewBindings.findChildViewById(rootView, id);
      if (txtLastname == null) {
        break missingId;
      }

      return new ActivityAddUserBinding((LinearLayout) rootView, backBtn, saveBtn, scrollView,
          spnAccountType, swActive, topTitle, txtEmail, txtFirstname, txtLastname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}