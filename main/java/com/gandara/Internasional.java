package com.gandara;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Internasional extends AppCompatActivity {

    Dialog dialog;

    Button SkalaMayor,SkalaMinor,SkalaMayorPenta,SkalaMinorPenta,SkalaKromatis;
    SoundPool skala;
    int kambing,kambing1,kambing2,kambing3,kambing4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_internasional);
        dialog= new Dialog(this);

        skala = new SoundPool(0,3,0);
        kambing = skala.load(this,R.raw.skala_mayor,1);
        kambing1 = skala.load(this,R.raw.skala_minor,1);
        kambing2 = skala.load(this,R.raw.skala_mayor_pentatonis,1);
        kambing3 = skala.load(this,R.raw.skala_minor_pentatonis,1);
        kambing4 = skala.load(this,R.raw.skala_kromatis,1);

        SkalaMayor = findViewById(R.id.skala_mayor);
        SkalaMayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.play(kambing,1,1,0,0,1);
            }
        });

        SkalaMinor = findViewById(R.id.skala_minor);
        SkalaMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.play(kambing1,1,1,0,0,1);
            }
        });

        SkalaMayorPenta = findViewById(R.id.skala_mayor_pentatonis);
        SkalaMayorPenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.play(kambing2,1,1,0,0,1);
            }
        });

        SkalaMinorPenta = findViewById(R.id.skala_minor_pentatonis);
        SkalaMinorPenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.play(kambing3,1,1,0,0,1);
            }
        });

        SkalaKromatis = findViewById(R.id.skala_kromatis);
        SkalaKromatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.play(kambing4,1,1,0,0,1);
            }
        });

        ImageView balik = findViewById(R.id.balikinternasional);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skala.stop(kambing);
                skala.stop(kambing1);
                skala.stop(kambing2);
                skala.stop(kambing3);
                skala.stop(kambing4);
                finish();
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        skala.stop(kambing);
        skala.stop(kambing1);
        skala.stop(kambing2);
        skala.stop(kambing3);
        skala.stop(kambing4);
        super.onUserLeaveHint();
    }

    public void Titit2 (View v){
        Button close;
        dialog.setContentView(R.layout.popup_skala);
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

    public void onBackPressed() {
        skala.stop(kambing);
        skala.stop(kambing1);
        skala.stop(kambing2);
        skala.stop(kambing3);
        skala.stop(kambing4);
        finish();
    }
}
