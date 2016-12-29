package com.app.android.electricalproperty;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.android.electricalproperty.ui.adapter.FragmentAdapter;
import com.aspsine.fragmentnavigator.FragmentNavigator;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;


public class MainActivity extends AppCompatActivity {
    private static final int INDEX_HOME = 0;
    private static final int INDEX_IM = 1;
    private static final int INDEX_INFO = 2;
    private static final int INDEX_MYSELF = 3;
    private static final int DEFAULT_POSITION = 0;
    private BottomBar mBottomBar;
    private FragmentNavigator mNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFragmentNavigator();
        setBottomBar(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        mBottomBar.onSaveInstanceState(outState);
    }

    private void setBottomBar(Bundle savedInstanceState) {
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setBackgroundColor(getResources().getColor(R.color.white));
        mBottomBar.useFixedMode();
        mBottomBar.setItemsFromMenu(R.menu.menu_bottombar, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch (menuItemId) {
                    case R.id.menu_home:
                        mNavigator.showFragment(INDEX_HOME);
                        mBottomBar.selectTabAtPosition(INDEX_HOME, true);
                        break;
                    case R.id.menu_im:
                        mNavigator.showFragment(INDEX_IM);
                        mBottomBar.selectTabAtPosition(INDEX_IM, true);
                        break;
                    case R.id.menu_info:
                        mNavigator.showFragment(INDEX_INFO);
                        mBottomBar.selectTabAtPosition(INDEX_INFO, true);
                        break;
                    case R.id.menu_myself:
                        mNavigator.showFragment(INDEX_MYSELF);
                        mBottomBar.selectTabAtPosition(INDEX_MYSELF, true);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                //do nothing
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
