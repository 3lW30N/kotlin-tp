package fr.epf.sni.gc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import fr.epf.sni.gc.model.Client.Companion.generateClients

class ListClientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_clients)
    }

    val recyclerView = findViewById<RecyclerView>(R.id.list_client_recycleview)
    recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    val clients = generateClients(20)
    recyclerView.adapter = ClientAdapter.
}