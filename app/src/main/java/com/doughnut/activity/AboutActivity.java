package com.doughnut.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.doughnut.R;
import com.doughnut.config.AppConfig;
import com.doughnut.config.Constant;
import com.doughnut.dialog.MsgDialog;
import com.doughnut.update.UpdateTask;
import com.doughnut.utils.DeviceUtil;
import com.doughnut.utils.ToastUtil;
import com.doughnut.view.TitleBar;
import com.scwang.smartrefresh.layout.internal.ProgressDrawable;

public class AboutActivity extends BaseActivity implements View.OnClickListener, TitleBar.TitleBarClickListener {

    private TitleBar mTitleBar;
    private TextView mTvVersion;
    private ImageView mImgLoad;
    private RelativeLayout mLayoutCheckUpdate;
    private ProgressDrawable mProgressDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mTitleBar = (TitleBar) findViewById(R.id.title_bar);
        mTitleBar.setLeftDrawable(R.drawable.ic_back);
        mTitleBar.setTitle(getString(R.string.titleBar_about));
        mTitleBar.setRightTextColor(R.color.white);
        mTitleBar.setTitleBarClickListener(this);

        mTvVersion = (TextView) findViewById(R.id.tv_version);
        mTvVersion.setText(getString(R.string.content_version) + DeviceUtil.getVersionName());

        mLayoutCheckUpdate = (RelativeLayout) findViewById(R.id.layout_check_update);
        mLayoutCheckUpdate.setOnClickListener(this);
        mImgLoad = findViewById(R.id.img_loading);
        mProgressDrawable = new ProgressDrawable();
        mProgressDrawable.setColor(0xff666666);
        mImgLoad.setImageDrawable(mProgressDrawable);
        mImgLoad.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {
        if (view == mLayoutCheckUpdate) {
            mProgressDrawable.start();
            mImgLoad.setVisibility(View.VISIBLE);
            new UpdateTask().execute(this);
            AppConfig.postDelayOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mProgressDrawable.stop();
                    mImgLoad.setVisibility(View.GONE);
                }
            }, 30000);
        }
    }

    @Override
    public void onLeftClick(View view) {
        this.finish();
    }

    @Override
    public void onRightClick(View view) {

    }

    @Override
    public void onMiddleClick(View view) {

    }

    public static void startAboutActivity(Context from) {
        Intent intent = new Intent(from, AboutActivity.class);
        intent.addFlags(from instanceof BaseActivity ? 0 : Intent.FLAG_ACTIVITY_NEW_TASK);
        from.startActivity(intent);
    }
}
