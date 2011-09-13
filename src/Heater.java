import com.gargoylesoftware.htmlunit.WebClient;

public class Heater {
	private static final WebClient client = new WebClient();

	public void keepHot(final String url, final long ajaxWaitTimeMs) {
		try {
			client.getPage(url);
			Thread.sleep(ajaxWaitTimeMs);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}
