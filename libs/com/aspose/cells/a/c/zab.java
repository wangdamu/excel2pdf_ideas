package com.aspose.cells.a.c;

import com.aspose.cells.DateTime;
import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.d.zm;

public class zab
{
  private zj a;
  
  public zab(zm paramzm)
    throws Exception
  {
    this.a = new zj(paramzm);
    this.a.c(1);
  }
  
  public void a(String paramString, zm paramzm)
    throws Exception
  {
    zh localzh = new zh(paramString);
    localzh.a(DateTime.getNow());
    this.a.a(localzh);
    byte[] arrayOfByte = new byte['Ѐ'];
    int i = 0;
    do
    {
      i = paramzm.a(arrayOfByte, 0, arrayOfByte.length);
      this.a.b(arrayOfByte, 0, i);
    } while (i > 0);
    this.a.b();
    this.a.l();
  }
  
  public void a()
    throws Exception
  {
    this.a.b();
    this.a.f_();
  }
  
  public void a(int paramInt)
  {
    this.a.a(paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */