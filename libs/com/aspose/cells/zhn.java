package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import java.util.Iterator;

class zhn
  implements zaha
{
  private int a;
  private int b;
  private Workbook c;
  private zbzv d;
  private int e;
  private zbst f;
  private boolean g;
  private boolean h;
  private int i;
  private byte[] j;
  private boolean k;
  private int[] l;
  private int m;
  private boolean n;
  private int[] o;
  private int[] p;
  private zgs q = new zgs();
  private Cells r;
  private boolean s;
  private boolean t;
  private boolean u;
  private zt v;
  private zt w;
  private int x;
  private int y;
  private boolean z = true;
  private int A;
  private int B;
  private int C;
  
  zhn(Workbook paramWorkbook, SaveOptions paramSaveOptions)
  {
    this.c = paramWorkbook;
    WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
    int i1;
    if (localWorksheetCollection.C().a())
    {
      i1 = 1;
      this.d = ((zbzv)paramWorkbook.getWorksheets().C());
    }
    else
    {
      this.d = null;
      i1 = 0;
      this.g = false;
      this.k = false;
    }
    if (localWorksheetCollection.g.d())
    {
      this.n = true;
      this.f = ((zbst)localWorksheetCollection.g);
    }
    else
    {
      this.n = false;
      this.f = null;
    }
    int i2 = 1048575;
    int i3 = 16383;
    this.e = paramSaveOptions.getSaveFormat();
    switch (this.e)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 16: 
      if (i1 != 0)
      {
        this.g = true;
        this.k = (this.d.a(paramSaveOptions.a(), 1) > 0);
      }
      Iterator localIterator = localWorksheetCollection.getNames().iterator();
      while (localIterator.hasNext())
      {
        Name localName = (Name)localIterator.next();
        localName.g(localName.k().replace('\025', '_'));
      }
      break;
    case 5: 
      i2 = 65535;
      i3 = 255;
      if (i1 != 0)
      {
        this.g = true;
        this.k = (this.d.a(paramSaveOptions.a(), 1) > 0);
      }
      break;
    case 12: 
    case 17: 
      if (i1 != 0)
      {
        this.g = false;
        this.k = (this.d.a(paramSaveOptions.a(), 0) > 0);
      }
      break;
    case 1: 
    case 11: 
    case 13: 
    case 20: 
    case 21: 
    case 22: 
    case 30: 
      this.n = false;
      if (i1 != 0)
      {
        this.g = false;
        this.k = false;
      }
      break;
    case 2: 
    case 3: 
    case 4: 
    case 10: 
    case 14: 
    case 15: 
    case 18: 
    case 19: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    default: 
      if (i1 != 0)
      {
        this.g = false;
        this.k = true;
      }
      break;
    }
    this.a = i2;
    this.b = (i3 + 1);
    if (this.n)
    {
      int i4;
      if (!this.f.f())
      {
        this.n = false;
        for (i4 = paramWorkbook.getWorksheets().getCount() - 1; i4 > -1; i4--) {
          if (paramWorkbook.getWorksheets().get(i4).getCells().getPreserveString())
          {
            this.n = true;
            break;
          }
        }
      }
      if (this.n)
      {
        this.o = new int[this.f.a()];
        this.p = new int[this.o.length];
        for (i4 = 0; i4 < this.p.length; i4++) {
          this.p[i4] = i4;
        }
      }
    }
    if (this.k)
    {
      this.l = this.d.e();
      if (this.l == null) {
        this.k = false;
      } else {
        this.m = this.l[0];
      }
    }
    this.h = false;
    if (this.g)
    {
      this.j = this.d.f();
      if (this.j == null)
      {
        this.g = false;
      }
      else
      {
        this.i = (this.j[0] & 0xFF);
        if (this.i == 0)
        {
          this.h = true;
          this.i = (this.j[15] & 0xFF);
        }
        this.i = c(this.i);
      }
    }
  }
  
  public boolean a(zt paramzt, int paramInt)
  {
    if (this.v != paramzt)
    {
      this.v = paramzt;
      b();
    }
    this.x = paramInt;
    d();
    return false;
  }
  
  zadm a()
  {
    zadm localzadm = null;
    if ((!this.n) && (!this.k) && (!this.g)) {
      return null;
    }
    Object localObject2;
    zaiv localzaiv1;
    for (int i1 = this.c.getWorksheets().getCount() - 1; i1 > -1; i1--)
    {
      this.r = this.c.getWorksheets().get(i1).getCells();
      this.s = this.r.getPreserveString();
      if (this.g)
      {
        this.t = ((this.i & 0x3) == 0);
        this.u = ((this.i & 0xC) == 0);
        this.A = this.i;
      }
      if ((this.k) || (this.h))
      {
        localObject1 = this.r.getColumns();
        if (((ColumnCollection)localObject1).a != null) {
          a(((ColumnCollection)localObject1).a);
        }
        for (int i3 = ((ColumnCollection)localObject1).getCount() - 1; i3 > -1; i3--) {
          a(((ColumnCollection)localObject1).getColumnByIndex(i3));
        }
      }
      if (this.g)
      {
        if (!this.t)
        {
          if (localzadm == null)
          {
            localzadm = new zadm(this.c, this.e);
            localzadm.g = new boolean[localzadm.d];
            zc.a(localzadm.g, 0, localzadm.d, false);
          }
          else if (localzadm.g == null)
          {
            localzadm.g = new boolean[localzadm.d];
            zc.a(localzadm.g, 0, localzadm.d, false);
          }
          localzadm.g[i1] = true;
        }
        if (!this.u)
        {
          if (localzadm == null)
          {
            localzadm = new zadm(this.c, this.e);
            localzadm.h = new boolean[localzadm.d];
            zc.a(localzadm.h, 0, localzadm.d, false);
          }
          else if (localzadm.h == null)
          {
            localzadm.h = new boolean[localzadm.d];
            zc.a(localzadm.h, 0, localzadm.d, false);
          }
          localzadm.h[i1] = true;
        }
      }
      if ((this.n) || (this.g)) {
        this.r.c = new zlt(this.r, 16383);
      }
      Object localObject1 = this.r.e();
      localObject2 = ((zv)localObject1).b();
      this.B = -1;
      for (;;)
      {
        this.x = ((zaiv)localObject2).a();
        if (this.x < 0) {
          break;
        }
        this.v = ((zv)localObject1).f(this.x);
        b();
        if (this.v.a() > 0)
        {
          localzaiv1 = this.v.b();
          for (;;)
          {
            this.x = localzaiv1.a();
            if (this.x < 0) {
              break;
            }
            d();
          }
        }
        c();
      }
      if (this.g)
      {
        this.r.l();
        if (((this.A & 0x2) == 0) && ((this.i & 0x1) != 0) && (this.B > -1) && (this.B < this.a)) {
          this.w.a(1, zbdx.f(this.w.l(1), true));
        }
      }
      else if (this.n)
      {
        this.r.l();
      }
    }
    if (!this.n) {
      return localzadm;
    }
    if (this.f.a() != this.p.length) {
      this.p = new int[this.f.a()];
    }
    i1 = this.f.a(this.o, this.p, null);
    if (i1 > 0) {
      for (int i2 = this.c.getWorksheets().getCount() - 1; i2 > -1; i2--)
      {
        this.r = this.c.getWorksheets().get(i2).getCells();
        localObject2 = this.r.e();
        localzaiv1 = ((zv)localObject2).b();
        for (;;)
        {
          int i4 = localzaiv1.a();
          if (i4 >= 0)
          {
            zt localzt = ((zv)localObject2).f(i4);
            if ((localzt.a() > 0) && (!localzt.d()))
            {
              zaiv localzaiv2 = localzt.b();
              for (;;)
              {
                i4 = localzaiv2.a();
                if (i4 < 0) {
                  break;
                }
                if (localzt.h(i4) == 4)
                {
                  int i5 = localzt.j(i4);
                  if (i5 != this.p[i5])
                  {
                    localzt.k(i4, this.p[i5]);
                    i1--;
                    if (i1 == 0) {
                      break;
                    }
                  }
                }
              }
              if (i1 == 0) {
                break;
              }
            }
          }
        }
      }
    }
    return localzadm;
  }
  
  private void a(Column paramColumn)
  {
    int i1 = paramColumn.c();
    if ((this.k) && (i1 > this.m))
    {
      i1 = this.l[i1];
      paramColumn.c(i1);
    }
    if ((this.g) && (i1 > -1))
    {
      int i2 = c(this.j[i1] & 0xFF);
      if (this.t) {
        this.t = ((i2 & 0x5) == 0);
      }
      if (this.u) {
        this.u = ((i2 & 0xA) == 0);
      }
    }
  }
  
  private void b()
  {
    this.y = -1;
    this.z = true;
    if (this.k)
    {
      this.y = Row.e(this.v);
      this.z = false;
      if (this.y > this.m)
      {
        this.y = this.l[this.y];
        this.v.k(this.y);
      }
    }
    if (this.h)
    {
      if (this.v.i() != this.B + 1)
      {
        this.B = this.v.i();
        this.w = null;
        if (this.i != 0)
        {
          if (this.v.a() == this.b)
          {
            this.A = 0;
          }
          else
          {
            this.A = this.i;
            this.A &= 0xC;
            if (((this.i & 0x4) == 0) && (this.B > 0) && ((this.i & 0x1) != 0)) {
              this.A |= 0xC;
            }
          }
        }
        else {
          this.A = 0;
        }
      }
      else
      {
        this.B += 1;
        this.A <<= 2;
      }
      if ((this.A & 0xF) != 15)
      {
        if (this.z)
        {
          this.y = Row.e(this.v);
          this.z = false;
        }
        b(this.y < 0 ? 15 : this.y);
      }
    }
  }
  
  private void c()
  {
    if (this.g)
    {
      if (((this.A & 0x8) != 0) && (this.w != null))
      {
        b1 = this.w.l(1);
        if (!zbdx.h(b1)) {
          this.w.a(1, zbdx.f(b1, true));
        }
      }
      byte b1 = zbdx.g(this.v.l(1));
      if ((this.A & 0x6) != 0)
      {
        b1 = zbdx.e(b1, (this.A & 0x4) != 0);
        b1 = zbdx.f(b1, (this.A & 0x2) != 0);
        this.v.a(1, b1);
      }
      this.w = this.v;
    }
  }
  
  private void d()
  {
    this.C = -1;
    if (this.n)
    {
      zgs localzgs;
      switch (this.v.h(this.x))
      {
      case 4: 
        localzgs = null;
        int i3 = 0;
        zbbj localzbbj1;
        int i1;
        if ((this.k) || (this.h))
        {
          localzgs = this.v.a(this.x, this.q, 7);
          this.C = localzgs.b;
          if ((this.k) && (this.C > this.m))
          {
            this.C = this.l[this.C];
            localzgs.b = this.C;
            i3 = 1;
          }
          if ((this.h) && ((this.A & 0xF) != 15))
          {
            if (this.C < 0) {
              a(localzgs.a);
            }
            b(this.C);
          }
          localzbbj1 = (zbbj)localzgs.d;
          i1 = localzbbj1.e;
        }
        else
        {
          i1 = this.v.j(this.x);
          localzbbj1 = this.f.a[this.p[i1]];
        }
        if (localzbbj1.f())
        {
          zbdd localzbdd = (zbdd)localzbbj1;
          if (!localzbdd.j())
          {
            if (localzgs == null) {
              this.C = this.v.g(this.x);
            }
            if (this.C < 0)
            {
              if (this.z)
              {
                this.y = Row.e(this.v);
                this.z = false;
              }
              if (this.y < 0)
              {
                this.C = this.r.g(localzgs == null ? this.v.a(this.x) : localzgs.a);
                if (this.C < 0) {
                  this.C = 15;
                }
              }
              else
              {
                this.C = this.y;
              }
            }
            localzbbj1 = this.f.a(localzbdd, this.d.c(this.C).getFont().m(), this.c.getWorksheets());
            if (localzbbj1.e != localzbdd.e)
            {
              if (i3 != 0)
              {
                this.v.b(this.x, localzgs, 6);
                i3 = 0;
              }
              else
              {
                this.v.k(this.x, localzbbj1.e);
              }
              this.p[i1] = localzbbj1.e;
            }
          }
        }
        if (i3 != 0) {
          this.v.j(this.x, localzgs.b);
        }
        this.o[localzbbj1.e] += 1;
        break;
      case 0: 
      case 3: 
        e();
        break;
      case 1: 
      case 2: 
      default: 
        if (this.s)
        {
          int i2 = 0;
          localzgs = this.v.a(this.x, this.q, 7);
          this.C = localzgs.b;
          if (this.C < 0)
          {
            a(localzgs.a);
          }
          else if ((this.k) && (this.C > this.m))
          {
            this.C = this.l[this.C];
            localzgs.b = this.C;
            i2 = 1;
          }
          if ((this.h) && ((this.A & 0xF) != 15)) {
            b(this.C);
          }
          Style localStyle = this.d.c(this.C);
          zbbj localzbbj2 = this.f.a(Cell.a(this.r, localStyle, localzgs));
          if (localzbbj2.e < this.o.length) {
            this.o[localzbbj2.e] += 1;
          }
          if (localzgs.c == 5) {
            this.r.a.b(((zaai)localzgs.d).a);
          }
          localzgs.c = 4;
          localzgs.d = localzbbj2;
          if (i2 != 0) {
            this.v.b(this.x, localzgs, 6);
          } else {
            this.v.b(this.x, localzgs);
          }
        }
        else
        {
          e();
        }
        break;
      }
    }
    else
    {
      e();
    }
  }
  
  private void a(int paramInt)
  {
    if (this.z)
    {
      this.y = Row.e(this.v);
      this.z = false;
    }
    if (this.y < 0)
    {
      this.C = this.r.g(paramInt);
      if (this.C < 0) {
        this.C = 15;
      }
    }
    else
    {
      this.C = this.y;
    }
  }
  
  private void e()
  {
    if (this.h)
    {
      zgs localzgs = this.v.a(this.x, this.q, 3);
      this.C = localzgs.b;
      if (this.C < 0)
      {
        a(localzgs.a);
      }
      else if ((this.k) && (this.C > this.m))
      {
        this.C = this.l[this.C];
        this.v.j(this.x, this.C);
      }
      b(this.C);
    }
    else if (this.k)
    {
      this.C = this.v.g(this.x);
      if (this.C > this.m)
      {
        this.C = this.l[this.C];
        this.v.j(this.x, this.C);
      }
    }
  }
  
  private void b(int paramInt)
  {
    this.A |= this.j[paramInt];
  }
  
  private int c(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      paramInt |= 0xC;
    } else if ((paramInt & 0x4) != 0) {
      paramInt |= 0x3;
    }
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zhn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */