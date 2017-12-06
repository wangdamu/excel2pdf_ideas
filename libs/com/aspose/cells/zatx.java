package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zatx
  extends zbzn
{
  zatx(String paramString)
  {
    this.c = paramString;
  }
  
  void a(String[] paramArrayOfString) {}
  
  void a(zbzs paramzbzs)
    throws Exception
  {
    zaub localzaub = (zaub)paramzbzs;
    zh localzh = localzaub.a.a(this.c);
    localzh.a(DateTime.getNow());
    localzaub.a.a(localzh);
    paramzbzs.c = "";
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      zbzn localzbzn = (zbzn)localIterator.next();
      localzbzn.a(paramzbzs);
    }
    paramzbzs.a(paramzbzs.c);
  }
  
  void a(zi paramzi, String paramString)
    throws Exception
  {
    zcjm localzcjm = new zcjm();
    zh localzh = paramzi.a(paramString);
    if (localzh == null) {
      return;
    }
    zbzk localzbzk = new zbzk();
    zm localzm = paramzi.a(localzh);
    localzcjm.a(localzm);
    localzbzk.a = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>";
    a(localzbzk);
    a(localzcjm, localzbzk);
    localzm.a();
  }
  
  zbzn a(zbzn paramzbzn, ArrayList paramArrayList)
  {
    Iterator localIterator = paramzbzn.d.iterator();
    while (localIterator.hasNext())
    {
      zbzn localzbzn = (zbzn)localIterator.next();
      if (zw.b(localzbzn.c, (String)paramArrayList.get(paramArrayList.size() - 1)))
      {
        if (paramArrayList.size() >= 2)
        {
          paramArrayList.remove(paramArrayList.size() - 1);
          return a(paramzbzn, paramArrayList);
        }
        return localzbzn;
      }
    }
    return null;
  }
  
  void a(String paramString, zbzn paramzbzn)
  {
    String[] arrayOfString = zw.d(paramString, '/');
    ArrayList localArrayList = new ArrayList();
    za.a(arrayOfString);
    for (Object localObject2 : arrayOfString) {
      if (((String)localObject2).length() != 0) {
        zf.a(localArrayList, localObject2);
      }
    }
    ??? = (zbzk)this.d.get(0);
    zbzn localzbzn = a((zbzn)???, localArrayList);
    if (localzbzn != null) {
      localzbzn.a(paramzbzn);
    }
  }
  
  void a(zcjs paramzcjs, zbzn paramzbzn)
    throws Exception
  {
    Iterator localIterator1 = paramzcjs.l().iterator();
    while (localIterator1.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator1.next();
      switch (localzcjs.e)
      {
      case 6: 
      case 7: 
        zbzk localzbzk = (zbzk)paramzbzn;
        localzbzk.a = localzcjs.c();
        a(localzcjs, localzbzk);
        break;
      case 4: 
        break;
      case 1: 
        Object localObject = null;
        Iterator localIterator2;
        zcjg localzcjg;
        if (localzcjs.c().endsWith("/>"))
        {
          localObject = new zbzl(localzcjs.k());
          localIterator2 = localzcjs.e().iterator();
          while (localIterator2.hasNext())
          {
            localzcjg = (zcjg)localIterator2.next();
            zf.a(((zbzl)localObject).a, new zamo(localzcjg.k(), localzcjg.h));
          }
        }
        else
        {
          localObject = new zbzm(localzcjs.k(), localzcjs.d());
          localIterator2 = localzcjs.e().iterator();
          while (localIterator2.hasNext())
          {
            localzcjg = (zcjg)localIterator2.next();
            zf.a(((zbzm)localObject).b, new zamo(localzcjg.k(), localzcjg.h));
          }
        }
        paramzbzn.a((zbzn)localObject);
        a(localzcjs, (zbzn)localObject);
      }
    }
  }
  
  void b(String paramString, zbzn paramzbzn)
  {
    String[] arrayOfString = zw.d(paramString, '/');
    ArrayList localArrayList = new ArrayList();
    za.a(arrayOfString);
    Object localObject3;
    for (localObject3 : arrayOfString) {
      if (((String)localObject3).length() != 0) {
        zf.a(localArrayList, localObject3);
      }
    }
    ??? = (zbzk)this.d.get(0);
    zbzn localzbzn = a((zbzn)???, localArrayList);
    if (localzbzn != null)
    {
      Object localObject2;
      zamo localzamo;
      if ((paramzbzn instanceof zbzl))
      {
        localObject2 = (zbzl)paramzbzn;
        localObject3 = ((zbzl)localObject2).a.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localzamo = (zamo)((Iterator)localObject3).next();
          if ("Id".equals(localzamo.a)) {
            localzamo.b += localzbzn.d.size() + 1;
          }
        }
      }
      else if ((paramzbzn instanceof zbzm))
      {
        localObject2 = (zbzm)paramzbzn;
        localObject3 = ((zbzm)localObject2).b.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localzamo = (zamo)((Iterator)localObject3).next();
          if ("Id".equals(localzamo.a)) {
            localzamo.b += localzbzn.d.size() + 1;
          }
        }
      }
      localzbzn.a(paramzbzn);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */