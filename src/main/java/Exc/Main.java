package Exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        try{
            String error = null;

            System.out.println(error.length());



        }catch (NullPointerException e){

            System.out.println("The exception was handled");

        }



        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number: ");

            int number = sc.nextInt();

            System.out.println(number);

            sc.close();
        }catch (InputMismatchException e) {

            System.out.println("Given letters, cannot be a converted to int type");

        }




        String fileName = "C:\\Users\\szymo\\IdeaProjects\\JavaOOPBacis\\src\\main\\java\\Exc\\books.txt";


        FileConnection fileConnection = new FileConnection(fileName);

        try {
            fileConnection.connect();
            List<String> books = fileConnection.readFile() ;
            System.out.println(books);
        } catch (FileConnectionException e) {
            throw new RuntimeException(e);
        }catch (FileDbConnectionException e) {
            throw new RuntimeException(e);}
        finally {
            fileConnection.disconnect();
        }







    }


}
