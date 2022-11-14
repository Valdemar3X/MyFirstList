package com.example.myfirstlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_pl_names);
        list1 = findViewById(R.id.tv_pl_names);
       String[] names = {"січень","лютий","березень","квітень","травень","черевень","липень","серпень","вересень","жовтень","листопад","грудень"};
       list1.setText("");
       for (int i=0;i<names.length; i++){
           list1.append(names[i] + "\n");
       }
//        for (String name:names) {
//            list1.append(name + "\n");
//
//        }
        }

    }
