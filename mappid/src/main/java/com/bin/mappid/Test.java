package com.bin.mappid;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.hbb.toolslib.AppUtils;

/**
 * @author: HBB
 * @Time: 2020-02-03
 * @Description:
 */
public class Test {
    public static void LogAppId() {
        Log.e("-------", AppUtils.getInstance().getAppName());

        ApplicationInfo appInfo = null;
        try {
            appInfo = AppUtils.getInstance().getApplicationConntext().getPackageManager().getApplicationInfo(AppUtils.getInstance().getApplicationConntext().getPackageName(), PackageManager.GET_META_DATA);
            if (appInfo != null) {
                String value = appInfo.metaData.getString("permissionKey");
                //TODO
                Log.e("data", value);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
