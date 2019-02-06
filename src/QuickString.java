public class QuickString {
    int partition(String[] arr, int l, int h) {
        String pivot = arr[h];
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (arr[j].compareTo(pivot)<=0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

        return i + 1;
    }

    void sort(String arr[], int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);

            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }
    }
}
