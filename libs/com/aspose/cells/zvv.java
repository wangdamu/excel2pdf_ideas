package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.d.zm;

class zvv
{
  static void a(Workbook paramWorkbook, zm paramzm, int paramInt, SaveOptions paramSaveOptions)
    throws Exception
  {
    if (paramSaveOptions == null) {
      paramSaveOptions = new OoxmlSaveOptions();
    } else if (!(paramSaveOptions instanceof OoxmlSaveOptions)) {
      paramSaveOptions = new OoxmlSaveOptions(paramSaveOptions);
    }
    zvw localzvw = new zvw(paramWorkbook, paramInt, (OoxmlSaveOptions)paramSaveOptions);
    try
    {
      localzvw.a(paramzm);
    }
    finally
    {
      if (localzvw != null) {
        localzvw.a();
      }
    }
  }
  
  static void a(Shape paramShape, zm paramzm, SaveOptions paramSaveOptions)
    throws Exception
  {
    if (paramSaveOptions == null) {
      paramSaveOptions = new XlsSaveOptions(5);
    }
    zj localzj = new zj(paramzm);
    localzj.b(2);
    localzj.d(0);
    zpt localzpt = new zpt(paramShape, paramSaveOptions);
    zvw.a(localzj, localzpt.i);
    localzj.b();
    localzj.f_();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */