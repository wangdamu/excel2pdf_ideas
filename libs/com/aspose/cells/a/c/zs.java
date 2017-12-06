package com.aspose.cells.a.c;

import java.security.MessageDigest;

public class zs
{
  MessageDigest a;
  
  public zs()
  {
    try
    {
      this.a = MessageDigest.getInstance("MD5");
    }
    catch (Exception localException) {}
  }
  
  public void a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    this.a.update(paramArrayOfByte1, paramInt1, paramInt2);
  }
  
  public void a()
  {
    this.a.reset();
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.a.update(paramArrayOfByte, paramInt1, paramInt2);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public byte[] b()
  {
    return this.a.digest();
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return this.a.digest(paramArrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */