package com.fivenglish.jurassic.ui.entry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseFragment;
import com.fivenglish.jurassic.util.LogUtils;

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
        super.onActivityCreated(savedInstanceState);
        headerLayout.showTitle("请选择用户");
        headerLayout.showLeftBackButton(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LogUtils.d("selectUser click");
//                        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
                    }
                }
        );
    }

}
