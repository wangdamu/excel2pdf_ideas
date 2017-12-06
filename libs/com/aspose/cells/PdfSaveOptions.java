package com.aspose.cells;

import com.aspose.cells.a.d.zff;

public class PdfSaveOptions
  extends SaveOptions
{
  PdfBookmarkEntry a;
  int b = 0;
  private ImageFormat j = ImageFormat.getEmf();
  private boolean k = false;
  private IStreamProvider l;
  zff c;
  ImageOrPrintOptions d;
  
  public PdfSaveOptions()
  {
    this.m_SaveFormat = 13;
    this.c = new zff();
    this.d = new ImageOrPrintOptions();
  }
  
  public PdfSaveOptions(int saveFormat)
  {
    this.m_SaveFormat = saveFormat;
    this.c = new zff();
    this.d = new ImageOrPrintOptions();
  }
  
  PdfSaveOptions(SaveOptions options)
  {
    this.m_SaveFormat = 13;
    this.c = new zff();
    this.d = new ImageOrPrintOptions();
    b(options);
  }
  
  public int getPrintingPageType()
  {
    return this.d.getPrintingPage();
  }
  
  public void setPrintingPageType(int value)
  {
    this.d.setPrintingPage(value);
  }
  
  public boolean getEmbedStandardWindowsFonts()
  {
    return this.c.e();
  }
  
  public void setEmbedStandardWindowsFonts(boolean value)
  {
    this.c.a(value);
  }
  
  public PdfBookmarkEntry getBookmark()
  {
    return this.a;
  }
  
  public void setBookmark(PdfBookmarkEntry value)
  {
    this.a = value;
  }
  
  public int getCompliance()
  {
    return this.b;
  }
  
  public void setCompliance(int value)
  {
    this.b = value;
  }
  
  public String getDefaultFont()
  {
    return this.d.getDefaultFont();
  }
  
  public void setDefaultFont(String value)
  {
    this.d.setDefaultFont(value);
  }
  
  public boolean getCheckWorkbookDefaultFont()
  {
    return this.d.getCheckWorkbookDefaultFont();
  }
  
  public void setCheckWorkbookDefaultFont(boolean value)
  {
    this.d.setCheckWorkbookDefaultFont(value);
  }
  
  public PdfSecurityOptions getSecurityOptions()
  {
    return this.c.p();
  }
  
  public void setSecurityOptions(PdfSecurityOptions value)
  {
    this.c.a(value);
  }
  
  public boolean getOnePagePerSheet()
  {
    return this.d.getOnePagePerSheet();
  }
  
  public void setOnePagePerSheet(boolean value)
  {
    this.d.setOnePagePerSheet(value);
  }
  
  public boolean getAllColumnsInOnePagePerSheet()
  {
    return this.d.getAllColumnsInOnePagePerSheet();
  }
  
  public void setAllColumnsInOnePagePerSheet(boolean value)
  {
    this.d.setAllColumnsInOnePagePerSheet(value);
  }
  
  public ImageFormat getImageType()
  {
    return this.j;
  }
  
  public void setImageType(ImageFormat value)
  {
    this.j = value;
  }
  
  public boolean getCalculateFormula()
  {
    return this.k;
  }
  
  public void setCalculateFormula(boolean value)
  {
    this.k = value;
  }
  
  public int getPdfCompression()
  {
    return this.c.b();
  }
  
  public void setPdfCompression(int value)
  {
    this.c.a(value);
  }
  
  public IStreamProvider getStreamProvider()
  {
    return this.l;
  }
  
  public void setStreamProvider(IStreamProvider value)
  {
    this.l = value;
  }
  
  public boolean getCheckFontCompatibility()
  {
    return this.d.d();
  }
  
  public void setCheckFontCompatibility(boolean value)
  {
    this.d.c(value);
  }
  
  public void setImageResample(int desiredPPI, int jpegQuality)
  {
    this.c.e(desiredPPI);
    this.c.c(jpegQuality);
  }
  
  public int getPageIndex()
  {
    return this.d.e();
  }
  
  public void setPageIndex(int value)
  {
    this.d.b(value);
  }
  
  public int getPageCount()
  {
    return this.d.f();
  }
  
  public void setPageCount(int value)
  {
    this.d.c(value);
  }
  
  public DateTime getCreatedTime()
  {
    return this.c.r();
  }
  
  public void setCreatedTime(DateTime value)
  {
    this.c.a(value);
    this.c.b(true);
  }
  
  public int getOptimizationType()
  {
    return this.c.a;
  }
  
  public void setOptimizationType(int value)
  {
    this.c.a = value;
    if (this.c.a == 1) {
      this.d.m = true;
    } else {
      this.d.m = false;
    }
  }
  
  public boolean isFontSubstitutionCharGranularity()
  {
    return this.d.c();
  }
  
  public void setFontSubstitutionCharGranularity(boolean value)
  {
    this.d.b(value);
  }
  
  public int getGridlineType()
  {
    return this.d.getGridlineType();
  }
  
  public void setGridlineType(int value)
  {
    this.d.setGridlineType(value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PdfSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */