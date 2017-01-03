package com.app.android.electricalproperty;


import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;

import com.app.android.electricalproperty.ui.activity.WebViewActivity;

public final class Navigator {

    /**
     * 跳转webView
     */
    public static void startWebViewActivity(Activity activity) {
        Intent intent = new Intent(activity, WebViewActivity.class);
        ActivityCompat.startActivity(activity, intent, null);
    }

}
