package kodlama.io.HrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HrmsApp.Core.results.DataResult;
import kodlama.io.HrmsApp.Core.results.SuccessDataResult;
import kodlama.io.HrmsApp.DataAccess.abstracts.ActiveJobPostingDao;
import kodlama.io.HrmsApp.Entities.concretes.ActiveJobPostings;
import kodlama.io.HrmsApp.business.abstracts.ActiveJobPostingService;

@Service
public class ActiveJobPostingManager implements ActiveJobPostingService {

	private ActiveJobPostingDao activeJobPostingDao;

	@Autowired
	public ActiveJobPostingManager(ActiveJobPostingDao activeJobPostingDao) {
		this.activeJobPostingDao = activeJobPostingDao;
	}

	@Override
	public DataResult<List<ActiveJobPostings>> getAll() {
		return new SuccessDataResult<List<ActiveJobPostings>>(this.activeJobPostingDao.findAll(), "Data Listelendi");
	}

}
