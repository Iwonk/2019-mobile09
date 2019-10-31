package com.example.recyclergrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclergrid.adapters.MahasiswaAdapter;
import com.example.recyclergrid.models.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMahasiswa;
    List<Mahasiswa> listMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMahasiswa =findViewById(R.id.rvMahasiswa);
        Mahasiswa mahasiswa = new Mahasiswa("1741720001", "Ilham");
        listMahasiswa.add(mahasiswa);

        mahasiswa = new Mahasiswa("1741720002", "Nuswantoro");
        listMahasiswa.add(mahasiswa);

        mahasiswa = new Mahasiswa("1741720003", "Aji");
        listMahasiswa.add(mahasiswa);

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(listMahasiswa);

        rvMahasiswa.setAdapter(mahasiswaAdapter);
        rvMahasiswa.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
