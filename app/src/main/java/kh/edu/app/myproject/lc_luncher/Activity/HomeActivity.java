package kh.edu.app.myproject.lc_luncher.Activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Adapter;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import kh.edu.app.myproject.lc_luncher.DB.HomeText;
import kh.edu.app.myproject.lc_luncher.R;

public class HomeActivity extends AppCompatActivity {

private DrawerLayout drawerLayout;
   // private HomeAdapter homeTexts;
    private HomeText[] homeTexts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar tlbMain = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(tlbMain);
        getSupportActionBar().setTitle(R.string.app_name);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_main);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, tlbMain, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        // Recycler View
        RecyclerView rclhometext = (RecyclerView) findViewById(R.id.rclview_food);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rclhometext.setLayoutManager(layoutManager);
        lordHomeTextFromServer();
        //HomeAdapter adapter =new HomeAdapter(homeTexts);

        ;
    }
    private void lordHomeTextFromServer() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest("url", new Response.Listener<String>() {
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







