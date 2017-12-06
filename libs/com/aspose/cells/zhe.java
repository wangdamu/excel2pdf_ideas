package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

abstract class zhe
  implements zaha
{
  protected int a;
  protected int b;
  protected int c;
  protected HashMap d;
  protected HashMap e;
  protected zgs f = new zgs();
  protected zaca g;
  protected boolean h = false;
  protected boolean i = false;
  
  zhe(int paramInt1, int paramInt2, int paramInt3, zaca paramzaca, HashMap paramHashMap)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.g = paramzaca;
    this.d = paramHashMap;
    if (!paramHashMap.containsKey("")) {
      paramHashMap.put("", Integer.valueOf(0));
    }
    this.e = new HashMap();
  }
  
  void a(zaca paramzaca)
  {
    this.g = paramzaca;
  }
  
  abstract boolean a(int paramInt, zaai paramzaai);
  
  protected abstract Object a();
  
  protected abstract Object a(Object paramObject);
  
  protected abstract void b(Object paramObject);
  
  protected abstract void a(Object paramObject, CellArea paramCellArea);
  
  protected abstract void a(long[] paramArrayOfLong);
  
  protected abstract void a(long[] paramArrayOfLong, boolean paramBoolean);
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    zgs localzgs = paramzt.c(paramInt, this.f);
    if (localzgs.c != 5) {
      return false;
    }
    if ((this.h) && (paramzt.i() == this.b) && (paramzt.a(paramInt) == this.c))
    {
      this.h = false;
      this.i = true;
      return false;
    }
    if (a(this.g.n, (zaai)localzgs.d))
    {
      this.i = true;
      return true;
    }
    return false;
  }
  
  boolean a(zacc paramzacc)
  {
    byte[] arrayOfByte = paramzacc.i();
    boolean bool = false;
    while (paramzacc.h()) {
      switch (arrayOfByte[paramzacc.e()])
      {
      case 35: 
      case 57: 
      case 67: 
      case 89: 
      case 99: 
      case 121: 
        zabf localzabf = paramzacc.a(this.g.p.d);
        if ((!localzabf.o()) && (!localzabf.p().a(this.g.p.e)))
        {
          zacc localzacc = this.g.j();
          localzacc.a(localzabf.p().e, 0, -1);
          if (a(localzacc)) {
            bool = true;
          }
        }
        break;
      case 36: 
      case 37: 
      case 44: 
      case 45: 
      case 58: 
      case 59: 
      case 68: 
      case 69: 
      case 76: 
      case 77: 
      case 90: 
      case 91: 
      case 100: 
      case 101: 
      case 108: 
      case 109: 
      case 122: 
      case 123: 
        if (a(paramzacc.a(this.g))) {
          bool = true;
        }
        break;
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 70: 
      case 71: 
      case 72: 
      case 73: 
      case 74: 
      case 75: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 82: 
      case 83: 
      case 84: 
      case 85: 
      case 86: 
      case 87: 
      case 88: 
      case 92: 
      case 93: 
      case 94: 
      case 95: 
      case 96: 
      case 97: 
      case 98: 
      case 102: 
      case 103: 
      case 104: 
      case 105: 
      case 106: 
      case 107: 
      case 110: 
      case 111: 
      case 112: 
      case 113: 
      case 114: 
      case 115: 
      case 116: 
      case 117: 
      case 118: 
      case 119: 
      case 120: 
      default: 
        if (!paramzacc.k()) {
          return bool;
        }
        break;
      }
    }
    return bool;
  }
  
  boolean a(zbap paramzbap)
  {
    zwp localzwp = paramzbap.a();
    int j = -1;
    if ((localzwp == null) || (localzwp == this.g.o))
    {
      j = this.g.n;
    }
    else
    {
      if ((localzwp.a & 0xFFFF) != this.g.p.f) {
        return false;
      }
      if (localzwp.b == localzwp.c) {
        j = localzwp.b & 0xFFFF;
      }
    }
    boolean bool1 = false;
    int k = this.g.n;
    Object localObject1;
    Object localObject2;
    boolean bool3;
    Object localObject3;
    if (j > -1)
    {
      if (paramzbap.m())
      {
        if ((j == this.a) && (paramzbap.b() == this.b) && (paramzbap.d() == this.c)) {
          return true;
        }
        bool1 = b(j, paramzbap.b(), paramzbap.d());
      }
      else
      {
        CellArea localCellArea = paramzbap.u();
        za localza = null;
        localObject1 = j + "!" + a(localCellArea);
        localObject2 = this.e.get(localObject1);
        if (localObject2 != null) {
          localza = (za)localObject2;
        } else {
          localza = a(j, localCellArea);
        }
        if (localza != null)
        {
          if (localza.c)
          {
            this.i = true;
            if (localza.e != null) {
              if (localza.a.a(localCellArea)) {
                b(localza.e);
              } else {
                a(localza.e, localCellArea);
              }
            }
            return true;
          }
          return false;
        }
        bool3 = this.h;
        localza = new za(j, localCellArea);
        this.e.put(localObject1, localza);
        localObject3 = a();
        if (j != this.g.n) {
          this.g.a(j);
        }
        if ((j == this.a) && (localCellArea.a(this.b, this.c)))
        {
          this.h = true;
          this.g.g.a(localCellArea, localCellArea.StartRow, localCellArea.StartColumn, this, false, false);
          bool1 = true;
        }
        else
        {
          this.h = false;
          boolean bool4 = this.i;
          this.i = false;
          this.g.g.a(localCellArea, localCellArea.StartRow, localCellArea.StartColumn, this, false, false);
          bool1 = this.i;
          if (bool4) {
            this.i = true;
          }
        }
        this.h = bool3;
        localza.d = false;
        if (bool1)
        {
          localza.c = true;
          localza.e = a(localObject3);
        }
      }
    }
    else
    {
      j = localzwp.b & 0xFFFF;
      int m = localzwp.c & 0xFFFF;
      if (paramzbap.m())
      {
        if ((paramzbap.b() == this.b) && (paramzbap.d() == this.c) && (this.a >= j) && (this.a <= m)) {
          while (j <= m)
          {
            if (j == this.a) {
              bool1 = true;
            } else if (b(j, paramzbap.b(), paramzbap.d())) {
              bool1 = true;
            }
            j++;
          }
        }
        while (j <= m)
        {
          if (b(j, paramzbap.b(), paramzbap.d())) {
            bool1 = true;
          }
          j++;
        }
      }
      boolean bool2 = this.i;
      this.i = false;
      this.h = false;
      localObject1 = paramzbap.u();
      localObject2 = a((CellArea)localObject1);
      bool3 = (((CellArea)localObject1).a(this.b, this.c)) && (this.a >= j) && (this.a <= m);
      while (j <= m)
      {
        localObject3 = null;
        String str = j + "!" + (String)localObject2;
        Object localObject4 = this.e.get(str);
        if (localObject4 != null) {
          localObject3 = (za)localObject4;
        } else {
          localObject3 = a(j, (CellArea)localObject1);
        }
        if (localObject3 != null)
        {
          if (((za)localObject3).c)
          {
            if (((za)localObject3).e != null) {
              if (((za)localObject3).a.a((CellArea)localObject1)) {
                b(((za)localObject3).e);
              } else {
                a(((za)localObject3).e, (CellArea)localObject1);
              }
            }
            bool1 = true;
          }
        }
        else
        {
          localObject3 = new za(j, (CellArea)localObject1);
          this.e.put(str, localObject3);
          Object localObject5 = a();
          boolean bool5 = this.i;
          this.i = false;
          if (j != this.g.n) {
            this.g.a(j);
          }
          if ((bool3) && (j == this.a))
          {
            this.h = true;
            this.g.g.a((CellArea)localObject1, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, this, false, false);
            this.h = false;
            this.i = true;
          }
          else
          {
            this.g.g.a((CellArea)localObject1, ((CellArea)localObject1).StartRow, ((CellArea)localObject1).StartColumn, this, false, false);
          }
          ((za)localObject3).d = false;
          if (this.i)
          {
            bool1 = true;
            ((za)localObject3).c = true;
            ((za)localObject3).e = a(localObject5);
          }
          else if (bool5)
          {
            this.i = true;
          }
        }
        j++;
      }
    }
    if (this.g.n != k) {
      this.g.a(k);
    }
    if (bool1) {
      this.i = true;
    }
    return bool1;
  }
  
  private boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.f.a = ((short)paramInt3);
    zgs localzgs = this.g.p.e.get(paramInt1).getCells().getRows().a.a(paramInt2, this.f, 4);
    if ((localzgs == null) || (localzgs.c != 5)) {
      return false;
    }
    return a(paramInt1, (zaai)localzgs.d);
  }
  
  protected boolean b(int paramInt, zaai paramzaai)
  {
    zacc localzacc = this.g.j();
    localzacc.a(paramzaai.b, 0, -1);
    if ((!localzacc.h()) || (paramzaai.b[localzacc.e()] == 2)) {
      return false;
    }
    long[] arrayOfLong = null;
    if (paramzaai.b[localzacc.e()] == 1)
    {
      localObject = localzacc.a(this.g);
      if (localzacc.h()) {
        return false;
      }
      zaai localzaai = paramzaai.a(this.g.p.e.get(paramInt).getCells(), ((zbap)localObject).b(), ((zbap)localObject).d());
      if (localzaai == null) {
        return false;
      }
      zbf localzbf = localzaai.a();
      if (localzbf == null) {
        return false;
      }
      if (localzaai.d())
      {
        CellArea localCellArea = localzbf.a();
        int[] arrayOfInt = new int[localCellArea.g() * localCellArea.f()];
        zhg localzhg = new zhg(arrayOfInt);
        this.g.p.e.get(paramInt).getCells().a(localCellArea, localCellArea.StartRow, localCellArea.StartColumn, localzhg, false, false);
        arrayOfLong = new long[arrayOfInt.length];
        for (int j = 0; j < arrayOfInt.length; j++) {
          arrayOfLong[j] = zaai.a(paramInt, arrayOfInt[j]);
        }
        a(arrayOfLong);
        paramzaai = localzaai;
      }
      localzacc.a(localzbf.c(), 0, -1);
    }
    Object localObject = this.g;
    this.g = new zaca(this.g);
    if (paramInt != this.g.n) {
      this.g.a(paramInt);
    }
    this.g.a(paramzaai);
    boolean bool = a(localzacc);
    if (arrayOfLong != null) {
      a(arrayOfLong, bool);
    }
    this.g = ((zaca)localObject);
    return bool;
  }
  
  protected boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int j = 0;
    Iterator localIterator = this.e.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      za localza = (za)localObject;
      if ((localza.b == paramInt1) && (localza.a.a(paramInt2, paramInt3)))
      {
        if ((j != 0) || (!localza.d)) {
          return true;
        }
        j = 1;
      }
    }
    return false;
  }
  
  private za a(int paramInt, CellArea paramCellArea)
  {
    Iterator localIterator = this.e.values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      za localza = (za)localObject;
      if (localza.b == paramInt)
      {
        int j = paramCellArea.c(localza.a);
        if (j == 1) {
          return localza;
        }
        if ((j == 3) && (!localza.d)) {
          return localza;
        }
      }
    }
    return null;
  }
  
  static String a(CellArea paramCellArea)
  {
    return CellsHelper.a(paramCellArea.StartRow, paramCellArea.StartColumn, paramCellArea.EndRow, paramCellArea.EndColumn);
  }
  
  private class za
  {
    CellArea a;
    int b;
    boolean c = false;
    boolean d = true;
    Object e;
    
    za(int paramInt, CellArea paramCellArea)
    {
      this.a = paramCellArea;
      this.b = paramInt;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this.b).append('!');
      CellsHelper.a(localStringBuilder, this.a.StartRow, this.a.StartColumn, this.a.EndRow, this.a.EndColumn);
      return zs.a(localStringBuilder);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */