package app.utiltek.practicakotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import app.utiltek.practicakotlin.adapter.HeroeAdapter
import app.utiltek.practicakotlin.databinding.ActivityActividad3Binding

class Actividad3 : AppCompatActivity() {
    //usando binding
    lateinit var binding: ActivityActividad3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActividad3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView() {
        //var recyclerView=findViewById<RecyclerView>(R.id.rvHoroes)
        var manager = LinearLayoutManager(this)
        //para hacer una línea adebajo de cada item:
        var decoration = DividerItemDecoration(this, manager.orientation)
        binding.rvHoroes.layoutManager = manager
        //ahora si metemos el adapter al recycler:
        binding.rvHoroes.adapter =
            HeroeAdapter(HeroeProvider.listaHeroes) { heroe -> onItemSelected(heroe) }
        binding.rvHoroes.addItemDecoration(decoration)

    }

    fun onItemSelected(modelHeroe: Heroe) {
        Toast.makeText(this, modelHeroe.nombre, Toast.LENGTH_SHORT).show()
    }
}
