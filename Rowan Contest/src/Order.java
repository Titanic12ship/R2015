import java.util.Arrays;
import java.util.Comparator;

import TurtleGraphics.KeyboardReader;
public class Order {

	public static class Word
	{
		private String word;
		private int num;
		private int newNum;
		
		public Word(String word, int num)
		{
			this.word = word;
			this.num = num;
		}

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getNewNum() {
			return newNum;
		}

		public void setNewNum(int newNum) {
			this.newNum = newNum;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KeyboardReader rdr = new KeyboardReader();
		
		String in = rdr.readLine("Enter words separated by a space: ");
		
		//Order.Word[] wordObjects = {new Word(), new Word()};
		Order.Word[] wordObjects;

		
		String[] words = in.split(",");
		wordObjects = new Order.Word[words.length];
		Order.Word w;
		for (int count = 0; count < words.length; count++)
		{
			w = new Order.Word(words[count], count+1);
			wordObjects[count] = w;
		}
		
		/*
		Arrays.sort(words, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				System.out.println(o1.toUpperCase().compareTo(o2.toUpperCase()));
				return o1.toUpperCase().compareTo(o2.toUpperCase());
			}
			
		});
		*/
		
		Arrays.sort(wordObjects, new Comparator<Order.Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				//System.out.println(o1.getWord().toUpperCase().compareTo(o2.getWord().toUpperCase()));
				return o1.getWord().toUpperCase().compareTo(o2.getWord().toUpperCase());
			}
			
		});
		
		/*
		for (String word : words)
		{
			System.out.println(word);
		}
		*/
		
		for (int count = 0; count < wordObjects.length; count++)
		{
			wordObjects[count].setNewNum(count+1);
			//System.out.println(word.getWord() + " (" + word.getNum() + ")");
		}
		
		Arrays.sort(wordObjects, new Comparator<Order.Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				//System.out.println(o1.getWord().toUpperCase().compareTo(o2.getWord().toUpperCase()));
				return Integer.compare(o1.getNum(), o2.getNum()); // don't use getNewNum, because that will cause the words to remain sorted in alphabetical order.
				// We want them in their original order
			}
			
		});
		
		for (int count = 0; count < wordObjects.length; count++)
		{
			System.out.println(wordObjects[count].getWord() + " " + wordObjects[count].getNewNum());
			//System.out.println(word.getWord() + " (" + word.getNum() + ")");
		}
		
		//System.out.println('i'-'t');
		//System.out.println((char) (66+32));
	}

}
 

// G B N D