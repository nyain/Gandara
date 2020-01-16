package com.gandara;

public class SoalEssay {public String pertanyaan[] = {
        "1. Gambar diatas adalah akor ?",// jawab A
        "2. Gambar diatas adalah skala ?",// Pelog Jawa
        "3. Nilai ketukan gambar di atas adalah?",// 1/4 coy
        "4. Gambar diatas adalah akor ?",// jawab A7
        "5. Gambar diatas adalah skala ?",//major
        "6. Gambar diatas adalah akor ?",//G
        "7. Gambar diatas adalah skala ?",//pelog bem
        "8. Nilai ketukan gambar di atas adalah?",//1/2
        "9. Gambar diatas adalah skala ?",//pelog bali
        "10. Gambar diatas adalah akor ?"//C5
};
    private String image[] = {
            "a_major",//1
            "javanese_pelog",//2
            "satu_per_empat",//3
            "a_7",//4
            "mayor_in_c",//5
            "g_major",//6
            "pelog_bem",//7
            "satu_per_dua",//8
            "balinese_pelog",//9
            "c_5"//10
    };
    private String jawabanBenar[] = {

                    "A Major",//1


                    "Pelog Jawa",//2



                    "1/4",//3



                    "A7",//4



                    "Major",//5



                    "G major",//6



                    "Pelog Bem",//7



                    "1/2",//8



                    "Pelog Bali",//9


                    "C5"//10

    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
