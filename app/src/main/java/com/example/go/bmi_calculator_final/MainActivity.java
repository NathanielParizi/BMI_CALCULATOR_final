package com.example.go.bmi_calculator_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MAGIC";
    TextView bmi, tvWeight, tvHeight, tvStandard, tvPrintResults;
    EditText weight, height;
    Button button;
    Switch tempSwitch;
    String tempDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        {

            bmi = (TextView) findViewById(R.id.idButton);
            weight = (EditText) findViewById(R.id.etWeight);
            height = (EditText) findViewById(R.id.etHeight);
            Button btn = (Button) findViewById(R.id.idButton);
            tvHeight = (TextView) findViewById(R.id.TextView2);
            tvWeight = (TextView) findViewById(R.id.TextView1);
            tvStandard = (TextView) findViewById(R.id.TextView3);

            tempSwitch.setChecked(true);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                        tvPrintResults.setText("Input String");


                        return;
                    }


                    Log.i("MyaPP","this is a message!");
                    Toast.makeText(getApplicationContext(), "its magic", Toast.LENGTH_SHORT)
                            .show();


                    double dblWeight = 1.0;
                    double dblHeight = 1.0;
                    dblWeight = (Double) parseDouble(weight.getText().toString());
                    dblHeight = (Double) parseDouble(height.getText().toString());

                    double dblBMI = ((dblWeight * 703) / (dblHeight * dblHeight)) * 100;
                    dblBMI = Math.round(dblBMI);
                    dblBMI = dblBMI / 100;

                    bmi.setText(String.valueOf(dblBMI));

                    printResults();
                }
            });






            tempSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if (isChecked) {

                        tvWeight.setText("Pounds");
                        tvHeight.setText("Inches");

                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                                    tvPrintResults.setText("Input String");
                                    return;
                                }
                                double dblWeight = 1.0;
                                double dblHeight = 1.0;
                                dblWeight = (Double) parseDouble(weight.getText().toString());
                                dblHeight = (Double) parseDouble(height.getText().toString());

                                double dblBMI = ((dblWeight * 703) / (dblHeight * dblHeight)) * 100;
                                dblBMI = Math.round(dblBMI);
                                dblBMI = dblBMI / 100;

                                bmi.setText(String.valueOf(dblBMI));

                                printResults();

                            }
                        });
                    } else {
                        tvStandard.setText("Metric");
                        tvWeight.setText("Kilograms");
                        tvHeight.setText("Meters");

                        button.setOnClickListener(new View.OnClickListener() { //sets the on click lisener. It performs the action
                            //when you click the buutton. View.OnClickListener() is built in. the onClick below is a made up name.
                            @Override
                            public void onClick(View v) {
                                if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                                    tvPrintResults.setText("Input String");
                                    return;
                                }
                                double dblWeight = 1.0;
                                double dblHeight = 1.0;
                                dblWeight = (Double) parseDouble(weight.getText().toString());
                                dblHeight = (Double) parseDouble(height.getText().toString());

                                double dblBMI = ((dblWeight) / (dblHeight * dblHeight)) * 100;
                                dblBMI = Math.round(dblBMI);
                                dblBMI = dblBMI / 100;

                                bmi.setText(String.valueOf(dblBMI));

                                printResults();
                            }
                        });
                    }
                }
            });


        }

    }



    public void init() {

        bmi = (TextView) findViewById(R.id.idButton);
        weight = (EditText) findViewById(R.id.etWeight);
        height = (EditText) findViewById(R.id.etHeight);
        Button btn = (Button) findViewById(R.id.idButton);
        tvHeight = (TextView) findViewById(R.id.TextView2);
        tvWeight = (TextView) findViewById(R.id.TextView1);
        tvStandard = (TextView) findViewById(R.id.TextView3);

        tempSwitch.setChecked(true);


  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                    tvPrintResults.setText("Input String");


                    return;
                }


                Log.i("MyaPP","this is a message!");
                Toast.makeText(getApplicationContext(), "its magic", Toast.LENGTH_SHORT)
                        .show();


                double dblWeight = 1.0;
                double dblHeight = 1.0;
                dblWeight = (Double) parseDouble(weight.getText().toString());
                dblHeight = (Double) parseDouble(height.getText().toString());

                double dblBMI = ((dblWeight * 703) / (dblHeight * dblHeight)) * 100;
                dblBMI = Math.round(dblBMI);
                dblBMI = dblBMI / 100;

                bmi.setText(String.valueOf(dblBMI));

                printResults();
            }
        });






        tempSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    tvWeight.setText("Pounds");
                    tvHeight.setText("Inches");

                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                                tvPrintResults.setText("Input String");
                                return;
                            }
                            double dblWeight = 1.0;
                            double dblHeight = 1.0;
                            dblWeight = (Double) parseDouble(weight.getText().toString());
                            dblHeight = (Double) parseDouble(height.getText().toString());

                            double dblBMI = ((dblWeight * 703) / (dblHeight * dblHeight)) * 100;
                            dblBMI = Math.round(dblBMI);
                            dblBMI = dblBMI / 100;

                            bmi.setText(String.valueOf(dblBMI));

                            printResults();

                        }
                    });
                } else {
                    tvStandard.setText("Metric");
                    tvWeight.setText("Kilograms");
                    tvHeight.setText("Meters");

                    button.setOnClickListener(new View.OnClickListener() { //sets the on click lisener. It performs the action
                        //when you click the buutton. View.OnClickListener() is built in. the onClick below is a made up name.
                        @Override
                        public void onClick(View v) {
                            if (TextUtils.isEmpty(weight.getText().toString()) || TextUtils.isEmpty(height.getText().toString())) {
                                tvPrintResults.setText("Input String");
                                return;
                            }
                            double dblWeight = 1.0;
                            double dblHeight = 1.0;
                            dblWeight = (Double) parseDouble(weight.getText().toString());
                            dblHeight = (Double) parseDouble(height.getText().toString());

                            double dblBMI = ((dblWeight) / (dblHeight * dblHeight)) * 100;
                            dblBMI = Math.round(dblBMI);
                            dblBMI = dblBMI / 100;

                            bmi.setText(String.valueOf(dblBMI));

                            printResults();
                        }
                    });
                }
            }
        });


    }




    public void printResults() {
        String strPrintResults = tvPrintResults.toString();
        double dblBMI = (Double) parseDouble(bmi.getText().toString());
        //dblBMI = dblBMI/100;
        if (dblBMI < 18.5) {
            tvPrintResults.setText("A rabbit eats better than you, close this app and eat");
        }
        if (dblBMI < 24.9 && dblBMI > 18.5) {
            tvPrintResults.setText("Don't worry about it");
        }
        if (dblBMI < 29.9 && dblBMI > 25) {
            tvPrintResults.setText("You're getting fat");
        }
        if (dblBMI > 29.9) {
            tvPrintResults.setText("You are exceedingly fat, what a shame.");
        } else {
        }

    }

    }
