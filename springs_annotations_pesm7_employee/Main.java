package springs_annotations_pesm7_employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BankConfig.class);
		Employee employee = applicationContext.getBean("employee", Employee.class);
		employee.check();
	}

}
