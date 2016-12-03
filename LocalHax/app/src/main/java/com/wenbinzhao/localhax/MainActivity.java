package com.wenbinzhao.localhax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ToggleButton;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton[][] btn = new ToggleButton[3][3];
        btn[0][0]=(ToggleButton)findViewById(R.id.b00);
        btn[0][1]=(ToggleButton)findViewById(R.id.b01);
        btn[0][2]=(ToggleButton)findViewById(R.id.b02);
        btn[1][0]=(ToggleButton)findViewById(R.id.b10);
        btn[1][1]=(ToggleButton)findViewById(R.id.b11);
        btn[1][2]=(ToggleButton)findViewById(R.id.b12);
        btn[2][0]=(ToggleButton)findViewById(R.id.b20);
        btn[2][1]=(ToggleButton)findViewById(R.id.b21);
        btn[2][2]=(ToggleButton)findViewById(R.id.b22);

        final Button btnGoose = (Button)findViewById(R.id.goose);
        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++) {
                        btn[i][j].setChecked(false);
                    }
                }
            }
        });

        /*
        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // txtMain.setText("Quack!");
                // btnGoose.setSelected(true);
                tgl00.toggle();
            }
        });
        */

    }

    static void flipNeigh(ToggleButton btn){
        String id=btn.getResources().getResourceEntryName(btn.getId());
        int x = Character.getNumericValue(id.charAt(1));
        int y = Character.getNumericValue(id.charAt(2));
        btn.setText(x+","+y);
    }

}