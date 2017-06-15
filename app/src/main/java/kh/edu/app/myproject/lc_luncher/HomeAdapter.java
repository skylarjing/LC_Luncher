package kh.edu.app.myproject.lc_luncher;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kh.edu.app.myproject.lc_luncher.DataModel.HomeText;

/**
 * Created by Mork Pin on 6/6/2017.
 */



public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<HomeText> homeTexts;

    public HomeAdapter(List<HomeText> homeTexts) {
        this.homeTexts = homeTexts;
    }

    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_home,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);// return new ViewHolder(v);
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(HomeAdapter.ViewHolder holder, int position) {
        HomeText homeText=homeTexts.get(position);




    }

    @Override
    public int getItemCount() {

        return homeTexts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_food;
        public TextView txt_price;
        public ImageView img_food;
        public ImageView img_black;
        public ViewHolder(View itemView) {
            super(itemView);
            txt_food=(TextView)itemView.findViewById(R.id.txt_food);
            txt_price=(TextView)itemView.findViewById(R.id.txt_price);
            img_food= (ImageView) itemView.findViewById(R.id.img_food);
            img_black= (ImageView) itemView.findViewById(R.id.img_black);

        }
    }
}
