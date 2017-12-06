package com.aspose.cells.a.c;

import com.aspose.cells.Color;
import com.aspose.cells.ImageFormat;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.e.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zx;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;

public class zd
  implements zj
{
  private za a;
  private int b;
  
  public zd(int paramInt1, int paramInt2)
  {
    a(zcc.a(paramInt1, paramInt2));
  }
  
  public zd(byte[] paramArrayOfByte)
    throws Exception
  {
    a(new za(new zh(paramArrayOfByte)));
  }
  
  public zd(zx paramzx)
  {
    a((za)paramzx.a());
  }
  
  private void a(za paramza)
  {
    this.a = paramza;
    this.b = zcc.b(this.a.e());
  }
  
  public void dispose()
  {
    a();
    zg.a(this);
  }
  
  public void a()
  {
    if (this.a != null)
    {
      this.a.d();
      this.a = null;
    }
  }
  
  public int b()
  {
    return this.b;
  }
  
  public void a(int paramInt1, int paramInt2, Color paramColor)
  {
    this.a.a(paramInt1, paramInt2, paramColor);
  }
  
  public void a(zm paramzm, int paramInt)
  {
    switch (paramInt)
    {
    case 8: 
      a(this.a, paramzm, 5, false);
      break;
    case 5: 
      a(this.a, paramzm);
      break;
    case 4: 
      a(this.a, paramzm, 80);
      break;
    case 6: 
    case 7: 
    default: 
      throw new IllegalStateException("Cannot save in this image format.");
    }
  }
  
  public void b(zm paramzm, int paramInt)
  {
    a(this.a, paramzm, paramInt);
  }
  
  private static void a(za paramza, zm paramzm)
  {
    try
    {
      paramza.a(paramzm, ImageFormat.getPng());
    }
    catch (Exception localException)
    {
      zf.a(localException);
    }
  }
  
  private static void a(za paramza, zm paramzm, int paramInt)
  {
    try
    {
      zcc.a(paramza, paramzm, paramInt);
    }
    catch (Exception localException)
    {
      zf.a(localException);
    }
  }
  
  private static void a(za paramza, zm paramzm, int paramInt, boolean paramBoolean) {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */