package com.example.cuongphan.widgetbutton_radiobuttonandclickedbutton;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
    }

    protected void changeColor(int color){
        TextView textView = (TextView)findViewById(R.id.textview);
        textView.setBackgroundColor(color);
    }

    protected void changeTextViewColor(View clickedButton){
        RadioGroup radiogroup = (RadioGroup)findViewById(R.id.radiogroup);
        int checked = radiogroup.getCheckedRadioButtonId();
        if(checked != -1) {
            switch (checked) {
                case R.id.rbred:
                    changeColor(Color.RED);
                    break;
                case R.id.rbgreen:
                    changeColor(Color.GREEN);
                    break;
                case R.id.rbyellow:
                    changeColor(Color.YELLOW);
                    break;
                default:
                    break;
            }
        }
    }
}
