package controller;

import dao.AbsenceDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.AccountingForAbsenceService;

/**
 * Класс контроллера объекта учета записей отсутствия сотрудника на рабочем месте
 */
@RestController
@RequestMapping("/absence")
public class AbsenceController {
    private final AccountingForAbsenceService accountingForAbsenceService;

    public AbsenceController(AccountingForAbsenceService accountingForAbsenceService) {
        this.accountingForAbsenceService = accountingForAbsenceService;
    }
    /**
     * Метод контроллера для получения отчетной записи отсутствия сотрудника на работе
     */

    @GetMapping("/get_absence")
    public AbsenceDAO getAbsence(@PathVariable Long id){
        return (AbsenceDAO) accountingForAbsenceService.getAllAbsence(id);
    }
    /**
     * Метод контроллера для изменения отчетной записи отсутствия сотрудника на работе
     */
    @PostMapping("/update_absence")
    public ResponseEntity<?> updateAbsence(){
        return null;
    }
    /**
     * Метод контроллера для создания отчетной записи отсутствия сотрудника на работе
     */
    @PutMapping("/add_absence")

    public AbsenceDAO addAbsence(@RequestBody AbsenceDAO absenceDAO){
        return accountingForAbsenceService.addAbsenceDAO(absenceDAO);
    }

    /**
     * Метод контроллера для удаления отчетной записи отсутствия сотрудника на работе
     */
    @DeleteMapping("/delete_absence")
    public ResponseEntity<?> deleteAbsence(){
        return null;
    }
}
