package app.utiltek.practicakotlin

//esta clase me provee de la lista de heroes
class HeroeProvider {

    //companion para poder obtener esta lista desde otro lado
    companion object{
        var listaHeroes= listOf<Heroe>(
            Heroe(
                "superMan",
                "Jetbraind",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),
            Heroe(
                "batman",
                "Jetbraind",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),
            Heroe(
                "mujer maravilla",
                "Jetbraind",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),
            Heroe(
                "hombre araña",
                "Jetbraind",
                "AristiDevs",
                "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
            ),

            )

    }
}