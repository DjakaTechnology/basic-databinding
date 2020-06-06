package id.djaka.basicdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import id.djaka.basicdatabinding.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonContinue.setOnClickListener {
            binding.name = Random.nextInt(100).toString()
        }

        binding.buttonReset.setOnClickListener {
            binding.name = null
        }
    }
}
