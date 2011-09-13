public class HeaterCLI {
	public static void main(String[] args) {
		if (args.length == 1) {
			final String url = args[0];
			final Heater h = new Heater();
			while (true)
				h.keepHot(url, 60 * 1000);
		} else {
			printUsage();
		}
	}

	private static void printUsage() {
		System.out.println("./run.sh <URL>");
		System.out.println("         Press CTRL+C to cancel heating the URL.");
	}
}
