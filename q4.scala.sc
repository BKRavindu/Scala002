def increaseParticipent(performanceCost : Double, participant : Int, onePersonCost : Int): Double ={
   val increaseDayCost= performanceCost+participant*onePersonCost
  increaseDayCost
}

def decreaseParticipent(performanceCost : Double, participant : Int, onePersonCost : Int): Double ={
  val decreaseDayCost= performanceCost+participant*onePersonCost
  decreaseDayCost
}

def increaseDayTicketReduseCost(reduseCost:Int, participant : Int ): Double ={
  val reduseValue = reduseCost*participant
  reduseValue
}

def decreaseDayTicketReduseCost(increaseCost:Int, participant : Int ): Double ={
  val increaseValue = increaseCost*participant
  increaseValue
}

def differenceOfAttendance(increaseDay:Int , decreaseDay: Int): Int ={
  val defference=increaseDay-decreaseDay
  defference
}

def bestTicketPrice(x : Double, y : Double, z: Double, v:Double, w:Double): Double ={
  val ticketPrice = (x + y + z - v)/w
  ticketPrice
}

val a =increaseParticipent(500, 140, 3)
val b =decreaseParticipent(500, 100, 3)
val c = increaseDayTicketReduseCost(5, 140)
val d = decreaseDayTicketReduseCost(5, 100)
val e = differenceOfAttendance(140, 100)
val f = bestTicketPrice(a, c, d, b, e)

println(s"Ticket Price should be : Rs.$f")
