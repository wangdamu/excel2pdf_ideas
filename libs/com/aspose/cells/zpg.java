package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;

class zpg
{
  String a;
  String b;
  boolean c = true;
  boolean d = false;
  String e;
  CellArea f;
  String g;
  private zboy h;
  
  int a()
  {
    int i = 4;
    if (this.c)
    {
      i += 6;
    }
    else
    {
      i += 3 + this.e.length();
      if (!zct.b(this.e)) {
        i += this.e.length();
      }
    }
    i += 2;
    if (this.a != null)
    {
      i += 1 + this.a.length() + 1;
      if (!zct.b(this.a)) {
        i += this.a.length() + 1;
      }
    }
    return i;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if (!this.c) {
      paramInt += c(paramArrayOfByte, paramInt);
    } else {
      paramInt += b(paramArrayOfByte, paramInt);
    }
    return paramInt - i;
  }
  
  int b(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    paramArrayOfByte[paramInt] = 81;
    paramArrayOfByte[(paramInt + 1)] = 0;
    paramInt += 4;
    System.arraycopy(zc.a(this.f.StartRow), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a(this.f.EndRow), 0, paramArrayOfByte, paramInt + 2, 2);
    paramArrayOfByte[(paramInt + 4)] = ((byte)this.f.StartColumn);
    paramArrayOfByte[(paramInt + 5)] = ((byte)this.f.EndColumn);
    paramInt += 6;
    if (this.a != null)
    {
      int j = paramInt;
      int[] arrayOfInt = { paramInt };
      zct.a(paramArrayOfByte, arrayOfInt, this.a);
      paramInt = arrayOfInt[0];
      if (paramArrayOfByte[(j + 2)] == 0) {
        paramInt++;
      } else {
        paramInt += 2;
      }
    }
    else
    {
      paramInt += 2;
    }
    System.arraycopy(zc.a((short)(paramInt - i - 4)), 0, paramArrayOfByte, i + 2, 2);
    return paramInt - i;
  }
  
  int c(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    paramArrayOfByte[paramInt] = 82;
    paramArrayOfByte[(paramInt + 1)] = 0;
    paramInt += 4;
    if (this.e != null)
    {
      int[] arrayOfInt1 = { paramInt };
      zct.a(paramArrayOfByte, arrayOfInt1, this.e);
      paramInt = arrayOfInt1[0];
    }
    if (this.a != null)
    {
      int j = paramInt;
      int[] arrayOfInt2 = { paramInt };
      zct.a(paramArrayOfByte, arrayOfInt2, this.a);
      paramInt = arrayOfInt2[0];
      if (paramArrayOfByte[(j + 2)] == 0) {
        paramInt++;
      } else {
        paramInt += 2;
      }
    }
    else
    {
      paramInt += 2;
    }
    System.arraycopy(zc.a((short)(paramInt - i - 4)), 0, paramArrayOfByte, i + 2, 2);
    return paramInt - i;
  }
  
  zpg(zboy paramzboy)
  {
    this.h = paramzboy;
    b();
  }
  
  private void b()
  {
    WorksheetCollection localWorksheetCollection = this.h.a.e.a;
    int i = !localWorksheetCollection.p().g() ? 1 : 0;
    this.f = new CellArea();
    byte[] arrayOfByte = this.h.f();
    if (arrayOfByte == null)
    {
      String str = this.h.b;
      Object localObject1;
      if (i != 0)
      {
        int k = str.lastIndexOf('!');
        this.a = zaap.a(str.substring(0, 0 + k));
        this.a = zbti.a(this.a, 0);
        this.e = str.substring(k + 1);
      }
      else
      {
        localObject1 = zaap.a(str, false);
        this.g = localObject1[0];
        this.a = localObject1[1];
        this.e = localObject1[2];
      }
      if (this.e.indexOf(':') == -1)
      {
        localObject1 = CellsHelper.a(this.e.toCharArray(), 0, this.e.length() - 1, true, 1048575, 16383);
        if (localObject1 != null)
        {
          if (localObject1[0] != -1)
          {
            this.f.StartRow = localObject1[0];
            this.f.EndRow = this.f.StartRow;
          }
          if (localObject1[1] != -1)
          {
            this.f.StartColumn = localObject1[1];
            this.f.EndColumn = this.f.StartColumn;
          }
        }
        else
        {
          this.c = false;
        }
      }
      else
      {
        this.f = CellArea.a(this.e);
        if (i != 0)
        {
          if (this.f.StartRow > 65535) {
            this.f.StartRow = 65535;
          }
          if (this.f.EndRow > 65535) {
            this.f.EndRow = 65535;
          }
          if (this.f.StartColumn > 255) {
            this.f.StartColumn = 255;
          }
          if (this.f.EndColumn > 255) {
            this.f.EndColumn = 255;
          }
        }
      }
      return;
    }
    int j = 4;
    if (i != 0) {
      j = 2;
    }
    if (arrayOfByte[j] == 25) {
      switch (arrayOfByte[(j + 1)])
      {
      case 1: 
      case 64: 
      case 65: 
        j += 4;
        break;
      }
    }
    int m = -1;
    switch (arrayOfByte[j])
    {
    case 24: 
    case 35: 
    case 67: 
    case 99: 
      this.c = false;
      break;
    case 57: 
    case 89: 
    case 121: 
      this.c = false;
      m = zc.b(arrayOfByte, j + 1);
      break;
    }
    int n = 0;
    int i1 = 0;
    if (m != -1)
    {
      localObject2 = localWorksheetCollection.r().b(m);
      n = (((zwp)localObject2).b == ((zwp)localObject2).c) && ((((zwp)localObject2).b & 0xFFFF) == 65534) ? 1 : 0;
      if (n != 0) {
        i1 = (((zwp)localObject2).a & 0xFFFF) == localWorksheetCollection.v() ? 1 : 0;
      }
    }
    Object localObject2 = this.h.h();
    if (localObject2 != null)
    {
      int i2 = ((String)localObject2).lastIndexOf('!');
      if (i2 == -1)
      {
        this.e = ((String)localObject2);
      }
      else if (i2 == ((String)localObject2).length() - 1)
      {
        this.a = "#REF!";
        if (i == 0) {
          this.a = this.h.a.e.a.get(0).getName();
        }
        this.e = "A1";
      }
      else
      {
        this.a = ((String)localObject2).substring(0, 0 + i2);
        if ((this.a != null) && (!"".equals(this.a)) && (this.a.charAt(0) == '\'')) {
          this.a = this.a.substring(1, 1 + (this.a.length() - 2));
        }
        this.e = zw.a(((String)localObject2).substring(i2 + 1), "$", "");
        i2 = this.a.indexOf(']');
        int i3 = i2;
        if (i == 0) {
          if (i2 != -1)
          {
            int i4 = this.a.indexOf('[');
            if (i4 == 0) {
              this.g = this.a.substring(1, 1 + (i2 - 1));
            } else {
              this.g = (this.a.substring(0, 0 + i4) + this.a.substring(i4 + 1, i4 + 1 + (i2 - i4 - 1)));
            }
            this.g = zw.a(this.g, "''", "'");
            this.a = this.a.substring(i2 + 1);
          }
          else if (n != 0)
          {
            if (i1 != 0)
            {
              this.g = localWorksheetCollection.p().getFileName();
              this.a = null;
            }
            else
            {
              this.g = this.a;
              this.a = null;
            }
          }
        }
        if ((!this.c) && (this.g == null) && ((this.a == null) || ("".equals(this.a))))
        {
          Name localName = localWorksheetCollection.getNames().get(this.e);
          if ((localName != null) && (localName.getSheetIndex() != 0)) {
            this.a = localWorksheetCollection.get(localName.getSheetIndex() - 1).getName();
          }
        }
        if (i != 0) {
          if (i3 != -1) {
            this.a = zbti.a(this.a, 0);
          } else {
            this.a = ('\002' + this.a);
          }
        }
        if ((i == 0) && ("#REF!".equals(this.a))) {
          this.a = this.h.a.e.a.get(0).getName();
        }
        if (this.c) {
          this.f = CellArea.a(this.e);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */