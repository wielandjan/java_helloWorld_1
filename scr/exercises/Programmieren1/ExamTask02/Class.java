package exercises.Programmieren1.ExamTask02;

import java.util.List;
import java.util.ArrayList;

public class Class {
	private final String description;
	private final CourseOfStudies courseOfStudies;
	private final List<Lecture> lectures;
	private final List<Student> students;

	public Class(String description, CourseOfStudies courseOfStudies) {
		this.description = description;
		this.courseOfStudies = courseOfStudies;
		this.lectures = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	public String description() {
		return description;
	}

	public CourseOfStudies courseOfStudies() {
		return courseOfStudies;
	}

	public List<Lecture> lectures() {
		return lectures;
	}

	public List<Student> students() {
		return students;
	}

	public void addLecture(Lecture lecture) {
		this.lectures.add(lecture);
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public Lecture getLectureWithMostCreditPoints() {
		Lecture lectureWithMostCreditPoints = new Lecture("dummy", 0);
		for (Lecture lecture : lectures) {

			if (lecture.creditPoints() > lectureWithMostCreditPoints.creditPoints()) {
				lectureWithMostCreditPoints = lecture;
			}
		}
		return lectureWithMostCreditPoints;
	}

	public String toString() {
		String concatOfLectures = "";
		for (Lecture lecture : lectures) {
			concatOfLectures = concatOfLectures + lecture.toString() + ",";
		}
		concatOfLectures = concatOfLectures.substring(0, (concatOfLectures.length() - 1));

		String concatOfStudents = "";
		for (Student student : students) {
			concatOfStudents = concatOfStudents + student.toString() + ",";
		}
		concatOfStudents = concatOfStudents.substring(0, (concatOfStudents.length() - 1));

		return "[description=[" + description + "]," +
				"courseOfStudies=[" + String.valueOf(courseOfStudies) + "]," +
				"lectures=[" + concatOfLectures + "]," +
				"students=[" + concatOfStudents + "]]";
	}
}