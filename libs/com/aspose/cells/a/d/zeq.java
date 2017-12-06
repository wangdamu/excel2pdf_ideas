package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zeq
  extends zey
{
  private zfu b;
  private zep c;
  private zfu d;
  private zdz f;
  public int a = 0;
  
  public zeq(zdz paramzdz, zep paramzep)
    throws Exception
  {
    super(paramzdz);
    this.c = paramzep;
    this.f = paramzdz;
    if (paramzep.m()) {
      this.d = new zfu(paramzdz, true);
    }
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    b(paramzez);
    if (this.c.m())
    {
      this.c.a(this.d.e());
      if (this.f.b().u()) {
        this.b.a(paramzez);
      }
      this.d.e().b(0L);
      this.d.a(paramzez);
    }
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/FontDescriptor");
    paramzez.a("/FontName", "/" + this.c.f());
    int i = this.c.c.s().c;
    paramzez.a("/StemV", (i & 0xFFFF) / 65 * ((i & 0xFFFF) / 65));
    paramzez.a("/Descent", this.c.g());
    paramzez.a("/Ascent", this.c.h());
    paramzez.a("/CapHeight", this.c.i());
    paramzez.a("/Flags", this.c.j());
    paramzez.a("/ItalicAngle", this.c.l());
    paramzez.a("/FontBBox", this.c.k());
    paramzez.a("/FontWeight", i & 0xFFFF);
    if (this.c.m())
    {
      if (this.f.b().u())
      {
        this.b = new zfu(this.f);
        if (this.a == 0)
        {
          this.b.a((byte)Byte.MIN_VALUE);
        }
        else if (this.a > 0)
        {
          for (int j = 0; j < this.a / 8; j++) {
            this.b.a((byte)-1);
          }
          j = this.a % 8;
          if (j > 0) {
            this.b.a((byte)(255 << 8 - j));
          }
        }
        paramzez.a("/CIDSet", this.b.o());
      }
      paramzez.a("/FontFile2", this.d.o());
    }
    paramzez.h();
    paramzez.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */