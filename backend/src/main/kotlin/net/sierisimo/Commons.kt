package net.sierisimo

private var currentAvailablePort = 8081
fun getAvailablePort(): Int = currentAvailablePort++