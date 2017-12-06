package com.aspose.cells;

import java.util.ArrayList;

class zcgw
  extends zcfo
{
  private zawp c;
  
  zcgw(zawp paramzawp)
  {
    this.c = paramzawp;
  }
  
  void d()
    throws Exception
  {
    this.c.e.a.p().i();
    ArrayList localArrayList = this.c.h.a;
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    zche localzche1 = new zche(193, localArrayList.size());
    localzche1.a(this.b);
    for (int i = 0; i < localArrayList.size(); i++)
    {
      zche localzche3 = new zche(34);
      localzche3.a(this.b);
      Object[] arrayOfObject = (Object[])localArrayList.get(i);
      for (int j = 0; j < arrayOfObject.length; j++) {
        zcdt.a().a(arrayOfObject[j]).a(this.b);
      }
    }
    zche localzche2 = new zche(194);
    localzche2.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */