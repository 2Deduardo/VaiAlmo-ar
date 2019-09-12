package com.example.pad_3d_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView = findViewById(R.id.recyclerView) as RecyclerView

        recycleView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()
        users.add(User("Dom Quixote", "Miguel de Cervantes"))
        users.add(User("História em Duas Cidades", "Charles Dickens"))
        users.add(User("O Senhor dos Anéis", "J. R. R. Tolkien"))
        users.add(User("O Pequeno Príncipe", " Antoine de Saint-Exupéry"))
        users.add(User("Harry Potter e a Pedra Filosofal", " J. K. Rowling"))
        users.add(User("O Hobbit", " J. R. R. Tolkien"))
        users.add(User("O Caso dos 10 Negrinhos", "Agatha Christie "))
        users.add(User("O Sonho da Câmara Vermelha", " Cao Xueqin"))
        users.add(User("Ela, a Feiticeira", " H. Rider Haggard"))
        users.add(User("O Leão, a Feiticeira e o Guarda-Roupa ", " C.S. Lewis"))
        users.add(User("O Código Da Vinci", " Dan Brown "))
        users.add(User("Pense e Enriqueça ", "Napoleon Hill "))
        users.add(User("Harry Potter e o Enigma do Príncipe", "J. K. Rowling "))
        users.add(User("O Alquimista", " Paulo Coelho"))
        users.add(User("O Apanhador no Campo de Centeio", " J.D. Salinger"))
        users.add(User("Livro do Desassossego", " Fernando Pessoa"))

        val adapter = CustomAdapter (users)

        recycleView.adapter = adapter
    }
}
