package com.example.demo.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.Entities.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO toDto(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setName(student.getName());
        dto.setAge(student.getAge());
        dto.setFaculty(student.getFaculty());
        return dto;
    }

    public StudentDTO getStudentById(Long id) {
        return toDto(studentRepository.findById(id).orElse(null));
    }

    public StudentDTO createStudent(StudentDTO studentDTO) { // Now accepts a StudentDTO
        Student student = new Student(); // Create an entity from the DTO
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setFaculty(studentDTO.getFaculty());
        return toDto(studentRepository.save(student));
    }

    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) { // Accepts a StudentDTO
        if (studentRepository.existsById(id)) {
            Student student = studentRepository.findById(id).get(); // Fetch existing entity
            student.setName(studentDTO.getName());
            student.setAge(studentDTO.getAge());
            student.setFaculty(studentDTO.getFaculty());
            return toDto(studentRepository.save(student));
        }
        return null;
    }

    /**
     * Retrieves all students.
     * 
     * @return A list of all students.
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Deletes a student by their ID.
     * 
     * @param id The ID of the student to delete.
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    /**
     * Retrieves students by their name.
     * 
     * @param name The name of the students to retrieve.
     * @return A list of students with the specified name.
     */
    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

}
