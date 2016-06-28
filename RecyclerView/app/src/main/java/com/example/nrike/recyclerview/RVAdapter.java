package com.example.nrike.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nrike on 28/06/16.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Items> {

    //Class to load view elements
    //RecyclerView.Adapter<RVAdapter.Items>    ---->       public static class Items extends RecyclerView.ViewHolder
    public static class Items extends RecyclerView.ViewHolder{

        TextView txtid;
        TextView txtname;
        TextView txtdeveloper;

        public Items(View itemView) {
            super(itemView);

            txtid = (TextView) itemView.findViewById(R.id.txtid);
            txtname = (TextView) itemView.findViewById(R.id.txtname);
            txtdeveloper = (TextView) itemView.findViewById(R.id.txtdeveloper);

        }
    }

    //COnstructor to load objects
    List<Object> objects;

    public RVAdapter(List<Object> objects) {
        this.objects = objects;
    }

    //RecyclerViewAdapter
    @Override
    public Items onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        //Take load elements and introduce in a list
        Items items = new Items(v);
        return items;
    }

    @Override
    public void onBindViewHolder(Items holder, int position) {

        Object object = objects.get(position);

        holder.txtid.setText(object.id);
        holder.txtname.setText(object.name);
        holder.txtdeveloper.setText(object.developerType);

    }

    //Count all elementos of list
    @Override
    public int getItemCount() {
        return objects.size();
    }





}
