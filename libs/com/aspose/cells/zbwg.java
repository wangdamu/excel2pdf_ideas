package com.aspose.cells;

import java.util.ArrayList;

class zbwg
  extends ztv
{
  private String c;
  TextOptions a;
  ArrayList b;
  
  String o()
  {
    return this.c;
  }
  
  void a(String paramString)
  {
    this.c = paramString;
  }
  
  TextOptions p()
  {
    if (this.a == null) {
      this.a = new TextOptions(a().getWorksheets(), this);
    }
    return this.a;
  }
  
  zbwg(Workbook paramWorkbook, FontSetting paramFontSetting)
  {
    super(paramWorkbook, paramFontSetting, 22);
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    zbwg localzbwg = (zbwg)paramztv;
    this.c = localzbwg.c;
    if (localzbwg.b != null) {
      this.b = ((ArrayList)localzbwg.b.clone());
    }
    super.a(paramztv, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */