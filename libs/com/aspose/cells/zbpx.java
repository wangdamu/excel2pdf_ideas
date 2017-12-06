package com.aspose.cells;

class zbpx
{
  private zbqa a;
  private zbpy b;
  private TableStyle c;
  
  zbpx(String paramString, zbpy paramzbpy)
  {
    this.b = paramzbpy;
    this.a = new zbqa(this);
    this.c = this.b.a().getTableStyles().get(paramString);
    this.c.b(false);
    this.c.a(false);
  }
  
  public zbqa a()
  {
    return this.a;
  }
  
  String b()
  {
    return this.c.getName();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */