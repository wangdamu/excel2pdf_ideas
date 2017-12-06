package com.aspose.cells;

import com.aspose.cells.b.a.c.za;
import java.util.ArrayList;

class zve
  extends ztp
{
  private zawp b;
  
  zve(zawp paramzawp)
  {
    this.b = paramzawp;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.b.e.a.p().i();
    paramzcjz.b(true);
    paramzcjz.b("pivotCacheRecords");
    paramzcjz.a("xmlns", zaty.a);
    paramzcjz.a("xmlns", "r", null, zaty.e);
    ArrayList localArrayList = this.b.h.a;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      paramzcjz.a("count", zauj.z(i));
      for (int j = 0; j < i; j++)
      {
        paramzcjz.b("r");
        for (Object localObject : (Object[])localArrayList.get(j))
        {
          if (localObject == null) {
            paramzcjz.b("m", null);
          }
          if ((localObject instanceof String))
          {
            paramzcjz.b("s");
            paramzcjz.a("v", (String)localObject);
            paramzcjz.b();
          }
          else
          {
            String str;
            if ((localObject instanceof Double))
            {
              str = zauj.b(((Double)localObject).doubleValue());
              paramzcjz.b("n");
              paramzcjz.a("v", str);
              paramzcjz.b();
            }
            else if ((localObject instanceof Integer))
            {
              str = zauj.z(((Integer)localObject).intValue());
              paramzcjz.b("x");
              paramzcjz.a("v", str);
              paramzcjz.b();
            }
            else if ((localObject instanceof Short))
            {
              str = zauj.a(((Short)localObject).shortValue());
              paramzcjz.b("n");
              paramzcjz.a("v", str);
              paramzcjz.b();
            }
            else if ((localObject instanceof DateTime))
            {
              str = ((DateTime)localObject).a("yyyy-MM-dd\\THH:mm:ss.fff", za.b());
              paramzcjz.b("d");
              paramzcjz.a("v", str);
              paramzcjz.b();
            }
            else if ((localObject instanceof Boolean))
            {
              str = ((Boolean)localObject).booleanValue() ? "1" : "0";
              paramzcjz.b("b");
              paramzcjz.a("v", str);
              paramzcjz.b();
            }
          }
        }
        paramzcjz.b();
      }
    }
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */