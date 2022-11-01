object App {
  def main(args: Array[String]): Unit = {
    val str = "Hello, Scala!"
    println(str)
    println(str.reverse)
    println(str.toLowerCase)
    println(str.replace("l", ""))
    println(str.substring(0, str.length-1) + " and goodbye python!")

    var employee = new Employee("Сотрудник 1", 1_000_000, 0.25, 50_000)
    println("yearSalary: " + employee.YearSalary + ", bonusPercent: " + employee.BonusPercent + ", foodCompensation: " + employee.FoodCompensation)
    println(employee.monthIncome())

    val departament = new Departament("IT")
    departament.addEmployee(employee)
    employee.YearSalary = 100
    employee.FoodCompensation = 5
    departament.addEmployee(new Employee("Сотрудник 2", 150, employee.BonusPercent, employee.FoodCompensation))
    departament.addEmployee(new Employee("Сотрудник 3", 200, employee.BonusPercent, employee.FoodCompensation))
    departament.addEmployee(new Employee("Сотрудник 4", 80, employee.BonusPercent, employee.FoodCompensation))
    departament.addEmployee(new Employee("Сотрудник 5", 120, employee.BonusPercent, employee.FoodCompensation))
    departament.addEmployee(new Employee("Сотрудник 6", 75, employee.BonusPercent, employee.FoodCompensation))
    departament.deviation()

    employee = departament.getEmployee("Сотрудник 3")
    if (employee != null){
      print("before change:")
      println(employee.monthIncome())
      employee.changeSalary(-20)
      print("after change:")
      println(employee.monthIncome())
    }

    print("min salary:")
    println(departament.minSalary())

    print("max salary:")
    println(departament.maxSalary())

    departament.addEmployee(new Employee("Сотрудник 7", 350, employee.BonusPercent, employee.FoodCompensation))
    departament.addEmployee(new Employee("Сотрудник 8", 90, employee.BonusPercent, employee.FoodCompensation))
    departament.sort()
    departament.printEmployees()

    departament.addEmployee(new Employee("Сотрудник 9", 130, employee.BonusPercent, employee.FoodCompensation))
    departament.printEmployees()

    val middle = departament.getMiddle(8,12)
    middle.foreach(e=>println(e.Name))

    departament.indexSalary(0.07)
    departament.printEmployees()
  }

}
