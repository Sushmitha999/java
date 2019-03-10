//boolean table
class Test32{
public static void main(String args[]) {
    table(0, 3, new int[3]);
    table(0, 4, new int[4]);
    
}

private static void table(int index, int size, int[] current) {
    if(index == size) { 
        for(int i = 0; i < size; i++) {
            System.out.print(current[i] + " ");
        }
        System.out.println();
    } else {
        for(int i = 0; i < 2; i++) {
            current[index] = i;
            table(index + 1, size, current);
        }
    }
}
}