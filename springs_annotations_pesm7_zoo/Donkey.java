package springs_annotations_pesm7_zoo;

import org.springframework.stereotype.Component;

@Component
public class Donkey implements Animal {

	public void sound() {
		System.out.println("Bray...");
	}

}
