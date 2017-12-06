package com.aspose.cells.b.a.d;

import com.aspose.cells.Encoding;

public class zb
{
  private zm a;
  private byte[] b;
  private Encoding c = Encoding.getUnicode();
  
  public zb(zm paramzm)
  {
    this.a = paramzm;
    this.b = new byte[16];
  }
  
  public zb(zm paramzm, Encoding paramEncoding)
  {
    this(paramzm);
  }
  
  public zm a()
  {
    return this.a;
  }
  
  public void b()
    throws Exception
  {
    this.a.b();
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void a(byte[] paramArrayOfByte)
    throws Exception
  {
    this.a.b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    this.b[0] = paramByte;
    this.a.b(this.b, 0, 1);
  }
  
  public void a(short paramShort)
    throws Exception
  {
    this.b[0] = ((byte)paramShort);
    this.b[1] = ((byte)(paramShort >> 8));
    this.a.b(this.b, 0, 2);
  }
  
  public void a(int paramInt)
    throws Exception
  {
    a((short)paramInt);
  }
  
  public void b(int paramInt)
    throws Exception
  {
    this.b[0] = ((byte)paramInt);
    this.b[1] = ((byte)(paramInt >> 8));
    this.b[2] = ((byte)(paramInt >> 16));
    this.b[3] = ((byte)(paramInt >> 24));
    this.a.b(this.b, 0, 4);
  }
  
  public void a(long paramLong)
    throws Exception
  {
    b((int)paramLong);
  }
  
  public void b(long paramLong)
    throws Exception
  {
    a(paramLong & 0xFFFFFFFF);
    a(paramLong >> 32);
  }
  
  public void a(double paramDouble)
    throws Exception
  {
    b(Double.doubleToLongBits(paramDouble));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/d/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */