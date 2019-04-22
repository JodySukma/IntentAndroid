package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button pindahActivity;
    Button pindahData;
    Button pindahObjek;
    Button TeleponPokis;
    EditText editdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindahActivity = findViewById(R.id.btn_pindah_activity);
        editdata =findViewById(R.id.edt_data);
        pindahData = findViewById(R.id.btn_pindah_dengan_data);
        pindahObjek = findViewById(R.id.btn_pindah_parslable);
        TeleponPokis = findViewById(R.id.btn_intent_telepon);

        pindahActivity.setOnClickListener(this);
        pindahObjek.setOnClickListener(this);
        TeleponPokis.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pindah_activity:
                Intent intent = new Intent(MainActivity.this,MoveActivity.class);/// ini untuk memindahkan sebuah aktivity ke aktiviti yang lain dari main ke move
                startActivity(intent);

                break;

            case R.id.btn_pindah_dengan_data:
                Intent moveDataIntent = new Intent(MainActivity.this,Move_data.class);
                moveDataIntent.putExtra(Move_data.EXTRA_DATA, editdata.getText().toString());    ///untuk mengambil data dari inputan dan di bawa untuk berpindah aktiviti
                startActivity(moveDataIntent);

                break;

            case R.id.btn_pindah_parslable:
                makanan Makanan =new makanan();
                Makanan.setNamaMakanan("Nasi goreng padang");
                Makanan.setBahanUtama("Nasi");
                Makanan.setAsalMakanan("Padang");
                Intent moveObjek = new Intent(MainActivity.this,parslable.class);
                moveObjek.putExtra(parslable.EXTRA_MAKANAN, Makanan);

                break;

            case R.id.btn_intent_telepon:
                String noTelepeon = "911";

                Intent teleponIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel :" +noTelepeon));
                startActivity(teleponIntent);
        }
    }
}
