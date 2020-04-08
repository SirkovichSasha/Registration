package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText UserNameEdit;
    private EditText emailEdit;
    private TextView result;
    private Button btnOK;
    private Button ClearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserNameEdit.getText().clear();
                emailEdit.getText().clear();
                result.setText("");
            }
        });

       btnOK.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String username=UserNameEdit.getText().toString();
               String mailCount=emailEdit.getText().toString();

               String text = getString(R.string.welcome_messages, username, mailCount);
               result.setText(text);


           }
       });
    }

    private void init() {
        result=findViewById(R.id.resultTextView);
        UserNameEdit=findViewById(R.id.userNameEdit);
        emailEdit=findViewById(R.id.emailEdit);
        btnOK=findViewById(R.id.okBtn);
        ClearBtn=findViewById(R.id.clearBtn);


    }
}
