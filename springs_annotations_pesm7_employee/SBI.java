package springs_annotations_pesm7_employee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements BankAccount {

	public void balance() {
		System.out.println("3k");
	}

}
