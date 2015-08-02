package com.fivenglish.jurassic.ui.base;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.view.HeaderLayout;

public class BaseFragment extends Fragment {
    protected Context ctx;
    protected HeaderLayout headerLayout;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ctx = getActivity();
        headerLayout = (HeaderLayout) getView().findViewById(R.id.headerLayout);
    }

    protected void toast(String str) {
        Toast.makeText(this.getActivity(), str, Toast.LENGTH_SHORT).show();
    }

    protected void toast(int id) {
        Toast.makeText(this.getActivity(), id, Toast.LENGTH_SHORT).show();
    }

    protected boolean filterException(Exception e) {
        if (e != null) {
            toast(e.getMessage());
            return false;
        } else {
            return true;
        }
    }

    protected ProgressDialog showSpinnerDialog() {
        //activity = modifyDialogContext(activity);
        ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(true);
        dialog.setMessage(getString(R.string.utils_hardLoading));
        if (!getActivity().isFinishing()) {
            dialog.show();
        }
        return dialog;
    }
}
