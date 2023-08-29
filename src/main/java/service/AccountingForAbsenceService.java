package service;

import dao.AbsenceDAO;
import entity.AccountingForAbsence;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Интерфейс сервиса для работы с учетными записями
 * отсутствия сотрудников на рабочем месте
 */
@Service
public interface AccountingForAbsenceService {

    /**
     * Метод отображения списка записей об отсутствии
     */
    public List<AccountingForAbsence> getAllAbsence(Long id);
    /**
     * Метод создания записи об отсутствии
     */
    public AbsenceDAO addAbsenceDAO(AbsenceDAO absenceDAO);
    /**
     * Метод изменения записи об отсутствии
     */
    public void updateAbsence(AccountingForAbsence accountingForAbsence);
    /**
     * Метод удаления записи об отсутствии
     */
    public void deleteAbsence(Long id);
}


