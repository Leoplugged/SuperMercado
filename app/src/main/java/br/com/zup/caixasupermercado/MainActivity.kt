package br.com.zup.caixasupermercado

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding
import br.com.zup.caixasupermercado.model.Product

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var product: Product

    private var name = binding.etProductName
    private var qty = binding.etQty.toString()
    private var unitaryValue = binding.etUnitaryValue.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding = ActivityMainBinding.inflate(layoutInflater)

        //TODO Dica da professora. Como fazer funcionar?
        //supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
        //supportActionBar?.setTitle(R.string.app_name)

        binding.btnCalculate.setOnClickListener {

            Intent(this, PuDBinding::class.java).apply {
                recoverData()
                validate()
                this.putExtra("Product", product.toString())
                clearEt()
            }
            startActivity(intent)
            Toast.makeText(this, ERROR_MESSAGE_BLANK, Toast.LENGTH_LONG).show()
        }
    }

    private fun recoverData() {

        //TODO Ver parcelable
    }

        //TODO Ver como exibir dados sem usar função, diretamente pelo layout

        //TODO Checar necessidade de validar nome
    fun validate(): Boolean {
        return if (qty.isEmpty() || unitaryValue.isEmpty()) {
            Toast.makeText(this, ERROR_MESSAGE_BLANK, Toast.LENGTH_LONG).show()
            true
        } else {
            false
        }
    }

    private fun clearEt() {
        binding.etProductName.text.clear()
        binding.etQty.text.clear()
        binding.etUnitaryValue.text.clear()
    }


}
