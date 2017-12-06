package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbtj
  extends zcd
{
  private ArrayList a = null;
  
  zbtj()
  {
    c(430);
  }
  
  void a(zbti paramzbti, int paramInt)
    throws Exception
  {
    switch (paramzbti.a())
    {
    case 2: 
      a();
      break;
    case 1: 
      a(paramInt);
      break;
    case 3: 
    case 4: 
      a(paramzbti.i());
      break;
    case 0: 
      if (paramzbti.c() == null) {
        a(paramzbti.i());
      } else {
        a(paramzbti.i(), paramzbti.c());
      }
      break;
    }
  }
  
  void a(int paramInt)
  {
    b(4);
    this.b = new byte[4];
    this.b[0] = zc.a(paramInt)[0];
    this.b[1] = zc.a(paramInt)[1];
    this.b[2] = 1;
    this.b[3] = 4;
  }
  
  void a()
  {
    b(4);
    this.b = new byte[4];
    this.b[0] = 1;
    this.b[2] = 1;
    this.b[3] = 58;
  }
  
  void a(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = zct.c(paramString);
    a((short)(5 + arrayOfByte.length));
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramString.length()), 0, this.b, 2, 2);
    this.b[4] = ((byte)(paramString.length() == arrayOfByte.length ? 0 : 1));
    System.arraycopy(arrayOfByte, 0, this.b, 5, arrayOfByte.length);
  }
  
  void a(String paramString, String[] paramArrayOfString)
    throws Exception
  {
    byte[] arrayOfByte1 = zct.c(paramString);
    a((short)(5 + arrayOfByte1.length));
    byte[][] arrayOfByte = new byte[paramArrayOfString.length][];
    int i = -1;
    for (int j = 0; j < paramArrayOfString.length; j++)
    {
      arrayOfByte[j] = zct.c(paramArrayOfString[j]);
      if (i == -1)
      {
        k = 3 + (arrayOfByte[j] == null ? 0 : arrayOfByte[j].length);
        if (d() + k > 8224) {
          i = j;
        } else {
          b(d() + (short)k);
        }
      }
    }
    this.b = new byte[d()];
    System.arraycopy(zc.a(paramArrayOfString.length), 0, this.b, 0, 2);
    System.arraycopy(zc.a(paramString.length()), 0, this.b, 2, 2);
    this.b[4] = ((byte)(paramString.length() == arrayOfByte1.length ? 0 : 1));
    System.arraycopy(arrayOfByte1, 0, this.b, 5, arrayOfByte1.length);
    j = 5 + arrayOfByte1.length;
    int k = i == -1 ? paramArrayOfString.length : i;
    for (int m = 0; m < k; m++)
    {
      System.arraycopy(zc.a(paramArrayOfString[m].length()), 0, this.b, j, 2);
      if (arrayOfByte[m] == null)
      {
        this.b[(j + 2)] = 0;
        j += 3;
      }
      else
      {
        this.b[(j + 2)] = ((byte)(paramArrayOfString[m].length() == arrayOfByte[m].length ? 0 : 1));
        System.arraycopy(arrayOfByte[m], 0, this.b, j + 3, arrayOfByte[m].length);
        j += 3 + arrayOfByte[m].length;
      }
    }
    if (i != -1)
    {
      m = 0;
      this.a = new ArrayList();
      for (int n = i; n < paramArrayOfString.length; n++)
      {
        int i1 = 3 + (arrayOfByte[n] == null ? 0 : arrayOfByte[n].length);
        if (m + i1 > 8224)
        {
          byte[] arrayOfByte3 = new byte[m];
          j = 0;
          while (i < n)
          {
            System.arraycopy(zc.a(paramArrayOfString[i].length()), 0, arrayOfByte3, j, 2);
            if (arrayOfByte[i] == null)
            {
              arrayOfByte3[(j + 2)] = 0;
              j += 3;
            }
            else
            {
              arrayOfByte3[(j + 2)] = ((byte)(paramArrayOfString[i].length() == arrayOfByte[i].length ? 0 : 1));
              System.arraycopy(arrayOfByte[i], 0, arrayOfByte3, j + 3, arrayOfByte[i].length);
              j += 3 + arrayOfByte[i].length;
            }
            i++;
          }
          znt localznt2 = new znt();
          localznt2.b(arrayOfByte3);
          zf.a(this.a, localznt2);
          m = 0;
        }
        m += i1;
      }
      if (m != 0)
      {
        j = 0;
        byte[] arrayOfByte2 = new byte[m];
        while (i < paramArrayOfString.length)
        {
          System.arraycopy(zc.a(paramArrayOfString[i].length()), 0, arrayOfByte2, j, 2);
          if (paramArrayOfString[i] == null)
          {
            arrayOfByte2[(j + 2)] = 0;
            j += 3;
          }
          else
          {
            arrayOfByte2[(j + 2)] = ((byte)(paramArrayOfString[i].length() == arrayOfByte[i].length ? 0 : 1));
            System.arraycopy(arrayOfByte[i], 0, arrayOfByte2, j + 3, arrayOfByte[i].length);
            j += 3 + arrayOfByte[i].length;
          }
          i++;
        }
        znt localznt1 = new znt();
        localznt1.b(arrayOfByte2);
        zf.a(this.a, localznt1);
      }
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = null;
    arrayOfByte = new byte[this.b.length + 4];
    System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a(d()), 0, arrayOfByte, 2, 2);
    System.arraycopy(this.b, 0, arrayOfByte, 4, this.b.length);
    paramzrg.a(arrayOfByte);
    if ((this.a != null) && (this.a.size() != 0)) {
      for (int i = 0; i < this.a.size(); i++)
      {
        znt localznt = (znt)this.a.get(i);
        localznt.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */