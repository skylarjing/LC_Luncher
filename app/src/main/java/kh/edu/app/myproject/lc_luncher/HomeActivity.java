package kh.edu.app.myproject.lc_luncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Recycler View
        RecyclerView rclhometext = (RecyclerView) findViewById(R.id.rclview_food);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rclhometext.setLayoutManager(layoutManager);
        lordHomeTextFromServer();

    }
    private void lordHomeTextFromServer() {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest request=new StringRequest("url", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }



        // Adapter


    }







