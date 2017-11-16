package com.example.vikastomar.aut1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by vikastomar on 11/16/17.
 */

public class NewDevice extends AppCompatActivity {

    private EditText device_sn,device_ln,device_1,device_2,device_3,device_4;
    private DatabaseHandler db;
    private String f_device_sn,f_device_ln,f_device_1,f_device_2,f_device_3,f_device_4;
    private ListView lv;
    private dataAdapter data;
    private Contact dataModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_device);

        //Instantiate database handler
     //   db=new DatabaseHandler(this);

    //    lv = (ListView) findViewById(R.id.list1);

        device_sn=(EditText) findViewById(R.id.txt1);
        device_ln=(EditText) findViewById(R.id.txt2);
       // device_1=(EditText) findViewById(R.id.txt3);
      //  device_2=(EditText) findViewById(R.id.txt4);
     //   device_3=(EditText) findViewById(R.id.txt5);
    //    device_4=(EditText) findViewById(R.id.txt6);

    }

    public void buttonClicked(View v){
        int id=v.getId();

        switch(id){

            case R.id.save:
                getValues();
              //  addContact();

                break;

        }
    }

    // function to get values from the Edittext
    private void getValues(){
        f_device_sn = device_sn.getText().toString();
        f_device_ln = device_ln.getText().toString();
        Intent intent = new Intent(NewDevice.this,MainActivity.class);
        intent.putExtra("serial",device_sn.getText().toString());
        startActivity(intent);
      //  Intent intent1 = new Intent(NewDevice.this,MainActivity.class);
    //    intent.putExtra("location",device_ln.getText().toString());
    //    startActivity(intent1);
      //  finish();
     //   f_device_1 = device_1.getText().toString();
      //  f_device_2 = device_2.getText().toString();
     //   f_device_3 = device_3.getText().toString();
     //   f_device_4 = device_4.getText().toString();
    }


}