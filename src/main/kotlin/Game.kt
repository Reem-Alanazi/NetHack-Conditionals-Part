fun main() {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed : Boolean = true
    val isImmortal = false

    //Arua
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"


    val healthStatus: String = when (healthPoints ){

       100 -> ("is in excellent condition!")
       in 90..99 -> ("has a few scratches.")
       in 75..89-> if (isBlessed) {
       ("has some minor wounds but is healing quite quickly!")
       } else { ("has some minor wounds.") }
       in 15 ..89 -> ("looks pretty hurt.")
       else -> ("is in awful condition!") }

    // Formatting the isBlessed status with a string expression
    // Player status
       println("(Aura: $auraColor)" + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
       println("$name $healthStatus")


}

