package leetcode_67;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder ret = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        char carry = '0';

        while (i >= 0 && j >= 0) {

            char aChar = a.charAt(i);
            char bChar = b.charAt(j);

            if (carry == '0') {
                if (aChar == '1' && bChar == '1') {
                    ret.append(0);
                    carry = '1';
                } else if (aChar == '0' && bChar == '1') {
                    ret.append(1);
                } else if (aChar == '1' && bChar == '0') {
                    ret.append(1);
                } else {
                    ret.append(0);
                }
            } else {
                if (aChar == '1' && bChar == '1') {
                    ret.append(1);
                } else if (aChar == '0' && bChar == '1') {
                    ret.append(0);
                    carry = '0';
                } else if (aChar == '1' && bChar == '0') {
                    ret.append(1);
                    carry = '0';
                } else {
                    ret.append(1);
                    carry = '0';
                }
            }

            i--;
            j--;
        }

        if (i >= 0) {
            for (int k = i; k >= 0; k--) {
                char aChar = a.charAt(k);

                if (carry == '1') {
                    if (aChar == '1') {
                        ret.append(0);
                    } else {
                        ret.append(1);
                        carry = '0';
                    }
                } else {
                    ret.append(aChar);
                }
            }
        }

        if (j >= 0) {
            for (int k = j; k >= 0; k--) {
                char bChar = b.charAt(k);

                if (carry == '1') {
                    if (bChar == '1') {
                        ret.append(0);
                    } else {
                        ret.append(1);
                        carry = '0';
                    }
                } else {
                    ret.append(bChar);
                }
            }
        }

        if (carry == '1') {
            ret.append(1);
        }

        return ret.reverse().toString();
    }
}
