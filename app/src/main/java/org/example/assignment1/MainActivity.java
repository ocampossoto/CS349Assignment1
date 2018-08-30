package org.example.assignment1;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    RecyclerView Rec_view;
    final ArrayList<String> list_data = new ArrayList<String>();
    final ArrayList<String> rec_data = new ArrayList<String>();
    ArrayAdapter ListAdaapter;
    RecyclerView.Adapter RecyclerAdaapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview =  findViewById(R.id.List_View_Object);
        Rec_view = findViewById(R.id.Rec_View);
        final Button Recycle_View_Button =  findViewById(R.id.RecycleerView_Button);
        final Button List_View_Button =  findViewById(R.id.ListView_button);

        ListAdaapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list_data);
        listview.setAdapter(ListAdaapter);


        List_View_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create_list_View();
                //RecyclerAdaapter.clear();
                //RecyclerAdaapter.notifyDataSetChanged();
            }
        });

        Recycle_View_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListAdaapter.clear();
                ListAdaapter.notifyDataSetChanged();
                create_Recycler_View();

            }
        });


    }


    protected  void create_list_View(){
        ListAdaapter.clear();
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Info_Activity.class);
                final Object item = listview.getAdapter().getItem(i);
                intent.putExtra("Item_Clicked", item.toString());
                startActivity(intent);
            }
        });


        for (int i = 1; i < 20; ++i) {
            list_data.add("Item " + i);
        }

        ListAdaapter.notifyDataSetChanged();

    }

    protected  void create_Recycler_View(){
//        RecyclerAdaapter.clear();
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(MainActivity.this, Info_Activity.class);
//                final Object item = listview.getAdapter().getItem(i);
//                intent.putExtra("Item_Clicked", item.toString());
//                startActivity(intent);
//            }
//        });
//
//
//        for (int i = 1; i < 20; ++i) {
//            list.add("Item " + i);
//        }
//
//        RecyclerAdaapter.notifyDataSetChanged();

    }

}
