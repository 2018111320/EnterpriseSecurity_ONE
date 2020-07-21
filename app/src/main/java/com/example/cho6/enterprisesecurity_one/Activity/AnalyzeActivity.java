package com.example.cho6.enterprisesecurity_one.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.cho6.enterprisesecurity_one.R;

public class AnalyzeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //이 페이지만 액션바 숨김
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_analyze);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 3000);
    }
    private class splashhandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), ResultActivity.class));
            AnalyzeActivity.this.finish();
        }
    }

    @Override
    public void onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }
}