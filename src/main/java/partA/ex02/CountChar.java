package partA.ex02;

public class CountChar {
    public static String countChar() {
        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;

           //if (str.charAt(i) != 'w')
               //continue;

        count++;

       str += ("Counting w : " + count );
        return str;
    }

    public static void main(String[] args) {
        String charOutput = countChar();
        System.out.print(charOutput);
    }


    }

