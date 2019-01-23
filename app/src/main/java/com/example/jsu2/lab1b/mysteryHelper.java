package com.example.jsu2.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.*;

public class mysteryHelper extends AppCompatActivity {

    public ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery_helper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void fillPlotWheel() {
        list.add("you get knocked out");
        list.add("you go somewhere else");
        list.add("you find a dead man");
        list.add("you find a dead woman");
        list.add("you meet a buxom blonde");
        list.add("someone has searched the place");
        list.add("a crooked cop warns you");
        list.add("you are arrested");
        list.add("you find a gun");
        list.add("you find a knife");
        list.add("you find a frayed rope");
        list.add("a bullet whizzes past your ear!");
        list.add("you are almost run over");
        list.add("you are being followed");
        list.add("you smell a familiar perfume");
        list.add("the telephone rings");
        list.add("there is a knock at the door");
        list.add("you hear footsteps behind you ...");
        list.add("you hear a gunshot!");
        list.add("you hear a scream!");
        list.add("you are not alone ...");
        list.add("... forget this story, it stinks!");
    }

    public void getHelpClicked(View v) {
        TextView t = (TextView) findViewById(R.id.helpLabel);
        if(list.isEmpty()) {
            fillPlotWheel();
        }
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        t.setText(list.get(index));
        list.remove(index);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mystery_helper, menu);
        return true;
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
