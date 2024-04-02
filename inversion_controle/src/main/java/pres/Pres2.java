package pres;

import dao.IDao;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("C:\\Users\\Lenovo\\Desktop\\TP1_JEE\\inversion_controle\\config.txt"));
        String daoCLassName=sc.nextLine();
        Class cDao=Class.forName(daoCLassName);
        IDao dao=(IDao) cDao.newInstance();
        System.out.println(dao.getData());
    }
}
