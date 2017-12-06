package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;

class zbfp
  extends zco
{
  zbfp(zr paramzr, float paramFloat1, float paramFloat2, zbnh paramzbnh)
  {
    super(paramzr, paramFloat1, paramFloat2, paramzbnh);
  }
  
  void a()
  {
    if (!this.e.n().a())
    {
      zs localzs = zbya.a(this.e.n());
      double d1 = this.e.n().f();
      double d2 = 0.0D;
      switch (this.e.n().g())
      {
      case 1: 
      case 2: 
        d2 = 0.0D;
        break;
      case 5: 
        d2 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d2 = 0.0D;
        break;
      case 3: 
        d2 = 0.0D;
      }
      double d3 = 0.0D;
      switch (this.e.n().j())
      {
      case 1: 
      case 2: 
        d3 = 0.0D;
        break;
      case 5: 
        d3 = d1 * 0.6000000238418579D;
        break;
      case 4: 
        d3 = 0.0D;
        break;
      case 3: 
        d3 = 0.0D;
      }
      zo localzo1;
      zo localzo2;
      if (this.e.f() == 0.0F)
      {
        localzo1 = new zo(this.e.G().f() + this.e.G().h() / 2.0F, this.e.G().g());
        localzo2 = new zo(this.e.G().f() + this.e.G().h() / 2.0F, this.e.l().m());
        if ((this.e.a == 1) || (this.e.a == 4))
        {
          localzo1.b(localzo1.e() + (float)d2);
          localzo2.b(localzo2.e() - (float)d3);
          this.a.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.b(localzo2.e() - (float)d2);
          localzo1.b(localzo1.e() + (float)d3);
          this.a.a(localzs, localzo2, localzo1);
        }
      }
      else if (this.e.g() == 0.0F)
      {
        localzo1 = new zo(this.e.h(), this.e.i() + this.e.G().i() / 2.0F);
        localzo2 = new zo(this.e.h() + this.e.f(), this.e.i() + this.e.G().i() / 2.0F);
        if ((this.e.a == 1) || (this.e.a == 2))
        {
          localzo1.a(localzo1.d() + (float)d2);
          localzo2.a(localzo2.d() - (float)d3);
          this.a.a(localzs, localzo1, localzo2);
        }
        else
        {
          localzo2.a(localzo2.d() - (float)d2);
          localzo1.a(localzo1.d() + (float)d3);
          this.a.a(localzs, localzo2, localzo1);
        }
      }
      else
      {
        double d4 = Math.sqrt(Math.pow(this.e.f(), 2.0D) + Math.pow(this.e.g(), 2.0D));
        double d5 = this.e.f() * d2 / d4;
        double d6 = this.e.g() * d2 / d4;
        double d7 = this.e.f() * d3 / d4;
        double d8 = this.e.g() * d3 / d4;
        zo localzo3 = new zo(this.e.G().f(), this.e.G().g());
        zo localzo4 = new zo(this.e.G().f(), this.e.G().g() + this.e.g());
        zo localzo5 = new zo(this.e.G().f() + this.e.f(), this.e.G().g() + this.e.g());
        zo localzo6 = new zo(this.e.G().f() + this.e.f(), this.e.G().g());
        if (this.e.a == 1)
        {
          localzo3.a(localzo3.d() + (float)d5);
          localzo3.b(localzo3.e() + (float)d6);
          localzo5.a(localzo5.d() - (float)d7);
          localzo5.b(localzo5.e() - (float)d8);
          this.a.a(localzs, localzo3, localzo5);
          this.e.i = localzo3;
          this.e.j = localzo5;
        }
        else if (this.e.a == 2)
        {
          localzo4.a(localzo4.d() + (float)d5);
          localzo4.b(localzo4.e() - (float)d6);
          localzo6.a(localzo6.d() - (float)d7);
          localzo6.b(localzo6.e() + (float)d8);
          this.a.a(localzs, localzo4, localzo6);
          this.e.i = localzo4;
          this.e.j = localzo6;
        }
        else if (this.e.a == 3)
        {
          localzo5.a(localzo5.d() - (float)d5);
          localzo5.b(localzo5.e() - (float)d6);
          localzo3.a(localzo3.d() + (float)d7);
          localzo3.b(localzo3.e() + (float)d8);
          this.a.a(localzs, localzo5, localzo3);
          this.e.i = localzo5;
          this.e.j = localzo3;
        }
        else
        {
          localzo6.a(localzo6.d() - (float)d5);
          localzo6.b(localzo6.e() + (float)d6);
          localzo4.a(localzo4.d() + (float)d7);
          localzo4.b(localzo4.e() - (float)d8);
          this.a.a(localzs, localzo6, localzo4);
          this.e.i = localzo6;
          this.e.j = localzo4;
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */