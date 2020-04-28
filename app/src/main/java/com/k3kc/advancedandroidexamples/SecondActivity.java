package com.k3kc.advancedandroidexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Person person = getIntent().getParcelableExtra(Person.class.getCanonicalName());

        Log.d("AAA", person.FirstName + " " + person.LastName + " " + person.Age + " " + person.Salary);

    }
}
