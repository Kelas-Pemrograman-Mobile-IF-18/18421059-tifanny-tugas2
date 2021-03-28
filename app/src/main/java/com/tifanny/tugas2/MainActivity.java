package com.tifanny.tugas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTampil;
    EditText edtNpm, edtNama, edtJenisKelamin, edtTlp, edtHobby;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtJenisKelamin = (EditText) findViewById(R.id.edtJenisKelamin);
        edtTlp = (EditText) findViewById(R.id.edtNoTlp);
        edtHobby = (EditText) findViewById(R.id.edtHobby);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJenisKelamin = edtJenisKelamin.getText().toString();
                String strTlp = edtTlp.getText().toString();
                String strHobby = edtHobby.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + strJenisKelamin + "\n" + strTlp + "\n" + strHobby);
            }
        });
    }
}