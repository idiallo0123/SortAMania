public class Team1SortCompetition extends SortCompetition
{

    public int challengeOne(int[]arr) {
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        return SortingUtil.Median(arr);
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

    public int challengeThree(int[]arr){
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        return SortingUtil.Median(arr);
    }

    public int challengeFour(int[][]arr){
        QuickSort quickSort=new QuickSort();
        int[]med=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            quickSort.sort(arr[i],0,arr[i].length-1);
        }
        for (int i=0;i<arr.length;i++){
            med[i]=SortingUtil.Median(arr[i]);
        }
        return SortingUtil.Median(med);
}

    public String greeting(){
        return "Hi, this sorter uses quicksort to sort the arrays.";
    }

}
