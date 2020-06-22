package com.dennis.androicrudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ListIterator;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    String content;
    ListIterator<String> litr = null;
    TextView texts = (TextView) findViewById(R.id.textView3);


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> names = new ArrayList<String>();
        names.add("Shyam");
        names.add("Rajat");
        names.add("Paul");
        names.add("Tom");
        names.add("Kate");
        //Obtaining list iterator
        litr = names.listIterator();


    }

    public void onChange(View view) {
        EditText uTxt = (EditText) findViewById(R.id.txt);
        TextView disp = (TextView) findViewById(R.id.display);

        disp.setVisibility(View.VISIBLE);
    }

    public void nextVal(View view) {
        if (litr.hasNext())
            content=litr.next().toString();
        texts.setText(content);
        }


    }



