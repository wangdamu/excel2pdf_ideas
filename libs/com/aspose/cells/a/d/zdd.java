package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;

public class zdd
  extends za
{
  public zdd(zm paramzm)
  {
    super(paramzm);
  }
  
  public int[] a(int paramInt)
    throws Exception
  {
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfInt[i] = super.n();
    }
    return arrayOfInt;
  }
  
  public String a(int paramInt, Encoding paramEncoding)
    throws Exception
  {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = 0; i < paramInt; i++)
    {
      int j = super.m();
      if (j == 0) {
        break;
      }
      arrayOfByte[i] = j;
    }
    return zw.c(paramEncoding.a(arrayOfByte, 0, i), '\000');
  }
  
  public zo a()
    throws Exception
  {
    int i = super.n();
    int j = super.n();
    return new zo(j, i);
  }
  
  public zt b()
    throws Exception
  {
    int i = super.n();
    int j = super.n();
    return new zt(j, i);
  }
  
  public zq c()
    throws Exception
  {
    int[] arrayOfInt = a(4);
    return zq.a(arrayOfInt[3], arrayOfInt[2], arrayOfInt[1], arrayOfInt[0]);
  }
  
  public zq d()
    throws Exception
  {
    int[] arrayOfInt = a(4);
    return new zq(arrayOfInt[3], arrayOfInt[2], arrayOfInt[1], arrayOfInt[0]);
  }
  
  public Color e()
    throws Exception
  {
    int i = super.m();
    int j = super.m();
    int k = super.m();
    super.m();
    return Color.fromArgb(i & 0xFF, j & 0xFF, k & 0xFF);
  }
  
  public zo[] f()
    throws Exception
  {
    int i = super.p();
    return b(i & 0xFFFF);
  }
  
  public zo[] b(int paramInt)
    throws Exception
  {
    zo[] arrayOfzo = new zo[paramInt];
    for (int i = 0; i < paramInt; i++)
    {
      arrayOfzo[i] = new zo();
      arrayOfzo[i].a(super.n());
      arrayOfzo[i].b(super.n());
    }
    return arrayOfzo;
  }
  
  public zo[][] g()
    throws Exception
  {
    int i = super.p();
    zo[][] arrayOfzo = new zo[i][];
    int[] arrayOfInt = a(i & 0xFFFF);
    for (int j = 0; j < (i & 0xFFFF); j++) {
      arrayOfzo[j] = b(arrayOfInt[j]);
    }
    return arrayOfzo;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */