package sortingAlgorithms.eduresultsapp;

public class Student implements Comparable<Student>{
private   int marks;
private String name;
Student (int studentId, String name){
	this.marks=studentId;
	this.name=name;
}

public   int getMarks() {
	return marks;
	
}
public   String getName() {
	return name;
	
}

@Override
public int compareTo(Student other) {
	return Integer.compare(this.marks, other.marks);
	
}
}
