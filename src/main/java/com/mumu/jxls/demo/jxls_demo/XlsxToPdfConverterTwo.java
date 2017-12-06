//package com.mumu.jxls.demo.jxls_demo;
//
//import java.io.FileWriter;
//import java.io.InputStream;
//import java.io.PrintWriter;
//
//public class XlsxToPdfConverterTwo {
//
//	public static void main(String[] args) throws Exception {
//
//		InputStream in = XlsxToPdfConverterTwo.class.getResourceAsStream(XlsToPdfConverter.excelFile);
//		PrintWriter out = new PrintWriter(new FileWriter(XlsToPdfConverter.htmlFile));
//
//		// this class is based on code found at
//		// https://svn.apache.org/repos/asf/poi/trunk/src/examples/src/org/apache/poi/ss/examples/html/ToHtml.java
//		// and will convert .xlsx files
//		ExcelToHtmlConverter toHtml = ExcelToHtmlConverter.create(in, out);
//		toHtml.setCompleteHTML(true);
//		toHtml.printPage();
//
//		// rather than writing to file get the HTML in memory and use
//		// FlyingSaucer or OpenHTMlToPdf
//
//		in.close();
//	}
//}
