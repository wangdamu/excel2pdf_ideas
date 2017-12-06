package com.aspose.cells;

class zdf
{
  private boolean b = true;
  int a;
  
  boolean a()
  {
    return this.b;
  }
  
  void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  void a(zdf paramzdf)
  {
    this.b = paramzdf.b;
    this.a = paramzdf.a;
  }
  
  boolean b(zdf paramzdf)
  {
    if (this.b != paramzdf.b) {
      return false;
    }
    return this.a == paramzdf.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */