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

import java.util.ArrayList;

public class IteamAdapter extends RecyclerView.Adapter<IteamAdapter.MyItemHolder> {
    private ArrayList<Missingmodel> items_list;
    boolean f=false;
    Context ctx;
    final  int done=(R.drawable.cop);

    class  MyItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txname,txage,txinfo,txloc;
        ImageView imgview;
        Context ctx;
        ArrayList<Missingmodel> listitems;

        public MyItemHolder(@NonNull View itemView,Context ctx, ArrayList<Missingmodel> listitems) {
            super(itemView);
            this.ctx=ctx;
            this.txname=txname;
            this.txage=txage;
            this.txinfo=txinfo;
            this.txloc=txloc;
            this.imgview=imgview;
            txname=(TextView)itemView.findViewById(R.id.missingname);
            txage = (TextView)itemView.findViewById(R.id.missingage);
            txinfo = (TextView) itemView.findViewById(R.id.missinginfo);
            txloc= (TextView) itemView.findViewById(R.id.missinglocc);
            imgview=(ImageView)itemView.findViewById(R.id.imgmissing);
            itemView.setClickable(true);
             itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            Toast.makeText(ctx, "creating.......holding", Toast.LENGTH_SHORT).show();

        }
    }

    public IteamAdapter(ArrayList<Missingmodel> items_list,Context ctx) {
        this.items_list = items_list;
        this.ctx=ctx;
      //  Toast.makeText(ctx, "creating......", Toast.LENGTH_SHORT).show();
    }

    @NonNull
    @Override
    public MyItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.missingmodel, viewGroup, false);
     //   Toast.makeText(ctx, "creating", Toast.LENGTH_SHORT).show();
        return new MyItemHolder(itemView,ctx,items_list);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyItemHolder myItemHolder, int i) {
       Missingmodel missingitem=items_list.get(i);

       myItemHolder.txname.setText(missingitem.getName());
      myItemHolder.txage.setText(missingitem.getAge());
       myItemHolder.txinfo.setText(missingitem.getInfo());
       myItemHolder.txloc.setText(missingitem.getLoc());
       myItemHolder.imgview.setImageResource(done);
      // Toast.makeText(ctx, "onbind", Toast.LENGTH_SHORT).show();


    }

    @Override
    public int getItemCount() {
        return items_list.size();
    }

}
