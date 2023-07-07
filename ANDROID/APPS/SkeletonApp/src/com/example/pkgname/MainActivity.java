package com.example.pkgname;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    /**
     * Activity's being created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    /**
     * Activity's about to become visible.
     */
    @Override
    protected void onStart()
    {
        super.onStart();
    }

    /**
     * Activity's become visible (it's now "resumed" / "running").
     */
    @Override
    protected void onResume()
    {
        super.onResume();
    }

    /**
     * Another activity's taking focus...
     * This activity's about to be "paused".
     */
    @Override
    protected void onPause()
    {
        super.onPause();  // App will crash without super call.
    }

    /**
     * Activity's no longer visible (it's "stopped").
     */
    @Override
    protected void onStop()
    {
        super.onStop();
        return;
        //
        // User navigates to the activity -> onRestart() -> onStart().
        //
        // Apps with higher priority need memory -> App process killed ->
        //    -> onCreate()
    }

    /**
     * Activity's about to be destroyed.
     */
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}
