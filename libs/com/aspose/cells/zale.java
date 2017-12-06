package com.aspose.cells;

import com.aspose.cells.b.a.zh;

class zale
{
  private zbcj a;
  private static final com.aspose.cells.b.c.a.za b = new com.aspose.cells.b.c.a.za(new String[] { "dateTime", "guid", "id", "name" });
  
  zale(zbcj paramzbcj)
  {
    this.a = paramzbcj;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      if ("userInfo".equals(paramzcjy.q()))
      {
        zbct localzbct = new zbct();
        this.a.n.a(localzbct);
        if (paramzcjy.n())
        {
          while (paramzcjy.m()) {
            switch (b.a(paramzcjy.q()))
            {
            case 0: 
              localzbct.a = DateTime.a(paramzcjy.t(), "yyyy-MM-dd\\THH:mm:ss", com.aspose.cells.b.a.c.za.b());
              break;
            case 1: 
              localzbct.b = zauj.aX(paramzcjy.t()).a();
              break;
            case 2: 
              localzbct.c = zauj.F(paramzcjy.t());
              break;
            case 3: 
              localzbct.d = paramzcjy.t();
            }
          }
          paramzcjy.l();
        }
      }
      paramzcjy.a();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */