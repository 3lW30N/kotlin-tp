package fr.epf.sni.gc.model

enum class Gender { MAN, WOMAN }

data class Client (
    var lastName: String,
    var firstName: String,
    val gender: Gender) {

    companion object {
        fun generateClients(nb: Int = 20) = (1..nb).map {
            Client("nom${it}", "prenom${it}", if (it % 3 == 0) Gender.MAN else Gender.WOMAN)
        }
    }
}

fun generateClients(nb: Int = 20) = (1..nb).map {
    Client("nom${it}", "prenom${it}", if (it%3==0) Gender.MAN else Gender.WOMAN)
}