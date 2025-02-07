// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
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

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton loginSignInWithFacebook;

  @NonNull
  public final ImageButton loginSignInWithGoogle;

  @NonNull
  public final AppCompatButton signUpBtn;

  @NonNull
  public final EditText signUpEmail;

  @NonNull
  public final EditText signUpFirstname;

  @NonNull
  public final EditText signUpLastname;

  @NonNull
  public final TextView signUpLoginBtn;

  @NonNull
  public final EditText signUpPass;

  @NonNull
  public final EditText signUpPassConfirm;

  private ActivitySignUpBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton loginSignInWithFacebook, @NonNull ImageButton loginSignInWithGoogle,
      @NonNull AppCompatButton signUpBtn, @NonNull EditText signUpEmail,
      @NonNull EditText signUpFirstname, @NonNull EditText signUpLastname,
      @NonNull TextView signUpLoginBtn, @NonNull EditText signUpPass,
      @NonNull EditText signUpPassConfirm) {
    this.rootView = rootView;
    this.loginSignInWithFacebook = loginSignInWithFacebook;
    this.loginSignInWithGoogle = loginSignInWithGoogle;
    this.signUpBtn = signUpBtn;
    this.signUpEmail = signUpEmail;
    this.signUpFirstname = signUpFirstname;
    this.signUpLastname = signUpLastname;
    this.signUpLoginBtn = signUpLoginBtn;
    this.signUpPass = signUpPass;
    this.signUpPassConfirm = signUpPassConfirm;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loginSignInWithFacebook;
      ImageButton loginSignInWithFacebook = ViewBindings.findChildViewById(rootView, id);
      if (loginSignInWithFacebook == null) {
        break missingId;
      }

      id = R.id.loginSignInWithGoogle;
      ImageButton loginSignInWithGoogle = ViewBindings.findChildViewById(rootView, id);
      if (loginSignInWithGoogle == null) {
        break missingId;
      }

      id = R.id.signUpBtn;
      AppCompatButton signUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (signUpBtn == null) {
        break missingId;
      }

      id = R.id.signUpEmail;
      EditText signUpEmail = ViewBindings.findChildViewById(rootView, id);
      if (signUpEmail == null) {
        break missingId;
      }

      id = R.id.signUpFirstname;
      EditText signUpFirstname = ViewBindings.findChildViewById(rootView, id);
      if (signUpFirstname == null) {
        break missingId;
      }

      id = R.id.signUpLastname;
      EditText signUpLastname = ViewBindings.findChildViewById(rootView, id);
      if (signUpLastname == null) {
        break missingId;
      }

      id = R.id.signUpLoginBtn;
      TextView signUpLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (signUpLoginBtn == null) {
        break missingId;
      }

      id = R.id.signUpPass;
      EditText signUpPass = ViewBindings.findChildViewById(rootView, id);
      if (signUpPass == null) {
        break missingId;
      }

      id = R.id.signUpPassConfirm;
      EditText signUpPassConfirm = ViewBindings.findChildViewById(rootView, id);
      if (signUpPassConfirm == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((LinearLayout) rootView, loginSignInWithFacebook,
          loginSignInWithGoogle, signUpBtn, signUpEmail, signUpFirstname, signUpLastname,
          signUpLoginBtn, signUpPass, signUpPassConfirm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
