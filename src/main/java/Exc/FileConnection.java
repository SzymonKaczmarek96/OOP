package Exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileConnection {

    private File file;
    private String fileName;

    private boolean isConnected;

    private List<String> bookList;


    public FileConnection(String fileName) {
        this.file = null;
        this.fileName = fileName;
        this.isConnected = false;
        this.bookList = new ArrayList<>();
    }


    public boolean connect() throws FileConnectionException {
        Random random = new Random();
        int disconnectChance = random.nextInt(4);
        if (disconnectChance == 0) {
            throw new FileConnectionException("Cannot connect to the file");
        }
        file = new File(fileName);
       return isConnected = true;
    }

    public List<String> readFile() throws FileDbConnectionException {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            System.out.println("Books in file: ");
            while (sc.hasNextLine()) {
                String title = sc.nextLine();;
                bookList.add(title);
            }
            if(bookList.isEmpty()) {
                throw new FileDbConnectionException("File is empty");
            }
        }catch (IOException e) {
            throw new FileDbConnectionException("File not exist ");
        }finally {
            sc.close();
        }
        return bookList;
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected from file");
    }

    @Override
    public String toString() {
        return "FileConnection{" +
                "bookList=" + bookList +
                '}';
    }
}


