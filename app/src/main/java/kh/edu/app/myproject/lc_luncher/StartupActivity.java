package kh.edu.app.myproject.lc_luncher;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startHomeActivity();
                finish();
            }
        },2000);
    }
    private  void  startHomeActivity(){
        Intent HomeIntent = new Intent(this,HomeActivity.class);
        startActivity(HomeIntent);
    }
}
