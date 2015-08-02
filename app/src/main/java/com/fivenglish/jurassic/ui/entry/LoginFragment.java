package com.fivenglish.jurassic.ui.entry;

import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseFragment;
import com.fivenglish.jurassic.util.LogUtils;
import com.fivenglish.jurassic.util.Utils;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class LoginFragment extends BaseFragment {

    @InjectView(R.id.activity_login_et_username)
    public EditText userNameView;

//    @InjectView(R.id.activity_login_et_password)
//    public EditText passwordView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.entry_login_fragment, container, false);
        ButterKnife.inject(this, view);
        userNameView.setFocusable(false);
        return view;
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
        ChooseUserFragment fragment = new ChooseUserFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
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
//                    MainActivity.goMainActivityFromActivity(LoginFragment.this);
//                }
//            }
//        });
    }
}
