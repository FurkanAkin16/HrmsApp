package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.EmployersDao;
import kodlama.io.HrmsApp.Entities.concretes.Employers;
import kodlama.io.HrmsApp.business.abstracts.EmployersService;

@Service

public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;

	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(), "Data Listelendi");
	}

}
