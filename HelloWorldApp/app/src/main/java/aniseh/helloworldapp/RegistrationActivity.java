package aniseh.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RegistrationActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText email;
    private TextView userLogin;
    private Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setupUIviews();
        regButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

              if( validate()){
                  //upload the data to the database
              }
           }
       });
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            }
        });
    }

    private void setupUIviews(){
        username = (EditText)findViewById(R.id.userNameReg);
        password = (EditText)findViewById(R.id.passwordReg);
        email = (EditText)findViewById(R.id.emailReg);
        regButton = (Button)findViewById(R.id.btnReg);
        userLogin = (TextView)findViewById(R.id.memberReg);

    }

    private Boolean validate(){
        Boolean result = false;
        String name = username.getText().toString();
        String pw = password.getText().toString();
        String em = email.getText().toString();

        if(name.isEmpty() && pw.isEmpty() && em.isEmpty()){
            Toast.makeText(this,"Please enter all the details",Toast.LENGTH_SHORT).show();
        }
        else result = true;
        return result;
    }
}
