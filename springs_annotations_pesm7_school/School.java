package springs_annotations_pesm7_school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Autowired
	Student student;

	public void teach() {
		student.study();
	}

}
