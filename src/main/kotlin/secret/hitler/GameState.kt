package game.bot.secret.hitler

data class GameState(
    val playerSet: PlayerSet,
    val gamePhase: GamePhase = GamePhase.WAITING_FOR_PLAYERS,
    val liberalTrack: Int = 0,
    val fascistTrack: Int = 0,
    val failedVotes: Int = 0,
    val president: String? = null,
    val chancellor: String? = null,
    val nominatedPresident: String? = null,
    val nominatedChancellor: String? = null,
    val gameEndCode: Int = 0,
    val policies: List<String> = Constants.policies,
    val discards: List<String> = emptyList(),
    val playerSequence: List<Player> = emptyList(),
    val notHitlers: List<Player> = emptyList(),
)

fun GameState.shufflePolicies(): List<String> {
    return this.policies.shuffled()
}

fun GameState.printBoard(): String {
    val board = "\n--- ${Constants.gameStrings["Liberal"]} ---\n"
    for (i in IntRange(0, 4)) {
        if (i < this.liberalTrack) {
            board.plus("\\u2716\\uFEOF" + " ")
        }
        else if (i == 4) {
            board.plus("\\u0001F54A" + " ")
        }
        else {
            board.plus("\\u25FB\\uFE0F" + " ")
        }
    }
    board.plus("\n--- ${Constants.gameStrings["Fascist"]} ---\n")
    for (i in IntRange(0, 5)) {
        if (i < this.fascistTrack) {
            board.plus("\\u2716\\uFEOF" + " ")
        }
        else {
            val action = this.playerSet.actions[i]
            if (action.isEmpty()) {
                board.plus("\\u25FB\\uFE0F" + " ")
            }
            if (action == "inspect") {
                board.plus("\\U0001F50E" + " ")
            }
            if (action == "policy") {
                board.plus("\\U0001F52E" + " ")
            }
            if (action == "choose") {
                board.plus("\\U0001F454" + " ")
            }
            if (action == "kill") {
                board.plus("\\U0001F5E1" + " ")
            }
            if (action == "win") {
                board.plus("\\U0001F454" + " ")
            }
        }
    }
    board.plus("\n--- Election Counter ---\n")
    for (i in IntRange(0, 2)) {
        if (i < this.failedVotes) {
            board.plus("\\u2716\\uFE0F" + " ")
        }
        else {
            board.plus("\\u25FB\\uFE0F" + " ")
        }
    }
    board.plus("\n--- Presidential Order ---\n")
    this.playerSequence.forEach { it ->
        board.plus("${it.name} \\u27A1\\uFE0F" + " ")
    }
    board.plus("\n\n There are ${this.policies.size} policies left on the draw pile.")
    if (this.fascistTrack >= 3) {
        board.plus("\n\n \\u203C\\uFE0F Beware: if ${Constants.gameStrings["Hitler"]} gets elected as Chancellor the ${Constants.gameStrings["Fascists"]} win!")
    }
    if (this.notHitlers.isNotEmpty()) {
        board.plus("\n\n We know that the following players are not ${Constants.gameStrings["Hitler"]} because they got elected Chancellor after 3 ${Constants.gameStrings["Fascist"]} policies: \n")
        this.notHitlers.forEach { it ->
            board.plus("${it.name}, ")
        }
    }
    return board
}
