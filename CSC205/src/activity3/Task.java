package activity3;

public class Task implements Priority
{
	//intitalize variables
	
		public int priority; 
		public String levels;
		
		 public Task(int i) 
		 {
			priority = i;
		 }
		public void setPriority(int level)
		{
			priority = level;
		}
		 public String getPriority() 
		{
		if (priority == 0)
			levels = " no priority";
		if (priority == 1)
			levels = " low priority";
		if (priority == 2)
			levels = " medium priority";
		if (priority == 3)
			levels = " high priority";
		
		return levels;
			
		}
		
		public String toString()
		{
			return "The task has: " + getPriority();
		}

}


