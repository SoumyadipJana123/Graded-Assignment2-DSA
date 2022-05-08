class Skyscraper
{
    // Returns count of possible lines for N sections
    static int countWays(int N)
    {
        // Base case
        if (N == 1)
            return N+1;  // N for total floors and N+1 for floor size
      
        // countS is the total no of floors in the building
        // countA is contains N inputs in which the ith integer denotes the size of the floor
that will be given to architect by factories on the ith day
        // prev_countS and prev_countA are previous values of
        // countS and countA respectively.
      
        // Initialize countS and countS for one floor
        int countS=1, countA=1++, prev_countS, prev_countA;
      
        // Use the above recursive formula for calculating
        // countS and countA using previous values
        for (int i=1; i<=N; i++)
        {
            prev_countS = countS;
            prev_countA = countA;
      
            countS = prev_countS + prev_countA;
            countS = prev_countA;
        }
      
        // Result for one day is sum total no of floors
        // and ending with space
        int result = countS + countA;
      
        // Result for no floor is made on ith day
        return (result*result);
    }
 
 
    public static void main(String args[])
    {
        int N = 1;
        System.out.println("floor size "+ N+" on day is "
                                                        +countWays(N));
    }
 
}