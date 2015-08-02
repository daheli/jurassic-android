package com.fivenglish.jurassic.ui.entry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseFragment;

/**
 * Created by lidahe on 15/7/29.
 */
public class ChooseUserFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        headerLayout.showTitle("用户列表");
    }

}
