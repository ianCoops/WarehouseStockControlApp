package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v4.app.AppOpsManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class operativeLogIn extends AppCompatActivity {

    public static Map<String, String> operativePasswords = new HashMap<String, String>();

    Button OpEnterButton, OpCancelButton;
    EditText OpIdInputBox, OpPasswordInputBox;

    int OpCounter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operative_log_in);

        OpEnterButton = (Button)findViewById(R.id.OpEnterButton);
        OpCancelButton = (Button)findViewById(R.id.OpCancelButton);

        OpIdInputBox = (EditText)findViewById(R.id.OpIdInputBox);
        OpPasswordInputBox = (EditText)findViewById(R.id.OpPasswordInputBox);

        OpEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = OpIdInputBox.getText().toString();
                String password = OpPasswordInputBox.getText().toString();

                if(operativePasswords.containsKey(id) && operativePasswords.get(id).equals(password)) {
                    Toast.makeText(getApplicationContext(),
                            "Logging in...",Toast.LENGTH_SHORT).show();
                    MainActivity.currentUser = id;
                    Intent OpMainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.OpMainMenu");
                    startActivity(OpMainMenu);
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid details.",Toast.LENGTH_SHORT).show();

                    if (OpCounter == 0){
                        OpEnterButton.setEnabled(false);
                        Toast.makeText(getApplicationContext(),"3 Failed attempts. Try again later.",
                                Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        OpCancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}