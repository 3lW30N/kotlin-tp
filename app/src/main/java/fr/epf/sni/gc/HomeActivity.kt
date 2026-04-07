package fr.epf.sni.gc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import fr.epf.sni.gc.R.id
import fr.epf.sni.gc.model.Client
import fr.epf.sni.gc.model.generateClients

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val addButton = findViewById<Button>(id.home_add_button)
        addButton.setOnClickListener {
            val intent = Intent(this, AddClientActivity::class.java)
            startActivity(intent)
        }

        val listButton = findViewById<Button>(id.home_list_button)
        listButton.setOnClickListener {
            val intent = Intent(this, ListClientsActivity::class.java)
            startActivity(intent)
        }
    }

    val clients = generateClients(20)
    val clients2 = Client.generateClients(20)
}