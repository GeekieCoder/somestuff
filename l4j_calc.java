import java.util.*;
import java.io.*;
public class main {

public static void main(String[] args) throws IOException {

    Runtime run = Runtime.getRuntime();

    for (int i = 0; i < 5; i++)
    {
            run.exec("calc");
    }
  }
}