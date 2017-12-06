package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zh;
import java.util.ArrayList;
import java.util.Iterator;

class zbcj
  extends CollectionBase
{
  boolean a = false;
  boolean b;
  boolean c = true;
  boolean d = true;
  int e = 30;
  boolean f;
  boolean g = true;
  boolean h = true;
  int i = 0;
  int j = 1;
  int k = 6;
  byte[] l;
  byte[] m;
  zbcu n = new zbcu();
  Workbook o;
  int p;
  String q;
  boolean r;
  long s;
  String t;
  
  zbcj(Workbook paramWorkbook)
  {
    this.o = paramWorkbook;
  }
  
  public zbci a(int paramInt)
  {
    return (zbci)this.InnerList.get(paramInt);
  }
  
  public int a(zbci paramzbci)
  {
    zf.a(this.InnerList, paramzbci);
    return this.InnerList.size() - 1;
  }
  
  void a(boolean paramBoolean)
  {
    zbcl localzbcl = new zbcl(this.o.getWorksheets(), paramBoolean);
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbci localzbci = (zbci)localIterator.next();
      localzbci.c.a(localzbcl);
    }
  }
  
  void a()
  {
    this.l = zh.b().a();
    zbci localzbci = new zbci(this);
    a(localzbci);
    localzbci.b.b = zh.b().a();
    localzbci.b.a = DateTime.getNow();
    int i1 = this.o.getWorksheets().getCount();
    localzbci.b.e = (i1 + 1);
    localzbci.b.f = "Administrator";
    localzbci.b.g = new int[i1];
    for (int i2 = 1; i2 <= i1; i2++) {
      localzbci.b.g[(i2 - 1)] = i2;
    }
    zbct localzbct = new zbct();
    this.n.a(localzbct);
    localzbct.b = zh.b().a();
    localzbct.d = "Administrator";
    localzbct.c = -524803953;
    localzbct.a = localzbci.b.a;
  }
  
  void a(zcw paramzcw)
  {
    zbcq localzbcq = new zbcq(this.o.getWorksheets());
    for (int i1 = 0; i1 < getCount(); i1++)
    {
      zbci localzbci = a(i1);
      localzbci.c.a(paramzcw, localzbcq);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */