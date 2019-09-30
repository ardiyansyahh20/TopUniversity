package com.ardi.topuniversity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListUniversityAdapter extends RecyclerView.Adapter<ListUniversityAdapter.ViewHolder> {

    private ArrayList<University> listUniversity;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListUniversityAdapter(ArrayList<University> list) {
        this.listUniversity = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_university, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final University university = listUniversity.get(position);
        holder.tvName.setText(university.getNamaUniv());
        holder.tvAlamat.setText(university.getAlamatUniv());
        Glide.with(holder.itemView.getContext())
                .load(university.getLogoUniv())
                .apply(new RequestOptions()).override(75, 75)
                .into(holder.imgLogo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(university);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listUniversity.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView tvName, tvAlamat;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvAlamat = itemView.findViewById(R.id.tv_item_alamat);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(University data);
    }
}
