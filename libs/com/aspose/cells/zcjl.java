package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcjl
{
  private String b;
  private zcjn c = null;
  private boolean d = false;
  private boolean e = false;
  private int f = 0;
  private int g = 0;
  private HashMap h = new HashMap();
  private HashMap i = new HashMap();
  static String a = zs.a(com.aspose.cells.b.a.zh.b());
  
  zcjl(String paramString)
  {
    this.b = paramString;
  }
  
  boolean a()
    throws Exception
  {
    return b() != null;
  }
  
  zcjn b()
    throws Exception
  {
    if (!this.d)
    {
      this.d = true;
      byte[] arrayOfByte = zx.a(this.b);
      if (arrayOfByte == null) {
        return null;
      }
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh(arrayOfByte);
      zcjm localzcjm = zauz.a(localzh);
      localzh.a();
      this.c = localzcjm.d_();
    }
    return this.c;
  }
  
  String a(String paramString)
    throws Exception
  {
    c();
    StringBuilder localStringBuilder = new StringBuilder();
    zcjz localzcjz = new zcjz(localStringBuilder);
    localzcjz.c(true);
    localzcjz.b("Schema");
    localzcjz.a("ID", paramString);
    localzcjz.b("xsd:schema");
    localzcjz.a("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
    localzcjz.a("xmlns", "");
    if (a()) {
      a(b(), localzcjz, 0, "");
    }
    localzcjz.b();
    localzcjz.b();
    localzcjz.e();
    return zs.a(localStringBuilder);
  }
  
  HashMap c()
    throws Exception
  {
    if (!this.e)
    {
      this.e = true;
      a(b(), "", 0);
    }
    return this.h;
  }
  
  HashMap d()
    throws Exception
  {
    if (!this.e)
    {
      this.e = true;
      a(b(), "", 0);
    }
    return this.i;
  }
  
  private void a(zcjn paramzcjn, zcjz paramzcjz, int paramInt, String paramString)
    throws Exception
  {
    paramString = paramString + "/" + paramzcjn.g;
    paramzcjz.b("xsd:element");
    if (paramInt != 0)
    {
      paramzcjz.a("minOccurs", "0");
      j = 0;
      for (localzcjs = paramzcjn.n(); localzcjs != null; localzcjs = localzcjs.n()) {
        if ((localzcjs.e == 1) && (paramzcjn.g.equals(localzcjs.g)))
        {
          j = 1;
          break;
        }
      }
      if (j != 0) {
        paramzcjz.a("maxOccurs", "unbounded");
      }
    }
    paramzcjz.a("nillable", "true");
    int j = 0;
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n()) {
      if (localzcjs.e == 1)
      {
        j = 1;
        break;
      }
    }
    int k = 0;
    ArrayList localArrayList = (ArrayList)this.h.get(paramString);
    Object localObject1;
    Object localObject2;
    if (localArrayList != null)
    {
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zaoo)((Iterator)localObject1).next();
        if (!((zaoo)localObject2).g)
        {
          k = 1;
          break;
        }
      }
    }
    if ((j == 0) && (k == 0)) {
      paramzcjz.a("type", "xsd:string");
    }
    paramzcjz.a("name", paramzcjn.g);
    if (paramInt != 0) {
      paramzcjz.a("form", "unqualified");
    }
    if ((k != 0) || (j != 0))
    {
      paramzcjz.b("xsd:complexType");
      if (j != 0)
      {
        paramzcjz.b("xsd:sequence");
        paramzcjz.a("minOccurs", "0");
        localObject1 = new HashMap();
        for (localObject2 = paramzcjn.m(); localObject2 != null; localObject2 = ((zcjs)localObject2).n()) {
          if ((((zcjs)localObject2).e == 1) && (((HashMap)localObject1).get(((zcjs)localObject2).g) == null))
          {
            a((zcjn)localObject2, paramzcjz, paramInt + 1, paramString);
            ((HashMap)localObject1).put(((zcjs)localObject2).g, ((zcjs)localObject2).g);
          }
        }
        paramzcjz.b();
      }
      if (k != 0)
      {
        int m = (paramzcjn.l().a() == 1) && ((paramzcjn.m() instanceof zcjx)) ? 1 : 0;
        if (m != 0)
        {
          paramzcjz.b("xsd:simpleContent");
          paramzcjz.b("xsd:extension");
          paramzcjz.a("base", "xsd:string");
        }
        localObject2 = ((ArrayList)this.h.get(paramString)).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          zaoo localzaoo = (zaoo)((Iterator)localObject2).next();
          if (!localzaoo.g)
          {
            paramzcjz.b("xsd:attribute");
            paramzcjz.a("name", localzaoo.d);
            paramzcjz.a("form", "unqualified");
            paramzcjz.a("type", "xsd:string");
            paramzcjz.b();
          }
        }
        if (m != 0)
        {
          paramzcjz.b();
          paramzcjz.b();
        }
      }
      paramzcjz.b();
    }
    paramzcjz.b();
  }
  
  private void a(zcjn paramzcjn, String paramString, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    paramString = paramString + "/" + paramzcjn.g;
    zcjh localzcjh = paramzcjn.e();
    int j = paramzcjn.l().a();
    int k = 0;
    Object localObject;
    ArrayList localArrayList2;
    zaoo localzaoo4;
    if (j > 0)
    {
      k = 1;
      if (j == 1)
      {
        zcjs localzcjs1 = paramzcjn.m();
        if ((localzcjs1 instanceof zcjx))
        {
          localObject = ((zcjx)localzcjs1).h;
          if (!this.h.containsKey(paramString))
          {
            zaoo localzaoo1 = new zaoo();
            a(a, localObject, paramInt, paramString, localzaoo1, true);
            zf.a(localArrayList1, localzaoo1);
          }
          else
          {
            int n = 0;
            localArrayList2 = (ArrayList)this.h.get(paramString);
            for (int i2 = 0; i2 < localArrayList2.size(); i2++)
            {
              localzaoo4 = (zaoo)localArrayList2.get(i2);
              if (zw.b(localzaoo4.d, a))
              {
                zf.a(localzaoo4.e, localObject);
                n = 1;
                break;
              }
            }
            if ((n == 0) && (((String)localObject).length() > 0) && (((String)localObject).indexOf("\n") == -1))
            {
              zaoo localzaoo3 = new zaoo();
              a(a, localObject, paramInt, paramString, localzaoo3, true);
              zf.a(localArrayList2, localzaoo3);
            }
          }
        }
      }
    }
    if ((localzcjh.getCount() > 0) && (!a(localzcjh)))
    {
      k = 1;
      for (int m = 0; m < localzcjh.getCount(); m++)
      {
        localObject = localzcjh.a(m);
        if (!this.h.containsKey(paramString))
        {
          zaoo localzaoo2 = new zaoo();
          a(((zcjg)localObject).k(), ((zcjg)localObject).h, paramInt, paramString, localzaoo2, false);
          zf.a(localArrayList1, localzaoo2);
        }
        else
        {
          int i1 = 0;
          localArrayList2 = (ArrayList)this.h.get(paramString);
          for (int i3 = 0; i3 < localArrayList2.size(); i3++)
          {
            localzaoo4 = (zaoo)localArrayList2.get(i3);
            if (zw.b(localzaoo4.d, ((zcjg)localObject).k()))
            {
              zf.a(localzaoo4.e, ((zcjg)localObject).h);
              i1 = 1;
              break;
            }
          }
          if (i1 == 0)
          {
            String str = ((zcjg)localObject).h;
            if ((str.length() > 0) && (str.indexOf("\n") == -1))
            {
              localzaoo4 = new zaoo();
              a(((zcjg)localObject).k(), str, paramInt, paramString, localzaoo4, false);
              zf.a(localArrayList2, localzaoo4);
            }
          }
        }
      }
    }
    if (localArrayList1.size() > 0)
    {
      this.h.put(paramString, localArrayList1);
      this.i.put(paramString, Integer.valueOf(this.g));
      this.g += 1;
    }
    else if ((k == 0) && (!this.h.containsKey(paramString)))
    {
      this.h.put(paramString, localArrayList1);
      this.i.put(paramString, Integer.valueOf(this.g));
      this.g += 1;
    }
    if (j > 0) {
      for (zcjs localzcjs2 = paramzcjn.m(); localzcjs2 != null; localzcjs2 = localzcjs2.n()) {
        if ((localzcjs2 instanceof zcjn))
        {
          localObject = (zcjn)localzcjs2;
          a((zcjn)localObject, paramString, paramInt + 1);
        }
      }
    }
  }
  
  private void a(String paramString1, Object paramObject, int paramInt, String paramString2, zaoo paramzaoo, boolean paramBoolean)
  {
    paramzaoo.g = paramBoolean;
    paramzaoo.d = paramString1;
    zf.a(paramzaoo.e, paramObject);
    paramzaoo.f = paramInt;
    paramzaoo.b = paramString2;
    int j = paramString2.lastIndexOf('/');
    paramzaoo.c = paramString2.substring(0, 0 + j);
    if (paramInt > this.f) {
      this.f = paramInt;
    }
  }
  
  private static boolean a(zcjh paramzcjh)
  {
    if (paramzcjh.getCount() == 1)
    {
      zcjg localzcjg = paramzcjh.a(0);
      if (localzcjg.k().startsWith("xmlns")) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */