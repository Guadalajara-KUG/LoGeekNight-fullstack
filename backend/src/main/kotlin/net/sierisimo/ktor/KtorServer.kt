package net.sierisimo.ktor

import net.sierisimo.getAvailablePort
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.host.embeddedServer
import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.get
import org.jetbrains.ktor.routing.routing

fun main(args: Array<String>) {
    embeddedServer(Netty, getAvailablePort()) {
        routing {
            get("/") {
                call.respondText("Hello Ktor", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}