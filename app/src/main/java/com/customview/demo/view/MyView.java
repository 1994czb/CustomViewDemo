package com.customview.demo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.customview.demo.R;

/**
 * Created by Administrator on 2017/8/30.
 */

public class MyView extends View {

    private String text;
    private int textColor;
    private float textSize;

    public MyView(Context context) {
        super(context);
        initAttrs(null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
    }
    private void initAttrs(@Nullable AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyView);
        text = typedArray.getString(R.styleable.MyView_text);
        textColor = typedArray.getColor(R.styleable.MyView_textColor, 0x00ff00);
        textSize = typedArray.getDimension(R.styleable.MyView_textSize, 16);

    }

    //画笔
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        canvas.drawText(text,10,100,paint);
    }
}
