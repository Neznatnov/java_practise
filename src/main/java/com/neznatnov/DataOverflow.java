package com.neznatnov;

public class DataOverflow {
    public static void main(String[] args) {

        // хранит целое число от -128 до 127 и занимает 1 байт
        byte firstByte = 100;
        byte secondByte = 100;
        byte sumByte = (byte) (firstByte + secondByte);
        System.out.println(sumByte);

        // хранит целое число от -32768 до 32767 и занимает 2 байта
        short firstShort = 30000;
        short secondShort = 10000;
        short sumShort = (short) (firstShort + secondShort);
        System.out.println(sumShort);


        // хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int firstInt = 2000000000;
        int secondInt = 2000000000;
        int sumInt = (firstInt + secondInt);
        System.out.println(sumInt);


        // хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long firstLong = 9000000000000000000L;
        long secondLong = 9000000000000000000L;
        long sumLong = (firstLong + secondLong);
        System.out.println(sumLong);


    }
}