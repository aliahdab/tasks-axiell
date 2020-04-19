package tasks;

public class task1 {

	public static void main(String[]args) {
		int i=20;
		int j=34;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("I = " + i);
		System.out.println("J = " + j);
	}
}




/*
Task 1
How do you swap two integers without using temp variable?
Assume you have two integers I = 20 and J = 34.
Your task is to write a program which demonstrates how you swap the variables without using any additional variable so that J = 20 and I = 34.
A solution which handles integer overflow gives an extra bonus
*/