package com.holmeslei.movienews.ui.activity;

import android.annotation.SuppressLint;

import com.holmeslei.movienews.base.BaseActivity;
import com.holmeslei.movienews.mvp.presenter.GeneralFragPresenter;

/**
 * Created by ${张奎勋} on 2018/5/30.
 */
@SuppressLint("Registered")
public class test extends BaseActivity {
    private GeneralFragPresenter generalFragPresenter;

    @Override
    public void showToast(String toastMessage) {

    }

    @Override
    protected GeneralFragPresenter initPresenter() {
        generalFragPresenter = new GeneralFragPresenter();
        return generalFragPresenter;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initStateAndData() {

    }

    @Override
    protected void initListener() {

    }
}
