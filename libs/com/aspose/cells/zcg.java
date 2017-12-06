package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zcg
{
  ArrayList a;
  zaqt b;
  zaqt c;
  zaqt d;
  
  void a(zcg paramzcg)
  {
    if (paramzcg.a != null)
    {
      this.a = new ArrayList();
      zf.a(this.a, paramzcg.a);
    }
    if (paramzcg.b != null)
    {
      this.b = new zaqt();
      this.b.a(paramzcg.b);
    }
    if (paramzcg.c != null)
    {
      this.c = new zaqt();
      this.c.a(paramzcg.c);
    }
    if (paramzcg.d != null)
    {
      this.d = new zaqt();
      this.d.a(paramzcg.d);
    }
  }
  
  boolean b(zcg paramzcg)
  {
    if ((this.a != null) || (paramzcg.a != null)) {
      if ((this.a != null) && (paramzcg.a != null))
      {
        if (this.a.size() != paramzcg.a.size()) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.b != null) || (paramzcg.b != null)) {
      if ((this.b != null) && (paramzcg.b != null))
      {
        if (!this.b.b(paramzcg.b)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.c != null) || (paramzcg.c != null)) {
      if ((this.c != null) && (paramzcg.c != null))
      {
        if (!this.c.b(paramzcg.c)) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    if ((this.d != null) || (paramzcg.d != null)) {
      if ((this.d != null) && (paramzcg.d != null))
      {
        if (!this.d.b(paramzcg.d)) {
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */