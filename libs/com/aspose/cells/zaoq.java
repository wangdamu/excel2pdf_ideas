package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaoq
{
  private zcjn a;
  private XmlMap b;
  
  zaoq(zcjn paramzcjn, XmlMap paramXmlMap)
  {
    this.a = paramzcjn;
    this.b = paramXmlMap;
  }
  
  HashMap a()
  {
    HashMap localHashMap = new HashMap();
    a(this.a, "", localHashMap);
    if (this.b != null) {
      a(localHashMap);
    }
    return localHashMap;
  }
  
  private void a(HashMap paramHashMap)
  {
    Iterator localIterator1 = this.b.a().iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      Iterator localIterator2 = localWorksheet.l().iterator();
      Object localObject1;
      Object localObject2;
      while (localIterator2.hasNext())
      {
        localObject1 = (zbpn)localIterator2.next();
        if (((zbpn)localObject1).d() != null)
        {
          XmlColumnProperty localXmlColumnProperty1 = ((zbpn)localObject1).d().c();
          if ((localXmlColumnProperty1 != null) && (localXmlColumnProperty1.a() == this.b.d()))
          {
            int j = 0;
            int k = 0;
            localObject2 = new int[] { j };
            int[] arrayOfInt = { k };
            CellsHelper.a(((zbpn)localObject1).b(), (int[])localObject2, arrayOfInt);
            j = localObject2[0];
            k = arrayOfInt[0];
            zcjq localzcjq = new zcjq(localWorksheet, j, k, j, k);
            a(paramHashMap, localXmlColumnProperty1.b(), localzcjq);
          }
        }
      }
      localIterator2 = localWorksheet.getListObjects().iterator();
      while (localIterator2.hasNext())
      {
        localObject1 = (ListObject)localIterator2.next();
        for (int i = 0; i < ((ListObject)localObject1).getListColumns().getCount(); i++)
        {
          ListColumn localListColumn = ((ListObject)localObject1).getListColumns().get(i);
          XmlColumnProperty localXmlColumnProperty2 = localListColumn.a();
          if ((localXmlColumnProperty2 != null) && (localXmlColumnProperty2.a() == this.b.d()))
          {
            localObject2 = new zcjq(localWorksheet, ((ListObject)localObject1).getStartRow(), ((ListObject)localObject1).getStartColumn() + i, ((ListObject)localObject1).getEndRow(), ((ListObject)localObject1).getStartColumn() + i);
            a(paramHashMap, localXmlColumnProperty2.b(), (zcjq)localObject2);
          }
        }
      }
    }
  }
  
  private void a(HashMap paramHashMap, String paramString, zcjq paramzcjq)
  {
    int i = paramString.lastIndexOf("/@");
    Object localObject1;
    Object localObject2;
    if (i < 0)
    {
      localObject1 = (zaop)paramHashMap.get(paramString);
      if ((((zaop)localObject1).c.size() == 0) && (((zaop)localObject1).b.size() == 0)) {
        ((zaop)localObject1).f = paramzcjq;
      }
      localObject2 = ((zaop)localObject1).c();
      if (localObject2 != null) {
        ((zaoo)localObject2).i = paramzcjq;
      }
    }
    else
    {
      localObject1 = paramString.substring(0, 0 + i);
      localObject2 = paramString.substring(i + 2);
      zaop localzaop = (zaop)paramHashMap.get(localObject1);
      zaoo localzaoo = localzaop.a((String)localObject2);
      localzaoo.i = paramzcjq;
    }
  }
  
  private void a(zcjn paramzcjn, String paramString, HashMap paramHashMap)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ("attribute".equals(paramzcjn.g))
    {
      localObject1 = new zaoo();
      localObject2 = paramzcjn.a("name");
      ((zaoo)localObject1).d = ((String)localObject2);
      ((zaoo)localObject1).h = paramzcjn.a("type");
      localObject3 = (zaop)paramHashMap.get(paramString);
      ((zaoo)localObject1).a = ((zaop)localObject3);
      zf.a(((zaop)localObject3).c, localObject1);
    }
    else
    {
      if ("simpleContent".equals(paramzcjn.g))
      {
        localObject1 = new zaoo();
        ((zaoo)localObject1).g = true;
        ((zaoo)localObject1).d = zcjl.a;
        ((zaoo)localObject1).h = "xsd:string";
        localObject2 = (zaop)paramHashMap.get(paramString);
        ((zaoo)localObject1).a = ((zaop)localObject2);
        zf.a(((zaop)localObject2).c, localObject1);
      }
      else if ("element".equals(paramzcjn.g))
      {
        localObject1 = paramzcjn.a("name");
        localObject2 = new zaop();
        ((zaop)localObject2).d = ((String)localObject1);
        localObject3 = paramzcjn.a("maxOccurs");
        if ((localObject3 != null) && (((String)localObject3).equals("unbounded"))) {
          ((zaop)localObject2).e = true;
        }
        if (paramHashMap.size() > 0)
        {
          zaop localzaop = (zaop)paramHashMap.get(paramString);
          ((zaop)localObject2).a = localzaop;
          zf.a(localzaop.b, localObject2);
        }
        paramString = paramString + "/" + (String)localObject1;
        paramHashMap.put(paramString, localObject2);
      }
      for (localObject1 = paramzcjn.m(); localObject1 != null; localObject1 = ((zcjs)localObject1).n()) {
        if (((zcjs)localObject1).e == 1) {
          a((zcjn)localObject1, paramString, paramHashMap);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaoq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */