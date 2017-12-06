package com.aspose.cells;

import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zwb
{
  private Workbook a = null;
  private XmlMap b = null;
  private String c = null;
  
  zwb(Workbook paramWorkbook, String paramString1, String paramString2)
  {
    this.a = paramWorkbook;
    this.b = paramWorkbook.getWorksheets().getXmlMaps().c(paramString1);
    this.c = paramString2;
  }
  
  void a()
    throws Exception
  {
    if (this.b == null) {
      return;
    }
    HashMap localHashMap = this.b.k();
    zaop localzaop = (zaop)localHashMap.get("/" + this.b.g());
    a(localzaop);
    ze localze = zd.a(this.c);
    try
    {
      zcjz localzcjz = zauy.a(localze, true);
      localzcjz.a(1);
      localzcjz.a('\t');
      localzcjz.b(true);
      a(localzcjz, localzaop);
      localzcjz.d();
      localzcjz.e();
    }
    finally
    {
      if (localze != null) {
        localze.a();
      }
    }
  }
  
  private void a(zaop paramzaop)
  {
    if (paramzaop.a())
    {
      localObject1 = paramzaop.f;
      if (((zcjq)localObject1).b())
      {
        paramzaop.g = 1;
        a(paramzaop.a, ((zcjq)localObject1).a());
      }
    }
    Object localObject1 = paramzaop.c.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zaoo)((Iterator)localObject1).next();
      if (((zaoo)localObject2).a())
      {
        zcjq localzcjq = ((zaoo)localObject2).i;
        if (localzcjq.b())
        {
          ((zaoo)localObject2).j = true;
          a(((zaoo)localObject2).a, localzcjq.a());
        }
      }
    }
    localObject1 = paramzaop.b.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zaop)((Iterator)localObject1).next();
      a((zaop)localObject2);
    }
  }
  
  private static void a(zaop paramzaop, int paramInt)
  {
    if ((paramzaop == null) || (paramzaop.b())) {
      return;
    }
    if (paramzaop.e)
    {
      paramzaop.g = paramInt;
      a(paramzaop.a, 1);
    }
    else
    {
      paramzaop.g = 1;
      a(paramzaop.a, paramInt);
    }
  }
  
  private void a(zcjz paramzcjz, zaop paramzaop)
    throws Exception
  {
    if (paramzaop.b()) {
      for (int i = 0; i < paramzaop.g; i++)
      {
        paramzcjz.b(paramzaop.d);
        if (paramzaop.a == null) {
          paramzcjz.a("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        }
        Object localObject1 = null;
        Iterator localIterator = paramzaop.c.iterator();
        Object localObject2;
        String str;
        while (localIterator.hasNext())
        {
          localObject2 = (zaoo)localIterator.next();
          if ((((zaoo)localObject2).j) && (((zaoo)localObject2).a()) && (((zaoo)localObject2).i.b()))
          {
            str = ((zaoo)localObject2).i.a(i);
            if (str != null) {
              if (((zaoo)localObject2).g) {
                localObject1 = str;
              } else {
                paramzcjz.a(((zaoo)localObject2).d, str);
              }
            }
          }
        }
        if (localObject1 != null) {
          paramzcjz.a((String)localObject1);
        }
        localIterator = paramzaop.b.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (zaop)localIterator.next();
          if ((((zaop)localObject2).b()) && (((zaop)localObject2).b.size() == 0) && (((zaop)localObject2).c.size() == 0) && (((zaop)localObject2).f.b()))
          {
            paramzcjz.b(((zaop)localObject2).d);
            str = ((zaop)localObject2).f.a(i);
            if (str != null) {
              paramzcjz.a(str);
            }
            paramzcjz.b();
          }
        }
        localIterator = paramzaop.b.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (zaop)localIterator.next();
          if ((((zaop)localObject2).b.size() > 0) || (((zaop)localObject2).c.size() > 0)) {
            a(paramzcjz, (zaop)localObject2);
          }
        }
        paramzcjz.b();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */