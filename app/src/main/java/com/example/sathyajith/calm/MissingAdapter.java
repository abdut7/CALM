package com.example.sathyajith.calm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MissingAdapter extends RecyclerView.Adapter<MissingAdapter.MyViewHolder>{
    private List<Missingmodel> missingList;
Context ctx;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txname,txage,txinfo,txloc;
        ImageView imgview;

        public MyViewHolder(View view) {
            super(view);
            this.txname=txname;
            this.txage=txage;
            this.txinfo=txinfo;
            this.txloc=txloc;
            this.imgview=imgview;
            txname=(TextView)view.findViewById(R.id.missingname);
            txage = (TextView) view.findViewById(R.id.missingage);
            txinfo = (TextView) view.findViewById(R.id.missinginfo);
            txloc= (TextView) view.findViewById(R.id.missinglocc);
            imgview=(ImageView)view.findViewById(R.id.imgmissing);
        }
    }
    public MissingAdapter(List<Missingmodel> missingList,Context ctx) {
        this.missingList = missingList;
        this.ctx=ctx;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.missingnotice, parent, false);
        Toast.makeText(ctx, "creat", Toast.LENGTH_SHORT).show();
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
             Missingmodel missingitem=missingList.get(position);
             holder.txname.setText(missingitem.getName());
             holder.txage.setText(missingitem.getAge());
             holder.txinfo.setText(missingitem.getInfo());
             holder.txloc.setText(missingitem.getLoc());
        Toast.makeText(ctx, "onbind", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public int getItemCount() {
        return 0;
    }

}
