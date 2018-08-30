package org.example.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Info_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_);

        TextView item = findViewById(R.id.Title);
        String x = getIntent().getStringExtra("Item_Clicked");

        item.setText("You clicked on: " + x);
    }
}
