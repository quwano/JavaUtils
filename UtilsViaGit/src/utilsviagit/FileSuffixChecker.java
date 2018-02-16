package utilsviagit;

/**
 *
 * @author quwano
 */
public class FileSuffixChecker {
    /**
     * Check suffix of file is the same as specified.
     * 
     * @param inputfilepath Full path to file to be checked.
     * @param inputfilesuffix specidied suffix with dot.
     * @return Result of check as boolean.
     */
    public boolean SuffixChecker(String inputfilepath, String inputfilesuffix) {
        String aInputfilepath = inputfilepath;
        String aInputfilesuffix = inputfilesuffix;

        String checksuffix = aInputfilepath.substring(aInputfilepath.lastIndexOf("."));
        return checksuffix.equals(aInputfilesuffix);
    }
}
