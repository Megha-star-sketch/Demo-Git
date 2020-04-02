package co.spring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class CallDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo1 d = new Demo1(); 
		//d.setEid(101);
		//d.setName("Megha");
		//d.setAddress("Karawal Nagar");
		//System.out.println("Details : "+d);
		//Spring Demo
		//Resource resource = new ClassPathResource("SpringConfig.xml");
		//BeanFactory  factory = new XmlBeanFactory(resource);
		
		ApplicationContext app = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Demo1 d1 = (Demo1)app.getBean("demo1");
		//Demo1 d2 = (Demo1)factory.getBean("demo2");
		System.out.println("Employee details : "+d1);
		//System.out.println("Employee details : "+d2);
		
		//ClassPathResource x = (ClassPathResource)resource;
		ClassPathXmlApplicationContext x = (ClassPathXmlApplicationContext)app;
		x.close();
	}

}
