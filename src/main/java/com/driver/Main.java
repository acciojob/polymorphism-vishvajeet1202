package com.driver;

public class Main {
    public static void main(String args[]){
        Product p=new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1,2);
    }
    public static class Product{
        public static int product(int x, int y) {

            return x*y;
        }
        public static int product(int x, int y, int z) {

            return x*y*z;
        }
        public static double product(double x, double y) {

            return x*y;
        }
    }

}

