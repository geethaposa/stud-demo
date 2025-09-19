package org.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Student, Integer> gives CRUD methods automatically
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
