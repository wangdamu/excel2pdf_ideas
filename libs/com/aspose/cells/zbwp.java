package com.aspose.cells;

import com.aspose.cells.a.c.zw;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import java.util.Iterator;

class zbwp
  extends zcd
{
  zbwp()
  {
    c(2198);
  }
  
  zbwp(int paramInt)
  {
    c(2198);
    b(16);
    this.b = new byte[16];
    this.b[0] = -106;
    this.b[1] = 8;
    System.arraycopy(zc.a(paramInt), 0, this.b, 12, 4);
  }
  
  private static zcjz a(String paramString, zj paramzj)
    throws Exception
  {
    com.aspose.cells.a.f.zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    zcjz localzcjz = new zcjz(paramzj, Encoding.getUTF8());
    localzcjz.a(1);
    return localzcjz;
  }
  
  private void a(zi paramzi, zj paramzj)
    throws Exception
  {
    Iterator localIterator = paramzi.iterator();
    while (localIterator.hasNext())
    {
      com.aspose.cells.a.f.zh localzh = (com.aspose.cells.a.f.zh)localIterator.next();
      if (!localzh.c()) {
        a(localzh, localzh.b(), paramzi, paramzj);
      }
    }
  }
  
  private void a(com.aspose.cells.a.f.zh paramzh, String paramString, zi paramzi, zj paramzj)
    throws Exception
  {
    com.aspose.cells.a.f.zh localzh = paramzj.a(paramString);
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    byte[] arrayOfByte = new byte['Ѐ'];
    int i = 0;
    zm localzm = paramzi.a(paramzh);
    do
    {
      i = localzm.a(arrayOfByte, 0, arrayOfByte.length);
      paramzj.b(arrayOfByte, 0, i);
    } while (i > 0);
    localzm.a();
    paramzj.b();
  }
  
  void a(Workbook paramWorkbook, int paramInt)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh();
    zj localzj = new zj(localzh1);
    com.aspose.cells.b.a.d.zh localzh2 = new com.aspose.cells.b.a.d.zh();
    byte[] arrayOfByte = zw.b();
    localzh2.b(arrayOfByte, 0, arrayOfByte.length);
    localzh2.a(0L, 0);
    zi localzi = zi.a(localzh2);
    a(localzi, localzj);
    zcjz localzcjz = a("theme/theme/theme1.xml", localzj);
    zvt localzvt = new zvt(paramWorkbook);
    localzvt.a(localzcjz);
    localzcjz.e();
    localzj.f_();
    if (localzh1.h() + 16L <= 8224L)
    {
      a((short)(int)(localzh1.h() + 16L));
      this.b = new byte[d()];
      this.b[0] = -106;
      this.b[1] = 8;
      if (paramInt != -1) {
        System.arraycopy(zc.a(paramInt), 0, this.b, 12, 4);
      }
      System.arraycopy(localzh1.m(), 0, this.b, 16, (int)localzh1.h());
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (d() == 0) {
      return;
    }
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a(d()), 0, arrayOfByte, 2, 2);
    paramzrg.a(arrayOfByte);
    paramzrg.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbwp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */