package com.neznatnov;

public class DataOverflow {
    public static void main(String[] args) {

        // хранит целое число от -128 до 127 и занимает 1 байт
        byte FirstByte = 100;
        byte SecondByte = 100;
        byte SumByte = (byte) (FirstByte + SecondByte);
        System.out.println(SumByte);

        // хранит целое число от -32768 до 32767 и занимает 2 байта
        short FirstShort = 30000;
        short SecondShort = 10000;
        short SumShort = (short) (FirstShort + SecondShort);
        System.out.println(SumShort);


        // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int FirstInt = 2000000000;
        int SecondInt = 2000000000;
        int SumInt = (FirstInt + SecondInt);
        System.out.println(SumInt);


        // хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long FirstLong = 9000000000000000000L;
        long SecondLong = 9000000000000000000L;
        long SumLong = (FirstLong + SecondLong);
        System.out.println(SumLong);


    }
}