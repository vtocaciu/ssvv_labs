package ssvv.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import domain.Tema;
import org.junit.Before;
import org.junit.Test;
import repository.TemaRepository;
import validation.TemaValidator;

import java.util.Arrays;


public class AssgTest {

    TemaRepository temaRepository;

    @Test
    public void tc_01()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("1","tema", 4, 2));
        assertEquals(1, temaRepository.findAll().size());
    }

    @Test
    public void tc_02()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("1","tema", 2, 4));
        assertEquals(0, temaRepository.findAll().size());
    }

    @Test
    public void tc_03()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("1","tema", 12, 0));
        assertEquals(0, temaRepository.findAll().size());
    }

    @Test
    public void tc_04()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("1","tema", 15, 2));
        assertEquals(0, temaRepository.findAll().size());
    }

    @Test
    public void tc_05()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("","tema", 4, 2));
        assertEquals(0, temaRepository.findAll().size());
    }

    @Test
    public void tc_06()
    {
        temaRepository = new TemaRepository(new TemaValidator());
        temaRepository.save(new Tema("1","", 4, 2));
        assertEquals(0, temaRepository.findAll().size());
    }

}
