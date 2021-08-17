// 1.	A. Create a Java class called Student with the following details as variables within it. (i)USN (ii)Name (iii)Branch (iv)Phone. Write a Java program to create ‘n’ Student objects and print the USN, Name, Branch, and Phone of these objects with suitable headings.
// import java.util.Scanner;

class Student {

	String USN, Name, Branch, Phone;

	Scanner input = new Scanner(System.in);

	void read() {
		System.out.println("Enter Student Details");
		System.out.println("Enter USN");
		USN = input.nextLine();

		System.out.println("Enter Name");
		Name = input.nextLine();

		System.out.println("Enter Branch");
		Branch = input.nextLine();

		System.out.println("Enter Phone");
		Phone = input.nextLine();
	}

	void display() {
		System.out.printlnUSN+”\t”+ Name+”\t”+Branch+”\t”+Phone);
	}
}

class studentdetails {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of student details to be created");
		int number = input.nextInt();

		Student s[] = new Student[number];

		// Read student details into array of student objects

		for (int i = 0; i < number; i++) {
			s[i] = new Student();
			s[i].read();
		}

		// Display student information

		System.out.println( "USN\tNAME\tBRANCH\tPHONE");
		for (int i = 0; i < number; i++) {
			System.out.println();
			s[i].display();
		}
	 input.close();
	}
}

Output:
Enter Number of Students: 3
Enter Student Details
Enter Student USN: 1DT14cs001
Enter Student NAME: AAA
Enter Student BRANCH: CSE
Enter Student PHONENUMBER: 9999900000
Enter Student Details
Enter Student USN:1DT14cs002
Enter Student NAME: BBB
Enter Student BRANCH: CSE
Enter Student PHONENUMBER: 9999911111
Enter Student Details
Enter Student USN: 1DT14CS003
Enter Student NAME: CCC
Enter Student BRANCH: CSE
Enter Student PHONENUMBER: 9999922222
USN                	NAME        	BRANCH        PHONENUMBER
1DT14cs001        	AAA         	CSE         	9999900000
1DT14cs002        	BBB         	CSE         	9999911111
1DT14CS003        	CCC         	CSE         	9999922222
