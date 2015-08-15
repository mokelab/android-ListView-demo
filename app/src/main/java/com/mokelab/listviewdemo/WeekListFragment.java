package com.mokelab.listviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Fragment for week list
 */
public class WeekListFragment extends Fragment {
    private ListView mListView;

    public static WeekListFragment newInstance() {
        WeekListFragment fragment = new WeekListFragment();

        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_1, container, false);

        mListView = (ListView) root.findViewById(android.R.id.list);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1);
        adapter.add("日曜日");
        adapter.add("月曜日");
        adapter.add("火曜日");
        adapter.add("水曜日");
        adapter.add("木曜日");
        adapter.add("金曜日");
        adapter.add("土曜日");
        mListView.setAdapter(adapter);

    }
}
