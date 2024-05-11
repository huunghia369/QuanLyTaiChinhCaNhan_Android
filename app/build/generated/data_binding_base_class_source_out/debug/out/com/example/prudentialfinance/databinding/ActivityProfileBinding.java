// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final EditText firstname;

  @NonNull
  public final FrameLayout imageLogo;

  @NonNull
  public final ImageView ivAvatar;

  @NonNull
  public final AppCompatImageView ivEdit;

  @NonNull
  public final EditText lastname;

  @NonNull
  public final AppCompatButton saveBtn;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView signUpEmail;

  @NonNull
  public final TextView topTitle;

  private ActivityProfileBinding(@NonNull LinearLayout rootView, @NonNull ImageButton backBtn,
      @NonNull EditText firstname, @NonNull FrameLayout imageLogo, @NonNull ImageView ivAvatar,
      @NonNull AppCompatImageView ivEdit, @NonNull EditText lastname,
      @NonNull AppCompatButton saveBtn, @NonNull ScrollView scrollView,
      @NonNull TextView signUpEmail, @NonNull TextView topTitle) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.firstname = firstname;
    this.imageLogo = imageLogo;
    this.ivAvatar = ivAvatar;
    this.ivEdit = ivEdit;
    this.lastname = lastname;
    this.saveBtn = saveBtn;
    this.scrollView = scrollView;
    this.signUpEmail = signUpEmail;
    this.topTitle = topTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.firstname;
      EditText firstname = ViewBindings.findChildViewById(rootView, id);
      if (firstname == null) {
        break missingId;
      }

      id = R.id.image_logo;
      FrameLayout imageLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageLogo == null) {
        break missingId;
      }

      id = R.id.ivAvatar;
      ImageView ivAvatar = ViewBindings.findChildViewById(rootView, id);
      if (ivAvatar == null) {
        break missingId;
      }

      id = R.id.ivEdit;
      AppCompatImageView ivEdit = ViewBindings.findChildViewById(rootView, id);
      if (ivEdit == null) {
        break missingId;
      }

      id = R.id.lastname;
      EditText lastname = ViewBindings.findChildViewById(rootView, id);
      if (lastname == null) {
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

      id = R.id.signUpEmail;
      TextView signUpEmail = ViewBindings.findChildViewById(rootView, id);
      if (signUpEmail == null) {
        break missingId;
      }

      id = R.id.topTitle;
      TextView topTitle = ViewBindings.findChildViewById(rootView, id);
      if (topTitle == null) {
        break missingId;
      }

      return new ActivityProfileBinding((LinearLayout) rootView, backBtn, firstname, imageLogo,
          ivAvatar, ivEdit, lastname, saveBtn, scrollView, signUpEmail, topTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}