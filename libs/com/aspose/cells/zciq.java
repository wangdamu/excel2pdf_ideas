package com.aspose.cells;

import com.aspose.cells.a.f.zj;

class zciq
  extends zf
{
  zciq(Workbook paramWorkbook, boolean paramBoolean, SaveOptions paramSaveOptions)
  {
    super(paramWorkbook, paramSaveOptions);
    this.e = paramBoolean;
    this.g = 16;
    this.i = ((this.a.getSettings().d != null) && (this.a.getSettings().d.getOnlyLoadDocumentProperties()));
  }
  
  void c()
    throws Exception
  {
    if (this.a.a == null) {
      return;
    }
    a("xl/slicerCaches/");
    a("xl/slicers/");
    a("xl/attachedToolbars.bin", "xl/attachedToolbars.bin");
  }
  
  void b()
    throws Exception
  {
    super.b();
    this.c.b(6);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zciq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */