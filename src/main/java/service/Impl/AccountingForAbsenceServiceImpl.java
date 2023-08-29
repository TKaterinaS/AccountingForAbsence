package service.Impl;

import dao.AbsenceDAO;
import entity.AccountingForAbsence;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.AccountingForAbsenceService;

import java.util.List;

@Service
public class AccountingForAbsenceServiceImpl implements AccountingForAbsenceService {

    private AbsenceDAO absenceDAO;
    public void setAbsenceDAO(AbsenceDAO absenceDAO){
        this.absenceDAO = absenceDAO;
    }

    @Override
    @Transactional
    public List<AccountingForAbsence> getAllAbsence(Long id) {
        return absenceDAO.getAllAbsence();
    }

    @Override
    @Transactional
    public AbsenceDAO addAbsenceDAO(AbsenceDAO absenceDAO) {
       return absenceDAO;
    }

    @Override
    @Transactional
    public void updateAbsence(AccountingForAbsence accountingForAbsence) {
        absenceDAO.updateAbsence(accountingForAbsence);
    }

    @Override
    @Transactional
    public void deleteAbsence(Long id) {
        absenceDAO.deleteAbsence(id);
    }
}
