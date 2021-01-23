package collections;

import java.util.*;

class Student implements Comparable {
	int rollNo;

	Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public int compareTo(Object obj) {
		Student s = (Student) obj;
		if (this.rollNo < s.rollNo) {
			return -1;
		} else {
			if (this.rollNo > s.rollNo) {
				return +1;
			}
		}
		return 0;
	}

	public String toString() {
		return "" + rollNo;
	}

}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student(14));
		ts.add(new Student(11));
		ts.add(new Student(34));
		ts.add(new Student(46));
		ts.add(new Student(90));
		System.out.println("Using ForEach");
		ts.forEach(item -> {
			System.out.println(item);
		});
		System.out.println("Set :" + ts);

	}

}
