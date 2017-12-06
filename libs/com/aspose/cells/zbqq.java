package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbqq
{
  private Object h;
  Workbook a;
  String b;
  private Bevel i;
  private Bevel j;
  private int k;
  zaml c;
  zaml d;
  int e;
  int f;
  private ArrayList l;
  int g;
  
  zbqq(Workbook paramWorkbook, Object paramObject)
  {
    this.a = paramWorkbook;
    this.h = paramObject;
    this.k = 14;
  }
  
  Bevel a()
  {
    return this.i;
  }
  
  public Bevel b()
  {
    if (this.i == null) {
      this.i = new Bevel();
    }
    return this.i;
  }
  
  Bevel c()
  {
    return this.j;
  }
  
  Bevel d()
  {
    if (this.j == null) {
      this.j = new Bevel();
    }
    return this.j;
  }
  
  public int e()
  {
    return this.k;
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  void a(zbqq paramzbqq)
  {
    this.b = paramzbqq.b;
    if (this.b == null)
    {
      this.g = paramzbqq.g;
      if (paramzbqq.l != null)
      {
        this.l = new ArrayList();
        zf.a(this.l, paramzbqq.l);
      }
      this.e = paramzbqq.e;
      this.f = paramzbqq.f;
      if (paramzbqq.c != null)
      {
        this.c = new zaml(true);
        this.c.f(paramzbqq.c);
      }
      if (paramzbqq.d != null)
      {
        this.d = new zaml(true);
        this.d.f(paramzbqq.d);
      }
      this.k = paramzbqq.k;
      if (paramzbqq.j != null)
      {
        this.j = new Bevel();
        this.j.a(paramzbqq.j);
      }
      if (paramzbqq.i != null)
      {
        this.i = new Bevel();
        this.i.a(paramzbqq.i);
      }
    }
  }
  
  boolean b(zbqq paramzbqq)
  {
    if (this.g != paramzbqq.g) {
      return false;
    }
    if ((this.l != null) || (paramzbqq.l != null)) {
      if ((this.l != null) && (paramzbqq.l != null))
      {
        if (this.l.size() != paramzbqq.l.size()) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if (this.e != paramzbqq.e) {
      return false;
    }
    if (this.f != paramzbqq.f) {
      return false;
    }
    if ((this.c != null) || (paramzbqq.c != null)) {
      if ((this.c != null) && (paramzbqq.c != null))
      {
        if (!this.c.g(paramzbqq.c)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.d != null) || (paramzbqq.d != null)) {
      if ((this.d != null) && (paramzbqq.d != null))
      {
        if (!this.d.g(paramzbqq.d)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if (this.k != paramzbqq.k) {
      return false;
    }
    if ((this.j != null) || (paramzbqq.j != null)) {
      if ((this.j != null) && (paramzbqq.j != null))
      {
        if (!this.j.b(paramzbqq.j)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.i != null) || (paramzbqq.i != null)) {
      if ((this.i != null) && (paramzbqq.i != null))
      {
        if (!this.i.b(paramzbqq.i)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */