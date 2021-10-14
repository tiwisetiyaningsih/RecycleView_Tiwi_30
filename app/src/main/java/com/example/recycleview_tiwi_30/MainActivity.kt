package com.example.recycleview_tiwi_30

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.blackwidow,
                nameSuperhero = "Black Widow",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.captainamerica,
                nameSuperhero = "Captain America",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.gamora,
                nameSuperhero = "Gamora",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.doctorstrange,
                nameSuperhero = "Doctor Strange",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.scarletwitch,
                nameSuperhero = "Scarlet Witch",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nickfury,
                nameSuperhero = "Nick Fury",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nebula,
                nameSuperhero = "Nebula",
                descSuperhero = "lorem lipsum lorem lipsum lorem lipsum lorem lipsum"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){
            val intent = Intent (this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}