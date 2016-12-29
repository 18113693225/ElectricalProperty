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
import butterknife.OnClick;


public class MyselfFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myself, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.work_manager_rl, R.id.inspection_service_rl, R.id.work_log_rl, R.id.work_plan_rl, R.id.contact_rl
            , R.id.recommend_rl, R.id.update_rl, R.id.modify_rl, R.id.psw_set_rl, R.id.project_choice_rl})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.work_manager_rl:
                break;
            case R.id.inspection_service_rl:
                break;
            case R.id.work_log_rl:
                break;
            case R.id.work_plan_rl:
                break;
            case R.id.contact_rl:
                break;
            case R.id.recommend_rl:
                break;
            case R.id.update_rl:
                break;
            case R.id.modify_rl:
                break;
            case R.id.psw_set_rl:
                break;
            case R.id.project_choice_rl:
                break;
            default:
                break;
        }
    }

}
