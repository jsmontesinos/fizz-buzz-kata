package jsmontesinos

class FizzBuzz {
    fun  resolve(input: Int): String {
        val isDivisibleByThree = isDivisible(input, 3)
        val isDivisibleByFive = isDivisible(input, 5)
        var isDivisibleByThreeAndFive = isDivisibleByThree && isDivisibleByFive

        if (isDivisibleByThreeAndFive) return "FizzBuzz"
        else if (isDivisibleByThree) return "Fizz"
        else if (isDivisibleByFive) return "Buzz"
        else return input.toString()
    }

    private fun isDivisible(input: Int, divisor: Int) = input % divisor == 0
}