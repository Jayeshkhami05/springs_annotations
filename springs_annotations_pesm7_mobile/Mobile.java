package springs_annotations_pesm7_mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	Sim sim;

	public void network() {
		sim.serviceProvider();
	}

}
