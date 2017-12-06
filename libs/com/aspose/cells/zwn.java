package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zwn
{
  byte[] a = new byte[80];
  
  void a(zwn paramzwn)
  {
    this.a = new byte[paramzwn.a.length];
    System.arraycopy(paramzwn.a, 0, this.a, 0, this.a.length);
  }
  
  zwn(int paramInt)
  {
    this.a[0] = 6;
    System.arraycopy(zc.a(paramInt), 0, this.a, 4, 4);
  }
  
  int a()
  {
    return zc.a(this.a, 4);
  }
  
  int b()
  {
    return zc.e(this.a, 8);
  }
  
  void a(int paramInt)
  {
    System.arraycopy(zc.a(paramInt), 0, this.a, 8, 2);
  }
  
  private void g()
  {
    if ((this.a[8] & 0xFF) == 255)
    {
      this.a[8] = 0;
      byte[] tmp31_26 = this.a;
      tmp31_26[9] = ((byte)(tmp31_26[9] + 1));
    }
    else
    {
      byte[] tmp46_41 = this.a;
      tmp46_41[8] = ((byte)(tmp46_41[8] + 1));
    }
  }
  
  int c()
  {
    return zc.a(this.a, 0) + 4;
  }
  
  boolean d()
  {
    return c() > 10;
  }
  
  int e()
  {
    if (!d()) {
      return 0;
    }
    int i = 10;
    if ((this.a[i] & 0xFF & 0x8) != 0) {
      return zc.b(this.a, i + 1);
    }
    return 0;
  }
  
  Object a(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j = 1;
    if ((this.a[paramInt2] & 0xFF & 0x8) != 0) {
      j += 2;
    }
    Object localObject = null;
    switch (this.a[paramInt2] & 0xFF & 0x7)
    {
    case 0: 
      break;
    case 4: 
      localObject = Boolean.valueOf((this.a[paramInt2] & 0xFF & 0xF0) != 0);
      break;
    case 3: 
      localObject = a((byte)((this.a[paramInt2] & 0xFF & 0xF0) >> 4));
      break;
    case 1: 
      localObject = Double.valueOf(zc.f(this.a, paramInt2 + j));
      break;
    case 2: 
      localObject = zct.a(this.a, paramInt2 + j);
    }
    return localObject;
  }
  
  zwj b(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j = 1;
    if ((this.a[paramInt2] & 0xFF & 0x8) != 0) {
      j += 2;
    }
    Object localObject = null;
    switch (this.a[paramInt2] & 0xFF & 0x7)
    {
    case 0: 
      break;
    case 4: 
      localObject = Boolean.valueOf((this.a[paramInt2] & 0xFF & 0xF0) != 0);
      break;
    case 3: 
      localObject = a((byte)((this.a[paramInt2] & 0xFF & 0xF0) >> 4));
      break;
    case 1: 
      localObject = Double.valueOf(zc.f(this.a, paramInt2 + j));
      break;
    case 2: 
      int k = zc.e(this.a, paramInt2 + j) & 0xFFFF;
      if (k == 0)
      {
        localObject = "";
      }
      else if (this.a[(paramInt2 + j + 2)] == 0)
      {
        byte[] arrayOfByte = new byte[k * 2];
        paramInt2 = paramInt2 + j + 3;
        for (int m = 0; m < k; m++) {
          arrayOfByte[(m * 2)] = this.a[(paramInt2 + m)];
        }
        localObject = Encoding.getUnicode().a(arrayOfByte, 0, k * 2);
      }
      else
      {
        localObject = Encoding.getUnicode().a(this.a, paramInt2 + j + 3, k * 2);
      }
      break;
    }
    return new zwj(paramInt1, localObject);
  }
  
  int a(zgs paramzgs, int paramInt, short paramShort, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramInt < 0)
    {
      paramInt = 10;
      paramShort = -1;
    }
    else
    {
      paramShort = (short)(paramShort - 1);
    }
    int i = c();
    short s = -1;
    int j = -1;
    int k = paramInt;
    while (paramInt < i)
    {
      k++;
      if ((this.a[paramInt] & 0xFF & 0x8) != 0)
      {
        paramShort = zc.b(this.a, paramInt + 1);
        if ((paramBoolean2) && (paramShort > paramzgs.a))
        {
          paramzgs.a = s;
          return j;
        }
        k += 2;
      }
      else
      {
        paramShort = (short)(paramShort + 1);
      }
      if (paramShort > paramzgs.a)
      {
        if (paramBoolean2)
        {
          paramzgs.a = s;
          return j;
        }
        paramzgs.a = paramShort;
        return paramInt;
      }
      switch (this.a[paramInt] & 0xFF & 0x7)
      {
      case 1: 
        if (paramShort == paramzgs.a) {
          return paramInt;
        }
        if (paramBoolean2)
        {
          j = paramInt;
          s = paramShort;
        }
        k += 8;
        break;
      case 2: 
        if (paramShort == paramzgs.a) {
          return paramInt;
        }
        if (paramBoolean2)
        {
          j = paramInt;
          s = paramShort;
        }
        int m = zc.e(this.a, k) & 0xFFFF;
        if (m == 0)
        {
          k += 3;
        }
        else
        {
          k += 2;
          if (this.a[k] == 0)
          {
            k++;
            k += m;
          }
          else
          {
            k++;
            k += (m << 1);
          }
        }
        break;
      case 3: 
      case 4: 
        if (paramShort == paramzgs.a) {
          return paramInt;
        }
        if (paramBoolean2)
        {
          j = paramInt;
          s = paramShort;
        }
        break;
      default: 
        if (!paramBoolean1)
        {
          if (paramShort == paramzgs.a) {
            return paramInt;
          }
          if (paramBoolean2)
          {
            s = paramShort;
            j = paramInt;
          }
        }
        break;
      }
      paramInt = k;
    }
    if (paramBoolean2)
    {
      paramzgs.a = s;
      return j;
    }
    paramShort = (short)(paramShort + 1);
    paramzgs.a = paramShort;
    return -1;
  }
  
  int a(int paramInt, zgs paramzgs)
  {
    if ((this.a[paramInt] & 0xFF & 0x8) != 0)
    {
      paramzgs.a = zc.b(this.a, paramInt + 1);
      return a(paramInt, paramInt + 3, paramzgs);
    }
    zgs tmp41_40 = paramzgs;
    tmp41_40.a = ((short)(tmp41_40.a + 1));
    return a(paramInt, paramInt + 1, paramzgs);
  }
  
  private int a(int paramInt1, int paramInt2, zgs paramzgs)
  {
    switch (this.a[paramInt1] & 0xFF & 0x7)
    {
    case 4: 
      paramzgs.c = 2;
      paramzgs.d = Boolean.valueOf((this.a[paramInt1] & 0xFF & 0xF0) != 0);
      return paramInt2;
    case 3: 
      paramzgs.c = 3;
      paramzgs.d = zi.a(ztr.b(a((byte)((this.a[paramInt1] & 0xFF & 0xF0) >> 4))));
      return paramInt2;
    case 1: 
      paramzgs.c = 1;
      paramzgs.d = Double.valueOf(zc.f(this.a, paramInt2));
      return paramInt2 + 8;
    case 2: 
      paramzgs.c = 4;
      int i = zc.e(this.a, paramInt2) & 0xFFFF;
      paramInt2 += 2;
      if (i == 0)
      {
        paramInt2++;
        paramzgs.d = "";
      }
      else if (this.a[paramInt2] == 0)
      {
        byte[] arrayOfByte = new byte[i << 1];
        paramInt2++;
        for (int j = 0; j < i; j++) {
          arrayOfByte[(j * 2)] = this.a[(paramInt2 + j)];
        }
        paramzgs.d = Encoding.getUnicode().a(arrayOfByte, 0, i * 2);
        paramInt2 += i;
      }
      else
      {
        paramInt2++;
        paramzgs.d = Encoding.getUnicode().a(this.a, paramInt2, i << 1);
        paramInt2 += (i << 1);
      }
      break;
    default: 
      paramzgs.c = 0;
      paramzgs.d = null;
    }
    return paramInt2;
  }
  
  public zwk c(int paramInt1, int paramInt2)
  {
    return new zwk(this, paramInt1, paramInt2);
  }
  
  boolean a(int paramInt, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
  {
    int i = 10;
    int j = c();
    int k = 0;
    int m = -1;
    int n = -1;
    paramArrayOfInt[0] = j;
    paramArrayOfBoolean[0] = false;
    while (i < j)
    {
      int[] arrayOfInt = { m };
      k = a(i, arrayOfInt);
      m = arrayOfInt[0];
      if (m == paramInt)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfBoolean[0] = ((this.a[i] & 0xFF & 0x8) == 0 ? 1 : false);
        return true;
      }
      if (m > paramInt)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfBoolean[0] = (m - n == 1 ? 1 : false);
        return false;
      }
      n = m;
      i += k;
    }
    paramArrayOfBoolean[0] = (paramInt - n == 1 ? 1 : false);
    return false;
  }
  
  ArrayList f()
  {
    int i = 10;
    int j = c();
    int k = 0;
    int m = -1;
    ArrayList localArrayList = new ArrayList();
    while (i < j)
    {
      int[] arrayOfInt = { m };
      k = a(i, arrayOfInt);
      m = arrayOfInt[0];
      zf.a(localArrayList, b(m, i));
      i += k;
    }
    return localArrayList;
  }
  
  Object[] d(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[paramInt2 - paramInt1 + 1];
    int i = 10;
    int j = c();
    int k = 0;
    int m = -1;
    while (i < j)
    {
      int[] arrayOfInt = { m };
      k = a(i, arrayOfInt);
      m = arrayOfInt[0];
      if (m > paramInt2) {
        break;
      }
      if (m >= paramInt1) {
        arrayOfObject[(m - paramInt1)] = a(m, i);
      }
      i += k;
    }
    return arrayOfObject;
  }
  
  private Object a(Object paramObject, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = 0;
    if (paramObject == null) {
      return Integer.valueOf(paramArrayOfInt[0]);
    }
    if ((paramObject instanceof zuf))
    {
      paramArrayOfInt[0] = 3;
      return paramObject;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 3: 
      paramArrayOfInt[0] = 4;
      break;
    case 14: 
      paramArrayOfInt[0] = 1;
      break;
    case 9: 
      paramArrayOfInt[0] = 1;
      paramObject = Double.valueOf(((Integer)paramObject).intValue());
      break;
    case 16: 
      paramArrayOfInt[0] = 1;
      paramObject = Double.valueOf(CellsHelper.getDoubleFromDateTime((DateTime)paramObject, false));
      break;
    case 18: 
      paramArrayOfInt[0] = 2;
      int i = 0;
      boolean[] arrayOfBoolean = { i };
      zuf localzuf = ztr.a((String)paramObject, arrayOfBoolean);
      i = arrayOfBoolean[0];
      if (i != 0)
      {
        paramObject = localzuf;
        paramArrayOfInt[0] = 3;
      }
      break;
    }
    return paramObject;
  }
  
  void a(int paramInt, Object paramObject)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] arrayOfInt1 = { i };
    boolean[] arrayOfBoolean = { j };
    boolean bool = a(paramInt, arrayOfInt1, arrayOfBoolean);
    i = arrayOfInt1[0];
    j = arrayOfBoolean[0];
    if (bool) {
      k = b(i);
    } else {
      a(paramInt);
    }
    int m = 0;
    int[] arrayOfInt2 = { m };
    paramObject = a(paramObject, arrayOfInt2);
    m = arrayOfInt2[0];
    int n = a(j, m, paramObject);
    a(i, k, n);
    this.a[i] = ((byte)m);
    int i1 = 1;
    if (j == 0)
    {
      int tmp138_137 = i;
      byte[] tmp138_134 = this.a;
      tmp138_134[tmp138_137] = ((byte)(tmp138_134[tmp138_137] | 0x8));
      System.arraycopy(zc.a(paramInt), 0, this.a, i + i1, 2);
      i1 += 2;
    }
    switch (m)
    {
    case 0: 
      break;
    case 4: 
      if (((Boolean)paramObject).booleanValue())
      {
        int tmp218_217 = i;
        byte[] tmp218_214 = this.a;
        tmp218_214[tmp218_217] = ((byte)(tmp218_214[tmp218_217] | 0x10));
      }
      else
      {
        int tmp233_232 = i;
        byte[] tmp233_229 = this.a;
        tmp233_229[tmp233_232] = ((byte)(tmp233_229[tmp233_232] & 0xF));
      }
      break;
    case 3: 
      int tmp248_247 = i;
      byte[] tmp248_244 = this.a;
      tmp248_244[tmp248_247] = ((byte)(tmp248_244[tmp248_247] & 0xF));
      int tmp260_259 = i;
      byte[] tmp260_256 = this.a;
      tmp260_256[tmp260_259] = ((byte)(tmp260_256[tmp260_259] | (byte)((a((zuf)paramObject) & 0xFF) << 4)));
      break;
    case 1: 
      System.arraycopy(zc.a(((Double)paramObject).doubleValue()), 0, this.a, i + i1, 8);
      break;
    case 2: 
      String str = (String)paramObject;
      System.arraycopy(zc.a(str.length()), 0, this.a, i + i1, 2);
      i1 += 2;
      byte[] arrayOfByte = zct.c(str);
      if (arrayOfByte != null)
      {
        if (arrayOfByte.length != str.length()) {
          this.a[(i + i1)] = 1;
        }
        System.arraycopy(arrayOfByte, 0, this.a, i + i1 + 1, arrayOfByte.length);
      }
      break;
    }
  }
  
  int a(int paramInt, int[] paramArrayOfInt)
  {
    int i = 1;
    if ((this.a[paramInt] & 0xFF & 0x8) != 0)
    {
      paramArrayOfInt[0] = zc.b(this.a, paramInt + i);
      i += 2;
    }
    else
    {
      paramArrayOfInt[0] += 1;
    }
    switch (this.a[paramInt] & 0xFF & 0x7)
    {
    case 0: 
    case 3: 
    case 4: 
      break;
    case 1: 
      i += 8;
      break;
    case 2: 
      int j = zc.e(this.a, paramInt + i) & 0xFFFF;
      if (this.a[(paramInt + i + 2)] == 1) {
        j *= 2;
      }
      i += 3 + j;
    }
    return i;
  }
  
  int b(int paramInt)
  {
    int i = 1;
    if ((this.a[paramInt] & 0xFF & 0x8) != 0) {
      i += 2;
    }
    switch (this.a[paramInt] & 0xFF & 0x7)
    {
    case 0: 
    case 3: 
    case 4: 
      break;
    case 1: 
      i += 8;
      break;
    case 2: 
      int j = zc.e(this.a, paramInt + i) & 0xFFFF;
      if (this.a[(paramInt + i + 2)] == 1) {
        j *= 2;
      }
      i += 3 + j;
    }
    return i;
  }
  
  int a(boolean paramBoolean, int paramInt, Object paramObject)
  {
    int i = 1;
    if (!paramBoolean) {
      i += 2;
    }
    switch (paramInt)
    {
    case 0: 
    case 3: 
    case 4: 
      break;
    case 1: 
      i += 8;
      break;
    case 2: 
      byte[] arrayOfByte = zct.c((String)paramObject);
      i += 3;
      if (arrayOfByte != null) {
        i += arrayOfByte.length;
      }
      break;
    }
    return i;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, int paramInt4)
  {
    int i = 1;
    if (paramInt2 - paramInt1 != 1) {
      i += 2;
    }
    switch (paramInt3)
    {
    case 0: 
    case 3: 
    case 4: 
      break;
    case 1: 
      i += 8;
      break;
    case 2: 
      j = zc.e(paramArrayOfByte, paramInt4) & 0xFFFF;
      if (paramArrayOfByte[(paramInt4 + 2)] == 0) {
        i += 3 + j;
      } else {
        i += 3 + j + j;
      }
      break;
    }
    int j = c();
    a(j, 0, i);
    this.a[j] = ((byte)paramInt3);
    int k = 1;
    if (paramInt2 - paramInt1 != 1)
    {
      int tmp143_141 = j;
      byte[] tmp143_138 = this.a;
      tmp143_138[tmp143_141] = ((byte)(tmp143_138[tmp143_141] | 0x8));
      System.arraycopy(zc.a(paramInt2), 0, this.a, j + k, 2);
      a(paramInt2);
      k += 2;
    }
    else if (paramInt2 != 0)
    {
      g();
    }
    switch (paramInt3)
    {
    case 0: 
      break;
    case 4: 
      if (paramArrayOfByte[paramInt4] == 1)
      {
        int tmp242_240 = j;
        byte[] tmp242_237 = this.a;
        tmp242_237[tmp242_240] = ((byte)(tmp242_237[tmp242_240] | 0x10));
      }
      break;
    case 3: 
      int tmp258_256 = j;
      byte[] tmp258_253 = this.a;
      tmp258_253[tmp258_256] = ((byte)(tmp258_253[tmp258_256] | (byte)((a(ztr.a(paramArrayOfByte[paramInt4])) & 0xFF) << 4)));
      break;
    case 1: 
      System.arraycopy(paramArrayOfByte, paramInt4, this.a, j + k, 8);
      break;
    case 2: 
      int m = zc.e(paramArrayOfByte, paramInt4) & 0xFFFF;
      if (paramArrayOfByte[(paramInt4 + 2)] == 0) {
        m = 3 + m;
      } else {
        m = 3 + m + m;
      }
      System.arraycopy(paramArrayOfByte, paramInt4, this.a, j + k, m);
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt3 - paramInt2;
    if (i == 0) {
      return;
    }
    int j = c();
    int k = j + i;
    System.arraycopy(zc.a(k - 4), 0, this.a, 0, 4);
    byte[] arrayOfByte;
    int m;
    if (k > this.a.length)
    {
      if (k < this.a.length * 2) {
        k = this.a.length * 2;
      }
      arrayOfByte = new byte[k];
      m = paramInt1 + paramInt2;
      System.arraycopy(this.a, 0, arrayOfByte, 0, paramInt1);
      if (m < j) {
        System.arraycopy(this.a, m, arrayOfByte, paramInt1 + paramInt3, j - m);
      }
      this.a = arrayOfByte;
    }
    else if ((k > 80) && (k < this.a.length / 3))
    {
      k = this.a.length / 2;
      arrayOfByte = new byte[k];
      m = paramInt1 + paramInt2;
      System.arraycopy(this.a, 0, arrayOfByte, 0, paramInt1);
      if (m < j) {
        System.arraycopy(this.a, m, arrayOfByte, paramInt1 + paramInt3, j - m);
      }
      this.a = arrayOfByte;
    }
    else
    {
      System.arraycopy(this.a, paramInt1 + paramInt2, this.a, paramInt1 + paramInt3, j - (paramInt1 + paramInt2));
    }
  }
  
  static byte a(zuf paramzuf)
  {
    switch (zwo.a[paramzuf.ordinal()])
    {
    case 1: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    case 4: 
      return 3;
    case 5: 
      return 4;
    case 6: 
      return 5;
    case 7: 
      return 6;
    }
    return 0;
  }
  
  static zuf a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      return zuf.e;
    case 1: 
      return zuf.a;
    case 2: 
      return zuf.i;
    case 3: 
      return zuf.g;
    case 4: 
      return zuf.d;
    case 5: 
      return zuf.f;
    case 6: 
      return zuf.c;
    }
    return zuf.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */