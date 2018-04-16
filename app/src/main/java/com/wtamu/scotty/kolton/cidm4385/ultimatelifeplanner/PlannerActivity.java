package com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ealen.yahoo.weather.YahooAPI;

public class PlannerActivity extends AppCompatActivity {

   // private static final String TAG = "MainActivity";

    private Button btn;
    private Button btn1;
    private Button addAct;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

       // Intent incoming = getIntent();
        // Yahoo Weather API API is from https://github.com/Ealenn/YahooWeather-API-Android
        // default location is Amarillo

        YahooAPI Yahoo = new YahooAPI("Amarillo Texas");

        String text = "";

        try {
            Yahoo.syncData();


            text +=
                    ">> Condition\n" +
                            //"Date : " + Yahoo.Condition().getDate() + "\n" +
                            "Temp : " + Yahoo.Condition().getTemp() + " °F\n" +
                            "Currently " + Yahoo.Condition().getText() + "\n";

            //text +=
            //        ">> Wind\n" +
            //                "Chill : " + Yahoo.Wind().getChill() + "\n" +
            //                "Direction : " + Yahoo.Wind().getDirection() + "\n" +
            //                "Speed : " + Yahoo.Wind().getSpeed() + " mph \n";

            //text += "----------------------\n";
            //for(int i = 0; i < Yahoo.ListForecast().size(); i++){
            //    text +=
            //            "Forecast n° " + String.valueOf(i) + " : " + Yahoo.ListForecast().get(i).getDate() + "\n" +
            //                    "Text : " + Yahoo.ListForecast().get(i).getText() + "\n" +
            //                    "High : " + Yahoo.ListForecast().get(i).getHigh() + " °F\n" +
            //                    "Low : " + Yahoo.ListForecast().get(i).getLow() + " °F\n";
            //}
            text +=
                    ">> Day Time\n" +
                            "Sunrise : " + Yahoo.Astronomy().getSunrise() + "\n" +
                            "Sunset : " + Yahoo.Astronomy().getSunset() + "\n";
        } catch (Exception e) {
            text = "Error!";
        }


        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(text);
    }
}