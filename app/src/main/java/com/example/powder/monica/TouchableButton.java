package com.example.powder.monica;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class TouchableButton extends AppCompatButton {

    public TouchableButton(Context context) {
        super(context);
    }

    public TouchableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchableButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick() {
       return true;
    }


}
