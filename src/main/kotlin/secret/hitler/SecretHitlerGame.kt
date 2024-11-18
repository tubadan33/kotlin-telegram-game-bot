package game.bot.secret.hitler

import game.bot.interfaces.Game

data class SecretHitlerGame(
    override val chatId: String,
    val state: GameState = GameState(),
    override val players: List<Player> = emptyList(),
    var playerSequence: List<Player> = emptyList(),
) : Game

fun SecretHitlerGame.shufflePlayers() {
    this.playerSequence = this.players.shuffled()
}

fun SecretHitlerGame.addPlayer(player: Player) {
    this.players.plus(player)
}
