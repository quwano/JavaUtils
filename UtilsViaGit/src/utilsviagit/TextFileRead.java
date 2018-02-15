package utilsviagit;

/**
 *
 * @author quwano
 */
public interface TextFileRead {

    /**
     * Reading text file.
     * 
     * @param filePath Full path to text file.
     * @param encode Encoding of text file.
     * @return loaded strings.
     */
    String readFile(String filePath, String encode);
    
}
