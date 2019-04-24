package com.example.mycomputer.utsrecycleview;

import java.util.ArrayList;

public class Chardata {
    public static String[][] data = new String[][]{
            {"Yui Hirasawa", "Guitar/Vocal", "https://vignette.wikia.nocookie.net/k-on/images/4/4b/Yui_Hirasawa_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713163129"},
            {"Mio Akiyama", "Bass/Vocal", "https://vignette.wikia.nocookie.net/k-on/images/1/1d/Mio_Akiyama_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713162902"},
            {"Tsumugi Kotobuki", "Keyboard", "https://vignette.wikia.nocookie.net/k-on/images/c/ca/Tsumugi_Kotobuki_new_mughot.png/revision/latest/scale-to-width-down/250?cb=20130713162937"},
            {"Ritsu Tainaka", "Drum", "https://vignette.wikia.nocookie.net/k-on/images/4/40/Ritsu_Tainaka_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713163002"},
            {"Azusa Nakano", "Guitar", "https://vignette.wikia.nocookie.net/k-on/images/e/ed/Azusa_Nakano_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713162804"},
            {"Ui Hirasawa", "Guitar", "https://vignette.wikia.nocookie.net/k-on/images/d/da/Ui_Hirasawa_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713163747"},
            {"Jun Suzuki", "Bass", "https://vignette.wikia.nocookie.net/k-on/images/6/6c/Jun_Suzuki_new_mugshot.png/revision/latest/scale-to-width-down/250?cb=20130713163802"}
    };
    public static ArrayList<Anichara> getListData(){
        Anichara anichara = null;
        ArrayList<Anichara> list = new ArrayList<>();
        for (String[] aData : data) {
            anichara = new Anichara();
            anichara.setName(aData[0]);
            anichara.setRemarks(aData[1]);
            anichara.setPhoto(aData[2]);

            list.add(anichara);
        }

        return list;
    }
}
