package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zaam
{
  private byte[] a;
  private int b;
  private CopyOptions c;
  private zacc d = null;
  private int e = 0;
  private zcy f = null;
  private boolean g = false;
  
  zaam(byte[] paramArrayOfByte, int paramInt, CopyOptions paramCopyOptions)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt;
    this.c = paramCopyOptions;
    this.g = false;
    if (!paramCopyOptions.k.h()) {
      this.d = new zacd();
    } else {
      this.d = new zace();
    }
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt, CopyOptions paramCopyOptions)
  {
    WorksheetCollection localWorksheetCollection1 = paramCopyOptions.j.getWorksheets();
    WorksheetCollection localWorksheetCollection2 = paramCopyOptions.k.getWorksheets();
    int i = zc.b(paramArrayOfByte, paramInt + 2);
    int j = paramCopyOptions.c(i);
    if (j < 0) {
      j = paramCopyOptions.e();
    }
    if (j != i) {
      System.arraycopy(zc.a(j), 0, paramArrayOfByte, paramInt + 2, 2);
    }
    if ((paramArrayOfByte[(paramInt + 5)] & 0xFF & 0x20) != 0) {
      return;
    }
    int k = zc.a(paramArrayOfByte, paramInt + 6);
    int m = paramCopyOptions.h(k);
    if (m != -1)
    {
      int n = m;
      if (n != k) {
        System.arraycopy(zc.a(n), 0, paramArrayOfByte, paramInt + 6, 2);
      }
      return;
    }
    if (paramCopyOptions.b()) {
      return;
    }
    zwp localzwp1 = localWorksheetCollection1.r().b(i);
    zwp localzwp2 = localWorksheetCollection2.r().b(j);
    if (((localzwp1.a & 0xFFFF) == localWorksheetCollection1.v()) && ((localzwp1.b & 0xFFFF) >= 0) && ((localzwp1.b & 0xFFFF) < localWorksheetCollection1.getCount()) && ((localzwp2.a & 0xFFFF) != localWorksheetCollection2.v()))
    {
      ListObject localListObject = localWorksheetCollection1.get(localzwp1.b & 0xFFFF).getListObjects().a(k);
      if (localListObject == null)
      {
        paramArrayOfByte[(paramInt + 5)] = ((byte)(paramArrayOfByte[(paramInt + 5)] & 0xFF | 0x20));
        return;
      }
      int i1 = paramArrayOfByte[(paramInt + 4)] & 0xFF & 0x3;
      int i2 = (paramArrayOfByte[(paramInt + 4)] & 0xFF) >> 2;
      int i3 = zc.e(paramArrayOfByte, paramInt + 10) & 0xFFFF;
      int i4 = zc.e(paramArrayOfByte, paramInt + 12) & 0xFFFF;
      if (this.f == null) {
        this.f = new zcy(16);
      }
      this.f.a((byte)(i1 != 0 ? 1 : 0));
      this.f.a((byte)i2);
      this.f.a((byte)0);
      this.f.a(zc.a(localListObject.getDisplayName().length()), 0, 2);
      this.f.a(Encoding.getUnicode().a(localListObject.getDisplayName()), 0, localListObject.getDisplayName().length() << 1);
      if (i1 > 0)
      {
        this.f.a(2);
        this.f.a((byte)i1);
        this.f.a((byte)(i1 > 1 ? 0 : 1));
        this.f.a((byte)2);
        this.f.a(1);
        String str = localListObject.getListColumns().get(i3).getName();
        this.f.a(zc.a(str.length()), 0, 2);
        this.f.a(Encoding.getUnicode().a(str), 0, str.length() << 1);
        if (i1 > 1)
        {
          this.f.a((byte)0);
          this.f.a((byte)2);
          this.f.a(1);
          str = localListObject.getListColumns().get(i4).getName();
          this.f.a(zc.a(str.length()), 0, 2);
          this.f.a(Encoding.getUnicode().a(str), 0, str.length() << 1);
        }
      }
    }
  }
  
  private static int b(byte[] paramArrayOfByte, int paramInt, CopyOptions paramCopyOptions)
  {
    int i = zc.b(paramArrayOfByte, paramInt + 1);
    int j = paramCopyOptions.c(i);
    if (j == -1) {
      paramCopyOptions.a = false;
    } else {
      System.arraycopy(zc.a(j), 0, paramArrayOfByte, paramInt + 1, 2);
    }
    return i;
  }
  
  private static void a(ArrayList paramArrayList, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i = paramInt1;
    if (paramArrayList.size() == 0) {
      return;
    }
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      int[] arrayOfInt = (int[])paramArrayList.get(j);
      if (i >= arrayOfInt[0]) {
        if (i >= arrayOfInt[1])
        {
          if (arrayOfInt[3] != 0) {
            System.arraycopy(zc.a(arrayOfInt[1] - arrayOfInt[0] + arrayOfInt[3]), 0, paramArrayOfByte, arrayOfInt[2], 2);
          }
          paramArrayList.remove(j--);
        }
        else
        {
          arrayOfInt[3] += paramInt2;
        }
      }
    }
  }
  
  private static void c(byte[] paramArrayOfByte, int paramInt, CopyOptions paramCopyOptions)
  {
    WorksheetCollection localWorksheetCollection1 = paramCopyOptions.j.getWorksheets();
    WorksheetCollection localWorksheetCollection2 = paramCopyOptions.k.getWorksheets();
    int i = (zc.e(paramArrayOfByte, paramInt + 3) & 0xFFFF) - 1;
    int j = zc.e(paramArrayOfByte, paramInt + 1) & 0xFFFF;
    if (localWorksheetCollection1.r().c(j) == localWorksheetCollection1.v())
    {
      int k = paramCopyOptions.f(i);
      if (k >= 0)
      {
        System.arraycopy(zc.a(k + 1), 0, paramArrayOfByte, paramInt + 3, 2);
        int m = paramCopyOptions.c(j);
        System.arraycopy(zc.a(m), 0, paramArrayOfByte, paramInt + 1, 2);
        return;
      }
      if (paramCopyOptions.getCopyInvalidFormulasAsValues())
      {
        paramCopyOptions.a = false;
        return;
      }
    }
    b(paramArrayOfByte, paramInt, paramCopyOptions);
    i = paramCopyOptions.a(j, i);
  }
  
  private void a(int paramInt)
  {
    int i = (zc.e(this.a, paramInt + 1) & 0xFFFF) - 1;
    int j = this.c.f(i);
    if (j < 0) {
      if (this.c.getCopyInvalidFormulasAsValues())
      {
        this.c.a = true;
      }
      else
      {
        int[] arrayOfInt = this.c.g(i);
        if (arrayOfInt != null) {
          this.e += 2;
        }
      }
    }
  }
  
  private void a(int paramInt, ArrayList paramArrayList)
  {
    int i = (zc.e(this.a, paramInt + 1) & 0xFFFF) - 1;
    int j = this.c.f(i);
    if (j >= 0)
    {
      System.arraycopy(zc.a(j + 1), 0, this.a, paramInt + 1, 2);
    }
    else if (this.c.getCopyInvalidFormulasAsValues())
    {
      this.c.a = true;
    }
    else
    {
      int[] arrayOfInt = this.c.g(i);
      if (arrayOfInt == null)
      {
        j = this.c.e(i);
        System.arraycopy(zc.a(j + 1), 0, this.a, paramInt + 1, 2);
      }
      else
      {
        a(paramArrayList, paramInt, 2, this.a);
        System.arraycopy(this.a, paramInt + 1, this.a, paramInt + 3, this.a.length - (paramInt + 3));
        this.a[paramInt] = ((byte)((this.a[paramInt] & 0xFF) + 22));
        System.arraycopy(zc.a(arrayOfInt[0]), 0, this.a, paramInt + 1, 2);
        System.arraycopy(zc.a(arrayOfInt[1] + 1), 0, this.a, paramInt + 3, 2);
      }
    }
  }
  
  private int a()
  {
    this.d.a(this.a, 0, this.b == -1 ? -1 : this.a.length - 1);
    int i = 0;
    while (this.d.h())
    {
      i = this.d.e();
      switch (this.a[i])
      {
      case 35: 
      case 67: 
      case 99: 
        if (!this.c.c()) {
          a(i);
        }
        break;
      case 24: 
        if (this.a[(i + 1)] == 25) {
          this.g = true;
        }
        break;
      }
      this.d.k();
    }
    return 0;
  }
  
  private byte[] b()
  {
    a();
    if (!this.c.a) {
      return null;
    }
    if (this.c.c())
    {
      if (this.g)
      {
        this.d.a(this.a, 0, this.b == -1 ? -1 : this.a.length - 1);
        int i = 0;
        while (this.d.h())
        {
          i = this.d.e();
          switch (this.a[i])
          {
          case 24: 
            if (this.a[(i + 1)] == 25) {
              a(this.a, i, this.c);
            }
            break;
          }
          this.d.k();
        }
      }
      return this.a;
    }
    if (this.e > 0)
    {
      localObject = new byte[this.a.length + this.e];
      System.arraycopy(this.a, 0, localObject, 0, this.a.length);
      if (this.b == -1) {
        if (this.c.k.h()) {
          System.arraycopy(zc.a(zc.a(this.a, 0) + this.e), 0, localObject, 0, 4);
        } else {
          System.arraycopy(zc.a(zc.b(this.a, 0) + this.e), 0, localObject, 0, 2);
        }
      }
      this.a = ((byte[])localObject);
    }
    Object localObject = new ArrayList();
    int[] arrayOfInt = new int[4];
    this.d.a(this.a, 0, this.b == -1 ? -1 : this.a.length - 1);
    int j = 0;
    int k;
    int m;
    int n;
    while (this.d.h())
    {
      j = this.d.e();
      switch (this.a[j])
      {
      case 24: 
        if (this.a[(j + 1)] == 25) {
          a(this.a, j, this.c);
        }
        break;
      case 25: 
        if (this.e > 0)
        {
          k = 4;
          m = 0;
          n = j;
          switch (this.a[(n + 1)])
          {
          case 2: 
          case 8: 
            m = zc.e(this.a, n + 2) & 0xFFFF;
            this.b += 4;
            arrayOfInt = new int[4];
            arrayOfInt[0] = n;
            arrayOfInt[1] = (n + m);
            arrayOfInt[2] = (n - 2);
            zf.a((ArrayList)localObject, arrayOfInt);
            break;
          case 4: 
            int i1 = zc.e(this.a, n + 4);
            k = (i1 & 0xFFFF) + 4;
            int i2 = zc.e(this.a, n + 2) & 0xFFFF;
            int i3 = n + 4;
            for (int i4 = 0; i4 < i2; i4++)
            {
              int i5 = n + 6 + i4 * 2;
              arrayOfInt = new int[4];
              arrayOfInt[0] = i3;
              m = zc.e(this.a, i5) & 0xFFFF;
              arrayOfInt[1] = (i3 + m);
              arrayOfInt[2] = (n + k - (i2 - i4) * 2);
              zf.a((ArrayList)localObject, arrayOfInt);
            }
            n += k;
          }
        }
        break;
      case 35: 
      case 67: 
      case 99: 
        a(j, (ArrayList)localObject);
        break;
      case 57: 
      case 89: 
      case 121: 
        c(this.a, j, this.c);
        break;
      case 58: 
      case 59: 
      case 90: 
      case 91: 
      case 122: 
      case 123: 
        b(this.a, j, this.c);
        break;
      case 60: 
      case 61: 
      case 92: 
      case 93: 
      case 124: 
      case 125: 
        System.arraycopy(zc.a(this.c.e()), 0, this.a, j + 1, 2);
        break;
      }
      if (!this.c.a) {
        return null;
      }
      this.d.k();
    }
    if ((this.e > 0) && (((ArrayList)localObject).size() != 0)) {
      for (k = 0; k < ((ArrayList)localObject).size(); k++)
      {
        arrayOfInt = (int[])((ArrayList)localObject).get(k);
        if (arrayOfInt[3] != 0) {
          System.arraycopy(zc.a(arrayOfInt[1] - arrayOfInt[0] + arrayOfInt[3]), 0, this.a, arrayOfInt[2], 2);
        }
      }
    }
    if ((this.f != null) && (this.f.b() > 0))
    {
      byte[] arrayOfByte = new byte[this.a.length + this.f.b()];
      System.arraycopy(this.a, 0, arrayOfByte, 0, this.a.length);
      System.arraycopy(this.f.a, 0, arrayOfByte, this.a.length, this.f.b());
      this.a = arrayOfByte;
      if ((this.c.k.h()) && (this.b == -1))
      {
        m = zc.a(this.a, 0);
        n = zc.a(this.a, m + 4);
        System.arraycopy(zc.a(n + this.f.b()), 0, this.a, m + 4, 4);
      }
    }
    return this.a;
  }
  
  static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    if ((paramCopyOptions != null) && (paramCopyOptions.a()) && (paramCopyOptions.j == null))
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
      return arrayOfByte;
    }
    int i = paramInt1 == -1 ? 1 : 0;
    paramArrayOfByte = a(paramCopyOptions.j.getWorksheets(), paramCopyOptions.k.getWorksheets(), paramArrayOfByte, paramInt1, paramInt2, paramInt3);
    if ((paramCopyOptions == null) || (paramCopyOptions.a())) {
      return paramArrayOfByte;
    }
    zaam localzaam = new zaam(paramArrayOfByte, paramInt1, paramCopyOptions);
    paramArrayOfByte = localzaam.b();
    return paramArrayOfByte;
  }
  
  private static byte[] a(WorksheetCollection paramWorksheetCollection1, WorksheetCollection paramWorksheetCollection2, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    byte[] arrayOfByte = null;
    if (paramWorksheetCollection1.p().f() == paramWorksheetCollection2.p().f())
    {
      arrayOfByte = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
      return arrayOfByte;
    }
    switch (paramWorksheetCollection1.p().f())
    {
    case 0: 
      switch (paramWorksheetCollection2.p().f())
      {
      case 0: 
        break;
      case 1: 
        arrayOfByte = zcv.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, false, null);
      }
      break;
    case 1: 
      switch (paramWorksheetCollection2.p().f())
      {
      case 0: 
        zcw localzcw = new zcw(paramWorksheetCollection1);
        arrayOfByte = localzcw.a(paramArrayOfByte, paramInt1);
      }
      break;
    }
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */