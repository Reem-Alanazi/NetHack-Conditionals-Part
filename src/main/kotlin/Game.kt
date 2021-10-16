fun main() {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed : Boolean = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible){
        println("GREEN")
    } else{
        println("NONE")
    }
//  Using a conditional expression
    val healthStatus: String = if (healthPoints == 100){
        (" is in excellent condition!")
    } else if (healthPoints >= 90) {
        (" has a few scratches.")
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            (" has some minor wounds but is healing quite quickly!")
        } else {
            (" has some minor wounds.") }
    } else if (healthPoints >= 15) {
        (" looks pretty hurt.")
    } else {
        (" is in awful condition!")
    }
    //Player status
    println(name + " " + healthStatus)
}

