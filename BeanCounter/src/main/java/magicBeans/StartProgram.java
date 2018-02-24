package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
// 2/23/2018

//This program records the famous financial transaction between Jack, a poor boy selling his widow mothers cow because
// It no longer produces milk, and a magic bean salesman. Who, for some unexplainable reason, will trade MAGIC BEANS for beef
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfiguration.class);
		PouchService pouchService = applicationContext.getBean("pouchService", PouchService.class);
		System.out.println("Before Jack traded his cow for magic beans");
		System.out.println("*************************************************");
		System.out.println("The " + pouchService.getBeanPouch(1).getOwnerName() + " has "
				+ pouchService.getBeanPouch(1).getNumOfBeans() + " beans and "
				+ pouchService.getBeanPouch(1).getNumOfCows() + " cow(s)");
		System.out.println(
				pouchService.getBeanPouch(2).getOwnerName() + " has " + pouchService.getBeanPouch(2).getNumOfBeans()
						+ " beans and " + pouchService.getBeanPouch(2).getNumOfCows() + " cow(s)");
		System.out.println("");
		pouchService.transferBeans(1, 2, 5, -1);
		System.out.println("After Jack traded his cow for magic beans");
		System.out.println("*************************************************");
		System.out.println("The " + pouchService.getBeanPouch(1).getOwnerName() + " has "
				+ pouchService.getBeanPouch(1).getNumOfBeans() + " beans and "
				+ pouchService.getBeanPouch(1).getNumOfCows() + " cow(s)");
		System.out.println(
				pouchService.getBeanPouch(2).getOwnerName() + " has	" + pouchService.getBeanPouch(2).getNumOfBeans()
						+ " beans and " + pouchService.getBeanPouch(2).getNumOfCows() + " cow(s)");
	}

}
