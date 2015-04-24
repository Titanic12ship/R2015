import java.util.ArrayList;
import java.util.List;

// 328, 449

public class TestMain {
	
	public static void printArray(int[] arr)
	{
		for (int i : arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Hello");
		
		printArray(new int[] {1,2,3});
		
		
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < 6; i++)
		{
			li.add("element " + i);
		}
		
		for (int count = 0; count < li.size(); count++)
		{
			System.out.println(count + " " + li.get(count));
		}
		
		li.remove(1);
		
		System.out.println("After 1st removal (element 1 removed) --------------------");
		
		for (int count = 0; count < li.size(); count++)
		{
			System.out.println(count + " " + li.get(count));
		}
		
		li.remove(3);

		
		System.out.println("After 2nd removal (element 3 (4 in original) removed) --------------------");
		
		for (int count = 0; count < li.size(); count++)
		{
			System.out.println(count + " " + li.get(count));
		}
		
		System.out.println(li.get(2));
		
	}
	
	
	
}
