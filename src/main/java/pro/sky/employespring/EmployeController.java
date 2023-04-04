package pro.sky.employespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/employe")
public class EmployeController {
    private final EmployeServiceInter service;

    public EmployeController(EmployeServiceInter service) {
        this.service = service;
    }
    @GetMapping("/add")
    public Employe addEmploye(@RequestParam String firstName,@RequestParam String lastName){
        return service.add(firstName,lastName);
    }
    @GetMapping("/remove")
    public Employe removeEmploye(@RequestParam String firstName,@RequestParam String lastName){
        return service.remove(firstName,lastName);
    }
    @GetMapping("/find")
    public Employe findEmploye(@RequestParam String firstName, @RequestParam String lastName){
        return service.find(firstName,lastName);
    }
    @GetMapping()
    public Collection<Employe> all(){
        return service.all();
    }

}
