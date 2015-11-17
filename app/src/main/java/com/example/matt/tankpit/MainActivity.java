package com.example.matt.tankpit;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    // private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button2);//login
        Button b3 = (Button) findViewById(R.id.button3);//news
        Button b4 = (Button) findViewById(R.id.button4);//BB
        Button b5 = (Button) findViewById(R.id.button5);//tourny time
        Button b = (Button) findViewById(R.id.button);//tourny win
        Button b6 = (Button) findViewById(R.id.button6);//award wins
        Button b7 = (Button) findViewById(R.id.button7);//t25
        Button b8 = (Button) findViewById(R.id.button8);//play
        Button b9 = (Button) findViewById(R.id.button9);//sets

        b1.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    //@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent intent2 = new Intent(getApplicationContext(), Login.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(getApplicationContext(), News.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(getApplicationContext(), BB.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(getApplicationContext(), Times.class);
                startActivity(intent5);
                break;
            case R.id.button:
                Intent intent = new Intent(getApplicationContext(), TWinners.class);
                startActivity(intent);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(getApplicationContext(), AWinners.class);
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(getApplicationContext(), Top25.class);
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(getApplicationContext(), Play.class);
                startActivity(intent8);
                break;
            case R.id.button9:
                Intent intent9 = new Intent(getApplicationContext(), Settings.class);
                startActivity(intent9);
                break;
        }

    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
