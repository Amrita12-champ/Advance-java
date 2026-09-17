package com.example;

import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Student s1=new Student(43,"Amrita", "Software Technology");
        et.begin();
        em.persist(s1);
        et.commit();

    }
}