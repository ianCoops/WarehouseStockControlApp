package com.example.ianle.warehousestockcontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class adminLogIn extends AppCompatActivity {

    public static Map<String, String> adminPasswords = new HashMap<String, String>();

    Button enterButton, cancelButton;
    EditText idInputBox, passwordInputBox;

    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);

        adminPasswords.put("sysadmin", "letmein");

        enterButton = (Button)findViewById(R.id.enterButton);
        cancelButton = (Button)findViewById(R.id.OpCancelButton);

        idInputBox = (EditText)findViewById(R.id.idEntryBox);
        passwordInputBox = (EditText)findViewById(R.id.OpPasswordInputBox);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = idInputBox.getText().toString();
                String password = passwordInputBox.getText().toString();

                if(adminPasswords.containsKey(id) && adminPasswords.get(id).equals(password)) {
                    Toast.makeText(getApplicationContext(),
                            "Logging in...",Toast.LENGTH_SHORT).show();
                    MainActivity.currentUser = id;
                    Intent mainMenu = new Intent("com.example.ianle.warehousestockcontrolapp.MainMenu");
                    startActivity(mainMenu);
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid details.",Toast.LENGTH_SHORT).show();

                    if (counter == 0){
                        enterButton.setEnabled(false);
                        Toast.makeText(getApplicationContext(),"3 Failed attempts. Try again later.",
                                Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
