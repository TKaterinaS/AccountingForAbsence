package dao;

import entity.AccountingForAbsence;

import java.util.List;

public interface AbsenceDAO {
    public List<AccountingForAbsence> getAllAbsence();

    public AbsenceDAO addAbsenceDAO(AbsenceDAO absenceDAO);

    public AccountingForAbsence getAbsenceById(Long id);

    public void deleteAbsence (Long id);
    public void updateAbsence(AccountingForAbsence absence);

}
