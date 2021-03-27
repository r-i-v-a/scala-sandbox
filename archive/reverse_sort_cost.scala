import scala.io.StdIn.readLine
import java.io._
import scala.collection.mutable.ArrayBuffer
import scala.collection.StringOps

object Main extends App {

	System.setIn(new FileInputStream("src/resources/in.txt"))
	System.setOut(new PrintStream(new FileOutputStream("src/resources/out.txt")))

	def reverseInterval(a: Array[Int], i: Int, j: Int): Array[Int] = {
		if (i < j) {
			var tmp = a(i)
			a(i) = a(j)
			a(j) = tmp
			reverseInterval(a, i+1, j-1)
		} else {
			a
		}
	}

	def calculateCost(a: Array[Int]): Int = {
		var b = a
		var cost = 0

		for (i <- 0 until b.length - 1) {
			var min = b(i)
			var minIdx = i
			for (j <- i until b.length) {
				if (b(j) < min) {
					min = b(j)
					minIdx = j
				}
			}

			cost += minIdx - i + 1
			b = reverseInterval(b, i, minIdx)
		}

		cost
	}

	val cases = readLine().toInt

	for (i <- 1 to cases) {
		val caseLen = readLine().toInt
		val caseList = readLine().split(" ").map(_.toInt)
		val caseCost = calculateCost(caseList)
		println(s"Case #${i}: ${caseCost}")
	}
}
