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
import android.support.annotation.RequiresApi;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AkorMajor extends Activity {
    Dialog dialog;
    SoundPool major;
    Button amajor;
    Button akresmajor;
    Button bmajor;
    Button cmajor;
    Button ckresmajor;
    Button dmajor;
    Button dkresmajor;
    Button emajor;
    Button fmajor;
    Button fkresmajor;
    Button gmajor;
    Button gkresmajor;
    private Button btnNext;
    private Button btnPrevious;
    private TextView[] dots;
    private LinearLayout dotsLayout;
    private int[] layouts;
    int kambing;
    int kambing1;
    int kambing2;
    int kambing3;
    int kambing4;
    int kambing5;
    int kambing6;
    int kambing7;
    int kambing8;
    int kambing9;
    int kambing10;
    int kambing11;
    private ViewPager viewPager;
    public ViewPagerAdapter viewPagerAdapter;
    OnPageChangeListener viewPagerPageChangeListener = new OnPageChangeListener() {
        public void onPageSelected(int position) {
            AkorMajor.this.addBottomDots(position);
            if (position == AkorMajor.this.layouts.length - 1) {
                AkorMajor.this.btnNext.setVisibility(View.GONE);
                return;
            }
            if (position == AkorMajor.this.layouts.length - 12) {
                AkorMajor.this.btnPrevious.setVisibility(View.GONE);
                return;
            }

            AkorMajor.this.btnNext.setVisibility(View.VISIBLE);
            AkorMajor.this.btnPrevious.setVisibility(View.VISIBLE);

        }

        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }

        public void onPageScrollStateChanged(int arg0) {
        }
    };

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public Object instantiateItem(ViewGroup container, int position) {
            this.layoutInflater = (LayoutInflater) AkorMajor.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = this.layoutInflater.inflate(AkorMajor.this.layouts[position], container, false);
            container.addView(view);
            return view;
        }

        public int getCount() {
            return AkorMajor.this.layouts.length;
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
        getWindow().setFlags(1024, 1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_akor_major);
        this.viewPager = findViewById(R.id.view_pager_major);
        this.dotsLayout = findViewById(R.id.layoutDotsmajor);
        this.btnPrevious = findViewById(R.id.btn_previous_major);
        this.btnNext = findViewById(R.id.btn_next_major);

        dialog = new Dialog(this);


        this.major = new SoundPool(0, 3, 1);

        this.kambing = this.major.load(this, R.raw.a_major, 1);
        this.kambing1 = this.major.load(this, R.raw.a_kres_major, 1);
        this.kambing2 = this.major.load(this, R.raw.b_major, 1);
        this.kambing3 = this.major.load(this, R.raw.c_major, 1);
        this.kambing4 = this.major.load(this, R.raw.c_kres_major, 1);
        this.kambing5 = this.major.load(this, R.raw.d_major, 1);
        this.kambing6 = this.major.load(this, R.raw.d_kres_major, 1);
        this.kambing7 = this.major.load(this, R.raw.e_major, 1);
        this.kambing8 = this.major.load(this, R.raw.f_major, 1);
        this.kambing9 = this.major.load(this, R.raw.f_kres_major, 1);
        this.kambing10 = this.major.load(this, R.raw.g_major, 1);
        this.kambing11 = this.major.load(this, R.raw.g_kres_major, 1);

        this.amajor = findViewById(R.id.bunyi_a_major);
        this.akresmajor = findViewById(R.id.bunyi_akres_major);
        this.bmajor = findViewById(R.id.bunyi_b_major);
        this.cmajor = findViewById(R.id.bunyi_c_major);
        this.ckresmajor = findViewById(R.id.bunyi_ckres_major);
        this.dmajor = findViewById(R.id.bunyi_d_major);
        this.dkresmajor = findViewById(R.id.bunyi_dkres_major);
        this.emajor = findViewById(R.id.bunyi_e_major);
        this.fmajor = findViewById(R.id.bunyi_f_major);
        this.fkresmajor = findViewById(R.id.bunyi_fkres_major);
        this.gmajor = findViewById(R.id.bunyi_g_major);
        this.gkresmajor = findViewById(R.id.bunyi_gkres_major);

        this.layouts = new int[]
                {
                        R.layout.activity_amajor,
                        R.layout.activity_akresmajor,
                        R.layout.activity_bmajor,
                        R.layout.activity_cmajor,
                        R.layout.activity_ckresmajor,
                        R.layout.activity_dmajor,
                        R.layout.activity_dkresmajor,
                        R.layout.activity_emajor,
                        R.layout.activity_fmajor,
                        R.layout.activity_fkresmajor,
                        R.layout.activity_gmajor,
                        R.layout.activity_gkresmajor
                };
        addBottomDots(0);
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

        final ImageView balik = findViewById(R.id.balikmajor);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                major.stop(kambing);
                major.stop(kambing1);
                major.stop(kambing2);
                major.stop(kambing3);
                major.stop(kambing4);
                major.stop(kambing5);
                major.stop(kambing6);
                major.stop(kambing7);
                major.stop(kambing8);
                major.stop(kambing9);
                major.stop(kambing10);
                major.stop(kambing11);
                finish();
            }
        });

    }

    public void bunyiAmajor(View v) {
        this.major.play(this.kambing, 1, 1, 0, 0, 1);
    }

    public void bunyiAkresmajor(View v) {
        this.major.play(this.kambing1, 1, 1, 0, 0, 1);
    }

    public void bunyiBmajor(View v) {
        this.major.play(this.kambing2, 1, 1, 0, 0, 1);
    }

    public void bunyiCmajor(View v) {
        this.major.play(this.kambing3, 1, 1, 0, 0, 1);
    }

    public void bunyiCkresmajor(View v) {
        this.major.play(this.kambing4, 1, 1, 0, 0, 1);
    }

    public void bunyiDmajor(View v) {
        this.major.play(this.kambing5, 1, 1, 0, 0, 1);
    }

    public void bunyiDkresmajor(View v) {
        this.major.play(this.kambing6, 1, 1, 0, 0, 1);
    }

    public void bunyiEmajor(View v) {
        this.major.play(this.kambing7, 1, 1, 0, 0, 1);
    }

    public void bunyiFmajor(View v) {
        this.major.play(this.kambing8, 1, 1, 0, 0, 1);
    }

    public void bunyiFkresmajor(View v) {
        this.major.play(this.kambing9, 1, 1, 0, 0, 1);
    }

    public void bunyiGmajor(View v) {
        this.major.play(this.kambing10, 1, 1, 0, 0, 1);
    }

    public void bunyiGkresmajor(View v) {
        this.major.play(this.kambing11, 1, 1, 0, 0, 1);
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

    @Override
    protected void onUserLeaveHint() {
        major.stop(kambing);
        major.stop(kambing1);
        major.stop(kambing2);
        major.stop(kambing3);
        major.stop(kambing4);
        major.stop(kambing5);
        major.stop(kambing6);
        major.stop(kambing7);
        major.stop(kambing8);
        major.stop(kambing9);
        major.stop(kambing10);
        major.stop(kambing11);
        super.onUserLeaveHint();
    }

    public void Titit(View v) {
        Button close;
        dialog.setContentView(R.layout.popup_akor);
        close = dialog.findViewById(R.id.close);
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

        major.stop(kambing);
        major.stop(kambing1);
        major.stop(kambing2);
        major.stop(kambing3);
        major.stop(kambing4);
        major.stop(kambing5);
        major.stop(kambing6);
        major.stop(kambing7);
        major.stop(kambing8);
        major.stop(kambing9);
        major.stop(kambing10);
        major.stop(kambing11);

        finish();
    }
}
