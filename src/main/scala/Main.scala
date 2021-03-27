import scala.io.StdIn.readLine
import java.io._
import scala.collection.mutable.ArrayBuffer
import scala.collection.StringOps

object Main extends App {

	System.setIn(new FileInputStream("src/resources/in.txt"))
	System.setOut(new PrintStream(new FileOutputStream("src/resources/out.txt")))

	def calculateCost(a: Array[Int]): Int = {
		a(0)
	}

	val cases = readLine().toInt

	for (i <- 0 until cases) {
		val caseLen = readLine().toInt
		val caseList = readLine().split(" ").map(_.toInt)
		val caseCost = calculateCost(caseList)
		println(s"--> Case cost ${caseCost}")
	}

	println(s"--> Number of cases ${cases}")
}
