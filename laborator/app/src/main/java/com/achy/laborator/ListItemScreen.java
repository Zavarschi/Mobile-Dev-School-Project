package com.achy.laborator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by achy_ on 11/10/2016.
 */

public class ListItemScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_screen);
        TextView item_text = (TextView) findViewById(R.id.item_text);
        Intent in = getIntent();
        String item = in.getStringExtra("item");
        item_text.setText(item);
    }
}
