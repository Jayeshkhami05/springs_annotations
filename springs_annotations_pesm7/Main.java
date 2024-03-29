package springs_annotations_pesm7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = applicationContext.getBean("person", Person.class);
//		person.walk();
		System.out.println(person);

		Person person2 = applicationContext.getBean("person", Person.class);
		System.out.println(person2);
	}

}
