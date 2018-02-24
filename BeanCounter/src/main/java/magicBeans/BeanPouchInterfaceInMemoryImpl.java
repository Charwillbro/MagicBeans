package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanPouchInterfaceInMemoryImpl implements BeanPouchInterface {

	private Map<Long, BeanPouch> pouchesMap = new HashMap<Long, BeanPouch>();
	{
		BeanPouch pouch1 = new BeanPouch(1L, "Magic Bean Salesman", 5, 0);
		BeanPouch pouch2 = new BeanPouch(2L, "Jack", 0, 1);
		pouchesMap.put(pouch1.getId(), pouch1);
		pouchesMap.put(pouch2.getId(), pouch2);
	}

	public void insert(BeanPouch pouch) {
		pouchesMap.put(pouch.getId(), pouch);
	}

	public void update(BeanPouch pouch) {
		pouchesMap.put(pouch.getId(), pouch);
	}

	public void update(List<BeanPouch> pouches) {
		for (BeanPouch pouch : pouches) {
			update(pouch);
		}
	}

	public void delete(long pouchId) {
		pouchesMap.remove(pouchId);
	}

	public BeanPouch find(long pouchId) {
		return pouchesMap.get(pouchId);
	}

	public List<BeanPouch> find(List<Long> pouchIds) {
		List<BeanPouch> pouches = new ArrayList<BeanPouch>();
		for (Long id : pouchIds) {
			pouches.add(pouchesMap.get(id));
		}
		return pouches;
	}

	public List<BeanPouch> find(String ownerName) {
		List<BeanPouch> pouches = new ArrayList<BeanPouch>();
		for (BeanPouch pouch : pouchesMap.values()) {
			if (ownerName.equals(pouch.getOwnerName())) {
				pouches.add(pouch);
			}
		}
		return pouches;
	}

	public List<BeanPouch> find(boolean locked) {
		List<BeanPouch> pouches = new ArrayList<BeanPouch>();
		for (BeanPouch pouch : pouchesMap.values()) {
			if (locked == (pouch.isClosed())) {
				pouches.add(pouch);
			}
		}
		return pouches;
	}

}
