package com.bottomsheet.example.recyclerviewbottomsheetexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SampleFragment extends Fragment {

    private SampleAdapter adapter = new SampleAdapter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btnAddMoreItems).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMoreOnItem();
            }
        });

        ((RecyclerView) view.findViewById(R.id.rclItems)).setAdapter(adapter);
    }

    private void addMoreOnItem() {
        adapter.addItem("Item");
    }
}
