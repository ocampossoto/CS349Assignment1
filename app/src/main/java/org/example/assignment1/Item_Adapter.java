package org.example.assignment1;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;


public class Item_Adapter extends RecyclerView.Adapter<Item_Adapter.MyViewHolder> {

    private List<Items> ItemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView display_data;

        public MyViewHolder(View view) {
            super(view);
            display_data = (TextView) view.findViewById(R.id.item_view);

        }
    }


    public Item_Adapter(List<Items> itemsList) {
        this.ItemList = itemsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Items The_Item = ItemList.get(position);
        holder.display_data.setText(The_Item.getData());

    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }
}