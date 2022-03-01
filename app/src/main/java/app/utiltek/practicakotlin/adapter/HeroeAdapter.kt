package app.utiltek.practicakotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import app.utiltek.practicakotlin.Heroe
import app.utiltek.practicakotlin.R

//esta clase permite insertar la lista de heroes en el recycler, al adapter le paso tambien una funcion lamda para traerme el objeto
//al momendo de dar clic en la celda del recycler
class HeroeAdapter (private var listaHeroes:List<Heroe>, private val onCLickListener:(Heroe)->Unit) : RecyclerView.Adapter<HeroeViewHolder>(){

    //aquí le pasamos el layout que tendrá el recycler
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val layautInflater=LayoutInflater.from(parent.context)
        return HeroeViewHolder(layautInflater.inflate(R.layout.item_heroe, parent, false))

    }

    //pasa por cada uno de los items de la lista y llama al método del viewholder
    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val item=listaHeroes[position]

        holder.render(item, onCLickListener)//traigo el objeto de cada posicion y se lo paso la funcion del holder
    }

    //tamaño de la lista
    override fun getItemCount(): Int {
        return listaHeroes.size
    }
}