package tr.com.tarnet.basiccalculatorbybensusezgi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button acButton, SignChangeButton, PercentButton, DivisionButton, MultiplicationButton;
    Button MinusButton, AdditionButton, CommaButton, EqualButton;
    Button ZeroButton, OneButton, TwoButton, ThreeButton, FourButton;
    Button FiveButton, SixButton, SevenButton, EightButton, NineButton;
    TextView displayResult;
    double first_number, second_number, corollary;
    int status = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayResult = findViewById(R.id.display_result);
        displayResult.setText("0");

        acButton = findViewById(R.id.ac_button);
        acButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acButtonAction();
            }
        });


        SignChangeButton = findViewById(R.id.SignChange_button);
        SignChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignChangeButtonAction();
            }
        });


        PercentButton = findViewById(R.id.percent_button);
        PercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PercentButtonAction();
            }
        });


        DivisionButton = findViewById(R.id.division_button);
        DivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DivisionButtonAction();
            }
        });


        MultiplicationButton = findViewById(R.id.multiplication_button);
        MultiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiplicationButtonAction();
            }
        });


        MinusButton = findViewById(R.id.minus_button);
        MinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MinusButtonAction();
            }
        });


        AdditionButton = findViewById(R.id.addition_button);
        AdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdditionButtonAction();
            }
        });


        CommaButton = findViewById(R.id.comma_button);
        CommaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommaButtonAction();
            }
        });


        EqualButton = findViewById(R.id.equal_button);
        EqualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EqualButtonAction();
            }
        });


        ZeroButton = findViewById(R.id.zero_button);
        ZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZeroButtonAction();
            }
        });


        OneButton = findViewById(R.id.one_button);
        OneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OneButtonAction();
            }
        });


        TwoButton = findViewById(R.id.two_button);
        TwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TwoButtonAction();
            }
        });


        ThreeButton = findViewById(R.id.three_button);
        ThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThreeButtonAction();
            }
        });


        FourButton = findViewById(R.id.four_button);
        FourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FourButtonAction();
            }
        });


        FiveButton = findViewById(R.id.five_button);
        FiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FiveButtonAction();
            }
        });


        SixButton = findViewById(R.id.six_button);
        SixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SixButtonAction();
            }
        });


        SevenButton = findViewById(R.id.seven_button);
        SevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SevenButtonAction();
            }
        });


        EightButton = findViewById(R.id.eight_button);
        EightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EightButtonAction();
            }
        });


        NineButton = findViewById(R.id.nine_button);
        NineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NineButtonAction();
            }
        });


    }

    private void acButtonAction() {

        displayResult.setText("0");
        System.out.println(displayResult);

    }

    private void SignChangeButtonAction() {

        String sign_control = displayResult.getText().toString();

        if (sign_control.contains("-")) {

            sign_control.replace("-", "");

            System.out.println(sign_control);
        }

        else

            System.out.println("-" + sign_control);

    }

    private void PercentButtonAction(int number) {

        double percent_number;
        percent_number = number/100;
        System.out.println(percent_number);

    }

    private void DivisionButtonAction() {

        processSelected(1);
    }

    private void MultiplicationButtonAction() {

        processSelected(2);
    }

    private void MinusButtonAction() {

        processSelected(3);
    }

    private void AdditionButtonAction() {

        processSelected(4);
    }

    private void CommaButtonAction() {

        displayResult.setText(",");
        String FirstNumber, SecondNumber;
        double fractional_number;
        if(){
            FirstNumber = displayResult.getText().toString();
        }
        if(){
            SecondNumber = displayResult.getText().toString();
        }
        fractional_number = (Double.parseDouble(FirstNumber.concat(SecondNumber)))/Math.pow(10,SecondNumber.length());

    }

    private void EqualButtonAction() {

        displayResult.setText(String.valueOf(corollary));

    }

    private void ZeroButtonAction() {

        numberEntered(0);

    }

    private void OneButtonAction() {

        numberEntered(1);

    }

    private void TwoButtonAction() {

        numberEntered(2);

    }

    private void ThreeButtonAction() {

        numberEntered(3);

    }

    private void FourButtonAction() {

        numberEntered(4);

    }

    private void FiveButtonAction() {

        numberEntered(5);

    }

    private void SixButtonAction() {

        numberEntered(6);

    }

    private void SevenButtonAction() {

        numberEntered(7);

    }

    private void EightButtonAction() {

        numberEntered(8);

    }

    private void NineButtonAction() {

        numberEntered(9);

    }

    private void numberEntered(int number){


        if(number==0) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '0';
            displayResult.setText(instantValue);
        }

        else if(number==1) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '1';
            displayResult.setText(instantValue);
        }

        else if(number==2) {
            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '2';
            displayResult.setText(instantValue);
        }

        else if(number==3) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '3';
            displayResult.setText(instantValue);
        }

        else if(number==4) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '4';
            displayResult.setText(instantValue);
        }

        else if(number==5) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '5';
            displayResult.setText(instantValue);
        }

        else if(number==6) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '6';
            displayResult.setText(instantValue);
        }

        else if(number==7) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '7';
            displayResult.setText(instantValue);
        }

        else if(number==8) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '8';
            displayResult.setText(instantValue);
        }

        else if(number==9) {

            String instantValue = displayResult.getText().toString();
            instantValue = instantValue + '9';
            displayResult.setText(instantValue);
        }
    }

    private void processSelected(int processType){

             if(status == 0){
                first_number = Double.valueOf(displayResult.getText().toString());
                displayResult.setText("0");
                status = 1;
            }else if (status == 1) {
                second_number = Double.valueOf(displayResult.getText().toString());
                switch (processType) {
                    case 1:
                        corollary = first_number / second_number;
                        break;
                    case 2:
                        corollary = first_number * second_number;
                        break;
                    case 3:
                        corollary = first_number - second_number;
                        break;
                    case 4:
                        corollary = first_number + second_number;
                        break;
                    default:
                        corollary = 0;
                        first_number = 0;
                        second_number = 0;
                        status = 0;
                        break;
                }
                displayResult.setText(String.valueOf(corollary));
                status = 2;
            }
              else {
                  switch (processType) {
                      case 1:
                          corollary = corollary / second_number;
                          break;
                      case 2:
                          corollary = corollary * second_number;
                          break;
                      case 3:
                          corollary = corollary - second_number;
                          break;
                      case 4:
                          corollary = corollary + second_number;
                          break;
                      default:
                          corollary = 0;
                          first_number = 0;
                          second_number = 0;
                          status = 0;
                          break;
                }
                  displayResult.setText(String.valueOf(corollary));
            }
    }

}
