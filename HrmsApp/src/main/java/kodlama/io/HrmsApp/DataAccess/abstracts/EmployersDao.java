package kodlama.io.HrmsApp.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HrmsApp.Entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
