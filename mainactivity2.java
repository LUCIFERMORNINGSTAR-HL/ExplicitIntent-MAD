package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void homeScreen(View view) {
        // Create an explicit intent to start the sActivity class.
        // The first parameter is the current context (MainActivity.this).
        // The second parameter is the destination Activity class (sActivity.class).
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        // Start the new activity.
        startActivity(intent);
    }
}
