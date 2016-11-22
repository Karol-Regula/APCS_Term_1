public class Student{
    public String firstName;
    public String lastName;
    public int osis;
    public double age;
    public double gpa;
    public String identifier;
    
    //defualt constructor
    public Student(){
	firstName = "Joe";
	lastName = "Gonzales";
	osis = 123456789;
	age = 16;
	gpa = 4.0;
    }
    //constructor that takes values
    public Student(String first, String last, int ID, double years, double grade){
	firstName = first;
	lastName = last;
	osis = ID;
	age = years;
	gpa = grade;
    }
    //method that prints out the student's info
    public void printStudent(){
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(osis);
	System.out.println(age);
	System.out.println(gpa);
    }
    //method that lowers gpa
    public void lowerGpa(double amount){
	gpa = gpa - amount;
	//could be += or -=
    }
    //method that increases gpa
    public void increaseGpa(double amount){
	gpa = gpa + amount;
    }

}
// Make the print statements prettier
//return instead of print
//make variables private
