package com.aspose.cells;

import com.aspose.cells.a.d.zs;
import com.aspose.cells.b.a.b.a.za;
import com.aspose.cells.b.a.b.a.zd;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;

class zanr
  implements zaip
{
  private zjf a;
  private int b;
  private Color c;
  private zaoa d;
  private int e = 1;
  private boolean f;
  private boolean g = true;
  private zaml h;
  private zado i;
  private boolean j = true;
  
  zanr(zjf paramzjf, int paramInt)
  {
    this.a = paramzjf;
    this.b = paramInt;
    this.c = Color.getEmpty();
    this.d = new zaoa();
    this.f = false;
  }
  
  zjf e()
  {
    return this.a;
  }
  
  public Color a()
  {
    if (this.e == 0) {
      return Color.getEmpty();
    }
    return this.c;
  }
  
  public void a(Color paramColor)
  {
    this.c = paramColor;
  }
  
  public zaml f()
  {
    return this.h;
  }
  
  public void a(zaml paramzaml)
  {
    this.h = paramzaml;
  }
  
  public zaoa g()
  {
    return this.d;
  }
  
  public void a(zaoa paramzaoa)
  {
    this.d = paramzaoa;
  }
  
  public zaiq b()
  {
    return this.d;
  }
  
  public boolean h()
  {
    return this.e != 0;
  }
  
  double i()
  {
    if (c() == 0) {
      return 0.0D;
    }
    if ((b().a() >= 0.0D) && (b().a() * 72.0D / zbxp.a() < 0.25D)) {
      return 0.25D * zbxp.a() / 72.0D;
    }
    return b().a();
  }
  
  public int c()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    if (paramInt != 3) {
      this.i = null;
    }
    this.e = paramInt;
  }
  
  zado j()
  {
    return this.i;
  }
  
  void a(zado paramzado)
  {
    this.i = paramzado;
  }
  
  public zaih d()
  {
    if (this.i == null)
    {
      this.i = new zado();
      a(3);
    }
    return this.i;
  }
  
  public boolean a(zanr paramzanr)
  {
    if (h() != paramzanr.h()) {
      return false;
    }
    if ((h()) && (paramzanr.h()))
    {
      if (c() != paramzanr.c()) {
        return false;
      }
      if (c() == 3)
      {
        if (!j().a(paramzanr.j())) {
          return false;
        }
      }
      else
      {
        if (!a().equals(paramzanr.a())) {
          return false;
        }
        if (!this.d.a(paramzanr.g())) {
          return false;
        }
      }
    }
    return true;
  }
  
  public boolean b(zanr paramzanr)
  {
    if (h() != paramzanr.h()) {
      return false;
    }
    if ((h()) && (paramzanr.h()))
    {
      if (c() != paramzanr.c()) {
        return false;
      }
      if (c() == 3)
      {
        if (!j().a(paramzanr.j())) {
          return false;
        }
      }
      else
      {
        if (!a().equals(paramzanr.a())) {
          return false;
        }
        if (!this.d.b(paramzanr.g())) {
          return false;
        }
      }
    }
    return true;
  }
  
  int k()
  {
    return this.b;
  }
  
  public boolean l()
  {
    return this.g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  void b(Color paramColor)
  {
    if (((this.g) && (this.e != 0)) || (this.e == 1)) {
      a(paramColor);
    }
    if (this.e == 2)
    {
      if ((f() != null) && (f().i())) {
        a(paramColor);
      }
    }
    else if (this.e == 3)
    {
      zadu localzadu = j().c();
      for (int k = 0; k < localzadu.getCount(); k++)
      {
        zadt localzadt = localzadu.b(k);
        if ((localzadt.b() != null) && (localzadt.b().i())) {
          localzadt.a(zkn.a(e().az(), paramColor, localzadt.b()));
        }
      }
    }
  }
  
  boolean m()
  {
    if (((this.g) && (this.e != 0)) || (this.e == 1)) {
      return false;
    }
    if (this.e == 2)
    {
      if ((f() != null) && (f().i())) {
        return true;
      }
    }
    else if (this.e == 3)
    {
      zadu localzadu = j().c();
      for (int k = 0; k < localzadu.getCount(); k++)
      {
        zadt localzadt = localzadu.b(k);
        if ((localzadt.b() != null) && (localzadt.b().i())) {
          return true;
        }
      }
    }
    return false;
  }
  
  void n()
  {
    if (!this.j) {
      return;
    }
    if (!this.g) {
      return;
    }
    switch (this.b)
    {
    case 0: 
    case 2: 
    case 4: 
    case 5: 
    case 13: 
      if (this.a.R() <= 32)
      {
        this.c = this.a.Z().a().a("tx1");
        this.c = this.a.Z().a().a(this.c, 0.75D);
        this.c = Color.a(255, this.c);
      }
      else
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = this.a.Z().a().a(this.c, 0.75D);
        this.c = Color.a(255, this.c);
      }
      break;
    case 3: 
      if (this.a.R() <= 32)
      {
        this.c = this.a.Z().a().a("tx1");
        this.c = this.a.Z().a().a(this.c, 0.5D);
        this.c = Color.a(255, this.c);
      }
      else if (this.a.R() <= 40)
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = this.a.Z().a().a(this.c, 0.5D);
        this.c = Color.a(255, this.c);
      }
      else
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = this.a.Z().a().a(this.c, 0.9D);
        this.c = Color.a(255, this.c);
      }
      break;
    case 16: 
    case 17: 
      if (this.a.R() <= 16)
      {
        this.c = this.a.Z().a().a("tx1");
        this.c = Color.a(255, this.c);
      }
      else if (this.a.R() <= 32)
      {
        this.c = Color.getEmpty();
      }
      else if (this.a.R() <= 34)
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = Color.a(255, this.c);
      }
      else if (this.a.R() <= 40)
      {
        int k = this.a.R() - 34;
        this.c = this.a.Z().a().a("accent" + k);
        this.c = this.a.Z().a().b(this.c, 0.25D);
        this.c = Color.a(255, this.c);
      }
      else
      {
        this.c = Color.getEmpty();
      }
      break;
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
      if (this.a.R() <= 32)
      {
        this.c = this.a.Z().a().a("tx1");
        this.c = Color.a(255, this.c);
      }
      else if (this.a.R() <= 34)
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = Color.a(255, this.c);
      }
      else if (this.a.R() <= 40)
      {
        this.c = this.a.Z().a().a("dk1");
        this.c = Color.a(255, this.c);
      }
      else
      {
        this.c = this.a.Z().a().a("lt1");
        this.c = Color.a(255, this.c);
      }
      break;
    case 8: 
    case 9: 
      break;
    case 1: 
    case 10: 
    case 11: 
    case 12: 
    case 14: 
    case 15: 
      this.c = Color.getEmpty();
      break;
    case 6: 
      this.c = Color.getEmpty();
      break;
    }
    this.j = false;
  }
  
  void c(zanr paramzanr)
  {
    this.j = paramzanr.j;
    this.g = paramzanr.g;
    this.c = paramzanr.c;
    a((zaoa)paramzanr.g().l());
    this.e = paramzanr.e;
    if (paramzanr.j() != null)
    {
      a(new zado());
      j().b(paramzanr.j());
    }
    this.f = paramzanr.f;
  }
  
  public Object o()
  {
    zanr localzanr = new zanr(this.a, this.b);
    n();
    localzanr.a(a());
    localzanr.a(l());
    localzanr.a((zaoa)g().l());
    localzanr.a(c());
    localzanr.a(this.i);
    return localzanr;
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    a(new zo(paramFloat1, paramFloat2), new zo(paramFloat3, paramFloat4));
  }
  
  void a(zo paramzo1, zo paramzo2)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.a(paramzo1, paramzo2);
    a(localze);
  }
  
  void a(zp paramzp)
  {
    zq localzq = new zq(paramzp.c(), paramzp.d(), paramzp.e(), paramzp.f());
    a(localzq);
  }
  
  void a(zq paramzq)
  {
    com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
    localze.b(paramzq);
    a(localze);
  }
  
  void a(com.aspose.cells.b.a.b.a.ze paramze)
  {
    n();
    if (!p()) {
      return;
    }
    com.aspose.cells.b.a.b.a.ze localze = paramze.f();
    zs localzs = b(localze);
    this.a.ap().a(localzs, paramze);
    localzs.dispose();
  }
  
  zs b(com.aspose.cells.b.a.b.a.ze paramze)
  {
    n();
    if (!p()) {
      return new zs(Color.getEmpty());
    }
    zs localzs1 = q();
    switch (c())
    {
    case 3: 
      if (d() != null)
      {
        zc localzc = j().a(paramze, localzs1, false, 1.0F);
        zs localzs2 = new zs(localzc, (float)i());
        a(localzs2);
        return localzs2;
      }
      return localzs1;
    }
    return localzs1;
  }
  
  private zs q()
  {
    if (!p()) {
      return new zs(Color.getEmpty());
    }
    zs localzs = new zs(a(), (float)i());
    a(localzs);
    return localzs;
  }
  
  private void a(zs paramzs)
  {
    float f1 = (float)b().a();
    zaoa localzaoa = g();
    switch (b().c())
    {
    case 2: 
      paramzs.a(2);
      break;
    }
    switch (localzaoa.b())
    {
    case 6: 
      paramzs.b(0);
      break;
    case 5: 
      paramzs.b(2);
      break;
    case 7: 
      paramzs.b(5);
      if (f1 < 1.25F) {
        paramzs.b(new float[] { 3.0F * f1, 1.2F * f1 });
      } else {
        paramzs.b(new float[] { 3.0F, 1.0F });
      }
      break;
    case 0: 
      paramzs.b(5);
      paramzs.b(new float[] { 4.0F, 3.0F });
      break;
    case 1: 
      paramzs.b(5);
      paramzs.b(new float[] { 4.0F, 3.0F, 1.0F, 3.0F });
      break;
    case 2: 
      paramzs.b(5);
      paramzs.b(new float[] { 8.0F, 3.0F });
      break;
    case 3: 
      paramzs.b(5);
      paramzs.b(new float[] { 8.0F, 3.0F, 1.0F, 3.0F });
      break;
    case 4: 
      paramzs.b(5);
      paramzs.b(new float[] { 8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F });
      break;
    }
    switch (localzaoa.d())
    {
    case 4: 
      paramzs.a(new float[] { 0.0F, 0.33333334F, 0.6666667F, 1.0F });
      break;
    case 2: 
      paramzs.a(new float[] { 0.0F, 0.2F, 0.4F, 1.0F });
      break;
    case 3: 
      paramzs.a(new float[] { 0.0F, 0.6F, 0.8F, 1.0F });
      break;
    case 1: 
      paramzs.a(new float[] { 0.0F, 0.16666667F, 0.33333334F, 0.6666667F, 0.8333333F, 1.0F });
      break;
    }
    a(paramzs, localzaoa);
  }
  
  private void a(zs paramzs, zaoa paramzaoa)
  {
    if (paramzaoa.f() != 0) {
      a(paramzs, paramzaoa.f(), paramzaoa.g(), paramzaoa.h(), true);
    } else if (b().c() == 2) {
      paramzs.e(2);
    }
    if (paramzaoa.i() != 0) {
      a(paramzs, paramzaoa.i(), paramzaoa.j(), paramzaoa.k(), false);
    } else if (b().c() == 2) {
      paramzs.c(2);
    }
    switch (paramzaoa.e())
    {
    case 2: 
      paramzs.d(1);
      break;
    case 3: 
      paramzs.d(0);
      break;
    case 1: 
      paramzs.d(2);
      break;
    }
  }
  
  private void a(zs paramzs, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (paramInt2 == 0)
    {
      if (paramzs.p() <= 2.0F) {
        f1 = 4.0F;
      } else if (paramzs.p() < 3.0F) {
        f1 = 3.5F;
      } else if (paramzs.p() < 4.0F) {
        f1 = 3.0F;
      } else if (paramzs.p() < 5.0F) {
        f1 = 2.5F;
      } else {
        f1 = 2.0F;
      }
    }
    else if (paramInt2 == 1)
    {
      if (paramzs.p() <= 2.0F) {
        f1 = 5.0F;
      } else if (paramzs.p() < 3.0F) {
        f1 = 4.5F;
      } else if (paramzs.p() < 4.0F) {
        f1 = 4.0F;
      } else if (paramzs.p() < 5.0F) {
        f1 = 3.5F;
      } else {
        f1 = 3.0F;
      }
    }
    else {
      f1 = 5.0F;
    }
    if (paramInt3 == 0)
    {
      if (paramzs.p() <= 2.0F) {
        f2 = 4.0F;
      } else if (paramzs.p() < 3.0F) {
        f2 = 3.5F;
      } else if (paramzs.p() < 4.0F) {
        f2 = 3.0F;
      } else if (paramzs.p() < 5.0F) {
        f2 = 2.5F;
      } else {
        f2 = 2.0F;
      }
    }
    else if (paramInt3 == 1)
    {
      if (paramzs.p() <= 2.0F) {
        f2 = 5.0F;
      } else if (paramzs.p() < 3.0F) {
        f2 = 4.5F;
      } else if (paramzs.p() < 4.0F) {
        f2 = 4.0F;
      } else if (paramzs.p() < 5.0F) {
        f2 = 3.5F;
      } else {
        f2 = 3.0F;
      }
    }
    else {
      f2 = 5.0F;
    }
    za localza;
    switch (paramInt1)
    {
    case 1: 
      localza = new za(f1, f2);
      if (paramBoolean) {
        paramzs.b(localza);
      } else {
        paramzs.a(localza);
      }
      break;
    case 3: 
      if (paramBoolean) {
        paramzs.e(19);
      } else {
        paramzs.c(19);
      }
      break;
    case 5: 
      com.aspose.cells.b.a.b.a.ze localze = new com.aspose.cells.b.a.b.a.ze();
      localze.a(new zo(f1 / 2.0F, -f2), new zo(0.0F, 0.0F));
      localze.a(new zo(-f1 / 2.0F, -f2), new zo(0.0F, 0.0F));
      com.aspose.cells.a.d.ze localze1 = new com.aspose.cells.a.d.ze(null, localze);
      localze1.a(0);
      localze1.b(2);
      localze1.a(2, 2);
      if (paramBoolean) {
        paramzs.b(localze1);
      } else {
        paramzs.a(localze1);
      }
      break;
    case 4: 
      if (paramBoolean) {
        paramzs.e(18);
      } else {
        paramzs.c(18);
      }
      break;
    case 2: 
      localza = new za(f1, f2);
      localza.a(0.9F);
      if (paramBoolean) {
        paramzs.b(localza);
      } else {
        paramzs.a(localza);
      }
      break;
    }
  }
  
  boolean p()
  {
    if (!h()) {
      return false;
    }
    if (i() <= 0.0D) {
      return false;
    }
    return (!a().isEmpty()) && (a().getA() != 0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zanr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */