public class Solution{
      public static void main(String[] args){      
        System.out.println(rev("HackerRank"));
      }
      public static String rev(String str){
        char[] arr = str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left < right){
            char temp;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
      }
}
