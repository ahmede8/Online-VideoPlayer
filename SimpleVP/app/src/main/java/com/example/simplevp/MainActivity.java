package com.example.simplevp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;


import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fab;
    String[] urls;
    String[] dD;
    String[] tT;
    MaterialButton[] btns= new MaterialButton[4];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab= findViewById(R.id.fabbutton);

        btns[0]=findViewById(R.id.btn1);
        btns[1]=findViewById(R.id.btn2);
        btns[2]=findViewById(R.id.btn3);
        btns[3]=findViewById(R.id.btn4);
        urls=getResources().getStringArray(R.array.url_x);
        dD=getResources().getStringArray(R.array.durations);
        tT=getResources().getStringArray(R.array.Title);
        btns[0].setOnClickListener(this);
        btns[1].setOnClickListener(this);
        btns[2].setOnClickListener(this);
        btns[3].setOnClickListener(this);
        fab.setOnClickListener(this);

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openFAB();
//            }

//        });

    }

    public void openFAB()
    {
//        Intent intent = new Intent(this, FAB.class);
        Intent intent = new Intent(this, FAB.class);
        startActivity(intent);
    }

    public void openList()
    {
//        Intent intent = new Intent(this, FAB.class);
        Intent intent = new Intent(this,lisit.class);
//        intent.putExtra("G",v.getId());
//        intent.putExtra("U",pushurl(v));
//        intent.putExtra("D",pushduration(v));
        startActivity(intent);
    }

    private String[] pushduration(View v)
    {
        String[]mini= new String[3];
        switch (v.getId())
        {
            case R.id.btn1:
            {
                mini[0]=dD[0];

                mini[1]=dD[1];
                mini[2]=dD[2];
                mini[3]=dD[3];
                return mini;
            }
            case R.id.btn2:
            {
                mini[0]=dD[4];
                mini[1]=dD[5];
                mini[2]=dD[6];
                mini[3]=dD[7];
                return mini;
            }
            case R.id.btn3:
            {
                mini[0]=dD[8];
                mini[1]=dD[9];
                mini[2]=dD[10];
                mini[3]=dD[11];
                return mini;
            }
            case R.id.btn4:
            {
                mini[0]=dD[0];
                mini[1]=dD[4];
                mini[2]=dD[8];
                mini[3]=dD[10];
                return mini;
            }
        }
        return null;
    }
    private String[] pushurl(View v)
    {
        String[]mini= new String[3];
        switch (v.getId())
        {
            case R.id.btn1:
                        {
                            mini[0]=urls[0];
                            mini[1]=urls[1];
                            mini[2]=urls[2];
                            mini[3]=urls[3];
                            return mini;
                        }
            case R.id.btn2:
            {
                mini[0]=urls[4];
                mini[1]=urls[5];
                mini[2]=urls[6];
                mini[3]=urls[7];
                return mini;
            }
            case R.id.btn3:
            {
                mini[0]=urls[8];
                mini[1]=urls[9];
                mini[2]=urls[10];
                mini[3]=urls[11];
                return mini;
            }
            case R.id.btn4:
            {
                mini[0]=urls[0];
                mini[1]=urls[4];
                mini[2]=urls[8];
                mini[3]=urls[10];
                return mini;
            }
        }
        return null;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                openList();
                break;
            case R.id.btn2:
                openList();
                break;
            case R.id.btn3:
                openList();
                break;
            case R.id.btn4:
                openList();;
                break;
            case R.id.fabbutton:
                openFAB();
                break;
        }
    }



}