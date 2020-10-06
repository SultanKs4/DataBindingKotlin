package com.natlus.databindingkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.natlus.databindingkotlin.databinding.ActivityDetailBinding
import com.natlus.databindingkotlin.models.Mahasiswa

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)

        val dataMahasiswa = intent.getParcelableExtra<Mahasiswa>("MAHASISWA")
        binding.mahasiswa = dataMahasiswa
    }
}