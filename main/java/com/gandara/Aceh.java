package com.gandara;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Aceh extends Activity {

    private Button btnNext;
    private Button btnPrevious;
    private int[] layouts;
    private ViewPager viewPager;
    public ViewPagerAdapter viewPagerAdapter;

    ViewPager.OnPageChangeListener viewPagerPageChangeListener =
            new ViewPager.OnPageChangeListener() {

                @Override        public void onPageSelected(int position) {
                    if (position == layouts.length - 1) {
                        btnNext.setVisibility(View.GONE);
                        return;
                    }
                    if (position == layouts.length -3)
                    {
                        btnPrevious.setVisibility(View.GONE);
                        return;
                    }
                    btnNext.setVisibility(View.VISIBLE);
                    btnPrevious.setVisibility(View.VISIBLE);

                }

                @Override        public void onPageScrolled(int arg0, float arg1, int arg2) {

                }

                @Override        public void onPageScrollStateChanged(int arg0) {

                }
            };

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public Object instantiateItem(ViewGroup container, int position) {
            this.layoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = this.layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);
            return view;
        }

        public int getCount() {
            return layouts.length;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_aceh);
        this.viewPager =  findViewById(R.id.view_pager_aceh);
        this.btnPrevious =  findViewById(R.id.btn_previous_aceh);
        this.btnNext = findViewById(R.id.btn_next_aceh);

        layouts = new int[]
                {
                       R.layout.aceh1,
                       R.layout.aceh2,
                       R.layout.aceh3
                };
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

        final ImageView balik = findViewById(R.id.balik_aceh);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void btnNextAceh(View v) {
        int current = getItem(1);
        if (current < this.layouts.length) {
            this.viewPager.setCurrentItem(current);
        }
    }

    public void btnBackPreviousAceh(View v) {
        int current = getItem(-1);
        if (this.layouts.length != getItem(3)) {
            this.viewPager.setCurrentItem(current);
        }
    }


    private int getItem(int i) {
        return this.viewPager.getCurrentItem() + i;
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
