package com.example.yazilimhpp.customaccordion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TableLayout table=(TableLayout)findViewById(R.id.table);
        RelativeLayout main=(RelativeLayout)findViewById(R.id.main);
        main.setVisibility(View.GONE);

        Human RickyMartin =new Human("Ricky","Martin");
        Human furkish=new Human("Furkish","furki");
        CustomButton button1= new CustomButton(getApplicationContext(),RickyMartin);
        CustomButton button2= new CustomButton(getApplicationContext(),"michael","jackson");
        CustomButton button3=new CustomButton(getApplicationContext(),furkish);
        ButtonList list=new ButtonList(this);
        list.Add(button1);
        list.Add(button2);
        list.Add(button3);
        table.addView(button1);
        table.addView(button2);
        table.addView(button3);

    }
}
