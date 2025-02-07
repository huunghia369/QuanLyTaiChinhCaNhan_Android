// Generated by view binder compiler. Do not edit!
package com.example.prudentialfinance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

public final class ActivityTransactionInformationBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout layoutAccountName;

  @NonNull
  public final LinearLayout layoutAmount;

  @NonNull
  public final LinearLayout layoutCategoryName;

  @NonNull
  public final LinearLayout layoutDate;

  @NonNull
  public final LinearLayout layoutName;

  @NonNull
  public final LinearLayout layoutReference;

  @NonNull
  public final TextView transactionInforAccountContent;

  @NonNull
  public final TextView transactionInforAccountTitle;

  @NonNull
  public final TextView transactionInforAmountContent;

  @NonNull
  public final TextView transactionInforAmountTitle;

  @NonNull
  public final ImageView transactionInforAvatar;

  @NonNull
  public final AppCompatButton transactionInforButtonEdit;

  @NonNull
  public final ImageButton transactionInforButtonGoBack;

  @NonNull
  public final TextView transactionInforCategoryContent;

  @NonNull
  public final TextView transactionInforCategoryTitle;

  @NonNull
  public final ScrollView transactionInforContent;

  @NonNull
  public final TextView transactionInforDateContent;

  @NonNull
  public final TextView transactionInforDateTitle;

  @NonNull
  public final TextView transactionInforDescription;

  @NonNull
  public final TextView transactionInforDescriptionContent;

  @NonNull
  public final TextView transactionInforNameContent;

  @NonNull
  public final TextView transactionInforNameTitle;

  @NonNull
  public final TextView transactionInforReferenceContent;

  @NonNull
  public final TextView transactionInforReferenceTitle;

  @NonNull
  public final LinearLayout transactionInforTitleAndButtonBack;

  private ActivityTransactionInformationBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout layoutAccountName, @NonNull LinearLayout layoutAmount,
      @NonNull LinearLayout layoutCategoryName, @NonNull LinearLayout layoutDate,
      @NonNull LinearLayout layoutName, @NonNull LinearLayout layoutReference,
      @NonNull TextView transactionInforAccountContent,
      @NonNull TextView transactionInforAccountTitle,
      @NonNull TextView transactionInforAmountContent,
      @NonNull TextView transactionInforAmountTitle, @NonNull ImageView transactionInforAvatar,
      @NonNull AppCompatButton transactionInforButtonEdit,
      @NonNull ImageButton transactionInforButtonGoBack,
      @NonNull TextView transactionInforCategoryContent,
      @NonNull TextView transactionInforCategoryTitle, @NonNull ScrollView transactionInforContent,
      @NonNull TextView transactionInforDateContent, @NonNull TextView transactionInforDateTitle,
      @NonNull TextView transactionInforDescription,
      @NonNull TextView transactionInforDescriptionContent,
      @NonNull TextView transactionInforNameContent, @NonNull TextView transactionInforNameTitle,
      @NonNull TextView transactionInforReferenceContent,
      @NonNull TextView transactionInforReferenceTitle,
      @NonNull LinearLayout transactionInforTitleAndButtonBack) {
    this.rootView = rootView;
    this.layoutAccountName = layoutAccountName;
    this.layoutAmount = layoutAmount;
    this.layoutCategoryName = layoutCategoryName;
    this.layoutDate = layoutDate;
    this.layoutName = layoutName;
    this.layoutReference = layoutReference;
    this.transactionInforAccountContent = transactionInforAccountContent;
    this.transactionInforAccountTitle = transactionInforAccountTitle;
    this.transactionInforAmountContent = transactionInforAmountContent;
    this.transactionInforAmountTitle = transactionInforAmountTitle;
    this.transactionInforAvatar = transactionInforAvatar;
    this.transactionInforButtonEdit = transactionInforButtonEdit;
    this.transactionInforButtonGoBack = transactionInforButtonGoBack;
    this.transactionInforCategoryContent = transactionInforCategoryContent;
    this.transactionInforCategoryTitle = transactionInforCategoryTitle;
    this.transactionInforContent = transactionInforContent;
    this.transactionInforDateContent = transactionInforDateContent;
    this.transactionInforDateTitle = transactionInforDateTitle;
    this.transactionInforDescription = transactionInforDescription;
    this.transactionInforDescriptionContent = transactionInforDescriptionContent;
    this.transactionInforNameContent = transactionInforNameContent;
    this.transactionInforNameTitle = transactionInforNameTitle;
    this.transactionInforReferenceContent = transactionInforReferenceContent;
    this.transactionInforReferenceTitle = transactionInforReferenceTitle;
    this.transactionInforTitleAndButtonBack = transactionInforTitleAndButtonBack;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTransactionInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTransactionInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_transaction_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTransactionInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layoutAccountName;
      LinearLayout layoutAccountName = ViewBindings.findChildViewById(rootView, id);
      if (layoutAccountName == null) {
        break missingId;
      }

      id = R.id.layoutAmount;
      LinearLayout layoutAmount = ViewBindings.findChildViewById(rootView, id);
      if (layoutAmount == null) {
        break missingId;
      }

      id = R.id.layoutCategoryName;
      LinearLayout layoutCategoryName = ViewBindings.findChildViewById(rootView, id);
      if (layoutCategoryName == null) {
        break missingId;
      }

      id = R.id.layoutDate;
      LinearLayout layoutDate = ViewBindings.findChildViewById(rootView, id);
      if (layoutDate == null) {
        break missingId;
      }

      id = R.id.layoutName;
      LinearLayout layoutName = ViewBindings.findChildViewById(rootView, id);
      if (layoutName == null) {
        break missingId;
      }

      id = R.id.layoutReference;
      LinearLayout layoutReference = ViewBindings.findChildViewById(rootView, id);
      if (layoutReference == null) {
        break missingId;
      }

      id = R.id.transactionInforAccountContent;
      TextView transactionInforAccountContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforAccountContent == null) {
        break missingId;
      }

      id = R.id.transactionInforAccountTitle;
      TextView transactionInforAccountTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforAccountTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforAmountContent;
      TextView transactionInforAmountContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforAmountContent == null) {
        break missingId;
      }

      id = R.id.transactionInforAmountTitle;
      TextView transactionInforAmountTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforAmountTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforAvatar;
      ImageView transactionInforAvatar = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforAvatar == null) {
        break missingId;
      }

      id = R.id.transactionInforButtonEdit;
      AppCompatButton transactionInforButtonEdit = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforButtonEdit == null) {
        break missingId;
      }

      id = R.id.transactionInforButtonGoBack;
      ImageButton transactionInforButtonGoBack = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforButtonGoBack == null) {
        break missingId;
      }

      id = R.id.transactionInforCategoryContent;
      TextView transactionInforCategoryContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforCategoryContent == null) {
        break missingId;
      }

      id = R.id.transactionInforCategoryTitle;
      TextView transactionInforCategoryTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforCategoryTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforContent;
      ScrollView transactionInforContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforContent == null) {
        break missingId;
      }

      id = R.id.transactionInforDateContent;
      TextView transactionInforDateContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforDateContent == null) {
        break missingId;
      }

      id = R.id.transactionInforDateTitle;
      TextView transactionInforDateTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforDateTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforDescription;
      TextView transactionInforDescription = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforDescription == null) {
        break missingId;
      }

      id = R.id.transactionInforDescriptionContent;
      TextView transactionInforDescriptionContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforDescriptionContent == null) {
        break missingId;
      }

      id = R.id.transactionInforNameContent;
      TextView transactionInforNameContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforNameContent == null) {
        break missingId;
      }

      id = R.id.transactionInforNameTitle;
      TextView transactionInforNameTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforNameTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforReferenceContent;
      TextView transactionInforReferenceContent = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforReferenceContent == null) {
        break missingId;
      }

      id = R.id.transactionInforReferenceTitle;
      TextView transactionInforReferenceTitle = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforReferenceTitle == null) {
        break missingId;
      }

      id = R.id.transactionInforTitleAndButtonBack;
      LinearLayout transactionInforTitleAndButtonBack = ViewBindings.findChildViewById(rootView, id);
      if (transactionInforTitleAndButtonBack == null) {
        break missingId;
      }

      return new ActivityTransactionInformationBinding((RelativeLayout) rootView, layoutAccountName,
          layoutAmount, layoutCategoryName, layoutDate, layoutName, layoutReference,
          transactionInforAccountContent, transactionInforAccountTitle,
          transactionInforAmountContent, transactionInforAmountTitle, transactionInforAvatar,
          transactionInforButtonEdit, transactionInforButtonGoBack, transactionInforCategoryContent,
          transactionInforCategoryTitle, transactionInforContent, transactionInforDateContent,
          transactionInforDateTitle, transactionInforDescription,
          transactionInforDescriptionContent, transactionInforNameContent,
          transactionInforNameTitle, transactionInforReferenceContent,
          transactionInforReferenceTitle, transactionInforTitleAndButtonBack);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
