/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/
import java.util.*;
public class fizzBuzz {
	public static List<String> fizzBuzz(int n) {
		// int n = n;
		if (n == 0) {return null;}

		List<String> list = new ArrayList<String>();
		for(int i = 1; i < (n + 1); i++) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l = fizzBuzz(45);
		ListIterator<String> itr = null;
		itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}
}