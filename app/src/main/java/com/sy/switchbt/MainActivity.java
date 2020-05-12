package com.sy.switchbt;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

import com.sy.swbt.SwitchButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private static final String TAG = "MainActivity11";
    private SwitchButton sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb = findViewById(R.id.sb);
        sb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.i(TAG, "onCheckedChanged: buttonView.isPressed()" + buttonView.isPressed());
    }

    public void click(View view) {
        sb.setChecked(!sb.isChecked());
    }
}
