package fr.epf.sni.gc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.epf.sni.gc.model.generateClients

class ListClientsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_clients)


        val recyclerView = findViewById<RecyclerView>(R.id.list_client_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val clients = generateClients(20)
        recyclerView.adapter = ClientAdapter(clients)
    }

}