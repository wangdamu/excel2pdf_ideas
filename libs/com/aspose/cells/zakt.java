package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zakt
{
  private static final za a = new za(new String[] { "LH", "CH", "RH", "LHEVEN", "CHEVEN", "RHEVEN", "LHFIRST", "CHFIRST", "RHFIRST", "LF", "CF", "RF", "LFEVEN", "CFEVEN", "RFEVEN", "LFFIRST", "CFFIRST", "RFFIRST" });
  
  ArrayList a(zcjy paramzcjy)
    throws Exception
  {
    c(paramzcjy);
    if (paramzcjy.o()) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (("shape".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        zqc localzqc = b(paramzcjy);
        if (localzqc != null) {
          zf.a(localArrayList, localzqc);
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localArrayList;
  }
  
  private zqc b(zcjy paramzcjy)
    throws Exception
  {
    zqc localzqc = new zqc();
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("id".equals(paramzcjy.q()))
        {
          switch (a.a(paramzcjy.t()))
          {
          case 0: 
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
            localzqc.a = paramzcjy.t();
            break;
          }
        }
        else if ("style".equals(paramzcjy.q()))
        {
          localzqc.c = paramzcjy.t();
        }
        else if ("preferrelative".equals(paramzcjy.q()))
        {
          boolean bool = !"f".equals(paramzcjy.t());
          localzqc.e = bool;
        }
      }
      paramzcjy.l();
    }
    if (localzqc.a == null)
    {
      paramzcjy.a();
      return null;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ("imagedata".equals(paramzcjy.q()))
      {
        a(paramzcjy, localzqc);
      }
      else if ("lock".equals(paramzcjy.q()))
      {
        String str = paramzcjy.a("aspectratio");
        paramzcjy.a();
        if (str != null) {
          localzqc.f = a(str);
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localzqc;
  }
  
  private void a(zcjy paramzcjy, zqc paramzqc)
    throws Exception
  {
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("relid".equals(paramzcjy.q())) {
          paramzqc.b = paramzcjy.t();
        } else if ("title".equals(paramzcjy.q())) {
          paramzqc.d = paramzcjy.t();
        } else if ("croptop".equals(paramzcjy.q())) {
          paramzqc.i = b(paramzcjy.t());
        } else if ("cropbottom".equals(paramzcjy.q())) {
          paramzqc.j = b(paramzcjy.t());
        } else if ("cropleft".equals(paramzcjy.q())) {
          paramzqc.k = b(paramzcjy.t());
        } else if ("cropright".equals(paramzcjy.q())) {
          paramzqc.l = b(paramzcjy.t());
        } else if ("blacklevel".equals(paramzcjy.q())) {
          paramzqc.n = b(paramzcjy.t());
        } else if ("gain".equals(paramzcjy.q())) {
          paramzqc.m = b(paramzcjy.t());
        } else if ("preferrelative".equals(paramzcjy.q())) {
          paramzqc.e = a(paramzcjy.t());
        } else if ("grayscale".equals(paramzcjy.q())) {
          paramzqc.g = a(paramzcjy.t());
        } else if ("bilevel".equals(paramzcjy.q())) {
          paramzqc.h = a(paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramzcjy.a();
  }
  
  static boolean a(String paramString)
  {
    if (("f".equals(paramString)) || ("false".equals(paramString.toLowerCase()))) {
      return false;
    }
    if (("t".equals(paramString)) || ("true".equals(paramString.toLowerCase()))) {
      return true;
    }
    if ("1".equals(paramString)) {
      return true;
    }
    if ("0".equals(paramString)) {
      return false;
    }
    throw new CellsException(6, "Error true/false format: " + paramString);
  }
  
  static double b(String paramString)
  {
    double d1 = 0.0D;
    try
    {
      double d2;
      if (paramString.endsWith("f"))
      {
        paramString = paramString.substring(0, 0 + (paramString.length() - 1));
        d2 = zauj.C(paramString);
        d1 = d2 / 65536.0D;
      }
      else if (paramString.endsWith("%"))
      {
        paramString = paramString.substring(0, 0 + (paramString.length() - 1));
        d2 = zauj.C(paramString);
        d1 = d2 * 0.01D;
      }
      else
      {
        d1 = zauj.C(paramString);
      }
    }
    catch (Exception localException) {}
    return d1;
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"xml".equals(paramzcjy.q()))) {
      throw new CellsException(6, "xml root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */