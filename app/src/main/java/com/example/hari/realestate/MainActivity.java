package com.example.hari.realestate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id,pass;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id= (EditText) findViewById(R.id.editText3);
        pass = (EditText) findViewById(R.id.editText4);
        submit = (Button) findViewById(R.id.submit);







        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = id.getText().toString();
                String password = pass.getText().toString();

                String oemail = "admin";
                String opass = "admin";
                
                if(email.equals(oemail) && password.equals(opass)){
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,NavigationActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
