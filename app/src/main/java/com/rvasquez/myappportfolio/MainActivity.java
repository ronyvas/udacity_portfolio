package com.rvasquez.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchSpotifyStreamer(View view) {
        showToast(getString(R.string.launch_spotify_streamer));
    }

    public void launchScoresApp(View view) {
        showToast(getString(R.string.launch_scores_app));
    }

    public void launchLibraryApp(View view) {
        showToast(getString(R.string.launch_library_app));
    }

    public void launchBuildItBigger(View view) {
        showToast(getString(R.string.launch_build_bigger));
    }

    public void launchXyzReader(View view) {
        showToast(getString(R.string.launch_xyz_reader));
    }

    public void launchCapstone(View view) {
        showToast(getString(R.string.launch_capstone));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
