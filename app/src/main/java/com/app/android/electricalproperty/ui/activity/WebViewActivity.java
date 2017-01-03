package com.app.android.electricalproperty.ui.activity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.app.android.electricalproperty.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WebViewActivity extends BaseActivity {

    @BindView(R.id.prgBar)
    ProgressBar mPrgBar;
    @BindView(R.id.web)
    WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);
        setUpToolbar();
        initView();
    }

    private void setUpToolbar() {
        setTitle("业务介绍");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (mWebView.canGoBack()) {
                mWebView.goBack();
            } else {
                finish();
            }
        }
        return true;
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initView() {
        WebSettings mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setDefaultTextEncodingName("UTF-8");
        mWebSettings.setBuiltInZoomControls(false);
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (mPrgBar != null) {
                    if (newProgress == 100) {
                        mPrgBar.setVisibility(View.GONE);
                        mPrgBar.setProgress(0);
                    } else {
                        if (View.GONE == mPrgBar.getVisibility()) {
                            mPrgBar.setVisibility(View.VISIBLE);
                        }
                        mPrgBar.setProgress(newProgress);
                    }
                }
            }
        });
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mWebView.loadUrl("https://www.baidu.com/");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mWebView != null) {
            mWebView.removeAllViews();
            mWebView.destroy();
        }
    }
}
