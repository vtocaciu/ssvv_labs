package validation;
import domain.Student;

public class StudentValidator implements Validator<Student> {
    public void validate(Student student) throws ValidationException {
        if (student.getID() == null || student.getID().equals("")) {
            throw new ValidationException("ID invalid! \n");
        }
        if (student.getNume() == null || student.getNume().equals("")) {
            throw new ValidationException("Nume invalid! \n");
        }
//        if (student.getEmail() == null || student.getEmail().equals("")) {
//            throw new ValidationException("Email invalid! \n");
//        }
//        if (student.getNameOfTheProfessor() == null || student.getNameOfTheProfessor().equals("")) {
//            throw new ValidationException("Nume prof invalid! \n");
//        }
        if (student.getGrupa() < 100 || student.getGrupa() > 999) {
            throw new ValidationException("Grupa invalida! \n");
        }
    }
}

