package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Buttons.myListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClicked(int value) {
        Counter c = new Counter();
        c.action(value);
        if(value==0)
        {
            makeToast("Reseted...!");
        }else {
            makeToast("Added");
        }
    }
    public void makeToast(String s)
    {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

}