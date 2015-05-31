package nanodegree.shanmugavel.com.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class LandingPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_landing_page, menu);
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

    /**
     * Trigerred when button corresponding to "Spotify Streamer".
     * @param v - view
     */
    public void showSpotifyStreamer(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
    }

    /**
     * Trigerred when button corresponding to "Scores".
     * @param v - view
     */
    public void showScoresApp(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my Scores app!", Toast.LENGTH_LONG).show();
    }

    /**
     * Trigerred when button corresponding to "Library".
     * @param v - view
     */
    public void showLibraryApp(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my Library app!", Toast.LENGTH_LONG).show();
    }

    /**
     * Trigerred when button corresponding to "Build It Bigger".
     * @param v - view
     */
    public void showBuildItBigger(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my Build It Bigger app!", Toast.LENGTH_LONG).show();
    }

    /**
     * Trigerred when button corresponding to "XYZ Reader".
     * @param v - view
     */
    public void showXYZReader(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my XYZ Reader app!", Toast.LENGTH_LONG).show();
    }

    /**
     * Trigerred when button corresponding to "Capstone".
     * @param v - view
     */
    public void showCapstone(View v)  {
        Context context = getApplicationContext();
        Toast.makeText(context, "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
    }
}
