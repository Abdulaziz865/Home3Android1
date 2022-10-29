package com.example.homea1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListOfNameAdapter extends RecyclerView.Adapter<ListOfNameAdapter.ViewHolder> {

    private List<String> listOfName;

    public void setData(List<String> listOfName) {
        this.listOfName = listOfName;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.onBind(listOfName.get(position));
    }

    @Override
    public int getItemCount() {
        return listOfName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;

        public ViewHolder(@NonNull View view) {
            super(view);
            tvName = view.findViewById(R.id.tv_text);
        }

        public void onBind(String name) {
            tvName.setText(name);
        }
    }
}