package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;

class zwh
{
  zaqg a;
  private zbti d;
  private int e;
  private String f;
  int b = 0;
  byte c;
  private static final za g = new za(new String[] { "#DIV/0!", "#N/A", "#NAME?", "#NULL!", "#NUM!", "#REF!", "#VALUE!" });
  
  zbti a()
  {
    return this.d;
  }
  
  void a(zwh paramzwh)
  {
    this.e = paramzwh.e;
    this.a.d = paramzwh.a.d;
    this.a.f = paramzwh.a.f;
    this.a.g = paramzwh.a.g;
    if (paramzwh.a.e != null)
    {
      this.a.e = new byte[paramzwh.a.e.length];
      System.arraycopy(paramzwh.a.e, 0, this.a.e, 0, this.a.e.length);
    }
  }
  
  zwh(zbti paramzbti)
  {
    this.d = paramzbti;
    this.a = new zaqg();
  }
  
  int b()
  {
    return this.e;
  }
  
  void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  int c()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  int d()
  {
    return this.a.g;
  }
  
  void c(int paramInt)
  {
    this.a.g = paramInt;
  }
  
  String e()
  {
    return this.a.f;
  }
  
  void a(String paramString)
  {
    this.a.f = paramString;
  }
  
  byte[] f()
  {
    return this.a.e;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.f = null;
    this.a.e = paramArrayOfByte;
  }
  
  String a(WorksheetCollection paramWorksheetCollection)
  {
    if ((this.f == null) && (this.a.e != null)) {
      this.f = paramWorksheetCollection.d().a(this);
    }
    return this.f;
  }
  
  void a(WorksheetCollection paramWorksheetCollection, String paramString)
  {
    this.f = paramString;
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    if (paramString.charAt(0) == '=') {
      paramString = paramString.substring(1).trim();
    }
    byte[] arrayOfByte = { 28, 23 };
    switch (g.a(paramString))
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      break;
    default: 
      int i = paramString.lastIndexOf('!');
      if (i == -1)
      {
        this.f = null;
      }
      else
      {
        String str1 = paramString.substring(i + 1);
        if (!zy.a(str1, "#REF!"))
        {
          String str2 = paramString.substring(0, 0 + i);
          if (str2.charAt(0) == '\'') {
            str2 = str2.substring(1, 1 + (str2.length() - 2));
          }
          if (str2.charAt(0) == '[')
          {
            i = str2.lastIndexOf(']');
            str2 = str2.substring(i + 1);
          }
          i = str2.indexOf(':');
          int k;
          int j;
          if (i == -1)
          {
            j = k = this.d.b(str2);
          }
          else
          {
            j = this.d.b(str2.substring(0, 0 + i));
            k = this.d.b(str2.substring(i + 1));
          }
          if ((j >= 0) && (k >= 0))
          {
            i = str1.indexOf(':');
            Object localObject;
            int i1;
            int i2;
            if (i == -1)
            {
              localObject = CellsHelper.a(str1.toCharArray(), 0, str1.length() - 1, true, 1048575, 16383);
              if ((localObject != null) && (localObject[1] != -1) && (localObject[0] != -1))
              {
                int m = localObject[0];
                int n = localObject[1];
                i1 = localObject[2] == 1 ? 1 : 0;
                i2 = localObject[3] == 1 ? 1 : 0;
                arrayOfByte = new byte[9];
                arrayOfByte[0] = 58;
                System.arraycopy(zc.a(j), 0, arrayOfByte, 1, 2);
                System.arraycopy(zc.a(k), 0, arrayOfByte, 3, 2);
                System.arraycopy(zc.a(m), 0, arrayOfByte, 5, 2);
                arrayOfByte[7] = ((byte)n);
                if (i2 == 0)
                {
                  byte[] tmp457_454 = arrayOfByte;
                  tmp457_454[8] = ((byte)(tmp457_454[8] | 0x40));
                }
                if (i1 == 0)
                {
                  byte[] tmp472_469 = arrayOfByte;
                  tmp472_469[8] = ((byte)(tmp472_469[8] | 0x80));
                }
              }
            }
            else
            {
              localObject = str1.toCharArray();
              int[] arrayOfInt1 = CellsHelper.a((char[])localObject, 0, i - 1, true, 1048575, 16383);
              if (arrayOfInt1 != null)
              {
                int[] arrayOfInt2 = CellsHelper.a((char[])localObject, i + 1, localObject.length - 1, true, 1048575, 16383);
                if (arrayOfInt2 != null)
                {
                  i1 = arrayOfInt1[0];
                  i2 = arrayOfInt1[1];
                  int i3 = arrayOfInt2[0];
                  int i4 = arrayOfInt2[1];
                  int i5 = arrayOfInt1[2] == 1 ? 1 : 0;
                  int i6 = arrayOfInt1[3] == 1 ? 1 : 0;
                  int i7 = arrayOfInt1[1] == -1 ? 1 : 0;
                  int i8 = arrayOfInt1[0] == -1 ? 1 : 0;
                  int i9 = arrayOfInt2[2] == 1 ? 1 : 0;
                  int i10 = arrayOfInt2[3] == 1 ? 1 : 0;
                  int i11 = arrayOfInt2[1] == -1 ? 1 : 0;
                  int i12 = arrayOfInt2[0] == -1 ? 1 : 0;
                  if (i7 != 0)
                  {
                    if (i11 != 0)
                    {
                      arrayOfByte = new byte[13];
                      arrayOfByte[0] = 59;
                      System.arraycopy(zc.a(j), 0, arrayOfByte, 1, 2);
                      System.arraycopy(zc.a(k), 0, arrayOfByte, 3, 2);
                      System.arraycopy(zc.a(i1), 0, arrayOfByte, 5, 2);
                      System.arraycopy(zc.a(i3), 0, arrayOfByte, 7, 2);
                      arrayOfByte[9] = 0;
                      if (i5 == 0)
                      {
                        byte[] tmp766_763 = arrayOfByte;
                        tmp766_763[10] = ((byte)(tmp766_763[10] | 0x80));
                      }
                      arrayOfByte[11] = -1;
                      if (i9 == 0)
                      {
                        byte[] tmp787_784 = arrayOfByte;
                        tmp787_784[12] = ((byte)(tmp787_784[12] | 0x80));
                      }
                    }
                  }
                  else if (i8 != 0)
                  {
                    if (i12 != 0)
                    {
                      arrayOfByte = new byte[13];
                      arrayOfByte[0] = 59;
                      System.arraycopy(zc.a(j), 0, arrayOfByte, 1, 2);
                      System.arraycopy(zc.a(k), 0, arrayOfByte, 3, 2);
                      System.arraycopy(zc.a(0), 0, arrayOfByte, 5, 2);
                      System.arraycopy(zc.a(65535), 0, arrayOfByte, 7, 2);
                      arrayOfByte[9] = ((byte)i2);
                      if (i6 == 0)
                      {
                        byte[] tmp881_878 = arrayOfByte;
                        tmp881_878[10] = ((byte)(tmp881_878[10] | 0x40));
                      }
                      arrayOfByte[11] = ((byte)i4);
                      if (i10 == 0)
                      {
                        byte[] tmp903_900 = arrayOfByte;
                        tmp903_900[12] = ((byte)(tmp903_900[12] | 0x40));
                      }
                    }
                  }
                  else
                  {
                    arrayOfByte = new byte[13];
                    arrayOfByte[0] = 59;
                    System.arraycopy(zc.a(j), 0, arrayOfByte, 1, 2);
                    System.arraycopy(zc.a(k), 0, arrayOfByte, 3, 2);
                    System.arraycopy(zc.a(i1), 0, arrayOfByte, 5, 2);
                    System.arraycopy(zc.a(i3), 0, arrayOfByte, 7, 2);
                    System.arraycopy(zc.a(i2), 0, arrayOfByte, 9, 2);
                    if (i6 == 0)
                    {
                      byte[] tmp993_990 = arrayOfByte;
                      tmp993_990[10] = ((byte)(tmp993_990[10] | 0x40));
                    }
                    if (i5 == 0)
                    {
                      byte[] tmp1008_1005 = arrayOfByte;
                      tmp1008_1005[10] = ((byte)(tmp1008_1005[10] | 0x80));
                    }
                    System.arraycopy(zc.a(i4), 0, arrayOfByte, 11, 2);
                    if (i10 == 0)
                    {
                      byte[] tmp1037_1034 = arrayOfByte;
                      tmp1037_1034[12] = ((byte)(tmp1037_1034[12] | 0x40));
                    }
                    if (i9 == 0)
                    {
                      byte[] tmp1052_1049 = arrayOfByte;
                      tmp1052_1049[12] = ((byte)(tmp1052_1049[12] | 0x80));
                    }
                  }
                }
              }
            }
          }
        }
      }
      break;
    }
    if (arrayOfByte != null) {
      if (paramWorksheetCollection.p().h())
      {
        this.a.e = new byte[arrayOfByte.length + 4];
        System.arraycopy(zc.a(arrayOfByte.length), 0, this.a.e, 0, 4);
        System.arraycopy(arrayOfByte, 0, this.a.e, 4, arrayOfByte.length);
      }
      else
      {
        this.a.e = new byte[arrayOfByte.length + 2];
        System.arraycopy(zc.a(arrayOfByte.length), 0, this.a.e, 0, 2);
        System.arraycopy(arrayOfByte, 0, this.a.e, 2, arrayOfByte.length);
      }
    }
  }
  
  int g()
  {
    return this.a.d;
  }
  
  void d(int paramInt)
  {
    this.a.d = paramInt;
  }
  
  byte[] h()
  {
    return this.a.e;
  }
  
  void b(byte[] paramArrayOfByte)
  {
    this.a.e = paramArrayOfByte;
  }
  
  boolean i()
  {
    return (this.a.d & 0xFFFF & 0x1) != 0;
  }
  
  boolean j()
  {
    return (this.a.d & 0xFFFF & 0x8) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.d |= 0xFFF8;
    } else {
      this.a.d &= 0xFFF7;
    }
  }
  
  boolean k()
  {
    return (this.c & 0xFF & 0x1) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c = ((byte)(this.c | 0x1));
    } else {
      this.c = ((byte)(this.c & 0xFE));
    }
  }
  
  boolean l()
  {
    return (this.c & 0xFF & 0x8) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.c = ((byte)(this.c | 0x8));
    } else {
      this.c = ((byte)(this.c & 0xF7));
    }
  }
  
  void a(String paramString, boolean paramBoolean)
  {
    this.a.f = paramString;
    if (paramBoolean) {
      this.a.e = new byte[] { 2, 0, 0, 0, 28, 23 };
    } else {
      this.a.e = new byte[] { 2, 0, 28, 23 };
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */