package Assignment4

class ListOperations {

  def operateList(list: List[Int], operation: String): Int = {
    if (operation.equalsIgnoreCase("sum")) {
      sum(0, list)
    }
    else if (operation.equalsIgnoreCase("product")) {
      product(0, list)
    }
    else if (operation.equalsIgnoreCase("maximum")) {
      maximum(list)
    }
    else {
      -1
    }
  }

  def sum(i: Int, list: List[Int]): Int = {
    if (i < list.size) {
      list(i) + sum(i + 1, list)
    }
    else {
      0
    }
  }

  def product(i: Int, list: List[Int]): Int = {
    if (i < list.size) {
      list(i) * product(i + 1, list)
    }
    else {
      1
    }
  }

  def maximum(list: List[Int]): Int = {
    list match {
      case head :: head2 :: tail if (head >= head2) => maximum(head :: tail)
      case head :: head2 :: tail if (head < head2) => maximum(head2 :: tail)
      case head :: Nil => head
    }
  }

}

