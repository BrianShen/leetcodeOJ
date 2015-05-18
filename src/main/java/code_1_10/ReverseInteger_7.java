package code_1_10;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/18  16:08
 * description:
 */
public class ReverseInteger_7 {
    //240ms
    public int reverse(int x) {
        if (x == 0) return 0;
        if (x == Integer.MIN_VALUE) return 0;
        int flag = 1;
        if (x < 0) {
            x *= (-1);
            flag = -1;
        }
        long reverse = 0;
        while (x != 0) {
            int temp = x % 10;
            reverse = reverse * 10 + temp;
            x = (x - x % 10) / 10;
        }
        if (reverse > new Long(Integer.MAX_VALUE)) return 0;
        return (int) (flag * reverse);
    }

    //Using StringBuilder   296ms
//    public int reverse(int x) {
//        if (x == 0) return 0;
//        if (x == Integer.MIN_VALUE) return 0;
//        int flag = 1;
//        if (x < 0) {
//            x *= (-1);
//            flag = -1;
//        }
//        StringBuilder sb = new StringBuilder();
//        while (x != 0) {
//            sb.append(x % 10);
//            x = (x - x % 10) / 10;
//        }
//        long reverse = Long.parseLong(sb.toString());
//        if (reverse > new Long(Integer.MAX_VALUE)) return 0;
//        return (int) (flag * reverse);
//    }
}
