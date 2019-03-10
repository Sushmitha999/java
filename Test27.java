//pack duplicates
public class Test27 {
    Test27()
    {
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        pack(letters);
    }
    void pack(char [] array)
    {
        String s = Character.toString(array[0]);
        for(int i = 1; i<array.length; i++)
        {
            if(array[i] != array [i-1])
            {
                System.out.print(s+ ", ");
                s = Character.toString(array[i]);
            }
            else
            {
                s = s + array[i];
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        new Test27();
    }
}