import java.nio.file.FileAlreadyExistsException;

public class CheckExceptionsExample {
    public static void main(String[] args) throws FileAlreadyExistsException,InterruptedException {
        System.out.println("Program has started");
        System.out.println("Program is in progress");

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        Thread.sleep(5000);



        System.out.println("Program is completed");
        System.out.println("Program has exited");


    }
}
