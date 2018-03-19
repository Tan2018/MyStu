package cn.tan.comparator;

import java.util.Comparator;

import cn.tan.entity.Student;

public class MyComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		if(s1.getAge()>s2.getAge()){
			return 1;
		}else if(s1.getAge()<s2.getAge()){
			return -1;
		}
		return 0;
	}

}
