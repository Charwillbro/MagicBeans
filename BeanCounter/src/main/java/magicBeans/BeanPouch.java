package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
public class BeanPouch {

	private long id;
	private String ownerName;
	private double numOfBeans;
	private boolean closed;
	private double numOfCows;

	public BeanPouch() {

	}

	public BeanPouch(long id, String ownerName, double numOfBeans, double numOfCows) {
		this.id = id;
		this.ownerName = ownerName;
		this.numOfBeans = numOfBeans;
		this.numOfCows = numOfCows;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getNumOfBeans() {
		return numOfBeans;
	}

	public void setNumOfBeans(double numOfBeans) {
		this.numOfBeans = numOfBeans;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public double getNumOfCows() {
		return numOfCows;
	}

	public void setNumOfCows(double numOfCows) {
		this.numOfCows = numOfCows;
	}

}
