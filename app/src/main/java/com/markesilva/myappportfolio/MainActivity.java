package com.markesilva.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        return super.onOptionsItemSelected(item);
    }

    // on click implementations for all buttons
    public void onClickMediaStreamer(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_spotify, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    public void onClickSuperDuo1(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_scores, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    public void onClickSuperDuo2(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_library, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    public void onClickBigger(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_build, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    public void onClickReader(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_reader, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    public void onClickCapstone(View view)
    {
        if (mAppToast != null)
        {
            mAppToast.cancel();
        }

        mAppToast = Toast.makeText(getApplicationContext(), R.string.toast_capstone, Toast.LENGTH_SHORT);
        mAppToast.show();
    }

    private Toast mAppToast;
}
