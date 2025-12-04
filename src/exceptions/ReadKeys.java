package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeys {
    private final BufferedReader buf;
    public ReadKeys() {
        buf = new BufferedReader(
                new InputStreamReader(System.in));
    }

    public String readText(String str) throws IOException {
        System.out.print(str);
        return buf.readLine();
    }
    public int readInt(String str) throws IOException{
        System.out.print(str);

        return Integer.parseInt(buf.readLine());
    }
}
