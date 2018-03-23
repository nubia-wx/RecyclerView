package com.example.wx.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wx on 2018/3/23.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder>{

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name;

        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.recycler_img);
            name = view.findViewById(R.id.recycler_name);
        }
    }

    private List<TestBean> mBeanList;

    public MyRecyclerAdapter(List<TestBean> arrayList) {
        this.mBeanList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        viewHolder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TestBean bean = mBeanList.get(position);
        holder.image.setImageResource(bean.getImgId());
        holder.name.setText(bean.getName());
    }

    @Override
    public int getItemCount() {
        return mBeanList.size();
    }
}
