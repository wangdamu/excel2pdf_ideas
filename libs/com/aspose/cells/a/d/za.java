package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;

public class za
  extends zn
{
  private zo a;
  private zt b;
  private float c;
  private float d;
  
  public zo a()
  {
    return c((float)zcm.a(-e()));
  }
  
  public zy[] b()
  {
    float f1 = -e();
    float f2 = -f();
    float f3 = 45.0F;
    if (f2 < 0.0F) {
      f3 = -f3;
    }
    int i = (int)(f2 / f3) + 1;
    i = Math.min(i, 8);
    zy[] arrayOfzy = new zy[i];
    float f4 = f1;
    for (int j = 0; j < i; j++)
    {
      float f5 = Math.signum(f3) * Math.min(Math.abs(f3), Math.abs(f1 + f2 - f4));
      arrayOfzy[j] = a(f4, f5);
      f4 += f5;
    }
    return arrayOfzy;
  }
  
  private zy a(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = (float)zcm.a(paramFloat1);
    paramFloat2 = (float)zcm.a(paramFloat2);
    float f1 = d(paramFloat1);
    float f2 = d(paramFloat1 + paramFloat2);
    float f3 = f2 - f1;
    float f4 = f3 / 2.0F;
    float f5 = (float)(Math.sin(f3) * (Math.sqrt(4.0D + 3.0D * Math.pow(Math.tan(f4), 2.0D)) - 1.0D) / 3.0D);
    zy localzy = new zy();
    localzy.a(c(paramFloat1));
    localzy.d(c(paramFloat1 + paramFloat2));
    localzy.b(new zo(localzy.a().d() - f5 * g().b() * (float)Math.sin(f1), localzy.a().e() - f5 * g().c() * (float)Math.cos(f1)));
    localzy.c(new zo(localzy.d().d() + f5 * g().b() * (float)Math.sin(f2), localzy.d().e() + f5 * g().c() * (float)Math.cos(f2)));
    return localzy;
  }
  
  private zo c(float paramFloat)
  {
    float f = d(paramFloat);
    return new zo(h().d() + g().b() * (float)Math.cos(f), h().e() - g().c() * (float)Math.sin(f));
  }
  
  private float d(float paramFloat)
  {
    return (float)Math.atan2(1.0F / g().c() * Math.sin(paramFloat), 1.0F / g().b() * Math.cos(paramFloat));
  }
  
  public zo c()
  {
    return this.a;
  }
  
  public void a(zo paramzo)
  {
    this.a = paramzo;
  }
  
  public zt d()
  {
    return this.b;
  }
  
  public void a(zt paramzt)
  {
    this.b = paramzt;
  }
  
  public float e()
  {
    return this.c;
  }
  
  public void a(float paramFloat)
  {
    this.c = paramFloat;
  }
  
  public float f()
  {
    return this.d;
  }
  
  public void b(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public zt g()
  {
    return new zt(d().b() / 2.0F, d().c() / 2.0F);
  }
  
  public zo h()
  {
    return new zo(c().d() + g().b(), c().e() + g().c());
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/za.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */