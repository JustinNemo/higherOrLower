package com.nikolaihost.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    int guessValue;
    String message;


    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber =rand.nextInt(20)+1;
    }
    public void guess(View view){
        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        guessValue = Integer.parseInt(numberEditText.getText().toString());
            if(guessValue > randomNumber){
                message = "Lower!!!";
            }else if(guessValue < randomNumber) {
                message = "Higher!!!";

            }else{
                message = "You've Guessed it!!";
                generateRandomNumber();
            }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("Value", numberEditText.getText().toString());
        Log.i("info", Integer.toString(randomNumber));


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
