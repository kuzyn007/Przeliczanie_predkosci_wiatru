package com.example.kuzyn.pirat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

    private Pirat pirat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pirat = new Pirat();



        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                TextView obecnie = (TextView) findViewById(R.id.textView2);
                TextView beauforta = (TextView) findViewById(R.id.textView4);
                TextView mph = (TextView) findViewById(R.id.textView5);
                TextView cisza = (TextView) findViewById(R.id.textView6);
                TextView sztorm = (TextView) findViewById(R.id.textView7);

                pirat.ustawAktualnaPredkosc(progressValue);
                obecnie.setText("Obecnie jest: " + progressValue + " km/h");
                beauforta.setText("W skali Beauforta: " + (int) pirat.ileWSkaliBeauforta());
                mph.setText("A także: " + pirat.ileMilMorskichNaGodzine() + " mph");

                if(pirat.czyJestCiszaNaMorzu() == true)
                {
                    cisza.setText("Czy jest cisza: TAK");
                }
                else
                {
                    cisza.setText("Czy jest cisza: NIE");
                }

                if(pirat.czyJestSztorm() == true)
                {
                    sztorm.setText("Czy jest sztorm: TAK");
                }
                else
                {
                    sztorm.setText("Czy jest sztorm: NIE");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
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
