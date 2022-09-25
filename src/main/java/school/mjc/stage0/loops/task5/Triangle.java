package school.mjc.stage0.loops.task5;


import java.io.ByteArrayOutputStream;

public class Triangle {

    public  void printTriangle(int cathetusLength) {

        for (int x = 1; x <= cathetusLength; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("8");
            }
            System.out.println("");
        }


    }


}


