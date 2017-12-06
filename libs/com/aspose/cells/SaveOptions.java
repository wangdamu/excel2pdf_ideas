package com.aspose.cells;

public class SaveOptions
{
  int e;
  protected int m_SaveFormat = 0;
  private boolean a = false;
  private String b = null;
  private boolean c = false;
  private boolean d = false;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  boolean f = true;
  String g = null;
  boolean h;
  private IWarningCallback m = null;
  LightCellsDataProvider i;
  
  public int getSaveFormat()
  {
    return this.m_SaveFormat;
  }
  
  void a(int paramInt)
  {
    this.m_SaveFormat = paramInt;
  }
  
  public boolean getClearData()
  {
    return this.a;
  }
  
  public void setClearData(boolean value)
  {
    this.a = value;
  }
  
  public String getCachedFileFolder()
  {
    return this.b;
  }
  
  public void setCachedFileFolder(String value)
  {
    if ((value == null) || ("".equals(value)))
    {
      this.b = null;
    }
    else
    {
      this.b = value;
      CellsHelper.a(value);
    }
  }
  
  public boolean getValidateMergedAreas()
  {
    return this.c;
  }
  
  public void setValidateMergedAreas(boolean value)
  {
    this.c = value;
  }
  
  public boolean getMergeAreas()
  {
    return this.d;
  }
  
  public void setMergeAreas(boolean value)
  {
    this.d = value;
  }
  
  public boolean getCreateDirectory()
  {
    return this.j;
  }
  
  public void setCreateDirectory(boolean value)
  {
    this.j = value;
  }
  
  public boolean getSortNames()
  {
    return this.k;
  }
  
  public void setSortNames(boolean value)
  {
    this.k = value;
  }
  
  public boolean getRefreshChartCache()
  {
    return this.l;
  }
  
  public void setRefreshChartCache(boolean value)
  {
    this.l = value;
  }
  
  public String getPdfExportImagesFolder()
  {
    return this.g;
  }
  
  public void setPdfExportImagesFolder(String value)
  {
    this.g = value;
  }
  
  public boolean getEnableHTTPCompression()
  {
    return this.h;
  }
  
  public void setEnableHTTPCompression(boolean value)
  {
    this.h = value;
  }
  
  void b(SaveOptions paramSaveOptions)
  {
    if (paramSaveOptions == null) {
      return;
    }
    this.h = paramSaveOptions.h;
    this.b = paramSaveOptions.b;
    this.a = paramSaveOptions.a;
    this.f = paramSaveOptions.f;
    this.j = paramSaveOptions.j;
    this.g = paramSaveOptions.g;
  }
  
  public IWarningCallback getWarningCallback()
  {
    return this.m;
  }
  
  public void setWarningCallback(IWarningCallback value)
  {
    this.m = value;
  }
  
  int a()
  {
    return 32768;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SaveOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */