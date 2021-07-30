package test.controller;

import java.util.Comparator;

import test.vo.Student;

public class StuComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSum() > o2.getSum()) {
			return 1;
		} else if (o1.getSum() < o2.getSum()) {
			return -1;
		} else
			return 0;
	}
}
