package exercises.Programmieren1.ExamTask02;

public class ExamTask02 {
	public static void main(String[] args) {

		Class class1 = new Class("Kurs1", CourseOfStudies.WI);
		class1.addLecture(new Lecture("Recht", 5));
		class1.addLecture(new Lecture("Programmieren", 4));

		class1.addStudent(new Student("12345", "Jan"));
		class1.addStudent(new Student("67563", "Felix"));

		System.out.println(class1.toString());
		System.out.println(class1.getLectureWithMostCreditPoints().toString());

	}

}