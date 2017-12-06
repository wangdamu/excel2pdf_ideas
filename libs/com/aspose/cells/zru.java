package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zru
{
  int a = -1;
  boolean b = false;
  boolean c = true;
  boolean d = true;
  boolean e = true;
  boolean f = false;
  private boolean m = false;
  private boolean n = false;
  private int o = 9;
  private int p = 7;
  zpw g = null;
  boolean h = false;
  ArrayList i = null;
  int j = 1;
  String k = null;
  String l = null;
  private int q;
  private int r;
  
  boolean a()
  {
    return this.m;
  }
  
  void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  boolean b()
  {
    return this.n;
  }
  
  void b(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public int c()
  {
    return this.o;
  }
  
  public int d()
  {
    return this.p;
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
    this.d = false;
  }
  
  void a(zjk paramzjk, Chart paramChart)
  {
    this.l = paramzjk.q();
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    ArrayList localArrayList = paramzjk.a(false, paramChart.h(), arrayOfBoolean, true);
    i1 = arrayOfBoolean[0];
    if ((i1 == 0) && (localArrayList != null) && (localArrayList.size() != 0))
    {
      String str = "";
      for (int i2 = 0; i2 < localArrayList.size(); i2++)
      {
        zjt localzjt = (zjt)localArrayList.get(i2);
        str = str + a(localzjt, paramChart.n().p());
        if (i2 != localArrayList.size() - 1) {
          str = str + " ";
        }
      }
      a(str);
    }
  }
  
  private String a(zjt paramzjt, Workbook paramWorkbook)
  {
    switch (paramzjt.g)
    {
    case 1: 
      if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
      {
        double d1 = 0.0D;
        try
        {
          d1 = ((Double)paramzjt.a).doubleValue();
        }
        catch (Exception localException)
        {
          return paramzjt.a();
        }
        String str2 = null;
        str2 = paramzjt.c;
        if (((str2 == null) || ("".equals(str2))) && (paramzjt.b != 0)) {
          str2 = paramWorkbook.getSettings().f().d(paramzjt.b);
        }
        DateTime localDateTime = CellsHelper.getDateTimeFromDouble(d1, paramWorkbook.getSettings().getDate1904());
        if ((str2 != null) && ("".equals(str2))) {
          str2 = null;
        }
        zzz localzzz2 = paramWorkbook.getSettings().f().a(str2, localDateTime, false);
        return localzzz2.h();
      }
      return paramzjt.a();
    }
    if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
    {
      String str1 = null;
      str1 = paramzjt.c;
      if (((str1 == null) || ("".equals(str1))) && (paramzjt.b != 0)) {
        str1 = paramWorkbook.getSettings().f().d(paramzjt.b);
      }
      if ((str1 != null) && ("".equals(str1))) {
        str1 = null;
      }
      zzz localzzz1 = paramWorkbook.getSettings().f().a(str1, paramzjt.a, false);
      return localzzz1.h();
    }
    return paramzjt.a();
  }
  
  void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    zrn localzrn = new zrn();
    localzrn.b = paramString;
    this.i = new ArrayList();
    zf.a(this.i, localzrn);
  }
  
  void b(int paramInt)
  {
    this.q = paramInt;
  }
  
  void c(int paramInt)
  {
    this.r = paramInt;
  }
  
  void a(Chart paramChart, boolean paramBoolean)
  {
    if (paramChart == null) {
      return;
    }
    zpw localzpw = paramChart.a.g;
    if (localzpw == null)
    {
      if (!this.g.b.a(8L)) {
        if (paramBoolean) {
          this.g.a(18.0D);
        } else {
          this.g.a(10.0D);
        }
      }
      return;
    }
    double d1 = paramBoolean ? 1.2D : 1.0D;
    this.g.a(localzpw, d1);
  }
  
  void a(zpw paramzpw, Title paramTitle, WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = paramzpw;
    } else if (this.g != null) {
      a(paramTitle.getChart(), paramBoolean);
    }
    if (this.a != -1) {
      paramTitle.setRotationAngle(this.a);
    }
    if (!this.c) {
      paramTitle.setTextVerticalAlignment(c());
    }
    if (!this.d) {
      paramTitle.setTextHorizontalAlignment(d());
    }
    if ((this.i != null) && (this.i.size() > 0))
    {
      Object localObject;
      if (this.i.size() == 1)
      {
        localObject = (zrn)this.i.get(0);
        zpw localzpw1 = ((zrn)localObject).a;
        if (localzpw1 == null) {
          localzpw1 = this.g;
        } else {
          localzpw1.a(this.g, 1.0D);
        }
        Font localFont1 = paramTitle.getFont();
        if (localzpw1 != null) {
          localzpw1.b(localFont1);
        }
        paramTitle.b(((zrn)localObject).b);
      }
      else
      {
        paramTitle.a(new ArrayList());
        localObject = new StringBuilder();
        int i1 = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++)
        {
          zrn localzrn = (zrn)this.i.get(i2);
          if (localzrn.b != null)
          {
            int i3 = localzrn.b.length();
            FontSetting localFontSetting = new FontSetting(i1, i3, paramWorksheetCollection, paramTitle);
            zpw localzpw2 = localzrn.a;
            if (localzpw2 == null) {
              localzpw2 = this.g;
            } else {
              localzrn.a.a(this.g, 1.0D);
            }
            Font localFont2 = new Font(paramWorksheetCollection, null, true);
            Title.a(paramTitle.getChart(), localFont2, paramBoolean);
            if (localzpw2 != null) {
              localzpw2.a(localFont2);
            }
            localFontSetting.a(localFont2);
            i1 += i3;
            ((StringBuilder)localObject).append(localzrn.b);
            zf.a(paramTitle.E(), localFontSetting);
          }
        }
        paramTitle.b(zs.a(localObject));
      }
    }
    if (this.l != null) {
      paramTitle.c(this.l);
    }
    paramTitle.k(a());
    paramTitle.l(b());
    paramTitle.setTextDirection(this.j);
  }
  
  void a(Series paramSeries)
  {
    if (this.l != null)
    {
      paramSeries.a(this.l);
    }
    else if ((this.i != null) && (this.i.size() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i1 = 0;
      for (int i2 = 0; i2 < this.i.size(); i2++)
      {
        zrn localzrn = (zrn)this.i.get(i2);
        if (localzrn.b != null)
        {
          localStringBuilder.append(localzrn.b);
          paramSeries.a(zs.a(localStringBuilder));
        }
      }
    }
  }
  
  void a(Title paramTitle, WorksheetCollection paramWorksheetCollection, boolean paramBoolean)
  {
    if (this.g == null) {
      this.g = new zpw();
    }
    a(paramTitle.getChart(), paramBoolean);
    if ((paramBoolean) && (!this.g.b.a(2048L))) {
      this.g.f(360);
    }
    if (!this.g.b.a(2L)) {
      this.g.b(true);
    }
    if (paramTitle.j() != null) {
      this.g.a(paramTitle.getFont());
    } else {
      paramTitle.c(zauj.a(this.g, paramWorksheetCollection));
    }
    if (this.a != -1) {
      paramTitle.setRotationAngle(this.a);
    }
    if (!this.c) {
      paramTitle.setTextVerticalAlignment(c());
    }
    if (!this.d) {
      paramTitle.setTextHorizontalAlignment(d());
    }
    if ((this.i != null) && (this.i.size() > 0))
    {
      Object localObject;
      if (this.i.size() == 1)
      {
        localObject = (zrn)this.i.get(0);
        zpw localzpw = ((zrn)localObject).a;
        if (localzpw == null) {
          localzpw = this.g;
        }
        if (localzpw != null) {
          localzpw.a(paramTitle.getFont());
        }
        paramTitle.b(((zrn)localObject).b);
      }
      else
      {
        paramTitle.a(new ArrayList());
        localObject = new StringBuilder();
        int i1 = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++)
        {
          zrn localzrn = (zrn)this.i.get(i2);
          if (localzrn.b != null)
          {
            int i3 = localzrn.b.length();
            FontSetting localFontSetting = new FontSetting(i1, i3, paramWorksheetCollection, paramTitle);
            if (localzrn.a != null)
            {
              localzrn.a.a(this.g, 1.0D);
              Font localFont = new Font(paramWorksheetCollection, null, true);
              localzrn.a.a(localFont);
              localFontSetting.a(localFont);
            }
            else
            {
              this.g.a(localFontSetting.getFont());
            }
            i1 += i3;
            ((StringBuilder)localObject).append(localzrn.b);
            zf.a(paramTitle.E(), localFontSetting);
          }
        }
        paramTitle.b(zs.a(localObject));
      }
    }
    if (this.l != null) {
      paramTitle.c(this.l);
    }
    paramTitle.k(a());
    paramTitle.l(b());
    paramTitle.setTextDirection(this.j);
  }
  
  void a(DataLabels paramDataLabels, WorksheetCollection paramWorksheetCollection)
  {
    if ((this.l != null) && (!"".equals(this.l))) {
      paramDataLabels.c(this.l);
    }
    Object localObject;
    int i3;
    zrn localzrn;
    int i4;
    FontSetting localFontSetting;
    Font localFont;
    if (this.g == null)
    {
      if ((paramDataLabels.R() != null) && ((paramDataLabels.R() instanceof ChartPoint)))
      {
        if (this.i != null) {
          if (this.i.size() == 1)
          {
            localObject = (zrn)this.i.get(0);
            if (((zrn)localObject).b != null)
            {
              paramDataLabels.a(((zrn)localObject).b);
              paramDataLabels.j(false);
              zpw localzpw1 = ((zrn)localObject).a;
              if (this.a != -1) {
                paramDataLabels.setRotationAngle(this.a);
              }
              if (localzpw1 == null) {
                localzpw1 = new zpw();
              }
              if (localzpw1 != null) {
                if (paramDataLabels.j() != null) {
                  localzpw1.a(paramDataLabels.getFont());
                } else {
                  paramDataLabels.c(zauj.a(localzpw1, paramWorksheetCollection));
                }
              }
            }
          }
          else
          {
            paramDataLabels.a(new ArrayList());
            localObject = new StringBuilder();
            int i1 = 0;
            for (i3 = 0; i3 < this.i.size(); i3++)
            {
              localzrn = (zrn)this.i.get(i3);
              if (localzrn.b != null)
              {
                i4 = localzrn.b.length();
                localFontSetting = new FontSetting(i1, i4, paramWorksheetCollection, paramDataLabels);
                if (localzrn.a != null)
                {
                  localFont = new Font(paramWorksheetCollection, null, true);
                  localzrn.a.a(localFont);
                  localFontSetting.a(localFont);
                }
                i1 += i4;
                ((StringBuilder)localObject).append(localzrn.b);
                zf.a(paramDataLabels.E(), localFontSetting);
              }
            }
            if (((StringBuilder)localObject).length() > 0) {
              paramDataLabels.j(false);
            }
            paramDataLabels.a(zs.a(localObject));
          }
        }
        return;
      }
      this.g = new zpw();
    }
    a(paramDataLabels.getChart(), false);
    if (this.a != -1) {
      paramDataLabels.setRotationAngle(this.a);
    }
    if (!this.c) {
      paramDataLabels.setTextVerticalAlignment(c());
    }
    if (!this.d) {
      paramDataLabels.setTextHorizontalAlignment(d());
    }
    paramDataLabels.j = this.e;
    if (this.i == null)
    {
      if (paramDataLabels.j() != null) {
        this.g.a(paramDataLabels.getFont());
      } else {
        paramDataLabels.c(zauj.a(this.g, paramWorksheetCollection));
      }
    }
    else if (this.i.size() == 1)
    {
      localObject = (zrn)this.i.get(0);
      if (((zrn)localObject).b != null)
      {
        paramDataLabels.a(((zrn)localObject).b);
        paramDataLabels.j(false);
        zpw localzpw2 = ((zrn)localObject).a;
        if (((zrn)localObject).a == null) {
          localzpw2 = this.g;
        }
        if (localzpw2 != null)
        {
          localzpw2.a(this.g, 1.0D);
          if (paramDataLabels.j() != null) {
            localzpw2.a(paramDataLabels.getFont());
          } else {
            paramDataLabels.c(zauj.a(localzpw2, paramWorksheetCollection));
          }
        }
      }
    }
    else
    {
      if (paramDataLabels.j() != null) {
        this.g.a(paramDataLabels.getFont());
      } else {
        paramDataLabels.c(zauj.a(this.g, paramWorksheetCollection));
      }
      paramDataLabels.a(new ArrayList());
      localObject = new StringBuilder();
      int i2 = 0;
      for (i3 = 0; i3 < this.i.size(); i3++)
      {
        localzrn = (zrn)this.i.get(i3);
        if (localzrn.b != null)
        {
          i4 = localzrn.b.length();
          localFontSetting = new FontSetting(i2, i4, paramWorksheetCollection, paramDataLabels);
          if (localzrn.a != null)
          {
            localzrn.a.a(this.g, 1.0D);
            localFont = new Font(paramWorksheetCollection, null, true);
            localzrn.a.a(localFont);
            localFontSetting.a(localFont);
          }
          else
          {
            this.g.a(localFontSetting.getFont());
          }
          i2 += i4;
          ((StringBuilder)localObject).append(localzrn.b);
          zf.a(paramDataLabels.E(), localFontSetting);
        }
      }
      paramDataLabels.j(false);
      paramDataLabels.a(zs.a(localObject));
    }
    paramDataLabels.k(a());
    paramDataLabels.l(b());
    paramDataLabels.setTextDirection(this.j);
    paramDataLabels.setResizeShapeToFitText(this.f);
  }
  
  void a(TickLabels paramTickLabels, Chart paramChart, WorksheetCollection paramWorksheetCollection)
  {
    if (this.a != -1) {
      paramTickLabels.b(this.a);
    }
    if (this.g != null)
    {
      a(paramChart, false);
      paramTickLabels.a(zauj.a(this.g, paramWorksheetCollection));
    }
    paramTickLabels.b(a());
    paramTickLabels.c(b());
    paramTickLabels.setTextDirection(this.j);
  }
  
  void a(DisplayUnitLabel paramDisplayUnitLabel, WorksheetCollection paramWorksheetCollection)
  {
    if (this.l != null) {
      paramDisplayUnitLabel.c(this.l);
    }
    if (this.g == null) {
      this.g = new zpw();
    }
    a(paramDisplayUnitLabel.getChart(), false);
    if (this.a != -1) {
      paramDisplayUnitLabel.setRotationAngle(this.a);
    }
    if (!this.c) {
      paramDisplayUnitLabel.setTextVerticalAlignment(c());
    }
    if (!this.d) {
      paramDisplayUnitLabel.setTextHorizontalAlignment(d());
    }
    if (this.i == null)
    {
      if (paramDisplayUnitLabel.j() != null) {
        this.g.a(paramDisplayUnitLabel.getFont());
      } else {
        paramDisplayUnitLabel.c(zauj.a(this.g, paramWorksheetCollection));
      }
    }
    else
    {
      zrn localzrn = (zrn)this.i.get(0);
      if (localzrn.b != null)
      {
        paramDisplayUnitLabel.setText(localzrn.b);
        zpw localzpw = localzrn.a;
        if (localzrn.a == null) {
          localzpw = this.g;
        }
        if (localzpw != null) {
          if (paramDisplayUnitLabel.j() != null) {
            localzpw.a(paramDisplayUnitLabel.getFont());
          } else {
            paramDisplayUnitLabel.c(zauj.a(localzpw, paramWorksheetCollection));
          }
        }
      }
    }
    paramDisplayUnitLabel.k(a());
    paramDisplayUnitLabel.l(b());
    paramDisplayUnitLabel.setTextDirection(this.j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */