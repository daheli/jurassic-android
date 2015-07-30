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

    @InjectView(R.id.activity_login_et_username)
    public FrameLayout frameLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_container_activity);
        ButterKnife.inject(this);


//        HeadlinesFragment firstFragment = new HeadlinesFragment();
//        getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment1).commit();
    }
}
