package kh.edu.app.myproject.lc_luncher.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kh.edu.app.myproject.lc_luncher.DB.DBOperations;
import kh.edu.app.myproject.lc_luncher.R;

import static kh.edu.app.myproject.lc_luncher.R.id.reg_user_name;

public class SignupActivity extends AppCompatActivity {
    EditText EUsername, EDob, EGender, EPhoneNumber, EPassword;

    DBOperations Mydb;
    Button Reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Mydb=new DBOperations(this);
        EUsername = (EditText) findViewById(reg_user_name);
        EDob= (EditText) findViewById(R.id.reg_DOB);
        EGender= (EditText) findViewById(R.id.reg_gender);
        EPhoneNumber= (EditText) findViewById(R.id.reg_phone_number);
        EPassword= (EditText) findViewById(R.id.reg_password);
        Reg=(Button)findViewById(R.id.btn_reg);
        Register();

    }
    public void Register(){
        Reg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean InsData = Mydb.insertData(EUsername.getText().toString(),
                                EDob.getText().toString(),EGender.getText().toString(),
                                EPhoneNumber.getText().toString(),EPassword.getText().toString());
                        if(InsData==true){
                            Toast.makeText(SignupActivity.this ,"Register Successful",Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(SignupActivity.this, "Register isn't successful", Toast.LENGTH_LONG).show();
                        }

                    }
                }

        );
    }
}