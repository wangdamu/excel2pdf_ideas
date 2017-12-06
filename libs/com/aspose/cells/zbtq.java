package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import java.util.Iterator;

class zbtq
{
  int a;
  int b;
  int c;
  int d;
  short e;
  String f;
  String g;
  PivotField h;
  boolean i;
  
  zbtq() {}
  
  zbtq(PivotField paramPivotField)
  {
    this.h = paramPivotField;
    this.i = true;
    if (this.h.isCalculatedField()) {
      this.a = 0;
    } else if (this.h.g()) {
      this.a = 0;
    } else {
      this.a = 1;
    }
    this.g = this.h.getName();
    String str1 = (ztt.j(this.a) + " of " + this.g).toLowerCase();
    int j = str1.length();
    int k = 0;
    Iterator localIterator = this.h.b.a.iterator();
    while (localIterator.hasNext())
    {
      PivotField localPivotField = (PivotField)localIterator.next();
      String str2 = localPivotField.i.b().toLowerCase();
      if ((str2.length() >= j) && (str2.startsWith(str1))) {
        if (str2.length() == j)
        {
          k = 1;
        }
        else
        {
          int m = 1;
          char[] arrayOfChar = str2.toCharArray();
          for (int n = j; n < arrayOfChar.length; n++) {
            if ((arrayOfChar[n] < '0') || (arrayOfChar[n] > '9'))
            {
              m = 0;
              break;
            }
          }
          if (m != 0)
          {
            n = zp.a(str2.substring(j));
            if (n > k) {
              k = n;
            }
          }
        }
      }
    }
    if (k != 0) {
      this.g += k + 1;
    }
  }
  
  void a(zbtq paramzbtq)
  {
    this.a = paramzbtq.a;
    this.b = paramzbtq.b;
    this.c = paramzbtq.c;
    this.d = paramzbtq.d;
    this.e = paramzbtq.e;
    this.f = paramzbtq.a();
    this.g = paramzbtq.g;
    this.i = paramzbtq.i;
  }
  
  String a()
  {
    return this.f;
  }
  
  void a(String paramString)
  {
    this.f = paramString;
  }
  
  String b()
  {
    if (this.i) {
      return ztt.j(this.a) + " of " + this.g;
    }
    return this.g;
  }
  
  void b(String paramString)
  {
    this.g = paramString;
    this.i = false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */