package com.aspose.cells.a.d;

public class zdw
  extends zey
{
  private zfj a;
  private zfg b;
  private zfb c;
  
  public zdw(zdz paramzdz)
  {
    super(paramzdz);
    this.a = new zfj(paramzdz);
    this.b = new zfg(paramzdz);
    this.c = new zfb(paramzdz);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Catalog");
    paramzez.a("/Pages", this.a.o());
    if (!this.b.a())
    {
      paramzez.a("/PageMode", "/UseOutlines");
      paramzez.a("/Outlines", this.b.b());
    }
    if (!this.c.c()) {
      paramzez.a("/Names", this.c.o());
    }
    if (this.e.b().u())
    {
      paramzez.a("/Metadata", this.e.f().o());
      paramzez.a("/OutputIntents  [<</Type /OutputIntent/Info (sRGB IEC61966-2.1)/S /GTS_PDFA1/OutputConditionIdentifier (InnerCustom)/DestOutputProfile ");
      paramzez.a(this.e.g().o());
      paramzez.a(">>] ");
      if (this.e.b().v())
      {
        paramzez.a("/MarkInfo", "<< /Marked true >>");
        paramzez.a("/StructTreeRoot", this.e.h().o());
        paramzez.a("/Lang", "(en-US)");
      }
    }
    paramzez.h();
    paramzez.b();
    this.a.a(paramzez);
    this.b.a(paramzez);
    this.c.a(paramzez);
    if (this.e.b().u())
    {
      this.e.f().a(paramzez);
      this.e.g().a(paramzez);
      if (this.e.b().v()) {
        this.e.h().a(paramzez);
      }
    }
  }
  
  public zfj a()
  {
    return this.a;
  }
  
  public zfg b()
  {
    return this.b;
  }
  
  public zfb c()
  {
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */