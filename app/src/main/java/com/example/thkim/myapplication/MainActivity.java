package com.example.thkim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View v){
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
//        startActivity(intent);
    }
}
