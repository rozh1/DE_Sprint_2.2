class Employee(name: String, yearSalary: BigDecimal, bonusPercent: Double, foodCompensation: BigDecimal) {
  var YearSalary: BigDecimal = yearSalary
  var BonusPercent: Double = bonusPercent
  var FoodCompensation: BigDecimal = foodCompensation
  var Name: String = name

  def monthIncome(): BigDecimal = {
    (YearSalary * 0.87 + YearSalary * BonusPercent + FoodCompensation) / 12
  }

  def changeSalary(salaryChange: BigDecimal): Unit ={
    YearSalary += salaryChange
  }

  def indexSalary(percent: BigDecimal): Unit = {
    YearSalary += YearSalary*percent
  }
}
