package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zsw
{
  private Shape f;
  zbsy a;
  zbsy b;
  Font c;
  zbsy d;
  zbsy e;
  private static final za g = new za(new String[] { "major", "minor" });
  
  Font a()
  {
    if (this.c != null) {
      return this.c;
    }
    this.c = new Font(this.f.P(), this.f, true);
    if (this.b != null)
    {
      Workbook localWorkbook = this.f.P().p();
      int i = 0;
      if (this.b.a != null) {
        switch (g.a(this.b.a))
        {
        case 0: 
          i = 1;
          break;
        case 1: 
          i = 2;
          break;
        }
      }
      boolean bool = "major".equals(this.b.a);
      String str = localWorkbook.d().f.a(localWorkbook.getSettings().getRegion(), bool);
      this.c.a("Calibri", this.b.a != null, i);
      if (this.b.b != null) {
        this.c.b(this.b.b);
      }
    }
    else
    {
      this.c.a("Calibri", false, 0);
    }
    return this.c;
  }
  
  int b()
  {
    int i = zauj.F(this.a.a);
    if (i == 0) {
      return 0;
    }
    zrs localzrs = this.f.P().p().d();
    if ((localzrs != null) && (localzrs.g != null) && (i <= localzrs.c().size()))
    {
      LineFormat localLineFormat = (LineFormat)localzrs.c().get(i - 1);
      if (localLineFormat.e(0)) {
        return localLineFormat.j();
      }
    }
    if (i == 0) {
      return 0;
    }
    if (i > 1) {
      return 25400;
    }
    return 9525;
  }
  
  zsw(Shape paramShape)
  {
    this.f = paramShape;
    if ((paramShape instanceof ChartShape)) {
      c();
    } else {
      d();
    }
  }
  
  private void c()
  {
    this.a = new zbsy("0");
    this.d = new zbsy("0");
    this.e = new zbsy("0");
    this.b = new zbsy("minor");
  }
  
  private void d()
  {
    if (this.f == null) {
      return;
    }
    switch (this.f.getAutoShapeType())
    {
    case 19: 
    case 20: 
    case 32: 
    case 85: 
    case 86: 
    case 87: 
    case 88: 
    case 185: 
    case 186: 
      this.a = new zbsy("1");
      this.a.b.a(4, 4);
      this.d = new zbsy("0");
      this.d.b.a(4, 4);
      this.e = new zbsy("0");
      this.e.b.a(4, 4);
      this.b = new zbsy("minor");
      this.b.b.a(4, 1);
      break;
    default: 
      this.a = new zbsy("2");
      this.a.b.a(4, 4);
      this.a.b.l().a(new zlf(1, 50000));
      this.d = new zbsy("1");
      this.d.b.a(4, 4);
      this.e = new zbsy("0");
      this.e.b.a(4, 4);
      this.b = new zbsy("minor");
      this.b.b.a(4, 1);
    }
  }
  
  void a(zsw paramzsw)
  {
    this.a.a(paramzsw.a);
    this.b.a(paramzsw.b);
    this.d.a(paramzsw.d);
    this.e.a(paramzsw.e);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */