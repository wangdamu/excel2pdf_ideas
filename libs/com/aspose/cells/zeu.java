package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zeu
  extends CollectionBase
{
  private zse a;
  
  zeu(zse paramzse)
  {
    this.a = paramzse;
  }
  
  void a(zeu paramzeu)
  {
    Iterator localIterator = paramzeu.iterator();
    while (localIterator.hasNext())
    {
      zcf localzcf1 = (zcf)localIterator.next();
      zcf localzcf2 = new zcf();
      localzcf2.a(localzcf1);
      zf.a(this.InnerList, localzcf2);
    }
  }
  
  long a()
  {
    long l = 0L;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zcf localzcf = (zcf)localIterator.next();
      l = (l & 0xFFFFFFFF) + (8L + (localzcf.c() & 0xFFFFFFFF));
    }
    return l;
  }
  
  public zcf a(int paramInt)
  {
    return (zcf)this.InnerList.get(paramInt);
  }
  
  int a(zcf paramzcf, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramzcf.i();
      return paramInt;
    }
    for (int i = 0; i < getCount(); i++)
    {
      zcf localzcf2 = a(i);
      int j = 1;
      for (int k = 0; k < 16; k++) {
        if (paramzcf.g().c[k] != localzcf2.g().c[k])
        {
          j = 0;
          break;
        }
      }
      if (j != 0)
      {
        localzcf2.i();
        return i + 1;
      }
    }
    zcf localzcf1 = new zcf();
    localzcf1.a(paramzcf);
    localzcf1.i();
    zf.a(this.InnerList, localzcf1);
    return getCount();
  }
  
  void a(zcf paramzcf)
  {
    zf.a(this.InnerList, paramzcf);
  }
  
  int b(zcf paramzcf)
  {
    byte[] arrayOfByte = paramzcf.h();
    for (int i = 0; i < getCount(); i++)
    {
      zcf localzcf = a(i);
      int j = 1;
      for (int k = 0; k < 16; k++) {
        if (arrayOfByte[k] != localzcf.g().c[k])
        {
          j = 0;
          break;
        }
      }
      if (j != 0)
      {
        localzcf.i();
        return i;
      }
    }
    zf.a(this.InnerList, paramzcf);
    return getCount() - 1;
  }
  
  int a(byte[] paramArrayOfByte)
    throws Exception
  {
    try
    {
      zcf localzcf = new zcf(paramArrayOfByte, zbxp.a());
      return b(localzcf);
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "Unknown image format", localException);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zeu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */