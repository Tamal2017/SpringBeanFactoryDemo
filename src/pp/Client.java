package pp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("resources/spring.xml");
		BeanFactory bean = new XmlBeanFactory(rs); // loading
		bean.getBean("obj"); // client request

	}

}
