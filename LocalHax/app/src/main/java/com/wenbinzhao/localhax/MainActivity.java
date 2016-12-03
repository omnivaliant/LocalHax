package com.wenbinzhao.localhax;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnGoose;
    TextView txtMain;
    ToggleButton tgl00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoose = (Button)findViewById(R.id.goose);
        txtMain = (TextView)findViewById(R.id.main);
        tgl00 = (ToggleButton)findViewById(R.id.b00);

        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText("Quack!");
                // btnGoose.setSelected(true);
                tgl00.toggle();
            }
        });

    }



}
