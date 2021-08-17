// 2.A.	Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract (period). Write a Java program to read and display at least 3 staff objects of all three categories.


import java.util.Scanner;

class Staff {
	String StaffID, Name, Phone, Salary;

	Scanner input = new Scanner(System.in);

	void read() {
		System.out.println("Enter StaffID");
		StaffID = input.nextLine();

		System.out.println("Enter Name");
		Name = input.nextLine();

		System.out.println("Enter Phone");
		Phone = input.nextLine();

		System.out.println("Enter Salary");
		Salary = input.nextLine();
	}

	void display() {
		System.out.printf("\n%-15s", "STAFFID: ");
		System.out.printf("%-15s \n", StaffID);
		System.out.printf("%-15s", "NAME: ");
		System.out.printf("%-15s \n", Name);
		System.out.printf("%-15s", "PHONE:");
		System.out.printf("%-15s \n", Phone);
		System.out.printf("%-15s", "SALARY:");
		System.out.printf("%-15s \n", Salary);
	}
}


class Teaching extends Staff {
	String Domain, Publication;

	void read_Teaching() {
		super.read(); // call super class read method
		System.out.println("Enter Domain");
		Domain = input.nextLine();
		System.out.println("Enter Publication");
		Publication = input.nextLine();	
	}

	void display() {
		super.display(); // call super class display() method
		System.out.printf("%-15s", "DOMAIN:");
		System.out.printf("%-15s \n", Domain);
		System.out.printf("%-15s", "PUBLICATION:");
		System.out.printf("%-15s \n", Publication);
	}
}


class Technical extends Staff {
	String Skills;

	void read_Technical() {
		super.read(); // call super class read method
		System.out.println("Enter Skills");
		Skills = input.nextLine();
	}

	void display() {
		super.display(); // call super class display() method
		System.out.printf("%-15s", "SKILLS:");
		System.out.printf("%-15s \n", Skills);
	}
}


class Contract extends Staff {
	String Period;

	void read_Contract() {
		super.read(); // call super class read method
		System.out.println("Enter Period");
		Period = input.nextLine();
	}

	void display() {
		super.display(); // call super class display() method
		System.out.printf("%-15s", "PERIOD:");
		System.out.printf("%-15s \n", Period);
	}
}

class Staffdetails {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of staff details to be created");
		int n = input.nextInt();

		Teaching steach[] = new Teaching[n];
		Technical stech[] = new Technical[n];
		Contract scon[] = new Contract[n];

		// Read Staff information under 3 categories

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Teaching staff information");
			steach[i] = new Teaching();
			steach[i].read_Teaching();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Technical staff information");
			stech[i] = new Technical();
			stech[i].read_Technical();
		}

		for (int i = 0; i < n; i++) {

			System.out.println("Enter Contract staff information");
			scon[i] = new Contract();
			scon[i].read_Contract();
		}

		// Display Staff Information
		System.out.println("\n STAFF DETAILS: \n");
		System.out.println("-----TEACHING STAFF DETAILS----- ");

		for (int i = 0; i < n; i++) {
			steach[i].display();
		}

		System.out.println();
		System.out.println("-----TECHNICAL STAFF DETAILS-----");
		for (int i = 0; i < n; i++) {
			stech[i].display();
		}

		System.out.println();
		System.out.println("-----CONTRACT STAFF DETAILS-----");
		for (int i = 0; i < n; i++) {
			scon[i].display();
		}
		
		input.close();
	}
}

Output:
run:
Enter number of staff details to be created
3
Enter Teaching staff information
Enter StaffID
11
Enter Name
aaa
Enter Phone
9999900000
Enter Salary
100000
Enter Domain
Network
Enter Publication
4
Enter Teaching staff information
Enter StaffID
22
Enter Name
BBB
Enter Phone
9999911111
Enter Salary
100000
Enter Domain
Java
Enter Publication
3
Enter Teaching staff information
Enter StaffID
33
Enter Name
CCC
Enter Phone
9999922222
Enter Salary
100000
Enter Domain
C++
Enter Publication
5
Enter Technical staff information
Enter StaffID
44
Enter Name
DDD
Enter Phone
9999933333
Enter Salary
10000
Enter Skills
Programing
Enter Technical staff information
Enter StaffID
55
Enter Name
EE
Enter Phone
9999944444
Enter Salary
20000
Enter Skills
C++ Prog
Enter Technical staff information
Enter StaffID
66
Enter Name
FF
Enter Phone
9999966666
Enter Salary
30000
Enter Skills
Java Prog
Enter Contract staff information
Enter StaffID
77
Enter Name
XYZ
Enter Phone
9999977777
Enter Salary
10000
Enter Period
4
Enter Contract staff information
Enter StaffID
88
Enter Name
GGG
Enter Phone
9999988888
Enter Salary
10000
Enter Period
3
Enter Contract staff information
Enter StaffID
99
Enter Name
HHH
Enter Phone
99999010101
Enter Salary
20000
Enter Period
5

 STAFF DETAILS: 

-----TEACHING STAFF DETAILS----- 

STAFFID:       11              
NAME:          aaa             
PHONE:         9999900000      
SALARY:        100000          
DOMAIN:        Network         
PUBLICATION:   4               

STAFFID:       22              
NAME:          BBB             
PHONE:         9999911111      
SALARY:        100000          
DOMAIN:        Java            
PUBLICATION:   3               

STAFFID:       33              
NAME:          CCC             
PHONE:         9999922222      
SALARY:        100000          
DOMAIN:        C++             
PUBLICATION:   5               

-----TECHNICAL STAFF DETAILS-----

STAFFID:       44              
NAME:          DDD             
PHONE:         9999933333      
SALARY:        10000           
SKILLS:        Programing      

STAFFID:       55              
NAME:          EE              
PHONE:         9999944444      
SALARY:        20000           
SKILLS:        C++ Prog        

STAFFID:       66              
NAME:          FF              
PHONE:         9999966666      
SALARY:        30000           
SKILLS:        Java Prog       

-----CONTRACT STAFF DETAILS-----

STAFFID:       77              
NAME:          XYZ             
PHONE:         9999977777      
SALARY:        10000           
PERIOD:        4               

STAFFID:       88              
NAME:          GGG             
PHONE:         9999988888      
SALARY:        10000           
PERIOD:        3               

STAFFID:       99              
NAME:          HHH             
PHONE:         99999010101     
SALARY:        20000           
PERIOD:        5               
BUILD SUCCESSFUL (total time: 4 minutes 32 seconds)

 
