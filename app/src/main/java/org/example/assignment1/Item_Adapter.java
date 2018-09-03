package org.example.assignment1;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;



public class Item_Adapter extends RecyclerView.Adapter<Item_Adapter.MyViewHolder> {

    private List<Items> ItemList;


    public void clear() {
        ItemList.clear();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView display_data;

        public MyViewHolder(View view) {
            super(view);
            display_data = view.findViewById(R.id.item_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), Info_Activity.class);
                    intent.putExtra("Item_Clicked", display_data.getText() );
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }


    public Item_Adapter(List<Items> itemsList) {
        this.ItemList = itemsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Items The_Item = ItemList.get(position);
        The_Item.setPosition(position);
        holder.display_data.setText(The_Item.getData());

    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }
}