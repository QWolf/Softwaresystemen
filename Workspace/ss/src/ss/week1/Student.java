package ss.week1;

public class Student {
	
	public static int score = 90;
	
	public boolean hasPassed() {
		if (score >= 70) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Student Patrick = new Student();
		System.out.println(Patrick.hasPassed());
    }

}
