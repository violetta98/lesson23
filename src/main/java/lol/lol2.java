package lol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Hillel9 on 07.08.2017.
 */
public class lol2 {

//    private String s;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof lol2)) return false;
//
//        lol2 lol2 = (lol2) o;
//
//        return s != null ? s.equals(lol2.s) : lol2.s == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return s != null ? s.hashCode() : 0;
//    }

    private static final Logger LOG = LogManager.getLogger(lol2.class);

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(new lol2().getClass());
//        System.out.println(lol2.class);
//        System.out.println(new lol2().getClass().getClassLoader());
//        System.out.println(new lol2().getClass().getName());
        System.setErr(new PrintStream((new File("log.txt"))));
        System.err.println("Message 1");
        System.err.println("Message 2");
        try {
            throw new Exception("Message about error");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
