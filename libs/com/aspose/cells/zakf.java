package com.aspose.cells;

class zakf
{
  static zaml a(zcjy paramzcjy)
    throws Exception
  {
    zaml localzaml = new zaml(true);
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      String str1;
      if ("srgbClr".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.a("val");
        if (str1 != null) {
          localzaml.a(2, zauj.s(str1).toArgb());
        }
        a(paramzcjy, localzaml);
      }
      else if ("scrgbClr".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.a("r");
        String str2 = paramzcjy.a("g");
        String str4 = paramzcjy.a("b");
        if ((str1 != null) && (str2 != null) && (str4 != null)) {
          try
          {
            int j = zlk.a(zauj.D(str1));
            int k = zlk.a(zauj.D(str2));
            int m = zlk.a(zauj.D(str4));
            Color localColor = Color.fromArgb(j, k, m);
            localzaml.a(2, localColor.toArgb());
          }
          catch (Exception localException) {}
        }
        a(paramzcjy, localzaml);
      }
      else if ("schemeClr".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.a("val");
        if (str1 != null)
        {
          int i = zauj.al(str1);
          localzaml.a(4, i);
        }
        a(paramzcjy, localzaml);
      }
      else if ("sysClr".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.a("val");
        String str3 = paramzcjy.a("lastClr");
        if (str3 == null)
        {
          if (str1.equals("window")) {
            str3 = "ffffff";
          } else if (str1.equals("windowText")) {
            str3 = "000000";
          }
        }
        else {
          localzaml.a(2, zauj.s(str3).toArgb());
        }
        a(paramzcjy, localzaml);
      }
      else if ("prstClr".equals(paramzcjy.q()))
      {
        str1 = paramzcjy.a("val");
        if (str1 != null) {
          localzaml.a(2, zauj.aN(str1).toArgb());
        }
        a(paramzcjy, localzaml);
      }
      else
      {
        paramzcjy.a();
      }
    }
    return localzaml;
  }
  
  private static void a(zcjy paramzcjy, zaml paramzaml)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    zlg localzlg = paramzaml.l();
    paramzaml.c(true);
    paramzcjy.d();
    while (zauz.a(paramzcjy))
    {
      String str;
      if ("alpha".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(2, zauj.E(str));
      }
      else if ("alphaMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(3, zauj.E(str));
      }
      else if ("alphaOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(4, zauj.E(str));
      }
      else if ("red".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(5, zauj.E(str));
      }
      else if ("redMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(6, zauj.E(str));
      }
      else if ("redOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(7, zauj.E(str));
      }
      else if ("green".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(8, zauj.E(str));
      }
      else if ("greenMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(9, zauj.E(str));
      }
      else if ("greenOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(10, zauj.E(str));
      }
      else if ("blue".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(11, zauj.E(str));
      }
      else if ("blueMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(12, zauj.E(str));
      }
      else if ("blueOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(13, zauj.E(str));
      }
      else if ("hue".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(14, zauj.E(str));
      }
      else if ("hueMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(15, zauj.E(str));
      }
      else if ("hueOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(16, zauj.E(str));
      }
      else if ("sat".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(17, zauj.E(str));
      }
      else if ("satMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(18, zauj.E(str));
      }
      else if ("satOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(19, zauj.E(str));
      }
      else if ("lum".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(20, zauj.E(str));
      }
      else if ("lumMod".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(21, zauj.E(str));
      }
      else if ("lumOff".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(22, zauj.E(str));
      }
      else if ("shade".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(1, zauj.E(str));
      }
      else if ("tint".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(0, zauj.E(str));
      }
      else if ("comp".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(25, 0);
      }
      else if ("inv".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(27, 0);
      }
      else if ("gamma".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(23, 0);
      }
      else if ("invGamma".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(24, 0);
      }
      else if ("gray".equals(paramzcjy.q()))
      {
        str = b(paramzcjy);
        localzlg.a(26, 0);
      }
      else
      {
        paramzcjy.a();
      }
    }
  }
  
  private static String b(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("val");
    paramzcjy.a();
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */