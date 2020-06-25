package com.dennis.androicrudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Iterator;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private String content;
    String nm,nm2;
    private ListIterator<String> litr = null;

    // Add Them as global variables

    private TextView texts,disp;
    EditText uTxt;

    List<String> existingList = new ArrayList<String>();

    // Need a new List to add or modify items in order to prevent concurrent exception with Iterator
    List<String> toAddList = new ArrayList<String>();

    private Button nextBtn, displayListBtn, printNameBtn, previousBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference Your Views Here

         uTxt= (EditText) findViewById(R.id.nameTxt);
        disp = (TextView) findViewById(R.id.displayName);

        texts = (TextView) findViewById(R.id.listText);
        displayListBtn = (Button) findViewById(R.id.btnDisplayList);
        printNameBtn = (Button) findViewById(R.id.printName);
        nextBtn = (Button) findViewById(R.id.btnNext);
        previousBtn = (Button) findViewById(R.id.btnPrev);

        existingList.add("Shyam");
        existingList.add("Rajat");
        existingList.add("Paul");
        existingList.add("Tom");
        existingList.add("Kate");

        //Obtaining list iterator
        litr = existingList.listIterator();

    }

    public void onChange(View view){

        disp.setText("");

    }

    public void onAdd(View view) {
            nm=uTxt.getText().toString();

//            toAddList.add(nm);

        // Temporary solution
            existingList.add(nm);

            // Just for Logging
            for (String name : existingList) {
                Log.i(TAG, "onAdd: New List : " + name);
            }

//            existingList.addAll(toAddList);

            litr = existingList.listIterator();

        }

    public void nextVal(View view) {
        if (litr.hasNext())
            content = litr.next();
        texts.setText(content);
    }

    public void prevVal(View view) {
        if (litr.hasPrevious())
            content = litr.previous();
        texts.setText(content);
    }

}



