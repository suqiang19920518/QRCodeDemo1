package com.thinkive.bank.qrcodedemo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.vondear.rxtools.RxActivityUtils;
import com.vondear.rxtools.activity.ActivityCodeTool;

/**
 * @author: sq
 * @date: 2017/8/22
 * @corporation: 深圳市思迪信息技术股份有限公司
 * @description: 主界面
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnScanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initView() {
        mBtnScanner = ((Button) findViewById(R.id.btn_scanner));
    }

    private void initEvent() {
        mBtnScanner.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_scanner :
                RxActivityUtils.skipActivity(this, ActivityCodeTool.class);
                break;
        }
    }

}
