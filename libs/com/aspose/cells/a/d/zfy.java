package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zs;

public class zfy
{
  static String[] a = { "courier", "courier new", "courier oblique", "courier new italic", "courier bold", "courier new bold", "courier bold oblique", "courier new bold italic", "helvetica", "arial", "helvetica oblique", "arial italic", "helvetica bold", "arial bold", "helvetica bold oblique", "arial bold italic", "times roman", "times new roman", "times italic", "times new roman italic", "times bold", "times new roman bold", "times bold italic", "times new roman bold italic", "symbol", "zapfdingbats" };
  private zdz b;
  private zfu c;
  private boolean d;
  private boolean e;
  private zo f;
  private zo g;
  private String h;
  private float i = 0.0F;
  
  private zfy() {}
  
  public zfy(zdz paramzdz, zfu paramzfu)
  {
    this.b = paramzdz;
    this.c = paramzfu;
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    if (paramzh.d().f())
    {
      this.b.j().a(this.c);
      this.b.j().c(paramzh.d().k().h() / 25.4F, this.c);
      localStringBuilder.setLength(0);
      zgd.a(paramzh.e(), localStringBuilder);
      localStringBuilder.append(" RG");
      this.c.c(zs.a(localStringBuilder));
      localStringBuilder.setLength(0);
      zgd.a(paramzh.l(), localStringBuilder);
      localStringBuilder.append(' ');
      zgd.a(paramzh.k() - paramzh.j().c() / 2.0F, localStringBuilder);
      localStringBuilder.append(" m");
      this.c.c(zs.a(localStringBuilder));
      localStringBuilder.setLength(0);
      zgd.a(paramzh.l() + paramzh.j().b(), localStringBuilder);
      localStringBuilder.append(' ');
      zgd.a(paramzh.k() - paramzh.j().c() / 2.0F, localStringBuilder);
      localStringBuilder.append(" l");
      this.c.c(zs.a(localStringBuilder));
      this.c.c("S");
      this.b.j().b(this.c);
    }
    a();
    zbj localzbj = paramzh.d();
    boolean bool = this.b.b().e();
    if ((this.b.b().a == 1) && (bool) && (zga.a(localzbj.a(), paramzh.h()))) {
      bool = false;
    }
    if (localzbj.j().y()) {
      bool = false;
    }
    if (this.b.b().u()) {
      bool = true;
    }
    zep localzep = null;
    localzep = this.b.c().a(localzbj.a(), localzbj.c(), bool);
    if (this.b.i() != null) {
      localzep.b(this.b.i().n());
    }
    this.i = paramzh.n();
    if ((!paramzh.b) && (!paramzh.a)) {
      this.c.c(" 0 Ts");
    }
    a(localzep, localzbj.b());
    a(localzep, paramzh);
    int j = ((paramzh.f() != null) && (!paramzh.f().isEmpty())) || (localzep.e()) ? 1 : 0;
    float f1;
    if (j == 0)
    {
      if ((this.d) || (this.b.j().b().f() != paramzh.e()) || (this.b.j().b().l() != 0)) {
        d();
      }
      a(0);
      this.b.j().a(paramzh.e(), false, this.c);
    }
    else
    {
      d();
      if (!paramzh.e().isEmpty())
      {
        a(2);
        this.b.j().a(paramzh.e(), false, this.c);
      }
      else
      {
        a(1);
      }
      if (localzep.e())
      {
        f1 = paramzh.d().b() / 35.0F;
        localStringBuilder.setLength(0);
        zgd.a(f1, localStringBuilder);
        localStringBuilder.append(" w");
        this.c.c(zs.a(localStringBuilder));
        Color localColor = !paramzh.e().isEmpty() ? paramzh.e() : paramzh.f();
        this.b.j().a(localColor, true, this.c);
      }
      else
      {
        localStringBuilder.setLength(0);
        zgd.a(0.5F, localStringBuilder);
        localStringBuilder.append(" w");
        this.c.c(zs.a(localStringBuilder));
        this.b.j().a(paramzh.f(), true, this.c);
      }
    }
    if (paramzh.b)
    {
      f1 = paramzh.d().k().h() * 0.1F;
      localStringBuilder.setLength(0);
      localStringBuilder.append('-');
      zgd.a(f1, localStringBuilder);
      localStringBuilder.append(" Ts");
      this.c.c(zs.a(localStringBuilder));
    }
    if (paramzh.a)
    {
      f1 = paramzh.d().k().h() * 0.6F;
      localStringBuilder.setLength(0);
      zgd.a(f1, localStringBuilder);
      localStringBuilder.append(" Ts");
      this.c.c(zs.a(localStringBuilder));
    }
    a(paramzh, localzep, bool);
    this.g.a(this.g.d() + paramzh.i().b());
    this.d = false;
    b();
  }
  
  public void a()
    throws Exception
  {
    this.c.c("BT");
    this.d = true;
    this.h = "Tj";
  }
  
  public void b()
    throws Exception
  {
    d();
    this.c.c("ET");
  }
  
  private void a(zep paramzep, zh paramzh)
    throws Exception
  {
    if ((this.d) || (paramzep.d()) || (this.b.j().b().j().d()))
    {
      d();
      b(paramzep, paramzh);
      return;
    }
    if (zo.a(paramzh.g(), this.g)) {
      return;
    }
    d();
    float f1 = paramzh.g().d() - this.f.d();
    float f2 = paramzh.g().e() - this.f.e();
    StringBuilder localStringBuilder;
    if (f2 == this.b.j().b().i())
    {
      if (paramzh.g().d() == this.f.d())
      {
        this.h = "'";
      }
      else
      {
        localStringBuilder = new StringBuilder(32);
        zgd.a(f1, localStringBuilder);
        localStringBuilder.append(' ');
        zgd.a(-f2, localStringBuilder);
        localStringBuilder.append(" Td");
        this.c.c(zs.a(localStringBuilder));
      }
    }
    else if (paramzh.g().d() == this.f.d())
    {
      this.b.j().a(f2, this.c);
      this.h = "'";
    }
    else
    {
      localStringBuilder = new StringBuilder(32);
      zgd.a(f1, localStringBuilder);
      localStringBuilder.append(' ');
      zgd.a(-f2, localStringBuilder);
      localStringBuilder.append(" TD");
      this.c.c(zs.a(localStringBuilder));
      this.b.j().b().c(f2);
    }
    this.f = new zo(paramzh.g().d(), paramzh.g().e());
    this.g = new zo(paramzh.g().d(), paramzh.g().e());
  }
  
  private void a(int paramInt)
    throws Exception
  {
    d();
    this.b.j().a(paramInt, this.c);
    this.b.j().b(this.i, this.c);
  }
  
  private void a(zep paramzep, float paramFloat)
    throws Exception
  {
    d();
    this.b.j().a(paramzep, paramFloat, this.c);
  }
  
  private void b(zep paramzep, zh paramzh)
    throws Exception
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    float f3 = paramzep.d() ? 0.34906587F : 0.0F;
    float f4 = -1.0F;
    float f5 = paramzh.g().d();
    float f6 = paramzh.g().e();
    this.c.a(f1, f2, f3, f4, f5, f6, "Tm");
    this.f = new zo(paramzh.g().d(), paramzh.g().e());
    this.g = new zo(paramzh.g().d(), paramzh.g().e());
  }
  
  private void a(zh paramzh, zep paramzep, boolean paramBoolean)
    throws Exception
  {
    c();
    if (paramBoolean) {
      a(paramzh, (zgc)paramzep);
    } else {
      a(paramzh, (zga)paramzep);
    }
  }
  
  private void c()
    throws Exception
  {
    if (this.e) {
      return;
    }
    this.c.a("(");
    this.e = true;
  }
  
  private void d()
    throws Exception
  {
    if (!this.e) {
      return;
    }
    this.c.c(") " + this.h);
    this.h = "Tj";
    this.e = false;
  }
  
  private void a(zh paramzh, zga paramzga)
    throws Exception
  {
    paramzga.a(paramzh.h());
    this.c.d(paramzh.h());
  }
  
  private void a(zh paramzh, zgc paramzgc)
    throws Exception
  {
    byte[] arrayOfByte = paramzgc.a(paramzh.h());
    this.c.a(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */