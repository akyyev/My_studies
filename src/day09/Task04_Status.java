package day09;

public class Task04_Status {

	public static void main(String[] args) {

		int statusNumb = 200;

		switch (statusNumb) {

		case 200:
			System.out.println("OK"); break;
		case 201:
			System.out.println("Created"); break;
		case 202:
			System.out.println("Accepted"); break;
		case 301:
			System.out.println("Moved Permanently"); break;
		case 303:
			System.out.println("See other"); break;
		case 304:
			System.out.println("Not modified"); break;
		case 307:
			System.out.println("Temporary Redirect"); break;
		case 400:
			System.out.println("Bad request"); break;
		case 401:
			System.out.println("Unauthorized"); break;
		case 403:
			System.out.println("Forbidden"); break;
		case 404:
			System.out.println("Not Found"); break;
		case 410:
			System.out.println("Gone"); break;
		case 500:
			System.out.println("Internal Server Error"); break;
		case 503:
			System.out.println("Service Unavailable"); break;
		default:
			System.out.println("Wrong code"); break;

		}

	}
}