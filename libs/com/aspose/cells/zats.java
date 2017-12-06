package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zats
{
  private zcjy a;
  private zasg b;
  private Worksheet c;
  private zash d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private HashMap k;
  private HashMap l;
  private int m;
  private int n;
  private int o;
  private int p = 255;
  private static final za q = new za(new String[] { "name", "style-name", "print-ranges", "table-column", "table-row", "table-header-rows", "table-header-columns", "table-column-group", "table-row-group", "number-columns-repeated", "default-cell-style-name", "table-cell", "covered-table-cell", "number-rows-repeated", "value-type" });
  
  zats(zasg paramzasg)
  {
    this.b = paramzasg;
  }
  
  private void a()
  {
    this.i = (this.j = -1);
    this.e = (this.f = -1);
    this.g = (this.h = -1);
    this.l = new HashMap();
    this.k = new HashMap();
  }
  
  private void b()
  {
    if (this.c == null) {
      return;
    }
    String str1 = "";
    if (this.f != -1) {
      str1 = "$" + (this.e + 1) + ":$" + (this.f + 1);
    }
    if (this.h != -1)
    {
      if (this.f != -1) {
        str1 = str1 + ",";
      }
      str1 = str1 + "$" + CellsHelper.columnIndexToName(this.g) + ":$" + CellsHelper.columnIndexToName(this.h);
    }
    if (!"".equals(str1)) {
      this.c.getPageSetup().a(str1);
    }
    int i1 = this.n + 255 - this.o;
    double d1 = 64.8D;
    Iterator localIterator = this.l.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      int i3 = ((Integer)this.l.get(localObject)).intValue();
      if (i3 > i1)
      {
        i3 = i1;
        zasa localzasa = (zasa)this.b.f.get(localObject);
        if (localzasa != null) {
          d1 = localzasa.a();
        }
      }
    }
    this.d.f = d1;
    this.d.a.getCells().setStandardWidthInch(d1 / 72.0D);
    this.d.a(this.i);
    int i2 = 274;
    i1 = this.n;
    Object localObject = this.k.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str2 = (String)((Iterator)localObject).next();
      int i4 = ((Integer)this.k.get(str2)).intValue();
      if (i4 > i1)
      {
        zasl localzasl = (zasl)this.b.d.get(str2);
        if (localzasl != null)
        {
          i2 = localzasl.b();
          i1 = i4;
        }
      }
    }
    this.d.a.getCells().a(i2);
  }
  
  private void a(String paramString)
  {
    paramString = zw.a(paramString, this.c.getName() + ".", "");
    paramString = zw.a(paramString, "'" + this.c.getName() + "'.", "");
    paramString = paramString.replace(' ', ',');
    paramString = zw.a(paramString, ":.", ":");
    this.c.getPageSetup().setPrintArea(paramString);
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.a = paramzcjy;
    a();
    String str1 = null;
    String str2 = null;
    if (paramzcjy.n())
    {
      localObject = null;
      while (paramzcjy.m()) {
        switch (q.a(paramzcjy.q().toLowerCase()))
        {
        case 0: 
          localObject = paramzcjy.t();
          break;
        case 1: 
          str1 = paramzcjy.t();
          break;
        case 2: 
          str2 = paramzcjy.t();
        }
      }
      int i1;
      if (localObject != null)
      {
        i1 = this.b.b.getWorksheets().c((String)localObject);
        this.c = this.b.b.getWorksheets().get(i1);
      }
      else
      {
        i1 = this.b.b.getWorksheets().add();
        this.c = this.b.b.getWorksheets().get(i1);
      }
      paramzcjy.l();
    }
    this.d = new zash(this.b, this.c);
    zf.a(this.b.n, this.d);
    Object localObject = (zasm)this.b.m.get(str1);
    if (!((zasm)localObject).b()) {
      this.c.a(false, false);
    }
    switch (((zasm)localObject).c())
    {
    case 1: 
    case 2: 
    case 5: 
      this.c.setDisplayRightToLeft(true);
      break;
    }
    if (((zasm)localObject).a() != null)
    {
      zasi localzasi = (zasi)this.b.l.get(((zasm)localObject).a());
      if (localzasi != null) {
        localzasi.a(this.c.getPageSetup(), this.b);
      }
    }
    if (str2 != null) {
      a(str2);
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (q.a(paramzcjy.q().toLowerCase()))
      {
      case 3: 
        e();
        break;
      case 4: 
        h();
        break;
      case 5: 
        f();
        break;
      case 6: 
        c();
        break;
      case 7: 
        d();
        break;
      case 8: 
        g();
        break;
      default: 
        paramzcjy.a();
      }
    }
    b();
  }
  
  private void c()
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    if (this.g == -1) {
      this.g = (this.j + 1);
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (q.a(this.a.q().toLowerCase()))
      {
      case 3: 
        e();
        break;
      case 6: 
        c();
        break;
      case 7: 
        d();
        break;
      case 4: 
      case 5: 
      default: 
        this.a.a();
      }
    }
    this.h = this.j;
  }
  
  private void d()
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (q.a(this.a.q().toLowerCase()))
      {
      case 3: 
        e();
        break;
      case 6: 
        c();
        break;
      case 7: 
        d();
        break;
      case 4: 
      case 5: 
      default: 
        this.a.a();
      }
    }
  }
  
  private void e()
    throws Exception
  {
    String str1 = null;
    int i1 = 1;
    String str2 = null;
    if (this.a.n()) {
      while (this.a.m()) {
        switch (q.a(this.a.q().toLowerCase()))
        {
        case 1: 
          str1 = this.a.t();
          break;
        case 9: 
          i1 = zp.a(this.a.t());
          break;
        case 10: 
          str2 = this.a.t();
        }
      }
    }
    this.a.a();
    if (str1 == null)
    {
      this.m += i1;
    }
    else
    {
      localObject1 = (zasa)this.b.f.get(str1);
      if ((localObject1 == null) || (Math.abs(((zasa)localObject1).a() - 64.8D) < 1.0E-4D))
      {
        this.m += i1;
      }
      else if (this.l.get(str1) == null)
      {
        this.l.put(str1, Integer.valueOf(i1));
      }
      else
      {
        int i2 = ((Integer)this.l.get(str1)).intValue();
        this.l.put(str1, Integer.valueOf(i2 + i1));
      }
    }
    Object localObject1 = new zarz();
    if (str2 == null)
    {
      ((zarz)localObject1).e = this.b.p;
      ((zarz)localObject1).f = 15;
    }
    else
    {
      ((zarz)localObject1).e = str2;
      Object localObject2 = this.b.c.get(str2);
      if (localObject2 != null)
      {
        zbzv localzbzv = (zbzv)this.b.b.getWorksheets().C();
        Style localStyle = localzbzv.a(((Integer)localObject2).intValue());
        if ((localStyle.getName() != null) && (!"".equals(localStyle.getName()))) {
          ((zarz)localObject1).f = localzbzv.a(localStyle, ((Integer)localObject2).intValue());
        } else {
          ((zarz)localObject1).f = ((Integer)localObject2).intValue();
        }
      }
    }
    ((zarz)localObject1).b = (this.j + 1);
    ((zarz)localObject1).a = i1;
    this.j += i1;
    zf.a(this.d.c, localObject1);
  }
  
  private void f()
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    if (this.e == -1) {
      this.e = (this.i + 1);
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (q.a(this.a.q().toLowerCase()))
      {
      case 4: 
        h();
        break;
      case 5: 
        f();
        break;
      case 8: 
        g();
        break;
      case 6: 
      case 7: 
      default: 
        this.a.a();
      }
    }
    this.f = this.i;
  }
  
  private void g()
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    this.a.d();
    while (zauz.a(this.a)) {
      switch (q.a(this.a.q().toLowerCase()))
      {
      case 4: 
        h();
        break;
      case 5: 
        f();
        break;
      case 8: 
        g();
        break;
      case 6: 
      case 7: 
      default: 
        this.a.a();
      }
    }
  }
  
  private void h()
    throws Exception
  {
    int i1 = i();
    int i5;
    if (this.a.o())
    {
      this.a.a();
      localObject1 = this.b.p;
      for (int i2 = 0; i2 < this.d.c.size(); i2++)
      {
        zarz localzarz = (zarz)this.d.c.get(i2);
        HashMap localHashMap = localzarz.g;
        if (localHashMap.get(localObject1) != null)
        {
          i5 = ((Integer)localHashMap.get(localObject1)).intValue();
          localHashMap.put(localObject1, Integer.valueOf(i5 + i1));
        }
        else
        {
          localHashMap.put(localObject1, Integer.valueOf(i1));
        }
      }
      this.i += i1;
      return;
    }
    this.j = -1;
    Object localObject1 = new HashMap();
    this.a.d();
    while (zauz.a(this.a)) {
      switch (q.a(this.a.q().toLowerCase()))
      {
      case 11: 
      case 12: 
        a((HashMap)localObject1, i1);
        break;
      default: 
        this.a.a();
      }
    }
    if (this.j > this.p) {
      this.p = 1023;
    }
    if (((HashMap)localObject1).size() != 0)
    {
      Object localObject2 = null;
      int i3 = 0;
      int i4 = 0;
      if (this.j < this.p) {
        if (((HashMap)localObject1).get("default") != null)
        {
          i5 = ((Integer)((HashMap)localObject1).get("default")).intValue();
          i5 += this.p - this.j;
          ((HashMap)localObject1).put("default", Integer.valueOf(i5));
        }
        else
        {
          ((HashMap)localObject1).put("default", Integer.valueOf(this.p - this.j));
        }
      }
      Object localObject3 = ((HashMap)localObject1).keySet().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        String str = (String)((Iterator)localObject3).next();
        int i6 = ((Integer)((HashMap)localObject1).get(str)).intValue();
        if ("default".equals(str.toLowerCase()))
        {
          if (this.j < this.o) {
            i6 += this.o - this.j + 1;
          }
          i4 = 1;
        }
        if (i6 > i3)
        {
          i3 = i6;
          localObject2 = str;
        }
      }
      if ((i4 == 0) && (this.j <= this.p) && (i3 <= this.p - this.j + 1)) {
        localObject2 = null;
      }
      if ((localObject2 != null) && (!"default".equals(((String)localObject2).toLowerCase())))
      {
        localObject3 = new zatd();
        ((zatd)localObject3).a = (this.i + 1);
        ((zatd)localObject3).b = i1;
        ((zatd)localObject3).c = ((String)localObject2);
        zf.a(this.d.d, localObject3);
      }
    }
    this.i += i1;
  }
  
  private int i()
    throws Exception
  {
    if (this.i == -1) {
      this.o = this.j;
    }
    String str = null;
    int i1 = 1;
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (q.a(this.a.q().toLowerCase()))
        {
        case 1: 
          str = this.a.t();
          break;
        case 13: 
          i1 = zp.a(this.a.t());
        }
      }
      this.a.l();
    }
    if (str == null)
    {
      this.n += i1;
    }
    else
    {
      zasl localzasl = (zasl)this.b.d.get(str);
      if ((localzasl == null) || (localzasl.b() == 274))
      {
        this.n += i1;
      }
      else if (this.k.get(str) == null)
      {
        this.k.put(str, Integer.valueOf(i1));
      }
      else
      {
        int i2 = ((Integer)this.k.get(str)).intValue();
        this.k.put(str, Integer.valueOf(i2 + i1));
      }
    }
    return i1;
  }
  
  private void a(HashMap paramHashMap, int paramInt)
    throws Exception
  {
    int i1 = 1;
    String str1 = null;
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (q.a(this.a.q().toLowerCase()))
        {
        case 9: 
          i1 = zp.a(this.a.t());
          break;
        case 1: 
          str1 = this.a.t();
        }
      }
      this.a.l();
    }
    this.a.a();
    String str2 = str1;
    if ((str1 == null) || (zw.a(str1, "defaut", true) == 0)) {
      str2 = "default";
    }
    if (paramHashMap.get(str2) != null)
    {
      i2 = ((Integer)paramHashMap.get(str2)).intValue();
      paramHashMap.put(str2, Integer.valueOf(i2 + i1));
    }
    else
    {
      paramHashMap.put(str2, Integer.valueOf(i1));
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = this.j + i2 + 1;
      String str3 = str1;
      if (str1 == null)
      {
        localzarz = this.d.d(i3);
        str3 = (localzarz == null) || (localzarz.e == null) ? this.b.p : localzarz.e;
      }
      zarz localzarz = this.d.a(i3, i1 - i2);
      HashMap localHashMap = localzarz.g;
      if (localHashMap.get(str3) != null)
      {
        int i4 = ((Integer)localHashMap.get(str3)).intValue();
        localHashMap.put(str3, Integer.valueOf(i4 + paramInt));
      }
      else
      {
        localHashMap.put(str3, Integer.valueOf(paramInt));
      }
      i2 += localzarz.a - 1;
    }
    this.j += i1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */