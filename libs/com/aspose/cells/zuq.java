package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import java.util.ArrayList;

class zuq
  extends zp
{
  private zpt b;
  
  zuq(zpt paramzpt)
  {
    this.b = paramzpt;
  }
  
  boolean a()
  {
    return true;
  }
  
  void a(zj paramzj)
    throws Exception
  {
    zcjz localzcjz = zauy.a("[Content_Types].xml", paramzj, true);
    a(localzcjz);
    localzcjz.e();
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("Types");
    paramzcjz.a("xmlns", null, "http://schemas.openxmlformats.org/package/2006/content-types");
    ArrayList localArrayList = this.b.o;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zpb localzpb = (zpb)localArrayList.get(i);
      if (localzpb.a) {
        a(paramzcjz, localzpb.b, localzpb.d);
      } else {
        b(paramzcjz, localzpb.c, localzpb.d);
      }
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.b("Default");
    paramzcjz.a("Extension", null, paramString1);
    paramzcjz.a("ContentType", null, paramString2);
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz, String paramString1, String paramString2)
    throws Exception
  {
    paramzcjz.b("Override");
    paramzcjz.a("PartName", paramString1);
    paramzcjz.a("ContentType", paramString2);
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */