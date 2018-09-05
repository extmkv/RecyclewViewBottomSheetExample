package com.bottomsheet.example.recyclerviewbottomsheetexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.SampleViewHolder> {

    private List<String> mLstItems = new ArrayList<>();

    @NonNull
    @Override
    public SampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView v = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_sample, viewGroup, false);
        return new SampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder holder, int position) {
        holder.mTextView.setText(mLstItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mLstItems.size();
    }

    public void addItem(String item) {
        mLstItems.add(item);
        notifyDataSetChanged();
    }

    static class SampleViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        SampleViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }
}
