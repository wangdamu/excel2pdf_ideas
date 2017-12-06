package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zazs
  extends zayp
{
  private zaiw[] a;
  private int[] b;
  private int c = -2;
  private int d = -2;
  private int e = -1;
  
  public zazs(zabk paramzabk, zaca paramzaca, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    a(paramzabk.G(), paramzaca, localArrayList, paramBoolean);
    a(paramzabk.H(), paramzaca, localArrayList, paramBoolean);
    if (localArrayList.size() > 0)
    {
      int i = 0;
      this.a = new zaiw[localArrayList.size()];
      this.b = new int[this.a.length];
      for (int j = 0; j < this.a.length; j++)
      {
        this.a[j] = ((zaiw)localArrayList.get(j));
        i += this.a[j].e();
        this.b[j] = i;
      }
    }
    else
    {
      this.a = null;
      this.b = null;
      this.d = -1;
      this.c = -1;
    }
  }
  
  zazs(zazs paramzazs, zaca paramzaca)
  {
    this.a = new zaiw[paramzazs.a.length];
    for (int i = 0; i < this.a.length; i++) {
      this.a[i] = paramzazs.a[i].b(paramzaca);
    }
    this.b = paramzazs.b;
    this.c = paramzazs.c;
    this.d = paramzazs.d;
    this.e = paramzazs.e;
  }
  
  public zaiw b(zaca paramzaca)
  {
    return new zazs(this, paramzaca);
  }
  
  public int c()
  {
    return this.b == null ? 0 : this.b[(this.b.length - 1)];
  }
  
  public int d()
  {
    return 1;
  }
  
  public int e()
  {
    return c();
  }
  
  public boolean l()
  {
    return c() < 2;
  }
  
  public boolean m()
  {
    return c() < 2;
  }
  
  public boolean n()
  {
    return true;
  }
  
  public zaie a(int paramInt1, int paramInt2)
  {
    if (this.b == null) {
      return null;
    }
    if ((this.b.length == 1) && (this.b[0] == 1)) {
      return this.a[0].a(0, 0);
    }
    for (int i = 0; i < this.b.length; i++) {
      if (paramInt1 < this.b[i])
      {
        int j = i > 0 ? paramInt1 - this.b[(i - 1)] : paramInt1;
        return this.a[i].a(j / this.a[i].d(), j % this.a[i].d());
      }
    }
    return null;
  }
  
  public int b()
  {
    return 5;
  }
  
  public void f()
  {
    if (this.a == null) {
      return;
    }
    this.e = 0;
    this.a[0].f();
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {
      paramInt1++;
    }
    return a(paramInt1);
  }
  
  public boolean a(int paramInt)
  {
    for (int i = 0; i < this.b.length; i++) {
      if (paramInt < this.b[i])
      {
        int j = i > 0 ? paramInt - this.b[(i - 1)] : paramInt;
        this.a[i].f();
        return this.a[i].b(j / this.a[i].d(), j % this.a[i].d());
      }
    }
    return false;
  }
  
  public boolean g()
  {
    if (this.e < 0) {
      return false;
    }
    if (this.a[this.e].g()) {
      return true;
    }
    this.e += 1;
    if (this.e < this.a.length)
    {
      this.a[this.e].f();
      if (this.a[this.e].g()) {
        return true;
      }
      do
      {
        this.e += 1;
        if (this.e >= this.a.length) {
          break;
        }
        this.a[this.e].f();
      } while (!this.a[this.e].g());
      return true;
    }
    this.e = -1;
    return false;
  }
  
  public zaie h()
  {
    if (this.e < 0) {
      return null;
    }
    return this.a[this.e].h();
  }
  
  public int i()
  {
    if (this.e < 0) {
      return -1;
    }
    int i = this.a[this.e].i() * this.a[this.e].d() + this.a[this.e].j();
    return this.e > 0 ? this.b[(this.e - 1)] + i : i;
  }
  
  public int j()
  {
    return 0;
  }
  
  public int k()
  {
    return i();
  }
  
  public zaiw b(int paramInt)
  {
    return new zbak(a(paramInt, 0));
  }
  
  public zaiw c(int paramInt)
  {
    return this;
  }
  
  public boolean a()
  {
    for (int i = 0; i < this.a.length; i++) {
      if (!this.a[i].a()) {
        return false;
      }
    }
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    for (int i = 0; i < this.a.length; i++) {
      this.a[i].a(paramBoolean);
    }
  }
  
  public boolean q()
  {
    return this.c > -2;
  }
  
  public int s()
  {
    if (this.c < -1) {
      C();
    }
    return this.c;
  }
  
  public int r()
  {
    if (this.d < -1) {
      C();
    }
    return this.d;
  }
  
  public int u()
  {
    return 0;
  }
  
  public int t()
  {
    return 0;
  }
  
  private void C()
  {
    for (int i = 0; i < this.a.length; i++)
    {
      zaiw localzaiw = this.a[i];
      this.d = localzaiw.r();
      if (this.d > -1)
      {
        localzaiw.b(this.d, 0);
        this.d = (this.d * localzaiw.d() + localzaiw.j());
        if (i > 0) {
          this.d += this.b[(i - 1)];
        }
        if (i < this.a.length - 1)
        {
          for (int j = this.a.length - 1; j > i; j--)
          {
            localzaiw = this.a[j];
            this.c = localzaiw.s();
            if (this.c > -1)
            {
              this.c *= localzaiw.d();
              this.c += localzaiw.u() + this.b[(j - 1)];
              return;
            }
          }
          localzaiw = this.a[i];
        }
        this.c = (this.d + localzaiw.u() - localzaiw.j());
        return;
      }
    }
    this.d = -1;
    this.c = -1;
  }
  
  private void a(zaie paramzaie, zaca paramzaca, ArrayList paramArrayList, boolean paramBoolean)
  {
    if (paramzaie != null)
    {
      Object localObject;
      if (paramzaie.a() == 16)
      {
        localObject = (zabk)paramzaie;
        a(((zabk)localObject).G(), paramzaca, paramArrayList, paramBoolean);
        a(((zabk)localObject).H(), paramzaca, paramArrayList, paramBoolean);
      }
      else
      {
        localObject = paramzaie.a(paramzaca, paramBoolean);
        if (((zaiw)localObject).e() > 0) {
          zf.a(paramArrayList, localObject);
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zazs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */