import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		DuplicateCounter dc = new DuplicateCounter();
		
		dc.count("problem2.txt");
		
		dc.write("unique_word_counts.txt");

	}

}
