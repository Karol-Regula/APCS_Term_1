public class Driver{
    public static void main(String[]args){
	//constructors
	Student s = new Student();
	Student s1 = new Student("James", "Kirk", 111222333, 100.5, 4.1);
	s.printStudent();
	s1.printStudent();
	s1.lowerGpa(1.5);
	s1.printStudent();
	s1.increaseGpa(50);
	s1.printStudent();
    }
}
