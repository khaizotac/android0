package com.game.bignumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private  int point =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        int num1 = Integer.parseInt(btn1.getText().toString());
        int num2 = Integer.parseInt(btn2.getText().toString());
        if(view.getId() == R.id.button1){
            if(num1 >= num2) {
                point++;
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show();
            }else {
                point--;
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show();

            }
            TextView pontView = findViewById(R.id.pointTV);
            pontView.setText("Points:"+point);
            generraetRandomNums();
        }else{
            if(num1 < num2) {
                point++;
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show();
            }else {
                point--;
                Toast.makeText(this,"Right answer",Toast.LENGTH_SHORT).show();
            }
            TextView pontView = findViewById(R.id.pointTV);
            pontView.setText("Points:"+point);
            generraetRandomNums();
        }

    }


    private void generraetRandomNums(){
        int num1 = new Random().nextInt(100);
        int num2 = new Random().nextInt(100);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        btn1.setText(String.valueOf(num1));
        btn2.setText(String.valueOf(num2));

    }

}
