package com.aspose.cells;

import java.util.ArrayList;

class zpm
{
  boolean a = false;
  int b = 7;
  int c = 1;
  Font d = null;
  String e = null;
  ArrayList f = null;
  Workbook g = null;
  String h = null;
  zqk i = null;
  
  static zpm a(ChartTextFrame paramChartTextFrame, Workbook paramWorkbook)
  {
    zpm localzpm = new zpm();
    localzpm.b = paramChartTextFrame.getTextHorizontalAlignment();
    localzpm.c = paramChartTextFrame.getTextDirection();
    localzpm.d = paramChartTextFrame.j();
    localzpm.e = paramChartTextFrame.F();
    if ((paramChartTextFrame.E() != null) && (paramChartTextFrame.F() != null))
    {
      zbdf.a(paramChartTextFrame.E(), paramChartTextFrame.F().length(), paramChartTextFrame.getFont(), true);
      localzpm.f = paramChartTextFrame.E();
    }
    localzpm.g = paramWorkbook;
    return localzpm;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */