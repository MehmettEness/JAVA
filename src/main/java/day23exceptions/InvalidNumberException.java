package day23exceptions;

public class InvalidNumberException extends RuntimeException { // yani run butonuna bastıgında hatayi verecek altını cizmeyecekk..


    public InvalidNumberException(String message) { //sag tıkla generate sec , conctruction sec
        super(message);
    }
}
