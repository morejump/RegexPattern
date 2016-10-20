package com.example.hp.regex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        String line="Tuần 01 [Từ 15/08/2016 -- Đến 21/08/2016]"; // input string
        String pattern = "\\d{2}/\\d{2}/\\d{4}";// pattern here
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        while (m.find()){
            int i=0;
            Log.d("thaohandsome", "onCreate: "+m.group()+"      "+i);
            i++;
        }

    }
}
