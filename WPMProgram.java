import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
static String[] words = {"letter", "alligator", "an" , "hi" , "pheonix" , "mobile" , "instagram" , "like" , "departure" , "crawl"};
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(words[rand.nextInt(9)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		char characters = typedWords.charAt(0);
		int numChars = typedWords.length();
		//  (x characters / 5) / 1min = y  WPM
		double numChars1 = 0;
		int wpm = (int) ((((double) numChars / 5)/ seconds) * 60);
		int cpm=(int)((((double) numChars)/seconds)*60);
		int acc= (int)(((double)characters)/wpm);
		System.out.println("Your wpm is " + wpm +  " ! ");
		System.out.println("Your cpm is "+  cpm +" ! ");
		System.out.println("Your accuracy of typing is "+ acc +" ! ");
	
		
	}

}	

	