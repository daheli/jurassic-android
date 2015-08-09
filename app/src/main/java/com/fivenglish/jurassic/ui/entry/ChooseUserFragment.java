package com.fivenglish.jurassic.ui.entry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.fivenglish.jurassic.R;
import com.fivenglish.jurassic.ui.base.BaseFragment;
import com.fivenglish.jurassic.util.LogUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by lidahe on 15/7/29.
 */
public class ChooseUserFragment extends BaseFragment {
    List<HashMap<String, String>> mylist;
    @InjectView(R.id.list_choose_user)
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.entry_choose_user_list_fragment, container, false);
        ButterKnife.inject(this, view);
        mylist = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < 30; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("ItemTitle", "This is Title.....");
            map.put("ItemText", "This is text.....");
            mylist.add(map);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initHeader();
        initListView();
    }

    private void initHeader() {
        headerLayout.showTitle("请选择用户");
        headerLayout.showLeftBackButton(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LogUtils.d("selectUser click");
                        getActivity().getFragmentManager().popBackStack();
//                        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
                    }
                }
        );
    }

    private void initListView() {
        SimpleAdapter mSchedule = new SimpleAdapter(getActivity(),
                mylist,
                R.layout.entry_choose_user_item,
                new String[]{"ItemTitle", "ItemText"},
                new int[]{R.id.itemTitle, R.id.itemText});
        //添加并且显示
        list.setAdapter(mSchedule);
    }
}
