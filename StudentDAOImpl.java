/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Crud.dao.impl;

import com.leapfrog.Crud.dao.StudentDAO;
import com.leapfrog.Crud.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author sohn
 */
public class StudentDAOImpl implements StudentDAO {

    private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public boolean insert(Student s) {
        return studentList.add(s);
    }

    @Override
    public boolean delete(int id) {
        Student s = getById(id);
        if (s != null) {
            studentList.remove(s);
            return true;

        }
        return false;
    }

    @Override
    public Student getById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getAll() {
        return studentList;
    }

    @Override
    public int count() {
        return studentList.size();
    }

}
