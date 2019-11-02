import java.io.*;
import java.util.*;

public class DuplicateCounter {
	
	List<Integer> wordCounter;
	
	public DuplicateCounter() {
		wordCounter = new ArrayList<Integer>();
	}
	
	public void count(String dataFile) throws IOException {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		FileReader fr = new FileReader(dataFile);
		
		
		
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine())!= null) {
			StringTokenizer t = new StringTokenizer(line);
			
			while(t.hasMoreTokens()) {
				String w = t.nextToken();
				
				if (hm.containsKey(w)){
					int c = hm.get(w);
					int b = c;
					b++;
					hm.replace(w, c, b);
				}
				else {
					hm.put(w, 1);
				}
				
				//int a = hm.get(w);
				//System.out.println(a);
			}
		}
		
		
		br.close();
		
		
		wordCounter.addAll(hm.values());
		
		
	}
	
	
	public void write(String outputFile) throws IOException {
		File f = new File(outputFile);
		
		FileWriter fw = new FileWriter(f,false);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i=0;i<wordCounter.size();i++) {
			bw.write(wordCounter.get(i).toString());
			bw.newLine();
		}
		
		bw.close();
	}
	

}
