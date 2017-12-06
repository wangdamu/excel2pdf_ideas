package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zakw
{
  private zarf a = null;
  private String b = null;
  private static final za c = new za(new String[] { "document", "workspace-array", "page-info", "layers", "layer", "drawables", "tabular-info", "tabular-model", "workspace" });
  
  zakw(zarf paramzarf)
  {
    this.a = paramzarf;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    if (paramzcjy.d()) {
      while (zauz.a(paramzcjy)) {
        switch (c.a(paramzcjy.q()))
        {
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
          a(paramzcjy);
          break;
        case 7: 
          c(paramzcjy);
          break;
        case 8: 
          b(paramzcjy);
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    this.b = paramzcjy.a("workspace-name");
    a(paramzcjy);
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    String str1 = paramzcjy.a("name");
    String str2 = paramzcjy.a("id");
    Worksheet localWorksheet = this.a.b.getWorksheets().add(this.b + " " + str1);
    this.a.a.put(str2, Integer.valueOf(localWorksheet.getIndex()));
    this.a.f.put("SFTGlobalID_" + str2 + " :: ", "'" + localWorksheet.getName() + "'!");
    paramzcjy.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */