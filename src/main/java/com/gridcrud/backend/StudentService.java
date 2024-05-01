package com.gridcrud.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo repo;

    public List<Student> findAll(){
        return this.repo.findAll();
    }

    public Student add(Student student){

        return this.repo.save(student);
    }

    public Student update(Student student){

        return this.repo.save(student);
    }
    public void delete(Student student){

         this.repo.delete(student);
    }
}
