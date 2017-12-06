package com.aspose.cells;

class zbme
{
  private int a;
  private int b;
  private Object c;
  
  zbme(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a = paramInt1;
    this.c = paramObject;
    this.b = paramInt2;
  }
  
  boolean a()
  {
    return (this.a & 0xFFFF & 0x8000) != 0;
  }
  
  int b()
  {
    return this.a;
  }
  
  int c()
  {
    return this.b;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  Object d()
  {
    return this.c;
  }
  
  void a(Object paramObject)
  {
    this.c = paramObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */