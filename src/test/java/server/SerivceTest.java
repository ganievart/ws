package server;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by sbt-ganiev-ar on 02.08.2017.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration()
public class SerivceTest {

	@Test
	public void getBannersTwoTwoTwo() throws Exception {

		Service serivce = new Service();
		List<Integer> result = serivce.pickRandomBanners(2);
		Assert.assertEquals(2, result.size());
		result = serivce.pickRandomBanners(2);
		Assert.assertEquals(2, result.size());
		result = serivce.pickRandomBanners(2);
		Assert.assertEquals(2, result.size());

	}

	@Test
	public void getBannersThreeThreeThree() throws Exception {

		Service serivce = new Service();
		List<Integer> result = serivce.pickRandomBanners(3);
		Assert.assertEquals(3, result.size());
		result = serivce.pickRandomBanners(3);
		Assert.assertEquals(3, result.size());
		result = serivce.pickRandomBanners(3);
		Assert.assertEquals(3, result.size());

	}

	@Test
	public void getBannersThreeTwoTwo() throws Exception {
		Service serivce = new Service();
		List<Integer> result = serivce.pickRandomBanners(3);
		Assert.assertEquals(3, result.size());
		result = serivce.pickRandomBanners(2);
		Assert.assertEquals(2, result.size());
		result = serivce.pickRandomBanners(2);
		Assert.assertEquals(1, result.size());
	}

	@Test
	public void getBannersTen() throws Exception {
		Service serivce = new Service();
		Assert.assertEquals(6, serivce.pickRandomBanners(10).size());
	}

	@Test
	public void getBannersThreeTen() throws Exception {
		Service serivce = new Service();
		Assert.assertEquals(2, serivce.pickRandomBanners(2).size());
		Assert.assertEquals(4, serivce.pickRandomBanners(10).size());
	}

	@Test(expected = RuntimeException.class)
	public void getBannersZero() throws Exception {
		Service serivce = new Service();
		serivce.pickRandomBanners(0);
	}

}
