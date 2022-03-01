package app.utiltek.practicakotlin.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import app.utiltek.practicakotlin.Heroe
import app.utiltek.practicakotlin.R
import app.utiltek.practicakotlin.databinding.ItemHeroeBinding
import com.bumptech.glide.Glide

//esta clase permite pintar las celdas, cada uno de los items del listado
class HeroeViewHolder (val view:View): RecyclerView.ViewHolder(view){

    //debo traerme el layout con cada uno de sus partes para poder pintarlo
    var heroe=view.findViewById<ImageView>(R.id.ivHeroe)
    var nombre=view.findViewById<TextView>(R.id.tvNombreHeroe)
    var nombreReal=view.findViewById<TextView>(R.id.tvNombreReal)
    var publisher=view.findViewById<TextView>(R.id.tvPublisher)

    //aqui en este método le paso la información del objeto a la vista
    fun render(modelHeroe: Heroe, onClicListener:(Heroe)->Unit){
        nombre.text=modelHeroe.nombre
        nombreReal.text=modelHeroe.realName
        publisher.text=modelHeroe.publisher
        Glide.with(heroe.context).load(modelHeroe.foto).into(heroe)

        //si queremos que al dar clic a la foto vaya mostrando algo:
        /*heroe.setOnClickListener {
            Toast.makeText(heroe.context," el nombre es: ${modelHeroe.nombre}", Toast.LENGTH_SHORT).show()
        }*/

        //para que sea el layout sea clicleable
        itemView.setOnClickListener {
            //Toast.makeText(heroe.context," el nombre es: ${modelHeroe.nombre}", Toast.LENGTH_SHORT).show()
            onClicListener(modelHeroe)
        }
    }

}