package com.example.folder2021.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.folder2021.model.Contact;

import java.util.List;

public class Recyclerviewadapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    private Context context;
    private List<Contact> contactList ;

    public Recyclerviewadapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }
// there is another contact for contact provider




    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }

//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
//
//    }


//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//
//    }



    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
