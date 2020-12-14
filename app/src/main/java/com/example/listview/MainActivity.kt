package android.cianjur.developer.net.basicandroid;

import android.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    //Data-Data yang Akan dimasukan Pada ListView
    private val mahasiswa = arrayOf(
        "Wildan", "Taufan", "Adibil;", "Hari", "Adam",
        "Hermawan", "Indra", "Widi", "Anisa", "Hani"
    )

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private var data: ArrayList<String?>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.list)
        data = ArrayList()
        getData()
        val adapter: ArrayAdapter<*> =
            ArrayAdapter<Any?>(this, R.layout.support_simple_spinner_dropdown_item, data!!)
        listView.adapter = adapter
    }

    private fun getData() 
        Collections.addAll(data, *mahasiswa)
    }
}