package com.aspose.cells;

class zbui
{
  int a;
  int b;
  int c;
  private zbul d;
  
  zbui() {}
  
  zbui(int paramInt)
  {
    this.b = paramInt;
    this.a = 0;
    this.c = 65535;
  }
  
  zbui(int paramInt1, int paramInt2)
  {
    this.b = 65535;
    this.c = 65535;
    zbuj localzbuj = new zbuj();
    localzbuj.a = paramInt1;
    localzbuj.b = paramInt2;
    b().a(localzbuj);
  }
  
  zbul a()
  {
    return this.d;
  }
  
  zbul b()
  {
    if (this.d == null) {
      this.d = new zbul();
    }
    return this.d;
  }
  
  void a(zbui paramzbui)
  {
    this.a = paramzbui.a;
    this.b = paramzbui.b;
    this.c = paramzbui.c;
    int i = paramzbui.b().getCount();
    for (int j = 0; j < i; j++)
    {
      zbuj localzbuj = new zbuj();
      localzbuj.a(paramzbui.b().a(j));
      b().a(localzbuj);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */