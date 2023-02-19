package com.unique.luketakeaway.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.unique.luketakeaway.Domain.MainItemDomain;
import com.unique.luketakeaway.R;

import java.util.ArrayList;


public class MainItemAdapter extends RecyclerView.Adapter<MainItemAdapter.ViewHolder>{

    ArrayList<MainItemDomain> mainItemDomain;

    public MainItemAdapter(ArrayList<MainItemDomain> mainItemDomain) {
        this.mainItemDomain = mainItemDomain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_main_item,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView10.setText(mainItemDomain.get(position).getTitle());
        holder.textView13.setText(mainItemDomain.get(position).getStatus());
        holder.textView15.setText(mainItemDomain.get(position).getDescription());
        holder.textView17.setText("$"+mainItemDomain.get(position).getPrice());

    }

    @Override
    public int getItemCount() { return mainItemDomain.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView10,textView13,textView15,textView17;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textView10 = itemView.findViewById(R.id.textView10);
            textView13 = itemView.findViewById(R.id.textView13);
            textView15 = itemView.findViewById(R.id.textView15);
            textView17 = itemView.findViewById(R.id.textView17);

        }
    }
}
