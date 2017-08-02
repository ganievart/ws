package server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sbt-ganiev-ar on 02.08.2017.
 */
@org.springframework.stereotype.Service
public class Service {

	private final List<Integer> banners = new ArrayList<Integer>();

	public Service() {
		banners.add(0);
		banners.add(4);
		banners.add(8);
		banners.add(6);
		banners.add(10);
		banners.add(7);
		Collections.shuffle(banners);
		banners.add(null);
	}

	private void onBannersEnd() {
		Logger.getLogger(Service.class.getName()).log(Level.INFO, "Start over");
//		Collections.shuffle(banners);
	}

	public List<Integer> pickRandomBanners(int n) {

		if (!(n > 0)) {
			throw new RuntimeException("Invalid n number");
		}

		int nullPosition = 0;
		while (banners.get(nullPosition) != null) {
			nullPosition++;
		}

		if (nullPosition == banners.size() - 1) {
			if (n >= banners.size()) {
				onBannersEnd();
				return banners.subList(0, banners.size() - 1);
			}
			Collections.swap(banners, n, nullPosition);
			return banners.subList(0, n);

		} else {
			if (banners.size() - nullPosition - 1 < n) {
				onBannersEnd();
				return banners.subList(nullPosition + 1, banners.size());
			}
			Collections.swap(banners, nullPosition, nullPosition + n);
			if (nullPosition + n == banners.size() - 1) {
				onBannersEnd();
			}
			return banners.subList(nullPosition, nullPosition + n);
		}
	}

}


