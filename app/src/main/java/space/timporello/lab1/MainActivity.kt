package space.timporello.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        textView.text = "${getText(R.string.hello)} ${getText(R.string.name)}!"
        button1.text = getString(R.string.upload)
        button2.text = getString(R.string.download)

        button1.setOnClickListener {
            Toast.makeText(this, "${getText(R.string.upload)}ing", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(this, "${getText(R.string.download)}ing", Toast.LENGTH_SHORT).show()
        }


    }
}