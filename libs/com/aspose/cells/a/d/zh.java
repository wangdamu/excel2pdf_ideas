package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;

public class zh
  extends zn
  implements zbv
{
  private zbj d;
  private Color e;
  private Color f;
  private zo g;
  private String h;
  private zi i;
  private zp j;
  private zk k;
  private float l = 0.0F;
  public boolean a = false;
  public boolean b = false;
  public int c = 0;
  private float m = 0.0F;
  private float n = -1.0F;
  
  public zh() {}
  
  public zh(zbj paramzbj, Color paramColor, zo paramzo, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramzbj, paramColor, Color.getEmpty(), paramzo, paramString);
    this.b = paramBoolean2;
    this.a = paramBoolean1;
  }
  
  public zh(zbj paramzbj, Color paramColor, zo paramzo, float paramFloat, String paramString)
  {
    this.d = paramzbj;
    this.e = paramColor;
    this.f = Color.getEmpty();
    this.g = paramzo;
    this.h = paramString;
    this.l = paramFloat;
  }
  
  public zh(zbj paramzbj, Color paramColor1, Color paramColor2, zo paramzo, String paramString)
  {
    this.d = paramzbj;
    this.e = paramColor1;
    this.f = paramColor2;
    this.g = paramzo;
    this.h = paramString;
  }
  
  public zh(zbj paramzbj, Color paramColor, zo paramzo, String paramString)
  {
    this.d = paramzbj;
    this.e = paramColor;
    this.f = Color.getEmpty();
    this.g = paramzo;
    this.h = paramString;
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
    if (this.c != 0)
    {
      zp localzp = null;
      float f1;
      if (this.m != 0.0F) {
        f1 = this.m;
      } else {
        f1 = l() + i().b();
      }
      float f2;
      switch (this.c)
      {
      case 1: 
      case 3: 
        if (!(paramzf instanceof zbh))
        {
          f2 = d().k().h() / 25.4F;
          if (d().d()) {
            f2 *= 1.65F;
          }
          localzp = zp.a(new zo(l(), k() - f2 / 2.0F), new zo(f1, k() - f2 / 2.0F));
          localzp.a(new zx(e()));
          localzp.a(a());
          localzp.d().b = f2;
          localzp.a(paramzf);
          localzp = null;
        }
        break;
      case 2: 
      case 4: 
        f2 = d().k().h() / 15.0F;
        localzp = zp.a(new zo(l(), g().e() + f2), new zo(f1, g().e() + f2));
        zx localzx = new zx(e());
        localzp.a(localzx);
        localzp.a(a());
        localzp.d().b = f2;
        localzp.a(paramzf);
        localzp = zp.a(new zo(l(), g().e() + 2.0F * f2 + (f2 > 1.0F ? f2 : 1.0F)), new zo(f1, g().e() + 2.0F * f2 + (f2 > 1.0F ? f2 : 1.0F)));
        localzp.a(a());
        localzp.a(localzx);
        localzp.d().b = f2;
        localzp.a(paramzf);
      }
    }
  }
  
  public zbj d()
  {
    return this.d;
  }
  
  public void a(zbj paramzbj)
  {
    this.d = paramzbj;
  }
  
  public Color e()
  {
    return this.e;
  }
  
  public void a(Color paramColor)
  {
    this.e = paramColor;
  }
  
  public Color f()
  {
    return this.f;
  }
  
  public zo g()
  {
    return this.g;
  }
  
  public void a(zo paramzo)
  {
    this.g = paramzo;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public void a(String paramString)
  {
    this.h = paramString;
  }
  
  public zi a()
  {
    return this.i;
  }
  
  public void a(zi paramzi)
  {
    this.i = paramzi;
  }
  
  public zp b()
  {
    return this.j;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public zt i()
    throws Exception
  {
    zt localzt = zbj.b(this.h, this.d);
    return localzt;
  }
  
  public zt j()
  {
    zt localzt = zbj.a(this.h, this.d);
    return localzt;
  }
  
  public float k()
  {
    return this.g.e() + this.d.i();
  }
  
  public float l()
  {
    return this.g.d();
  }
  
  public zk m()
  {
    return this.k;
  }
  
  public float n()
  {
    return this.l;
  }
  
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  public void b(float paramFloat)
  {
    this.n = paramFloat;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */