package com.gandara;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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

public class Akor5 extends Activity {
    Dialog dialog;
    SoundPool lima;
    Button a5;
    Button akres5;
    Button b5;
    Button c5;
    Button ckres5;
    Button d5;
    Button dkres5;
    Button e5;
    Button f5;
    Button fkres5;
    Button g5;
    Button gkres5;
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
                    Akor5.this.btnNext.setVisibility(View.VISIBLE);
                    Akor5.this.btnPrevious.setVisibility(View.VISIBLE);

                }

                @Override        public void onPageScrolled(int arg0, float arg1, int arg2) {

                }

                @Override        public void onPageScrollStateChanged(int arg0) {

                }
            };

    public class ViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public Object instantiateItem(ViewGroup container, int position) {
            this.layoutInflater = (LayoutInflater) Akor5.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = this.layoutInflater.inflate(Akor5.this.layouts[position], container, false);
            container.addView(view);
            return view;
        }

        public int getCount() {
            return Akor5.this.layouts.length;
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
        setContentView(R.layout.activity_akor5);
        this.viewPager =  findViewById(R.id.view_pager_5);
        this.dotsLayout =  findViewById(R.id.layoutDots5);
        this.btnPrevious =  findViewById(R.id.btn_previous_5);
        this.btnNext = findViewById(R.id.btn_next_5);

        dialog= new Dialog(this);

        this.lima = new SoundPool(0,3,1);

        this.violence = this.lima.load(this,R.raw.a_5,1);
        this.violence1 = this.lima.load(this,R.raw.a_kres_5,1);
        this.violence2 = this.lima.load(this,R.raw.b_5,1);
        this.violence3 = this.lima.load(this,R.raw.c_5,1);
        this.violence4 = this.lima.load(this,R.raw.c_kres_5,1);
        this.violence5 = this.lima.load(this,R.raw.d_5,1);
        this.violence6 = this.lima.load(this,R.raw.d_kres_5,1);
        this.violence7 = this.lima.load(this,R.raw.e_5,1);
        this.violence8 = this.lima.load(this,R.raw.f_5,1);
        this.violence9 = this.lima.load(this,R.raw.f_kres_5,1);
        this.violence10 = this.lima.load(this,R.raw.g_5,1);
        this.violence11 = this.lima.load(this,R.raw.g_kres_5,1);

        this.a5 = findViewById(R.id.bunyi_a5);
        this.akres5=findViewById(R.id.bunyi_akres5);
        this.b5=findViewById(R.id.bunyi_b5);
        this.c5=findViewById(R.id.bunyi_c5);
        this.ckres5=findViewById(R.id.bunyi_ckres5);
        this.d5=findViewById(R.id.bunyi_d5);
        this.dkres5=findViewById(R.id.bunyi_dkres5);
        this.e5=findViewById(R.id.bunyi_e5);
        this.f5=findViewById(R.id.bunyi_f5);
        this.fkres5=findViewById(R.id.bunyi_fkres5);
        this.g5=findViewById(R.id.bunyi_g5);
        this.gkres5=findViewById(R.id.bunyi_gkres5);

        this.layouts =new int[]
                {
                        R.layout.activity_a5,
                        R.layout.activity_akres5,
                        R.layout.activity_b5,
                        R.layout.activity_c5,
                        R.layout.activity_ckres5,
                        R.layout.activity_d5,
                        R.layout.activity_dkres5,
                        R.layout.activity_e5,
                        R.layout.activity_f5,
                        R.layout.activity_fkres5,
                        R.layout.activity_g5,
                        R.layout.activity_gkres5
                };
        addBottomDots(0);
        this.viewPagerAdapter = new ViewPagerAdapter();
        this.viewPager.setAdapter(this.viewPagerAdapter);
        this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);

        final ImageView balik = findViewById(R.id.balik5);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lima.stop(violence);
                lima.stop(violence1);
                lima.stop(violence2);
                lima.stop(violence3);
                lima.stop(violence4);
                lima.stop(violence5);
                lima.stop(violence6);
                lima.stop(violence7);
                lima.stop(violence8);
                lima.stop(violence9);
                lima.stop(violence10);
                lima.stop(violence11);
                finish();
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        lima.stop(violence);
        lima.stop(violence1);
        lima.stop(violence2);
        lima.stop(violence3);
        lima.stop(violence4);
        lima.stop(violence5);
        lima.stop(violence6);
        lima.stop(violence7);
        lima.stop(violence8);
        lima.stop(violence9);
        lima.stop(violence10);
        lima.stop(violence11);
        super.onUserLeaveHint();
    }

    public void bunyiA5 (View v)
    {
        this.lima.play(this.violence,1,1,0,0,1);
    }

    public void bunyiAkres5 (View v)
    {
        this.lima.play(this.violence1,1,1,0,0,1);
    }

    public void bunyiB5 (View v)
    {
        this.lima.play(this.violence2,1,1,0,0,1);
    }

    public void bunyiC5 (View v)
    {
        this.lima.play(this.violence3,1,1,0,0,1);
    }

    public void bunyiCkres5 (View v)
    {
        this.lima.play(this.violence4,1,1,0,0,1);
    }

    public void bunyiD5 (View v)
    {
        this.lima.play(this.violence5,1,1,0,0,1);
    }

    public void bunyiDkres5 (View v)
    {
        this.lima.play(this.violence6,1,1,0,0,1);
    }

    public void bunyiE5 (View v)
    {
        this.lima.play(this.violence7,1,1,0,0,1);
    }

    public void bunyiF5 (View v)
    {
        this.lima.play(this.violence8,1,1,0,0,1);
    }

    public void bunyiFkres5 (View v)
    {
        this.lima.play(this.violence9,1,1,0,0,1);
    }

    public void bunyiG5 (View v)
    {
        this.lima.play(this.violence10,1,1,0,0,1);
    }

    public void bunyiGkres5 (View v)
    {
        this.lima.play(this.violence11,1,1,0,0,1);
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
        lima.stop(violence);
        lima.stop(violence1);
        lima.stop(violence2);
        lima.stop(violence3);
        lima.stop(violence4);
        lima.stop(violence5);
        lima.stop(violence6);
        lima.stop(violence7);
        lima.stop(violence8);
        lima.stop(violence9);
        lima.stop(violence10);
        lima.stop(violence11);
        finish();
    }
}
