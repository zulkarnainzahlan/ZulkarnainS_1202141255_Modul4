package com.deqode.android.zulkarnains_1202141255_modul4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Gambar extends AppCompatActivity {
    //mendeklarasikan variabel yang dibutuhkan
    ImageView gambar;
    EditText sumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        gambar = (ImageView)findViewById(R.id.picture);
        sumber = (EditText)findViewById(R.id.link);
    }

    //method saat button ditekan
    public void cari(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(Gambar.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}
