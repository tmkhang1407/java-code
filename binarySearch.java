import java.util.Scanner;
public class binarySearch {

     // Trả về chỉ mục của x nếu nó có trong arr[l..r]
     // ngược lại trả về -1
     int binarysearch(int arr[], int l, int r, int x) {
          if (r >= l) {
               int mid = l + (r - l) / 2;    
               // Nếu phần tử có ở chính giữa
               if (arr[mid] == x)
                   return mid;     
               // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
               // hiện diện trong mảng con bên trái
               if (arr[mid] > x)
                    return binarysearch(arr, l, mid - 1, x);  
               // Ngược lại, phần tử chỉ có thể có mặt
               // trong mảng con bên phải
               return binarysearch(arr, mid + 1, r, x);
          }

          // Nếu phầnt tử không có trong mảng
          return -1;
     }

     public static void main(String args[]) {
          binarySearch ob = new binarySearch();
          int arr[] = {7, 14, 19, 21, 24, 28, 29 };
          int n = arr.length;
          System.out.println("Cây nhị phân :");
          for(int i: arr){
               System.out.println(i);
          }
          int x;
          Scanner ip= new Scanner(System.in);
          System.out.println("Nhập giá trị cần tìm kiếm: ");
          x = ip.nextInt();
          int result = ob.binarysearch(arr, 0, n - 1, x);
          if (result == -1)
               System.out.println("Phần tử " + x + " không tồn tại trong cây nhị phân.");
          else
               System.out.println("Phần tử " + x + " được tìm thấy tại vị trí: " + result);
    }
}