// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentMenuElementBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout fragmentMenuParentLayout;

  @NonNull
  public final ImageView menuIcon;

  @NonNull
  public final TextView menuName;

  private FragmentMenuElementBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout fragmentMenuParentLayout, @NonNull ImageView menuIcon,
      @NonNull TextView menuName) {
    this.rootView = rootView;
    this.fragmentMenuParentLayout = fragmentMenuParentLayout;
    this.menuIcon = menuIcon;
    this.menuName = menuName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMenuElementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMenuElementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_menu_element, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMenuElementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout fragmentMenuParentLayout = (RelativeLayout) rootView;

      id = R.id.menuIcon;
      ImageView menuIcon = ViewBindings.findChildViewById(rootView, id);
      if (menuIcon == null) {
        break missingId;
      }

      id = R.id.menuName;
      TextView menuName = ViewBindings.findChildViewById(rootView, id);
      if (menuName == null) {
        break missingId;
      }

      return new FragmentMenuElementBinding((RelativeLayout) rootView, fragmentMenuParentLayout,
          menuIcon, menuName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}