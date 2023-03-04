package ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] list;
        int[] newList;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("tạo số phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("không được nhập quá 20");
        } while (size > 20);
        list = new int[size];
        newList = new int[size + 1];
        int i = 0;
        while (i < list.length) {
            System.out.print("Phần tử thứ " + (i + 1) + " : ");
            list[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng ban đầu: " + "\n" + Arrays.toString(list));
        System.out.print("gíá trị muốn thay thế: ");
        int x = scanner.nextInt();
        System.out.print("vị trí muốn thay thê: ");
        int ind = scanner.nextInt();
        for (int j = 0; j < newList.length; j++) {
            if (j + 1 == ind) {
                check = true;
                newList[j] = x;
                continue;
            }
            if (check) {
                newList[j] = list[j - 1];
            } else {
                newList[j] = list[j];
            }
        }

        System.out.println("các phần tử trong mảng");
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j] + "\t");
        }

        System.out.println(Arrays.toString(newList));
    }
}
