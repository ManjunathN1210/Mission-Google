public class Average_Set_Numbers {
    static int average(int ... arr)
    {
        int sum = 0;
        for(int element : arr)
        {
            sum += element;
            
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        
        System.out.println("Average of a Set of Numbers are " + average(50,100,150));
    }
}