package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;
import java.util.ArrayList;

class zli
  extends zahw
{
  ColorScale a;
  
  public zli(ColorScale paramColorScale, zaca paramzaca, zgs paramzgs, ArrayList paramArrayList)
  {
    super(paramzaca, paramzgs, paramArrayList);
    this.a = paramColorScale;
  }
  
  Color a()
  {
    zaca localzaca = null;
    if (this.b == null)
    {
      localzaca = d();
      b(localzaca);
    }
    if (this.b.b() != 3) {
      return Color.getEmpty();
    }
    if (localzaca == null) {
      localzaca = d();
    }
    double d1 = a(this.a.getMaxCfvo(), localzaca).o();
    double d2 = a(this.a.getMinCfvo(), localzaca).o();
    a(localzaca);
    localzaca = null;
    double d3 = 0.0D;
    if (d1 == d2)
    {
      if (((zabb)this.b).o() >= d1) {
        d3 = 1.0D;
      } else {
        d3 = 0.0D;
      }
    }
    else {
      d3 = (float)((((zabb)this.b).o() - d2) / (d1 - d2));
    }
    int i = (int)(((this.a.getMaxColor().getA() & 0xFF) - (this.a.getMinColor().getA() & 0xFF)) * d3 + (this.a.getMinColor().getA() & 0xFF));
    int j = (int)(((this.a.getMaxColor().getR() & 0xFF) - (this.a.getMinColor().getR() & 0xFF)) * d3 + (this.a.getMinColor().getR() & 0xFF));
    j = a(j);
    int k = (int)(((this.a.getMaxColor().getG() & 0xFF) - (this.a.getMinColor().getG() & 0xFF)) * d3 + (this.a.getMinColor().getG() & 0xFF));
    k = a(k);
    int m = (int)(((this.a.getMaxColor().getB() & 0xFF) - (this.a.getMinColor().getB() & 0xFF)) * d3 + (this.a.getMinColor().getB() & 0xFF));
    m = a(m);
    Color localColor = Color.fromArgb(255, j, k, m);
    return localColor;
  }
  
  static int a(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    if (paramInt > 255) {
      paramInt = 255;
    }
    return paramInt;
  }
  
  Color b()
  {
    zaca localzaca = null;
    if (this.b == null)
    {
      localzaca = d();
      b(localzaca);
    }
    if (this.b.b() != 3) {
      return Color.getEmpty();
    }
    if (localzaca == null) {
      localzaca = d();
    }
    double d1 = a(this.a.getMaxCfvo(), localzaca).o();
    double d2 = a(this.a.getMinCfvo(), localzaca).o();
    double d3 = a(this.a.getMidCfvo(), localzaca).o();
    a(localzaca);
    localzaca = null;
    double d4 = 0.0D;
    Color localColor1 = this.a.getMaxColor();
    Color localColor2 = this.a.getMinColor();
    double d5 = ((zabb)this.b).o();
    if (d5 >= d3)
    {
      if ((d3 != d2) || (d5 != d2))
      {
        localColor2 = this.a.getMidColor();
        if ((d3 > d2) && (d3 < d1)) {
          d2 = d3;
        }
      }
    }
    else
    {
      if (d3 < d1) {
        d1 = d3;
      }
      localColor1 = this.a.getMidColor();
    }
    if (d5 < d2) {
      return localColor2;
    }
    if (d5 > d1) {
      return localColor1;
    }
    if (d1 == d2)
    {
      if (d5 == d1) {
        d4 = 0.5D;
      } else if (d5 > d1) {
        d4 = 1.0D;
      } else {
        d4 = 0.0D;
      }
    }
    else {
      d4 = (float)((d5 - d2) / (d1 - d2));
    }
    int i = (int)(((localColor1.getA() & 0xFF) - (localColor2.getA() & 0xFF)) * d4 + (localColor2.getA() & 0xFF));
    int j = (int)(((localColor1.getR() & 0xFF) - (localColor2.getR() & 0xFF)) * d4 + (localColor2.getR() & 0xFF));
    int k = (int)(((localColor1.getG() & 0xFF) - (localColor2.getG() & 0xFF)) * d4 + (localColor2.getG() & 0xFF));
    int m = (int)(((localColor1.getB() & 0xFF) - (localColor2.getB() & 0xFF)) * d4 + (localColor2.getB() & 0xFF));
    Color localColor3 = Color.fromArgb(255, j, k, m);
    return localColor3;
  }
  
  private zb a(zq paramzq, double[] paramArrayOfDouble, int paramInt)
  {
    zaca localzaca = null;
    if (this.b == null)
    {
      localzaca = d();
      b(localzaca);
    }
    if (this.b.b() != 3) {
      return null;
    }
    if (localzaca == null) {
      localzaca = d();
    }
    double d1 = a(this.a.getMaxCfvo(), localzaca).o();
    double d2 = a(this.a.getMinCfvo(), localzaca).o();
    a(localzaca);
    localzaca = null;
    double d3 = 0.0D;
    try
    {
      if (d1 == d2)
      {
        if (((zabb)this.b).o() >= d1) {
          d3 = 1.0D;
        } else {
          d3 = 0.0D;
        }
      }
      else {
        d3 = (float)((((zabb)this.b).o() - d2) / (d1 - d2));
      }
      int i = (int)(((this.a.getMaxColor().getA() & 0xFF) - (this.a.getMinColor().getA() & 0xFF)) * d3 + (this.a.getMinColor().getA() & 0xFF));
      int j = (int)(((this.a.getMaxColor().getR() & 0xFF) - (this.a.getMinColor().getR() & 0xFF)) * d3 + (this.a.getMinColor().getR() & 0xFF));
      int k = (int)(((this.a.getMaxColor().getG() & 0xFF) - (this.a.getMinColor().getG() & 0xFF)) * d3 + (this.a.getMinColor().getG() & 0xFF));
      int m = (int)(((this.a.getMaxColor().getB() & 0xFF) - (this.a.getMinColor().getB() & 0xFF)) * d3 + (this.a.getMinColor().getB() & 0xFF));
      Color localColor = Color.fromArgb(255, j, k, m);
      zb localzb = new zb();
      zp localzp = new zp(paramzq);
      localzp.a(new zu(localColor));
      localzb.a(localzp);
      return localzb;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private zb b(zq paramzq, double[] paramArrayOfDouble, int paramInt)
  {
    zaca localzaca = null;
    if (this.b == null)
    {
      localzaca = d();
      b(localzaca);
    }
    if (this.b.b() != 3) {
      return null;
    }
    if (localzaca == null) {
      localzaca = d();
    }
    double d1 = a(this.a.getMaxCfvo(), localzaca).o();
    double d2 = a(this.a.getMinCfvo(), localzaca).o();
    double d3 = a(this.a.getMidCfvo(), localzaca).o();
    a(localzaca);
    localzaca = null;
    double d4 = 0.0D;
    try
    {
      Color localColor1 = this.a.getMaxColor();
      Color localColor2 = this.a.getMinColor();
      Color localColor3 = Color.getEmpty();
      double d5 = ((zabb)this.b).o();
      if (d5 > d1)
      {
        localColor3 = Color.a(255, localColor1);
      }
      else if (d5 < d2)
      {
        localColor3 = Color.a(255, localColor2);
      }
      else
      {
        if (d5 >= d3)
        {
          if ((d3 != d2) || (d5 != d2))
          {
            localColor2 = this.a.getMidColor();
            if ((d3 > d2) && (d3 < d1)) {
              d2 = d3;
            }
          }
        }
        else
        {
          localColor1 = this.a.getMidColor();
          if (d3 < d1) {
            d1 = d3;
          }
        }
        if (d1 == d2)
        {
          if (d3 <= d1) {
            d4 = 1.0D;
          } else {
            d4 = 0.0D;
          }
        }
        else {
          d4 = (float)((d5 - d2) / (d1 - d2));
        }
        int i = (int)(((localColor1.getR() & 0xFF) - (localColor2.getR() & 0xFF)) * d4 + (localColor2.getR() & 0xFF));
        int j = (int)(((localColor1.getG() & 0xFF) - (localColor2.getG() & 0xFF)) * d4 + (localColor2.getG() & 0xFF));
        int k = (int)(((localColor1.getB() & 0xFF) - (localColor2.getB() & 0xFF)) * d4 + (localColor2.getB() & 0xFF));
        localColor3 = Color.fromArgb(255, i, j, k);
      }
      zb localzb = new zb();
      zp localzp = new zp(paramzq);
      localzp.a(new zu(localColor3));
      localzb.a(localzp);
      return localzb;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public zb a(zq paramzq, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      if (!this.a.a()) {
        return a(paramzq, paramArrayOfDouble, paramInt2);
      }
      return b(paramzq, paramArrayOfDouble, paramInt2);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public ArrayList a(zq paramzq)
  {
    return null;
  }
  
  public boolean c()
  {
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */