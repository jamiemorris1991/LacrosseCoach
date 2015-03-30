package com.morrisproductions.jamie.lacrossecoach;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity
{

    DrawerLayout nDrawerLayout;
    ListView nDrawerList;
    ActionBarDrawerToggle nDrawerToggle;
    String[] nDrawerListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
        nDrawerLayout =(DrawerLayout)findViewById(R.id.drawer);
        nDrawerList=(ListView)findViewById(R.id.list);
        nDrawerListItems = getResources().getStringArray(R.array.drawer_list);
        nDrawerList.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nDrawerListItems));
        nDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                int editedPosition = position +1;
                Toast.makeText(MainActivity.this,R.string.warning_message, Toast.LENGTH_SHORT).show();
                nDrawerLayout.closeDrawer(nDrawerList);
            }
        });
        nDrawerToggle = new ActionBarDrawerToggle(this,nDrawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        {
            public void onDrawerClosed(View v)
            {
               super.onDrawerClosed(v);
               invalidateOptionsMenu();
               syncState();
            }
            public void onDrawerOpened(View v)
            {
               super.onDrawerClosed(v);
               invalidateOptionsMenu();
               syncState();
            }
        };
        nDrawerLayout.setDrawerListener(nDrawerToggle);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        nDrawerToggle.syncState();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        nDrawerToggle.syncState();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case android.R.id.home: {
                if (nDrawerLayout.isDrawerOpen(nDrawerList)) nDrawerLayout.closeDrawer(nDrawerList);
                else nDrawerLayout.openDrawer(nDrawerList);
                return true;
            }
            case R.id.action_settings: {
                return true;
            }
            default: return super.onOptionsItemSelected(item);
        }
    }
}
