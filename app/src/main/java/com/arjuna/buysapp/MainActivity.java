package com.arjuna.buysapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etkode, etnama, etjumlah, etharga;
    TextView txthasil;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etharga = (EditText) findViewById(R.id.etharga);
        etnama = (EditText) findViewById(R.id.etnama);
        etjumlah = (EditText) findViewById(R.id.etjumlah);
        etkode = (EditText) findViewById(R.id.etkode);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btnHasil = (Button) findViewById(R.id.btnhasil);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nharga = etharga.getText().toString();
                String nkode = etkode.getText().toString();
                String njumlah = etjumlah.getText().toString();
                String nnama = etnama.getText().toString();

                int aharga = Integer.parseInt(nharga);
//                int akode = Integer.parseInt(nkode);
                int ajumlah = Integer.parseInt(njumlah);

                int total = (aharga * ajumlah);

//                String totall = String.valueOf(total);



                switch (total) {
                    case 750000:
                        txthasil.setText("Hadiah Sepeda");
                        break;
                    case 500000:

                        txthasil.setText("Hadiah Payung");
                        break;
                    default:
                        txthasil.setText("Anda tidak mendapatkan Hadiah");
                }






            }
        });
    }
}
