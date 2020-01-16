package com.gandara;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class NusaTenggaraTimur extends Activity {

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
        setContentView(R.layout.activity_nusa_tenggara_timur);
        this.viewPager =  findViewById(R.id.view_pager_ntt);
        this.btnPrevious =  findViewById(R.id.btn_previous_ntt);
        this.btnNext = findViewById(R.id.btn_next_ntt);


        final ImageView balik = findViewById(R.id.balik_ntt);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        layouts = new int[]
                {
                        R.layout.nusa_tenggara_timur1,
                        R.layout.nusa_tenggara_timur2,
                        R.layout.nusa_tenggara_timur3
                };
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

    }
    public void btnNextNTT(View v) {
        int current = getItem(1);
        if (current < this.layouts.length) {
            this.viewPager.setCurrentItem(current);
        }
    }

    public void btnBackPreviousNTT(View v) {
        int current = getItem(-1);
        if (this.layouts.length != getItem(3)) {
            this.viewPager.setCurrentItem(current);
        }
    }

    private int getItem(int i) {
        return this.viewPager.getCurrentItem() + i;
    }

    public void onBackPressed() {
        finish();
    }
}
