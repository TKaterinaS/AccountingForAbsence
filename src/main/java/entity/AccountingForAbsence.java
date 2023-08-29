package entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;


/**
 * Класс сущности "AccountingForAbsence" ("Учет отсутствия")
 * Учет отсутствия сотрудника на рабочем месте
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "absence")
public class AccountingForAbsence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * id - записи отчета
     */
    @Column (name = "id")
    private Long id;

    /**
     * reason - причина отсутствия
     */
    @Column (name = "reason")
    private int reason;

    /**
     * start_date - дата начала отсутствия сотрудника на рабочем месте
     */
    @Column (name = "start_date")
    private Date startDate;

    /**
     * duration - продолжительность (раб.дней) отсутствия сотрудника на рабочем месте
     */
    @Column (name = "duration")
    private int duration;

    /**
     * discounted - учтено при оплате
     */
   @Column (name = "discounted")
    private boolean discounted;

    /**
     * description - комментарий
     */
    @Column (name = "description")
    private String description;

    /**
     * Employee employee объект сущности сотрудника отсутствующего на рабочем месте
     */
    @ManyToOne
    @JoinColumn (name = "employee_id")
    private Employee employee;

}
