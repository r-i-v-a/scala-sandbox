import java.io._

object Main extends App {

	// System.setIn(new FileInputStream("src/resources/in.txt"))
	// System.setOut(new PrintStream(new FileOutputStream("src/resources/out.txt")))

	val a = Array("A", "B", "C", "D")

	val fl = a.foldLeft("X")((a, b) => a + b)
	val fr = a.foldRight("X")((a, b) => a + b)

	println(s"foldLeft ${fl}")
	println(s"foldRight ${fr}")
}
