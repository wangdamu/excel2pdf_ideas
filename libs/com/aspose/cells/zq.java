package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

abstract class zq
{
  static String a = "Invalid formula:";
  int b = 0;
  ArrayList c;
  WorksheetCollection d;
  int e;
  int f;
  int g;
  byte h;
  private static final za i = new za(new String[] { "INDEX", "IF", "CHOOSE" });
  
  zq(WorksheetCollection paramWorksheetCollection)
  {
    this.d = paramWorksheetCollection;
    this.b = 0;
    this.c = new ArrayList();
  }
  
  zacn a(zacf paramzacf, String paramString, int paramInt)
  {
    return null;
  }
  
  public int a()
  {
    return this.e;
  }
  
  public int b()
  {
    return this.f;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.h = ((byte)paramInt4);
    this.b = 0;
    this.c = new ArrayList();
  }
  
  boolean c()
  {
    return (this.h & 0xFF & 0x1) != 0;
  }
  
  boolean d()
  {
    return (this.h & 0xFF & 0x2) != 0;
  }
  
  boolean e()
  {
    return (this.h & 0xFF & 0x4) != 0;
  }
  
  boolean f()
  {
    return (this.h & 0xFF & 0x10) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.h = ((byte)(this.h | 0x10));
    } else {
      this.h = ((byte)(this.h & 0xEF));
    }
  }
  
  boolean g()
  {
    return (this.h & 0xFF & 0x20) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.h = ((byte)(this.h | 0x20));
    } else {
      this.h = ((byte)(this.h & 0xDF));
    }
  }
  
  int[] a(zacf paramzacf, int paramInt1, int paramInt2)
  {
    return null;
  }
  
  abstract boolean h();
  
  byte[] a(zacf paramzacf, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = a(paramzacf, paramInt1, paramInt2, false, false);
    if (g()) {
      j += 4;
    }
    int k = 4;
    int m = j;
    if (h())
    {
      m = j + (paramBoolean ? 8 + this.b : 0);
    }
    else
    {
      m = j + (paramBoolean ? 2 + this.b : 0);
      k = 2;
    }
    byte[] arrayOfByte1 = new byte[m];
    int n = 0;
    int i1 = j;
    if (paramBoolean)
    {
      System.arraycopy(zc.a(j), 0, arrayOfByte1, 0, k);
      n = k;
      i1 += k;
    }
    if (g())
    {
      arrayOfByte1[(n++)] = 25;
      arrayOfByte1[(n++)] = 1;
      n += 2;
      b(false);
    }
    n = a(paramzacf, arrayOfByte1, n);
    if ((paramBoolean) && (this.b != 0))
    {
      if (h())
      {
        System.arraycopy(zc.a(this.b), 0, arrayOfByte1, i1, 4);
        i1 += 4;
      }
      for (int i2 = 0; i2 < this.c.size(); i2++)
      {
        byte[] arrayOfByte2 = (byte[])this.c.get(i2);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i1, arrayOfByte2.length);
        i1 += arrayOfByte2.length;
      }
      this.c = null;
      this.b = 0;
    }
    return arrayOfByte1;
  }
  
  int a(zacf paramzacf, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 0;
    boolean bool1 = false;
    int m;
    zacf localzacf;
    if (paramzacf.d() == null)
    {
      int[] arrayOfInt = a(paramzacf, paramInt1, paramInt2);
      bool1 = paramzacf.e();
      if ((paramInt1 != 96) && (paramBoolean1)) {
        switch (paramzacf.d()[0])
        {
        case 65: 
        case 66: 
        case 67: 
        case 68: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 73: 
        case 90: 
        case 91: 
        case 92: 
        case 93: 
          paramzacf.d()[0] = ((byte)((paramzacf.d()[0] & 0xFF) + 32));
        }
      }
      if ((paramzacf.g() != 0) && (paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
        for (m = 0; m < paramzacf.c().size(); m++)
        {
          localzacf = (zacf)paramzacf.c().get(m);
          int n;
          if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
            n = 32;
          } else if (m >= arrayOfInt.length) {
            n = arrayOfInt[(arrayOfInt.length - 1)];
          } else {
            n = arrayOfInt[m];
          }
          boolean bool2 = paramBoolean1;
          if (!bool2) {
            switch (paramInt2)
            {
            case 0: 
              bool2 = n == 96;
              break;
            case 1: 
              bool2 = (n == 96) || (n == 32);
              break;
            case 2: 
              bool2 = (n == 96) || (n == 32);
            }
          } else if ((n == 64) && (paramzacf.g() == 3)) {
            switch (i.a(paramzacf.a()))
            {
            case 0: 
              bool2 = false;
              break;
            default: 
              n = 96;
            }
          }
          j += a(localzacf, n, paramInt2, bool2, bool1);
        }
      }
    }
    else
    {
      k = 64;
      if (paramBoolean1) {
        k = 96;
      }
      for (m = 0; m < paramzacf.c().size(); m++)
      {
        localzacf = (zacf)paramzacf.c().get(m);
        j += a(localzacf, k, paramInt2, paramBoolean1, false);
      }
    }
    int k = j + paramzacf.d().length;
    switch (paramzacf.g())
    {
    case 5: 
      k += 4;
      break;
    case 3: 
      switch (i.a(paramzacf.a()))
      {
      case 1: 
        k += paramzacf.c().size() * 4;
        break;
      case 2: 
        k += 4 + paramzacf.c().size() * 2 + (paramzacf.c().size() - 1) * 4;
      }
      break;
    case 2: 
      if ((bool1) && (!paramBoolean2))
      {
        k += 3;
        m = paramzacf.f();
        if (m != 9) {
          k += 4;
        }
        if (paramBoolean1) {
          paramzacf.b = (0x60 | m);
        } else {
          switch (paramInt1)
          {
          case 96: 
            paramzacf.b = (0x60 | m);
            break;
          case 32: 
            paramzacf.b = (0x20 | m);
            break;
          case 64: 
            paramzacf.b = (0x40 | m);
          }
        }
      }
      break;
    }
    return k;
  }
  
  int a(zacf paramzacf, byte[] paramArrayOfByte, int paramInt)
  {
    zacf localzacf1 = paramInt;
    int j;
    zacf localzacf2;
    switch (paramzacf.g())
    {
    case 5: 
      System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
      localzacf1 += paramzacf.d().length;
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
        for (j = 0; j < paramzacf.c().size(); j++)
        {
          localzacf2 = (zacf)paramzacf.c().get(j);
          localzacf1 = a(localzacf2, paramArrayOfByte, localzacf1);
        }
      }
      if (paramzacf.d()[0] == 99) {
        paramArrayOfByte[localzacf1] = 98;
      } else {
        paramArrayOfByte[localzacf1] = 66;
      }
      if (paramzacf.c() == null) {
        paramArrayOfByte[(localzacf1 + 1)] = 1;
      } else {
        paramArrayOfByte[(localzacf1 + 1)] = ((byte)(paramzacf.c().size() + 1));
      }
      paramArrayOfByte[(localzacf1 + 2)] = -1;
      localzacf1 += 4;
      break;
    case 0: 
      System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
      localzacf1 += paramzacf.d().length;
      break;
    case 3: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
        switch (i.a(paramzacf.a()))
        {
        case 1: 
          localzacf1 = c(paramzacf, paramArrayOfByte, paramInt);
          break;
        case 2: 
          localzacf1 = b(paramzacf, paramArrayOfByte, paramInt);
          break;
        default: 
          for (j = 0; j < paramzacf.c().size(); j++)
          {
            localzacf2 = (zacf)paramzacf.c().get(j);
            localzacf1 = a(localzacf2, paramArrayOfByte, localzacf1);
          }
        }
      }
      System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
      localzacf1 += paramzacf.d().length;
      break;
    case 2: 
      if (paramzacf.b >= 32)
      {
        j = localzacf1 + 1;
        paramArrayOfByte[localzacf1] = ((byte)paramzacf.b);
        localzacf1 += 3;
        if ((paramzacf.b & 0xF) != 9)
        {
          localzacf1 += 4;
          j += 4;
        }
        localzacf2 = localzacf1;
        if ((paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
          for (k = 0; k < paramzacf.c().size(); k++)
          {
            zacf localzacf3 = (zacf)paramzacf.c().get(k);
            localzacf1 = a(localzacf3, paramArrayOfByte, localzacf1);
          }
        }
        System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
        localzacf1 += paramzacf.d().length;
        int k = localzacf1 - localzacf2;
        System.arraycopy(zc.a(k), 0, paramArrayOfByte, j, 2);
      }
      else
      {
        if ((paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
          for (j = 0; j < paramzacf.c().size(); j++)
          {
            localzacf2 = (zacf)paramzacf.c().get(j);
            localzacf1 = a(localzacf2, paramArrayOfByte, localzacf1);
          }
        }
        System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
        localzacf1 += paramzacf.d().length;
      }
      break;
    case 1: 
    case 4: 
    default: 
      if ((paramzacf.c() != null) && (paramzacf.c().size() > 0)) {
        for (j = 0; j < paramzacf.c().size(); j++)
        {
          localzacf2 = (zacf)paramzacf.c().get(j);
          localzacf1 = a(localzacf2, paramArrayOfByte, localzacf1);
        }
      }
      System.arraycopy(paramzacf.d(), 0, paramArrayOfByte, localzacf1, paramzacf.d().length);
      localzacf1 += paramzacf.d().length;
    }
    return localzacf1;
  }
  
  int b(zacf paramzacf, byte[] paramArrayOfByte, int paramInt)
  {
    int j = paramzacf.c().size() - 1;
    int k = paramInt;
    int m = 0;
    int n = 0;
    int[] arrayOfInt = new int[j];
    for (int i1 = 0; i1 < paramzacf.c().size(); i1++)
    {
      if (i1 != 0) {
        System.arraycopy(zc.a(k - m), 0, paramArrayOfByte, m + (i1 - 1) * 2, 2);
      }
      zacf localzacf = (zacf)paramzacf.c().get(i1);
      k = a(localzacf, paramArrayOfByte, k);
      if (i1 == 0)
      {
        paramArrayOfByte[k] = 25;
        paramArrayOfByte[(k + 1)] = 4;
        System.arraycopy(zc.a(j), 0, paramArrayOfByte, k + 2, 2);
        int i3 = j * 2 + 2;
        m = k + 4;
        k += 4 + i3;
        n = k;
      }
      else
      {
        arrayOfInt[(i1 - 1)] = k;
        k += 4;
      }
    }
    System.arraycopy(zc.a(k - m), 0, paramArrayOfByte, m + j * 2, 2);
    for (i1 = 0; i1 < arrayOfInt.length; i1++)
    {
      int i2 = arrayOfInt[i1];
      paramArrayOfByte[i2] = 25;
      paramArrayOfByte[(i2 + 1)] = 8;
      System.arraycopy(zc.a(k - i2 - 1), 0, paramArrayOfByte, i2 + 2, 2);
    }
    return k;
  }
  
  int c(zacf paramzacf, byte[] paramArrayOfByte, int paramInt)
  {
    int j = paramInt;
    int k = 0;
    for (int m = 0; m < paramzacf.c().size(); m++)
    {
      zacf localzacf = (zacf)paramzacf.c().get(m);
      j = a(localzacf, paramArrayOfByte, j);
      switch (m)
      {
      case 0: 
        paramArrayOfByte[j] = 25;
        paramArrayOfByte[(j + 1)] = 2;
        j += 4;
        k = j;
        break;
      case 1: 
        paramArrayOfByte[j] = 25;
        paramArrayOfByte[(j + 1)] = 8;
        if (paramzacf.c().size() > 2)
        {
          j += 4;
          System.arraycopy(zc.a(j - k), 0, paramArrayOfByte, k - 2, 2);
          k = j;
        }
        else
        {
          paramArrayOfByte[(j + 2)] = 3;
          paramArrayOfByte[(j + 3)] = 0;
          j += 4;
          System.arraycopy(zc.a(j - k), 0, paramArrayOfByte, k - 2, 2);
        }
        break;
      case 2: 
        paramArrayOfByte[j] = 25;
        paramArrayOfByte[(j + 1)] = 8;
        paramArrayOfByte[(j + 2)] = 3;
        paramArrayOfByte[(j + 3)] = 0;
        j += 4;
        System.arraycopy(zc.a(j - k + 3), 0, paramArrayOfByte, k - 2, 2);
      }
    }
    return j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */