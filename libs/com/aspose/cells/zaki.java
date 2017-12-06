package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zaki
{
  private zqh a = null;
  private ArrayList b = null;
  private static final za c = new za(new String[] { "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml", "application/vnd.ms-excel.sheet.macroEnabled.main+xml", "application/vnd.ms-excel.template.macroEnabled.main+xml", "application/vnd.ms-excel.addin.macroEnabled.main+xml", "application/xml", "application/vnd.openxmlformats-package.relationships+xml", "application/vnd.ms-excel.sheet.binary.macroEnabled.main", "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml", "application/vnd.ms-excel.userNames", "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml", "application/vnd.ms-excel.revisionHeaders", "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml", "application/binary", "application/vnd.openxmlformats-officedocument.drawingml.diagramColors+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramData+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml", "application/vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml", "application/vnd.ms-office.drawingml.diagramDrawing+xml", "application/vnd.ms-excel.slicer", "application/vnd.ms-excel.slicerCache", "application/vnd.openxmlformats-package.digital-signature-origin", "application/vnd.ms-excel.attachedToolbars", "application/inkml+xml", "application/vnd.ms-excel.customDataProperties+xml", "application/vnd.ms-excel.timelineCache+xml", "application/vnd.ms-excel.timeline+xml", "application/vnd.openxmlformats-officedocument.model+data", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml", "application/vnd.ms-office.webextension+xml", "application/vnd.ms-office.webextensiontaskpanes+xml" });
  
  zaki(zqh paramzqh)
  {
    this.a = paramzqh;
    this.b = this.a.a.a.b;
  }
  
  boolean a(zcjy paramzcjy)
    throws Exception
  {
    b(paramzcjy);
    if (paramzcjy.o()) {
      return false;
    }
    paramzcjy.d();
    boolean bool1 = false;
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else
      {
        String str1;
        String str2;
        if ("Override".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.a("PartName");
          str2 = paramzcjy.a("ContentType");
          paramzcjy.a();
          boolean bool2 = a(str1, str2);
          if (bool2) {
            bool1 = true;
          }
        }
        else if ("Default".equals(paramzcjy.q()))
        {
          str1 = paramzcjy.a("Extension").toLowerCase();
          str2 = paramzcjy.a("ContentType");
          paramzcjy.a();
          switch (c.a(str2))
          {
          case 5: 
          case 6: 
            break;
          case 7: 
            this.a.a.a(16);
            this.a.p = false;
            bool1 = true;
            break;
          case 4: 
            this.a.a.a(10);
            bool1 = true;
            break;
          case 0: 
            this.a.a.a(6);
            bool1 = true;
            break;
          case 1: 
            this.a.a.a(8);
            bool1 = true;
            break;
          case 2: 
            this.a.a.a(7);
            bool1 = true;
            break;
          case 3: 
            this.a.a.a(9);
            bool1 = true;
            break;
          default: 
            a(true, null, str2, str1);
          }
        }
        else
        {
          paramzcjy.a();
        }
      }
    }
    return bool1;
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0)) {
      throw new CellsException(6, "Override element eror");
    }
    a(false, paramString1, paramString2, null);
    boolean bool = false;
    switch (c.a(paramString2))
    {
    case 7: 
      this.a.a.a(16);
      bool = true;
      break;
    case 4: 
      this.a.a.a(10);
      bool = true;
      break;
    case 0: 
      this.a.a.a(6);
      bool = true;
      break;
    case 1: 
      this.a.a.a(8);
      bool = true;
      break;
    case 2: 
      this.a.a.a(7);
      bool = true;
      break;
    case 3: 
      this.a.a.a(9);
      bool = true;
      break;
    case 8: 
      this.a.a.getSettings().h = true;
      break;
    case 9: 
    case 10: 
      this.a.n = paramString1;
      break;
    case 11: 
    case 12: 
      this.a.m = paramString1;
      break;
    case 13: 
      this.a.o = paramString1;
      break;
    }
    return bool;
  }
  
  private void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    if ((!paramString2.startsWith("image/")) && (!a(paramString2))) {
      return;
    }
    zpb localzpb = new zpb();
    localzpb.a = paramBoolean;
    localzpb.c = paramString1;
    localzpb.b = paramString3;
    localzpb.d = paramString2;
    zf.a(this.b, localzpb);
  }
  
  private boolean a(String paramString)
  {
    switch (c.a(paramString))
    {
    case 8: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
      return true;
    }
    return false;
  }
  
  private static void b(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"Types".equals(paramzcjy.q()))) {
      throw new CellsException(6, "ContentTypes root element error");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */