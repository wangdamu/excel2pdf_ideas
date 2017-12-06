package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import java.util.HashMap;
import java.util.Iterator;

class zbbr
  extends zp
{
  private zbbs b;
  
  zbbr(zbbs paramzbbs)
  {
    this.b = paramzbbs;
  }
  
  boolean a()
  {
    return true;
  }
  
  void a(zj paramzj)
    throws Exception
  {
    if (this.b.a() == 0) {
      return;
    }
    zcjz localzcjz = zauy.a(this.a, paramzj, true);
    localzcjz.b(true);
    localzcjz.b("Relationships");
    localzcjz.a(null, "xmlns", null, "http://schemas.openxmlformats.org/package/2006/relationships");
    Iterator localIterator = this.b.a.values().iterator();
    while (localIterator.hasNext())
    {
      zrl localzrl = (zrl)localIterator.next();
      a(localzcjz, localzrl);
    }
    localzcjz.b();
    localzcjz.d();
    localzcjz.e();
  }
  
  static void a(zcjz paramzcjz, zrl paramzrl)
    throws Exception
  {
    paramzcjz.b("Relationship");
    paramzcjz.a("Id", paramzrl.b);
    paramzcjz.a("Type", paramzrl.c);
    paramzcjz.a("Target", zauj.a(paramzrl.d));
    if ((paramzrl.e != null) && (paramzrl.e.length() != 0)) {
      paramzcjz.a("TargetMode", paramzrl.e);
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */