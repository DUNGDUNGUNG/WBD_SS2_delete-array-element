import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] array = {7,6,4,5,7,3};
        System.out.println("danh sach phan tu cua mang");
        for (int i1 : array) {
            System.out.print(i1 + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n nhap vi tri muon xoa");
        int index =scanner.nextInt();
        int d = array.length;
        for (int i =0;i<d;i++){
            if (index == i){
                array[i]=array[i+1];
                i++;
            }
            System.out.print(array[i] + "\t");
        }
    }
}
