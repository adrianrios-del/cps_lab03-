package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;

public class StudentService {
    private final StudentRepository repository = new StudentRepository();

    public void registerStudent(StudentEntity student) {
        repository.save(student);
    }

    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }
}