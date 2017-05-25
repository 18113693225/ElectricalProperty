package com.app.android.electricalproperty.ui.adapter;


import android.support.v4.app.Fragment;

import com.app.android.electricalproperty.ui.fragment.HomeFragment;
import com.app.android.electricalproperty.ui.fragment.InfoFragment;
import com.app.android.electricalproperty.ui.fragment.MyselfFragment;
import com.aspsine.fragmentnavigator.FragmentNavigatorAdapter;

import java.util.ArrayList;

public class FragmentAdapter implements FragmentNavigatorAdapter {
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    public FragmentAdapter() {
        mFragments.clear();
        mFragments.add(new HomeFragment());
        mFragments.add(new InfoFragment());
        mFragments.add(new MyselfFragment());
    }

    @Override
    public Fragment onCreateFragment(int position) {
        return mFragments.get(position);
    }

    @Override
    public String getTag(int position) {
        return mFragments.get(position).getClass().getSimpleName();
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
