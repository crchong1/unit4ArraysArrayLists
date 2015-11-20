import java.util.Arrays;
public class ArrayPractice
{
    public static void boundsException()
    {
        int[] values = {1,4,9,16,25};
        int x = values[3];
    }
    public static void fill()
    {
        int[] values = new int[100];
        
        for(int i=0; i < values.length; i++)
        {
            values[i] = i*i;
        }
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }
    
    public static void findMax()
    {
        int[] values = {2,3,46,546,7,45,3,6,34,6,346,4,6,3,6,7};
        int largest = values[0];
        
        for(int i = 1; i < values.length; i++)
        {
            if (largest < values[i])
            {
                largest = values[i];
                
            }
        }
        System.out.println(largest);
        
        
    }
}
