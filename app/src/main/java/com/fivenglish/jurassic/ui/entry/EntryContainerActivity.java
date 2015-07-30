package com.fivenglish.jurassic.ui.entry;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by lidahe on 15/7/30.
 */
public class EntryContainerActivity extends BaseActivity {

    @InjectView(R.id.fragment_container)
    public FrameLayout frameLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_container_activity);
        ButterKnife.inject(this);


        LoginFragment loginFragment= new LoginFragment();
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, loginFragment).commit();
    }
}
