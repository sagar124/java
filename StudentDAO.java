/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Crud.dao;

import com.leapfrog.Crud.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author sohn
 */
public interface StudentDAO {

    boolean insert(Student s);

    boolean delete(int id);

    Student getById(int id);

    ArrayList<Student> getAll();

    int count();

}
