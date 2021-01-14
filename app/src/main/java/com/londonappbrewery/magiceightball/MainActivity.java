package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private ImageView ballDisplay;
    private int[] ballArray;
    private Button myButton;
    Random randomNumGenerator;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        ballArray = new int[] {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
        myButton = (Button) findViewById(R.id.askButton);


        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                randomNumGenerator = new Random();
                number = randomNumGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
