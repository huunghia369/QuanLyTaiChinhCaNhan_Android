// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prudentialfinance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView email;

  @NonNull
  public final FrameLayout fragmentSettingLayout;

  @NonNull
  public final TextView fullName;

  @NonNull
  public final LinearLayout imageLogo;

  @NonNull
  public final ImageView ivAvatar;

  @NonNull
  public final ImageButton logout;

  @NonNull
  public final RecyclerView lvSettings;

  @NonNull
  public final TextView topTitle;

  private FragmentSettingBinding(@NonNull FrameLayout rootView, @NonNull TextView email,
      @NonNull FrameLayout fragmentSettingLayout, @NonNull TextView fullName,
      @NonNull LinearLayout imageLogo, @NonNull ImageView ivAvatar, @NonNull ImageButton logout,
      @NonNull RecyclerView lvSettings, @NonNull TextView topTitle) {
    this.rootView = rootView;
    this.email = email;
    this.fragmentSettingLayout = fragmentSettingLayout;
    this.fullName = fullName;
    this.imageLogo = imageLogo;
    this.ivAvatar = ivAvatar;
    this.logout = logout;
    this.lvSettings = lvSettings;
    this.topTitle = topTitle;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      FrameLayout fragmentSettingLayout = (FrameLayout) rootView;

      id = R.id.fullName;
      TextView fullName = ViewBindings.findChildViewById(rootView, id);
      if (fullName == null) {
        break missingId;
      }

      id = R.id.image_logo;
      LinearLayout imageLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageLogo == null) {
        break missingId;
      }

      id = R.id.ivAvatar;
      ImageView ivAvatar = ViewBindings.findChildViewById(rootView, id);
      if (ivAvatar == null) {
        break missingId;
      }

      id = R.id.logout;
      ImageButton logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      id = R.id.lvSettings;
      RecyclerView lvSettings = ViewBindings.findChildViewById(rootView, id);
      if (lvSettings == null) {
        break missingId;
      }

      id = R.id.topTitle;
      TextView topTitle = ViewBindings.findChildViewById(rootView, id);
      if (topTitle == null) {
        break missingId;
      }

      return new FragmentSettingBinding((FrameLayout) rootView, email, fragmentSettingLayout,
          fullName, imageLogo, ivAvatar, logout, lvSettings, topTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}