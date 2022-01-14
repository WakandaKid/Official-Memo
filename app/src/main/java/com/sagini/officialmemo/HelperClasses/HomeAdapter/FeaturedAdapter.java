package com.sagini.officialmemo.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sagini.officialmemo.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredMemo) {
        this.featuredMemo = featuredMemo;
    }

    ArrayList<FeaturedHelperClass>featuredMemo;

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent, false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);

        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedHelperClass featuredHelperClass = featuredMemo.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());


    }

    @Override
    public int getItemCount() {

        return featuredMemo.size();
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            //Hooks
            image = itemView.findViewById(R.id.featured_Image);
            title = itemView.findViewById(R.id.featured_desc);


        }
    }
}
