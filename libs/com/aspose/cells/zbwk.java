package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Iterator;

class zbwk
  extends CollectionBase
{
  private static final za a = new za(new String[] { "cs", "ea", "latin", "sym" });
  
  public zbwj a(int paramInt)
  {
    return (zbwj)this.InnerList.get(paramInt);
  }
  
  zbwj b(int paramInt)
  {
    Iterator localIterator = this.InnerList.iterator();
    while (localIterator.hasNext())
    {
      zbwj localzbwj = (zbwj)localIterator.next();
      if (localzbwj.a() == paramInt) {
        return localzbwj;
      }
    }
    return null;
  }
  
  zbwj a(String paramString)
  {
    Object localObject = null;
    switch (a.a(paramString))
    {
    case 0: 
      localObject = new znf();
      break;
    case 1: 
      localObject = new ztc();
      break;
    case 2: 
      localObject = new zams();
      break;
    case 3: 
      localObject = new zbve();
      break;
    default: 
      localObject = null;
    }
    if (localObject != null) {
      zf.a(this.InnerList, localObject);
    }
    return (zbwj)localObject;
  }
  
  zbwj a(int paramInt, String paramString)
  {
    zbwj localzbwj = c(paramInt);
    localzbwj.a = paramString;
    return localzbwj;
  }
  
  zbwj c(int paramInt)
  {
    Object localObject = null;
    switch (paramInt)
    {
    case 2: 
      localObject = new znf();
      break;
    case 1: 
      localObject = new ztc();
      break;
    case 0: 
      localObject = new zams();
      break;
    case 3: 
      localObject = new zbve();
      break;
    default: 
      localObject = null;
    }
    if (localObject != null) {
      zf.a(this.InnerList, localObject);
    }
    return (zbwj)localObject;
  }
  
  void b(String paramString)
  {
    clear();
    a(0, paramString);
    a(1, paramString);
  }
  
  void a(zbwk paramzbwk)
  {
    Iterator localIterator = paramzbwk.iterator();
    while (localIterator.hasNext())
    {
      zbwj localzbwj1 = (zbwj)localIterator.next();
      zbwj localzbwj2 = c(localzbwj1.a());
      if (localzbwj2 != null) {
        localzbwj2.a(localzbwj1);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */