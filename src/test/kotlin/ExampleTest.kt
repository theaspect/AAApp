import org.spekframework.spek2.Spek

object ExampleTest : Spek({
    beforeGroup {
        println("before root")
    }

    group("some group") {
        beforeEachTest {
            println("before each test")
        }
        test("some test") {
            println("some test")
        }

        test("another test") {
            println("another test")
        }

        afterEachTest {
            println("after each test")
        }
    }

    afterGroup {
        println("after root")
    }
})
