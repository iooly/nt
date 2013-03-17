
package com.iooly.android.nt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NTActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_nt, menu);
        return true;
    }

}
