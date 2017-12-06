package com.aspose.cells;

public class Marker
{
  private Line b;
  private Area c;
  private int d = 0;
  private int e = 5;
  boolean a = true;
  private Object f;
  private zpz g;
  private Chart h;
  private ShapePropertyCollection i;
  
  void a()
  {
    this.g.a(null);
  }
  
  public Line getBorder()
  {
    if (this.b == null) {
      this.b = new Line(this.g.r(), this);
    }
    return this.b;
  }
  
  public Area getArea()
  {
    if (this.c == null) {
      this.c = new Area(this.g.r(), this);
    }
    return this.c;
  }
  
  public int getMarkerStyle()
  {
    return this.d;
  }
  
  public void setMarkerStyle(int value)
  {
    this.d = value;
    a();
    if (value == 5)
    {
      getBorder().n(2);
      getArea().setFormatting(1);
    }
    else if (value == 0)
    {
      getBorder().n(0);
      getArea().setFormatting(0);
    }
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public int getMarkerSize()
  {
    return this.e;
  }
  
  public void setMarkerSize(int value)
  {
    if ((value >= 2) && (value <= 72))
    {
      this.e = value;
      a();
      j();
      this.a = false;
    }
    else
    {
      throw new IllegalArgumentException("Invalid marker size : it must be between 2 and 27.");
    }
  }
  
  public int getMarkerSizePx()
  {
    int j = 96;
    if (this.h != null) {
      j = zbxp.a();
    }
    return (int)(this.e * j / 72.0F + 0.5F);
  }
  
  public void setMarkerSizePx(int value)
  {
    int j = 96;
    if (this.h != null) {
      j = zbxp.a();
    }
    setMarkerSize((int)(value * 72.0F / j + 0.5F));
  }
  
  Area b()
  {
    return this.c;
  }
  
  Line c()
  {
    return this.b;
  }
  
  Marker(Object parent, zpz dataFormat)
  {
    this.f = parent;
    this.g = dataFormat;
    this.h = dataFormat.r();
    if (this.h != null) {
      if (this.h.n().p().g()) {
        this.e = 7;
      } else {
        this.e = 5;
      }
    }
  }
  
  void b(int paramInt)
  {
    switch (paramInt)
    {
    case 37: 
    case 38: 
    case 39: 
    case 57: 
    case 62: 
    case 64: 
      setMarkerStyle(5);
      a();
      break;
    }
  }
  
  void a(Marker paramMarker, CopyOptions paramCopyOptions)
  {
    this.d = paramMarker.d;
    setMarkerSize(paramMarker.getMarkerSize());
    if (paramMarker.b != null)
    {
      this.b = new Line(this.g.r(), this);
      this.b.a(paramMarker.b);
    }
    if (paramMarker.c != null)
    {
      this.c = new Area(this.g.r(), this);
      this.c.a(paramMarker.c, paramCopyOptions);
    }
    if (paramMarker.i != null)
    {
      this.i = new ShapePropertyCollection(this.g.r(), this, 4);
      this.i.a(paramMarker.i, paramCopyOptions);
    }
  }
  
  boolean a(Marker paramMarker)
  {
    if (this.d != paramMarker.d) {
      return false;
    }
    if (getMarkerSize() != paramMarker.getMarkerSize()) {
      return false;
    }
    if ((this.b != null) && (paramMarker.b != null))
    {
      if (!this.b.b(paramMarker.b)) {
        return false;
      }
    }
    else if ((this.b != null) || (paramMarker.b != null)) {
      return false;
    }
    if ((this.c != null) && (paramMarker.c != null))
    {
      if (!this.c.a(paramMarker.c, null)) {
        return false;
      }
    }
    else if ((this.c != null) || (paramMarker.c != null)) {
      return false;
    }
    if ((this.i != null) && (paramMarker.i != null))
    {
      if (!this.i.a(paramMarker.i, null)) {
        return false;
      }
    }
    else if ((this.i != null) || (paramMarker.i != null)) {
      return false;
    }
    return true;
  }
  
  Color d()
  {
    return getBorder().getColor();
  }
  
  void a(Color paramColor)
  {
    getBorder().a(paramColor);
    getBorder().n(1);
    a();
    j();
  }
  
  int e()
  {
    if (this.b != null) {
      switch (this.b.getFormattingType())
      {
      case 0: 
        return 0;
      case 2: 
        return 1;
      case 1: 
        return this.b.b.b() ? 0 : 2;
      }
    }
    return 0;
  }
  
  void c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      getBorder().n(0);
      getBorder().b.b(true);
      break;
    case 1: 
      getBorder().n(2);
      break;
    default: 
      getBorder().n(1);
    }
    a();
    j();
  }
  
  Color f()
  {
    return getArea().getForegroundColor();
  }
  
  void b(Color paramColor)
  {
    getArea().setForegroundColor(paramColor);
    getArea().setFormatting(2);
    a();
    j();
  }
  
  int g()
  {
    return getArea().getFormatting();
  }
  
  void d(int paramInt)
  {
    getArea().setFormatting(paramInt);
    a();
    j();
  }
  
  Chart h()
  {
    return this.h;
  }
  
  private void j()
  {
    if (this.d != 0) {
      return;
    }
    int j = 0;
    if ((this.f != null) && ((this.f instanceof Series))) {
      j = ((Series)this.f).E();
    }
    j %= 9;
    j += 2;
    switch (j)
    {
    case 2: 
      this.d = 3;
      break;
    case 3: 
      this.d = 7;
      break;
    case 4: 
      this.d = 9;
      break;
    case 5: 
      this.d = 10;
      break;
    case 6: 
      this.d = 8;
      break;
    case 7: 
      this.d = 1;
      break;
    case 8: 
      this.d = 6;
      break;
    case 9: 
      this.d = 4;
      break;
    case 10: 
      this.d = 2;
      break;
    default: 
      this.d = 5;
    }
  }
  
  ShapePropertyCollection i()
  {
    if (this.i == null) {
      this.i = new ShapePropertyCollection(this.g.r(), this, 4);
    }
    return this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Marker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */