package springs_annotations_pesm7_mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile mobile = applicationContext.getBean("mobile", Mobile.class);
		mobile.network();

		((AbstractApplicationContext) applicationContext).close();
	}

}
