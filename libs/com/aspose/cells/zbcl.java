package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;

class zbcl
{
  private zcjd a;
  private zcje b;
  private zabv c;
  private boolean d;
  private HashMap e;
  
  zbcl(WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    this.d = paramBoolean;
    if (paramBoolean)
    {
      this.c = new zabv(paramWorksheetCollection);
      this.b = new zcje(paramWorksheetCollection);
    }
    else
    {
      this.a = new zcjd(paramWorksheetCollection);
    }
    this.e = new HashMap();
    int i = -1;
    Iterator localIterator = paramWorksheetCollection.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      i++;
      this.e.put(Integer.valueOf(localWorksheet.getTabId()), Integer.valueOf(i));
    }
  }
  
  void a(zbcc paramzbcc)
  {
    if (this.d)
    {
      zacf localzacf;
      if ((paramzbcc.c == null) && (paramzbcc.b() != null))
      {
        localzacf = this.c.a(paramzbcc.b(), 1);
        this.b.a(0, 0, 0, 0);
        paramzbcc.c = this.b.a(localzacf, 32, 2, true);
      }
      if ((paramzbcc.d == null) && (paramzbcc.c() != null))
      {
        localzacf = this.c.a(paramzbcc.c(), 1);
        this.b.a(0, 0, 0, 0);
        paramzbcc.d = this.b.a(localzacf, 32, 2, true);
      }
    }
    else
    {
      if ((paramzbcc.c != null) && (paramzbcc.c.length > 8) && (paramzbcc.b() == null)) {
        paramzbcc.a(this.a.a(-1, -1, paramzbcc.c, 0, 0, false, false));
      }
      if ((paramzbcc.d != null) && (paramzbcc.d.length > 8) && (paramzbcc.c() == null)) {
        paramzbcc.b(this.a.a(-1, -1, paramzbcc.d, 0, 0, false, false));
      }
    }
  }
  
  void a(int paramInt, zbby paramzbby)
  {
    if (paramzbby == null) {
      return;
    }
    if (this.d)
    {
      if ((paramzbby.h == null) && (paramzbby.g != null))
      {
        zacf localzacf = this.c.a(paramzbby.g, 1);
        Object localObject = this.e.get(Integer.valueOf(paramInt));
        int i = localObject == null ? 0 : ((Integer)localObject).intValue();
        this.b.a(i, paramzbby.b, paramzbby.c, 0);
        paramzbby.h = this.b.a(localzacf, 64, 0, true);
      }
    }
    else if ((paramzbby.h != null) && (paramzbby.g == null)) {
      paramzbby.g = this.a.a(-1, -1, paramzbby.h, paramzbby.b, paramzbby.c, false, false);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */