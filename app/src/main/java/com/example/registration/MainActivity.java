package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEdit;
    private EditText emailEdit;
    private TextView result;
    private Button okBtn;
    private Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userNameEdit.getText().clear();
                emailEdit.getText().clear();
                result.setText("");
            }
        });

       okBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String username=userNameEdit.getText().toString();
               String mailCount=emailEdit.getText().toString();

               String text = getString(R.string.welcome_messages, username, mailCount);
               result.setText(text);


           }
       });
    }

    private void init() {
        result=findViewById(R.id.resultTextView);
        userNameEdit=findViewById(R.id.userNameEdit);
        emailEdit=findViewById(R.id.emailEdit);
        okBtn=findViewById(R.id.okBtn);
        clearBtn=findViewById(R.id.clearBtn);


    }
}
