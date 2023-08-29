package view.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EmployeeRepository;

@Route
public class MainView extends VerticalLayout {
    private final EmployeeRepository employeeRepository;
    private Grid<Employee> grid = new Grid<>(Employee.class);
    private Button addNewBtn;

    @Autowired
    public MainView(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        add(grid);
        showEmployee("");
    }
    private void showEmployee(String name){
        if (name.isEmpty()){
            grid.setItems(employeeRepository.findAll());
        }else {
            grid.setItems(employeeRepository.findByLastNameStartsWithIgnoreCase(name));
        }
    }
}
