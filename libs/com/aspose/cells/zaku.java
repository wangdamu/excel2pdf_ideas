package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;

class zaku
{
  private Workbook a;
  private zi b;
  private LoadOptions c;
  private zarf d;
  
  zaku(Workbook paramWorkbook, zm paramzm, LoadOptions paramLoadOptions)
  {
    this.a = paramWorkbook;
    this.b = zi.a(paramzm);
    this.c = paramLoadOptions;
    this.d = new zarf(paramWorkbook);
  }
  
  void a()
    throws Exception
  {
    zug.a(this.a);
    this.a.getWorksheets().clear();
    b();
  }
  
  private void b()
    throws Exception
  {
    zcjy localzcjy = zauy.a(this.b, "index.xml", true);
    if (localzcjy == null) {
      throw new CellsException(4, "the index.xml could not be found in the numbers file. ");
    }
    zakw localzakw = new zakw(this.d);
    localzakw.a(localzcjy);
    localzcjy = zauy.a(this.b, "index.xml", true);
    zakv localzakv = new zakv(this.d);
    localzakv.a(localzcjy);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */