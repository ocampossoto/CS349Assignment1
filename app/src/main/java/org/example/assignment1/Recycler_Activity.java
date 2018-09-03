package org.example.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Recycler_Activity extends AppCompatActivity {
    private List<Items> itemsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Item_Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_);
        recyclerView = (RecyclerView) findViewById(R.id.Recycler_view);

        mAdapter = new Item_Adapter(itemsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareData();

    }

    private void prepareData() {
        for(int i = 1; i <= 50; i++){
            itemsList.add(new Items("Recycler item: "+ i));

        }
        mAdapter.notifyDataSetChanged();
    }
}
