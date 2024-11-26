package exercises.Programmieren1.ExamTask02;

public class Student {
	private final String matriculationNumber;
	private final String name;

	public Student(String matriculationNumber, String name) {
		this.matriculationNumber = matriculationNumber;
		this.name = name;
	}

	public String matriculationNumber() {
		return matriculationNumber;
	}

	public String name() {
		return name;
	}

	public String toString() {
		return "[matriculationNumber=[" + matriculationNumber + "],name=[" + name + "]]";
	}
}