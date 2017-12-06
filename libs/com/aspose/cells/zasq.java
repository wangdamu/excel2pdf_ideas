package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;
import java.util.HashMap;
import java.util.Iterator;

class zasq
{
  private zi a;
  private Workbook b;
  
  public zasq(zi paramzi, Workbook paramWorkbook)
  {
    this.a = paramzi;
    this.b = paramWorkbook;
  }
  
  public void a()
    throws Exception
  {
    String str = "Basic/";
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zh localzh = (zh)localIterator.next();
      if (localzh.b().startsWith(str))
      {
        zm localzm = this.a.a(localzh);
        byte[] arrayOfByte = a(localzm);
        localzm.a();
        if (arrayOfByte.length > 0) {
          this.b.k().put(localzh.b(), arrayOfByte);
        }
      }
    }
  }
  
  private byte[] a(zm paramzm)
    throws Exception
  {
    byte[] arrayOfByte = new byte[(int)paramzm.h()];
    paramzm.a(arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */