package com.aspose.cells;

import com.aspose.cells.b.a.c.za;
import java.util.Iterator;

class zvj
  extends ztp
{
  private zbcu b;
  
  zvj(zbcu paramzbcu)
  {
    this.b = paramzbcu;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("headers");
    paramzcjz.a("xmlns", zaty.a);
    paramzcjz.a("xmlns:r", zaty.e);
    paramzcjz.a("count", zauj.z(this.b.getCount()));
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      zbct localzbct = (zbct)localIterator.next();
      paramzcjz.b("userInfo");
      paramzcjz.a("guid", zauj.a(localzbct.b));
      paramzcjz.a("name", localzbct.d);
      paramzcjz.a("id", zauj.z(localzbct.c));
      paramzcjz.a("dateTime", localzbct.a.a("yyyy-MM-dd\\THH:mm:ss", za.b()));
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */