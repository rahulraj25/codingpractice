package practice.msci;

import java.util.function.Function;

/*
Write custom functional interface to validate, -
        Rules of the FizzBuzz Game
        The rules of the FizzBuzz game are very simple.
        Say Fizz if the number is divisible by 3.
        Say Buzz if the number is divisible by 5.Say FizzBuzz if the number is divisible by both 3 and 5.Return the number itself, if the number is not divisible by 3 and 5.
*/
public class FizzBuzz implements FizzBuzzInterface{

    Function<Integer,String> func = (s) -> {
        if(s%3==0 && s%5==0){
            return "FizzBuzz";
        }else if(s%3==0)
            return "Fizz";
        else
            return "Buzz";
    };

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.getOutput(5));
        System.out.println(fizzBuzz.getOutput(3));
        System.out.println(fizzBuzz.getOutput(1));
        System.out.println(fizzBuzz.getOutput(15));
    }

    @Override
    public String getOutput(int num) {
        return func.apply(num);
    }
}
