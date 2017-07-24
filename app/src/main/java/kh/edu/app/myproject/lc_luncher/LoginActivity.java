package kh.edu.app.myproject.lc_luncher;

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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    DBOperations mydb;
    EditText edt_phone,edt_password;
    String phone_number,pass;
    Button btn_login, btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mydb=new DBOperations(this);
        edt_phone=(EditText)findViewById(R.id.login_phone_number);
        edt_password=(EditText)findViewById(R.id.login_password);
        btn_login=(Button)findViewById(R.id.btn_login);
        btn_signup=(Button)findViewById(R.id.btn_signup);
        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);
    }
//    public void login(){
//        final String phoneNumber = edt_phone.getText().toString();
//        final String password = edt_password.getText().toString();
//        login.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (phoneNumber=="123" && password=="123"){
//                            LoginSucces();
//                        }
//                        else{
//                            Toast toast = new Toast(LoginActivity.this);
//                            toast.setText("Login Fail");
//                        }
//
//                    }
//                }
//        );
//    }
    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void LoginSucces(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    private void SingUp(){
        Intent intent = new Intent(this,SignupActivity.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn_login) {
            String phoneNumber = edt_phone.getText().toString();
            String password = edt_password.getText().toString();
            Log.d("Lc", "Login info: " + phoneNumber + ' ' + password);

            if (phoneNumber.equals("lc") && password.equals("lc")) {
                LoginSucces();
            } else {
                Log.d("Lc", "Login Fail");
            }
        }
        else {
            Log.d("Lc", "SignUp");
            SingUp();
        }
    }
}
