//consecutive duplicates eliminated
class Compress
{
void compress(int [] array)
    {
        System.out.println(array[0]);
        for (int i = 1; i<array.length; i++)
        {
            if (array[i]!=array[i-1])
            {
                System.out.print(array[i]+" ");
            }
        }
	System.out.println();
    }
}
public class Test26 {
    public static void main(String[] args)
    {
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        int [] num2 = {1,1};
        int [] num1 = {1};
	Compress c=new Compress();
        c.compress(nums);
        c.compress(num2);
        c.compress(num1);
    }
}