package com.example.latihanmengirimdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtNamaLengkap : EditText
    private lateinit var edtNamaPanggilan : EditText
    private lateinit var edtNpm : EditText
    private lateinit var edtAlamat : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
        edtNamaLengkap = findViewById(R.id.edt_namaLengkap)
        edtNamaPanggilan = findViewById(R.id.edt_namaPanggilan)
        edtNpm = findViewById(R.id.edt_npm)
        edtAlamat = findViewById(R.id.edt_alamat)
    }

    override fun onClick(v: View) {
        when (v?.id) {
            R.id.btn_move_activity_data -> {

                val namaLengkapValue = edtNamaLengkap.text.toString()
                val namaPanggilanValue = edtNamaPanggilan.text.toString()
                val npmValue = edtNpm.text.toString()
                val alamatValue = edtAlamat.text.toString()

                val moveWithDataIntent = Intent (this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAMALENGKAP, namaLengkapValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAMAPANGGILAN, namaPanggilanValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NPM, npmValue)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ALAMAT, alamatValue)
                startActivity(moveWithDataIntent)

            }
        }
    }
}