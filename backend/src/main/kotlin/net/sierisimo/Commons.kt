package net.sierisimo

private var currentAvailablePort = 8080
fun getAvailablePort(): Int = currentAvailablePort++