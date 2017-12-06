package com.aspose.cells;

class zbte
  extends ztv
{
  boolean a = false;
  private int b;
  
  zbte(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(paramWorkbook, paramFontSetting, paramInt);
  }
  
  boolean a(int paramInt)
  {
    return (this.b & paramInt) != 0;
  }
  
  void b(int paramInt)
  {
    this.b |= paramInt;
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zbte localzbte = (zbte)paramztv;
    this.b = localzbte.b;
    this.a = localzbte.a;
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */