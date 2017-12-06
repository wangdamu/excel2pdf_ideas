package com.aspose.cells;

import java.util.ArrayList;

class zvh
{
  static void a(zcjz paramzcjz, ArrayList paramArrayList)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("Relationships");
    paramzcjz.a(null, "xmlns", null, "http://schemas.openxmlformats.org/package/2006/relationships");
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zrl localzrl = (zrl)paramArrayList.get(i);
      a(paramzcjz, localzrl);
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */