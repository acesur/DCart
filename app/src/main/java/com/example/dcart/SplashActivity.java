package com.example.dcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView mButtonClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
        mButtonClose = (ImageView) findViewById(R.id.splash_close);
        mButtonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        startAnimation();
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent1 = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent1);
                    finish();
                }

            }
        };
        timerThread.start();
        startAnimation();
    }
    private void startAnimation(){
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.move);
        anim.reset();
        ImageView l = (ImageView) findViewById(R.id.splash_cart);
        l.clearAnimation();
        l.startAnimation(anim);
    }
}
