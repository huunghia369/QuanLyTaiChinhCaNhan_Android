// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCardCreationSuccessfullyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton buttonDismiss;

  private ActivityCardCreationSuccessfullyBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton buttonDismiss) {
    this.rootView = rootView;
    this.buttonDismiss = buttonDismiss;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCardCreationSuccessfullyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCardCreationSuccessfullyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_card_creation_successfully, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCardCreationSuccessfullyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDismiss;
      AppCompatButton buttonDismiss = ViewBindings.findChildViewById(rootView, id);
      if (buttonDismiss == null) {
        break missingId;
      }

      return new ActivityCardCreationSuccessfullyBinding((LinearLayout) rootView, buttonDismiss);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
