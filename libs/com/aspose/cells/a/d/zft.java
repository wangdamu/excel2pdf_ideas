package com.aspose.cells.a.d;

public class zft
  extends zfu
{
  private byte[] a;
  private int b;
  private int d;
  
  public zft(zdz paramzdz, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    super(paramzdz);
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.d = paramInt2;
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    a(this.a, 0, this.a.length);
    super.a(paramzez);
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    paramzez.a("/Type", "/XObject");
    paramzez.a("/Subtype", "/Image");
    paramzez.a("/Width", this.b);
    paramzez.a("/Height", this.d);
    paramzez.a("/ColorSpace", "/DeviceGray");
    paramzez.a("/BitsPerComponent", 8);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */