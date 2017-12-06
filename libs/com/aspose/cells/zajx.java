package com.aspose.cells;

import com.aspose.cells.a.c.zz;
import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zajx
  extends zahw
{
  IconSet a;
  private Style g;
  private static Object h = new Object();
  static com.aspose.cells.a.f.zi e = null;
  static HashMap f = null;
  
  public zajx(IconSet paramIconSet, zaca paramzaca, zgs paramzgs, ArrayList paramArrayList)
  {
    super(paramzaca, paramzgs, paramArrayList);
    if (paramzgs != null) {
      this.g = (paramzgs.b < 0 ? paramzaca.p.e.Q() : paramzaca.p.e.C().a(paramzgs.b));
    }
    this.a = paramIconSet;
  }
  
  static zj a(int paramInt)
    throws Exception
  {
    synchronized (h)
    {
      if (e == null)
      {
        e = com.aspose.cells.a.f.zi.a(zz.a("Aspose.Cells.StyleObject.ConditionStyle.IconImages.zip"));
        f = new HashMap();
      }
      zj localzj = (zj)f.get(Integer.valueOf(paramInt));
      if (localzj == null)
      {
        com.aspose.cells.a.f.zh localzh = e.a(ztt.c(paramInt) + ".png");
        com.aspose.cells.b.a.d.za localza = new com.aspose.cells.b.a.d.za(e.a(localzh));
        byte[] arrayOfByte = new byte[(int)localzh.a()];
        localza.a(arrayOfByte, 0, arrayOfByte.length);
        localza.l();
        com.aspose.cells.b.a.d.zh localzh1 = new com.aspose.cells.b.a.d.zh(arrayOfByte);
        localzj = com.aspose.cells.b.a.b.za.a(localzh1);
        f.put(Integer.valueOf(paramInt), localzj);
      }
      return localzj;
    }
  }
  
  static com.aspose.cells.b.a.d.zh a(int paramInt1, int paramInt2)
    throws Exception
  {
    int i = c(paramInt1) - 1 - paramInt2;
    zj localzj = a(paramInt1);
    com.aspose.cells.b.a.b.za localza = new com.aspose.cells.b.a.b.za(16, 16);
    com.aspose.cells.b.a.b.zi localzi = com.aspose.cells.b.a.b.zi.a(localza);
    synchronized (h)
    {
      localzi.a(localzj, new com.aspose.cells.b.a.b.zp(0, 0, 16, 16), new com.aspose.cells.b.a.b.zp(0, i * 24, 16, 16), 2);
    }
    localzi.e();
    ??? = new com.aspose.cells.b.a.d.zh();
    localza.a((zm)???, ImageFormat.getPng());
    ((com.aspose.cells.b.a.d.zh)???).b();
    return (com.aspose.cells.b.a.d.zh)???;
  }
  
  protected void b(zaca paramzaca)
  {
    zgs localzgs = paramzaca.g.getRows().a.a(paramzaca.d, new zgs(paramzaca.e), 6);
    if (localzgs == null)
    {
      this.b = zabg.a;
      return;
    }
    this.b = zabt.a(localzgs.c, localzgs.d);
    this.g = (localzgs.b < 0 ? paramzaca.p.e.Q() : paramzaca.p.e.C().a(localzgs.b));
  }
  
  int b(int paramInt)
  {
    if (this.a.getType() == 21) {
      return this.a.getCfIcons().get(paramInt).getType();
    }
    return this.a.getType();
  }
  
  int a()
  {
    zaca localzaca = null;
    if (this.b == null)
    {
      localzaca = d();
      b(localzaca);
    }
    if (this.b.b() != 3)
    {
      if (localzaca != null) {
        a(localzaca);
      }
      return -1;
    }
    ArrayList localArrayList = new ArrayList();
    if (localzaca == null) {
      localzaca = d();
    }
    try
    {
      Iterator localIterator = this.a.getCfvos().iterator();
      while (localIterator.hasNext())
      {
        ConditionalFormattingValue localConditionalFormattingValue1 = (ConditionalFormattingValue)localIterator.next();
        if (localConditionalFormattingValue1.f() != null) {
          zf.a(localArrayList, Double.valueOf(a(localConditionalFormattingValue1, localzaca).o()));
        }
      }
      a(localzaca);
      localzaca = null;
      double d1 = ((zabb)this.b).o();
      for (int i = this.a.getCfvos().getCount() - 1; i >= 0; i--)
      {
        ConditionalFormattingValue localConditionalFormattingValue2 = this.a.getCfvos().get(i);
        double d2 = ((Double)localArrayList.get(i)).doubleValue();
        if (localConditionalFormattingValue2.isGTE())
        {
          if (d1 >= d2) {
            return i;
          }
        }
        else if (d1 > d2) {
          return i;
        }
      }
    }
    catch (Exception localException)
    {
      return -1;
    }
    return 0;
  }
  
  public ArrayList a(zq paramzq)
    throws Exception
  {
    int i = this.a.getCfvos().getCount();
    int j = a();
    if (j == -1) {
      return null;
    }
    com.aspose.cells.b.a.d.zh localzh = null;
    if (this.a.getType() == 21)
    {
      if (this.a.getCfIcons().get(j).getType() == 20)
      {
        localzh = null;
      }
      else
      {
        int k = this.a.getCfIcons().get(j).getType();
        localzh = a(k, this.a.getCfIcons().get(j).getIndex());
      }
    }
    else
    {
      if (this.a.b) {
        j = i - 1 - j;
      }
      localzh = a(this.a.getType(), j);
    }
    String str = null;
    if (localzh != null) {
      try
      {
        str = ze.a(localzh.m(), 0, (int)localzh.h());
      }
      catch (Exception localException)
      {
        com.aspose.cells.a.c.zl.b(localException);
      }
      finally
      {
        localzh.a();
      }
    }
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, str);
    zf.a(localArrayList, Integer.valueOf(16));
    zf.a(localArrayList, Integer.valueOf(16));
    return localArrayList;
  }
  
  private static com.aspose.cells.a.d.zl b(int paramInt1, int paramInt2)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = a(paramInt1, paramInt2);
    com.aspose.cells.a.d.zl localzl = com.aspose.cells.a.d.zl.a(new zo(0.0F, 0.0F), new zt(12.0F, 12.0F), localzh);
    return localzl;
  }
  
  public zb a(zq paramzq, double[] paramArrayOfDouble, int paramInt1, int paramInt2)
    throws Exception
  {
    int i = this.a.getCfvos().getCount();
    int j = a();
    if (j == -1) {
      return null;
    }
    com.aspose.cells.a.d.zl localzl = null;
    if (this.a.getType() == 21)
    {
      if (this.a.getCfIcons().get(j).getType() == 20)
      {
        localzl = null;
      }
      else
      {
        int k = this.a.getCfIcons().get(j).getType();
        localzl = b(k, this.a.getCfIcons().get(j).getIndex());
      }
    }
    else
    {
      if (this.a.b) {
        j = i - 1 - j;
      }
      localzl = b(this.a.getType(), j);
    }
    zb localzb1 = new zb();
    zb localzb2 = new zb();
    if (localzl != null)
    {
      if (this.g == null) {
        this.g = this.c.getCells().getCellStyle(this.d.d, this.d.e);
      }
      localzb2.a(localzl);
      float f1 = (float)Math.min(paramArrayOfDouble[0], paramArrayOfDouble[1]);
      f1 *= this.g.getFont().getSize() / 11.0F;
      float f2 = 0.0F;
      float f3 = paramzq.j();
      switch (paramInt2)
      {
      case 9: 
        f2 = paramzq.k();
        break;
      case 1: 
        f2 = (paramzq.k() + paramzq.m()) / 2.0F - 6.0F * f1;
        break;
      default: 
        f2 = paramzq.m() - 12.0F * f1 - 1.0F;
      }
      if (!this.a.getShowValue()) {
        switch (paramInt1)
        {
        case 7: 
          break;
        case 1: 
          f3 = paramzq.j() + paramzq.h() / 2.0F - 6.0F * f1;
          break;
        case 8: 
          f3 = paramzq.j() + paramzq.h() - 12.0F * f1;
          break;
        default: 
          f3 = paramzq.j() + paramzq.h() / 2.0F - 6.0F * f1;
        }
      }
      localzb2.a(new com.aspose.cells.b.a.b.a.zi(f1, 0.0F, 0.0F, f1, f3, f2));
      localzb1.a(new com.aspose.cells.a.d.zp(paramzq));
      localzb1.a(localzb2);
    }
    return localzb1;
  }
  
  public boolean c()
  {
    return this.a.getShowValue();
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 17: 
    case 19: 
      return 3;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
      return 4;
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 18: 
      return 5;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zajx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */