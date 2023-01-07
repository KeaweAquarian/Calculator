package com.example.keaweaquariancalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonOperand, buttonClear, buttonEqual;

    TextView leftvalaue, rightvalue, result, operand;

    private RadioGroup radioGroup;

    private Switch aSwitch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switch1);

        radioGroup = findViewById(R.id.radioGroup);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonOperand = (Button) findViewById(R.id.buttonOperand);
        buttonClear = (Button) findViewById(R.id.buttonclear);
        buttonEqual = (Button) findViewById(R.id.buttonequals);
        leftvalaue = findViewById(R.id.lefttext);
        rightvalue = findViewById(R.id.righttext);
        result = findViewById(R.id.result);
        operand = findViewById(R.id.operand);

        Boolean switchState = aSwitch.isChecked();
        if (switchState) {
            View someView = findViewById(R.id.root);
            View root = someView.getRootView();
            root.setBackgroundColor(ContextCompat.getColor(this, R.color.black));
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                if (id == R.id.addbtn) {
                   operand.setText("+");
                }else if (id == R.id.subtractbtn) {
                    operand.setText("-");
                }else  if (id == R.id.multiplybtn) {
                    operand.setText("*");
                }else  if (id == R.id.dividebtn) {
                    operand.setText("/");
                }

            }
        });


        buttonOperand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    buttonOperand.setText("Right");
                } else {
                    buttonOperand.setText("Left");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button1.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button1.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button2.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button2.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button3.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button3.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button4.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button4.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button5.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button5.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button6.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button6.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button7.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button7.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button8.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button8.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button9.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button9.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonOperand.getText().toString().equals ("Left")) {
                    leftvalaue.setText(button0.getText().toString() + leftvalaue.getText().toString());
                } else {
                    rightvalue.setText(button0.getText().toString() + rightvalue.getText().toString());
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    if (operand.getText().toString().equals("+")) {
                        result.setText(Float.parseFloat(leftvalaue.getText().toString()) + Float.parseFloat(rightvalue.getText().toString()) + "");
                        leftvalaue.setText("");
                        rightvalue.setText("");
                    }

                    if (operand.getText().toString().equals("-")) {
                        result.setText(Float.parseFloat(leftvalaue.getText().toString()) - Float.parseFloat(rightvalue.getText().toString()) + "");
                        leftvalaue.setText("");
                        rightvalue.setText("");
                    }

                    if (operand.getText().toString().equals("*")) {
                        result.setText(Float.parseFloat(leftvalaue.getText().toString()) * Float.parseFloat(rightvalue.getText().toString()) + "");
                        leftvalaue.setText("");
                        rightvalue.setText("");
                    }

                    try {

                        if (operand.getText().toString().equals("/")) {
                            if (rightvalue.getText().toString().equals("0")) {
                                Toast.makeText(MainActivity.this, "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
                            }else {
                                result.setText(Float.parseFloat(leftvalaue.getText().toString()) / Float.parseFloat(rightvalue.getText().toString()) + "");
                                leftvalaue.setText("");
                                rightvalue.setText("");
                            }
                        }
                    } catch (ArithmeticException e) {
                        Toast.makeText(MainActivity.this, "Cannot divide by zero.", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                   Toast.makeText(MainActivity.this, "Left and Right Operand must have a value!", Toast.LENGTH_SHORT).show();
                }



            }
        });


        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                leftvalaue.setText("");
                rightvalue.setText("");
            }
        });

    }
}



