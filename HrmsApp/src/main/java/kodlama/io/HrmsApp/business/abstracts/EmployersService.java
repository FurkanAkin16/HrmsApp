package kodlama.io.HrmsApp.business.abstracts;

import java.util.List;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Entities.concretes.Employers;

public interface EmployersService {
DataResult<List<Employers>> getAll();
}
