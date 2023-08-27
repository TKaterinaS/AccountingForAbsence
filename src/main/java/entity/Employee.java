package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Класс сущности "Employee" ("Сотрудник")
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "employees")
public class Employee {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    /**
     * id сотрудника
     */
    @Column (name = "employee_id")
    @NotEmpty
    @Size(max = 30)
    private int employee_id;

    /**
     * first_name - Фамилия сотрудника
     */
    @Column (name = "first_name")
    @NotEmpty
    @Size(max = 30)
    private String first_name;

    /**
     * last_name - Имя сотрудника
     */
    @Column (name = "last_name")
    @NotEmpty
    @Size(max = 30)
    private String last_name;

    /**
     * salary - Зарплата сотрудника
     */
    @Column (name = "salary")
    @NotEmpty
    private int salary;

    /**
     * AccountingForAbsence absence объект сущности отчета отсутствия сотрудника на рабочем месте
     */
    @ManyToOne
    @JoinColumn (name = "id")
    private AccountingForAbsence absence;
}
