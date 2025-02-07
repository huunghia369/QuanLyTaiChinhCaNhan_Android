package com.example.prudentialfinance.Activities.Auth;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prudentialfinance.Helpers.Alert;
import com.example.prudentialfinance.Helpers.LoadingDialog;
import com.example.prudentialfinance.HomeActivity;
import com.example.prudentialfinance.Model.Category;
import com.example.prudentialfinance.Model.GlobalVariable;
import com.example.prudentialfinance.R;
import com.example.prudentialfinance.ViewModel.Auth.LoginViewModel;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.shashank.sony.fancytoastlib.FancyToast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {
    // Không chọn được tài khoản
    private AppCompatButton buttonSignIn;
    private EditText username, password;
    private LoginViewModel viewModel;
    private TextView loginTextViewCreateAccount, txt_forgotpassword;
    GlobalVariable state;

    LoadingDialog loadingDialog;
    Alert alert;

    GoogleSignInOptions gso;
    GoogleSignInClient mGoogleSignInClient;

    ImageButton loginSignInWithGoogle, loginSignInWithFacebook;

    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setControl();
        setComponent();
        setEvent();

    }

    private void setComponent() {
        loadingDialog = new LoadingDialog(this);
        alert = new Alert(this, 1);
        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.server_client_id))
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        callbackManager = CallbackManager.Factory.create();


    }

    private void setControl() {
        buttonSignIn = findViewById(R.id.loginButtonSignIn);
        loginSignInWithGoogle = findViewById(R.id.loginSignInWithGoogle);
        loginSignInWithFacebook = findViewById(R.id.loginSignInWithFacebook);
        loginTextViewCreateAccount = findViewById(R.id.loginTextViewCreateAccount);
        username = findViewById(R.id.loginTextViewUsername);
        password = findViewById(R.id.loginTextViewPassword);
        txt_forgotpassword = findViewById(R.id.txt_forgotpassword);
    }

    /**
     * Hàm này thiết lập Access token sau khi đăng nhập thành công. Sau đó,
     * token này có thể được sử dụng trong header. Để lấy Header, chúng ta gọi (Model/Global Variable) getHeader"
     */
    private void setAuthorizedToken(String accessToken) {
        state = ((GlobalVariable) this.getApplication());
        state.setAccessToken(accessToken.trim());

        SharedPreferences preferences = this.getApplication().getSharedPreferences(state.getAppName(), LoginActivity.MODE_PRIVATE);

        preferences.edit().putString("accessToken", accessToken.trim()).apply();
    }

    private void setEvent() {
        final LoadingDialog loadingDialog = new LoadingDialog(LoginActivity.this);
        Alert alert = new Alert(LoginActivity.this);
        alert.normal();

        alert.btnOK.setOnClickListener(view -> {
            alert.dismiss();
        });

        txt_forgotpassword.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, RecoveryActivity.class);
            startActivity(intent);
        });

        viewModel.isLoading().observe(this, isLoading -> {
            if (isLoading) {
                loadingDialog.startLoadingDialog();
            } else {
                loadingDialog.dismissDialog();
            }
        });

        viewModel.getObject().observe(this, object -> {
            if (object == null) {
                alert.showAlert(getString(R.string.alertTitle), getString(R.string.alertDefault), R.drawable.ic_close);
                return;
            }

            if (object.getResult() == 1) {
                setAuthorizedToken(object.getAccessToken());
                state.setAuthUser(object.getData());
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

                FancyToast.makeText(this, object.getMsg(), FancyToast.LENGTH_SHORT, FancyToast.SUCCESS,
                        R.drawable.ic_check, true).show();
                finish();
            } else {
                setAuthorizedToken("");
                state.setAuthUser(null);
                alert.showAlert(getString(R.string.alertTitle), object.getMsg(), R.drawable.ic_close);
            }
        });

        buttonSignIn.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();
            viewModel.login(user, pass);



        });

        // Sự kiện khi nhấn vào "Tạo tài khoản"
        loginTextViewCreateAccount.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        // Sự kiện khi nhấn vào "Đăng nhập bằng Google"
        loginSignInWithGoogle.setOnClickListener(view -> {
            Intent intent = mGoogleSignInClient.getSignInIntent();
            loginWithGoogle.launch(intent);
        });

//         Sự kiện khi nhấn vào "Đăng nhập bằng Facebook"
//        loginSignInWithFacebook.setOnClickListener(view -> {
//            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("id", "name"));
//        });


        // Callback khi đăng nhập bằng Facebook thành công hoặc thất bại
        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onError(@NonNull FacebookException e) {
                        // Xử lý khi có lỗi xảy ra
                        Toast.makeText(LoginActivity.this, "Lỗi khi đăng nhập bằng Facebook: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onCancel() {
                        // Xử lý khi người dùng huỷ đăng nhập
                        Toast.makeText(LoginActivity.this, "Đăng nhập bằng Facebook đã bị huỷ bỏ", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // Xử lý khi đăng nhập thành công
                        AccessToken accessToken = loginResult.getAccessToken();
                        String token = accessToken.getToken();
                        // Gọi phương thức setAuthorizedToken để thiết lập access token
                        setAuthorizedToken(token);
                        // Hiển thị thông báo "Thành công"
                        Toast.makeText(LoginActivity.this, "Đăng nhập bằng Facebook thành công", Toast.LENGTH_SHORT).show();
                    }
                });

    }

    ActivityResultLauncher<Intent> loginWithGoogle = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Intent data = result.getData();
                    assert data != null;

                    Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                    handleSignInResult(task);

                } else {
                    Toast.makeText(this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            });

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            String idToken = account.getIdToken();

            Log.d("token", idToken);
            Log.d("email", idToken);
            // Lấy địa chỉ email từ tài khoản Google đã đăng nhập
            String email = account.getEmail();

            viewModel.loginGoogle(idToken);
        } catch (ApiException e) {
            // Hiển thị lỗi khi đăng nhập bằng Google không thành công
            alert.showAlert(getString(R.string.alertTitle), "signInResult:failed code=" + e.toString(),
                    R.drawable.ic_close);
        }
    }
}
