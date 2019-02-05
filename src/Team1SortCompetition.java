public class Team1SortCompetition
{

    public int challengeOne(int[]arr) {
    QuickSort quickSort=new QuickSort();
    quickSort.sort(arr,0,arr.length-1);
    return arr[arr.length/2];
    }

}
