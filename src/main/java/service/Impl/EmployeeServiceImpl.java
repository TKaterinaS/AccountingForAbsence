package service.Impl;


import dao.EmployeeDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    public void setEmployeeDAO(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }
    @Override
    @Transactional
    public EmployeeDAO getEmployeeDAO(Long id) {
        return this.employeeDAO.getEmployeeDAO(id);
    }

    @Override
    @Transactional
    public List<EmployeeDAO> getAllEmployeesDAO() {
        return this.employeeDAO.getAllEmployees();
    }

}
