package com.aspose.cells;

import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zs;

class zak
  extends ztp
{
  private byte[] b;
  
  zak(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("ax:ocx");
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(this.b, 0, arrayOfByte, 0, arrayOfByte.length);
    zh localzh = new zh(arrayOfByte);
    paramzcjz.a("ax:classid", "{" + zs.a(localzh) + "}");
    paramzcjz.a("r:id", "rId1");
    paramzcjz.a("xmlns:ax", "http://schemas.microsoft.com/office/2006/activeX");
    paramzcjz.a("ax:persistence", "persistStreamInit");
    paramzcjz.a("xmlns:r", zaty.e);
    paramzcjz.b();
    paramzcjz.e();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */