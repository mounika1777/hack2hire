package com.asworld.techie.team5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hni extends AppCompatActivity {
Button meet,schedule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hni);
        meet=(Button)findViewById(R.id.list);
        schedule=(Button)findViewById(R.id.schedule);
        meet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Hni.this,State.class));
            }
        });
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Hni.this,Hni.class));
            }
        });
    }
}
