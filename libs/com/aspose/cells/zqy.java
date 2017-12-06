package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zqy
  implements zahx
{
  private zjy j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private boolean v;
  private String w = "";
  private boolean x;
  private String y;
  private zbda z;
  zq a;
  zq b;
  private int A = 0;
  private String B = "";
  private boolean C = false;
  private boolean D = false;
  private int E = 0;
  private boolean F = true;
  zs c = zs.a();
  zo d = zo.a();
  zo e = zo.a();
  zo f = zo.a();
  double g;
  boolean h = false;
  double i = 0.0D;
  private boolean G = false;
  private static final za H = new za(new String[] { ", ", ". ", "; ", " ", "\n" });
  
  zqy(zjf paramzjf, Object paramObject, int paramInt)
  {
    this.j = new zjy(paramzjf, paramObject, paramInt, 14);
    this.k = false;
    this.l = false;
    this.m = false;
    this.n = false;
    this.o = false;
    this.p = false;
    this.q = 0;
    this.r = 0;
    this.s = 0;
    this.t = 1;
    this.u = 1;
    this.y = null;
    this.v = true;
    this.z = new zbda();
  }
  
  zjy a()
  {
    return this.j;
  }
  
  public zahm b()
  {
    return this.j;
  }
  
  boolean c()
  {
    if ((s() != null) && (s().length() > 0)) {
      return true;
    }
    return (i()) || (d()) || (f()) || (h()) || (g());
  }
  
  public boolean d()
  {
    return this.l;
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public boolean e()
  {
    return this.m;
  }
  
  public void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean f()
  {
    return this.n;
  }
  
  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public boolean g()
  {
    return this.o;
  }
  
  public void d(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public void e(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public boolean i()
  {
    return this.p;
  }
  
  public void f(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public int j()
  {
    if ((!a().q()) || (!a().p())) {
      return 9;
    }
    return this.q;
  }
  
  public void a(int paramInt)
  {
    this.q = paramInt;
  }
  
  public int k()
  {
    return this.A;
  }
  
  public void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  public int l()
  {
    return this.r;
  }
  
  public void c(int paramInt)
  {
    this.r = paramInt;
  }
  
  public String m()
  {
    if ((l() == 0) || (this.B == null) || ("".equals(this.B)))
    {
      int i1 = a().y();
      if (((i1 == 35) || (i1 == 44)) && (d()) && (f()) && (!h()) && (!g())) {
        return "\n";
      }
      return ", ";
    }
    return this.B;
  }
  
  public void a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
    {
      c(0);
    }
    else
    {
      switch (H.a(paramString))
      {
      case 0: 
        c(2);
        break;
      case 1: 
        c(4);
        break;
      case 2: 
        c(3);
        break;
      case 3: 
        c(1);
        break;
      case 4: 
        c(5);
        break;
      default: 
        c(6);
      }
      if (paramString.length() > 255) {
        this.B = paramString.substring(0, 255);
      } else {
        this.B = paramString;
      }
    }
  }
  
  public int n()
  {
    return this.s;
  }
  
  public void d(int paramInt)
  {
    this.s = paramInt;
  }
  
  public int o()
  {
    return this.t;
  }
  
  public void e(int paramInt)
  {
    this.t = paramInt;
  }
  
  public int q()
  {
    return this.u;
  }
  
  public void f(int paramInt)
  {
    this.u = paramInt;
  }
  
  public boolean r()
  {
    return this.C;
  }
  
  public void g(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public boolean t()
  {
    return this.D;
  }
  
  public void h(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }
  
  int v()
  {
    if (r()) {
      return 1;
    }
    if (t()) {
      return 2;
    }
    return 0;
  }
  
  public int w()
  {
    return this.E;
  }
  
  public void g(int paramInt)
  {
    this.E = paramInt;
  }
  
  public String p()
  {
    if (this.w.indexOf("E+") > 0) {
      return zw.a(this.w, "E+", "E");
    }
    if (this.w.indexOf("e+") > 0) {
      return zw.a(this.w, "e+", "e");
    }
    return this.w;
  }
  
  public void b(String paramString)
  {
    this.w = paramString;
  }
  
  public boolean x()
  {
    return this.v;
  }
  
  public void i(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public boolean y()
  {
    return this.x;
  }
  
  public String s()
  {
    return this.y;
  }
  
  public void c(String paramString)
  {
    this.y = paramString;
  }
  
  boolean z()
  {
    if ((s() != null) && (!"".equals(s()))) {
      return true;
    }
    if (h()) {
      return true;
    }
    if (d()) {
      return true;
    }
    if (g()) {
      return true;
    }
    zbfd localzbfd = null;
    if ((this.j.b() instanceof zbfd)) {
      localzbfd = (zbfd)this.j.b();
    } else if ((this.j.b() instanceof zkf)) {
      localzbfd = ((zkf)this.j.b()).g().a();
    }
    if ((localzbfd != null) && (localzbfd.av()) && (f())) {
      return true;
    }
    return (localzbfd != null) && (localzbfd.ax()) && (i());
  }
  
  public zaiz u()
  {
    return this.z;
  }
  
  public boolean A()
  {
    return zbxz.b(s());
  }
  
  boolean B()
  {
    return this.z.getCount() > 0;
  }
  
  boolean C()
  {
    if (!h()) {
      return false;
    }
    if (d()) {
      return false;
    }
    if (g()) {
      return false;
    }
    zbfd localzbfd = null;
    if ((this.j.b() instanceof zbfd)) {
      localzbfd = (zbfd)this.j.b();
    } else if ((this.j.b() instanceof zkf)) {
      localzbfd = ((zkf)this.j.b()).g().a();
    }
    if ((localzbfd != null) && (localzbfd.av()) && (f())) {
      return false;
    }
    return (localzbfd == null) || (!localzbfd.ax()) || (!i());
  }
  
  int D()
  {
    int i1 = 0;
    zbfd localzbfd = null;
    if ((this.j.b() instanceof zbfd)) {
      localzbfd = (zbfd)this.j.b();
    } else if ((this.j.b() instanceof zkf)) {
      localzbfd = ((zkf)this.j.b()).g().a();
    }
    if (localzbfd == null) {
      i1 = 27;
    } else if (localzbfd.an()) {
      i1 = 27;
    } else {
      i1 = E();
    }
    return i1;
  }
  
  int E()
  {
    int i1 = 0;
    float f1 = 0.0F;
    if (a().h().h() <= 6.0F) {
      f1 = 0.6F;
    } else {
      f1 = 0.465F;
    }
    if (a().h() != null) {
      i1 = zbxz.c(a().D() * f1);
    } else {
      return 0;
    }
    if (i1 < 3) {
      return 3;
    }
    return i1;
  }
  
  int F()
  {
    int i1 = 0;
    if (a().h() != null) {
      i1 = zbxz.c(a().D());
    } else {
      return 0;
    }
    return i1;
  }
  
  public boolean G()
  {
    return this.F;
  }
  
  public void j(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }
  
  boolean H()
  {
    return (this.g > -4.71238898038469D) && (this.g < -1.5707963267948966D);
  }
  
  boolean I()
  {
    double d1 = 0.008697830681563268D;
    return ((this.g < d1) && (this.g > -3.141592653589793D)) || (this.g < -6.283185307179586D + d1);
  }
  
  int J()
  {
    double d1 = this.g * 180.0D / 3.141592653589793D;
    if (((d1 < -292.5D) && (d1 >= -337.5D)) || ((d1 < 67.5D) && (d1 >= 22.5D))) {
      return 1;
    }
    if (((d1 < -337.5D) && (d1 >= -360.0D)) || ((d1 < 22.5D) && (d1 >= -22.5D))) {
      return 2;
    }
    if ((d1 < -22.5D) && (d1 >= -67.5D)) {
      return 3;
    }
    if ((d1 < -67.5D) && (d1 >= -112.5D)) {
      return 4;
    }
    if ((d1 < -112.5D) && (d1 >= -157.5D)) {
      return 5;
    }
    if ((d1 < -157.5D) && (d1 >= -202.5D)) {
      return 6;
    }
    if ((d1 < -202.5D) && (d1 >= -247.5D)) {
      return 7;
    }
    return 8;
  }
  
  protected void finalize()
    throws Exception
  {
    k(false);
  }
  
  public void dispose()
  {
    k(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void k(boolean paramBoolean)
  {
    if (!this.G)
    {
      if (paramBoolean)
      {
        if (this.j != null) {
          this.j.dispose();
        }
        if (this.z != null) {
          for (int i1 = 0; i1 < this.z.getCount(); i1++)
          {
            zbcz localzbcz = this.z.b(i1);
            if (localzbcz != null) {
              localzbcz.dispose();
            }
          }
        }
      }
      this.G = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */