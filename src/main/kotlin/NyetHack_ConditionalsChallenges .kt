fun main() {

    val name = "Madrigal"
    var healthPoints = 57
    val isBlessed : Boolean = true
    val isImmortal = false

    //Enhancing the Aura
    //Formula To determine the player’s karma value from 0 to 20
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val auraColor : String  = if (auraVisible && karma in 20 ..16){
        "green"
     }  else if (karma in 11..15 ) {
        "purple"
      } else if (karma in 6..10) {
        "orange"
      } else if (karma in 0..5) {
          "red" }
    else {
        "None"
    }
    val healthStatus: String = when (healthPoints){

        100 -> ("is in excellent condition!")
        in 90..99 -> ("has a few scratches.")
        in 75..89-> if (isBlessed) {
            ("has some minor wounds but is healing quite quickly!")
        } else { ("has some minor wounds.") }
        in 15 ..89 -> ("looks pretty hurt.")
        else -> ("is in awful condition!") }

    println("(Aura: $auraColor)" + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

}

