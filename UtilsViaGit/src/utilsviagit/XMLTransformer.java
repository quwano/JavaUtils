package utilsviagit;

import net.sf.saxon.Transform;

/**
 *
 * @author bc9199531
 */
public class XMLTransformer {

    /**
     * Saxonのライブラリを使用し、XMLをXSLTで変換する。出力ファイルの指定必要。
     * @param inputfilepath 変換対象のXMLファイルのフルパス
     * @param XSLFile 変換に用いるスタイルシートのパス（jarファイル相対）
     * @param fileParent 変換後のファイルの出力先ディレクトリ。ディレクトリ末端のセパレータは必要。
     * @param tmpFileName 変換後のファイル名。拡張子必要。
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
