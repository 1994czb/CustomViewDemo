package com.customview.demo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.customview.demo.R;

/**
 * Created by Administrator on 2017/9/1.
 */

public class MyCustomView extends LinearLayout implements View.OnClickListener {

    private TextView title;
    private ImageView icon;

    public MyCustomView(Context context) {
        super(context);

    }



    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.custom_view, this);
        title = (TextView) findViewById(R.id.title);
        icon = (ImageView) findViewById(R.id.icon);
        icon.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.equals(icon)) {
            Toast.makeText(getContext(), "我在自定义view中被点击了", Toast.LENGTH_SHORT).show();
        }
    }
}

