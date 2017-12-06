package com.example.lunger.luckpanview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Create by Lunger on 2017/12/6
 */
public class MainActivity extends AppCompatActivity {

    private LuckyPanView mLuckyPanView;
    private boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLuckyPanView = findViewById(R.id.lucky_view);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOpen) {
                    mLuckyPanView.luckyStart(1);
                } else {
                    if (!mLuckyPanView.isShouldEnd()) {
                        mLuckyPanView.luckyEnd();
                    }
                }
                isOpen = !isOpen;
            }
        });
    }

}
