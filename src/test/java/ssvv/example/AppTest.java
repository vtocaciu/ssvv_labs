package ssvv.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import domain.Student;
import org.junit.Before;
import org.junit.Test;
import repository.StudentRepository;
import validation.StudentValidator;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    StudentRepository repository;
    String longString;

    @Before
    public void init(){
        char[]fill=new char[Integer.MAX_VALUE / 1000];
        Arrays.fill(fill, 'x');
        longString = new String(fill);
    }

    @Test
    public void tc_01()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("10", "Ion Popescu", 135));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_02()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("", "Ion Popescu", 135));
        assertEquals(0, repository.findAll().size());

    }

    @Test
    public void tc_03()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("", "BVA1", 765));
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_04()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("6", "", 9000));
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_05()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("6", "", 135));
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_06()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("6", "ana", 135));
        assertEquals(1, repository.findAll().size());
    }

    @Test
    public void tc_07() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("15", "BVA5", 99));

        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_08()
    {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("36", "BVA8", 10004));
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_09() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("21", "N", 245));
        assertEquals(1, repository.findAll().size());
        // Don't clean up - tc_10 depends on tc_09
    }

    @Test
    public void tc_10() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("12", "Ion Popescu", 0));
        assertEquals(0, repository.findAll().size());
    }

    @Test
    public void tc_11() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("67", "BVA1", 765));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_12() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student(longString.substring(0, longString.length()-1), "BVA1", 765));
        assertEquals(1, repository.findAll().size());
    }

    @Test
    public void tc_13() {
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("22", longString, 245));
        assertEquals(1, repository.findAll().size());
    }

    @Test
    public void tc_14(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("24", "Jo", 245));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_15(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("25", longString, 245));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_16(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("31", "BVA3", 100));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_17(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("32", "BVA4", 999));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_18(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("34", "BVA6", 101));
        assertEquals(1, repository.findAll().size());

    }

    @Test
    public void tc_19(){
        repository = new StudentRepository(new StudentValidator());
        repository.save(new Student("35", "BVA7", 998));
        assertEquals(1, repository.findAll().size());

    }
}

