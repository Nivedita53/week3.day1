package week3.day1;

public class StudentsDetails extends Students {

	public static void main(String[] args) {

		StudentsDetails overloadingExample = new StudentsDetails();
		overloadingExample.getStudentInfo(1);
		overloadingExample.getStudentInfo(1, "test@gmail.com");
		overloadingExample.getStudentInfo(999999999, "test@gmail.com");

	}

}
