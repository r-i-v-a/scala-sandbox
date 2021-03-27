import scala.io.StdIn.readLine
import java.io._

object Main extends App {

	System.setIn(new FileInputStream("src/resources/in.txt"))
	System.setOut(new PrintStream(new FileOutputStream("src/resources/out.txt")))

	val cases = readLine().toInt

	// for (i <- 0 until cases) {
	// 	val caseLen = readLine()
	// 	val caseList = readLine()
	// }

	println(s"--> Number of cases ${cases}")
}
