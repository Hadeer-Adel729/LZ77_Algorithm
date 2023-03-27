package lz77;

public class Compression {
    // private int Searchwindow;
    // private int lookAhead;
    private String seq;
    private Tag[] tags;

    public Compression(String str) {
        // Searchwindow =0;
        // lookAhead=0;
        tags = new Tag[1000];
        seq = str;
        String res;

        res = seq.substring(0);

        String Newseq = seq.substring(0, 0);
        int j = 0;
        while (res.length() > 0) {
            int count = 0;

            if (Newseq.contains(res.substring(0, 1))) {
                count++;
                int i = 1;// ABAAB
                while (Newseq.contains(res.substring(0, i + 1))) {
                    count++;
                    i++;
                }

                Newseq = Newseq.concat(res.substring(0, count + 1));
                int pos = Newseq.length() - (Newseq.indexOf(res.substring(0, count + 1)));
                tags[j] = new Tag(pos, count, res.charAt(count + 1));
                res = res.substring(count + 1);
                j++;

            } else {
                Newseq = Newseq.concat(res.substring(0, 1));
                tags[j] = new Tag(0, 0, res.charAt(0));
                res = res.substring(1);
                j++;
            }

        }

    }

    public void Display() {
        for (Tag tag : tags) {
            tag.DisplayTags();
        }
    }
}
