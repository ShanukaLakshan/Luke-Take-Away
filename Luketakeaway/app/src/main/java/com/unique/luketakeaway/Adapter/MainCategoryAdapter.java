package com.unique.luketakeaway.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.unique.luketakeaway.Domain.*;
import com.unique.luketakeaway.R;

import java.util.ArrayList;


public class MainCategoryAdapter extends RecyclerView.Adapter<MainCategoryAdapter.ViewHolder>{

    ArrayList<MainCategoryDomain> mainCategoryDomain;

    public MainCategoryAdapter(ArrayList<MainCategoryDomain> mainCategoryDomain) {
        this.mainCategoryDomain = mainCategoryDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_main_category_item,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mainCategoryName.setText(mainCategoryDomain.get(position).getItemName());

        int drawbleRecourceId = holder.itemView.getContext().getResources()
                .getIdentifier(mainCategoryDomain.get(position).getItemImageName(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawbleRecourceId).into(holder.mainCategoryImage);
    }

    @Override
    public int getItemCount() { return mainCategoryDomain.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mainCategoryName;
        ImageView mainCategoryImage;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            mainCategoryName = itemView.findViewById(R.id.mainCategoryName);
            mainCategoryImage = itemView.findViewById(R.id.mainCategoryImage);

        }
    }
}
