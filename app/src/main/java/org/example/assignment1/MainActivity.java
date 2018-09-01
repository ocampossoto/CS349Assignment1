package org.example.assignment1;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    final ArrayList<String> list_data = new ArrayList<String>();
    ArrayAdapter ListAdaapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview =  findViewById(R.id.List_View_Object); // list view object
        final Button Recycle_View_Button =  findViewById(R.id.RecycleerView_Button); // recycler view button
        final Button List_View_Button =  findViewById(R.id.ListView_button); // list view button

        ListAdaapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list_data);
        listview.setAdapter(ListAdaapter);


        List_View_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create_list_View();

            }
        });

        Recycle_View_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListAdaapter.clear();
                ListAdaapter.notifyDataSetChanged();
                Intent intent = new Intent(MainActivity.this, Recycler_Activity.class);
                startActivity(intent);
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
            list_data.add("ListView Item: " + i);
        }

        ListAdaapter.notifyDataSetChanged();

    }


}

