package com.unique.luketakeaway.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.unique.luketakeaway.Domain.FoodDomain;
import com.unique.luketakeaway.R;

import java.util.ArrayList;


public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder>{

    ArrayList<FoodDomain> popularDomains;

    public PopularAdapter(ArrayList<FoodDomain> popularDomains) {
        this.popularDomains = popularDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(popularDomains.get(position).getTitle());
        holder.fee.setText(String.valueOf(popularDomains.get(position).getFee()));

        int drawbleRecourceId = holder.itemView.getContext().getResources()
                .getIdentifier(popularDomains.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawbleRecourceId).into(holder.pic);

    }

    @Override
    public int getItemCount() { return popularDomains.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title,fee;
        ImageView addBtn,pic;


        public ViewHolder(@NonNull View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.title);
            fee = itemView.findViewById(R.id.fee);
            pic = itemView.findViewById(R.id.mainCategoryImage);
            addBtn = itemView.findViewById(R.id.addBtn);

        }
    }
}
