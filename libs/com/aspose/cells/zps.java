package com.aspose.cells;

class zps
{
  Shape d;
  String e;
  String f;
  String g;
  String h;
  
  zps(Shape paramShape, boolean paramBoolean)
  {
    this.d = paramShape;
    String str = "\000s";
    if (paramShape.h != null)
    {
      if (paramShape.h.b != null)
      {
        this.e = paramShape.h.b;
        if (paramShape.h.c == null) {
          switch (paramShape.getMsoDrawingType())
          {
          case 24: 
            this.g = zauj.z(zauj.af(this.e));
            break;
          }
        }
      }
      if (paramShape.h.c != null) {
        this.f = paramShape.h.c;
      }
      if (this.g == null) {
        this.g = zauj.z(paramShape.O());
      }
    }
    if (this.e == null) {
      switch (paramShape.getMsoDrawingType())
      {
      case 24: 
        this.g = zauj.z(paramShape.R().j().c());
        this.e = (str + this.g);
        break;
      case 8: 
        this.e = paramShape.getName();
        break;
      default: 
        if (paramBoolean)
        {
          this.g = zauj.z(paramShape.R().j().c());
          this.e = (str + this.g);
        }
        else
        {
          this.e = paramShape.getName();
        }
        break;
      }
    }
    if (this.f == null) {
      switch (paramShape.getMsoDrawingType())
      {
      case 8: 
        this.g = zauj.z(paramShape.R().j().c());
        this.f = (str + this.g);
        break;
      }
    }
  }
  
  zps(Shape paramShape)
  {
    this(paramShape, true);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */