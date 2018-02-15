package utilsviagit;

import net.sf.saxon.Transform;

/**
 *
 * @author quwano
 */
public class XMLTransformer {

    /**
     * Translate xml to other xml with xslt and Saxon9XX.jar.
     * @param inputfilepath Full path to target XML file.
     * @param XSLFile Path to stylesheet using transform.Relative from jar file.
     * @param fileParent Output directory of transformed file. Needs terminated separator.
     * @param tmpFileName Transformed file name with suffix.
     */
    public void XML2TXTTransform(String inputfilepath,String XSLFile ,String fileParent,String tmpFileName) {
        String aInputFilePath = inputfilepath;
        String aXSLFile = XSLFile;
        String aFileParent = fileParent;
        
        String[] transformParams = {"-s:" + aInputFilePath, "-xsl:" + aXSLFile, "-o:" + aFileParent + tmpFileName};
        Transform saxonTransform = new Transform();
        saxonTransform.doTransform(transformParams, "java net.sf.saxon.Transform");
    }
}
