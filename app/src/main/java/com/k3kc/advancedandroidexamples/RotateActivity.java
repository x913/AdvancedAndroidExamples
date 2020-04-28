package com.k3kc.advancedandroidexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RotateActivity extends AppCompatActivity {


    int cnt = 0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AAA", "onCreate");
        setContentView(R.layout.activity_rotate);
        tv = findViewById(R.id.tvCount);

        if(savedInstanceState != null) {
            cnt = savedInstanceState.getInt("count");
            Log.d("AAA", "cnt was restored to " + cnt);
        }

        Button btn = findViewById(R.id.btn_add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt++;
                tv.setText("CNT " + cnt);
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("AAA", "onRestoreInstanceState");
        cnt = savedInstanceState.getInt("count");
        tv.setText("CNT " + cnt);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("AAA", "onSaveInstanceState");
        outState.putInt("count", cnt);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStop();
        Log.d("AAA", "onStart");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAA", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume");
    }
}
