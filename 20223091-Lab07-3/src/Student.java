
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
	this.name = name;
	this.score = score;
    }

    public int ReScore() { // StudentScore에 있는 점수 비교에서 사용할 점수를 return
	return score;
    }

    public String ReName() { // StudentScore에 이름을 return할 때 사용할 이름을 return
	return name;
    }
}
