package com.example.class228loop;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;
    TextView myText;
    EditText edText;
    int factorial = 1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //=====================================

        myText = findViewById(R.id.myText);
        edText = findViewById(R.id.edText);
        btn =  findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myString = edText.getText().toString().trim(); // Trim দিয়ে স্পেস রিমুভ করি

                if (!myString.isEmpty()) {
                    try {
                        int myInt = Integer.parseInt(myString);
                        long factorial = 1; // ফ্যাক্টোরিয়াল স্টোর করার জন্য
                        for (int i = 1; i <= myInt; i++) {
                            factorial *= i;
                        }

                        myText.setText("Factorial of " + myInt + " is: " + factorial);
                    } catch (NumberFormatException e) {
                        myText.setText("Invalid number format!");
                    }
                } else {
                    myText.setText("Please enter a number.");
                }

            }
        });







//        for(int i = 1; i <= 10; i++){
//
//            int mul = 2*i;
//            myText.append("2 x "+i+" = "+mul + "\n");
//
//        }






/*
// 1+2+3+4+5+6+7+8+9+10+...100 = 5050
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        myText.append(""+sum);

*/

    //================================

/*
        for(int i = 1; i <= 10; i++){

//            if(i==5) continue;
//            myText.append(" \n" + i);

            if(i==5) break;
            myText.append(" \n" + i);


        }
*/



//================================




//        myLayout = findViewById(R.id.myLayout);
//
//        for(int i = 0; i < 100; i++) {
//
//            Button btn = new Button(this);
//            btn.setText("Button " + i);
//            myLayout.addView(btn);
//
//
//
//        }
















    }
}