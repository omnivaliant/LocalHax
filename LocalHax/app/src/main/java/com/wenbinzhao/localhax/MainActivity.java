package com.wenbinzhao.localhax;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnGoose;
    TextView txtMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoose = (Button)findViewById(R.id.goose);
        txtMain = (TextView)findViewById(R.id.main);

        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMain.setText("@string/goose_click");
            }
        });

    }



}
