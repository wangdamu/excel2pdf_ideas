package com.aspose.cells.a.d;

public class zdx
  extends zey
{
  private zgc b;
  private zeq c;
  public int a = 0;
  
  public zdx(zdz paramzdz, zgc paramzgc)
    throws Exception
  {
    super(paramzdz);
    this.b = paramzgc;
    this.c = new zeq(paramzdz, paramzgc);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
    this.c.a = this.a;
    this.c.a(paramzez);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Font");
    paramzez.a("/Subtype", "/CIDFontType2");
    paramzez.a("/BaseFont", "/" + this.b.f());
    paramzez.a("/CIDToGIDMap", "/Identity");
    paramzez.a("/FontDescriptor", this.c.o());
    paramzez.a("/DW", 1000);
    paramzez.a("/W", this.b.t());
    paramzez.a("/CIDSystemInfo ");
    paramzez.g();
    paramzez.a("/Ordering (Identity)/Registry (Adobe)/Supplement 0");
    paramzez.h();
    paramzez.h();
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */