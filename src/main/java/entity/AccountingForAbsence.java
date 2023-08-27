package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;


/**
 * Класс сущности "AccountingForAbsence" ("Учет отсутствия")
 * Учет отсутствия сотрудника на рабочем месте
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "absence")
public class AccountingForAbsence {
    public static final String DESCRIPTION = "^[а-яА-Я]+$";
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * id - записи отчета
     */
    @Column(name = "id")
    @NotEmpty
    private int id;

    /**
     * reason - причина отсутствия
     */
    @Column(name = "reason")
    @NotEmpty
    private int reason;

    /**
     * start_date - дата начала отсутствия сотрудника на рабочем месте
     */
    @Column(name = "start_date")
    @NotEmpty
    private Date start_date;

    /**
     * duration - продолжительность (раб.дней) отсутствия сотрудника на рабочем месте
     */
    @Column(name = "duration")
    @NotEmpty
    private int duration;

    /**
     * discounted - учтено при оплате
     */
    @Column(name = "discounted")
    @NotEmpty
    private boolean discounted;

    /**
     * description - комментарий
     */
    @Column(name = "description")
    @NotEmpty
    @Size(max = 1024)
    @Pattern(regexp = DESCRIPTION)
    private String description;

    /**
     * Employee employee объект сущности сотрудника отсутствующего на рабочем месте
     */
    @ManyToOne
    @JoinColumn (name = "employee_id")
    private Employee employee;

}
