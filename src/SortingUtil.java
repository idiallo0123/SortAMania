public class SortingUtil {
    public static void swap(int[] arr, int i,int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int[] randomIntsArr(int c){
        int arr[]=new int[c];
        for (int n=0;n<c;n++){
            arr[n]=(int)(Math.random()*10001);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] arrString = new String[num];
        while (num>0)
        {
            int i=0;
            String s = "";
            while (i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arrString[num] = s;
        }
        return arrString;
    }

    public static int[][] randomIntArr(int l,int w){
        int arr[][]=new int[l][w];
        for (int x=0;x<l;x++){
            for (int y=0;y<w;y++){
                arr[x][y]=(int)(Math.random()*10001);
            }
        }
        return arr;
    }

    public static String randomString(int length){
        int i=0;
        String s=" ";
        while (i<length){
            char c=(char)((Math.random()*26)+97);
            s=s+c;
            i++;
        }
        return s;
    }

    public static boolean isSorted(int[] arr){
        int n=1;
        while(n>0){
            n=0;
            for(int x=0;x<arr.length-1;x++){
                if(arr[x]>arr[x+1]){
                    n++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkSum(int[]before,int[]after){
        int arr1=0;
        int arr2=0;
        if(before.length==after.length){
            return true;
        }else{
            return false;
        }
    }

    public static void printIntArr(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print('\n');
    }

    public static void printStringArr(String[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print('\n');
    }

    public static void printIntsArr(int[][]arr){
        for(int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.print('\n');
        }
    }

    public static int Median(int arr[]){
        return(arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2;
    }

}