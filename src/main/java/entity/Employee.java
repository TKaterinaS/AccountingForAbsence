package entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


/**
 * Класс сущности "Employee" ("Сотрудник")
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table (name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    /**
     * id сотрудника
     */
    @Column (name = "employee_id")
    private Long employeeId;

    /**
     * first_name - Фамилия сотрудника
     */
    @Column (name = "first_name")
    private String firstName;

    /**
     * last_name - Имя сотрудника
     */
    @Column (name = "last_name")
    private String lastName;

    /**
     * AccountingForAbsence absence объект сущности отчета отсутствия сотрудника на рабочем месте
     */
    @ManyToOne
    @JoinColumn (name = "id")
    private AccountingForAbsence absence;
}
