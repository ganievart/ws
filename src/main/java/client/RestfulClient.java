package client;

import org.springframework.web.client.RestTemplate;

/**
 * Created by sbt-ganiev-ar on 02.08.2017.
 */
public class RestfulClient {

	public static String pickRandomBanners(int n) {
		final String uri = "http://localhost:8090/pickRandomBanners?n={n}";
		RestTemplate template = new RestTemplate();
		String result = template.getForObject(uri, String.class, n);
		return result;
	}

	public static void main(String[] args) {

		System.out.println(pickRandomBanners(2));
		System.out.println(pickRandomBanners(2));
		System.out.println(pickRandomBanners(2));

	}
}
