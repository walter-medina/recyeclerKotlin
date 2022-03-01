package app.utiltek.practicakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE = "clave"
    var btnRecicler:Button?=null
    //var editTextUsuario: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        btnRecicler=findViewById(R.id.btnRecicler)
        btnRecicler?.setOnClickListener {
            metodoRecicler()

        }

        btnLogin?.setOnClickListener {
            sendMessage()
        }


    }

    private fun metodoRecicler() {
        var intent =Intent(this, Actividad3::class.java)
        startActivity(intent)
    }

    fun sendMessage() {
        //editTextUsuario = findViewById<EditText>(R.id.editTextUser)
        //val message = editTextUsuario?.text.toString()
        /*val intent = Intent(this, Actividad2::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)*/

        val intent = Intent(this, Actividad2::class.java)

        startActivity(intent)
    }
}