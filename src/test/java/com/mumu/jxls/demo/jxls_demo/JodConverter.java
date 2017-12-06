package com.mumu.jxls.demo.jxls_demo;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

import java.io.File;

/**
 * 注释概要 <br>
 * 注释说明
 * <p>
 * Copyright: Copyright (c) 17-12-6 下午2:37
 * <p>
 * Company: DataSense
 * <p>
 *
 * @author Peter peter.wang@mulberrylearning.cn
 * @version 1.0
 */
public class JodConverter {
    public static void main(String[] args) {

        File inputFile = new File(XlsToPdfConverter.excelFile);
        File outputFile = new File(XlsToPdfConverter.pdfFile);
        int retVal = 0;

        OpenOfficeConnection con = new SocketOpenOfficeConnection(8100);
        try {
            con.connect();
            DocumentConverter converter = new OpenOfficeDocumentConverter(con);
            converter.convert(inputFile, outputFile);
        } catch (Exception e) {
            retVal = 1;
        }
        finally{
            if(con != null){
                con.disconnect();
                con = null;
            }
            System.out.println(retVal);
        }


    }
}
