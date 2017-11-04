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
            assertEquals(1, result)
        }
    }

})

class FizzBuzz {
    fun  resolve(input: Int): Int = 1
}
