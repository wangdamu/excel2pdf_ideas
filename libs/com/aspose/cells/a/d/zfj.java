package com.aspose.cells.a.d;

public class zfj
  extends zey
{
  private zfp a;
  private zfm b = new zfm();
  
  public zfj(zdz paramzdz)
  {
    super(paramzdz);
    this.a = new zfp(paramzdz);
  }
  
  public void a(String paramString)
  {
    this.b.add(paramString);
  }
  
  public String a(int paramInt)
  {
    return (String)this.b.get(paramInt);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/Pages");
    paramzez.a("/Count", this.b.size());
    paramzez.a("/Kids");
    this.b.a(paramzez);
    paramzez.h();
    paramzez.b();
    this.a.b(paramzez);
  }
  
  public zfp b()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */