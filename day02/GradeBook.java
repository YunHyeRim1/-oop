package day02;

class GradeBook {
	int id;
	String name;
	int korean;
	int english;
	int math;
	// sum average 는 메인 메소드에
	public int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getKorean() {
		return korean;
	}
	void setKorean(int korean) {
		this.korean = korean;
	}
	int getEnglish() {
		return english;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	int getMath() {
		return math;
	}
	void setMath(int math) {
		this.math = math;
	}
}
