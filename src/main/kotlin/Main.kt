package game.bot

import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

fun main() {
    val modules = module {
        singleOf(::TelegramBotImpl)
    }

    startKoin {
        modules(modules)
    }
}
