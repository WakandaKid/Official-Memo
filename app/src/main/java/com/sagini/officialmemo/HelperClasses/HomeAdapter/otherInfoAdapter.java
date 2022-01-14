package com.sagini.officialmemo.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sagini.officialmemo.R;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class otherInfoAdapter extends RecyclerView.Adapter<otherInfoAdapter.FeaturedViewHolder> {

    public otherInfoAdapter(ArrayList<FeaturedHelp> otherInfo) {
        this.otherInfo= otherInfo;
    }

    ArrayList<FeaturedHelp>otherInfo;

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_other_important_memo,parent, false);
        FeaturedViewHolder FeaturedViewHolder = new FeaturedViewHolder(view);

        return FeaturedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedHelp featuredHelp = otherInfo.get(position);
        holder.title.setText(featuredHelp.getTitle());
        holder.titleOne.setText(featuredHelp.getTitleOne());


    }

    @Override
    public int getItemCount() {

        return otherInfo.size();
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{
        TextView title,titleOne;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
            //Hooks
            titleOne= itemView.findViewById(R.id.titleOne);
            title = itemView.findViewById(R.id.otherTitle);


        }
    }
}
