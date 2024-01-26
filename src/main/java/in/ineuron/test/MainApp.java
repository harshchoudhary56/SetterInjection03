package in.ineuron.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.WishMessageGenerator;

public class MainApp {
	public static void main(String[] args) {
	
		System.out.println("*************ClassPathXmlApplicationContext container starting***************");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("*************ClassPathXmlApplicationContext container started************");
		
		WishMessageGenerator wmg = classPathXmlApplicationContext.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg is " + wmg.hashCode());
		
		String result = wmg.generateMessage("sachin");
		System.out.println(result + "\n");
		
		WishMessageGenerator wmg1 = classPathXmlApplicationContext.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg1 is " + wmg1.hashCode());
		
		String result1 = wmg1.generateMessage("Virat");
		System.out.println(result1 + "\n");
		
		System.out.println("**********ClassPathXmlApplicationContext is closing***********");
	}
}
