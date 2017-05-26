package kh.edu.app.myproject.lc_luncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import kh.edu.app.myproject.lc_luncher.DataModel.HomeText;

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

        HomeText[] hometext= loadhometext();


        // Adapter
        HomeAdapter adapter = new HomeAdapter();
        adapter.hometext= hometext;
        rclhometext.setAdapter(adapter);

    }

    private HomeText[] loadhometext(){
        HomeText text1=new HomeText();

        text1.txtFood="ginger";
        text1.txtPrice="R5,000";

        HomeText text2=new HomeText();
        text2.txtFood="brocoli";
        text2.txtPrice="R7,000";
        return new HomeText[]{text1, text2};
    }
    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder>{
        HomeText[] hometext;

        @Override
        public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View homeViewHolderLayout= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_home,parent,false);
            return new HomeViewHolder(homeViewHolderLayout);
            }

        @Override
        public void onBindViewHolder(HomeViewHolder holder, int position) {
            HomeText homeText =hometext[position];
            //holder.imgfood.setImageResource(hometext[position].getImage)
            holder.txtfood.setText(homeText.txtFood);
            holder.txtprice.setText(homeText.txtPrice);
        }

        @Override
        public int getItemCount() {
            return hometext.length;
        }

        class HomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            ImageView imgfood;
            ImageView imgblack;
            TextView txtfood;
            TextView txtprice;

            public HomeViewHolder(View itemView) {
                super(itemView);
                imgfood=(ImageView) itemView.findViewById(R.id.img_food);
                imgblack=(ImageView) itemView.findViewById(R.id.img_black);
                txtfood=(TextView) itemView.findViewById(R.id.txt_food);
                txtprice=(TextView) itemView.findViewById(R.id.txt_price);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                HomeText homeText = hometext[position];

                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                intent.putExtra("title", homeText.txtFood);
                intent.putExtra("price", homeText.txtPrice);

                startActivity(intent);
            }
        }
    }


}
