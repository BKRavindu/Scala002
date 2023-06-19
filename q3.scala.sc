def normalPayment(normalHourPay : Double, normalHoursCount : Double): Double ={
   val normalPay = normalHourPay*normalHoursCount*4
  normalPay
}

def otPayment(otHourPay : Double, otHourCount : Double):
Double ={
  val otPay = otHourPay*otHourCount*4
  otPay
}

def salaryWithOutTax(normalPay : Double, otPay : Double): Double ={
  val fullSalary = normalPay + otPay
  fullSalary
}

def taxAmount(fullSalary : Double): Double = {
  val tax = fullSalary*0.12
  tax
}

def takeHomeSalary(fullSalary : Double, tax : Double): Double = {
  val monthlySalary = fullSalary - tax
  monthlySalary
}

val normalHourPay = 250
val normalHourCount = 40
val otHourPay = 85
val otHourCount = 30

val a = normalPayment(normalHourPay, normalHourCount)
val b = otPayment(otHourPay, otHourCount)
val c = salaryWithOutTax(a, b)
val d = taxAmount(c)
val e = takeHomeSalary(c,d)

println(s"After the month salary he brings home is Rs.$e")