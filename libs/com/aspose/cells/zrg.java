package com.aspose.cells;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;

class zrg
{
  protected zm a;
  protected byte[] b;
  
  zrg(zm paramzm)
  {
    this.a = paramzm;
  }
  
  zm a()
  {
    return this.a;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    this.a.b(paramArrayOfByte, 0, paramInt);
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.a.b(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  void a(byte[] paramArrayOfByte)
    throws Exception
  {
    this.a.b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  void a(byte paramByte)
    throws Exception
  {
    this.a.a(paramByte);
  }
  
  void a(long paramLong)
    throws Exception
  {
    this.b = zc.a((int)(paramLong & 0xFFFFFFFF));
    a(this.b);
  }
  
  void a(int paramInt)
    throws Exception
  {
    this.b = zc.a(paramInt);
    a(this.b);
  }
  
  void b(int paramInt)
    throws Exception
  {
    this.b = zc.a((short)(paramInt & 0xFFFF));
    a(this.b);
  }
  
  void a(short paramShort)
    throws Exception
  {
    this.b = zc.a(paramShort);
    a(this.b);
  }
  
  void c(int paramInt)
    throws Exception
  {
    this.b = zc.a((short)paramInt);
    a(this.b);
  }
  
  void a(double paramDouble)
    throws Exception
  {
    this.b = zc.a(paramDouble);
    a(this.b);
  }
  
  long b()
    throws Exception
  {
    return this.a.i();
  }
  
  void b(long paramLong)
    throws Exception
  {
    this.a.a(paramLong, 0);
  }
  
  void c() {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */