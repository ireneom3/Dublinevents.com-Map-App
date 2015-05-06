package com.dublin.threeasians.dublineventsmap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * mkyong.com | November 29, 2011
 * updated by Ireneo on 06/05/2015.
 */
public class StartScreen extends Activity {

    private Spinner spinnerFind;
    private Button btnFind;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        loadWidgets();
    }

    /**
     * load widgets from layout xml file
     */
    public void loadWidgets() {
        spinnerFind = (Spinner) findViewById(R.id.spinnerFind);
        btnFind = (Button) findViewById(R.id.btnFind);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);

        return false;
    }

    /**
     * Starts map depending on the item selected from the spinner ( spinnerFind ).
     *
     * @param view - XML fileOnClickListener interface requires a parameter of
     *             type View.
     */
    public void find(View view) {
        Toast.makeText(this, "Finding...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, map.class);
        intent.putExtra("Find", spinnerFind.getLastVisiblePosition());
        startActivity(intent);
    }
}