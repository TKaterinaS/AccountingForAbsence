package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Интерфейс EmployeeRepository для класса "Employee"
 * Механизм для поиска объектов
 */


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Поиск по lastName
     */
    @Query(value = "from employee " +
            "where concat  (employee.lastName, '',employee.firstName)"+
     " like concat ('%', :name, '%')")
    List<Employee> findByLastNameStartsWithIgnoreCase(String name);

}
