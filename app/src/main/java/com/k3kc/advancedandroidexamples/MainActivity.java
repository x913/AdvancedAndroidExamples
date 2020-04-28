package com.k3kc.advancedandroidexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWriteParcel = findViewById(R.id.btn_parcel);
        btnWriteParcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person("John", "Doe", 29,  45000f);
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(Person.class.getCanonicalName(), person);
                startActivity(intent);
            }
        });

        final Button btnRotate = findViewById(R.id.btn_rotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RotateActivity.class));
            }
        });

    }

    private void readParcel() {

    }

    private void writeParcel() {

    }

}
