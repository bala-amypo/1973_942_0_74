//repository->StudentRepository.java

package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticeProject.entity.Stuentity;
@repository
public interface StudentRepository extends JpaRepository<Stuentity, Long> {
    
    
}