package com.bunga.husnayain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.elevation = 0f
        val bunga = intent.getParcelableExtra<Bunga>("bunga")
        supportActionBar?.subtitle = bunga.nama
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        detail_gambar.setImageResource(bunga.gambar)
        detail_nama.setText(bunga.nama)
        detail_latin.setText(bunga.latin)
        detail_keterangan.setText(bunga.keterangan)
        detail_url.setText(bunga.url)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}