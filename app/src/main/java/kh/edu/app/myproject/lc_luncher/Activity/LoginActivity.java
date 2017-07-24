package kh.edu.app.myproject.lc_luncher.Activity;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kh.edu.app.myproject.lc_luncher.DB.DBOperations;
import kh.edu.app.myproject.lc_luncher.DB.User;
import kh.edu.app.myproject.lc_luncher.R;

public class LoginActivity extends AppCompatActivity {
    DBOperations mydb;
    EditText Phone_number,Password;

    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mydb=new DBOperations(this);
        Phone_number=(EditText)findViewById(R.id.login_phone_number);
        Password=(EditText)findViewById(R.id.login_password);
        signup=(Button)findViewById(R.id.btn_signup);
        login=(Button)findViewById(R.id.btn_login);
        login();
    }
    public void login(){
        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String phonenumber=Phone_number.getText().toString();
                        String password=Password.getText().toString();
                        User user=mydb.login(phonenumber,password);
                        if(user!=null){
                            Log.d("LC Launcer","Login Successful");
                            Intent intent= new Intent (LoginActivity.this,HomeActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Login isn't successful", Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
