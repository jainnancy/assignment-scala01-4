package Assignment4

import org.apache.log4j.Logger

object HigherNTail extends App {
  val log = Logger.getLogger(this.getClass)

  //Question 1
  val calculate = new Operations
  val val1 = 3
  val val2 = 5
  val intSum = calculate.sum((a, b) => (a + b), val1, val2)
  log.info(s"Sum of Integers $val1 and $val2 = $intSum \n")
  val squareSum = calculate.sum((a, b) => (a * a + b * b), val1, val2)
  log.info(s"Sum of Squares of $val1 and $val2 = $squareSum \n")
  val cubeSum = calculate.sum((a, b) => (a * a + b * b), val1, val2)
  log.info(s"Sum of Cubes of $val1 and $val2 = $squareSum \n")

  //Question 2
  val list = List(2, 3, 1, 6, 8)
  val sumObject = new ListOperations
  val listSum = sumObject.operateList(list, "sum")
  log.info(s"\nSum of elements in list is $listSum ")
  val listProduct = sumObject.operateList(list, "product")
  log.info(s"\nProduct of elements in list is $listProduct ")
  val listMax = sumObject.operateList(list,"maximum")
  log.info(s"\nMaximum of elements in list is $listMax \n")

}
