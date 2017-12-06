package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;
import java.util.Iterator;

abstract class ztv
  extends FontSetting
{
  FontSetting i;
  zt j = zt.a();
  private int a;
  ArrayList k;
  float l;
  float m;
  private int b;
  ArrayList n;
  
  Workbook a()
  {
    return this.s.p();
  }
  
  void a(ztv paramztv, CopyOptions paramCopyOptions)
  {
    this.j = paramztv.j;
    if ((paramztv.n != null) && (paramztv.d().size() > 0)) {
      zf.a(d(), paramztv.n);
    }
    this.b = paramztv.b;
    this.l = paramztv.l;
    this.m = paramztv.m;
    if (paramztv.k != null)
    {
      Iterator localIterator = paramztv.k.iterator();
      while (localIterator.hasNext())
      {
        ztv localztv1 = (ztv)localIterator.next();
        ztv localztv2 = a(localztv1.b(), a(), this);
        localztv2.a(localztv1, paramCopyOptions);
      }
    }
  }
  
  void a(FontSetting paramFontSetting, CopyOptions paramCopyOptions)
  {
    a((ztv)paramFontSetting, paramCopyOptions);
  }
  
  ztv a(int paramInt, Workbook paramWorkbook, FontSetting paramFontSetting)
  {
    Object localObject1 = null;
    Object localObject2;
    switch (paramInt)
    {
    case 22: 
      localObject1 = new zbwg(paramWorkbook, paramFontSetting);
      c().add(localObject1);
      break;
    case 0: 
      ztw localztw = new ztw(paramWorkbook, paramFontSetting, null);
      c().add(localztw);
      localObject1 = localztw;
      break;
    case 5: 
      localObject2 = new zack(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 2: 
      localObject2 = new zbtl(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 15: 
      localObject2 = new zbtf(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    case 9: 
    case 12: 
    case 17: 
      localObject2 = new zbtd(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 10: 
      localObject2 = new zsa(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 11: 
      localObject2 = new zaqk(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 13: 
      localObject2 = new zayn(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 16: 
      localObject2 = new zbte(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 18: 
      localObject2 = new zaf(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 19: 
      localObject2 = new zci(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 20: 
      localObject2 = new zdj(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 21: 
      localObject2 = new zdp(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
      break;
    case 1: 
    case 8: 
    case 14: 
    default: 
      localObject2 = new zbxq(paramWorkbook, paramFontSetting, paramInt);
      c().add(localObject2);
      localObject1 = localObject2;
    }
    return (ztv)localObject1;
  }
  
  public int getType()
  {
    return 2;
  }
  
  int b()
  {
    return this.a;
  }
  
  ztv(Workbook paramWorkbook, FontSetting paramFontSetting, int paramInt)
  {
    super(0, 0, paramWorkbook.getWorksheets());
    this.i = paramFontSetting;
    this.a = paramInt;
  }
  
  ArrayList c()
  {
    if (this.k == null) {
      this.k = new ArrayList();
    }
    return this.k;
  }
  
  boolean c(int paramInt)
  {
    return (this.b & paramInt) != 0;
  }
  
  void d(int paramInt)
  {
    this.b |= paramInt;
  }
  
  ArrayList d()
  {
    if (this.n == null) {
      this.n = new ArrayList();
    }
    return this.n;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ztv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */