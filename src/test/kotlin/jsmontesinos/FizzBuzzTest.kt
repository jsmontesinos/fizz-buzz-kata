package jsmontesinos

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class FizzBuzzTest : Spek({
    describe("FizzBuzzResolver") {
        listOf(1, 2, 4).forEach { input ->
            it("should return the input when input is $input") {
                var fizzBuzz = FizzBuzz()

                var result = fizzBuzz.resolve(input)

                assertEquals(input.toString(), result)
            }
        }

        listOf(3, 6, 9).forEach { input ->
            it("should return Fizz when input is $input") {
                var fizzBuzz = FizzBuzz()

                var result = fizzBuzz.resolve(input)

                assertEquals("Fizz", result)
            }
        }

        listOf(5, 10, 20).forEach { input ->
            it("should return Buzz when input is $input") {
                var fizzBuzz = FizzBuzz()

                var result = fizzBuzz.resolve(input)

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
