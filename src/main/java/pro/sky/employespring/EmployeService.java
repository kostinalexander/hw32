package pro.sky.employespring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class EmployeService implements EmployeServiceInter {
  private final List<Employe> employes;
  public EmployeService(){
      this.employes = new ArrayList<>();
  }


    @Override
    public Employe add(String firstName, String lastName) {
        Employe empl = new Employe(firstName,lastName);
        if(employes.contains(empl)){
            throw new EmployeeStorageIsFullException();
        }
        employes.add(empl);
        return empl;
    }

    @Override
    public Employe remove(String firstName, String lastName) {
        Employe empl = new Employe(firstName,lastName);
        if(employes.contains(empl)){
            employes.remove(empl);
            return empl;
        }throw new EmployeeNotFoundException();
    }


    @Override
    public Employe find(String firstName, String lastName) {
        Employe empl = new Employe(firstName,lastName);
        if(employes.contains(empl)){
            return empl;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employe> all() {
        return employes;
    }

}
