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

public class Akor7 extends Activity {
    Dialog dialog;
    SoundPool tujuh;
    Button a7;
    Button akres7;
    Button b7;
    Button c7;
    Button ckres7;
    Button d7;
    Button dkres7;
    Button e7;
    Button f7;
    Button fkres7;
    Button g7;
    Button gkres7;
    private Button btnNext;
    private Button btnPrevious;
    public TextView[] dots;
    private LinearLayout dotsLayout;
    private int[] layouts;
    int violence;
    int violence1;
    int violence2;
    int violence3;
    int violence4;
    int violence5;
    int violence6;
    int violence7;
    int violence8;
    int violence9;
    int violence10;
    int violence11;
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
                    Akor7.this.btnNext.setVisibility(View.VISIBLE);
                    Akor7.this.btnPrevious.setVisibility(View.VISIBLE);

                }

                @Override        public void onPageScrolled(int arg0, float arg1, int arg2) {

                }

                @Override        public void onPageScrollStateChanged(int arg0) {

                }
            };

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public Object instantiateItem(ViewGroup container, int position) {
            this.layoutInflater = (LayoutInflater) Akor7.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = this.layoutInflater.inflate(Akor7.this.layouts[position], container, false);
            container.addView(view);
            return view;
        }

        public int getCount() {
            return Akor7.this.layouts.length;
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
        setContentView(R.layout.activity_akor7);
        this.viewPager =  findViewById(R.id.view_pager_7);
        this.dotsLayout =  findViewById(R.id.layoutDots7);
        this.btnPrevious =  findViewById(R.id.btn_previous_7);
        this.btnNext = findViewById(R.id.btn_next_7);
        dialog = new Dialog(this);

        this.tujuh = new SoundPool(0,3,1);

        this.violence = this.tujuh.load(this,R.raw.a_7,1);
        this.violence1 = tujuh.load(this,R.raw.a_kres_7,1);
        this.violence2 = this.tujuh.load(this,R.raw.b_7,1);
        this.violence3 = this.tujuh.load(this,R.raw.c_7,1);
        this.violence4 = this.tujuh.load(this,R.raw.c_kres_7,1);
        this.violence5 = this.tujuh.load(this,R.raw.d_7,1);
        violence7 = tujuh.load(this,R.raw.d_kres_7,1);
        violence9 = tujuh.load(this,R.raw.f_kres_7,1);
        violence11 = tujuh.load(this,R.raw.g_kres_7,1);
        this.violence6 = this.tujuh.load(this,R.raw.e_7,1);
        this.violence8 = this.tujuh.load(this,R.raw.f_7,1);
        this.violence10 = this.tujuh.load(this,R.raw.g_7,1);

        this.a7=findViewById(R.id.bunyi_a7);
        akres7=findViewById(R.id.bunyi_a_kres7);
        this.b7=findViewById(R.id.bunyi_b7);
        this.c7=findViewById(R.id.bunyi_c7);
        ckres7=findViewById(R.id.bunyi_c_kres_7);
        this.d7=findViewById(R.id.bunyi_d7);
        dkres7=findViewById(R.id.bunyi_d_kres_7);
        this.e7=findViewById(R.id.bunyi_e7);
        this.f7=findViewById(R.id.bunyi_f7);
        fkres7=findViewById(R.id.bunyi_f_kres7);
        this.g7=findViewById(R.id.bunyi_g7);
        gkres7=findViewById(R.id.bunyi_g_kres7);

        this.layouts =new int[]
                {
                        R.layout.activity_a7,
                        R.layout.activity_akres7,
                        R.layout.activity_b7,
                        R.layout.activity_c7,
                        R.layout.activity_ckres7,
                        R.layout.activity_d7,
                        R.layout.activity_dkres7,
                        R.layout.activity_e7,
                        R.layout.activity_f7,
                        R.layout.activity_fkres7,
                        R.layout.activity_g7,
                        R.layout.activity_gkres7

                };
        addBottomDots(0);
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

        final ImageView balik = findViewById(R.id.balik7);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tujuh.stop(violence);
                tujuh.stop(violence1);
                tujuh.stop(violence2);
                tujuh.stop(violence3);
                tujuh.stop(violence4);
                tujuh.stop(violence5);
                tujuh.stop(violence6);
                tujuh.stop(violence7);
                tujuh.stop(violence8);
                tujuh.stop(violence9);
                tujuh.stop(violence10);
                tujuh.stop(violence11);
                finish();
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        tujuh.stop(violence);
        tujuh.stop(violence1);
        tujuh.stop(violence2);
        tujuh.stop(violence3);
        tujuh.stop(violence4);
        tujuh.stop(violence5);
        tujuh.stop(violence6);
        tujuh.stop(violence7);
        tujuh.stop(violence8);
        tujuh.stop(violence9);
        tujuh.stop(violence10);
        tujuh.stop(violence11);
        super.onUserLeaveHint();
    }

    public void bunyiA7 (View v)
    {
        this.tujuh.play(this.violence,1,1,0,0,1);
    }

    public void bunyiB7 (View v)
    {
        this.tujuh.play(this.violence2,1,1,0,0,1);
    }

    public void bunyiC7 (View v)
    {
        this.tujuh.play(this.violence3,1,1,0,0,1);
    }


    public void bunyiD7 (View v)
    {
        this.tujuh.play(this.violence5,1,1,0,0,1);
    }

    public void bunyiE7 (View v)
    {
        this.tujuh.play(this.violence6,1,1,0,0,1);
    }

    public void bunyiF7 (View v)
    {
        this.tujuh.play(this.violence8,1,1,0,0,1);
    }

    public void bunyiG7 (View v)
    {
        this.tujuh.play(this.violence10,1,1,0,0,1);
    }
    public void bunyiAkres7 (View v)
    {
        tujuh.play(violence1,1,1,0,0,1);
    }
    public void bunyiCkres7 ( View v)
    {
        tujuh.play(violence4,1,1,0,0,1);
    }
    public void bunyiDkres7 (View v)
    {
        tujuh.play(violence7,1,1,0,0,1);
    }
    public void bunyiFkres7 (View v)
    {
        tujuh.play(violence9,1,1,0,0,1);
    }
    public void bunyiGkres7 (View v)
    {
        tujuh.play(violence11,1,1,0,0,1);
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
        tujuh.stop(violence);
        tujuh.stop(violence1);
        tujuh.stop(violence2);
        tujuh.stop(violence3);
        tujuh.stop(violence4);
        tujuh.stop(violence5);
        tujuh.stop(violence6);
        tujuh.stop(violence7);
        tujuh.stop(violence8);
        tujuh.stop(violence9);
        tujuh.stop(violence10);
        tujuh.stop(violence11);
        finish();
    }
}
