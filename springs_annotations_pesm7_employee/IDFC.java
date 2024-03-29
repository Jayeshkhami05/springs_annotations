package springs_annotations_pesm7_employee;

import org.springframework.stereotype.Component;

@Component
public class IDFC implements BankAccount {

	public void balance() {
		System.out.println("5k");
	}

}
