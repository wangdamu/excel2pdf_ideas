package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbep
{
  String a;
  private Object c;
  private zbeq d;
  private zani e;
  ArrayList b;
  private zcg f;
  
  zbep(Object paramObject)
  {
    this.c = paramObject;
  }
  
  zbeq a()
  {
    if (this.d == null) {
      this.d = new zbeq();
    }
    return this.d;
  }
  
  zani b()
  {
    if (this.e == null) {
      this.e = new zani();
    }
    return this.e;
  }
  
  zcg c()
  {
    return this.f;
  }
  
  zcg d()
  {
    if (this.f == null) {
      this.f = new zcg();
    }
    return this.f;
  }
  
  void a(zbep paramzbep)
  {
    this.a = paramzbep.a;
    if (this.a == null)
    {
      if (paramzbep.f != null)
      {
        this.f = new zcg();
        d().a(paramzbep.f);
      }
      if (paramzbep.e != null)
      {
        this.e = new zani();
        this.e.a(paramzbep.e);
      }
      if (paramzbep.d != null)
      {
        this.d = new zbeq();
        this.d.a(paramzbep.d);
      }
      if (paramzbep.b != null)
      {
        this.b = new ArrayList();
        zf.a(this.b, paramzbep.b);
      }
    }
  }
  
  boolean b(zbep paramzbep)
  {
    if ((this.f != null) || (paramzbep.f != null)) {
      if ((this.f != null) && (paramzbep.f != null))
      {
        if (!this.f.b(paramzbep.f)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.e != null) || (paramzbep.e != null)) {
      if ((this.e != null) && (paramzbep.e != null))
      {
        if (!this.e.b(paramzbep.e)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.d != null) || (paramzbep.d != null)) {
      if ((this.d != null) && (paramzbep.d != null))
      {
        if (!this.d.b(paramzbep.d)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.b != null) || (paramzbep.b != null)) {
      if ((this.b != null) && (paramzbep.b != null))
      {
        if (this.b.size() != paramzbep.b.size()) {
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */