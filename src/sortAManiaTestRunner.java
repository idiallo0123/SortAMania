
public class sortAManiaTestRunner
{
    public static void main(String[] args)
    {
        Team1SortCompetition team1 = new Team1SortCompetition(); //create an instance of your class

        int[] randIntArr = SortingUtil.randomIntsArr(10000); // initialize a random int array
        String[] randStringArr = SortingUtil.randomStringArr(10000, 5); //init a random string array

        /*challengeOne: Standard sort and process
         Data Set - an array of 10,000 random integers between 0-10000
        Task: Sort the list and return the median*/
        System.out.println("----------CHALLENGE 1----------");
        System.out.print("Unsorted: ");
        SortingUtil.printIntArr(randIntArr); //print out the unsorted array
        long time = System.currentTimeMillis(); //start the timer
        int median = team1.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; //stop the time
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); ///print the time
        System.out.println("Median equals: " + median); //print the median you found

        System.out.println("Sorted: ");
        SortingUtil.printIntArr(randIntArr); //check if array was sorted correctly

        randIntArr = SortingUtil.randomIntsArr(10000); // initialize a random int array
        randStringArr = SortingUtil.randomStringArr(10000, 5); //init a random string array

        /*challengeTwo: String sorting and searching
        Data Set - an array of 10,000 random strings (strings will be of length 5)
        Task: Sort the list and determine if it contains a given string, return the index of the first instance
        of that string, or -1 if not found*/
        //System.out.println("----------CHALLENGE 2----------");
        //System.out.print("Unsorted: ");
        //SortingUtil.printIntArr(randIntArr); //print out the unsorted array

        /*challengeThree: Mostly Sorted Big Array
        Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
        Task: Sort the list and return the median*/
        //System.out.println("----------CHALLENGE 3----------");
        //System.out.print("Unsorted: ");
        //SortingUtil.printIntArr(randIntArr); //print out the unsorted array

        /*challengeFour: Multi-Dimensional sorting
        Data Set - a multi-dimensional array int[1000][1000] all elements are random integers between 0-10000
        Task: Sort each sub-array and then sort the arrays by their median value
        Return the median of the median array*/
        System.out.println("----------CHALLENGE 4----------");
        System.out.print("Unsorted: ");
        SortingUtil.printIntArr(randIntArr); //print out the unsorted array
        time = System.currentTimeMillis(); //start the timer
        median = team1.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; //stop the time
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); ///print the time
        System.out.println("Median equals: " + median); //print the median you found

        int [][]CH4Array;
        CH4Array = new int[1000][1000]


        /*challengeFive: Mystery Sort and Search
        Data Set - an array of 10,000 objects that implement the comparable interface
        Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the
        position of the object, or -1 if not found.
        Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order.
        */

    }
} 
