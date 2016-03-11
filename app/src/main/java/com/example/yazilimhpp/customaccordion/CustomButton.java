package com.example.yazilimhpp.customaccordion;


import android.content.Context;
import android.widget.Button;

public class CustomButton extends Button {
    private Human human;
    public int index;
    public  static int  counter=0;
    public CustomButton(Context context, String name, String surname) {
        super(context);
        index=counter;
        counter++;
      human=new Human(name,surname);
        setText((index+1) +".) name:"+name);

    }
    public CustomButton(Context context,Human human){
        super(context);
        index=counter;
        counter++;

        this.human=human;
        setText((index +1)+".) name:"+human.getName());
    }

    public Human getHuman() {
        return human;
    }
}