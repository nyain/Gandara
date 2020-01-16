package com.gandara;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.SoundPool;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Guitar extends AppCompatActivity {
    private ImageView asu,telek,ayam,kucing;
    private int[] layouts;
    private ViewPager viewPager;
    public ViewPagerAdapter viewPagerAdapter;
    Button Tempo,Tempo1,Tempo2,Tempo3,Tempo4;
    Dialog dialog;
    SoundPool tempo,kangen;
    int kambing,kambing1,kambing2,kambing3,kambing4;
    int pengen,bobo,ngantuk,oi,tetap,semangat,ea,fuck,you,serius;

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            asu.setVisibility(View.VISIBLE);
            telek.setVisibility(View.VISIBLE);
            ayam.setVisibility(View.VISIBLE);
            kucing.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_guitar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        viewPager=findViewById(R.id.kintil);
        asu=findViewById(R.id.button);
        telek=findViewById(R.id.button1);
        ayam=findViewById(R.id.button2);
        kucing=findViewById(R.id.button3);
        layouts = new int[]{
                R.layout.activity_akor,
                R.layout.activity_skala,
                R.layout.activity_tempo,
                R.layout.activity_progresi
        };
        viewPagerAdapter = new ViewPagerAdapter();
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        dialog = new Dialog(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        tempo = new SoundPool(0,3,0);
        kambing = tempo.load(this,R.raw.satu_per_4,1);
        kambing1 = tempo.load(this,R.raw.satu_per_2,1);
        kambing2 = tempo.load(this,R.raw.empat_per_4,1);
        kambing3 = tempo.load(this,R.raw.satu_per_8,1);
        kambing4 = tempo.load(this,R.raw.satu_per_16,1);

        kangen = new SoundPool(0,3,0);
        pengen=kangen.load(this,R.raw.larghissimo,1);
        bobo=kangen.load(this,R.raw.largo,1);
        ngantuk=kangen.load(this,R.raw.largnetto,1);
        oi=kangen.load(this,R.raw.adagio,1);
        tetap=kangen.load(this,R.raw.andante,1);
        semangat=kangen.load(this,R.raw.moderato,1);
        ea=kangen.load(this,R.raw.allegro,1);
        fuck=kangen.load(this,R.raw.vivace,1);
        you=kangen.load(this,R.raw.presto,1);
        serius=kangen.load(this,R.raw.prestissimo,1);



        Tempo = findViewById(R.id.satu_per_4);
        Tempo1 = findViewById(R.id.satu_per_2);
        Tempo2 = findViewById(R.id.empat_per_4);
        Tempo3 = findViewById(R.id.satu_per_8);
        Tempo4 = findViewById(R.id.satu_per_16);
    }

    public void Bngst(View v) {
        Button close;
        dialog.setContentView(R.layout.popup_tempo);
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

    //Chord
    public void majorClick (View v){
        Intent intent = new Intent(Guitar.this,AkorMajor.class);
        startActivity(intent);
    }

    public void minorClick (View v){
        Intent intent = new Intent(Guitar.this,AkorMinor.class);
        startActivity(intent);
    }

    public void fiveClick (View v){
        Intent intent = new Intent(Guitar.this,Akor5.class);
        startActivity(intent);
    }

    public void sevenClick (View v){
        Intent intent = new Intent(Guitar.this,Akor7.class);
        startActivity(intent);
    }

    public void btnNusantara (View v){
        Intent intent = new Intent(Guitar.this,Nusantara.class);
        startActivity(intent);
    }

    public void btnInternasional (View v){
        Intent intent = new Intent(Guitar.this,Internasional.class);
        startActivity(intent);
    }

    public void satuPerempat (View v){
        tempo.play(kambing,1,1,0,0,1);
    }
    public void satuPer2 (View v){
        tempo.play(kambing1,1,1,0,0,1);
    }
    public void empatPer4(View v){
        tempo.play(kambing2,1,1,0,0,1);
    }
    public void satuper8 (View v){
        tempo.play(kambing3,1,1,0,0,1);
    }
    public void satuper16 (View v){
        tempo.play(kambing4,1,1,0,0,1);
    }


    public void Larghissimo(View v){
        kangen.play(pengen,1,1,0,0,1);
    }
    public void Titit3(View v){
        kangen.play(bobo,1,1,0,0,1);

    }
    public void Titit4(View v){
        kangen.play(ngantuk,1,1,0,0,1);
    }
    public void Titit5(View v){
        kangen.play(oi,1,1,0,0,1);
    }
    public void Titit6(View v){
        kangen.play(tetap,1,1,0,0,1);
    }
    public void Titit7(View v){
        kangen.play(semangat,1,1,0,0,1);
    }
    public void Titit8(View v){
        kangen.play(ea,1,1,0,0,1);
    }
    public void Titit9(View v){
        kangen.play(fuck,1,1,0,0,1);
    }
    public void Titit10(View v){
        kangen.play(you,1,1,0,0,1);
    }
    public void Titit11(View v){
        kangen.play(serius,1,1,0,0,1);
    }



    public void  Hilih(View v){
        viewPager.setCurrentItem(-1);
    }

    public void Kintil(View v){
        viewPager.setCurrentItem(1);
    }
    public void Hilih1(View bv)
    {
        viewPager.setCurrentItem(2);
    }
    public void Kintil1(View bowo){
        viewPager.setCurrentItem(R.layout.activity_progresi);
    }

    @Override
    protected void onUserLeaveHint() {
        kangen.stop(ngantuk);
        kangen.stop(oi);
        kangen.stop(tetap);
        kangen.stop(semangat);
        kangen.stop(ea);
        kangen.stop(pengen);
        kangen.stop(bobo);
        kangen.stop(fuck);
        kangen.stop(you);
        kangen.stop(serius);
        super.onUserLeaveHint();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                kangen.stop(ngantuk);
                kangen.stop(oi);
                kangen.stop(tetap);
                kangen.stop(semangat);
                kangen.stop(ea);
                kangen.stop(pengen);
                kangen.stop(bobo);
                kangen.stop(fuck);
                kangen.stop(you);
                kangen.stop(serius);



                tempo.stop(kambing);
                tempo.stop(kambing1);
                tempo.stop(kambing2);
                tempo.stop(kambing3);
                tempo.stop(kambing4);


                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        kangen.stop(ngantuk);
        kangen.stop(oi);
        kangen.stop(tetap);
        kangen.stop(semangat);
        kangen.stop(ea);
        kangen.stop(pengen);
        kangen.stop(bobo);
        kangen.stop(fuck);
        kangen.stop(you);
        kangen.stop(serius);

        tempo.stop(kambing);
        tempo.stop(kambing1);
        tempo.stop(kambing2);
        tempo.stop(kambing3);
        tempo.stop(kambing4);


        finish();
    }
}
