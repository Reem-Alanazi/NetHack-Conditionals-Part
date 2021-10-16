fun main() {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed : Boolean = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
     println(auraColor)

    val healthStatus: String = if (healthPoints == 100){
        ("is in excellent condition!")
        // Refactoring healthStatus with ranges (in 1..5)
    } else if (healthPoints in 90..99) {
        ("has a few scratches.")
        //Another type of range (in 5 downTo 1 )
    } else if (healthPoints in 89 downTo 75) {
        if (isBlessed) {
            ("has some minor wounds but is healing quite quickly!")
        } else {
            ("has some minor wounds.") }
        //Another type of range (in 5 until 1)
    } else if (healthPoints in 74 until 15) {
        ("looks pretty hurt.")
    } else {
        ("is in awful condition!")
    }

    println(name + " " + healthStatus)
}

