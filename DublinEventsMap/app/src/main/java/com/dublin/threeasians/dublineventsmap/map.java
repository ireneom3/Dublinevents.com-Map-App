package com.dublin.threeasians.dublineventsmap;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;


@SuppressWarnings("deprecation")
public class map extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        loadSelectedItem();

    }

    /**
     * get the bundled activity from the start screen
     */
    private void loadSelectedItem() {
        Bundle b = getIntent().getExtras();
        int find = b.getInt("Find");
        loadCustomMap(find);

    }

    /**
     * Loads customized map created in google map
     *
     * @param find : the item selected from the starting screen
     */
    private void loadCustomMap(int find) {
        WebView browser = (WebView) findViewById(R.id.webview);
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);

        switch (find) {
            case 0://Hotels
                Toast.makeText(this, "Hotels", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 1://Car Hire Dublin
                Toast.makeText(this, "Car Hire Dublin", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 2://Food & Drink
                Toast.makeText(this, "Food & Drink", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 3://Events
                Toast.makeText(this, "Events", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 4://Entertainment Dublin
                Toast.makeText(this, "Entertainment Dublin", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 5://Tourist Information
                Toast.makeText(this, "Tourist Information", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 6://Deals and Competitions
                Toast.makeText(this, "Deals and Competitions", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            case 7://Explore Ireland
                Toast.makeText(this, "Explore Ireland", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                browser.loadUrl("https://www.google.com/maps/d/viewer?mid=zdRKzgGPNUmk.kqdobSrDcLsE");
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
