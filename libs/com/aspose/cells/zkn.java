package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.zr;
import java.util.ArrayList;
import java.util.List;

class zkn
{
  static float a(zahj paramzahj, boolean paramBoolean)
    throws Exception
  {
    zt localzt = new zt(480.0F, 288.0F);
    float f1 = 250.0F;
    float f2 = f1;
    if (paramBoolean)
    {
      if (paramzahj.a() > localzt.b()) {
        f2 -= (paramzahj.a() - localzt.b()) / localzt.b() * 100.0F;
      }
    }
    else if (paramzahj.b() > localzt.c()) {
      f2 -= (paramzahj.b() - localzt.c()) / localzt.c() * 100.0F;
    }
    if (f2 < 100.0F) {
      f2 = 100.0F;
    }
    return f2;
  }
  
  static boolean a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, List paramList, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2)
  {
    paramArrayOfDouble2[0] = 0.0D;
    int i;
    zahn localzahn;
    double d;
    if (paramArrayOfDouble1[0] >= 0.0D)
    {
      if (((paramArrayOfDouble1[0] > 0.0D) && (paramDouble1 <= 0.0D)) || ((paramArrayOfDouble1[0] == 0.0D) && (paramDouble1 < 0.0D)))
      {
        paramArrayOfDouble1[0] = 0.0D;
        paramArrayOfDouble2[0] = 0.0D;
        return false;
      }
      for (i = 0; i < paramInt1; i++)
      {
        localzahn = ((zaje)paramList.get(i)).k().a(paramInt2);
        if (localzahn != null)
        {
          d = localzahn.w();
          if (d >= 0.0D) {
            if (paramArrayOfDouble2[0] + d <= paramDouble1)
            {
              paramArrayOfDouble2[0] += d;
            }
            else
            {
              paramArrayOfDouble2[0] = paramDouble1;
              paramArrayOfDouble1[0] = 0.0D;
              return false;
            }
          }
        }
      }
      if (paramArrayOfDouble1[0] + paramArrayOfDouble2[0] <= paramDouble1)
      {
        paramArrayOfDouble2[0] += paramArrayOfDouble1[0];
      }
      else
      {
        paramArrayOfDouble1[0] = (paramDouble1 - paramArrayOfDouble2[0]);
        paramArrayOfDouble2[0] = paramDouble1;
      }
    }
    else
    {
      if (((paramArrayOfDouble1[0] < 0.0D) && (paramDouble2 >= 0.0D)) || ((paramArrayOfDouble1[0] == 0.0D) && (paramDouble2 > 0.0D)))
      {
        paramArrayOfDouble1[0] = 0.0D;
        paramArrayOfDouble2[0] = 0.0D;
        return false;
      }
      for (i = 0; i < paramInt1; i++)
      {
        localzahn = ((zaje)paramList.get(i)).k().a(paramInt2);
        if (localzahn != null)
        {
          d = localzahn.w();
          if (d < 0.0D) {
            if (paramArrayOfDouble2[0] + d >= paramDouble2)
            {
              paramArrayOfDouble2[0] += d;
            }
            else
            {
              paramArrayOfDouble2[0] = paramDouble2;
              paramArrayOfDouble1[0] = 0.0D;
              return false;
            }
          }
        }
      }
      if (paramArrayOfDouble1[0] + paramArrayOfDouble2[0] >= paramDouble2)
      {
        paramArrayOfDouble2[0] += paramArrayOfDouble1[0];
      }
      else
      {
        paramArrayOfDouble1[0] = (paramDouble2 - paramArrayOfDouble2[0]);
        paramArrayOfDouble2[0] = paramDouble2;
      }
    }
    return true;
  }
  
  static double a(List paramList, int paramInt)
  {
    double d1 = 0.0D;
    for (int i = 0; i < paramList.size(); i++)
    {
      zahn localzahn = ((zaje)paramList.get(i)).k().a(paramInt);
      if (localzahn != null)
      {
        double d2 = localzahn.w();
        d1 += Math.abs(d2);
      }
    }
    return d1;
  }
  
  static boolean a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, List paramList, int paramInt1, int paramInt2, zagv paramzagv, double paramDouble)
  {
    double d1 = paramzagv.z() * paramDouble;
    double d2 = paramzagv.D() * paramDouble;
    return a(paramArrayOfDouble1, paramArrayOfDouble2, paramList, paramInt1, paramInt2, d1, d2);
  }
  
  static void a(zagv paramzagv1, zagv paramzagv2, zajf paramzajf, zaje paramzaje)
  {
    if (b(paramzaje.m())) {
      return;
    }
    if (((paramzaje instanceof zbfd)) && (a(paramzaje.m()))) {
      return;
    }
    int i;
    int j;
    zahn localzahn;
    if ((paramzagv1.n()) && (c(paramzaje.m()))) {
      for (i = 0; i < paramzajf.getCount(); i++) {
        for (j = 0; j < paramzajf.a(i).k().getCount(); j++)
        {
          localzahn = paramzajf.a(i).k().a(j);
          if (localzahn != null) {
            if (localzahn.q() > 0.0D) {
              localzahn.a(zr.a(localzahn.q(), paramzagv1.o()));
            } else if (localzahn.t()) {
              localzahn.a(true);
            }
          }
        }
      }
    }
    if (paramzagv2.n()) {
      for (i = 0; i < paramzajf.getCount(); i++) {
        for (j = 0; j < paramzajf.a(i).k().getCount(); j++)
        {
          localzahn = paramzajf.a(i).k().a(j);
          if (localzahn != null) {
            if (localzahn.w() > 0.0D) {
              localzahn.c(zr.a(localzahn.w(), paramzagv2.o()));
            } else {
              localzahn.a(true);
            }
          }
        }
      }
    }
  }
  
  static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 4: 
    case 7: 
    case 10: 
    case 15: 
    case 19: 
    case 22: 
    case 25: 
    case 29: 
    case 32: 
    case 38: 
    case 41: 
    case 51: 
    case 54: 
      return true;
    }
    return false;
  }
  
  static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 5: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 39: 
    case 42: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  static boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    case 5: 
    case 8: 
    case 11: 
    case 16: 
    case 20: 
    case 23: 
    case 26: 
    case 30: 
    case 33: 
    case 39: 
    case 42: 
    case 52: 
    case 55: 
      return true;
    }
    return false;
  }
  
  static void a(zo paramzo, List paramList1, List paramList2, int paramInt)
  {
    if (paramList1.size() == 0)
    {
      paramList1.add(paramzo);
      paramList2.add(Integer.valueOf(paramInt));
    }
    else
    {
      for (int i = 0; i < paramList1.size(); i++) {
        if (paramList1.get(i) != null)
        {
          zo localzo = (zo)paramList1.get(i);
          if (paramzo.d() < localzo.d())
          {
            paramList1.add(i, paramzo);
            paramList2.add(i, Integer.valueOf(paramInt));
            break;
          }
        }
      }
      if (i == paramList1.size())
      {
        paramList1.add(paramzo);
        paramList2.add(Integer.valueOf(paramInt));
      }
    }
  }
  
  static void a(zo paramzo, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt, boolean paramBoolean)
  {
    if (paramArrayList1.size() == 0)
    {
      zf.a(paramArrayList1, paramzo);
      zf.a(paramArrayList2, Integer.valueOf(paramInt));
      return;
    }
    int i = 0;
    int j;
    zo localzo;
    if (paramBoolean)
    {
      for (j = 0; j <= paramArrayList1.size() - 1; j++)
      {
        if (paramArrayList1.get(j) == null)
        {
          paramArrayList1.add(j, paramzo);
          paramArrayList2.add(j, Integer.valueOf(paramInt));
          i = 1;
          break;
        }
        localzo = (zo)paramArrayList1.get(j);
        if (paramzo.d() <= localzo.d())
        {
          paramArrayList1.add(j, paramzo);
          paramArrayList2.add(j, Integer.valueOf(paramInt));
          i = 1;
          break;
        }
      }
      if (i == 0)
      {
        zf.a(paramArrayList1, paramzo);
        zf.a(paramArrayList2, Integer.valueOf(paramInt));
      }
    }
    else
    {
      for (j = paramArrayList1.size() - 1; j >= 0; j--)
      {
        if (paramArrayList1.get(j) == null)
        {
          if (j == paramArrayList1.size() - 1)
          {
            zf.a(paramArrayList1, paramzo);
            zf.a(paramArrayList2, Integer.valueOf(paramInt));
          }
          else
          {
            paramArrayList1.add(j + 1, paramzo);
            paramArrayList2.add(j + 1, Integer.valueOf(paramInt));
          }
          i = 1;
          break;
        }
        localzo = (zo)paramArrayList1.get(j);
        if (paramzo.d() >= localzo.d())
        {
          if (j == paramArrayList1.size() - 1)
          {
            zf.a(paramArrayList1, paramzo);
            zf.a(paramArrayList2, Integer.valueOf(paramInt));
          }
          else
          {
            paramArrayList1.add(j + 1, paramzo);
            paramArrayList2.add(j + 1, Integer.valueOf(paramInt));
          }
          i = 1;
          break;
        }
      }
      if (i == 0)
      {
        paramArrayList1.add(0, paramzo);
        paramArrayList2.add(0, Integer.valueOf(paramInt));
      }
    }
  }
  
  static void a(ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    for (int i = 0; i < paramArrayList3.size(); i++)
    {
      int j = ((Integer)paramArrayList3.get(i)).intValue();
      for (int k = 0; k < paramArrayList2.size(); k++) {
        if (j == ((Integer)paramArrayList2.get(k)).intValue()) {
          paramArrayList1.set(k, null);
        }
      }
    }
  }
  
  static Color a(Chart paramChart, Color paramColor, zaml paramzaml)
  {
    zaml localzaml = new zaml(true);
    localzaml.a(2, paramColor.toArgb());
    zlg localzlg = paramzaml.l();
    for (int i = 0; i < localzlg.getCount(); i++) {
      localzaml.l().a(localzlg.a(i));
    }
    return localzaml.a(paramChart.getWorksheet().c().p(), paramChart);
  }
  
  static String a(WorkbookSettings paramWorkbookSettings)
  {
    switch (paramWorkbookSettings.getLanguageCode())
    {
    case 3: 
      return "Alium";
    case 7: 
      return "Другие";
    case 30: 
      return "άλλα";
    case 31: 
    case 32: 
      return "Andere";
    case 33: 
      return "Autre";
    case 34: 
    case 52: 
      return "Otro";
    case 36: 
      return "Más";
    case 39: 
      return "Altro";
    case 45: 
      return "Andet";
    case 46: 
      return "Annan";
    case 47: 
      return "Annen";
    case 48: 
      return "Inny";
    case 41: 
    case 43: 
    case 49: 
      return "Andere";
    case 66: 
      return "อื่น ๆ";
    case 81: 
      return "その他";
    case 82: 
      return "다른";
    case 84: 
      return "Khác";
    case 86: 
    case 886: 
      return "其他";
    case 90: 
      return "Diğer";
    case 91: 
      return "अन्य";
    case 20: 
    case 213: 
    case 216: 
    case 218: 
    case 961: 
    case 962: 
    case 963: 
    case 964: 
    case 965: 
    case 966: 
    case 971: 
    case 974: 
      return "آخر";
    case 55: 
    case 351: 
      return "Outros";
    case 354: 
      return "Annað";
    case 358: 
      return "Muut";
    case 420: 
      return "Jiný";
    case 972: 
      return "אַחֵר";
    case 981: 
      return "دیگر";
    }
    return "Other";
  }
  
  static String b(WorkbookSettings paramWorkbookSettings)
  {
    switch (paramWorkbookSettings.getLanguageCode())
    {
    case 3: 
      return "Seriem";
    case 7: 
      return "Серии";
    case 30: 
      return "Σειρά";
    case 31: 
    case 32: 
      return "Serie";
    case 33: 
      return "Serie";
    case 34: 
    case 52: 
      return "Serie";
    case 36: 
      return "Sorozat";
    case 39: 
      return "Serie";
    case 45: 
      return "Serie";
    case 46: 
      return "Serier";
    case 47: 
      return "Serie";
    case 48: 
      return "Seria";
    case 41: 
    case 43: 
    case 49: 
      return "Serie";
    case 66: 
      return "ชุด";
    case 81: 
      return "系列";
    case 82: 
      return "시리즈";
    case 84: 
      return "Loạt";
    case 86: 
    case 886: 
      return "系列";
    case 90: 
      return "Dizi";
    case 91: 
      return "शृंखला";
    case 20: 
    case 213: 
    case 216: 
    case 218: 
    case 961: 
    case 962: 
    case 963: 
    case 964: 
    case 965: 
    case 966: 
    case 971: 
    case 974: 
      return "سلسلة";
    case 55: 
    case 351: 
      return "Series";
    case 354: 
      return "Röð";
    case 358: 
      return "Sarja";
    case 420: 
      return "Série";
    case 972: 
      return "סִדרָה";
    case 981: 
      return "سلسله";
    }
    return "Series";
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */