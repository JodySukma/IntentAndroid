package com.example.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class parslable extends AppCompatActivity {
    public static final String EXTRA_MAKANAN = "extra_makanan";
    TextView textObjek;
    makanan Makanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parslable);

        textObjek = findViewById(R.id.Move_objek);

        Makanan = getIntent().getParcelableExtra(EXTRA_MAKANAN);

        String text ="Nama makanan"+Makanan.getNamaMakanan()+" Asal makanan"+Makanan.getAsalMakanan()+" Bahan utama"+Makanan.getBahanUtama();

        textObjek.setText(text);
    }
}
