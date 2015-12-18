package com.example.riku.viewpager;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.riku.viewpager.MyPagerAdapter;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);

        //ViewPagerにAdapterをセット
        viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
//        viewPager.setAdapter(new MyPagerAdapter(this));




        //リスナーをセット
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {
                // ページのスワイプ中に呼ばれる
                // position : スクロール中のページ。
                // positionOffset : ドラッグ量（0〜1）
                // positionOffsetPixels : ドラッグされたピクセル数
            }

            @Override
            public void onPageSelected(int position) {
                // 移動先のページが確定された後に呼ばれる。
                // position : 移動先のページ
                Toast.makeText(getApplicationContext(), "selected " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // ページのスクロール状態が通知される。
                // state : ページスクロール状態
                // ViewPager.SCROLL_STATE_IDLE 初期状態。ページスクロール完了後に通知
                // ViewPager.SCROLL_STATE_DRAGGING ドラッグ開始時に通知
                // ViewPager.SCROLL_STATE_SETTLING ドラッグ終了時に通知
            }
        });

    }
}
