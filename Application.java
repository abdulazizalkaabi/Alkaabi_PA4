import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DuplicateRemover dr = new DuplicateRemover();
		
		dr.remove("problem1.txt");
		dr.write("unique_words.txt");
		

	}

}
