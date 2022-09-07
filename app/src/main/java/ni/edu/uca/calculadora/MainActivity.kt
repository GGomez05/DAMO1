package ni.edu.uca.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciar()
    }

    private fun iniciar() {
        binding.btSuma.setOnClickListener {
            val num1 :Int = binding.etNum1.text.toString().toInt()
            val num2 :Int = binding.etNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val suma = op.sumar()
            binding.tvResult.setText(suma.toString())

        }
        binding.btResta.setOnClickListener {
            val num1: Int = binding.etNum1.text.toString().toInt()
            val num2: Int = binding.etNum2.text.toString().toInt()
            val op =Operacion(num1, num2)
            val resta = op.restar()
            binding.tvResult.setText(resta.toString())
        }
        binding.btProd.setOnClickListener {
            val num1: Int =binding.etNum1.text.toString().toInt()
            val num2: Int = binding.etNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val multiplicacion = op.multiplicar()
            binding.tvResult.setText(multiplicacion.toString())

        }
        binding.btDv.setOnClickListener {
            val num1: Int= binding.etNum1.text.toString().toInt()
            val num2: Int= binding.tvNum2.text.toString().toInt()
            val op = Operacion(num1, num2)
            val division = op.dividir()
            binding.tvResult.setText(division.toString())
        }

    }
}