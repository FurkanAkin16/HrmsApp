package kodlama.io.HrmsApp.business.abstracts;

import java.util.List;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Entities.concretes.ActiveJobPostings;

public interface ActiveJobPostingService {
	DataResult<List<ActiveJobPostings>> getAll();
}
