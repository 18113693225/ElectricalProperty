package com.app.android.electricalproperty.utils.tool;


import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;

public class SampleMaterialDialog {
    private static SampleMaterialDialog sampleMaterialDialog;
    private MaterialDialog dialog;

    public static SampleMaterialDialog getInstance() {
        if (null == sampleMaterialDialog) {
            sampleMaterialDialog = new SampleMaterialDialog();
        }
        return sampleMaterialDialog;
    }

    public void showDialog(Context context, String title, String content) {
        if (null == dialog) {
            dialog = new MaterialDialog.Builder(context)
                    .title(title)
                    .content(content)
                    .progress(true, 0)
                    .canceledOnTouchOutside(false)
                    .show();
        } else {
            dialog.show();
        }
    }

    public void dismissDialog() {
        if (null != dialog) {
            dialog.dismiss();
            dialog = null;
        }
    }
}
