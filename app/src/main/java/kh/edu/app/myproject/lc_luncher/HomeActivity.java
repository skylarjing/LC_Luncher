package kh.edu.app.myproject.lc_luncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Recycler View
        RecyclerView rclCourses = (RecyclerView) findViewById(R.id.rclview_food);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rclCourses.setLayoutManager(layoutManager);



        // Adapter

    }

}
