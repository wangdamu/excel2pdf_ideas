package com.github.caryyu.excel2pdf;

import com.itextpdf.text.DocumentException;
import com.mumu.jxls.demo.jxls_demo.XlsToPdfConverter;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel2PDFTest {
    @Test
    public void testOrigin() throws IOException, DocumentException {
        FileInputStream fis1 = new FileInputStream(new File(XlsToPdfConverter.excelFile));

        FileOutputStream fos = new FileOutputStream(new File(XlsToPdfConverter.pdfFile));

        List<ExcelObject> objects = new ArrayList<ExcelObject>();
        objects.add(new ExcelObject("1invoice.xls",fis1));

        Excel2Pdf pdf = new Excel2Pdf(objects , fos);

        pdf.convert();
    }
}
