package jsmontesinos

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class FizzBuzzTest : Spek({
    describe("FizzBuzzResolver") {
        it("should return 1 when input is 1") {
            var fizzBuzz = FizzBuzz()

            var result = fizzBuzz.resolve(1)

            assertEquals("1", result)
        }

        it("should return Fizz when input is 3") {
            var fizzBuzz = FizzBuzz()

            var result = fizzBuzz.resolve(3)

            assertEquals("Fizz", result)
        }

        it("should return Fizz when input is 6") {
            var fizzBuzz = FizzBuzz()

            var result = fizzBuzz.resolve(6)

            assertEquals("Fizz", result)
        }

        listOf(5, 10, 20).forEach { buzz ->
            it("should return Buzz when input is $buzz") {
                var fizzBuzz = FizzBuzz()

                var result = fizzBuzz.resolve(buzz)

                assertEquals("Buzz", result)
            }
        }

    }

})

class FizzBuzz {
    fun  resolve(input: Int): String {
        if (input % 3 == 0) return "Fizz"
        else if (input % 5 == 0) return "Buzz"
        else return input.toString()
    }
}
