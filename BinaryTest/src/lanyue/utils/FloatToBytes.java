package lanyue.utils;

public class FloatToBytes {
    public static void main(String[] args) {
        byte[] aa=getBytes(2f);
        System.out.println(new BytesToString(aa).getString());
    }
    float f1;
    public FloatToBytes(float f){
        this.f1=f;
    }
    public FloatToBytes(){

    }
    /**
     * 将float转为低字节在前，高字节在后的byte数组
     */
    public static byte[] getBytes(float f) {

        // 把float转换为byte[]
        int fbit = Float.floatToIntBits(f);

        byte[] b = new byte[4];
        for (int i = 0; i < 4; i++) {
            b[i] = (byte) (fbit >> (24 - i * 8));
        }

        // 翻转数组
        int len = b.length;
        // 建立一个与源数组元素类型相同的数组
        byte[] dest = new byte[len];
        // 为了防止修改源数组，将源数组拷贝一份副本
        System.arraycopy(b, 0, dest, 0, len);
        byte temp;
        // 将顺位第i个与倒数第i个交换
        for (int i = 0; i < len / 2; ++i) {
            temp = dest[i];
            dest[i] = dest[len - i - 1];
            dest[len - i - 1] = temp;
        }

        return dest;

    }
}
