package com.fivenglish.jurassic.ui.entry;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;


import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.util.LogUtils;
import com.fivenglish.jurassic.util.Utils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class LoginActivity extends EntryBaseActivity {

    @InjectView(R.id.activity_login_et_username)
    public EditText userNameView;

//    @InjectView(R.id.activity_login_et_password)
//    public EditText passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_login_activity);
        ButterKnife.inject(this);

        userNameView.setFocusable(false);
    }

    @OnClick(R.id.activity_login_et_username)
    public void onSelectUserClick(View v) {
        selectUser();
    }

    @OnClick(R.id.activity_login_btn_login)
    public void onLoginClick(View v) {
        login();
    }

//    @OnClick(R.id.activity_login_btn_register)
//    public void onRegisterClick(View v) {
//        Intent intent = new Intent(ctx, EntryRegisterActivity.class);
//        ctx.startActivity(intent);
//    }
//
    private void selectUser() {
        LogUtils.d("selectUser");
    }

    private void login() {
        final String name = userNameView.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            Utils.toast(R.string.username_cannot_null);
            return;
        }

        final ProgressDialog dialog = showSpinnerDialog();
//        AVUser.logInInBackground(name, password, new LogInCallback<AVUser>() {
//            @Override
//            public void done(AVUser avUser, AVException e) {
//                dialog.dismiss();
//                if (filterException(e)) {
//                    UserService.updateUserLocation();
//                    MainActivity.goMainActivityFromActivity(LoginActivity.this);
//                }
//            }
//        });
    }
}
