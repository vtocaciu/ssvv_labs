package ssvv.example;

import static org.junit.Assert.assertTrue;

import domain.Student;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    Student student;
    @Before
    public void init() {
        student = new Student("2","vale",937, "mail@mail.com", "ale");
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addStudent() {

    }
}
