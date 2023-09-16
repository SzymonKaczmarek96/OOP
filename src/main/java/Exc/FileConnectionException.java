package Exc;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileConnectionException extends IOException {

    public FileConnectionException(String message) {
        super(message);
    }
}
