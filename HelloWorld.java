import java.io.IOException;

public class HelloWorld {

	public static void main(String[] args) {
		try {
			throw new IOException("Hello");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}