import java.util.Arrays;
public class MyArrayList
{
	private Object[] myStore;
	private int actSize = 0;

	public MyArrayList()
	{
	myStore = new Object[10];
	}

	public Object get(int index)
	{
	if(index<actSize)
	{
		return myStore[index];


	}
	else
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	}

	public int size ()
	{
		return actSize;
	}

	public void increaseListSize()
	{
		int newSize = (myStore.length)*2;
		Object[] tempPlaceholder = new Object[newSize];
		for(int i=0; i<myStore.length;i++)
		{
			tempPlaceholder[i] = myStore[i];
		}

		myStore = tempPlaceholder;
	}

	public void addObject(Object input)
	{
		if(myStore.length-actSize<=5)
		{
			increaseListSize();
		}

	actSize = actSize+1;
	myStore[actSize] = input;
	}

	public Object remove(int index)
	{
		if(index < actSize)
		{
			Object result = myStore[index];
			myStore[index] = null;
			for(int i = index;i <actSize-1;i++)
			{
				Object temp = myStore[i];
				myStore[i] = myStore[i+1];
				myStore[i+1] = temp;

			}
			actSize = actSize-1;
			return result;


		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}


}