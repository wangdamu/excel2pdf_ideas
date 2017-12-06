package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zj;

class zvw
  extends zf
{
  zvw(Workbook paramWorkbook, int paramInt, OoxmlSaveOptions paramOoxmlSaveOptions)
    throws Exception
  {
    super(paramWorkbook, paramOoxmlSaveOptions);
    this.g = paramInt;
    if ((paramInt == 9) || (paramInt == 7) || (paramInt == 10)) {
      this.e = true;
    }
    this.a.setFileFormat(6);
  }
  
  static void a(zj paramzj, String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    paramzj.b(paramArrayOfByte, paramInt1, paramInt2);
    paramzj.b();
  }
  
  void c()
    throws Exception
  {
    if (this.a.a == null) {
      return;
    }
    if ((this.a.getRibbonXml() != null) && (this.a.getRibbonXml().length() > 0))
    {
      a("customUI/_rels/");
      a("customUI/images/");
    }
    a("xl/timelineCaches/");
    a("xl/timelines/");
    a("xl/ink/");
    a("xl/webextensions/");
    a("xl/attachedToolbars.bin", "xl/attachedToolbars.bin");
    a("xl/metadata.xml", "xl/metadata.xml");
    super.c();
  }
  
  void b()
    throws Exception
  {
    super.b();
    this.c.b(2);
    if (((this.h instanceof OoxmlSaveOptions)) && (((OoxmlSaveOptions)this.h).getEnableZip64())) {
      this.c.d(1);
    } else {
      this.c.d(0);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */