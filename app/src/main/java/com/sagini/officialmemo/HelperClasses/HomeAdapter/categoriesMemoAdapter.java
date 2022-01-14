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

public class categoriesMemoAdapter extends RecyclerView.Adapter<categoriesMemoAdapter.FeaturedViewHolder> {

    public categoriesMemoAdapter(ArrayList<FeaturedHelperClass> categoriesMemo) {
        this.categoriesMemo= categoriesMemo;
    }

    ArrayList<FeaturedHelperClass>categoriesMemo;

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card_design,parent, false);
        FeaturedViewHolder FeaturedViewHolder = new FeaturedViewHolder(view);

        return FeaturedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedHelperClass featuredHelperClass = categoriesMemo.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());


    }

    @Override
    public int getItemCount() {

        return categoriesMemo.size();
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            //Hooks
            image = itemView.findViewById(R.id.imageCategory);
            title = itemView.findViewById(R.id.headCategory);


        }
    }
}
