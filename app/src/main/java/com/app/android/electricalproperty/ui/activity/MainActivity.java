package com.app.android.electricalproperty.ui.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;

import com.app.android.electricalproperty.R;
import com.app.android.electricalproperty.ui.adapter.FragmentAdapter;
import com.aspsine.fragmentnavigator.FragmentNavigator;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {
    private static final int INDEX_HOME = 0;
    private static final int INDEX_INFO = 1;
    private static final int INDEX_MYSELF = 2;
    private static final int DEFAULT_POSITION = 0;
    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;
    private FragmentNavigator mNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setFragmentNavigator();
        setBottomBar();
    }


    private void setBottomBar() {
        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.tab_home:
                        mNavigator.showFragment(INDEX_HOME);
                        break;
                    case R.id.tab_info:
                        mNavigator.showFragment(INDEX_INFO);
                        break;
                    case R.id.tab_myself:
                        mNavigator.showFragment(INDEX_MYSELF);
                        break;
                    default:
                        break;
                }
            }

        });

    }


    private void setFragmentNavigator() {
        mNavigator =
                new FragmentNavigator(getSupportFragmentManager(), new FragmentAdapter(), R.id.container);
        // set default tab position
        mNavigator.setDefaultPosition(DEFAULT_POSITION);
    }


}
