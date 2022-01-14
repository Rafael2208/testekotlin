package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val squareCabin = SquareCabin(6,50.0)
        val roundHut = RoundHut(3, 10.0)
        val roundTower = RoundTower(4, 15.5)


        val capacityText: TextView = findViewById(R.id.textSquareCabin)
        capacityText.text = squareCabin.capacity.toString()

        val buildingMaterialText: TextView = findViewById(R.id.textroundHut)
        buildingMaterialText.text = roundHut.buildingMaterial

        val floorAreaText: TextView = findViewById(R.id.textRoundTower)
        floorAreaText.text = roundTower.floorArea().toString()


    }






}