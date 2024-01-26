package in.ineuron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.comp.WishMessageGenerator;

public class MainApp {
	public static void main(String[] args) {
		FileSystemResource fileSystemResource = new FileSystemResource("./src/main/resources/applicationContext.xml");
	
		System.out.println("*************BeanFactory container starting***************");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(fileSystemResource);
		System.out.println("*************BeanFactory container started************");
		
		WishMessageGenerator wmg = xmlBeanFactory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg is " + wmg.hashCode());
		
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");
		
		WishMessageGenerator wmg1 = xmlBeanFactory.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg1 is " + wmg1.hashCode());
		
		String result1 = wmg1.generateMessage("Virat");
		System.out.println(result1 + "\n");
		
		System.out.println("**********Container is closing***********");
	}
}
