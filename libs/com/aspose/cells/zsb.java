package com.aspose.cells;

class zsb
{
  private int a;
  private int b;
  private int c;
  
  zsb(int paramInt)
  {
    this.c = paramInt;
    this.a = 1;
    this.b = (paramInt * 1024 + 1024);
  }
  
  zsb(int paramInt1, int paramInt2)
  {
    this.c = paramInt1;
    this.a = 1;
    this.b = paramInt2;
  }
  
  void a(zsb paramzsb)
  {
    this.c = paramzsb.c;
    this.b = paramzsb.b;
    this.a = paramzsb.a;
  }
  
  int a()
  {
    return this.c;
  }
  
  int b()
  {
    return this.a;
  }
  
  void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  int c()
  {
    return this.b;
  }
  
  void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  void a(zse paramzse, int paramInt)
  {
    this.a += paramInt;
    this.b += paramInt;
    int i = paramzse.d().b(this.c & 0xFFFF, paramInt);
    if (i != -1) {
      this.b = i;
    }
  }
  
  int d()
  {
    return 8;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */