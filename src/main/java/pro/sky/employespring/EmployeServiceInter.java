package pro.sky.employespring;

import java.util.Collection;

public interface EmployeServiceInter {
    Employe add(String firstName, String lastName);
    Employe remove(String firstName,String lastName);
    Employe find(String firstName,String lastName);

    Collection<Employe> all();
}
