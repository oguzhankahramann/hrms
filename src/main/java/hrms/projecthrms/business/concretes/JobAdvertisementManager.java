package hrms.projecthrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.projecthrms.business.abstracts.JobAdvertisementService;
import hrms.projecthrms.core.utilities.results.DataResult;
import hrms.projecthrms.core.utilities.results.ErrorResult;
import hrms.projecthrms.core.utilities.results.Result;
import hrms.projecthrms.core.utilities.results.SuccessDataResult;
import hrms.projecthrms.core.utilities.results.SuccessResult;
import hrms.projecthrms.dataAccess.abstracts.JobAdvertisementsDao;
import hrms.projecthrms.entities.concretes.JobAdvertisements;



@Service

public class JobAdvertisementManager implements JobAdvertisementService {
	private JobAdvertisementsDao jobAdvertisementsDao;

		@Autowired
	public JobAdvertisementManager(JobAdvertisementsDao jobAdvertisementsDao) {
		super();
		this.jobAdvertisementsDao = jobAdvertisementsDao;
	}

		@Override
		public DataResult<List<JobAdvertisements>> getAll() {
			// TODO Auto-generated method stub
			return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findAll());
		}

		@Override
		public Result add(JobAdvertisements advertisements) {
			// TODO Auto-generated method stub
			this.jobAdvertisementsDao.save(advertisements);
			return new SuccessResult();
					
		}

		@Override
		public DataResult<List<JobAdvertisements>> findAllByIsActiveTrue() {
			// TODO Auto-generated method stub
			return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findAllByIsActiveTrue(),"findallbyisactivetruegenerated");
		}

		@Override
		public DataResult<List<JobAdvertisements>> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName) {
			// TODO Auto-generated method stub
			return new SuccessDataResult<List<JobAdvertisements>>(this.jobAdvertisementsDao.findAllByEmployer_CompanyNameAndIsActiveTrue(companyName)
					,"findAllByEmployer_CompanyNameAndIsActiveTrue generated");
		}

		@Override
		public Result changeActivate(int id) {
			JobAdvertisements jobAdvertisements = this.jobAdvertisementsDao.getById(id); //referansına atama yaptık
			if(jobAdvertisements != null) {
			jobAdvertisements.setActive(false);
			this.jobAdvertisementsDao.save(jobAdvertisements);
			return new SuccessResult("İş ilanı pasif yapıldı");
			}
			
			
			{
			return new ErrorResult("ilan bulunamadi");
			

			}
		}	
	
}

