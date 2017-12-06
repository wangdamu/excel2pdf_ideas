package com.aspose.cells;

class zaao
  extends zaae
{
  public int o = 0;
  public int p = 0;
  public int q = 32;
  public boolean r = true;
  public boolean s = false;
  public Workbook t;
  public WorksheetCollection u;
  public boolean v;
  public int w;
  public int x;
  
  public zaao(Workbook paramWorkbook)
  {
    this.t = paramWorkbook;
    this.u = paramWorkbook.getWorksheets();
    if (paramWorkbook.h())
    {
      this.v = false;
      this.w = 65535;
      this.x = 255;
    }
    else
    {
      this.v = true;
      this.w = 1048575;
      this.x = 16383;
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public WorksheetCollection b()
  {
    return this.u;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */