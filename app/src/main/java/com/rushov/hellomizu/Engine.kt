package com.rushov.hellomizu

interface Engine {
    fun start(): String
}

class ElectricEngine : Engine {
    override fun start(): String {
        return "Electric engine started silently"
    }
}

class GasEngine : Engine {
    override fun start(): String {
        return "Gas engine started with vroom"
    }
}