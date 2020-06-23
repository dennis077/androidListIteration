package com.dennis.androicrudapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ListIterator;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private String content;
    private ListIterator<String> litr = null;

    // Add Them as global variables

    private TextView texts,disp;
    EditText uTxt;


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
        disp.setText(uTxt.getText().toString());
        disp.setVisibility(View.VISIBLE);
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



