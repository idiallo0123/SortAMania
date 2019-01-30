public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        SortCompetition team1 = new Team1SortCompetition(); //create an instance of your class

        int[] randIntArr = SortingUtil.randomIntsArr(10000); // initialize a random int array
        String[] randStringArr = SortingUtil.randomStringArr(10000, 5); //init a random string array

        System.out.println("Unsorted");
        SortingUtil.printIntArr(randIntArr); //print out the unsorted array

        long time = System.currentTimeMillis(); //start the timer
        int median = team1.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; //stop the time
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); ///print the time
        System.out.println("Median equals: " + median); //print the median you found

        System.out.println("Sorted");
        SortingUtil.printIntArr(randIntArr); //check if array was sorted correctly
    }
}
