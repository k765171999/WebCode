package com.dao;

import java.util.List;

import com.domain.Student;

public interface StuDao {
	/**
	 * 查找全部学生
	 * @return
	 */
	List<Student> findAll();
}
