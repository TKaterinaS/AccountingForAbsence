package dao;

import entity.AccountingForAbsence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AbsenceDAOImpl implements AbsenceDAO{

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<AccountingForAbsence> getAllAbsence() {
        Session session = this.sessionFactory.getCurrentSession();
        List<AccountingForAbsence> forAbsenceList =
                session.createQuery("").list();
        return forAbsenceList;
    }

    @Override
    public AbsenceDAO addAbsenceDAO(AbsenceDAO absenceDAO) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(absenceDAO);
        return absenceDAO;
    }

    @Override
    public AccountingForAbsence getAbsenceById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountingForAbsence absence =
                (AccountingForAbsence) session.get(AccountingForAbsence.class, id);
        return absence;
    }

    @Override
    public void deleteAbsence(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountingForAbsence absence =
                (AccountingForAbsence) session.load(AccountingForAbsence.class, id);
        if (null != absence){
            session.delete(absence);
        }

    }

    @Override
    public void updateAbsence(AccountingForAbsence absence) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(absence);
    }
}
