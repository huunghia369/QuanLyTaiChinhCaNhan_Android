// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCardElementBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView cardBalance;

  @NonNull
  public final TextView cardBank;

  @NonNull
  public final TextView cardDescription;

  @NonNull
  public final TextView cardNumber;

  @NonNull
  public final RelativeLayout cardParentLayout;

  private FragmentCardElementBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView cardBalance, @NonNull TextView cardBank, @NonNull TextView cardDescription,
      @NonNull TextView cardNumber, @NonNull RelativeLayout cardParentLayout) {
    this.rootView = rootView;
    this.cardBalance = cardBalance;
    this.cardBank = cardBank;
    this.cardDescription = cardDescription;
    this.cardNumber = cardNumber;
    this.cardParentLayout = cardParentLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCardElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCardElementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_card_element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCardElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardBalance;
      TextView cardBalance = ViewBindings.findChildViewById(rootView, id);
      if (cardBalance == null) {
        break missingId;
      }

      id = R.id.cardBank;
      TextView cardBank = ViewBindings.findChildViewById(rootView, id);
      if (cardBank == null) {
        break missingId;
      }

      id = R.id.cardDescription;
      TextView cardDescription = ViewBindings.findChildViewById(rootView, id);
      if (cardDescription == null) {
        break missingId;
      }

      id = R.id.cardNumber;
      TextView cardNumber = ViewBindings.findChildViewById(rootView, id);
      if (cardNumber == null) {
        break missingId;
      }

      id = R.id.cardParentLayout;
      RelativeLayout cardParentLayout = ViewBindings.findChildViewById(rootView, id);
      if (cardParentLayout == null) {
        break missingId;
      }

      return new FragmentCardElementBinding((RelativeLayout) rootView, cardBalance, cardBank,
          cardDescription, cardNumber, cardParentLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}