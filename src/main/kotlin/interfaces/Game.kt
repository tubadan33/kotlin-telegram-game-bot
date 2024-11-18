package game.bot.interfaces

import game.bot.secret.hitler.Player

interface Game {
    val chatId: String
    val players: List<Player>
}
