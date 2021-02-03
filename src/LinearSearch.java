import java.util.Scanner;

public class LinearSearch {


    public void linearSearch(int findNumber){
        //deafult array
        int [] array=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            int count=1;
            System.out.println("enter array element:");
            count++;
            array[i]=scanner.nextInt();

        }
        for (int j=0;j<array.length;j++){
            if (array[j]==findNumber){
                System.out.println("  find your number :"+findNumber);

            }
        }
    }


    public static void main(String[] args) {
        LinearSearch linearSearch=new LinearSearch();
        linearSearch.linearSearch(7);



    }
}
