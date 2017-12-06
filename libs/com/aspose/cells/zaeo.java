package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.a.d.zhb;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zaeo
{
  public zaet a = new zbri(this);
  public zaet b = new zbss(this);
  public zaet c = new zaql(this);
  public zaet d = new zajy(this);
  public zaet e = new zzq(this);
  public zaet f = new znu(this);
  public zaet g;
  public String h;
  public Font i;
  public Worksheet j;
  public int k;
  public int l;
  public float m;
  public float n;
  public float o;
  public zaer p;
  private HashMap s;
  private PageSetup t;
  public double[] q;
  boolean r;
  
  public void a(String paramString)
  {
    int i1 = paramString.indexOf(',');
    if (i1 == -1)
    {
      this.i.setName(paramString);
      return;
    }
    this.i.setName(paramString.substring(0, 0 + i1));
    if (this.i.getName().startsWith("+")) {
      this.i.setName(this.j.d().getDefaultStyle().q().getName());
    }
    paramString = paramString.substring(i1 + 1);
    String[] arrayOfString = zw.d(paramString, ' ');
    for (int i2 = 0; i2 < arrayOfString.length; i2++) {
      zzp.a(this.i, arrayOfString[i2]);
    }
  }
  
  public int a(String[] paramArrayOfString)
    throws Exception
  {
    String str = paramArrayOfString[0];
    this.r = zax.a(str);
    int i1 = 1;
    try
    {
      while ((paramArrayOfString[0].length() > 0) && (i1 == 1)) {
        i1 = this.g.a(paramArrayOfString);
      }
    }
    catch (Exception localException)
    {
      return i1;
    }
    if (this.h.length() > 0) {
      d();
    }
    return i1;
  }
  
  public void a() {}
  
  public void b()
  {
    this.p.a();
  }
  
  public void c()
    throws Exception
  {
    Picture localPicture = e();
    this.p.a(a(localPicture.b() - 1), new zt((float)(localPicture.getWidthPt() * this.q[0]), (float)(localPicture.getHeightPt() * this.q[1])));
  }
  
  public void d()
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zqb localzqb = new zqb();
    com.aspose.cells.b.a.a.zf.a(localArrayList, localzqb);
    localzqb.b = new Font(this.j.c(), null, false);
    localzqb.b.a(this.i, null);
    localzqb.b.setDoubleSize(Math.max(1.0D, localzqb.b.getDoubleSize() * this.q[1]));
    localzqb.a = this.h;
    Object localObject2;
    if (!zav.a().a(localzqb.b.getName(), localzqb.b.p(), localzqb.a))
    {
      localObject1 = this.j.d().getDefaultStyle().q();
      localObject2 = this.p.i.b().a(localzqb.b.getName(), localzqb.b.p(), false, localzqb.a);
      if (localObject2 != null) {
        localzqb.b.setName((String)localObject2);
      } else {
        zavt.a(localArrayList, this.j.d(), false, this.p.i.b());
      }
    }
    Object localObject1 = localArrayList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zqb)((Iterator)localObject1).next();
      this.p.a((zqb)localObject2, this.r);
    }
    this.h = "";
  }
  
  public zaeo(zaer paramzaer, Worksheet paramWorksheet, HashMap paramHashMap, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    this.j = paramWorksheet;
    this.i = new Font(paramWorksheet.c(), null, false);
    this.i.a(this.j.d().getDefaultStyle().q(), null);
    this.g = this.a;
    this.s = paramHashMap;
    this.p = paramzaer;
    this.k = paramInt1;
    this.l = paramInt2;
    this.q = this.p.f;
    this.t = this.j.getPageSetup();
    this.h = "";
    this.m = ((float)paramDouble1 * 72.0F);
    this.n = ((float)paramDouble2 * 72.0F);
    switch (this.p.g)
    {
    case 7: 
    case 8: 
      this.o = (this.m * 0.8F);
      break;
    case 1: 
      this.o = (this.m * 0.8F);
    }
    if (this.j.getType() == 2) {
      this.t = this.j.getCharts().get(0).getPageSetup();
    }
    a();
  }
  
  private zh a(int paramInt)
    throws Exception
  {
    if (this.s.get(Integer.valueOf(paramInt)) != null)
    {
      localObject = (zh)this.s.get(Integer.valueOf(paramInt));
      ((zh)localObject).a(0L, 0);
      return (zh)localObject;
    }
    if (paramInt >= this.j.d().getWorksheets().N().b().getCount()) {
      return new zh();
    }
    Object localObject = zawd.a(this.j.d().getWorksheets().N().b().a(paramInt));
    zcf localzcf = this.j.d().getWorksheets().N().b().a(paramInt);
    zh localzh = new zh();
    if (((zawc)localObject).a() != null)
    {
      localzh.b(((zawc)localObject).a(), 0, ((zawc)localObject).a().length);
      localzh.a(0L, 0);
      zj localzj = zj.a(localzh);
      if ((localzj instanceof com.aspose.cells.b.a.b.b.zf)) {
        return localzh;
      }
      localzh = new zh();
      if ((localzj.i() < 8) || (localzj.h() < 8)) {
        zcc.a(localzj, localzh);
      } else {
        switch (localzj.c())
        {
        case 137224: 
        case 139273: 
          zcc.a(localzj, localzh, 100L);
          break;
        case 15: 
        case 65536: 
        case 131072: 
        case 197634: 
        case 198659: 
        case 1060876: 
          zcc.b(localzj, localzh);
          break;
        default: 
          zcc.b(localzj, localzh);
        }
      }
      localzj.d();
      this.s.put(Integer.valueOf(paramInt), localzh);
      localzh.a(0L, 0);
      return localzh;
    }
    return new zh();
  }
  
  private Picture e()
  {
    Picture localPicture = null;
    this.t = this.j.getPageSetup();
    ShapeCollection localShapeCollection = this.t.j();
    int i1 = 0;
    switch (this.p.g)
    {
    case 7: 
      i1 = 0;
      break;
    case 1: 
      i1 = 1;
      break;
    case 8: 
      i1 = 2;
    }
    boolean bool1 = true;
    if (this.p.h == 0) {
      bool1 = false;
    }
    boolean bool2 = (this.t.isHFDiffFirst()) && (this.k == 1);
    boolean bool3 = (this.t.isHFDiffOddEven()) && (this.k % 2 == 0);
    if (localShapeCollection != null) {
      localPicture = this.t.getPicture(bool2, bool3, bool1, i1);
    }
    return localPicture;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */