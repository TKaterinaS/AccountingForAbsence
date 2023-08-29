package repository;

import entity.AccountingForAbsence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Интерфейс AbsenceRepository для класса "AccountingForAbsence"
 * Механизм для поиска объектов
 */
@Repository
public interface AbsenceRepository extends JpaRepository<AccountingForAbsence, Long> {

    /**
     * Поиск по id
     *
     * @param id - айди записи учета
     */
    @Query (value = "from  absence " +
            "where (absence.reason, ''," +
            "absence.startDate, ''," +
            "absence.duration, ''," +
            "absence.discounted, ''," +
            "absence.description, ''," +
            "absence.employee.employeeId)")
    List <AccountingForAbsence> findAllByEmployeeId(@Param("id") Long id);

}
