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

public class Nusantara extends AppCompatActivity {
    Dialog dialog;
    Button madenda,pelogBali,pelogJawa,pelogBarang,pelogBem;
    SoundPool nyain;
    int kambing,kambing1,kambing2,kambing3,kambing4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_nusantara);
        nyain = new SoundPool(0,3,0);
        kambing = nyain.load(this,R.raw.madenda_sunda,1);
        kambing1 = nyain.load(this,R.raw.pelog_jawa,1);
        kambing2 = nyain.load(this,R.raw.pelog_bali,1);
        kambing3= nyain.load(this,R.raw.pelog_barang,1);
        kambing4=nyain.load(this,R.raw.pelog_bem,1);

        dialog= new Dialog(this);

        madenda= findViewById(R.id.madenda);
        madenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.play(kambing,1,1,0,0,1);
            }
        });

        pelogJawa = findViewById(R.id.pelog_jawa);
        pelogJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.play(kambing1,1,1,0,0,1);
            }
        });

        pelogBali = findViewById(R.id.pelog_bali);
        pelogBali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.play(kambing2,1,1,0,0,1);
            }
        });

        pelogBarang=findViewById(R.id.mohon);
        pelogBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.play(kambing3,1,1,0,0,1);
            }
        });

        pelogBem=findViewById(R.id.tuhan);
        pelogBem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.play(kambing4,1,1,0,0,1);
            }
        });

        ImageView balik = findViewById(R.id.baliknusantara);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nyain.stop(kambing);
                nyain.stop(kambing1);
                nyain.stop(kambing2);
                nyain.stop(kambing3);
                nyain.stop(kambing4);
                finish();
            }
        });
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
        nyain.stop(kambing);
        nyain.stop(kambing1);
        nyain.stop(kambing2);
        nyain.stop(kambing3);
        nyain.stop(kambing4);
        finish();
    }

    @Override
    protected void onUserLeaveHint() {
        nyain.stop(kambing);
        nyain.stop(kambing1);
        nyain.stop(kambing2);
        nyain.stop(kambing3);
        nyain.stop(kambing4);
        super.onUserLeaveHint();
    }
}