package com.example.firstproject.repository;

import com.example.firstproject.entitiy.File;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
