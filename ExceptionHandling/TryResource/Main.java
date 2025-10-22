package TryResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int num=10;

        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){    //Try with resources,used to close the resources automatically
            System.out.println("Enter a Name");
            String s=br.readLine();
            System.out.println(s);
        }
    }
}
