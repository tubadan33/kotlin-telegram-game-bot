package game.bot

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import game.bot.interfaces.TelegramBot

class TelegramBotImpl() : TelegramBot {
    private val botToken = System.getenv("TELEGRAM_BOT_TOKEN")
    var bot: Bot = bot {
        token = botToken
    }
}
