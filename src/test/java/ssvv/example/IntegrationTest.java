package ssvv.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import repository.NotaRepository;
import repository.StudentRepository;
import repository.TemaRepository;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;

public class IntegrationTest {

    Service service = new Service(new StudentRepository(new StudentValidator()), new TemaRepository(new TemaValidator()), new NotaRepository(new NotaValidator()));

    @Test
    public void IntegrationTestCase1() {
        saveStudent_BigBang();
        saveTema_BigBang();
        saveNota_BigBang();
    }

    @Test
    public void saveStudent_BigBang()  {
        int size1 = service.getStudentSize();
        service.saveStudent("1", "nume", 932, "mail@mail.com", "nume");
        int size2 = service.getStudentSize();
        TestCase.assertEquals(size1+1, size2);
    }

    @Test
    public void saveTema_BigBang()  {
        int size1 = service.getTemaSize();
        service.saveTema("1", "desc", 5, 3);
        int size2 = service.getTemaSize();
        TestCase.assertEquals(size1+1, size2);
    }

    @Test
    public void saveNota_BigBang()  {
        int size1 = service.getNotaSize();
        service.saveNota("1", "1", 5, 4, "okay");
        int size2 = service.getNotaSize();
        TestCase.assertEquals(size1+1, size2);
    }

}
