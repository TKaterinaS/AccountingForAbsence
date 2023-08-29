package dao;

import java.util.List;

public interface EmployeeDAO {

    public List<EmployeeDAO> getAllEmployees();

    public EmployeeDAO getEmployeeDAO(Long id);

}
