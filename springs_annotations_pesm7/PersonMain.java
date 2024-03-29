package springs_annotations_pesm7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = applicationContext.getBean("person", Person.class);
		person.walk();
		((AbstractApplicationContext) applicationContext).close();
	}

}
