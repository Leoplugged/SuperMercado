package br.com.zup.caixasupermercado

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.caixasupermercado.databinding.ActivityPurchasingDetailBinding as APuDBinding

class APuDBinding : AppCompatActivity() {
    private lateinit var binding: APuDBinding

    //TODO Por que o inflate não funciona?!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = APuDBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO Dica da professora. Como fazer funcionar?
        //supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
        //supportActionBar?.setTitle(R.string.activity_title)

        binding.btnRecalculate.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            this.finish()
        }
    }
}
