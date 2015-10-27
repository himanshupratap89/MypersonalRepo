package oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList10000 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		
		ArrayList<Integer> objarrList =  new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		System.out.println("startTime of loop:" + startTime);
		long endTime = 0;
		for(int i=0; i<10000;i++)
		{
		   objarrList.add(num++);
		   
		}
		endTime = System.currentTimeMillis();
		System.out.println("endTime of loop:" + endTime);
		long timeneeded =  endTime - startTime;
		System.out.println("time to execute loop:" + timeneeded);
		Iterator<Integer> itr = objarrList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
