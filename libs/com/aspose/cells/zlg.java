package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zlg
  extends CollectionBase
{
  public int a(zlf paramzlf)
  {
    zf.a(this.InnerList, paramzlf);
    return getCount() - 1;
  }
  
  public zlf a(int paramInt)
  {
    return (zlf)this.InnerList.get(paramInt);
  }
  
  int a(int paramInt1, int paramInt2)
  {
    zlf localzlf = new zlf(paramInt1, paramInt2);
    zf.a(this.InnerList, localzlf);
    return getCount() - 1;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (a(i).a == paramInt1)
      {
        a(i).b = paramInt2;
        return;
      }
    }
    zlf localzlf = new zlf(paramInt1, paramInt2);
    zf.a(this.InnerList, localzlf);
  }
  
  int c(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < getCount(); i++) {
      if (a(i).a == paramInt1) {
        return a(i).b;
      }
    }
    return paramInt2;
  }
  
  Color a(Color paramColor, boolean paramBoolean)
  {
    Color localColor = paramColor;
    if (!paramBoolean)
    {
      i = c(0, 0);
      return zlk.c(localColor, i / 100000.0D);
    }
    for (int i = 0; i < getCount(); i++)
    {
      zlf localzlf = a(i);
      switch (localzlf.a)
      {
      case 0: 
        localColor = zlk.a(localColor, localzlf.b / 100000.0D);
        break;
      case 1: 
        localColor = zlk.b(localColor, localzlf.b / 100000.0D);
        break;
      case 2: 
        localColor = zlk.d(localColor, localzlf.b / 100000.0D);
        break;
      case 3: 
        localColor = zlk.e(localColor, localzlf.b / 100000.0D);
        break;
      case 4: 
        localColor = zlk.f(localColor, localzlf.b / 100000.0D);
        break;
      case 5: 
        localColor = zlk.g(localColor, localzlf.b / 100000.0D);
        break;
      case 6: 
        localColor = zlk.h(localColor, localzlf.b / 100000.0D);
        break;
      case 7: 
        localColor = zlk.i(localColor, localzlf.b / 100000.0D);
        break;
      case 8: 
        localColor = zlk.j(localColor, localzlf.b / 100000.0D);
        break;
      case 9: 
        localColor = zlk.k(localColor, localzlf.b / 100000.0D);
        break;
      case 10: 
        localColor = zlk.l(localColor, localzlf.b / 100000.0D);
        break;
      case 11: 
        localColor = zlk.m(localColor, localzlf.b / 100000.0D);
        break;
      case 12: 
        localColor = zlk.n(localColor, localzlf.b / 100000.0D);
        break;
      case 13: 
        localColor = zlk.o(localColor, localzlf.b / 100000.0D);
        break;
      case 14: 
        localColor = zlk.p(localColor, localzlf.b / 60000.0D);
        break;
      case 15: 
        localColor = zlk.q(localColor, localzlf.b / 100000.0D);
        break;
      case 16: 
        localColor = zlk.r(localColor, localzlf.b / 60000.0D);
        break;
      case 17: 
        localColor = zlk.s(localColor, localzlf.b / 100000.0D);
        break;
      case 18: 
        localColor = zlk.t(localColor, localzlf.b / 100000.0D);
        break;
      case 19: 
        localColor = zlk.u(localColor, localzlf.b / 100000.0D);
        break;
      case 20: 
        localColor = zlk.v(localColor, localzlf.b / 100000.0D);
        break;
      case 21: 
        localColor = zlk.w(localColor, localzlf.b / 100000.0D);
        break;
      case 22: 
        localColor = zlk.x(localColor, localzlf.b / 100000.0D);
        break;
      case 25: 
        localColor = zlk.a(localColor);
        break;
      case 27: 
        localColor = zlk.b(localColor);
        break;
      case 23: 
        localColor = zlk.c(localColor);
        break;
      case 24: 
        localColor = zlk.d(localColor);
        break;
      case 26: 
        localColor = zlk.e(localColor);
      }
    }
    return localColor;
  }
  
  void a(zlg paramzlg)
  {
    for (int i = 0; i < paramzlg.getCount(); i++)
    {
      zlf localzlf1 = paramzlg.a(i);
      int j = 0;
      Iterator localIterator = iterator();
      while (localIterator.hasNext())
      {
        zlf localzlf2 = (zlf)localIterator.next();
        if (localzlf2.a == localzlf1.a)
        {
          localzlf2.b = localzlf1.b;
          j = 1;
          break;
        }
      }
      if (j == 0) {
        a(localzlf1.a, localzlf1.b);
      }
    }
  }
  
  void b(zlg paramzlg)
  {
    for (int i = 0; i < paramzlg.getCount(); i++)
    {
      zlf localzlf = paramzlg.a(i);
      a(localzlf.a, localzlf.b);
    }
  }
  
  boolean c(zlg paramzlg)
  {
    if (getCount() == paramzlg.getCount())
    {
      for (int i = 0; i < getCount(); i++)
      {
        zlf localzlf = a(i);
        if (localzlf.b != paramzlg.c(localzlf.a, 0)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  zlf b(int paramInt)
  {
    for (int i = 0; i < getCount(); i++) {
      if (a(i).a == paramInt) {
        return a(i);
      }
    }
    return null;
  }
  
  void c(int paramInt)
  {
    for (int i = 0; i < getCount(); i++) {
      if (a(i).a == paramInt)
      {
        this.InnerList.remove(i);
        return;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */