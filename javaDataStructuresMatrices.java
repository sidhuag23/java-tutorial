import java.util.*;
public class Test {
    public static void main(String [] args){
        // matrices
        int [][] a={
                {1,2,3,4,5},
                {2,3,4,55},
                {2,3,4,55,555},
                {3,4,5,56,667}
        };
        int counter=0;

        int COL_counter=a.length;
        System.out.println(COL_counter); //row count

// need to use array list need to be dynamic first
        ArrayList<Integer> arrayListData = new ArrayList<Integer>();

        //total array length to array list row size inside arrayListData
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].length);
            arrayListData.add(a[i].length); // putting the size of A[i]
        }

        int [][]arr = new int[COL_counter][]; // row set it ip

        for(int i=0; i<a.length; i++){
            if(COL_counter==arrayListData.size()){
                arr[i] = new int[arrayListData.get(i)]; // arr[row 0] = new int[has arrayListData [i] columns]
                System.out.println("size display off arr"+arr[i].length+"the size display off "+a[i].length);
            }
        }

        System.out.println("this is the size of arr-length "+arr.length);

        //now swapping safely
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                arr[i][j]=a[i][j];
                System.out.println("probably done");
            }
        }

        //checking whether values have been impleemented or not
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }

        //tryna look at the size of a[i] and arr[i] if using arrayListData
      for(int i=0; i< arrayListData.size(); i++) {
          System.out.println("tryna look the size " + a[i].length);
      }
      for(int i=0; i<arrayListData.size();i++){
          System.out.println("tryna look the size another" + arr[i].length);
      }

        System.out.println(arrayListData);
        System.out.println(arrayListData.size()); // size 2
        System.out.println(arrayListData.get(1).getClass().getName()); //getting the index and also getting the data type using .get(1).getClass().getName()

        for(int i=0; i<a.length; i++ ){
            System.out.println();
            for(int j=0; j<a[i].length;j++){
                if(counter<=a[i].length) {
                   counter++;  // you don't need the counter just for show
                }
                System.out.print(" "+a[i][j]);
            }
        }
        System.out.println("this is the counter"+counter);
        int array_size_column = counter - 1;

        int [][]test_array_swap = new int[a.length][];
        for(int i=0; i<a.length; i++){
            if(a.length==arrayListData.size()){
                test_array_swap[i]=new int[arrayListData.get(i)];
            }
        }
        System.out.println("this is the size of the "+test_array_swap.length);
        System.out.println("this is the size of the "+a.length);
        System.out.println("this is the size of the "+arr.length);

        //#matrix tryna add something
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                test_array_swap[i][j]=a[i][j]+arr[i][j];
            }
        }
        // printing the matrix addition
        for(int i=0; i<test_array_swap.length; i++){
            for(int j =0; j<test_array_swap[i].length; j++){
                System.out.println("its doing the addition = "+a[i][j]+"+"+arr[i][j]+"="+test_array_swap[i][j]);
            }
        }

    }
}
