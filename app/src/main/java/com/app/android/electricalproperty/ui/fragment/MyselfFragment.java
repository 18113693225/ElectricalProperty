package com.app.android.electricalproperty.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.android.electricalproperty.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MyselfFragment extends Fragment {
    @BindView(R.id.toolBar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_center_tv)
    TextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myself, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init() {
        toolbar.setTitle("");
        title.setText("我");
    }
}
