// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.Helpers.OTPEditText;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResetPasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnResetPass;

  @NonNull
  public final AppCompatButton btnSendOtp;

  @NonNull
  public final OTPEditText etOtp;

  @NonNull
  public final LinearLayout otpLayout;

  @NonNull
  public final TextView resetPassDescription;

  @NonNull
  public final LinearLayout resetPassLayout;

  @NonNull
  public final TextView resetPassTitle;

  @NonNull
  public final TextView tvResendOTP;

  @NonNull
  public final EditText txtConfirmpassword;

  @NonNull
  public final EditText txtPassword;

  private ActivityResetPasswordBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton btnResetPass, @NonNull AppCompatButton btnSendOtp,
      @NonNull OTPEditText etOtp, @NonNull LinearLayout otpLayout,
      @NonNull TextView resetPassDescription, @NonNull LinearLayout resetPassLayout,
      @NonNull TextView resetPassTitle, @NonNull TextView tvResendOTP,
      @NonNull EditText txtConfirmpassword, @NonNull EditText txtPassword) {
    this.rootView = rootView;
    this.btnResetPass = btnResetPass;
    this.btnSendOtp = btnSendOtp;
    this.etOtp = etOtp;
    this.otpLayout = otpLayout;
    this.resetPassDescription = resetPassDescription;
    this.resetPassLayout = resetPassLayout;
    this.resetPassTitle = resetPassTitle;
    this.tvResendOTP = tvResendOTP;
    this.txtConfirmpassword = txtConfirmpassword;
    this.txtPassword = txtPassword;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reset_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResetPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_ResetPass;
      AppCompatButton btnResetPass = ViewBindings.findChildViewById(rootView, id);
      if (btnResetPass == null) {
        break missingId;
      }

      id = R.id.btn_SendOtp;
      AppCompatButton btnSendOtp = ViewBindings.findChildViewById(rootView, id);
      if (btnSendOtp == null) {
        break missingId;
      }

      id = R.id.et_otp;
      OTPEditText etOtp = ViewBindings.findChildViewById(rootView, id);
      if (etOtp == null) {
        break missingId;
      }

      id = R.id.otp_layout;
      LinearLayout otpLayout = ViewBindings.findChildViewById(rootView, id);
      if (otpLayout == null) {
        break missingId;
      }

      id = R.id.reset_pass_description;
      TextView resetPassDescription = ViewBindings.findChildViewById(rootView, id);
      if (resetPassDescription == null) {
        break missingId;
      }

      id = R.id.reset_pass_layout;
      LinearLayout resetPassLayout = ViewBindings.findChildViewById(rootView, id);
      if (resetPassLayout == null) {
        break missingId;
      }

      id = R.id.reset_pass_title;
      TextView resetPassTitle = ViewBindings.findChildViewById(rootView, id);
      if (resetPassTitle == null) {
        break missingId;
      }

      id = R.id.tv_ResendOTP;
      TextView tvResendOTP = ViewBindings.findChildViewById(rootView, id);
      if (tvResendOTP == null) {
        break missingId;
      }

      id = R.id.txt_confirmpassword;
      EditText txtConfirmpassword = ViewBindings.findChildViewById(rootView, id);
      if (txtConfirmpassword == null) {
        break missingId;
      }

      id = R.id.txt_password;
      EditText txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      return new ActivityResetPasswordBinding((LinearLayout) rootView, btnResetPass, btnSendOtp,
          etOtp, otpLayout, resetPassDescription, resetPassLayout, resetPassTitle, tvResendOTP,
          txtConfirmpassword, txtPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}