package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.EmployeesDao;
import kodlama.io.HrmsApp.Entities.concretes.Employees;
import kodlama.io.HrmsApp.business.abstracts.EmployeesService;

@Service
public class EmplooyesManager implements EmployeesService {

	private EmployeesDao employeesDao;

	@Autowired
	public EmplooyesManager(EmployeesDao employeesDao) {
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>(this.employeesDao.findAll(), "Data Listelendi");
	}

}
