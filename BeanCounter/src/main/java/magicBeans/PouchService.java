package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
public interface PouchService {
	public void transferBeans(long sourceBeanPouchId, long targetBeanPouchId, double amount, double cowAmount);

	public void depositBeans(long pouchId, double amount) throws Exception;

	public BeanPouch getBeanPouch(long pouchId);
}
