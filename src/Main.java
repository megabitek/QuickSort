import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] myArray = {3, 3,5,5,2,1,67,8,65,3};
        //displayArray(myArray);
        quickSort(myArray, 0, myArray.length-1);

    displayArray(myArray);
    }


static void quickSort(int [] array, int start, int end){
        if (start >=end) return;
int pivot = partition(array, start, end);
quickSort(array, start, pivot-1);
quickSort(array, pivot+1, end);
}
static int partition (int [] array, int start, int end ){
int value = array[end];
int position = start;
for (int i = start;  i<end; i++){
    if (array[i]<= value){
        int temp = array[i];
        array[i] = array[position];
        array[position] = temp;
        position++;
    }
}
array[end]= array[position];
array[position] = value;
return position;
}
 static  void displayArray(int [] array){
        Arrays.stream(array).forEach(n->System.out.println(n));
 }
}