package com.mumu.jxls.demo.jxls_demo;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JxlsDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testExcel2Pdf() throws Exception {
		String excelFile = "/media/peter/Data/work/财务系统/template/invoice.xls";
		Workbook workbook = new Workbook(excelFile);
		String pdfFile = "/media/peter/Data/work/财务系统/template/invoice.pdf";
		workbook.save(pdfFile, FileFormatType.PDF);
	}
}
