package com.aspose.cells;

import com.aspose.cells.a.c.zq;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zt;
import com.aspose.cells.b.a.zw;
import java.util.Random;

class zbyk
{
  private byte[] a;
  private Encoding b;
  private boolean c = false;
  private String d;
  private String e;
  private byte[] f;
  private byte[] g;
  private byte[] h = null;
  private byte[] i = null;
  
  zbyk(byte[] paramArrayOfByte, Encoding paramEncoding)
  {
    this.a = paramArrayOfByte;
    this.b = paramEncoding;
  }
  
  zbyk(String paramString, Encoding paramEncoding)
  {
    this.b = paramEncoding;
    this.h = d();
    this.c = true;
    this.i = b(paramString);
    String[] arrayOfString1 = { this.d };
    this.f = a(this.h, arrayOfString1);
    this.d = arrayOfString1[0];
    String[] arrayOfString2 = { this.e };
    this.g = a(this.i, arrayOfString2);
    this.e = arrayOfString2[0];
    this.a = new byte[29];
    int j = 0;
    this.a[(j++)] = -1;
    String str = this.d + this.e;
    this.a[(j++)] = a(str.substring(0, 8));
    this.a[(j++)] = a(str.substring(8, 16));
    this.a[(j++)] = a(str.substring(16, 24));
    System.arraycopy(this.f, 0, this.a, j, this.f.length);
    j += this.f.length;
    System.arraycopy(this.g, 0, this.a, j, this.g.length);
    j += this.g.length;
    this.a[j] = 0;
  }
  
  byte[] a()
  {
    return this.a;
  }
  
  private void c()
  {
    if (this.a.length != 29) {
      throw new CellsException(6, "Vba protection password hash data must be 29 bytes");
    }
    int j = 0;
    j++;
    String str = a(this.a[(j++)]) + a(this.a[(j++)]) + a(this.a[(j++)]);
    this.d = str.substring(0, 4);
    this.e = str.substring(4, 24);
    this.f = new byte[4];
    System.arraycopy(this.a, j, this.f, 0, 4);
    j += 4;
    this.g = new byte[20];
    System.arraycopy(this.a, j, this.g, 0, 20);
    j += 20;
    this.h = a(this.f, this.d);
    this.i = a(this.g, this.e);
  }
  
  private static String a(byte paramByte)
  {
    return zw.a(ze.a(paramByte, 2), 8, '0');
  }
  
  private static byte a(String paramString)
  {
    return (byte)(ze.b(paramString, 2) & 0xFF);
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int j = 0; j < paramArrayOfByte.length; j++)
    {
      int k = paramArrayOfByte[j];
      if (k == 0)
      {
        arrayOfByte[j] = 1;
        localStringBuilder.append('0');
      }
      else
      {
        arrayOfByte[j] = k;
        localStringBuilder.append('1');
      }
    }
    paramArrayOfString[0] = zs.a(localStringBuilder);
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    for (int j = 0; j < paramString.length(); j++) {
      if (paramString.charAt(j) == '0') {
        arrayOfByte[j] = 0;
      } else {
        arrayOfByte[j] = paramArrayOfByte[j];
      }
    }
    return arrayOfByte;
  }
  
  private byte[] b(String paramString)
  {
    if (!this.c)
    {
      c();
      this.c = true;
    }
    byte[] arrayOfByte1 = this.b.a(paramString);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + this.h.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(this.h, 0, arrayOfByte2, paramString.length(), this.h.length);
    return zq.a(arrayOfByte2);
  }
  
  private static byte[] d()
  {
    Random localRandom = zit.b();
    return new byte[] { (byte)zt.a(localRandom, 0, 255), (byte)zt.a(localRandom, 0, 255), (byte)zt.a(localRandom, 0, 255), (byte)zt.a(localRandom, 0, 255) };
  }
  
  public Object b()
  {
    byte[] arrayOfByte = new byte[this.a.length];
    System.arraycopy(this.a, 0, arrayOfByte, 0, this.a.length);
    return new zbyk(arrayOfByte, Encoding.getEncoding(this.b.i()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */