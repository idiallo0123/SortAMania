public class Team1SortCompetition
{

    public int challengeOne(int[]arr) {
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        return arr[arr.length/2];
    }

    public int challengeTwo(String[] arr,String query){
        QuickString quickString=new QuickString();
        quickString.sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals(query)){
                return i;
            }
        }
        return -1;
    }

}
