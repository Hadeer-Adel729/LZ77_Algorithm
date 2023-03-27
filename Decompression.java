package lz77;

import java.util.Scanner;

public class Decompression {
    private String seq;
    private Tag[] tags;

    public Decompression(int tNum) {
        tags = new Tag[tNum];
        for (int i = 0; i < tNum; i++) {
            // tags[i].getTags();
            Scanner Obj = new Scanner(System.in);
            String s;
            s = Obj.next();
            tags[i].position = Obj.nextInt();
            s = Obj.next();
            tags[i].length = Obj.nextInt();
            s = Obj.next();
            tags[i].symbol = Obj.next().charAt(0);
            s = Obj.next();

            int indx = seq.length() - tags[i].position;
            seq = seq.concat(seq.substring(indx, tags[i].length));
            // String temp = tags[i].symbol;
            seq = seq + tags[i].symbol;

        }

        System.out.print(seq);
    }
}
