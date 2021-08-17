// 3. B. Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer for every 1 second; second thread computes the square of the number and prints; third thread will print the value of cube of the number

import java.util.Random;

class SquareThread implements Runnable {
	int x;

	SquareThread(int x) {
		this.x = x;
	}

	public void run() {
		System.out.println("Thread Name:Square Thread and Square of " + x + " is: " + x * x);
	}
}

class CubeThread implements Runnable {
	int x;

	CubeThread(int x) {
		this.x = x;
	}

	public void run() {
		System.out.println("Thread Name:Cube Thread and Cube of " + x + " is: " + x * x * x);
	}
}

class RandomThread implements Runnable 
{
Random r;
	Thread t2, t3;

	public void run() {
		int num;
		r = new Random();
		try {

                    boolean flag=true;
                    int count=0;

			while (flag) {
				num = r.nextInt(100);
			System.out.println("Main Thread and Generated Number is " + num);
				t2 = new Thread(new SquareThread(num));
				t2.start();

				t3 = new Thread(new CubeThread(num));
				t3.start();

				Thread.sleep(1000);
				System.out.println("--------------------------------------");
                                count++;
                                        if (count==10)
                                            flag=false;
			}
		} catch (Exception ex) {
			System.out.println("Interrupted Exception");
		}
	}
}


public class MainThread {
	public static void main(String[] args) {

		RandomThread thread_obj = new RandomThread();
		Thread t1 = new Thread(thread_obj);
		t1.start();
	}
}

Output:
Main Thread and Generated Number is 73
Thread Name:Square Thread and Square of 73 is: 5329
Thread Name:Cube Thread and Cube of 73 is: 389017
--------------------------------------
Main Thread and Generated Number is 96
Thread Name:Square Thread and Square of 96 is: 9216
Thread Name:Cube Thread and Cube of 96 is: 884736
--------------------------------------
Main Thread and Generated Number is 30
Thread Name:Square Thread and Square of 30 is: 900
Thread Name:Cube Thread and Cube of 30 is: 27000
--------------------------------------
Main Thread and Generated Number is 77
Thread Name:Square Thread and Square of 77 is: 5929
Thread Name:Cube Thread and Cube of 77 is: 456533
--------------------------------------
Main Thread and Generated Number is 63
Thread Name:Square Thread and Square of 63 is: 3969
Thread Name:Cube Thread and Cube of 63 is: 250047
--------------------------------------
Main Thread and Generated Number is 97
Thread Name:Square Thread and Square of 97 is: 9409
Thread Name:Cube Thread and Cube of 97 is: 912673
--------------------------------------
Main Thread and Generated Number is 75
Thread Name:Square Thread and Square of 75 is: 5625
Thread Name:Cube Thread and Cube of 75 is: 421875
--------------------------------------
Main Thread and Generated Number is 79
Thread Name:Square Thread and Square of 79 is: 6241
Thread Name:Cube Thread and Cube of 79 is: 493039
--------------------------------------
Main Thread and Generated Number is 22
Thread Name:Square Thread and Square of 22 is: 484
Thread Name:Cube Thread and Cube of 22 is: 10648
--------------------------------------
Main Thread and Generated Number is 31
Thread Name:Square Thread and Square of 31 is: 961
Thread Name:Cube Thread and Cube of 31 is: 29791
--------------------------------------
Main Thread and Generated Number is 37
Thread Name:Square Thread and Square of 37 is: 1369
Thread Name:Cube Thread and Cube of 37 is: 50653
--------------------------------------
Main Thread and Generated Number is 98
Thread Name:Square Thread and Square of 98 is: 9604
Thread Name:Cube Thread and Cube of 98 is: 941192
--------------------------------------
Main Thread and Generated Number is 9
Thread Name:Square Thread and Square of 9 is: 81
Thread Name:Cube Thread and Cube of 9 is: 729
--------------------------------------
 
