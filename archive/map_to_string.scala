import java.io._

object Main extends App {

	// System.setIn(new FileInputStream("src/resources/in.txt"))
	// System.setOut(new PrintStream(new FileOutputStream("src/resources/out.txt")))

	val m = Map("a" -> "A", "b" -> "B")

	val s = m.map {
		case (key, value) => s" --property ${key}=${value}"
	}

	val s1 = s"""start ${s.mkString("")} end""" 

	println(s1)
}
