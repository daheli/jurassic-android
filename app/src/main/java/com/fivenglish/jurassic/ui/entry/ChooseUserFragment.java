package com.fivenglish.jurassic.ui.entry;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fivenglish.jurassic.R;

/**
 * Created by lidahe on 15/7/29.
 */
public class ChooseUserFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getActivity().getActionBar().setTitle("test title");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
