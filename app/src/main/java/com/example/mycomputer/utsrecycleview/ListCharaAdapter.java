package com.example.mycomputer.utsrecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCharaAdapter extends RecyclerView.Adapter<ListCharaAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Anichara> listAnichara;

    public ListCharaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Anichara> getListAnichara() {
        return listAnichara;
    }

    public void setListAnichara(ArrayList<Anichara> listAnichara) {
        this.listAnichara = listAnichara;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_anichara, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }
    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListAnichara().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListAnichara().get(position).getRemarks());
        Glide.with(context)
                .load(getListAnichara().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }
    @Override
    public int getItemCount() {
        return getListAnichara().size();
    }
    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
