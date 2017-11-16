package com.example.vikastomar.aut1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.dev1);
    //    TextView tv1 = (TextView)findViewById(R.id.devsn);
        tv.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "long pressed", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, NewDevice.class));

                return false;
            }
        });

        TextView txtView1 = (TextView) findViewById(R.id.devsn);
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();
        if(bd != null)
        {
            String getName = (String) bd.get("serial");
            txtView1.setText(getName);
        }

        TextView txtView2 = (TextView) findViewById(R.id.devln);
        Intent intent1 = getIntent();
        Bundle bd1 = intent1.getExtras();
        if(bd1 != null)
        {
         //   String getName = (String) bd.get("location");
         //   txtView2.setText(getName);
        }
    }
}
