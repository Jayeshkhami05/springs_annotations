package springs_annotations_pesm7_zoo;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	public void sound() {
		System.out.println("Bark...");
	}

}
