package com.gandara;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Jarak nada pada skala pelog Jawa ?",
            "2. Cublak cublak suweng adalah lagu daerah dari ?  ",
            "3. Manuk Dadali adalah lagu daerah dari ?",
            "4. Skala Madenda biasa digunakan dalam perhelatan musik ?",
            "5. Nada yang tidak digunakan pada Pelog pathet bem adalah nada ke ?",
            "6. Nada yang tidak digunakan pada Pelog pathet barang adalah nada ke ?",
            "7. E Mambo Simbo adalah lagu daerah dari ?",
            "8. Jumlah nada skala Madenda Sunda adalah ?",
            "9. Apuse adalah lagu daerah dari ?",
            "10.Nyok kita ngarak ondel-ondel nyok!.." +
                    " Isilah titik-titik tersebut dengan lirik yang benar!"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {       "1 – 1 – 1/2 – 2 – 1/2 - 2",
                    "1 – 1 – 1/2 – 1/2 –1 – 2", //bener
                    "1 – 1 – 1 – 2 – 1/2 - 2",
                    "1 – 1 – 1/2 – 1 – 1/2 - 2 "
            },



            {       "Yogyakarta",
                    "Jawa Tengah", //bener
                    "Jawa Timur",
                    "Jawa Barat"
            },





            {"Jawa Barat", "Irian", "Aceh", "Bengkulu"},
            {"Orkestra", "Konser Rock", "Degung", "Pertunjukan Wayang"},
            {"7", "1", "3", "9"},
            {"7", "1", "3", "9"},
            {"Jawa Barat", "Irian Barat", "Aceh", "Bengkulu"},
            {"7", "1", "3", "5"},
            {"Jawa Barat", "Irian", "Aceh", "Bengkulu"},
            {"Anaknya ngider-der ideran oyyyy","Mak!bapak ondel-ondel ngibing ser","Ondel-ondel ada anaknyanye boyy","Nyok kita nonton ondel-ondel Nyok"}


    };

    private String mCorrectAnswers[] = {"1 – 1 – 1/2 – 1/2 –1 – 2",
            "Jawa Tengah",
            "Jawa Barat",
            "Degung",
            "7",
    "1",
    "Irian Barat",
    "5",
    "Irian",
    "Ondel-ondel ada anaknyanye boyy"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}