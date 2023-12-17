package com.example.weconnect;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent intent;
                intent = new Intent(SplashActivity.this, FirstActivity.class);
                startActivity(intent);

                // Close this activity

            }
        }, SPLASH_TIME_OUT);
    }
}
