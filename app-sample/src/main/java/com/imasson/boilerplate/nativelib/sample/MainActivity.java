package com.imasson.boilerplate.nativelib.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.imasson.boilerplate.nativelib.NativeFacade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method from native library wrapper.
        String text = NativeFacade.getStringFromJNI();

        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(text);
    }
}
