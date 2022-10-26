public class StudentScores {
    private final int MAX_STUDENTS = 100;
    private Student[] stuarray; // Student객체의 배열을 사용
    private int numStudents;

    public StudentScores() {
	stuarray = new Student[MAX_STUDENTS]; // Student객체의 배열 생성
	numStudents = 0;
    }

    public void add(String name, int score) {
	if (numStudents >= MAX_STUDENTS)
	    return; // not enough space to add new student score
	stuarray[numStudents] = new Student(name, score); // stuarray에 Student의 인스턴스의 객체 id를 넣는다.
	numStudents++;
    }

    public String getHighest() {
	if (numStudents == 0)
	    return null;

	int highest = 0;

	for (int i = 1; i < numStudents; i++)
	    if (stuarray[i].ReScore() > stuarray[highest].ReScore()) // 점수를 반환하는 ReScore 메소드를 이용해 비교
		highest = i;

	return stuarray[highest].ReName(); // 이름을 반환하는 ReName 메소드를 이용해 return함
    }

    public String getLowest() {
	if (numStudents == 0)
	    return null;

	int lowest = 0;

	for (int i = 1; i < numStudents; i++)
	    if (stuarray[i].ReScore() < stuarray[lowest].ReScore())
		lowest = i;

	return stuarray[lowest].ReName();
    }
}
