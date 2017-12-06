package com.aspose.cells;

class zbyy
{
  boolean a;
  boolean b;
  ztm c;
  
  ztm a()
  {
    if (this.c == null) {
      this.c = new ztm();
    }
    return this.c;
  }
  
  int b()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.b();
  }
  
  void a(int paramInt)
  {
    if (this.c == null) {
      this.c = new ztm();
    }
    this.c.a(paramInt);
  }
  
  void a(zbyy paramzbyy)
  {
    this.b = paramzbyy.b;
    this.a = paramzbyy.a;
    if (paramzbyy.c != null)
    {
      this.c = new ztm();
      this.c.a(paramzbyy.c);
    }
    else
    {
      this.c = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */