package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
import java.util.List;

public interface BeanPouchInterface {

	public void insert(BeanPouch pouch);

	public void update(BeanPouch pouch);

	public void update(List<BeanPouch> pouch);

	public void delete(long pouchId);

	public BeanPouch find(long pouchId);

	public List<BeanPouch> find(List<Long> accountIds);

	public List<BeanPouch> find(String ownerName);

	public List<BeanPouch> find(boolean closed);

}
