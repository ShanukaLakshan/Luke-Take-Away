package com.unique.luketakeaway.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.unique.luketakeaway.Domain.UpperDomain;
import com.unique.luketakeaway.R;

import java.util.ArrayList;


public class UpperAdapter extends RecyclerView.Adapter<UpperAdapter.ViewHolder>{

    ArrayList<UpperDomain> upperDomains;

    public UpperAdapter(ArrayList<UpperDomain> upperDomains) {
        this.upperDomains = upperDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_location,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView2.setText(upperDomains.get(position).getTitle());
        holder.textView3.setText(upperDomains.get(position).getDescription());


        int drawbleRecourceId = holder.itemView.getContext().getResources()
                .getIdentifier(upperDomains.get(position).getImageName(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawbleRecourceId).into(holder.mainCategoryImage);

    }

    @Override
    public int getItemCount() { return upperDomains.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView2,textView3;
        ImageView mainCategoryImage;


        public ViewHolder(@NonNull View itemView){
            super(itemView);
            mainCategoryImage = itemView.findViewById(R.id.mainCategoryImage);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);

        }
    }
}
