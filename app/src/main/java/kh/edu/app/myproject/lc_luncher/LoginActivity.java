package kh.edu.app.myproject.lc_luncher;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kh.edu.app.myproject.lc_luncher.DB.DBOperations;

public class LoginActivity extends AppCompatActivity {
    DBOperations mydb;
    EditText Phone_number,password;
    String phone_number,pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mydb=new DBOperations(this);
        Phone_number=(EditText)findViewById(R.id.login_phone_number);
        password=(EditText)findViewById(R.id.login_password);
        login=(Button)findViewById(R.id.btn_login);
        login();
    }
    public void login(){
        login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                    }
                }
        );
    }
    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
