package fr.epf.sni.gc

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

        val clientTextView = view.findViewById<TextView>(R.id.card_client_textview)
        clientTextView.text = "${client.firstName} ${client.lastName}"

        val clientImageView = view.findViewById<ImageView>(R.id.card_client_imageview)
        clientImageView.setBackgroundResource(
            when(client.gender){
                Gender.WOMAN -> R.drawable.pink_profile
                Gender.MAN -> R.drawable.yellow_profile
            }
        )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}