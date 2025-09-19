package org.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    // Constructor injection
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student); // Save to DB
    }

    // READ ALL
    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll(); // Fetch all from DB
    }

    // READ ONE
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentRepository.findById(id).map(s -> {
            s.setName(updatedStudent.getName());
            s.setCourse(updatedStudent.getCourse());
            return studentRepository.save(s);
        }).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student with ID " + id + " deleted.";
        }
        return "Student with ID " + id + " not found.";
    }
}
