package com.mumu.jxls.demo.jxls_demo;

import com.haulmont.yarg.formatters.factory.DefaultFormatterFactory;
import com.haulmont.yarg.formatters.impl.doc.connector.OfficeIntegration;
import com.haulmont.yarg.loaders.factory.DefaultLoaderFactory;
import com.haulmont.yarg.reporting.ReportOutputDocument;
import com.haulmont.yarg.reporting.Reporting;
import com.haulmont.yarg.reporting.RunParams;
import com.haulmont.yarg.structure.Report;
import com.haulmont.yarg.structure.ReportOutputType;
import com.haulmont.yarg.structure.impl.ReportBuilder;
import com.haulmont.yarg.structure.impl.ReportTemplateBuilder;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 注释概要 <br>
 * 注释说明
 * <p>
 * Copyright: Copyright (c) 17-12-5 上午11:25
 * <p>
 * Company: DataSense
 * <p>
 *
 * @author Peter peter.wang@mulberrylearning.cn
 * @version 1.0
 */
public class YargTests {

    @Test
    public void testXls2Pdf() throws Exception {
        ReportBuilder reportBuilder = new ReportBuilder();
        ReportTemplateBuilder reportTemplateBuilder = new ReportTemplateBuilder()
                .documentPath(XlsToPdfConverter.excelFile)
                .documentName("invoice.xls")
                .outputType(ReportOutputType.pdf)
                .readFileFromPath();

        reportBuilder.template(reportTemplateBuilder.build());
        Report report = reportBuilder.build();

        Reporting reporting = new Reporting();
        DefaultFormatterFactory defaultFormatterFactory = new DefaultFormatterFactory();
        defaultFormatterFactory.setOfficeIntegration(new OfficeIntegration("localhost", 8100));
        reporting.setFormatterFactory(defaultFormatterFactory);
        reporting.setLoaderFactory(
                new DefaultLoaderFactory());

        ReportOutputDocument reportOutputDocument = reporting.runReport(
                new RunParams(report), new FileOutputStream(XlsToPdfConverter.pdfFile));
    }
}
