import  org.scalatest.FunSuite
import demo.Hello;

class HelloTest extends FunSuite {

    test("sayHello method correctly?") {

      val hello = new Hello;
      assert(hello.sayHello("Scala") == "Hello, Scala!")

    }


}
