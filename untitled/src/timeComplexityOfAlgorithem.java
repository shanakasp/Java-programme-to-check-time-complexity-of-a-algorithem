public class timeComplexityOfAlgorithem {
    public static void main(String[] args)
    {
        double now= System.currentTimeMillis();

        timeComplexityOfAlgorithem demo= new timeComplexityOfAlgorithem();
        System.out.println(demo.findSum(100000));

        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + "mill");

    }

    public int findSum(int n)
    {
        return n*(n+1)/2;
    }}

    /*public int findSum(int n)
    {
        int sum =0;
        for (int i=1; i<=n; i++)
        {
            sum = sum +i;
        }
        return sum;
    }
}
*/