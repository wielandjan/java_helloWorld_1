package exercises.Programmieren1.ExamTask02;

public enum CourseOfStudies {

	WI("Wirtschaftsinformatik"),
	INF("Informatik"),
	BWL("Betriebswirtschftslehre");

	private final String description;

	CourseOfStudies(String description) {
		this.description = description;
	}
}