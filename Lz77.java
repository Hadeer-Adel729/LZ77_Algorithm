package lz77;

import java.util.Scanner;
//import java.util.*;

public class Lz77 {

    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);

        System.out.println("Choose an option:\n 1-Compression \n 2-Decompression \n 3-Exit");
        int option = Obj.nextInt();

        switch (option) {

            case 1:
                System.out.println("Enter Sequence:");
                String seq = Obj.next();
                Compression compress = new Compression(seq);
                compress.Display();
                break;

            case 2:
                System.out.println("Enter number of tags:");
                int tnum = Obj.nextInt();
                System.out.println("Enter tags:\n");
                Decompression decompress = new Decompression(tnum);
                break;

            case 3:

                break;
        }

    }

}
