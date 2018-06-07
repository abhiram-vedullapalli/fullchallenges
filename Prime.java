import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int limit = sc.nextInt();
		System.out.println("Enter any two numbers between 1 and 9  ");
		System.out.println("Enter first number :");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second number : ");
		int secondNumber = sc.nextInt();
		int[] num = new int[limit];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		System.out.println("Numbers in Limit " + limit + " are : " + Arrays.toString(num));
		ArrayList<Integer> not = divisibility(num, limit, firstNumber, secondNumber);
		System.out.println(
				"The numbers which are not divisible by " + firstNumber + " and " + secondNumber + " are : " + not);
		ArrayList<Integer> primenumbers = prime(not);
		System.out.println("The Prime Numbers are : " + primenumbers);
	}

	public static ArrayList<Integer> divisibility(int arr[], int limit, int a, int b) {
		ArrayList<Integer> notDiv = new ArrayList<Integer>(limit);
		for (int j = 0; j < arr.length; j++) {
			int c = arr[j] % a;
			int d = arr[j] % b;
			if (c != 0 && d != 0) {
				notDiv.add(arr[j]);
			}
		}
		return notDiv;
	}

	public static ArrayList<Integer> prime(ArrayList<Integer> p) {
		ArrayList<Integer> prime = new ArrayList<Integer>(p.size());

		for (int i = 0; i < p.size(); i++) {
			int c = p.get(i);
			boolean flag = true;
			if (c == 1) {
				flag = false;
			}
			for (int j = 2; j < c; j++) {
				if (c % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				prime.add(c);
			}

		}
		return prime;
	}
}
