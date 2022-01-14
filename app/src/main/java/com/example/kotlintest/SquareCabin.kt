package com.example.kotlintest

class SquareCabin (residents: Int, val length: Double) : Dwelling(residents) {

    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }
}