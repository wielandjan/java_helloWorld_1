package exercises.Programmieren1.ExamTask02;

public class Lecture {
	private final String description;
	private final int creditPoints;

	public Lecture(String description, int creditPoints) {
		this.description = description;
		this.creditPoints = creditPoints;
	}

	public String description() {
		return description;
	}

	public int creditPoints() {
		return creditPoints;
	}

	public String toString() {
		return "[description=[" + description + "],creditPoints=[" + String.valueOf(creditPoints) + "]]";
	}
}
