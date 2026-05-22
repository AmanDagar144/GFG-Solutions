class Solution:
    def fizzBuzz(self, number):
        # code he 
        if number % 5==0 and number%3==0:
            print("FizzBuzz")
        elif number % 3 == 0:
            print("Fizz")
        elif number % 5 == 0:
            print("Buzz")
        else:
            print(number)
             