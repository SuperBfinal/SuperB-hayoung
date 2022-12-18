package com.example.home;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;

public class choice extends AppCompatActivity {

    TextView back;
    Button button;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);

        //뒤로 가기 버튼
        back = findViewById(R.id.textback);
        back.setOnClickListener(v -> onBackPressed());

        //저장하기 버튼
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);


        SharedPreferences sp = getSharedPreferences("temp", MODE_PRIVATE);


        //앱이 실행될 때 체크박스의 마지막 상태를 로드
        boolean ch = sp.getBoolean("c", false);

        checkBox.setChecked(ch);
        checkBox2.setChecked(ch);
        checkBox3.setChecked(ch);
        checkBox4.setChecked(ch);
        checkBox5.setChecked(ch);
        checkBox6.setChecked(ch);
        checkBox7.setChecked(ch);
        checkBox8.setChecked(ch);
        checkBox9.setChecked(ch);
        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked) {
                    // TODO : CheckBox is checked.
                } else {
                    // TODO : CheckBox is unchecked.
                }
            }
        });

        checkBox.setOnClickListener(ck);
        checkBox2.setOnClickListener(ck);
        checkBox3.setOnClickListener(ck);
        checkBox4.setOnClickListener(ck);
        checkBox5.setOnClickListener(ck);
        checkBox6.setOnClickListener(ck);
        checkBox7.setOnClickListener(ck);
        checkBox8.setOnClickListener(ck);
        checkBox9.setOnClickListener(ck);
    }

    View.OnClickListener ck;

    {
        ck = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                switch (v.getId()) {
                    case R.id.checkBox:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }

                    case R.id.checkBox2:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }
                    case R.id.checkBox3:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }
                    case R.id.checkBox4:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }
                    case R.id.checkBox5:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }

                    case R.id.checkBox6:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }
                    case R.id.checkBox7:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }

                    case R.id.checkBox8:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }
                    case R.id.checkBox9:

                        if (checked) {
                            // TODO : CheckBox is checked.
                        } else {
                            // TODO : CheckBox is unchecked.
                        }


                }

            }
        };
    }
}

