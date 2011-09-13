public class HeaterCLI {
	public static void main(String[] args) {
		if (args.length == 1) {
			final String url = args[0];
			final Heater h = new Heater();
			while (true)
				h.keepHot(url, 60 * 1000);
		}
	}
}
