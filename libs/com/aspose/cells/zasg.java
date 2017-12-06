package com.aspose.cells;

import com.aspose.cells.a.f.zh;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;
import java.util.HashMap;

class zasg
{
  double a;
  Workbook b;
  HashMap c;
  HashMap d;
  HashMap e;
  HashMap f;
  HashMap g;
  HashMap h;
  HashMap i;
  HashMap j;
  zi k = null;
  HashMap l;
  HashMap m;
  ArrayList n;
  zarx o;
  String p = "Default";
  HashMap q;
  
  String a(String paramString)
  {
    zasz localzasz = (zasz)this.e.get(paramString);
    if (localzasz == null) {
      return null;
    }
    return localzasz.a(this.e);
  }
  
  void a(String paramString1, String paramString2, ArrayList paramArrayList)
  {
    this.e.put(paramString1, new zasz(paramString2, paramArrayList));
  }
  
  zasg(Workbook paramWorkbook)
  {
    this.b = paramWorkbook;
    this.a = zbxp.a();
    this.c = new HashMap();
    this.d = new HashMap();
    this.f = new HashMap();
    this.e = new HashMap();
    this.h = new HashMap();
    this.i = new HashMap();
    this.j = new HashMap();
    this.l = new HashMap();
    this.g = new HashMap();
    this.m = new HashMap();
    this.n = new ArrayList();
    this.o = new zarx();
    this.q = new HashMap();
  }
  
  zm b(String paramString)
    throws Exception
  {
    zi localzi = this.k;
    zh localzh = localzi.a(paramString);
    if (localzh == null) {
      return null;
    }
    zm localzm = localzi.a(localzh);
    return localzm;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */