package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String studentId;
	private ArrayList<Course> coursesTaken; // 학생이 들은 수업 목록
	private HashMap<String,Integer> semestersByYearAndSemester; 

	public Student(String studentId) {
	} // constructor
	public void addCourse(Course newRecord) {
	}
	public HashMap<String,Integer> getSemestersByYearAndSemester() {
		return null;
	}
	public int getNumCourseInNthSementer(int semester) {
		return 0;
	}

}
