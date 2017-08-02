package server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sbt-ganiev-ar on 02.08.2017.
 */

@RestController
public class Controller {

	private final Service serivce;

	public Controller(Service serivce) {
		this.serivce = serivce;
	}

	@RequestMapping(value = "/pickRandomBanners", method = RequestMethod.GET)
	public List<Integer> pickRandomBanners(@RequestParam(value = "n", defaultValue = "1") int n) {
		return serivce.pickRandomBanners(n);
	}

}
