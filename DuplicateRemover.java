import java.io.*;
import java.util.*;

public class DuplicateRemover {
	
	List<String> uniqueWords;
	
	public DuplicateRemover() {
		uniqueWords = new ArrayList<String>();
	}
	
	public void remove(String dataFile) throws IOException {
		Set<String> words = new HashSet<String>();
		
		FileReader fr = new FileReader(dataFile);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine())!= null) {
			StringTokenizer t = new StringTokenizer(line);
			String w = "";
			
			while(t.hasMoreTokens()) {
				w = t.nextToken();
				words.add(w);
			}
			
		}
		
		br.close();
		
		uniqueWords.addAll(words);
		
	}
	
	public void write(String outputFile) throws IOException {
		
		File f = new File(outputFile);
		
		FileWriter fw = new FileWriter(f,false);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i=0;i<uniqueWords.size();i++) {
			bw.write(uniqueWords.get(i));
			bw.newLine();
		}
		
		bw.close();
		
	}

}
