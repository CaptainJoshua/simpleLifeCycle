package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override // 1
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_SHORT).show();
    }

    @Override // 2
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Started", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }

    @Override // 3
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Restarted", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }

    @Override // 4
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resumed", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }

    @Override // 5
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }

    @Override // 6
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Stopped", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }

    @Override // 7
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Destroyed", Toast.LENGTH_SHORT).show();
        // Toast statement here
    }
}