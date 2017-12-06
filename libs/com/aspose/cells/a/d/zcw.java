package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;

public class zcw
  extends za
{
  public zcw(zm paramzm)
  {
    super(paramzm);
  }
  
  public int[] a()
    throws Exception
  {
    int i = super.q();
    return a(i);
  }
  
  public int[] a(int paramInt)
    throws Exception
  {
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfInt[i] = super.q();
    }
    return arrayOfInt;
  }
  
  public String b(int paramInt)
    throws Exception
  {
    int i = paramInt * 2;
    byte[] arrayOfByte = super.f(i);
    return zw.c(Encoding.getUnicode().a(arrayOfByte, 0, i), '\000');
  }
  
  public zo b()
    throws Exception
  {
    int i = super.q();
    int j = super.q();
    return new zo(i, j);
  }
  
  public zt c()
    throws Exception
  {
    int i = super.q();
    int j = super.q();
    return new zt(i, j);
  }
  
  public zq d()
    throws Exception
  {
    int[] arrayOfInt = a(4);
    return zq.a(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2], arrayOfInt[3]);
  }
  
  public Color e()
    throws Exception
  {
    int i = super.m();
    int j = super.m();
    int k = super.m();
    super.m();
    return Color.fromArgb(255, i & 0xFF, j & 0xFF, k & 0xFF);
  }
  
  public zo[] f()
    throws Exception
  {
    int i = super.q();
    return c(i);
  }
  
  public zo[] c(int paramInt)
    throws Exception
  {
    zo[] arrayOfzo = new zo[paramInt];
    for (int i = 0; i < paramInt; i++)
    {
      arrayOfzo[i] = new zo();
      arrayOfzo[i].a(super.q());
      arrayOfzo[i].b(super.q());
    }
    return arrayOfzo;
  }
  
  public zo[] g()
    throws Exception
  {
    int i = super.q();
    return d(i);
  }
  
  public zo[] d(int paramInt)
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
  
  public zo[][] h()
    throws Exception
  {
    int i = super.q();
    super.q();
    zo[][] arrayOfzo = new zo[i][];
    int[] arrayOfInt = a(i);
    for (int j = 0; j < i; j++) {
      arrayOfzo[j] = c(arrayOfInt[j]);
    }
    return arrayOfzo;
  }
  
  public zo[][] i()
    throws Exception
  {
    int i = super.q();
    super.q();
    zo[][] arrayOfzo = new zo[i][];
    int[] arrayOfInt = a(i);
    for (int j = 0; j < i; j++) {
      arrayOfzo[j] = d(arrayOfInt[j]);
    }
    return arrayOfzo;
  }
  
  public zi j()
    throws Exception
  {
    float f1 = t();
    float f2 = t();
    float f3 = t();
    float f4 = t();
    float f5 = t();
    float f6 = t();
    return new zi(f1, f2, f3, f4, f5, f6);
  }
  
  public int[] e(int paramInt)
    throws Exception
  {
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfInt[i] = (super.m() & 0xFF);
    }
    return arrayOfInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */