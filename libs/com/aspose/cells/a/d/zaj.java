package com.aspose.cells.a.d;

public class zaj
{
  private int[] a;
  private byte[] b;
  private int c;
  private zak d;
  private short e;
  
  public zaj(zak paramzak)
    throws Exception
  {
    this.d = paramzak;
    this.c = (this.d.b() & 0xFFFF);
    this.e = this.d.c();
    this.a = this.d.a(this.e, this.c + 1);
    this.b = this.d.d().a(this.a[this.c] - 1);
  }
  
  public byte[] a()
  {
    return this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */