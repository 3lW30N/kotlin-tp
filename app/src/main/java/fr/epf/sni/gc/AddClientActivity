package fr.epf.sni.gc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "AddClientActivity"
class AddClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_client)

        val lastnameEditText = findViewById<EditText>(R.id.add_client_lastname_edittext)
        val addButton = findViewById<Button>(R.id.add_client_button)

        val genderGroup = findViewById<RadioGroup>(R.id.add_client_form_gender_radiobutton)


        addButton.setOnClickListener {
            val checkedRadioButtonId = genderGroup.checkedRadioButtonId
            val gender = if ( checkedRadioButtonId == R.id.add_client_form_woman_radiobutton) {
                "Femme"
            }
            else {
                "Homme"
            }
            Log.d(TAG, "Genre: ${gender}")
            Log.d(TAG, "Nom: ${lastnameEditText.text}")

            Toast.makeText(this, "Super !", Toast.LENGTH_SHORT).show()

            finish()
        }

        val ageTextView = findViewById<TextView>(R.id.add_client_form_age_textview)
        val ageSeekBar = findViewById<SeekBar>(R.id.add_client_form_age_seekbar)

        ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                p0: SeekBar?,
                progress: Int,
                p2: Boolean
            ) {
                ageTextView.text = progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) = Unit;

            override fun onStopTrackingTouch(p0: SeekBar?) = Unit;

        })
    }
}
