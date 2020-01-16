package com.gandara;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChordDaerah extends AppCompatActivity {
    Button aceh,bali,banten,bengkulu,gorontalo,jakarta,jambi,jabar,jateng,jatim,kalbar,kalsel,kalteng,kaltim,kalut,kepbangka,kepriau,lampung,maluku,maluku_utara,ntb,ntt,papua,papua_barat,riau,sulbar,sulsel,sultengah,sultenggara,sulut,sumbar,sumsel,sumut,yogya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_guitar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_chord_daerah);
        aceh=findViewById(R.id.daerah_aceh);
        aceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Aceh.class);
                startActivity(intent);
            }
        });
        bali=findViewById(R.id.daerah_bali);
        bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Bali.class);
                startActivity(intent);
            }
        });
        banten=findViewById(R.id.daerah_banten);
        banten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Banten.class);
                startActivity(intent);
            }
        });
        bengkulu=findViewById(R.id.daerah_bengkulu);
        bengkulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Bengkulu.class);
                startActivity(intent);
            }
        });
        gorontalo=findViewById(R.id.daerah_gorontalo);
        gorontalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Gorontalo.class);
                startActivity(intent);
            }
        });
        jakarta=findViewById(R.id.daerah_jakarta);
        jakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Jakarta.class);
                startActivity(intent);
            }
        });
        jambi=findViewById(R.id.daerah_jambi);
        jambi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Jambi.class);
                startActivity(intent);
            }
        });
        jabar=findViewById(R.id.daerah_jawa_barat);
        jabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,JawaBarat.class);
                startActivity(intent);
            }
        });
        jateng=findViewById(R.id.daerah_jawa_tengah);
        jateng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,JawaTengah.class);
                startActivity(intent);
            }
        });
        jatim=findViewById(R.id.daerah_jawa_timur);
        jatim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,JawaTimur.class);
                startActivity(intent);
            }
        });
        kalbar=findViewById(R.id.daerah_kalimantan_barat);
        kalbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KalimantanBarat.class);
                startActivity(intent);
            }
        });
        kalsel=findViewById(R.id.daerah_kalimantan_selatan);
        kalsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KalimantanSelatan.class);
                startActivity(intent);
            }
        });
        kalteng=findViewById(R.id.daerah_kalimantan_tengah);
        kalteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KalimantanTengah.class);
                startActivity(intent);
            }
        });
        kaltim=findViewById(R.id.daerah_kalimantan_timur);
        kaltim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KalimantanTimur.class);
                startActivity(intent);
            }
        });
        kalut=findViewById(R.id.daerah_kalimantan_utara);
        kalut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KalimantanUtara.class);
                startActivity(intent);
            }
        });
        kepbangka=findViewById(R.id.daerah_kepulauan_bangka_belitung);
        kepbangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KepulauanBangkaBelitung.class);
                startActivity(intent);
            }
        });
        kepriau=findViewById(R.id.daerah_kepulauan_riau);
        kepriau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,KepulauanRiau.class);
                startActivity(intent);
            }
        });
        lampung=findViewById(R.id.daerah_lampung);
        lampung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Lampung.class);
                startActivity(intent);
            }
        });
        maluku=findViewById(R.id.daerah_maluku);
        maluku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Maluku.class);
                startActivity(intent);
            }
        });
        maluku_utara=findViewById(R.id.daerah_maluku_utara);
        maluku_utara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,MalukuUtara.class);
                startActivity(intent);
            }
        });
        ntb=findViewById(R.id.daerah_nusa_tenggara_barat);
        ntb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,NusaTenggaraBarat.class);
                startActivity(intent);
            }
        });
        ntt=findViewById(R.id.daerah_nusa_tenggara_timur);
        ntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,NusaTenggaraTimur.class);
                startActivity(intent);
            }
        });
        papua=findViewById(R.id.daerah_irian);
        papua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Papua.class);
                startActivity(intent);
            }
        });
        papua_barat=findViewById(R.id.daerah_irian_barat);
        papua_barat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,PapuaBarat.class);
                startActivity(intent);
            }
        });
        riau=findViewById(R.id.daerah_riau);
        riau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Riau.class);
                startActivity(intent);
            }
        });
        sulbar=findViewById(R.id.daerah_sulawesi_barat);
        sulbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SulawesiBarat.class);
                startActivity(intent);
            }
        });
        sultengah=findViewById(R.id.daerah_sulawesi_tengah);
        sultengah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SulawesiTengah.class);
                startActivity(intent);
            }
        });
        sulsel=findViewById(R.id.daerah_sulawesi_selatan);
        sulsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SulawesiSelatan.class);
                startActivity(intent);
            }
        });
        sultenggara=findViewById(R.id.daerah_sulawesi_tenggara);
        sultenggara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SulawesiTenggara.class);
                startActivity(intent);
            }
        });
        sulut=findViewById(R.id.daerah_sulawesi_utara);
        sulut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SulawesiUtara.class);
                startActivity(intent);
            }
        });
        sumbar=findViewById(R.id.daerah_sumatera_barat);
        sumbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SumateraBarat.class);
                startActivity(intent);
            }
        });
        sumsel=findViewById(R.id.daerah_sumatera_selatan);
        sumsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SumateraSelatan.class);
                startActivity(intent);
            }
        });
        sumut=findViewById(R.id.daerah_sumatera_utara);
        sumut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,SumateraUtara.class);
                startActivity(intent);
            }
        });
        yogya=findViewById(R.id.daerah_yogyakarta);
        yogya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChordDaerah.this,Yogyakarta.class);
                startActivity(intent);
            }
        });

        final ImageView balik = findViewById(R.id.balikdaerah);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
