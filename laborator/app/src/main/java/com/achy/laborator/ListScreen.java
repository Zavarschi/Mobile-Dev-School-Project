package com.achy.laborator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by achy_ on 11/10/2016.
 */

public class ListScreen extends Activity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_screen);
        list  = (ListView) findViewById(R.id.list);
        final String[] items = {"A", "B", "C"};
        list.setAdapter(new ArrayAdapter<String>(ListScreen.this,
                android.R.layout.simple_list_item_1, items));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = items[position];
                Intent in = new Intent(ListScreen.this, ListItemScreen.class);
                in.putExtra("item", item);
                startActivity(in);
            }
        });

    }
}
