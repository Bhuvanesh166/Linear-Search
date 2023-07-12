import java.util.Scanner;

class Search{
    public int linearSearch(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Search search =new Search();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the search element");
        int k=scanner.nextInt();
        System.out.println("Occurance of element:");
        System.out.println(search.linearSearch(arr,k));

    }
}