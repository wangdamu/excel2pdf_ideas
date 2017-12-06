package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zaer
{
  protected ArrayList a;
  protected zb b;
  protected zaus c;
  protected zt d = new zt();
  protected zq e = new zq();
  public double[] f = { 1.0D, 1.0D };
  public int g;
  public int h;
  private Workbook k;
  com.aspose.cells.a.d.zf i;
  zbyr j;
  
  public zaer(zavs paramzavs, zaus paramzaus, zbox paramzbox, PageSetup paramPageSetup, int paramInt1, int paramInt2, Workbook paramWorkbook, double paramDouble1, double paramDouble2, com.aspose.cells.a.d.zf paramzf)
  {
    this.i = paramzf;
    this.a = new ArrayList();
    a();
    this.b = paramzavs.c;
    this.j = paramzavs.a;
    this.c = paramzaus;
    this.g = paramInt1;
    this.h = paramInt2;
    this.k = paramWorkbook;
    if (paramPageSetup.isHFScaleWithDoc()) {
      this.f = paramzbox.c;
    }
    float f1;
    if (paramPageSetup.isHFAlignMargins()) {
      f1 = (float)paramPageSetup.getLeftMarginInch() * 72.0F;
    } else {
      f1 = 54.0F;
    }
    float f2 = Math.max((float)paramPageSetup.getHeaderMarginInch() * 72.0F, 1.0F);
    float f4 = Math.max((float)paramPageSetup.getFooterMarginInch() * 72.0F, 1.0F);
    float f3;
    if (paramPageSetup.isHFAlignMargins()) {
      f3 = (float)paramPageSetup.getRightMarginInch() * 72.0F;
    } else {
      f3 = 54.0F;
    }
    zo localzo = new zo(f1, f2);
    zt localzt = new zt((float)(paramDouble1 * 72.0D - f1 - f3), (float)(paramDouble2 * 72.0D - f2 - f4));
    this.e = new zq(localzo, localzt);
  }
  
  public zaeq a()
  {
    zaeq localzaeq = new zaeq();
    com.aspose.cells.b.a.a.zf.a(this.a, localzaeq);
    return localzaeq;
  }
  
  private zt c()
  {
    zt localzt = zt.a();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zaeq localzaeq = (zaeq)localIterator.next();
      if (localzt.b() < localzaeq.b) {
        localzt.a(localzaeq.b);
      }
      localzt.b(localzt.c() + localzaeq.a);
    }
    return localzt;
  }
  
  public void a(zqb paramzqb, boolean paramBoolean)
    throws Exception
  {
    zaeq localzaeq = (zaeq)this.a.get(this.a.size() - 1);
    boolean bool = zax.b(paramzqb.a);
    if ((bool) || (zax.a(paramzqb.a)))
    {
      localObject = new zcr();
      ArrayList localArrayList = ((zcr)localObject).a(paramzqb, bool);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zqb localzqb = (zqb)localIterator.next();
        localzqb.b.setName("Times New Roman");
        localzaeq.a(new zaeu(localzqb, this.i));
      }
      this.d = c();
      return;
    }
    Object localObject = new zaeu(paramzqb, this.i);
    if ((!paramBoolean) && (localzaeq.a()) && (localzaeq.b + ((zaeu)localObject).b > this.e.h()))
    {
      localzaeq = a();
      if ((paramzqb.a != null) && (paramzqb.a.startsWith(" ")))
      {
        paramzqb.a = zw.c(paramzqb.a);
        localObject = new zaeu(paramzqb, this.i);
      }
    }
    localzaeq.a((zaes)localObject);
    this.d = c();
  }
  
  public void a(zh paramzh, zt paramzt)
  {
    zaeq localzaeq = (zaeq)this.a.get(this.a.size() - 1);
    localzaeq.a(new zaep(paramzh, paramzt));
    this.d = c();
  }
  
  public void b()
    throws Exception
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    switch (this.h)
    {
    case 9: 
      f2 = this.e.k();
      break;
    case 0: 
      f2 = this.e.m() - this.d.c();
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      zaeq localzaeq = (zaeq)localIterator.next();
      switch (this.g)
      {
      case 7: 
        f1 = this.e.j();
        break;
      case 1: 
        f1 = this.e.j() + (this.e.h() / 2.0F - localzaeq.b / 2.0F);
        break;
      case 8: 
        f1 = this.e.l() - localzaeq.b;
      }
      zb[] arrayOfzb = { this.b };
      localzaeq.a(arrayOfzb, new zo(f1, f2));
      this.b = arrayOfzb[0];
      f2 += localzaeq.a;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */