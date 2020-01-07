package randomJavaPractice;

public class StringBuilderImplementation {
    char[] masterArray;
    int capacity;
    int size;

    public StringBuilderImplementation()
    {
        masterArray = new char[10];
        capacity = 10;
        size =0;
    }

    public StringBuilderImplementation append(String inputString)
    {
        if(inputString.length()>capacity-size) {
            char[] tempPlaceholderArray = new char[(inputString.length() + capacity) * 2];
            for (int i = 0; i < masterArray.length; i++) {
                tempPlaceholderArray[i] = masterArray[i];
            }
            masterArray = tempPlaceholderArray;
            capacity = tempPlaceholderArray.length;

        }
            int index = size+1;
            for(int i = 0; i< inputString.length();i++)
            {
                masterArray[index]=inputString.charAt(i);
                index++;
            }
            size++;
            return this;
        
        }
    }
