package com.gandara;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AkorMinor extends Activity {
    Dialog dialog;
    SoundPool minor;
    Button aminor;
    Button akresminor;
    Button bminor;
    Button cminor;
    Button ckresminor;
    Button dminor;
    Button dkresminor;
    Button eminor;
    Button fminor;
    Button fkresminor;
    Button gminor;
    Button gkresminor;
    private Button btnNext;
    private Button btnPrevious;
    public TextView[] dots;
    private LinearLayout dotsLayout;
    private int[] layouts;
    int kucing;
    int kucing1;
    int kucing2;
    int kucing3;
    int kucing4;
    int kucing5;
    int kucing6;
    int kucing7;
    int kucing8;
    int kucing9;
    int kucing10;
    int kucing11;
    private ViewPager viewPager;
    public ViewPagerAdapter viewPagerAdapter;

    ViewPager.OnPageChangeListener viewPagerPageChangeListener =
            new ViewPager.OnPageChangeListener() {

                @Override        public void onPageSelected(int position) {
                    addBottomDots(position);
                    if (position == layouts.length - 1) {
                        btnNext.setVisibility(View.GONE);
                        return;
                    }
                    if (position == layouts.length -12)
                    {
                        btnPrevious.setVisibility(View.GONE);
                        return;
                    }
                    AkorMinor.this.btnNext.setVisibility(View.VISIBLE);
                    AkorMinor.this.btnPrevious.setVisibility(View.VISIBLE);

                }

                @Override        public void onPageScrolled(int arg0, float arg1, int arg2) {

                }

                @Override        public void onPageScrollStateChanged(int arg0) {

                }
            };

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public Object instantiateItem(ViewGroup container, int position) {
            this.layoutInflater = (LayoutInflater) AkorMinor.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = this.layoutInflater.inflate(AkorMinor.this.layouts[position], container, false);
            container.addView(view);
            return view;
        }

        public int getCount() {
            return AkorMinor.this.layouts.length;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_akor_minor);
        this.viewPager =  findViewById(R.id.view_pager_minor);
        this.dotsLayout =  findViewById(R.id.layoutDotsminor);
        this.btnPrevious =  findViewById(R.id.btn_previous_minor);
        this.btnNext = findViewById(R.id.btn_next_minor);

        dialog= new Dialog(this);

        this.minor = new SoundPool(0,3,1);

        this.kucing = this.minor.load(this,R.raw.a_minor,1);
        this.kucing1 = this.minor.load(this,R.raw.a_kres_minor,1);
        this.kucing2 = this.minor.load(this,R.raw.b_minor,1);
        this.kucing3 = this.minor.load(this,R.raw.c_minor,1);
        this.kucing4 = this.minor.load(this,R.raw.c_kres_minor,1);
        this.kucing5 = this.minor.load(this,R.raw.d_minor,1);
        this.kucing6 = this.minor.load(this,R.raw.d_kres_minor,1);
        this.kucing7 = this.minor.load(this,R.raw.e_minor,1);
        this.kucing8 = this.minor.load(this,R.raw.f_minor,1);
        this.kucing9 = this.minor.load(this,R.raw.f_kres_minor,1);
        this.kucing10 = this.minor.load(this,R.raw.g_minor,1);
        this.kucing11 = this.minor.load(this,R.raw.g_kres_minor,1);

        this.aminor = findViewById(R.id.bunyi_a_minor);
        this.akresminor=findViewById(R.id.bunyi_akres_minor);
        this.bminor=findViewById(R.id.bunyi_b_minor);
        this.cminor=findViewById(R.id.bunyi_c_minor);
        this.ckresminor=findViewById(R.id.bunyi_ckres_minor);
        this.dminor=findViewById(R.id.bunyi_d_minor);
        this.dkresminor=findViewById(R.id.bunyi_dkres_minor);
        this.eminor=findViewById(R.id.bunyi_e_minor);
        this.fminor=findViewById(R.id.bunyi_f_minor);
        this.fkresminor=findViewById(R.id.bunyi_fkres_minor);
        this.gminor=findViewById(R.id.bunyi_g_minor);
        this.gkresminor=findViewById(R.id.bunyi_gkres_minor);

        this.layouts =new int[]
                {
                        R.layout.activity_aminor,
                        R.layout.activity_akresminor,
                        R.layout.activity_bminor,
                        R.layout.activity_cminor,
                        R.layout.activity_ckresminor,
                        R.layout.activity_dminor,
                        R.layout.activity_dkresminor,
                        R.layout.activity_eminor,
                        R.layout.activity_fminor,
                        R.layout.activity_fkresminor,
                        R.layout.activity_gminor,
                        R.layout.activity_gkresminor
                };
        addBottomDots(0);
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

        final ImageView balik = findViewById(R.id.balikminor);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                minor.stop(kucing);
                minor.stop(kucing1);
                minor.stop(kucing2);
                minor.stop(kucing3);
                minor.stop(kucing4);
                minor.stop(kucing5);
                minor.stop(kucing6);
                minor.stop(kucing7);
                minor.stop(kucing8);
                minor.stop(kucing9);
                minor.stop(kucing10);
                minor.stop(kucing11);
                finish();
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        minor.stop(kucing);
        minor.stop(kucing1);
        minor.stop(kucing2);
        minor.stop(kucing3);
        minor.stop(kucing4);
        minor.stop(kucing5);
        minor.stop(kucing6);
        minor.stop(kucing7);
        minor.stop(kucing8);
        minor.stop(kucing9);
        minor.stop(kucing10);
        minor.stop(kucing11);
        super.onUserLeaveHint();
    }

    public void bunyiAminor (View v)
    {
        this.minor.play(this.kucing,1,1,0,0,1);
    }

    public void bunyiAkresminor (View v)
    {
        this.minor.play(this.kucing1,1,1,0,0,1);
    }

    public void bunyiBminor (View v)
    {
        this.minor.play(this.kucing2,1,1,0,0,1);
    }

    public void bunyiCminor (View v)
    {
        this.minor.play(this.kucing3,1,1,0,0,1);
    }

    public void bunyiCkresminor (View v)
    {
        this.minor.play(this.kucing4,1,1,0,0,1);
    }

    public void bunyiDminor (View v)
    {
        this.minor.play(this.kucing5,1,1,0,0,1);
    }

    public void bunyiDkresminor (View v)
    {
        this.minor.play(this.kucing6,1,1,0,0,1);
    }

    public void bunyiEminor (View v)
    {
        this.minor.play(this.kucing7,1,1,0,0,1);
    }

    public void bunyiFminor (View v)
    {
        this.minor.play(this.kucing8,1,1,0,0,1);
    }

    public void bunyiFkresminor (View v)
    {
        this.minor.play(this.kucing9,1,1,0,0,1);
    }

    public void bunyiGminor (View v)
    {
        this.minor.play(this.kucing10,1,1,0,0,1);
    }

    public void bunyiGkresminor (View v)
    {
        this.minor.play(this.kucing11,1,1,0,0,1);
    }

    public void btnNext(View v) {
        int current = getItem(1);
        if (current < this.layouts.length) {
            this.viewPager.setCurrentItem(current);
        }
    }

    public void btnBackPrevious(View v) {
        int current = getItem(-1);
        if (this.layouts.length != getItem(12)) {
            this.viewPager.setCurrentItem(current);
        }
    }

    public void Titit (View v){
        Button close;
        dialog.setContentView(R.layout.popup_akor);
        close=dialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    private void addBottomDots(int currentPage) {
        this.dots = new TextView[this.layouts.length];
        this.dotsLayout.removeAllViews();
        for (int i = 0; i < this.dots.length; i++) {
            this.dots[i] = new TextView(this);
            this.dots[i].setText(Html.fromHtml("&#8226;"));
            this.dots[i].setTextSize(35.0f);
            this.dots[i].setTextColor(getResources().getColor(R.color.dot_dark_screen_baru1));
            this.dotsLayout.addView(this.dots[i]);
        }
        if (this.dots.length > 0) {
            this.dots[currentPage].setTextColor(getResources().getColor(R.color.dot_light_screen_baru1));
        }
    }

    private int getItem(int i) {
        return this.viewPager.getCurrentItem() + i;
    }

    public void onBackPressed() {

        minor.stop(kucing);
        minor.stop(kucing1);
        minor.stop(kucing2);
        minor.stop(kucing3);
        minor.stop(kucing4);
        minor.stop(kucing5);
        minor.stop(kucing6);
        minor.stop(kucing7);
        minor.stop(kucing8);
        minor.stop(kucing9);
        minor.stop(kucing10);
        minor.stop(kucing11);
        finish();
    }
}
