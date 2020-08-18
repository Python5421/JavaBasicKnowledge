package com.lanyue;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 二进制移位
 */
public class BinaryShiftTest {
    private static byte[] bytes;
    private byte b;
    public static void main(String[] args) {
//        //融合状态 假如值为4 那么低字节在前，高字节在后
//        byte[] bytes1={0x40,0x00,0x00,0x00};
//        //Gps_pos_status
//        byte[] bytes2={0x40,0x00,0x00,0x00};
//        int SOLUTION_STATUS=64;//0000 0100 与1111 0000
//        System.out.println(SOLUTION_STATUS>>4);
//        int SOLUTION_STATUS1=4;
//        for (int i=0;i<8;i++){
//            System.out.println("00000100右移"+i+":"+(SOLUTION_STATUS1>>i));
//        }

//        int SOLUTION_STATUS2=68;//0100 0100 与1111 0000
//        System.out.println(SOLUTION_STATUS2&0x0F);
        byte a0= (byte) 0xC0;
        byte a1=0x00;
        bytes= new byte[]{a0, a1};

        System.out.println(getInt()>>6);
    }
    public static Integer getInt(){
        ByteBuffer buf = ByteBuffer.allocateDirect(4);
        buf = buf.order(ByteOrder.LITTLE_ENDIAN);//默认大端，小端用这行
        buf.put(bytes);
        buf.rewind();
        Integer f2 = buf.getInt();
        return f2;
    }

}
