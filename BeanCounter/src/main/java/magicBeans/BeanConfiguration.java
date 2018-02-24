package magicBeans;
//Charles Broderick
//Charwillbro@gmail.com
//2/23/2018
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public BeanPouchInterface beanDao() {
		BeanPouchInterfaceInMemoryImpl bean = new BeanPouchInterfaceInMemoryImpl();
		return bean;
	}

	@Bean
	public PouchService pouchService() {
		PouchServiceImpl bean = new PouchServiceImpl();
		bean.setBeanPouchInterface(beanDao());
		return bean;
	}

}
