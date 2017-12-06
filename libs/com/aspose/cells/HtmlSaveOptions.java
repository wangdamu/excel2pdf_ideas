package com.aspose.cells;

public class HtmlSaveOptions
  extends SaveOptions
{
  private String a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  private boolean j = false;
  private boolean k = false;
  private boolean l = true;
  private boolean m = false;
  private boolean n = true;
  private boolean o = true;
  private int p = 0;
  private int q = 0;
  private int r = 0;
  private Encoding s;
  private IExportObjectListener t;
  private IFilePathProvider u;
  private IStreamProvider v;
  private ImageOrPrintOptions w = new ImageOrPrintOptions();
  private boolean x = true;
  private boolean y = false;
  private String z = "";
  private boolean A = false;
  private boolean B = false;
  private boolean C = true;
  private boolean D = true;
  private int E = 255;
  private int F = 1;
  
  public HtmlSaveOptions()
  {
    this.m_SaveFormat = 12;
    b();
  }
  
  public HtmlSaveOptions(int format)
  {
    this.m_SaveFormat = format;
    b();
  }
  
  HtmlSaveOptions(SaveOptions saveOptions)
  {
    super.b(saveOptions);
    this.m_SaveFormat = 12;
    b();
  }
  
  HtmlSaveOptions(SaveOptions saveOptions, boolean isMht)
  {
    super.b(saveOptions);
    if (isMht) {
      this.m_SaveFormat = 17;
    } else {
      this.m_SaveFormat = 12;
    }
    b();
  }
  
  public String getPageTitle()
  {
    return this.a;
  }
  
  public void setPageTitle(String value)
  {
    this.a = value;
  }
  
  public String getAttachedFilesDirectory()
  {
    return this.b;
  }
  
  public void setAttachedFilesDirectory(String value)
  {
    this.b = value;
  }
  
  public String getAttachedFilesUrlPrefix()
  {
    return this.c;
  }
  
  public void setAttachedFilesUrlPrefix(String value)
  {
    this.c = value;
  }
  
  public String getDefaultFontName()
  {
    return this.d;
  }
  
  public void setDefaultFontName(String value)
  {
    this.d = value;
  }
  
  public boolean isExportComments()
  {
    return this.j;
  }
  
  public void setExportComments(boolean value)
  {
    this.j = value;
  }
  
  public boolean getDisableDownlevelRevealedComments()
  {
    return this.k;
  }
  
  public void setDisableDownlevelRevealedComments(boolean value)
  {
    this.k = value;
  }
  
  public boolean isExpImageToTempDir()
  {
    return this.l;
  }
  
  public void setExpImageToTempDir(boolean value)
  {
    this.l = value;
  }
  
  public boolean getExportImagesAsBase64()
  {
    return this.m;
  }
  
  public void setExportImagesAsBase64(boolean value)
  {
    this.m = value;
  }
  
  public boolean getExportActiveWorksheetOnly()
  {
    return !this.n;
  }
  
  public void setExportActiveWorksheetOnly(boolean value)
  {
    this.n = (!value);
  }
  
  public boolean getParseHtmlTagInCell()
  {
    return this.o;
  }
  
  public void setParseHtmlTagInCell(boolean value)
  {
    this.o = value;
  }
  
  public int getHtmlCrossStringType()
  {
    return this.p;
  }
  
  public void setHtmlCrossStringType(int value)
  {
    this.p = value;
  }
  
  public int getHiddenColDisplayType()
  {
    return this.q;
  }
  
  public void setHiddenColDisplayType(int value)
  {
    this.q = value;
  }
  
  public int getHiddenRowDisplayType()
  {
    return this.r;
  }
  
  public void setHiddenRowDisplayType(int value)
  {
    this.r = value;
  }
  
  public Encoding getEncoding()
  {
    return this.s;
  }
  
  public void setEncoding(Encoding value)
  {
    this.s = value;
  }
  
  /**
   * @deprecated
   */
  public IExportObjectListener getExportObjectListener()
  {
    return this.t;
  }
  
  /**
   * @deprecated
   */
  public void setExportObjectListener(IExportObjectListener value)
  {
    this.t = value;
  }
  
  public IFilePathProvider getFilePathProvider()
  {
    return this.u;
  }
  
  public void setFilePathProvider(IFilePathProvider value)
  {
    this.u = value;
  }
  
  public IStreamProvider getStreamProvider()
  {
    return this.v;
  }
  
  public void setStreamProvider(IStreamProvider value)
  {
    this.v = value;
  }
  
  private void b()
  {
    this.w.setImageFormat(ImageFormat.getPng());
    this.w.setChartImageType(ImageFormat.getPng());
  }
  
  public ImageOrPrintOptions getImageOptions()
  {
    return this.w;
  }
  
  public boolean getExportHiddenWorksheet()
  {
    return this.x;
  }
  
  public void setExportHiddenWorksheet(boolean value)
  {
    this.x = value;
  }
  
  public boolean getPresentationPreference()
  {
    return this.y;
  }
  
  public void setPresentationPreference(boolean value)
  {
    this.y = value;
  }
  
  public String getCellCssPrefix()
  {
    return this.z;
  }
  
  public void setCellCssPrefix(String value)
  {
    this.z = value;
  }
  
  public boolean isFullPathLink()
  {
    return this.A;
  }
  
  public void setFullPathLink(boolean value)
  {
    this.A = value;
  }
  
  public boolean getExportGridLines()
  {
    return this.B;
  }
  
  public void setExportGridLines(boolean value)
  {
    this.B = value;
  }
  
  public boolean getExportBogusRowData()
  {
    return this.C;
  }
  
  public void setExportBogusRowData(boolean value)
  {
    this.C = value;
  }
  
  public boolean getExportFrameScriptsAndProperties()
  {
    return this.D;
  }
  
  public void setExportFrameScriptsAndProperties(boolean value)
  {
    this.D = value;
  }
  
  public int getExportDataOptions()
  {
    return this.E;
  }
  
  public void setExportDataOptions(int value)
  {
    this.E = value;
  }
  
  public int getLinkTargetType()
  {
    return this.F;
  }
  
  public void setLinkTargetType(int value)
  {
    this.F = value;
  }
  
  int a()
  {
    return 512;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HtmlSaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */