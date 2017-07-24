package kh.edu.app.myproject.lc_luncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kh.edu.app.myproject.lc_luncher.DB.DBOperations;

//import static kh.edu.app.myproject.lc_luncher.R.id.reg_user_name;

public class SignupActivity extends AppCompatActivity {
    EditText Eusername,Edob,Egender,EphoneNumber,Epassword;

    DBOperations Mydb;
    Button Reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mydb=new DBOperations(SignupActivity.this);
        setContentView(R.layout.activity_signup);

        Eusername = (EditText) findViewById(R.id.res_username);
        Edob= (EditText) findViewById(R.id.reg_dob);
        Egender= (EditText) findViewById(R.id.reg_gender);
        EphoneNumber= (EditText) findViewById(R.id.reg_phone_number);
        Epassword= (EditText) findViewById(R.id.reg_password);
        Reg=(Button)findViewById(R.id.btn_reg);
        Register();

    }
    public void Register(){
        Reg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean InsData = Mydb.insertData(Eusername.getText().toString(),
                                Edob.getText().toString(),Egender.getText().toString(),
                                EphoneNumber.getText().toString(),Epassword.getText().toString());
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
