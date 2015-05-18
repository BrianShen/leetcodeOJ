package code_1_10;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/18  14:09
 * description:The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR" 
 */
public class ZigZagConversion_6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        char arr[] = s.toCharArray();
        int ele = 2 * numRows - 2;
        StringBuilder  sb[] = new StringBuilder[numRows];
        for (int i = 0;i < numRows;i ++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0;i < arr.length;i ++) {
            int sequence = i % ele;
            if (sequence < numRows) {
                sb[sequence].append(arr[i]);
            }else {
                sb[ele - sequence].append(arr[i]);
            }
        }
        for (int i = 1;i < numRows;i ++) {
            sb[0].append(sb[i]);
        }
        
        return sb[0].toString();
    }
}
