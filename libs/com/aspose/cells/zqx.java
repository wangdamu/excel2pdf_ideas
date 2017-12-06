package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;

class zqx
  implements zahx
{
  private zjx j;
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
  private boolean v = true;
  private String w = "";
  private boolean x;
  private String y;
  private zbda z = new zbda();
  zq a;
  zq b;
  zq c;
  private int A = 0;
  private String B = "";
  private boolean C = false;
  private boolean D = false;
  private int E = 0;
  private boolean F = true;
  zo d = zo.a();
  zo e = zo.a();
  zo f = zo.a();
  double g;
  boolean h = false;
  double i = 0.0D;
  private boolean G = false;
  private static final za H = new za(new String[] { ", ", ". ", "; ", " ", "\n" });
  
  zqx(zje paramzje, Object paramObject, int paramInt)
  {
    this.j = new zjx(paramzje, paramObject, paramInt);
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
    this.z = new zbda();
  }
  
  zjx a()
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
    if ((!this.j.q()) || (!this.j.r())) {
      return 9;
    }
    return this.q;
  }
  
  public void a(int paramInt)
  {
    this.q = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  public int k()
  {
    return this.r;
  }
  
  public void c(int paramInt)
  {
    this.r = paramInt;
  }
  
  public String l()
  {
    if ((k() == 0) || (this.B == null) || ("".equals(this.B)))
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
  
  public int m()
  {
    return this.s;
  }
  
  public void d(int paramInt)
  {
    this.s = paramInt;
  }
  
  public int n()
  {
    return this.t;
  }
  
  public void e(int paramInt)
  {
    this.t = paramInt;
  }
  
  public int o()
  {
    return this.u;
  }
  
  public void f(int paramInt)
  {
    this.u = paramInt;
  }
  
  public void g(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }
  
  public void h(boolean paramBoolean)
  {
    this.D = paramBoolean;
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
  
  public boolean q()
  {
    return this.v;
  }
  
  public void i(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public boolean r()
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
  
  boolean t()
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
    zbfc localzbfc = null;
    if ((this.j.b() instanceof zbfc)) {
      localzbfc = (zbfc)this.j.b();
    } else if ((this.j.b() instanceof zke)) {
      localzbfc = ((zke)this.j.b()).g().a();
    }
    if ((localzbfc != null) && (localzbfc.as()) && (f())) {
      return true;
    }
    return (localzbfc != null) && (localzbfc.av()) && (i());
  }
  
  public zaiz u()
  {
    return this.z;
  }
  
  public boolean v()
  {
    return zbxz.b(s());
  }
  
  boolean w()
  {
    return this.z.getCount() > 0;
  }
  
  boolean x()
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
    zbfc localzbfc = null;
    if ((this.j.b() instanceof zbfc)) {
      localzbfc = (zbfc)this.j.b();
    } else if ((this.j.b() instanceof zke)) {
      localzbfc = ((zke)this.j.b()).g().a();
    }
    if ((localzbfc != null) && (localzbfc.as()) && (f())) {
      return false;
    }
    return (localzbfc == null) || (!localzbfc.av()) || (!i());
  }
  
  int y()
  {
    int i1 = 0;
    zbfc localzbfc = null;
    if ((this.j.b() instanceof zbfc)) {
      localzbfc = (zbfc)this.j.b();
    } else if ((this.j.b() instanceof zke)) {
      localzbfc = ((zke)this.j.b()).g().a();
    }
    if (localzbfc == null) {
      i1 = 27;
    } else if (localzbfc.al()) {
      i1 = 27;
    } else {
      i1 = D();
    }
    return i1;
  }
  
  private int D()
  {
    int i1 = 0;
    float f1 = 0.0F;
    if (a().h().h() <= 6.0F) {
      f1 = 0.6F;
    } else {
      f1 = 0.465F;
    }
    if (a().h() != null) {
      i1 = zbxz.c(a().C() * f1);
    } else {
      return 0;
    }
    if (i1 < 3) {
      return 3;
    }
    return i1;
  }
  
  int z()
  {
    int i1 = 0;
    if (a().h() != null) {
      i1 = zbxz.c(a().C());
    } else {
      return 0;
    }
    return i1;
  }
  
  public void j(boolean paramBoolean)
  {
    this.F = paramBoolean;
  }
  
  boolean A()
  {
    return (this.g > -4.71238898038469D) && (this.g < -1.5707963267948966D);
  }
  
  boolean B()
  {
    double d1 = 0.008697830681563268D;
    return ((this.g < d1) && (this.g > -3.141592653589793D)) || (this.g < -6.283185307179586D + d1);
  }
  
  int C()
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */