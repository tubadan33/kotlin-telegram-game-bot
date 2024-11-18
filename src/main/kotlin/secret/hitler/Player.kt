package game.bot.secret.hitler

data class Player(val userId: String, val name: String) {
    var alive: Boolean = true
    var role: String? = null
    var party: String? = null
}

fun Player.assignRole(role: String) {
    this.role = role
    this.party = if (role.equals("fascist")) "fasist" else "liberal"
}

fun Player.kill() {
    this.alive = false
}
