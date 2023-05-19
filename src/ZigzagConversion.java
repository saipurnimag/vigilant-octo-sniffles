public class ZigzagConversion {
    // https://github.com/saipurnimag/vigilant-octo-sniffle.git
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder stringBuilder[] = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            stringBuilder[i] = new StringBuilder();
        }
        int i = 1, j = 0;
        boolean down = true;
        while (j < s.length()) {
            stringBuilder[i - 1].append(s.substring(j, j + 1));
            j++;
            if (down) {
                i++;
                if (i == numRows + 1) {
                    i = i - 2;
                    down = !down;
                }
            } else {
                i--;
                if (i == 0) {
                    i = 2;
                    down = !down;
                }
            }
        }
        StringBuilder fs = new StringBuilder();
        for (StringBuilder sb : stringBuilder
        ) {
            fs.append(sb);
        }
        return fs.toString();
    }
}
