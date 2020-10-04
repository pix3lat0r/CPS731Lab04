package com.example.cps731lab04sec01alisonder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    String[] data1;
    String[] data2;
    String[] words;
    int[] images;
    Context context;

    public RecyclerViewAdapter(Context ct, String[] titles, String[] txt, String[]word, int[] img) {
        context = ct;
        data1 = titles;
        data2 = txt;
        words = word;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recipelist, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv1.setText(data1[position]);
        holder.tv2.setText(data2[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ShowRecipeActivity.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", words[position]);
                intent.putExtra("myImage", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        LinearLayout mainLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.titleText);
            tv2 = itemView.findViewById(R.id.descriptionText);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
