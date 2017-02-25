package com.example.admin.recylerview;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 2/24/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    ArrayList<Student> Al=new ArrayList<>();
    int res;
    Activity obj;

    MyAdapter(Activity obj,int res,ArrayList<Student> Al)
    {
        this.Al=Al;
        this.obj=obj;
        this.res=res;
    }

    @Override
    public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(obj).inflate(res,parent,false);

        MyHolder holder=new MyHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {

        Student s=Al.get(position);
        holder.textView.setText(s.getName());
        holder.imageView.setImageResource(s.getImg());

    }

    @Override
    public int getItemCount() {
        return Al.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageView;
        TextView textView;

        public MyHolder(View itemView) {
            super(itemView);

            cardView= (CardView) itemView.findViewById(R.id.cv1);
            imageView= (ImageView) itemView.findViewById(R.id.iv_crd);
            textView= (TextView) itemView.findViewById(R.id.tv_cr);
        }
    }
}
