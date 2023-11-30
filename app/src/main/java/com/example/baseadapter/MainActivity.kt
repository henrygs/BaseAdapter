package com.example.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baseadapter.adapter.ProductAdapter
import com.example.baseadapter.baseAdapter.OnClickListener
import com.example.baseadapter.databinding.ActivityMainBinding
import com.example.baseadapter.model.Product

class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    private val adapter by lazy { ProductAdapter(this@MainActivity as ViewGroup) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL, false )
            recyclerView.adapter = adapter
            adapter.setList(listProduct())
        }
        adapter.onClickListener = OnClickListener {
            Toast.makeText(this@MainActivity, "$it", Toast.LENGTH_SHORT).show()
        }
    }

    fun listProduct(): List<Product> {
        return listOf(
            Product("Tv", 3500.0),
            Product("Geladeira", 4500.0),
            Product("PC", 7500.0),
            Product("Ventilador", 100.0),
            Product("Alexa", 350.0),
        )
    }
}