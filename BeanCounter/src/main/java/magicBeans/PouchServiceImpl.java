package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
public class PouchServiceImpl implements PouchService {

	private BeanPouchInterface beanDao;

	public BeanPouchInterface getBeanPouchInterface() {
		return beanDao;
	}

	public void setBeanPouchInterface(BeanPouchInterface beanDao) {
		this.beanDao = beanDao;
	}

	public void transferBeans(long sourceBeanPouchId, long targetBeanPouchId, double amount, double cowAmount) {
		BeanPouch sourceBeanPouch = beanDao.find(sourceBeanPouchId);
		BeanPouch targetBeanPouch = beanDao.find(targetBeanPouchId);
		sourceBeanPouch.setNumOfBeans(sourceBeanPouch.getNumOfBeans() - amount);
		targetBeanPouch.setNumOfBeans(targetBeanPouch.getNumOfBeans() + amount);
		sourceBeanPouch.setNumOfCows(sourceBeanPouch.getNumOfCows() - cowAmount);
		targetBeanPouch.setNumOfCows(targetBeanPouch.getNumOfCows() + cowAmount);
		beanDao.update(sourceBeanPouch);
		beanDao.update(targetBeanPouch);
	}

	public void depositBeans(long pouchId, double amount) throws Exception {
		BeanPouch pouch = beanDao.find(pouchId);
		pouch.setNumOfBeans(pouch.getNumOfBeans() + amount);
		beanDao.update(pouch);
	}

	public BeanPouch getBeanPouch(long pouchId) {
		return beanDao.find(pouchId);
	}

}
