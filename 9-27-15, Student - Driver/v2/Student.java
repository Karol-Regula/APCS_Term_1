public class Student{
    private String firstName;
    private String lastName;
    private int osis;
    private double age;
    private double gpa;
    private String identifier;
    
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
	System.out.println(firstName+" "+lastName);
	System.out.println("OSIS: "+osis);
	System.out.println("Age: "+age);
	System.out.println("GPA: "+gpa);
	System.out.println();
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
