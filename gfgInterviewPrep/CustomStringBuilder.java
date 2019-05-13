public class CustomStringBuilder
{
	char[] masterArray;
	int capacity;
	int size;

	public CustomStringBuilder(int size)
	{
		masterArray = new char[10];
		capacity = 10;
		size = 0;
	}

	public CustomStringBuilder append(String inputString)
	{
		if(inputString.legth()+size>capacity)
		{
			char[] tempPlaceholderArray = new char[(inputString.legth()+size)*2]
			for (int i = 0; i< masterArray.legth;i++)
			{
				tempPlaceholderArray[i]=masterArray[i];

			}
			masterArray = tempPlaceholderArray;
			int index = size+1;
			for(int i = 0;i<inputString.legth;i++)
			{
				masterArray[index] = inputString.charAt(i);
				index++;
			}
		}
	}
}