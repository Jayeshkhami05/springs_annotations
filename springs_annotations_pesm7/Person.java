package springs_annotations_pesm7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Person {

	@PostConstruct
	public void start() {
		System.out.println("Wear Shoes before walking");
	}

	public void walk() {
		System.out.println("Person can walk");
	}

	@PreDestroy
	public void end() {
		System.out.println("Wash Hands");
	}

}
