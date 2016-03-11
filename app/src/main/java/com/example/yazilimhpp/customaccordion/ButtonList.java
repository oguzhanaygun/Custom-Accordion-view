package com.example.yazilimhpp.customaccordion;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yazilimhpp on 1.3.2016.
 */
public class ButtonList {

    public List<CustomButton> list;
    private int  index;
    public static int counter=0;
    private Activity activity;
    TableLayout table;
    RelativeLayout main;
    EditText name;
    EditText surname;
    private int ClickCount;


//

    public ButtonList(Activity activity) {
        list = new ArrayList<CustomButton>();
        this.activity = activity;
        table = (TableLayout) activity.findViewById(R.id.table);
        main = (RelativeLayout) activity.findViewById((R.id.main));
        name = (EditText) activity.findViewById(R.id.name);
        surname = (EditText) activity.findViewById(R.id.surname);
        ClickCount = 0;
        counter++;
    }


    public void Add(final CustomButton customButton){
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ClickCount%2==0){
                table.removeAllViews();

                for(int i=list.size()-1;i>=0;i--){

                    if(list.get(i).index==customButton.index)
                    {

                        animation.expand(main);
                        name.setText(customButton.getHuman().getName());
                        surname.setText(customButton.getHuman().getSurname());
                        table.addView(main, 0);
                        table.addView(list.get(i),0);

                    }
                    else {
                        table.addView(list.get(i),0);
                    }

                }

            }else{


                table.removeView(main);

                }
                ClickCount++;
            }

        });
        list.add(customButton);

    }


}
