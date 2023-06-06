/**
 * LambdaHashmap.java 04/06/2023
 * Nama         : Derva Anargya Ghaly
 * NIM          : 24060121140149
 * Deskripsi    : program yang menggunakan Generic untuk pasangan Key-Value
 */

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args){
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(24060121140149L, "Derva Anargya Ghaly");
        map.put(24060121130001L, "Lionel Messi");
        map.put(24060121120020L, "Erling Haaland");

        //Implementasi Ekspresi Lambda
        map.forEach((i, j) -> {
            System.out.print(i + " " + map.get(i));
            System.out.println(" ");}
        );
    }
}