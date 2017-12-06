package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;

public class zq
  extends zd
{
  private zo a;
  private boolean b = false;
  private boolean c;
  
  public zq() {}
  
  public zq(zo paramzo)
  {
    this.a = paramzo;
    this.b = true;
  }
  
  public zo a()
  {
    return this.a;
  }
  
  public void a(zo paramzo)
  {
    this.a = paramzo;
    this.b = true;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
    super.a(paramzf);
    paramzf.b(this);
  }
  
  public static zq a(zo[] paramArrayOfzo, boolean paramBoolean)
  {
    zq localzq = new zq();
    localzq.a(paramBoolean);
    if (paramArrayOfzo.length < 2)
    {
      localzq.a(new zo(0.0F, 0.0F));
      return localzq;
    }
    localzq.a(paramArrayOfzo[0]);
    localzq.c(paramArrayOfzo);
    return localzq;
  }
  
  public static zq a(zo[] paramArrayOfzo)
  {
    zq localzq = new zq();
    localzq.a(false);
    if (paramArrayOfzo.length < 4) {
      return localzq;
    }
    localzq.a(paramArrayOfzo[0]);
    localzq.b(paramArrayOfzo);
    return localzq;
  }
  
  public void b(zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo.length < 4) {
      return;
    }
    if (!this.b)
    {
      this.a = paramArrayOfzo[0];
      this.b = true;
    }
    int i = paramArrayOfzo.length;
    for (int j = 0; j < i - 3; j += 3)
    {
      zy localzy = new zy();
      localzy.a(paramArrayOfzo[(j + 0)]);
      localzy.b(paramArrayOfzo[(j + 1)]);
      localzy.c(paramArrayOfzo[(j + 2)]);
      localzy.d(paramArrayOfzo[(j + 3)]);
      zt localzt = new zt();
      localzt.a(localzy);
      a(localzt);
    }
  }
  
  public void c(zo[] paramArrayOfzo)
  {
    if (paramArrayOfzo.length < 2) {
      return;
    }
    if (!this.b)
    {
      this.a = paramArrayOfzo[0];
      this.b = true;
    }
    float[] arrayOfFloat = new float[(paramArrayOfzo.length - 1) * 2];
    for (int i = 0; i < paramArrayOfzo.length - 1; i++)
    {
      arrayOfFloat[(i * 2)] = paramArrayOfzo[(i + 1)].d();
      arrayOfFloat[(i * 2 + 1)] = paramArrayOfzo[(i + 1)].e();
    }
    zu localzu = new zu(arrayOfFloat);
    a(localzu);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */