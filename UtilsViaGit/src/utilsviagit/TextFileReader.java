package utilsviagit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author quwano
 */
public class TextFileReader implements TextFileRead {

    /**
     * Reading text file.
     * 
     * @param filePath Full path to text file.
     * @param encode Encoding of text file.
     * @return loaded strings.
     */
    @Override
    public String readFile(String filePath, String encode) {
        String fileStr = new String();
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, encode);
            StringBuilder stringBuilder = new StringBuilder();

            int i;
            i = inputStreamReader.read();
            if (i != -1) {
                //if (i != 0xFEFF){stringBuilder.append((char)i);}
                while ((i = inputStreamReader.read()) != -1) {
                    stringBuilder.append((char) i);
                }
            }
            fileStr = stringBuilder.toString();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return fileStr;
    }
}
