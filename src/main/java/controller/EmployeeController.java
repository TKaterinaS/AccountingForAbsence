package controller;

import dao.EmployeeDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    /**
     * Класс контроллера объекта "Сотрудник"
     */
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public EmployeeDAO getEmployee(@PathVariable Long employeeId){
        return (EmployeeDAO) employeeService.getEmployeeDAO(employeeId);
    }
}
