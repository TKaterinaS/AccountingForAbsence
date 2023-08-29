package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<EmployeeDAO> getAllEmployees() {
        Session session = this.sessionFactory.getCurrentSession();
        List<EmployeeDAO> employeeList =
                session.createQuery().list();
        return employeeList;
    }

    @Override
    public EmployeeDAO getEmployeeDAO(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        EmployeeDAO employeeDAO = (EmployeeDAO) session.get(EmployeeDAO.class, id);
        return employeeDAO;
    }
}
