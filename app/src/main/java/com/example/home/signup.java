package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class signup extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    TextView back;
    EditText id,pw, nickname;
    Button  buttondone, buttonprefer;



    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        //뒤로 가기 버튼
        back = findViewById(R.id.back);
        back.setOnClickListener(v -> onBackPressed() );

        //기입 항목
        id=findViewById(R.id.input_id);
        pw=findViewById(R.id.input_pw);
        nickname = findViewById(R.id.input_nickname);
        buttondone=findViewById(R.id.buttondone);
        buttonprefer=findViewById(R.id.buttonprefer);
        firebaseAuth = FirebaseAuth.getInstance();

        //취향선택 버튼
        buttonprefer= findViewById(R.id.buttonprefer);
        buttonprefer.setOnClickListener(v -> {
            Intent intent = new Intent(this, choice.class);
            startActivity(intent);
        });

        //회원가입 완료 버튼
        buttondone = findViewById(R.id.buttondone);
        buttondone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!id.getText().toString().equals("") && !pw.getText().toString().equals("")) {
                    // 이메일과 비밀번호가 공백이 아닌 경우
                    createUser(id.getText().toString(), pw.getText().toString(), nickname.getText().toString());
                } else {
                    // 이메일과 비밀번호가 공백인 경우
                    Toast.makeText(signup.this, "계정과 비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }
            }

        });

    }
      private void createUser(String email, String password, String nickname) {
          firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // 회원가입 성공시
                            Toast.makeText(signup.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            // 계정이 중복된 경우
                            Toast.makeText(signup.this, "이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}










