package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer> {

}
