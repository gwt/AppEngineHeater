import junit.framework.TestCase;

public class TestHeater extends TestCase {
	private Heater heater;

	@Override
	protected void setUp() throws Exception {
		this.heater = new Heater();
	}

	public void testKeepingHot() {
		final String url = "http://ingosblog.appspot.com";
		final int iterations = 10;
		final int ajaxSleepTimeMs = 1 * 1000;

		for (int i = 0; i < iterations; i++) {
			heater.keepHot(url, ajaxSleepTimeMs);
		}
	}
}
