package lanyue;

import lanyue.utils.BytesToStrings;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String init="AA638A00A08700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000A04000004040000000000000000000000000000000000000004002000000E54E09D7";
//        System.out.println(addComma(init));
        String init1=addComma(init);
        String[] outputBytes_1231=init1.split("\\s+");
//        String[] outputBytes_1231=new BytesToStrings().getStrings(outputBytes);
        for(int i=0;i<outputBytes_1231.length;i++){
            System.out.print("("+i+")"+outputBytes_1231[i]);
        }
        System.out.println("");
        String[] outputBytes_aaa= Arrays.copyOfRange(outputBytes_1231, 4, outputBytes_1231.length-4);
        for(int i=0;i<outputBytes_aaa.length;i++){
            System.out.print("("+i+")"+outputBytes_aaa[i]);
        }
        System.out.println("");
    }
    public static String addComma(String str) {
        StringBuilder newstr = new StringBuilder();
        int size = ((str.length()) % 2 == 0) ? ((str.length()) / 2) : ((str.length()) / 2 + 1);
        for (int i = 0; i < size; i++) {
            int endIndex = (i + 1) * 2;
            if ((i + 1) == size) {
                endIndex = str.length();
            }
            if (i == 0) {
                newstr.append(str.substring(i, endIndex));
            } else {
                newstr.append(" ").append(str.substring(i * 2, endIndex));
            }
        }
        return newstr.toString();
    }
}
