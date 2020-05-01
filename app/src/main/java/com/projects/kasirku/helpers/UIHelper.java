package com.projects.kasirku.helpers;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.projects.kasirku.R;

public class UIHelper {

    private Context context;

    private UIHelper(){}

    public static UIHelper newInstance(Context context){
        UIHelper uiHelper = new UIHelper();
        uiHelper.setContext(context);
        return uiHelper;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public Integer calculateColumnNumber(){
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float screenWidthDp = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (screenWidthDp / 100); // tampilan beranda
        return noOfColumns;
    }
}
