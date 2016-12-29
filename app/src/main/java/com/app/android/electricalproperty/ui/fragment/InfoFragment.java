package com.app.android.electricalproperty.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.app.android.electricalproperty.R;
import com.app.android.electricalproperty.utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class InfoFragment extends Fragment implements OnBannerClickListener {
    @BindView(R.id.toolBar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_center_tv)
    TextView title;
    @BindView(R.id.banner)
    Banner banner;
    String[] image = {"http://img.51ztzj.com/upload/image/20140401/sj2014040305_279x419.jpg", "http://img.51ztzj.com/upload/image/20140916/sj201409161014_279x419.jpg"
            , "http://img.51ztzj.com/upload/image/20141111/sj201411101025_279x419.jpg", "http://img.51ztzj.com/upload/image/20141225/sj201412251021_279x419.jpg", "http://img2.imgtn.bdimg.com/it/u=1922929249,102637201&fm=23&gp=0.jpg"};
    List<String> Img = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, view);
        init();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        banner.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        banner.stopAutoPlay();
    }

    private void init() {
        toolbar.setTitle("");
        title.setText("信息发布");
        for (int i = 0; i < image.length; i++) {
            Img.add(image[i]);
        }
        setBanner();
    }

    private void setBanner() {
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(Img);
        banner.setBannerAnimation(Transformer.DepthPage);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setOnBannerClickListener(this);
    }

    //下标从1开始
    @Override
    public void OnBannerClick(int position) {
        Toast.makeText(getActivity(), "你点击了第" + position + "张图", Toast.LENGTH_SHORT).show();
    }
}
