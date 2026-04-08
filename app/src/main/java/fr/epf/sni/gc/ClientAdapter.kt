package fr.epf.sni.gc

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.epf.sni.gc.model.Client
import fr.epf.sni.gc.model.Gender

class ClientViewHolder(view: View) : RecyclerView.ViewHolder(view)

class ClientAdapter(val clients: List<Client>) : RecyclerView.Adapter<ClientViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ClientViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.client_card_view, parent, false)

        return ClientViewHolder(view)
    }

    override fun onBindViewHolder(vh: ClientViewHolder, position: Int) {
        val client = clients.get(position)
        val view = vh.itemView

        vh.itemView.apply {
            val clientTextView = view.findViewById<TextView>(R.id.card_client_textview)
            clientTextView.text = client.getName()

            val clientImageView = view.findViewById<ImageView>(R.id.card_client_imageview)
            clientImageView.setBackgroundResource(client.image)

            click {
                val intent = Intent(this.context, DetailsClientActivity::class.java)
                context.startActivity(intent)
                //intent.putExtra("client_selected", client)
            }
        }
    }

    override fun getItemCount() = clients.size

    fun Client.getName() : String {
        return "${this.firstName} ${this.lastName}"
    }

    val Client.image get() = when(this.gender){
        Gender.MAN -> R.drawable.yellow_profile
        Gender.WOMAN -> R.drawable.pink_profile
    }

}

fun View.click(action: (View) -> Unit){
    Log.d("CLICK", "clic sur la view $id ")
    setOnClickListener(action)
}