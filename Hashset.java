import java.util.*;
public class Hashset {
  public static void ArrayUnion(int arr1[], int arr2[]){

    HashSet <Integer> set = new HashSet<>();
    int n1 = arr1.length;
    int n2 = arr2.length;
    for(int i = 0; i<n1; i++){
      set.add(arr1[i]);
    }
    for(int j = 0; j< n2; j++){
      set.add(arr2[j]);
    }

    System.out.println(set.size());
    System.out.println(set);
  }

  public static void main(String args[]){
    int arr1[] = {7,3,9};
    int arr2[] = {6,3,9,2,9,4};
    ArrayUnion(arr1,arr2);
  }
  
}
