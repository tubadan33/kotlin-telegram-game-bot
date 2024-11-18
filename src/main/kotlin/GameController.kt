package game.bot

import game.bot.interfaces.Game
import game.bot.interfaces.TelegramBot


class GameController(bot: TelegramBot) {
    private val gamesList = emptyList<Game>()
}
