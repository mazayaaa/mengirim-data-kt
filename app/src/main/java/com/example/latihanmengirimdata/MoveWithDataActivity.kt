package com.example.latihanmengirimdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMALENGKAP = "extra_namaLengkap"
        const val EXTRA_NAMAPANGGILAN = "extra_namaPanggilan"
        const val EXTRA_NPM = "extra_npm"
        const val EXTRA_ALAMAT = "extra_alamat"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataNamaLengkap: TextView = findViewById(R.id.tv_data_namaLengkap)
        val tvDataNamaPanggilan: TextView = findViewById(R.id.tv_data_namaPanggilan)
        val tvDataNPM: TextView = findViewById(R.id.tv_data_npm)
        val tvDataAlamat: TextView = findViewById(R.id.tv_data_alamat)

        val namaLengkap = intent.getStringExtra(EXTRA_NAMALENGKAP)
        val namaPanggilan = intent.getStringExtra(EXTRA_NAMAPANGGILAN)
        val npm = intent.getStringExtra(EXTRA_NPM)
        val alamat = intent.getStringExtra(EXTRA_ALAMAT)
        val textNamaLengkap = "Nama Lengkap : $namaLengkap"
        val textNamaPanggilan = "Nama Panggilan : $namaPanggilan"
        val textNpm = "NPM : $npm"
        val textAlamat = "Alamat : $alamat"
        tvDataNamaLengkap.text = textNamaLengkap
        tvDataNamaPanggilan.text = textNamaPanggilan
        tvDataNPM.text = textNpm
        tvDataAlamat.text = textAlamat
    }
}