fun main() {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed : Boolean = true  // new variable
    val isImmortal = false

    //Aura
    // if a player is blessed and their health is above 50, or if they are immortal
    if (isBlessed && healthPoints > 50 || isImmortal){
        println("GREEN")
    }else{
        println("NONE")
    }
    if (healthPoints == 100){
        println(name + " is in excellent condition!")
     } else if (healthPoints >= 90) {
     println(name + " has a few scratches.")
     } else if (healthPoints >= 75) { // track whether a player is blessed
       if (isBlessed) {
       println(name + " has some minor wounds but is healing quite quickly!")
     } else
       println(name + " has some minor wounds.")
     } else if (healthPoints >= 15) {
        println(name + " looks pretty hurt.")
     } else {
        println(name + " is in awful condition!")
    }
}