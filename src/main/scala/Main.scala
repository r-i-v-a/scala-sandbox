import scala.io.Source

object Main extends App {
	println("Hello world.")

	val filename="src/resources/in.txt"

	for (line <- Source.fromFile(filename).getLines) {
		println(line)
	}
}
