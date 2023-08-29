package service;

import dao.EmployeeDAO;

import java.util.List;

/**
 * Интерфейс сервиса для работы с сотрудником
 */

public interface EmployeeService {
    /**
     * Метод получения информации о сотруднике
     */
    EmployeeDAO getEmployeeDAO(Long id);
    /**
     * Метод получения информации о всех сотрудниках
     */
    public List<EmployeeDAO> getAllEmployeesDAO();


}
