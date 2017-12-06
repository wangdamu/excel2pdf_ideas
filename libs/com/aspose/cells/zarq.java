package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zarq
{
  private zcjy b;
  private zasg c;
  private zash d;
  private zajl e;
  private int f;
  private int g;
  private int h;
  private Worksheet i;
  private Cells j;
  private zarv k;
  zatj a;
  private RowCollection l;
  private zv m;
  private zt n;
  private Row o;
  private int p;
  private int q;
  private int r;
  private zbdx s;
  private zbdx t;
  private zgs u = new zgs();
  private zgs v;
  private za w;
  private static final za x = new za(new String[] { "table-column", "table-row", "table-header-rows", "table-header-columns", "table-column-group", "table-row-group", "style-name", "number-columns-repeated", "default-cell-style-name", "visibility", "visible", "collapse", "filter", "table-cell", "covered-table-cell", "number-rows-repeated", "number-matrix-columns-spanned", "number-matrix-rows-spanned", "value-type", "time-value", "value", "date-value", "boolean-value", "number-columns-spanned", "number-rows-spanned", "formula", "boolean", "date", "time", "currency", "percentage", "float", "string", "span", "rect", "ellipse", "custom-shape", "frame", "p", "annotation", "a", "href" });
  
  zarq(zasg paramzasg)
  {
    this.c = paramzasg;
    this.e = paramzasg.b.getWorksheets().g;
    this.k = new zarv(paramzasg);
    this.a = new zatj(paramzasg);
  }
  
  void a(zcjy paramzcjy, zash paramzash)
    throws Exception
  {
    this.b = paramzcjy;
    this.d = paramzash;
    this.i = paramzash.a;
    this.j = this.i.getCells();
    this.g = (this.h = -1);
    this.f = 0;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    this.j.a(1024, 1024, 64);
    this.m = this.i.getCells().e();
    this.l = this.j.getRows();
    this.p = -1;
    this.q = -1;
    this.r = -1;
    this.n = null;
    this.o = null;
    this.s = null;
    this.w = null;
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (x.a(paramzcjy.q().toLowerCase()))
      {
      case 0: 
        c();
        break;
      case 1: 
        f();
        break;
      case 2: 
        d();
        break;
      case 3: 
        a();
        break;
      case 4: 
        b();
        break;
      case 5: 
        e();
        break;
      default: 
        paramzcjy.a();
      }
    }
    a(Integer.MAX_VALUE);
    this.m.a(-10, 0, 0, 0);
    this.j.f();
    this.j.a((short)this.r);
  }
  
  private void a()
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    while (zauz.a(this.b)) {
      switch (x.a(this.b.q().toLowerCase()))
      {
      case 0: 
        c();
        break;
      case 3: 
        a();
        break;
      case 4: 
        b();
        break;
      case 1: 
      case 2: 
      default: 
        this.b.a();
      }
    }
  }
  
  private void b()
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.f += 1;
    this.b.d();
    while (zauz.a(this.b)) {
      switch (x.a(this.b.q().toLowerCase()))
      {
      case 0: 
        c();
        break;
      case 3: 
        a();
        break;
      case 4: 
        b();
        break;
      case 1: 
      case 2: 
      default: 
        this.b.a();
      }
    }
    this.f -= 1;
  }
  
  private double a(double paramDouble)
  {
    int i1 = (int)(paramDouble * this.c.a / 72.0D);
    WorksheetCollection localWorksheetCollection = this.c.b.getWorksheets();
    return zlp.a(i1, localWorksheetCollection);
  }
  
  private void c()
    throws Exception
  {
    String str1 = null;
    int i1 = 1;
    String str2 = null;
    int i2 = 1;
    boolean bool = false;
    if (this.b.n()) {
      while (this.b.m()) {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 6: 
          str1 = this.b.t().toLowerCase();
          break;
        case 7: 
          i1 = zp.a(this.b.t());
          break;
        case 8: 
          str2 = this.b.t();
          break;
        case 9: 
          switch (x.a(this.b.t()))
          {
          case 10: 
            i2 = 1;
            break;
          case 11: 
            i2 = 0;
            bool = true;
            break;
          case 12: 
            i2 = 0;
            bool = false;
          }
          break;
        }
      }
    }
    this.b.a();
    double d1 = 64.8D;
    if (str1 != null)
    {
      zasa localzasa = (zasa)this.c.f.get(str1);
      if (localzasa != null) {
        d1 = localzasa.a();
      }
    }
    int i3 = 15;
    if (this.f > (this.j.r() & 0xFF)) {
      this.j.b((byte)this.f);
    }
    for (int i4 = 0; i4 < i1; i4++)
    {
      zarz localzarz = this.d.d(this.h + i4 + 1);
      i3 = localzarz.h;
      if ((i2 == 0) || (this.f != 0) || (Math.abs(d1 - this.d.f) > 1.0E-4D) || (i3 != 15))
      {
        Column localColumn = this.j.getColumns().get(this.h + i4 + 1);
        localColumn.setWidth(a(d1));
        localColumn.c(i3);
        localColumn.a((byte)this.f);
        localColumn.setHidden(i2 == 0);
        localColumn.c(bool);
      }
    }
    this.h += i1;
  }
  
  private void d()
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    while (zauz.a(this.b)) {
      switch (x.a(this.b.q().toLowerCase()))
      {
      case 1: 
        f();
        break;
      case 2: 
        d();
        break;
      case 5: 
        e();
        break;
      case 3: 
      case 4: 
      default: 
        this.b.a();
      }
    }
  }
  
  private void e()
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.f += 1;
    this.b.d();
    while (zauz.a(this.b)) {
      switch (x.a(this.b.q().toLowerCase()))
      {
      case 1: 
        f();
        break;
      case 2: 
        d();
        break;
      case 5: 
        e();
        break;
      case 3: 
      case 4: 
      default: 
        this.b.a();
      }
    }
    this.f -= 1;
  }
  
  private void a(int paramInt)
  {
    if (this.w == null) {
      return;
    }
    while (this.w.b != null) {
      this.w = this.w.b;
    }
    while (this.w.c.c.i() < paramInt)
    {
      this.w.c.c.g();
      this.w.c.c.l(0, 0);
      this.w = this.w.a;
      if (this.w == null) {
        break;
      }
      this.w.b = null;
    }
  }
  
  private void f()
    throws Exception
  {
    int i1 = 1;
    int i2 = -1;
    this.g += 1;
    a(this.g);
    if (this.s == null)
    {
      this.s = new zbdx();
      this.s.a(0, this.j);
      this.t = new zbdx();
    }
    this.s.a = this.g;
    this.t.a(this.s);
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i2 };
    a(arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i2 = arrayOfInt2[0];
    if (this.b.o())
    {
      this.b.a();
    }
    else
    {
      this.h = -1;
      this.q = -1;
      this.b.d();
      while (zauz.a(this.b)) {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 13: 
          a(i1, i2, false);
          break;
        case 14: 
          a(i1, i2, true);
          break;
        default: 
          this.b.a();
        }
      }
    }
    this.g += i1 - 1;
  }
  
  private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    throws Exception
  {
    String str = null;
    paramArrayOfInt2[0] = -1;
    paramArrayOfInt1[0] = 1;
    int i1 = 1;
    boolean bool1 = false;
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 6: 
          str = this.b.t();
          break;
        case 15: 
          paramArrayOfInt1[0] = zp.a(this.b.t());
          break;
        case 9: 
          switch (x.a(this.b.t()))
          {
          case 10: 
            i1 = 1;
            break;
          case 11: 
            i1 = 0;
            bool1 = true;
            break;
          case 12: 
            i1 = 0;
            bool1 = false;
          }
          break;
        }
      }
      this.b.l();
    }
    int i2 = 274;
    boolean bool2 = true;
    if ((str != null) && (!"".equals(str)))
    {
      localObject1 = (zasl)this.c.d.get(str);
      if (localObject1 != null)
      {
        i2 = ((zasl)localObject1).b();
        bool2 = ((zasl)localObject1).c();
      }
    }
    Object localObject1 = this.d.e(this.g);
    if ((localObject1 != null) && (((zatd)localObject1).c != null))
    {
      Object localObject2 = this.c.c.get(((zatd)localObject1).c);
      if (localObject2 != null) {
        paramArrayOfInt2[0] = ((Integer)localObject2).intValue();
      }
    }
    if (this.f > (this.j.s() & 0xFF)) {
      this.j.c((byte)this.f);
    }
    if ((this.f != 0) || (Math.abs(i2 - this.j.a()) > 1) || (paramArrayOfInt2[0] != -1) || (i1 == 0))
    {
      if (paramArrayOfInt2[0] != -1)
      {
        this.t.d = paramArrayOfInt2[0];
        this.t.d(true);
      }
      this.t.e = ((short)i2);
      this.t.c(bool2);
      this.t.b(i1 == 0);
      this.t.a(bool1);
      if (this.f != 0) {
        this.t.a((byte)this.f);
      }
      if (paramArrayOfInt1[0] > 1)
      {
        int i3 = this.g;
        for (int i4 = 0; i4 < paramArrayOfInt1[0]; i4++)
        {
          this.t.a = this.g;
          this.s.a = this.g;
          if (!b(1)) {
            this.n.b(this.t, 13);
          }
          this.g += 1;
        }
        this.g = i3;
        this.t.a = i3;
        this.s.a = i3;
      }
      else if (!b(256))
      {
        this.n.b(this.t, 13);
      }
    }
  }
  
  private boolean b(int paramInt)
  {
    if ((this.n != null) && (this.n.i() == this.s.a))
    {
      this.n.g();
      return false;
    }
    if (this.w == null)
    {
      this.w = c(paramInt);
      return true;
    }
    if (this.w.c.c.i() == this.s.a)
    {
      this.o = this.w.c;
      this.n = this.o.c;
      this.n.g();
      return false;
    }
    za localza;
    if (this.w.c.c.i() < this.s.a)
    {
      while (this.w.a != null)
      {
        this.w = this.w.a;
        if (this.w.c.c.i() == this.s.a)
        {
          this.o = this.w.c;
          this.n = this.o.c;
          this.n.g();
          return false;
        }
        if (this.w.c.c.i() > this.s.a)
        {
          localza = c(paramInt);
          localza.b = this.w.b;
          localza.a = this.w;
          this.w.b.a = localza;
          this.w.b = localza;
          this.w = localza;
          return true;
        }
      }
      this.w.a = c(paramInt);
      this.w.a.b = this.w;
      this.w = this.w.a;
      return true;
    }
    while (this.w.b != null)
    {
      this.w = this.w.b;
      if (this.w.c.c.i() == this.s.a)
      {
        this.o = this.w.c;
        this.n = this.o.c;
        this.n.g();
        return false;
      }
      if (this.w.c.c.i() < this.s.a)
      {
        localza = c(paramInt);
        localza.b = this.w;
        localza.a = this.w.a;
        this.w.a.b = localza;
        this.w.a = localza;
        this.w = localza;
        return true;
      }
    }
    this.w.b = c(paramInt);
    this.w.b.a = this.w;
    this.w = this.w.b;
    return true;
  }
  
  private za c(int paramInt)
  {
    this.p = this.m.a(this.s.a, this.p);
    if (this.p < 0) {
      this.p = this.m.a(-this.p - 1, this.s.a == this.g ? this.t : this.s, paramInt);
    }
    this.n = this.m.f(this.p);
    this.o = new Row(this.j, this.l, this.n, false);
    za localza = new za(null);
    localza.c = this.o;
    return localza;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
    throws Exception
  {
    int i1 = 1;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    int i2 = 1;
    int i3 = 1;
    int i4 = -1;
    int i5 = -1;
    this.h += 1;
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 16: 
          i5 = zp.a(this.b.t());
          break;
        case 17: 
          i4 = zp.a(this.b.t());
          break;
        case 7: 
          i1 = zp.a(this.b.t());
          break;
        case 6: 
          if ((this.b.t() != null) && (!"".equals(this.b.t()))) {
            str1 = this.b.t();
          }
          break;
        case 18: 
          str2 = this.b.t();
          break;
        case 19: 
        case 20: 
        case 21: 
        case 22: 
          str3 = this.b.t();
          break;
        case 23: 
          i3 = zp.a(this.b.t());
          break;
        case 24: 
          i2 = zp.a(this.b.t());
          break;
        case 25: 
          str4 = this.b.t();
        }
      }
      this.b.l();
    }
    Cell localCell1 = null;
    int i9;
    int i10;
    if ((str2 == null) && (str4 == null))
    {
      if (!paramBoolean)
      {
        i6 = (str1 == null) || (this.c.c.get(str1) == null) ? 15 : ((Integer)this.c.c.get(str1)).intValue();
        int i7 = 0;
        boolean[] arrayOfBoolean = null;
        if (i1 > 1)
        {
          if (str1 == null)
          {
            if (paramInt2 > -1) {
              i7 = 1;
            }
          }
          else if (paramInt2 > -1)
          {
            if (paramInt2 != i6) {
              i7 = 1;
            }
          }
          else {
            for (i9 = 0; i9 < i1; i9++) {
              if (this.d.b(this.h + i9) != i6)
              {
                if (i7 != 0)
                {
                  if (arrayOfBoolean != null) {
                    arrayOfBoolean[i9] = true;
                  }
                }
                else
                {
                  i7 = 1;
                  if (i9 > 0)
                  {
                    arrayOfBoolean = new boolean[i1];
                    for (i10 = 0; i10 < i9; i10++) {
                      arrayOfBoolean[i10] = false;
                    }
                    arrayOfBoolean[i9] = true;
                  }
                }
              }
              else if (i7 != 0)
              {
                if (arrayOfBoolean == null)
                {
                  arrayOfBoolean = new boolean[i1];
                  for (i10 = 0; i10 < i9; i10++) {
                    arrayOfBoolean[i10] = true;
                  }
                }
                arrayOfBoolean[i9] = false;
              }
            }
          }
        }
        else if (str1 == null)
        {
          if (paramInt2 > -1) {
            i7 = 1;
          }
        }
        else if (paramInt2 > -1)
        {
          if (paramInt2 != i6) {
            i7 = 1;
          }
        }
        else if (this.d.b(this.h) != i6) {
          i7 = 1;
        }
        if (i7 != 0)
        {
          this.u.a(this.h);
          this.u.b = i6;
          if (paramInt1 == 1)
          {
            b(i1);
            if (i1 == 1)
            {
              this.q = this.n.a(this.h, this.q);
              if (this.q < 0)
              {
                this.u.a = ((short)this.h);
                this.q = this.n.a(-this.q - 1, this.u);
              }
              else
              {
                this.n.j(this.q, i6);
              }
              localCell1 = new Cell(this.o, this.q);
            }
            else
            {
              for (i9 = 0; i9 < i1; i9++) {
                if ((arrayOfBoolean == null) || (arrayOfBoolean[i9] != 0))
                {
                  this.q = this.n.a(this.h + i9, this.q);
                  if (this.q < 0)
                  {
                    this.u.a = ((short)(this.h + i9));
                    this.q = this.n.a(-this.q - 1, this.u);
                  }
                  else
                  {
                    this.n.j(this.q, i6);
                  }
                  if (i9 == 0) {
                    localCell1 = new Cell(this.o, this.q);
                  }
                }
              }
            }
          }
          else
          {
            for (i9 = 0; i9 < paramInt1; i9++)
            {
              b(i1);
              this.q = -1;
              for (i10 = 0; i10 < i1; i10++) {
                if ((arrayOfBoolean == null) || (arrayOfBoolean[i10] != 0))
                {
                  this.q = this.n.a(this.h + i10, this.q);
                  if (this.q < 0)
                  {
                    this.u.a = ((short)(this.h + i10));
                    this.q = this.n.a(-this.q - 1, this.u);
                  }
                  else
                  {
                    this.n.j(this.q, i6);
                  }
                  if ((i10 == 0) && (i9 == 0)) {
                    localCell1 = new Cell(this.o, this.q);
                  }
                }
              }
              this.s.a += 1;
            }
            this.s.a = this.g;
            if (localCell1 != null) {
              localCell1.a();
            }
          }
          if (this.h + i1 - 1 > this.r) {
            this.r = (this.h + i1 - 1);
          }
          if (localCell1 != null) {
            this.v = localCell1.c;
          }
        }
      }
    }
    else
    {
      i6 = 15;
      Object localObject1;
      if (str1 == null)
      {
        i6 = this.d.c(this.h);
      }
      else
      {
        localObject1 = this.c.c.get(str1);
        if (localObject1 != null) {
          i6 = ((Integer)localObject1).intValue();
        }
      }
      b(i1);
      this.q = this.n.a(this.h, this.q);
      if (this.q > -1)
      {
        this.v = this.n.a(this.q, this.u, 7);
      }
      else
      {
        this.u.a(this.h);
        this.v = this.u;
      }
      this.v.b = i6;
      if (this.h + i1 - 1 > this.r) {
        this.r = (this.h + i1 - 1);
      }
      try
      {
        if (str4 != null)
        {
          if (this.q < 0)
          {
            zayi.a(this.j.a.c, this.v);
            this.q = this.n.a(-this.q - 1, this.v);
          }
          else
          {
            this.n.j(this.q, i6);
          }
          localCell1 = new Cell(this.o, this.q);
          if ((i4 != -1) && (i5 != -1))
          {
            localCell1.a(a(str4, this.i.getName()), i4, i5);
          }
          else
          {
            localObject1 = a(str4, this.i.getName());
            if ((localObject1 != null) && (((String)localObject1).length() > 1)) {
              localCell1.setFormula((String)localObject1);
            }
          }
          this.v = localCell1.c;
        }
      }
      catch (Exception localException1) {}
      switch (x.a(str2))
      {
      case 26: 
        zhw.a(this.v, 2, Boolean.valueOf("true".equals(str3.toLowerCase())));
        break;
      case 27: 
        try
        {
          str3 = str3.replace('T', ' ');
          DateTime localDateTime = DateTime.a(str3);
          double d1 = zbxa.a(localDateTime, this.i.d().getSettings().getDate1904());
          if (d1 < 0.0D) {
            zhw.a(this.v, str3, this.e);
          } else {
            zhw.a(this.v, 1, Double.valueOf(d1));
          }
        }
        catch (Exception localException2) {}
      case 28: 
        try
        {
          zhw.a(this.v, 1, Double.valueOf(zasp.q(str3)));
        }
        catch (Exception localException3) {}
      case 29: 
      case 30: 
      case 31: 
        try
        {
          zhw.a(this.v, 1, Double.valueOf(zasp.k(str3)));
        }
        catch (Exception localException4) {}
      case 32: 
        if (str3 != null)
        {
          byte b1 = ztr.b(str3);
          if (b1 != -1) {
            zhw.a(this.v, 3, zi.a(b1));
          } else {
            zhw.a(this.v, str3, this.e);
          }
        }
        break;
      }
      if (localCell1 == null)
      {
        if (this.q < 0) {
          this.q = this.n.a(-this.q - 1, this.v);
        } else {
          this.n.b(this.q, this.v, 6);
        }
        localCell1 = new Cell(this.o, this.q);
      }
    }
    int i6 = 0;
    if ((i3 != 1) || (i2 != 1))
    {
      i6 = 1;
      this.j.merge(this.g, this.h, i2, i3);
      if (localCell1 != null)
      {
        localCell1.a();
        if ((this.v.b != -1) && (this.v.b != 15))
        {
          localObject2 = localCell1.p();
          if (((Style)localObject2).f())
          {
            zgs localzgs = new zgs();
            localzgs.b = this.v.b;
            for (i9 = 0; i9 < i2; i9++)
            {
              b(i3);
              for (i10 = 0; i10 < i3; i10++) {
                if ((i9 != 0) || (i10 != 0))
                {
                  localzgs.a = ((short)(this.h + i10));
                  this.q = this.n.a(this.h + i10, this.q);
                  if (this.q < 0) {
                    this.q = this.n.a(-this.q - 1, localzgs);
                  } else {
                    this.n.j(this.q, localzgs.b);
                  }
                  if (localzgs.a > this.r) {
                    this.r = localzgs.a;
                  }
                }
              }
              this.s.a += 1;
            }
            this.s.a = this.g;
            localCell1.a();
          }
        }
      }
    }
    if (this.b.o())
    {
      this.b.a();
      this.h += i1 - 1;
      return;
    }
    Object localObject2 = new ArrayList();
    this.b.d();
    while (zauz.a(this.b)) {
      switch (x.a(this.b.q().toLowerCase()))
      {
      case 33: 
        this.b.a(1);
        a((ArrayList)localObject2, null, localCell1, i2, i3);
        this.b.a(0);
        if (this.b.s() == 3) {
          this.b.a();
        }
        break;
      case 34: 
        this.a.a(this.d, "rect", this.g, this.h, this.b);
        break;
      case 35: 
        this.a.a(this.d, "ellipse", this.g, this.h, this.b);
        break;
      case 36: 
        this.a.a(this.d, "custom-shape", this.g, this.h, this.b);
        break;
      case 37: 
        this.a.a(this.d, null, this.g, this.h, this.b);
        break;
      case 38: 
        if ((str2 == null) || ("string".equals(str2)))
        {
          this.b.a(1);
          a(localCell1, (ArrayList)localObject2, paramInt1, i1);
          this.b.a(0);
          if (this.b.s() == 3) {
            this.b.a();
          }
        }
        else
        {
          this.b.a();
        }
        break;
      case 39: 
        int i8 = this.i.getComments().add(this.g, this.h);
        this.k.a(this.i.getComments().get(i8).getCommentShape(), this.b);
        break;
      default: 
        this.b.a();
      }
    }
    if (((ArrayList)localObject2).size() != 0)
    {
      if (localCell1 == null)
      {
        b(i1);
        this.q = this.n.a(this.h, this.q);
        this.u.a(this.h);
        if (this.q < 0) {
          this.q = this.n.a(-this.q - 1, this.u);
        }
        localCell1 = new Cell(this.o, this.q);
        this.v = localCell1.c;
      }
      a(localCell1, (ArrayList)localObject2);
    }
    else if (("string".equals(str2)) && (str3 == null))
    {
      if (localCell1.g()) {
        localCell1.a("", (byte)0);
      } else if (localCell1.d()) {
        localCell1.putValue("");
      }
    }
    if ((localCell1 != null) && (i1 > 1) && (i6 == 0))
    {
      Cell localCell2 = localCell1;
      for (i9 = 1; i9 < i1; i9++)
      {
        localCell1 = this.o.a(this.h + i9, false, false);
        localCell1.copy(localCell2);
      }
    }
    this.h += i1 - 1;
  }
  
  static String a(String paramString1, String paramString2)
  {
    if (paramString1.startsWith("msoxl:")) {
      return paramString1.substring("msoxl:".length());
    }
    paramString1 = zw.a(paramString1, "$#REF!.$#REF!$#REF!", "#REF!");
    paramString1 = zw.a(paramString1, "$#REF!$#REF!", "#REF!");
    StringBuilder localStringBuilder = new StringBuilder();
    int i1 = 0;
    if (paramString1.startsWith("oooc:")) {
      i1 = 5;
    } else if (paramString1.startsWith("of:")) {
      i1 = 3;
    }
    if (paramString1.length() <= i1) {
      return null;
    }
    if (paramString1.charAt(i1) != '=') {
      localStringBuilder.append('=');
    }
    while (i1 < paramString1.length())
    {
      char c1 = paramString1.charAt(i1);
      switch (c1)
      {
      case '[': 
        int i2 = a(']', paramString1, i1 + 1);
        if (i2 == -1)
        {
          localStringBuilder.append(c1);
        }
        else
        {
          String str1 = paramString1.substring(i1 + 1, i1 + 1 + (i2 - (i1 + 1)));
          if (str1.indexOf("#REF") != -1)
          {
            localStringBuilder.append("#REF!");
          }
          else
          {
            int i3 = a(':', str1, 0);
            if (i3 == -1)
            {
              a(localStringBuilder, str1);
            }
            else
            {
              String str2 = str1.substring(0, 0 + i3);
              String str3 = str1.substring(i3 + 1);
              a(localStringBuilder, paramString2, str2, str3);
            }
          }
          i1 = i2;
        }
        break;
      case '"': 
        localStringBuilder.append(c1);
        i1++;
      case ';': 
      default: 
        while (i1 < paramString1.length())
        {
          c1 = paramString1.charAt(i1);
          localStringBuilder.append(c1);
          if (c1 != '"')
          {
            i1++;
            continue;
            localStringBuilder.append(',');
            break;
            localStringBuilder.append(c1);
          }
        }
      }
      i1++;
    }
    return zs.a(localStringBuilder);
  }
  
  private static String[] a(char paramChar, String paramString)
  {
    int i1 = a(paramChar, paramString, 0);
    if (i1 == -1) {
      return new String[] { paramString };
    }
    if (i1 == 0) {
      return new String[] { "", paramString.substring(1) };
    }
    return new String[] { paramString.substring(0, 0 + i1), paramString.substring(i1 + 1) };
  }
  
  private static int a(char paramChar, String paramString, int paramInt)
  {
    while (paramInt < paramString.length())
    {
      char c1 = paramString.charAt(paramInt);
      switch (c1)
      {
      case '"': 
        paramInt++;
      }
      while (paramInt < paramString.length())
      {
        c1 = paramString.charAt(paramInt);
        if (c1 != '"')
        {
          paramInt++;
          continue;
          paramInt++;
          while (paramInt < paramString.length())
          {
            c1 = paramString.charAt(paramInt);
            if (c1 != '\'')
            {
              paramInt++;
              continue;
              if (c1 == paramChar) {
                return paramInt;
              }
            }
          }
        }
      }
      paramInt++;
    }
    return -1;
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2, String paramString3)
  {
    String[] arrayOfString = a('.', paramString2);
    String str1 = "".equals(arrayOfString[0]) ? null : arrayOfString.length == 1 ? null : arrayOfString[0];
    boolean bool = false;
    if (str1 != null)
    {
      if (str1.charAt(0) == '$') {
        str1 = str1.substring(1);
      }
      if (str1.charAt(0) == '\'') {
        str1 = str1.substring(1, 1 + (str1.length() - 2));
      }
      bool = zamm.a(str1);
    }
    String str2 = arrayOfString.length == 1 ? paramString2 : arrayOfString[1];
    arrayOfString = zw.d(paramString3, '.');
    String str3 = "".equals(arrayOfString[0]) ? null : arrayOfString.length == 1 ? null : arrayOfString[0];
    if (str3 != null)
    {
      if (str3.charAt(0) == '$') {
        str3 = str3.substring(1);
      }
      if (str3.charAt(0) == '\'') {
        str3 = str3.substring(1, 1 + (str3.length() - 2));
      }
      if (!bool) {
        bool = zamm.a(str3);
      }
    }
    String str4 = arrayOfString.length == 1 ? paramString3 : arrayOfString[1];
    if ((str1 != null) || (str3 != null))
    {
      if (bool) {
        paramStringBuilder.append('\'');
      }
      if (str1 == null)
      {
        if (zw.b(str3, paramString1))
        {
          paramStringBuilder.append(str3);
        }
        else
        {
          paramStringBuilder.append(paramString1);
          paramStringBuilder.append(':');
          paramStringBuilder.append(str3);
        }
      }
      else if ((str3 == null) || (zw.b(str1, str3)))
      {
        paramStringBuilder.append(str1);
      }
      else
      {
        paramStringBuilder.append(str1);
        paramStringBuilder.append(':');
        paramStringBuilder.append(str3);
      }
      if (bool) {
        paramStringBuilder.append('\'');
      }
      paramStringBuilder.append('!');
    }
    paramStringBuilder.append(str2);
    paramStringBuilder.append(':');
    paramStringBuilder.append(str4);
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString)
  {
    if (paramString.indexOf("#REF") != -1)
    {
      paramStringBuilder.append("#REF!");
      return;
    }
    int i1 = a('.', paramString, 0);
    if (i1 == -1)
    {
      paramStringBuilder.append(paramString);
    }
    else if (i1 == 0)
    {
      paramStringBuilder.append(paramString.substring(1));
    }
    else
    {
      String[] arrayOfString = new String[2];
      arrayOfString[0] = paramString.substring(0, 0 + i1);
      arrayOfString[1] = paramString.substring(i1 + 1);
      if (arrayOfString[0].charAt(0) == '$') {
        arrayOfString[0] = arrayOfString[0].substring(1);
      }
      if (arrayOfString[0].charAt(0) != '\'')
      {
        if (zamm.a(arrayOfString[0]))
        {
          paramStringBuilder.append('\'');
          paramStringBuilder.append(arrayOfString[0]);
          paramStringBuilder.append('\'');
        }
        else
        {
          paramStringBuilder.append(arrayOfString[0]);
        }
      }
      else if (arrayOfString[0].charAt(arrayOfString[0].length() - 1) != '\'')
      {
        i1 = arrayOfString[0].lastIndexOf('\'');
        if (i1 != -1)
        {
          paramStringBuilder.append('\'');
          paramStringBuilder.append('[');
          paramStringBuilder.append(arrayOfString[0].substring(1, 1 + (i1 - 1)));
          paramStringBuilder.append(']');
          if (arrayOfString[0].charAt(i1 + 1) == '$') {
            paramStringBuilder.append(arrayOfString[0].substring(i1 + 2));
          } else {
            paramStringBuilder.append(arrayOfString[0].substring(i1 + 3));
          }
          paramStringBuilder.append('\'');
        }
        else
        {
          paramStringBuilder.append(arrayOfString[0]);
        }
      }
      else
      {
        paramStringBuilder.append(arrayOfString[0]);
      }
      paramStringBuilder.append('!');
      paramStringBuilder.append(arrayOfString[1]);
    }
  }
  
  private void a(Cell paramCell, ArrayList paramArrayList)
  {
    if (paramArrayList.size() == 1)
    {
      if (paramCell.g()) {
        ((zaai)paramCell.c.d).a(paramCell, ((zatc)paramArrayList.get(0)).a);
      } else {
        paramCell.putValue(((zatc)paramArrayList.get(0)).a);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      zatc localzatc = (zatc)paramArrayList.get(i1);
      FontSetting localFontSetting = new FontSetting(localStringBuilder.length(), localzatc.a.length(), this.c.b.getWorksheets());
      zf.a(localArrayList, localFontSetting);
      localStringBuilder.append(localzatc.a);
      if (localzatc.b == null) {
        localFontSetting.getFont().a(paramCell.p().getFont(), null);
      } else {
        localFontSetting.getFont().a(localzatc.b, null);
      }
    }
    paramCell.a(zs.a(localStringBuilder), localArrayList);
  }
  
  void a(Cell paramCell, ArrayList paramArrayList, int paramInt1, int paramInt2)
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    zatc localzatc;
    if (paramArrayList.size() != 0)
    {
      localzatc = (zatc)paramArrayList.get(paramArrayList.size() - 1);
      localzatc.a += "\n";
      paramArrayList.set(paramArrayList.size() - 1, localzatc);
    }
    this.b.d();
    while (this.b.s() != 4)
    {
      this.b.k();
      if (this.b.s() != 1)
      {
        if (this.b.s() == 3)
        {
          localzatc = new zatc();
          localzatc.a = this.b.t();
          zf.a(paramArrayList, localzatc);
        }
        this.b.a();
      }
      else
      {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 33: 
          a(paramArrayList, null, paramCell, paramInt1, paramInt2);
          break;
        case 40: 
          a(paramCell, null, paramInt1, paramInt2);
          break;
        default: 
          this.b.a();
        }
      }
    }
    this.b.h();
  }
  
  void a(ArrayList paramArrayList, Font paramFont, Cell paramCell, int paramInt1, int paramInt2)
    throws Exception
  {
    zatc localzatc = new zatc();
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (x.a(this.b.q()))
        {
        case 6: 
          localzatc.b = ((Font)this.c.g.get(this.b.t()));
        }
      }
      this.b.l();
    }
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    while (this.b.s() != 4)
    {
      this.b.k();
      if (this.b.s() != 1)
      {
        if (this.b.s() == 3)
        {
          localzatc.a = this.b.t();
          zf.a(paramArrayList, localzatc);
        }
        this.b.a();
      }
      else
      {
        switch (x.a(this.b.q().toLowerCase()))
        {
        case 33: 
          a(paramArrayList, localzatc.b, paramCell, paramInt1, paramInt2);
          break;
        case 40: 
          a(paramCell, localzatc.b, paramInt1, paramInt2);
          break;
        default: 
          this.b.a();
        }
      }
    }
    this.b.h();
  }
  
  void a(Cell paramCell, Font paramFont, int paramInt1, int paramInt2)
    throws Exception
  {
    String str1 = null;
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (x.a(this.b.q()))
        {
        case 41: 
          str1 = this.b.t();
        }
      }
      this.b.l();
    }
    String str2 = this.b.j();
    Object localObject;
    if ((str1 != null) && (!"".equals(str1)))
    {
      localObject = this.d.a.getHyperlinks();
      if (str1.charAt(0) == '#')
      {
        str1 = str1.substring(1);
        if (str1.indexOf('.') != -1) {
          str1 = str1.replace('.', '!');
        } else if (this.c.b.getWorksheets().get(str1) != null) {
          str1 = str1 + "!" + this.c.b.getWorksheets().get(str1).getActiveCell();
        }
      }
      int i1 = ((HyperlinkCollection)localObject).a(this.g, this.h, paramInt1, paramInt2, str1);
      ((HyperlinkCollection)localObject).get(i1).setTextToDisplay(str2);
    }
    paramCell.putValue(str2);
    if (paramFont != null)
    {
      localObject = paramCell.o();
      ((Style)localObject).getFont().a(paramFont, null);
      paramCell.a((Style)localObject);
    }
  }
  
  private class za
  {
    za a;
    za b;
    Row c;
    
    private za() {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */