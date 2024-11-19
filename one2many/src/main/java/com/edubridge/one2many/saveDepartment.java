package com.edubridge.one2many;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.edubridge.one2many.model.Department;
import com.edubridge.one2many.model.Student;
import java.util.Arrays;
import com.edubridge.one2many.utils.HibernateUtils;

public class saveDepartment {
    public static void main(String[] args) {
        // Create a Department object
        Department department = new Department();
        department.setDepartmentName("Computer Science");

        // Create Student objects and associate them with the department
        Student student1 = new Student();
        student1.setStudentName("Raj");
        student1.setStudentMobile(7342764528L);
        student1.setDepartment(department);

        Student student2 = new Student();
        student2.setStudentName("Maya");
        student2.setStudentMobile(9876543210L);
        student2.setDepartment(department);

        // Set the list of students in the department
        department.setStudents(Arrays.asList(student1, student2));

        Transaction tx = null;

        try (Session session = HibernateUtils.getSessionfacFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(department); // Saves department and students due to cascading
            tx.commit();
            System.out.println("Department and students are added successfully!");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}