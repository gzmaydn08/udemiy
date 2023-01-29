package com.mustafamurat.matematik;

public class Matematik implements Imatematik{
    @Override
    public void toplama(int a, int b) {
        System.out.println("toplama sonucu :"+ (a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("çıkarma sonucu :"+(a-b));

    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("çarpma sonucu :"+ (a*b));

    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("bölme sonucu :"+ ((double)a/b));

    }
}
