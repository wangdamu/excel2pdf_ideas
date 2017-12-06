package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zaxa
{
  private String h = "(blank)";
  zawp a;
  private int i;
  String b;
  private String j;
  byte[] c;
  String d;
  zbun e;
  int f = -1;
  zbur g;
  
  int a()
  {
    return this.i;
  }
  
  void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  void a(zaxa paramzaxa)
  {
    a(paramzaxa.a());
    this.b = paramzaxa.b;
    this.j = paramzaxa.j;
    if (paramzaxa.c != null) {
      this.c = ((byte[])za.a(paramzaxa.c));
    }
    if (paramzaxa.e != null)
    {
      int k = paramzaxa.e.getCount();
      for (int m = 0; m < k; m++)
      {
        zbui localzbui = new zbui();
        localzbui.a(paramzaxa.e.a(m));
        this.e.a(localzbui);
      }
    }
    this.f = paramzaxa.f;
    if (paramzaxa.g != null)
    {
      this.g = new zbur();
      this.g.a(paramzaxa.g);
    }
  }
  
  void a(int paramInt, String paramString)
  {
    a(paramInt, paramString, false);
  }
  
  void a(int paramInt, String paramString, boolean paramBoolean)
  {
    WorksheetCollection localWorksheetCollection = this.a.e.a;
    localWorksheetCollection.a(this);
    this.i = paramInt;
    if (paramString != null) {
      this.c = localWorksheetCollection.y().a(-1, paramString, 0, 0, 0, 64, false, false, false);
    }
    localWorksheetCollection.a(null);
    if (!paramBoolean) {
      this.j = paramString;
    }
  }
  
  String a(int paramInt1, int paramInt2)
  {
    zawp localzawp = this.a;
    zbtv localzbtv = (zbtv)localzawp.i.get(a());
    zbun localzbun = this.e;
    zbui localzbui = localzbun.a(paramInt1);
    zbos localzbos = (zbos)localzbtv.c.get(localzbui.b().a(0).b & 0xFFFF);
    Object localObject = localzbos.a;
    String str1 = "";
    if (localObject == null) {
      str1 = this.h;
    } else {
      str1 = zs.a(localObject);
    }
    if (zaap.b(str1)) {
      str1 = '\'' + str1 + '\'';
    }
    if (paramInt2 == 1)
    {
      String str2 = localzbtv.a;
      if (zaap.b(str2)) {
        str2 = '\'' + str2 + '\'';
      }
      return str2 + "[" + str1 + "]";
    }
    return str1;
  }
  
  void a(zahh paramzahh, int paramInt, boolean paramBoolean)
  {
    zawp localzawp = this.a;
    zbtv localzbtv = (zbtv)localzawp.i.get(a());
    zbun localzbun = this.e;
    zbui localzbui = localzbun.a(paramInt);
    zbos localzbos = (zbos)localzbtv.c.get(localzbui.b().a(0).b & 0xFFFF);
    if (paramBoolean)
    {
      str = localzbtv.a;
      if (zabq.b(str))
      {
        paramzahh.a('\'');
        paramzahh.a(str);
        paramzahh.a('\'');
      }
      else
      {
        paramzahh.a(str);
      }
      paramzahh.a('[');
    }
    String str = "";
    if (localzbos.a == null) {
      str = this.h;
    } else {
      str = zs.a(localzbos.a);
    }
    if (zabq.b(str))
    {
      paramzahh.a('\'');
      paramzahh.a(str);
      paramzahh.a('\'');
    }
    else
    {
      paramzahh.a(str);
    }
    if (paramBoolean) {
      paramzahh.a(']');
    }
  }
  
  int a(String paramString)
  {
    String str1 = paramString.toUpperCase();
    if (str1.charAt(str1.length() - 1) == ']')
    {
      int k = str1.lastIndexOf('[');
      if (k != -1) {
        str1 = str1.substring(k + 1, k + 1 + (str1.length() - 2 - k));
      }
    }
    if ((str1 != null) && (str1.charAt(0) == '\'')) {
      str1 = str1.substring(1, 1 + (str1.length() - 2));
    }
    zawp localzawp = this.a;
    zbun localzbun = this.e;
    int m = -1;
    zbtv localzbtv = (zbtv)localzawp.i.get(a());
    if (localzbtv != null)
    {
      ArrayList localArrayList = localzbtv.c;
      for (int n = 0; n < localArrayList.size(); n++)
      {
        String str2 = ((zbos)localArrayList.get(n)).a != null ? zs.a(((zbos)localArrayList.get(n)).a).toUpperCase() : this.h.toUpperCase();
        if (str2.equals(str1))
        {
          for (int i1 = 0; i1 < localzbun.getCount(); i1++)
          {
            zbui localzbui = localzbun.a(i1);
            for (int i2 = 0; i2 < localzbui.b().getCount(); i2++)
            {
              zbuj localzbuj = localzbui.b().a(i2);
              if ((localzbuj.b & 0xFFFF) == n)
              {
                m = i1;
                break;
              }
            }
            if (m != -1) {
              break;
            }
          }
          if (m != -1) {
            break;
          }
          m = localzbun.getCount();
          localzbun.a(new zbui(a(), n));
          break;
        }
      }
    }
    return m;
  }
  
  public String b()
  {
    try
    {
      if (this.c == null) {
        return this.j;
      }
      WorksheetCollection localWorksheetCollection = this.a.e.a;
      localWorksheetCollection.a(this);
      localObject = localWorksheetCollection.d().a(0, this.c, 0, 0, false);
      localWorksheetCollection.a(null);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      Object localObject = this.a.e.a;
      ((WorksheetCollection)localObject).a(null);
    }
    return this.j;
  }
  
  void b(String paramString)
  {
    this.j = paramString;
  }
  
  String c()
  {
    return this.j;
  }
  
  zaxa(zawp paramzawp, PivotField paramPivotField, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.a = paramzawp;
    this.e = new zbun();
    this.i = paramPivotField.getBaseIndex();
    this.g = new zbur();
    this.g.a = ((byte)paramPivotField.getPosition());
    zbtz localzbtz = new zbtz();
    zf.a(this.g.e, localzbtz);
    if (paramInt1 == 2) {
      localzbtz.a = 2;
    } else if (paramInt1 == 1) {
      localzbtz.a = 0;
    }
    localzbtz.b = (a() | 0x400);
    localzbtz.a(1);
    localzbtz.c = new ArrayList();
    zf.a(localzbtz.c, Integer.valueOf(paramInt2));
    this.b = paramString1;
    this.h = d();
  }
  
  zaxa(zawp paramzawp)
  {
    this.a = paramzawp;
    this.g = new zbur();
    this.e = new zbun();
    zbtz localzbtz = new zbtz();
    zf.a(this.g.e, localzbtz);
    localzbtz.b = (a() | 0x400);
    localzbtz.a(1);
    this.h = d();
  }
  
  private String d()
  {
    GlobalizationSettings localGlobalizationSettings = this.a.e.a.p().getSettings().getGlobalizationSettings();
    return localGlobalizationSettings.getEmptyDataName();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */