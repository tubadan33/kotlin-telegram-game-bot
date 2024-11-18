package game.bot.secret.hitler


object Constants {
    val defaultGameStrings: Map<String, String> = mapOf(
        "Hitler" to "Hitler",
        "Liberals" to "Liberals",
        "Liberal" to "Liberal",
        "Fascists" to "Fascists",
        "Fascist" to "Fascist"
    )

    val christmasGameStrings: Map<String, String> = mapOf(
        "Hitler" to "Santa",
        "Liberals" to "Niceists",
        "Liberal" to "Niceist",
        "Fascists" to "Naughtists",
        "Fascist" to "Naughtist"
    )

    val halloweenGameStrings: Map<String, String> = mapOf(
        "Hitler" to "Headless Horseman",
        "Liberals" to "Treats",
        "Liberal" to "Treat",
        "Fascists" to "Tricks",
        "Fascist" to "Trick"
    )

    val gameStrings = halloweenGameStrings

    val playerSets: Map<Int, PlayerSet> = mapOf(
        5 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("", "", "policy", "kill", "kill", "win")
        ),
        6 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("", "", "policy", "kill", "kill", "win")
        ),
        7 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("", "inspect", "choose", "kill", "kill", "win")
        ),
        8 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("", "inspect", "choose", "kill", "kill", "win")
        ),
        9 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("inspect", "inspect", "choose", "kill", "kill", "win")
        ),
        10 to PlayerSet(
            listOf(
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Liberal"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Fascist"),
                gameStrings.getValue("Hitler")
            ),
            listOf("inspect", "inspect", "choose", "kill", "kill", "win")
        ),
    )

    val policies = listOf<String>(
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Liberal"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
        gameStrings.getValue("Fascist"),
    )
}

fun Constants.getPlayerSet(numPlayers: Int): PlayerSet {
    return playerSets[numPlayers]!!
}

data class PlayerSet(
    val roles: List<String>,
    val actions: List<String>,
)
