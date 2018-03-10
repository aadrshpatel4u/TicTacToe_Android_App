package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ImageButton ib11,ib12,ib13,ib21,ib22,ib23,ib31,ib32,ib33;
    int counter;
    int[][] arr;
    TextView who_won;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib11 = (ImageButton) findViewById(R.id.ib11);
        ib12 = (ImageButton) findViewById(R.id.ib12);
        ib13 = (ImageButton) findViewById(R.id.ib13);
        ib21 = (ImageButton) findViewById(R.id.ib21);
        ib22 = (ImageButton) findViewById(R.id.ib22);
        ib23 = (ImageButton) findViewById(R.id.ib23);
        ib31 = (ImageButton) findViewById(R.id.ib31);
        ib32 = (ImageButton) findViewById(R.id.ib32);
        ib33 = (ImageButton) findViewById(R.id.ib33);
        counter=1;
        arr = new int[3][3];
        who_won = (TextView) findViewById(R.id.won_textview);
    }

    public void ib11clicked(View view){
        if(counter == 1) {
            ib11.setImageResource(android.R.color.transparent);
            ib11.setImageResource(R.drawable.ring);
            arr[0][0]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib11.setImageResource(android.R.color.transparent);
            ib11.setImageResource(R.drawable.multiply);
            arr[0][0]=2;
            counter = 1;
        }
        ib11.setClickable(false);
        check(0,0);
    }
    public void ib12clicked(View view){
        if(counter == 1) {
            ib12.setImageResource(android.R.color.transparent);
            ib12.setImageResource(R.drawable.ring);
            arr[0][1]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib12.setImageResource(android.R.color.transparent);
            ib12.setImageResource(R.drawable.multiply);
            arr[0][1]=2;
            counter = 1;
        }
        ib12.setClickable(false);
        check(0,1);
    }
    public void ib13clicked(View view){
        if(counter == 1) {
            ib13.setImageResource(android.R.color.transparent);
            ib13.setImageResource(R.drawable.ring);
            arr[0][2]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib13.setImageResource(android.R.color.transparent);
            ib13.setImageResource(R.drawable.multiply);
            arr[0][2]=2;
            counter = 1;
        }
        ib13.setClickable(false);
        check(0,2);
    }
    public void ib21clicked(View view){
        if(counter == 1) {
            ib21.setImageResource(android.R.color.transparent);
            ib21.setImageResource(R.drawable.ring);
            arr[1][0]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib21.setImageResource(android.R.color.transparent);
            ib21.setImageResource(R.drawable.multiply);
            arr[1][0]=2;
            counter = 1;
        }
        ib21.setClickable(false);
        check(1,0);
    }
    public void ib22clicked(View view){
        if(counter == 1) {
            ib22.setImageResource(android.R.color.transparent);
            ib22.setImageResource(R.drawable.ring);
            arr[1][1]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib22.setImageResource(android.R.color.transparent);
            ib22.setImageResource(R.drawable.multiply);
            arr[1][1]=2;
            counter = 1;
        }
        ib22.setClickable(false);
        check(1,1);
    }
    public void ib23clicked(View view){
        if(counter == 1) {
            ib23.setImageResource(android.R.color.transparent);
            ib23.setImageResource(R.drawable.ring);
            arr[1][2]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib23.setImageResource(android.R.color.transparent);
            ib23.setImageResource(R.drawable.multiply);
            arr[1][2]=2;
            counter = 1;
        }
        ib23.setClickable(false);
        check(1,2);
    }
    public void ib31clicked(View view){
        if(counter == 1) {
            ib31.setImageResource(android.R.color.transparent);
            ib31.setImageResource(R.drawable.ring);
            arr[2][0]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib31.setImageResource(android.R.color.transparent);
            ib31.setImageResource(R.drawable.multiply);
            arr[2][0]=2;
            counter = 1;
        }
        ib31.setClickable(false);
        check(2,0);
    }
    public void ib32clicked(View view){
        if(counter == 1) {
            ib32.setImageResource(android.R.color.transparent);
            ib32.setImageResource(R.drawable.ring);
            arr[2][1]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib32.setImageResource(android.R.color.transparent);
            ib32.setImageResource(R.drawable.multiply);
            arr[2][1]=2;
            counter = 1;
        }
        ib32.setClickable(false);
        check(2,1);
    }
    public void ib33clicked(View view){
        if(counter == 1) {
            ib33.setImageResource(android.R.color.transparent);
            ib33.setImageResource(R.drawable.ring);
            arr[2][2]=1;
            counter = 2;
        }
        else if(counter ==2) {
            ib33.setImageResource(android.R.color.transparent);
            ib33.setImageResource(R.drawable.multiply);
            arr[2][2]=2;
            counter = 1;
        }
        ib33.setClickable(false);
        check(2,2);
    }

    public void check(int a,int b)
    {
        if(arr[a][0] == arr[a][1] && arr[a][0] == arr[a][2]){
            who_won.setText(String.format("Player %d won!", arr[a][b]));
            button_position(false);
            return;
        }
        else if(arr[0][b] == arr[1][b] && arr[0][b] == arr[2][b]){
            who_won.setText(String.format("Player %d won!", arr[a][b]));
            button_position(false);
            return;
        }
        else if( a-b==0 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]){
            who_won.setText(String.format("Player %d won!", arr[a][b]));
            button_position(false);
            return;
        }
        else if( (a-b==2 || a-b==-2 || (a==1&&b==1)) && arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]){
            who_won.setText(String.format("Player %d won!", arr[a][b]));
            button_position(false);
            return;
        }


    }



    public void reset(View view){
        counter=1;
        ib11.setImageResource(R.drawable.original);
        ib12.setImageResource(R.drawable.original);
        ib13.setImageResource(R.drawable.original);
        ib21.setImageResource(R.drawable.original);
        ib22.setImageResource(R.drawable.original);
        ib23.setImageResource(R.drawable.original);
        ib31.setImageResource(R.drawable.original);
        ib32.setImageResource(R.drawable.original);
        ib33.setImageResource(R.drawable.original);
        button_position(true);
        who_won.setText("");
        for(int[] row:arr) {
            Arrays.fill(row, 0);
        }

    }
    public void button_position(boolean a){
        ib11.setClickable(a);
        ib12.setClickable(a);
        ib13.setClickable(a);
        ib21.setClickable(a);
        ib22.setClickable(a);
        ib23.setClickable(a);
        ib31.setClickable(a);
        ib32.setClickable(a);
        ib33.setClickable(a);
    }
}
