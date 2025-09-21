package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the button in activity_main.xml is clicked.
     * It is linked by the android:onClick="newsScreen" attribute in the XML.
     * 
     * @param view The View (Button) that was clicked.
     */
    public void newsScreen(View view) {
        // Create an explicit intent to start the sActivity class.
        // The first parameter is the current context (MainActivity.this).
        // The second parameter is the destination Activity class (sActivity.class).
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

        // Start the new activity.
        startActivity(intent);
    }
}