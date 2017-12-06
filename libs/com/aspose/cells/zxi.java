package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.ze;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zu;

class zxi
{
  private int a;
  private zg b = null;
  private zadr c;
  private zbwm d;
  
  zadr a()
  {
    if (this.c == null) {
      this.c = new zadr();
    }
    return this.c;
  }
  
  zbwm b()
  {
    if (this.d == null) {
      this.d = new zbwm();
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
    this.b = new zg(paramInt, paramColor1, paramColor2);
  }
  
  public zc a(zxk paramzxk, ze paramze, float paramFloat1, float paramFloat2)
    throws Exception
  {
    switch (this.a)
    {
    case 0: 
      return this.c.a(paramzxk, paramze, paramFloat1, paramFloat2);
    case 1: 
    case 2: 
      return a(paramze, false, 1.0F);
    }
    return new zu(Color.getWhite());
  }
  
  public zc a(zq paramzq)
    throws Exception
  {
    ze localze = new ze();
    localze.b(paramzq);
    return a(localze, false, 1.0F);
  }
  
  public zc a(ze paramze, boolean paramBoolean, float paramFloat)
    throws Exception
  {
    return a(paramze, null, paramBoolean, paramFloat);
  }
  
  public zc a(ze paramze, zs paramzs, boolean paramBoolean, float paramFloat)
    throws Exception
  {
    switch (this.a)
    {
    case 0: 
      return a().a(paramze, null, paramBoolean, paramFloat);
    case 2: 
      Color localColor1 = Color.fromArgb(this.b.c().getA() & 0xFF, (int)((this.b.c().getR() & 0xFF) * paramFloat), (int)((this.b.c().getG() & 0xFF) * paramFloat), (int)((this.b.c().getB() & 0xFF) * paramFloat));
      Color localColor2 = Color.fromArgb(this.b.b().getA() & 0xFF, (int)((this.b.b().getR() & 0xFF) * paramFloat), (int)((this.b.b().getG() & 0xFF) * paramFloat), (int)((this.b.b().getB() & 0xFF) * paramFloat));
      return new zg(this.b.d(), localColor1, localColor2);
    case 1: 
      return b().a(paramze, paramFloat);
    }
    return new zu(Color.getWhite());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */