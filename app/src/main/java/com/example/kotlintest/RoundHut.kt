package com.example.kotlintest

import kotlin.math.PI

open class RoundHut (val residents: Int, val radius: Double) : Dwelling(residents)  {

    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }
}