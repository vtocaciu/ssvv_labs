package ssvv.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import domain.Student;
import org.junit.Before;
import org.junit.Test;
import repository.StudentRepository;
import validation.StudentValidator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    Student student;
    StudentRepository repository;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addStudentValid() {
        repository = new StudentRepository(new StudentValidator());
        assertEquals(0, repository.findAll().size());
        student = new Student("2","vale",937, "mail@mail.com", "ale");
        repository.save(student);
        assertEquals(1, repository.findAll().size());
    }

    @Test
    public void addStudentInvalid() {
        repository = new StudentRepository(new StudentValidator());
        student = new Student("2","vale",940, "mail@mail.com", "ale");
        assertEquals(0, repository.findAll().size());
        repository.save(student);
        assertEquals(0, repository.findAll().size());
    }
}
