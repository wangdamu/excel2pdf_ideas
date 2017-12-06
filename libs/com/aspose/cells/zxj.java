package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;

class zxj
{
  private int a;
  private zbwn b;
  private zg c = null;
  private zads d;
  private zxl e;
  
  public zxj(zxl paramzxl)
  {
    this.e = paramzxl;
    this.b = new zbwn();
  }
  
  zbwn a()
  {
    if (this.b == null) {
      this.b = new zbwn();
    }
    return this.b;
  }
  
  zads b()
  {
    if (this.d == null) {
      this.d = new zads();
    }
    return this.d;
  }
  
  int c()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  void a(Color paramColor1, Color paramColor2, int paramInt)
  {
    this.a = 2;
    this.c = new zg(paramInt, paramColor1, paramColor2);
  }
  
  public zc a(zq paramzq)
    throws Exception
  {
    ze localze = new ze();
    localze.b(paramzq);
    return a(localze, null, false, 1.0F);
  }
  
  public zc a(ze paramze, zs paramzs, boolean paramBoolean, float paramFloat)
    throws Exception
  {
    switch (this.a)
    {
    case 0: 
      return b().a(paramze, paramzs, paramBoolean, paramFloat);
    case 2: 
      Color localColor1 = Color.fromArgb(this.c.c().getA() & 0xFF, (int)((this.c.c().getR() & 0xFF) * paramFloat), (int)((this.c.c().getG() & 0xFF) * paramFloat), (int)((this.c.c().getB() & 0xFF) * paramFloat));
      Color localColor2 = Color.fromArgb(this.c.b().getA() & 0xFF, (int)((this.c.b().getR() & 0xFF) * paramFloat), (int)((this.c.b().getG() & 0xFF) * paramFloat), (int)((this.c.b().getB() & 0xFF) * paramFloat));
      return new zg(this.c.d(), localColor1, localColor2);
    case 1: 
      return a().a(paramze, paramFloat);
    }
    return new zu(Color.getWhite());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */