package com.example.advancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;

import android.content.res.Configuration;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            buttonAdd, buttonSub, buttonMul, buttonDiv,
            buttonC, buttonEqual, buttonDecimal, button10E ,buttonBksp, buttonMod,
            buttonPM, buttonLeftBracket, buttonRightBracket, buttonSqrt,
            buttonTan, buttonExpo, buttonPow, buttonE, buttonFac, buttonCos,
            buttonLog, buttonPow2, buttonPi, button2Pow, buttonSin, buttonLn,
            buttonPowE, buttonAbs, buttonAsin, buttonAcos, buttonAtan, buttonRadDeg;

    TextView screen;

    private Double result = 0.0;
    private boolean negative = false;
    private boolean isDegrees = false;

    private void clear() {
        if (((screen.getText().length() == 1) && (screen.getText().toString() == "0")) || (screen.getText() == "Error.")) {
            screen.setText("");
        }
    }

    private void checkTextSize() {
        if (screen.getText().length() >= 6) {
            screen.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 44.f);
        } else {
            screen.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 88.f);
        }
    }

    public double convertToDegrees(String res){
        double newRes = Double.parseDouble(res);
        if(isDegrees) {
            newRes = Math.toDegrees(newRes);
        }
        return newRes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);
        buttonC = findViewById(R.id.btnClear);
        buttonEqual = findViewById(R.id.btnEqual);
        buttonDecimal = findViewById(R.id.btnDecimal);
        button10E = findViewById(R.id.btn10E);
        buttonBksp = findViewById(R.id.btnBack);
        buttonMod = findViewById(R.id.btnMod);
        buttonPM = findViewById(R.id.btnPM);
        buttonLeftBracket = findViewById(R.id.btnLeftBracket);
        buttonRightBracket = findViewById(R.id.btnRightBracket);
        buttonSqrt = findViewById(R.id.btnSqrt);
        buttonTan = findViewById(R.id.btnTan);
        buttonExpo = findViewById(R.id.btnExpo);
        buttonPow = findViewById(R.id.btnPow);
        buttonE = findViewById(R.id.btnE);
        buttonFac = findViewById(R.id.btnFac);
        buttonCos = findViewById(R.id.btnCos);
        buttonLog = findViewById(R.id.btnLog);
        buttonPow2 = findViewById(R.id.btnPow2);
        buttonPi = findViewById(R.id.btnPi);
        button2Pow = findViewById(R.id.btn2Pow);
        buttonSin = findViewById(R.id.btnSin);
        buttonLn = findViewById(R.id.btnLn);
        buttonPowE = findViewById(R.id.btnPowE);
        buttonAbs = findViewById(R.id.btnAbs);
        buttonAsin = findViewById(R.id.btnAsin);
        buttonAcos = findViewById(R.id.btnAcos);
        buttonAtan = findViewById(R.id.btnAtan);
        buttonRadDeg = findViewById(R.id.btnRadDeg);

        screen = findViewById(R.id.screen);

        screen.setText("0");

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "0");
                negative = false;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "1");
                negative = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "2");
                negative = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "3");
                negative = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "4");
                negative = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "5");
                negative = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "6");
                negative = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "7");
                negative = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "8");
                negative = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "9");
                negative = false;
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "+");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "−");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "×");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "÷");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
                checkTextSize();
                negative = false;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String txt = screen.getText().toString();
                    String newTxt;

                    if (txt.contains("×")) {
                        newTxt = txt.replace("×", "*");
                        txt = newTxt;
                    }
                    if (txt.contains("÷")) {
                        newTxt = txt.replace("÷", "/");
                        txt = newTxt;
                    }
                    if (txt.contains("−")) {
                        newTxt = txt.replace("−", "-");
                        txt = newTxt;
                    }
                    if (txt.contains("√(")) {
                        newTxt = txt.replace("√(", "sqrt(");
                        txt = newTxt;
                    }
                    if (txt.contains("π")) {
                        newTxt = txt.replace("π", "pi");
                        txt = newTxt;
                    }

                    result = new ExtendedDoubleEvaluator().evaluate(txt);

                    if (isDegrees) {
                        double newRes = convertToDegrees(result.toString());
                        String r = Double.toString(newRes);
                        screen.setText(r);
                    } else {
                        screen.setText(result.toString());
                    }

                    checkTextSize();


                } catch (Exception e) {
                    screen.setText("Error.");
                    checkTextSize();
                }
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + ".");
            }
        });

        button10E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "×10^(");
            }
        });

        buttonBksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = screen.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    screen.setText(str);
                } else if (screen.length() <= 1) {
                    screen.setText("0");
                }
                if (str.charAt(str.length() - 1) == '(') {
                    negative = false;
                }
                checkTextSize();
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "%");
            }
        });

        buttonPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                negative = !negative;
                clear();
                String str = screen.getText().toString();
                if (negative) {
                    // If str contains nothing or the last character is not a digit
                    if ((str == "0") || (str == "")) {
                        str = "(-";
                        screen.setText(str);
                    } else if (!Character.isDigit(str.charAt(str.length() - 1))) {
                        str += "(-";
                        screen.setText(str);
                    }
                    if (Character.isDigit(str.charAt(str.length() - 1)) ) {
                        char[] chars = str.toCharArray();
                        int count = 0;
                        int decCount = 0;
                        boolean isDecimal = false;

                        // Counts the amount of digits starting from the end of the str variable.
                        for (int i = chars.length - 1; i >= 0; i--) {
                            if ((Character.isDigit(chars[i])) || (chars[i] == '.')) {
                                count++;
                                // If the character in the current index is a dot, the number is a decimal.
                                if (chars[i] == '.') {
                                    isDecimal = true;
                                }
                            }

                            // If the character is not a dot nor a digit, break the loop.
                            if (!Character.isDigit(chars[i])) {
                                break;
                            }
                        }

                        // Counts the amount of digits after the decimal value.
                        if (isDecimal) {
                            for (int i = chars.length - 1 - count; i >= 0; i--) {
                                if ((Character.isDigit(chars[i]))) {
                                    decCount++;
                                }

                                if (!Character.isDigit(chars[i])) {
                                    break;
                                }
                            }
                        }

                        // Insert the "(-" in str
                        int index = isDecimal ? str.length() - (decCount + count) : str.length() - count;
                        StringBuilder sb = new StringBuilder(str);
                        sb.insert(index, '-');
                        sb.insert(index, '(');
                        screen.setText(sb.toString());
                    }
                } else {
                    StringBuilder builder = new StringBuilder();
                    if (str == "(-") {
                        screen.setText("");
                    }
                    if (str.contains("(-")) {
                        int start = str.lastIndexOf("(-");
                        builder.append(str.substring(0, start));
                        builder.append("");
                        builder.append(str.substring(start + "(-".length()));
                        screen.setText(builder.toString());
                    }
                }
            }
        });

        buttonLeftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "(");
            }
        });

        buttonRightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + ")");
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "√(");
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "tan(");
            }
        });

        buttonExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "1/(");
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "^(");
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "e");
            }
        });

        buttonFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "!");
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "cos(");
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "log(");
            }
        });

        buttonPow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "^2");
            }
        });

        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "π");
            }
        });

        button2Pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "2^(");
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "sin(");
            }
        });

        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "ln(");
            }
        });

        buttonPowE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "e^(");
            }
        });

        buttonAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "abs(");
            }
        });

        buttonAsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "asin(");
            }
        });

        buttonAcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "acos(");
            }
        });

        buttonAtan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                checkTextSize();
                screen.setText(screen.getText() + "atan(");
            }
        });

        buttonRadDeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDegrees = !isDegrees;
                if (isDegrees) {
                    buttonRadDeg.setTextColor(Color.parseColor("#FFC5BA"));
                    buttonRadDeg.setText("Deg");
                } else {
                    buttonRadDeg.setTextColor(Color.parseColor("#FFFFFF"));
                    buttonRadDeg.setText("Rad");
                }
            }
        });

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In Landscape
            buttonSqrt.setVisibility(View.VISIBLE);
            buttonTan.setVisibility(View.VISIBLE);
            buttonExpo.setVisibility(View.VISIBLE);
            buttonPow.setVisibility(View.VISIBLE);
            buttonE.setVisibility(View.VISIBLE);
            buttonFac.setVisibility(View.VISIBLE);
            buttonCos.setVisibility(View.VISIBLE);
            buttonLog.setVisibility(View.VISIBLE);
            buttonPi.setVisibility(View.VISIBLE);
            button2Pow.setVisibility(View.VISIBLE);
            buttonSin.setVisibility(View.VISIBLE);
            buttonLn.setVisibility(View.VISIBLE);
            buttonPowE.setVisibility(View.VISIBLE);
            buttonAbs.setVisibility(View.VISIBLE);
            buttonAsin.setVisibility(View.VISIBLE);
            buttonAcos.setVisibility(View.VISIBLE);
            buttonAtan.setVisibility(View.VISIBLE);
            buttonRadDeg.setVisibility(View.VISIBLE);
        } else {
            // In portrait
            buttonSqrt.setVisibility(View.GONE);
            buttonTan.setVisibility(View.GONE);
            buttonExpo.setVisibility(View.GONE);
            buttonPow.setVisibility(View.GONE);
            buttonE.setVisibility(View.GONE);
            buttonFac.setVisibility(View.GONE);
            buttonCos.setVisibility(View.GONE);
            buttonLog.setVisibility(View.GONE);
            buttonPi.setVisibility(View.GONE);
            button2Pow.setVisibility(View.GONE);
            buttonSin.setVisibility(View.GONE);
            buttonLn.setVisibility(View.GONE);
            buttonPowE.setVisibility(View.GONE);
            buttonAbs.setVisibility(View.GONE);
            buttonAsin.setVisibility(View.GONE);
            buttonAcos.setVisibility(View.GONE);
            buttonAtan.setVisibility(View.GONE);
            buttonRadDeg.setVisibility(View.GONE);
        }
    }
}