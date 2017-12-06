package com.aspose.cells;

import com.aspose.cells.a.c.zh;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class zkp
{
  private ChartCollection a;
  private Chart b;
  private zcal c;
  private byte[] d;
  private zqj e;
  private int f;
  private byte[] g;
  private int h;
  private zava i;
  private WorksheetCollection j;
  private Worksheet k;
  private boolean l;
  private int m;
  private ArrayList n;
  private boolean o = false;
  private ArrayList p;
  private ArrayList q;
  private HashMap r;
  private byte s;
  private int t = 0;
  private zbwf u;
  private boolean v = false;
  private int w;
  private int x;
  
  zkp(zcal paramzcal, zqj paramzqj, WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet)
  {
    this.c = paramzcal;
    this.e = paramzqj;
    this.j = paramWorksheetCollection;
    this.k = paramWorksheet;
    this.i = paramWorksheetCollection.o();
    this.a = paramWorksheet.getCharts();
    this.d = new byte[2];
    this.n = new ArrayList();
    this.q = new ArrayList();
  }
  
  void a(Chart paramChart)
    throws Exception
  {
    paramChart.f(2);
    this.v = false;
    this.t = 0;
    this.b = paramChart;
    this.b.setShowLegend(false);
    this.o = false;
    this.l = false;
    paramChart.G().clear();
    ArrayList localArrayList1 = new ArrayList();
    for (;;)
    {
      this.f = this.e.b(this.d);
      zf.a(localArrayList1, Integer.valueOf(this.f));
      switch (this.f)
      {
      case 2057: 
        D();
        break;
      case 2150: 
        this.c.a(this.e, paramChart.getPageSetup());
        break;
      case 20: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().b(this.g);
        }
        break;
      case 21: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().c(this.g);
        }
        break;
      case 38: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().setLeftMarginInch(zc.f(this.g, 0));
        }
        break;
      case 39: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().setRightMarginInch(zc.f(this.g, 0));
        }
        break;
      case 40: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().setTopMarginInch(zc.f(this.g, 0));
        }
        break;
      case 41: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().setBottomMarginInch(zc.f(this.g, 0));
        }
        break;
      case 77: 
        this.h = this.e.b(this.d);
        int i1 = this.e.b(this.d) & 0xFFFF;
        if (i1 != 0)
        {
          this.e.a((this.h & 0xFFFF) - 2);
        }
        else
        {
          byte[] arrayOfByte1 = new byte[(this.h & 0xFFFF) - 2];
          this.e.a(arrayOfByte1);
          ArrayList localArrayList2 = new ArrayList();
          zf.a(localArrayList2, arrayOfByte1);
          int i2 = arrayOfByte1.length;
          for (;;)
          {
            this.f = this.e.b(this.d);
            if ((this.f & 0xFFFF) == 77)
            {
              this.h = this.e.b(this.d);
              i1 = this.e.b(this.d) & 0xFFFF;
              arrayOfByte1 = new byte[(this.h & 0xFFFF) - 2];
              this.e.a(arrayOfByte1);
              zf.a(localArrayList2, arrayOfByte1);
              i2 += arrayOfByte1.length;
            }
            else
            {
              if ((this.f & 0xFFFF) != 60) {
                break;
              }
              b();
              zf.a(localArrayList2, this.g);
              i2 += (this.h & 0xFFFF);
            }
          }
          this.e.a(-2);
          byte[] arrayOfByte2 = new byte[i2];
          i2 = 0;
          for (int i3 = 0; i3 < localArrayList2.size(); i3++)
          {
            arrayOfByte1 = (byte[])localArrayList2.get(i3);
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i2, arrayOfByte1.length);
            i2 += arrayOfByte1.length;
          }
          paramChart.getPageSetup().setPrinterSettings(arrayOfByte2);
        }
        break;
      case 161: 
        b();
        if ((this.g != null) && (this.g.length != 0)) {
          paramChart.getPageSetup().a(this.g);
        }
        break;
      case 51: 
        b();
        switch (this.g[0])
        {
        case 3: 
          paramChart.setPrintSize(0);
          break;
        case 2: 
          paramChart.setPrintSize(1);
          break;
        case 1: 
          paramChart.setPrintSize(2);
        }
        break;
      case 233: 
        b(this.e);
        break;
      case 4192: 
        a(this.b.G());
        break;
      case 236: 
        zapu localzapu = new zapu(this.c, this.e, this.j, this.k, this.b);
        localzapu.b();
        break;
      case 4098: 
        a();
        break;
      case 4147: 
        E();
        break;
      case 2129: 
        k();
        break;
      case 2138: 
        j();
        break;
      case 2136: 
        f();
        break;
      case 4196: 
        v();
        break;
      case 4146: 
        int i4 = localArrayList1.size();
        if ((i4 >= 3) && ((((Integer)localArrayList1.get(i4 - 2)).intValue() & 0xFFFF) == 160) && ((((Integer)localArrayList1.get(i4 - 3)).intValue() & 0xFFFF) == 4147) && ((((Integer)localArrayList1.get(i4 - 4)).intValue() & 0xFFFF) == 4098))
        {
          w();
        }
        else
        {
          this.h = this.e.b(this.d);
          this.e.a(this.h & 0xFFFF);
        }
        break;
      case 4099: 
        Series localSeries = new Series(this.j, paramChart.getNSeries(), paramChart.getNSeries().getCount());
        a(localSeries);
        break;
      case 4164: 
        y();
        u();
        break;
      case 4132: 
        x();
        break;
      case 4166: 
        t();
        break;
      case 4161: 
        o();
        break;
      case 4195: 
        h();
        break;
      case 4133: 
        zbwf localzbwf1 = new zbwf(this.j, this.b);
        a(localzbwf1, true);
        if (localzbwf1.M() != null) {
          switch (localzbwf1.L().a)
          {
          case 1: 
            localzbwf1.a(this.b.getTitle());
            break;
          case 4: 
            localzbwf1.a(paramChart, this.q, this.p);
          }
        }
        break;
      case 2154: 
        zbwf localzbwf2 = a(null, false);
        if (localzbwf2.M() != null) {
          localzbwf2.a(paramChart, this.q, null);
        }
        break;
      case 4148: 
        F();
        break;
      case 4197: 
        g();
        break;
      case 10: 
        C();
        m();
        return;
      case 574: 
        if (this.k.getType() == 2)
        {
          b();
          if ((this.g[2] & 0xFF & 0x6) != 0) {
            this.j.setActiveSheetIndex(this.k.getIndex());
          }
        }
        else
        {
          this.h = this.e.b(this.d);
          this.e.a(this.h & 0xFFFF);
        }
        break;
      case 160: 
        if (this.k.getType() == 2)
        {
          b();
          this.k.setZoom((int)((zc.e(this.g, 0) & 0xFFFF) * 100.0F / (zc.e(this.g, 2) & 0xFFFF) + 0.5D));
        }
        else
        {
          this.e.a(6);
        }
        break;
      case 442: 
        if (this.k.getType() == 2)
        {
          e();
        }
        else
        {
          this.h = this.e.b(this.d);
          this.e.a(this.h & 0xFFFF);
        }
        break;
      case 2146: 
        d();
        break;
      case 2204: 
        b();
        paramChart.getPlotArea().m = new byte[this.h];
        System.arraycopy(this.g, 0, paramChart.getPlotArea().m, 0, this.h & 0xFFFF);
        break;
      case 2206: 
        b();
        paramChart.getPlotArea().c = new byte[this.h];
        System.arraycopy(this.g, 0, paramChart.getPlotArea().c, 0, this.h & 0xFFFF);
        break;
      case 2213: 
        b();
        paramChart.getPlotArea().b(new byte[this.h]);
        System.arraycopy(this.g, 0, paramChart.getPlotArea().c(), 0, this.h & 0xFFFF);
        break;
      case 2215: 
        a(this.e);
        break;
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void b()
    throws Exception
  {
    this.c.a(this.e);
    this.g = this.c.a();
    this.h = this.c.b();
  }
  
  private void a(int paramInt)
    throws Exception
  {
    this.c.a(this.e, paramInt);
    this.g = this.c.a();
    this.h = this.c.b();
  }
  
  private void c()
    throws Exception
  {
    this.c.e(this.e);
    this.g = this.c.a();
    this.h = this.c.b();
  }
  
  private void d()
    throws Exception
  {
    b();
    int i1 = zc.a(this.g, 16);
    if (i1 <= 65) {
      this.k.c(zc.a(this.g, 16));
    }
  }
  
  private void a(zqj paramzqj)
    throws Exception
  {
    b();
    PlotArea localPlotArea = this.b.getPlotArea();
    localPlotArea.n = new byte[this.h];
    System.arraycopy(this.g, 0, localPlotArea.n, 0, this.h & 0xFFFF);
  }
  
  private void b(zqj paramzqj)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    paramzqj.a(-2);
    c();
    zf.a(localArrayList, this.g);
    int i1 = this.g.length - 12;
    int i2 = zc.a(this.g, 8);
    i2 -= i1;
    while (i2 > 0)
    {
      c();
      int i3 = zc.b(this.g, 0);
      if ((i3 != 233) && (i3 != 60)) {
        throw new IOException("File is corrupted");
      }
      zf.a(localArrayList, this.g);
      i2 -= this.g.length - 4;
    }
    this.k.b(localArrayList);
  }
  
  private void e()
    throws Exception
  {
    b();
    if (this.g[2] == 0) {
      this.k.p = zct.a(this.g, 3, this.g.length - 3);
    } else {
      this.k.p = Encoding.getUnicode().a(this.g, 3, this.g.length - 3);
    }
  }
  
  private void f()
    throws Exception
  {
    b();
    String str = Encoding.getUnicode().a(this.g, 8, this.g.length - 8);
    if ((str != null) && (str.length() > 0))
    {
      str = str.trim();
      if (str.charAt(0) == '[')
      {
        int i1 = str.indexOf(']');
        if (i1 != -1) {
          if (str.length() > i1 + 1) {
            str = str.substring(i1 + 1);
          } else {
            str = null;
          }
        }
      }
    }
    if ((str != null) && (str.length() > 0)) {
      this.b.setPivotSource(str);
    }
    this.f = this.e.b(this.d);
    if ((this.f & 0xFFFF) == 2137)
    {
      b();
      this.b.setHidePivotFieldButtons(this.g[4] != 0);
    }
    else
    {
      this.e.a(-2);
    }
  }
  
  private void g()
    throws Exception
  {
    b();
    byte b1 = this.g[0];
    int i1 = 0;
    int i2 = 0;
    double d1 = 0.0D;
    ArrayList[] arrayOfArrayList = new ArrayList[this.q.size()];
    for (;;)
    {
      this.f = this.e.b(this.d);
      Object localObject;
      int[] arrayOfInt;
      String str;
      switch (this.f)
      {
      case 517: 
        localObject = new int[] { i1 };
        arrayOfInt = new int[] { i2 };
        str = b((int[])localObject, arrayOfInt);
        i1 = localObject[0];
        i2 = arrayOfInt[0];
        if (arrayOfArrayList[(i2 & 0xFFFF)] == null) {
          arrayOfArrayList[(i2 & 0xFFFF)] = new ArrayList();
        }
        zf.a(arrayOfArrayList[(i2 & 0xFFFF)], new zbpb(i1, false, true, str));
        break;
      case 515: 
        localObject = new int[] { i1 };
        arrayOfInt = new int[] { i2 };
        d1 = a((int[])localObject, arrayOfInt);
        i1 = localObject[0];
        i2 = arrayOfInt[0];
        if (arrayOfArrayList[(i2 & 0xFFFF)] == null) {
          arrayOfArrayList[(i2 & 0xFFFF)] = new ArrayList();
        }
        if (Double.isNaN(d1)) {
          zf.a(arrayOfArrayList[(i2 & 0xFFFF)], new zbpb(i1, true, false, null));
        } else {
          zf.a(arrayOfArrayList[(i2 & 0xFFFF)], new zbpb(i1, true, false, Double.valueOf(d1)));
        }
        break;
      case 516: 
        localObject = new int[] { i1 };
        arrayOfInt = new int[] { i2 };
        str = c((int[])localObject, arrayOfInt);
        i1 = localObject[0];
        i2 = arrayOfInt[0];
        if (arrayOfArrayList[(i2 & 0xFFFF)] == null) {
          arrayOfArrayList[(i2 & 0xFFFF)] = new ArrayList();
        }
        zf.a(arrayOfArrayList[(i2 & 0xFFFF)], new zbpb(i1, false, false, str));
        break;
      case 513: 
        b();
        i1 = zc.e(this.g, 0);
        i2 = zc.e(this.g, 2);
        if (arrayOfArrayList[(i2 & 0xFFFF)] == null) {
          arrayOfArrayList[(i2 & 0xFFFF)] = new ArrayList();
        }
        zf.a(arrayOfArrayList[(i2 & 0xFFFF)], new zbpb(i1, true, false, ""));
        break;
      case 4197: 
        a(arrayOfArrayList, b1);
        b();
        b1 = this.g[0];
        arrayOfArrayList = new ArrayList[this.q.size()];
        break;
      case 2206: 
        b();
        localObject = new byte[(this.h & 0xFFFF) + 4];
        System.arraycopy(zc.a(this.f), 0, localObject, 0, 2);
        System.arraycopy(zc.a(this.h), 0, localObject, 2, 2);
        System.arraycopy(this.g, 0, localObject, 4, this.h & 0xFFFF);
        zf.a(this.b.d(), localObject);
        break;
      case 10: 
      case 442: 
      case 2128: 
        a(arrayOfArrayList, b1);
        this.e.a(-2);
        return;
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void a(ArrayList[] paramArrayOfArrayList, byte paramByte)
  {
    int i1 = 0;
    zbpb localzbpb = null;
    for (int i2 = 0; i2 < paramArrayOfArrayList.length; i2++) {
      if ((paramArrayOfArrayList[i2] != null) && (paramArrayOfArrayList[i2].size() != 0))
      {
        zip localzip = (zip)this.q.get(i2);
        zjk localzjk = new zjk(this.b);
        int i3 = 1;
        i1 = -1;
        Collections.sort(paramArrayOfArrayList[i2], new zbpc());
        ArrayList localArrayList = new ArrayList();
        for (int i4 = 0; i4 < paramArrayOfArrayList[i2].size(); i4++)
        {
          localzbpb = (zbpb)paramArrayOfArrayList[i2].get(i4);
          if ((!localzbpb.d) && (!localzbpb.c))
          {
            i3 = 3;
            break;
          }
        }
        for (i4 = 0; i4 < paramArrayOfArrayList[i2].size(); i4++)
        {
          localzbpb = (zbpb)paramArrayOfArrayList[i2].get(i4);
          if ((localzbpb.a & 0xFFFF) - i1 != 1) {
            while (i1 < (localzbpb.a & 0xFFFF) - 1)
            {
              if (i3 == 3) {
                zf.a(localArrayList, null);
              } else {
                zf.a(localArrayList, Double.valueOf(0.0D));
              }
              i1++;
            }
          }
          zf.a(localArrayList, localzbpb.b);
          i1 = localzbpb.a & 0xFFFF;
        }
        localzjk.b = localArrayList;
        localzjk.a(i3);
        Object localObject;
        if (localzip.b == 0)
        {
          localObject = (Series)localzip.a;
          switch (paramByte)
          {
          case 2: 
            if (((Series)localObject).o() == null) {
              ((Series)localObject).b(localzjk);
            } else {
              ((Series)localObject).o().b = localArrayList;
            }
            break;
          case 1: 
            if (((Series)localObject).m() == null) {
              ((Series)localObject).a(localzjk);
            } else {
              ((Series)localObject).m().b = localArrayList;
            }
            break;
          case 3: 
            if (((Series)localObject).p() == null) {
              ((Series)localObject).c(localzjk);
            } else {
              ((Series)localObject).p().b = localArrayList;
            }
            break;
          }
        }
        else if (localzip.b == 2)
        {
          localObject = (ErrorBar)localzip.a;
          if (localzip.c)
          {
            if (((ErrorBar)localObject).b() == null) {
              ((ErrorBar)localObject).a(localzjk);
            } else {
              ((ErrorBar)localObject).b().b = localArrayList;
            }
          }
          else if (((ErrorBar)localObject).c() == null) {
            ((ErrorBar)localObject).b(localzjk);
          } else {
            ((ErrorBar)localObject).c().b = localArrayList;
          }
        }
      }
    }
  }
  
  private double a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    throws Exception
  {
    b();
    paramArrayOfInt1[0] = zc.e(this.g, 0);
    paramArrayOfInt2[0] = zc.e(this.g, 2);
    return zc.f(this.g, 6);
  }
  
  private String b(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    throws Exception
  {
    b();
    paramArrayOfInt1[0] = zc.e(this.g, 0);
    paramArrayOfInt2[0] = zc.e(this.g, 2);
    switch (this.g[6])
    {
    case 0: 
      return "#NULL!";
    case 7: 
      return "#DIV/0!";
    case 15: 
      return "#VALUE!";
    case 23: 
      return "#REF!";
    case 29: 
      return "#NAME?";
    case 36: 
      return "#NUM!";
    case 42: 
      return "#N/A";
    }
    return "#N/A";
  }
  
  private String c(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    throws Exception
  {
    b();
    paramArrayOfInt1[0] = zc.e(this.g, 0);
    paramArrayOfInt2[0] = zc.e(this.g, 2);
    int i1 = zc.e(this.g, 6) & 0xFFFF;
    if (i1 == 0) {
      return "";
    }
    if (this.g[8] == 0) {
      return Encoding.getASCII().a(this.g, 9, i1);
    }
    return Encoding.getUnicode().a(this.g, 9, 2 * i1);
  }
  
  private void h()
    throws Exception
  {
    this.b.setShowDataTable(true);
    i();
    int i1 = 0;
    ChartDataTable localChartDataTable = this.b.getChartDataTable();
    zbwf localzbwf = new zbwf(this.j, this.b);
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i1++;
        E();
        break;
      case 4133: 
        a(localzbwf, false);
        break;
      case 4146: 
        a(localzbwf);
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0)
        {
          if (localzbwf != null) {
            localzbwf.a(localChartDataTable);
          }
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void i()
    throws Exception
  {
    b();
    this.b.getChartDataTable().setHasBorderHorizontal((this.g[0] & 0xFF & 0x1) != 0);
    this.b.getChartDataTable().setHasBorderVertical((this.g[0] & 0xFF & 0x2) != 0);
    this.b.getChartDataTable().setHasBorderOutline((this.g[0] & 0xFF & 0x4) != 0);
    this.b.getChartDataTable().setShowLegendKey((this.g[0] & 0xFF & 0x8) != 0);
  }
  
  private void j()
    throws Exception
  {
    a(this.f & 0xFFFF);
    ArrayList localArrayList = new ArrayList();
    this.b.b = localArrayList;
    zf.a(localArrayList, this.g);
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 2129: 
      case 2132: 
      case 2133: 
        a(this.f & 0xFFFF);
        zf.a(localArrayList, this.g);
      }
    }
    this.e.a(-2);
  }
  
  private void k()
    throws Exception
  {
    this.e.a(-2);
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 2130: 
      case 2131: 
      case 2132: 
      case 2133: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
        break;
      case 2129: 
        i1 = this.e.b(this.d) & 0xFFFF;
        this.e.a(4);
        break;
      default: 
        this.e.a(-2);
        return;
        this.f = this.e.b(this.d);
        switch (this.f)
        {
        case 4192: 
          a(this.n);
          break;
        case 10: 
        case 574: 
          throw new IOException("File is corrupted");
        default: 
          this.e.a(i1 - 6);
        }
        break;
      }
    }
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    b();
    zbm localzbm = new zbm(this.b, 0, false);
    localzbm.a = zc.e(this.g, 0);
    localzbm.b = zc.e(this.g, 2);
    localzbm.e = zc.e(this.g, 4);
    localzbm.c = zc.e(this.g, 6);
    localzbm.d = (zc.e(this.g, 8) & 0xFFFF);
    zf.a(paramArrayList, localzbm);
  }
  
  private int l()
    throws Exception
  {
    b();
    int i1 = zc.e(this.g, 0) & 0xFFFF;
    if ((i1 == 65535) || (!this.c.b)) {
      i1 = 0;
    }
    return i1;
  }
  
  private void m()
  {
    if (!this.o)
    {
      this.b.getPlotArea().getArea().setFormatting(1);
      this.b.getPlotArea().getBorder().setVisible(false);
    }
    int i1 = this.b.q().a(false).j();
    int i2 = this.b.q().getCount();
    if ((this.b.getNSeries().getCount() == 3) && (i2 == 1) && (i1 == 37))
    {
      if (this.b.i.a(0).n()) {
        i1 = 65;
      }
    }
    else if (this.b.getNSeries().getCount() == 4)
    {
      if (i2 == 1)
      {
        if ((i1 == 37) && (this.b.q().a(0).t())) {
          i1 = 66;
        }
      }
      else if ((i2 == 2) && (!this.b.q().a(0).m()) && (this.b.q().a(1).m()) && (i1 == 14) && (this.b.q().a(1).j() == 37)) {
        i1 = 67;
      }
    }
    else if ((this.b.getNSeries().getCount() == 5) && (i2 == 2) && (!this.b.q().a(0).m()) && (this.b.q().a(1).m()) && (i1 == 14) && (this.b.q().a(1).j() == 37) && (this.b.q().a(1).t())) {
      i1 = 68;
    }
    this.b.d(i1);
    Object localObject1 = this.b.getNSeries().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Series)((Iterator)localObject1).next();
      if ((((Series)localObject2).m() == null) || (((Series)localObject2).c() == null) || (((Series)localObject2).c().a() == 0)) {}
    }
    if ((this.b.p() != null) && (this.b.p().getCount() != 0))
    {
      localObject1 = this.b.getShapes().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Shape)((Iterator)localObject1).next();
        if (((Shape)localObject2).getPlacement() != 2)
        {
          ((Shape)localObject2).R().i().a(2);
          ((Shape)localObject2).setPlacement(1);
        }
      }
    }
    if ((this.u != null) || (this.s != 0) || (this.u != null))
    {
      localObject1 = this.u;
      if (this.r != null)
      {
        if (this.r.get(Integer.valueOf(0)) != null) {
          if (localObject1 == null)
          {
            localObject1 = (zbwf)this.r.get(Integer.valueOf(0));
          }
          else
          {
            zauc tmp561_558 = ((zbwf)localObject1).L();
            tmp561_558.e = ((byte)(tmp561_558.e | ((zbwf)this.r.get(Integer.valueOf(0))).L().e));
          }
        }
        if (this.r.get(Integer.valueOf(1)) != null) {
          if (localObject1 == null)
          {
            localObject1 = (zbwf)this.r.get(Integer.valueOf(1));
          }
          else
          {
            zauc tmp630_627 = ((zbwf)localObject1).L();
            tmp630_627.e = ((byte)(tmp630_627.e | ((zbwf)this.r.get(Integer.valueOf(1))).L().e));
          }
        }
      }
      for (int i3 = 0; i3 < this.q.size(); i3++)
      {
        zip localzip = (zip)this.q.get(i3);
        if (localzip.b == 0)
        {
          Series localSeries = (Series)localzip.a;
          int i4 = 0;
          if (this.p != null) {
            for (int i5 = 0; i5 < this.p.size(); i5++)
            {
              zauc localzauc = (zauc)this.p.get(i5);
              if (((localzauc.b & 0xFFFF) == i3) && ((localzauc.c & 0xFFFF) == 65535))
              {
                i4 = 1;
                break;
              }
            }
          }
          if (i4 == 0)
          {
            DataLabels localDataLabels = localSeries.getDataLabels();
            if (localObject1 != null)
            {
              ((zbwf)localObject1).a(localDataLabels, -1, this.p);
            }
            else
            {
              boolean bool = (this.s & 0xFF & 0x1) != 0;
              if (bool) {
                localDataLabels.a(1, bool);
              }
              bool = (this.s & 0xFF & 0x2) != 0;
              if (bool) {
                localDataLabels.a(2, bool);
              }
              bool = (this.s & 0xFF & 0x10) != 0;
              if (bool) {
                localDataLabels.a(3, bool);
              }
              bool = (this.s & 0xFF & 0x20) != 0;
              if (bool) {
                localDataLabels.a(4, bool);
              }
            }
          }
        }
      }
    }
    this.b.q = this.t;
    if (this.t != 0) {
      n();
    }
    if (ChartCollection.b(this.b.getType()))
    {
      if (!this.v) {
        this.b.getWalls().setFormatting(0);
      }
      this.b.B().a(this.b.getWalls(), null);
    }
  }
  
  private void n()
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.q.size(); i2++)
    {
      zip localzip1 = (zip)this.q.get(i2);
      if (localzip1.b == 0)
      {
        if (localzip1.g != null) {
          localzip1.g.b(i1);
        }
        i1++;
      }
    }
    i2 = this.b.getNSeries().getCount();
    for (int i3 = 0; i3 < this.q.size(); i3++)
    {
      zip localzip2 = (zip)this.q.get(i3);
      if (localzip2.b == 1)
      {
        if (localzip2.g != null) {
          localzip2.g.b(i1);
        }
        Trendline localTrendline = (Trendline)localzip2.a;
        localTrendline.p(i1 - i2);
        i1++;
      }
    }
  }
  
  private void o()
    throws Exception
  {
    b();
    boolean bool = this.g[0] == 1;
    int i1 = zc.b(this.g, 2);
    int i2 = zc.b(this.g, 6);
    int i3 = zc.b(this.g, 10);
    int i4 = zc.b(this.g, 14);
    this.b.getPlotArea().c(i1, i2, i3, i4);
    Axis localAxis = null;
    int i5 = 0;
    Color localColor = Color.getEmpty();
    int i6 = 1;
    zbwf localzbwf = null;
    for (;;)
    {
      this.f = this.e.b(this.d);
      Object localObject;
      switch (this.f)
      {
      case 4147: 
        i5++;
        E();
        break;
      case 4175: 
        a(this.b.getPlotArea(), !bool);
        break;
      case 4125: 
        b();
        i6 = 1;
        localColor = Color.getEmpty();
        switch (this.g[0])
        {
        case 0: 
          if (bool) {
            localAxis = this.b.getSecondCategoryAxis();
          } else {
            localAxis = this.b.getCategoryAxis();
          }
          localAxis.setMajorTickMark(0);
          break;
        case 1: 
          if (bool) {
            localAxis = this.b.getSecondValueAxis();
          } else {
            localAxis = this.b.getValueAxis();
          }
          localAxis.setMajorTickMark(0);
          break;
        case 2: 
          localAxis = this.b.getSeriesAxis();
          break;
        }
        localAxis.setVisible(true);
        break;
      case 4128: 
        f(localAxis);
        break;
      case 4194: 
        g(localAxis);
        break;
      case 4129: 
        e(localAxis);
        break;
      case 4127: 
        d(localAxis);
        break;
      case 4174: 
        c(localAxis);
        break;
      case 4126: 
        boolean[] arrayOfBoolean = { i6 };
        localColor = a(localAxis, arrayOfBoolean);
        i6 = arrayOfBoolean[0];
        break;
      case 4134: 
        int i7 = l();
        if (i7 != -1)
        {
          localAxis.getTickLabels().a(i7);
          localObject = c(i7);
          localAxis.getTickLabels().a(localObject != null);
          Font localFont = b(i7);
          if (!a(localFont, localColor)) {
            localAxis.getTickLabels().getFont().setColor(localColor);
          }
        }
        break;
      case 4149: 
        s();
        break;
      case 4133: 
        localzbwf = new zbwf(this.j, this.b);
        a(localzbwf, true);
        if (localzbwf.M() != null) {
          localzbwf.a(this.b, bool);
        }
        break;
      case 4116: 
        a(bool);
        break;
      case 2134: 
        b(localAxis);
        break;
      case 2135: 
        localzbwf = a(localAxis, false);
        if (localzbwf.L() != null) {
          localzbwf.a(localAxis, localAxis.getDisplayUnitLabel(), this.n);
        }
        break;
      case 2206: 
        if (i5 == 2)
        {
          if (localAxis.a == null) {
            localAxis.a = new ArrayList();
          }
          zf.a(localAxis.a, p());
        }
        else
        {
          this.h = this.e.b(this.d);
          this.e.a(this.h & 0xFFFF);
        }
        break;
      case 2212: 
        localObject = z();
        if (localObject != null)
        {
          if (localAxis.b == null) {
            localAxis.b = new ArrayList();
          }
          zf.a(localAxis.b, localObject);
        }
        break;
      case 2213: 
        localAxis.c = A();
        break;
      case 4148: 
        F();
        i5--;
        if (i5 == 0) {
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private byte[] p()
    throws Exception
  {
    b();
    int i1 = zc.a(this.g, 12) + 4;
    byte[] arrayOfByte = new byte[i1];
    System.arraycopy(this.g, 16, arrayOfByte, 0, i1);
    return arrayOfByte;
  }
  
  static boolean a(Font paramFont, Color paramColor)
  {
    if (zh.a(paramColor))
    {
      int i1 = 0;
      boolean[] arrayOfBoolean = { i1 };
      int i2 = paramFont.a(false, arrayOfBoolean);
      i1 = arrayOfBoolean[0];
      return (i2 == -1) || (i2 > 56);
    }
    return paramFont.getColor().equals(paramColor);
  }
  
  private Font b(int paramInt)
  {
    return this.j.i(paramInt);
  }
  
  private zbm c(int paramInt)
  {
    Iterator localIterator = this.b.G().iterator();
    while (localIterator.hasNext())
    {
      zbm localzbm = (zbm)localIterator.next();
      if (localzbm.d == paramInt) {
        return localzbm;
      }
    }
    return null;
  }
  
  private zbwf a(Axis paramAxis, boolean paramBoolean)
    throws Exception
  {
    if ((this.f & 0xFFFF) != 2135)
    {
      this.h = this.e.b(this.d);
      this.e.a(this.h & 0xFFFF);
    }
    else
    {
      a(paramAxis);
    }
    int i1 = 0;
    zbwf localzbwf = new zbwf(this.j, this.b);
    localzbwf.m(paramBoolean);
    int i2 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 2130: 
      case 2131: 
      case 2132: 
      case 2133: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
        break;
      case 2129: 
        i1 = this.e.b(this.d) & 0xFFFF;
        this.e.a(4);
        break;
      case 2155: 
        a(localzbwf.M());
        break;
      default: 
        this.e.a(-2);
        return localzbwf;
        this.f = this.e.b(this.d);
        switch (this.f)
        {
        case 4133: 
          c(localzbwf);
          break;
        case 4147: 
          this.e.a(i1 - 6);
          i2++;
          break;
        case 4164: 
          this.e.a(i1 - 6);
          i2--;
          if (i2 == 0) {
            return localzbwf;
          }
          break;
        case 4175: 
          a(localzbwf, true);
          break;
        case 4134: 
          localzbwf.c(l());
          localzbwf.p = c(localzbwf.l());
          if ((this.h & 0xFFFF) + 8 < i1) {
            this.e.a(i1 - 8 - (this.h & 0xFFFF));
          }
          break;
        case 4135: 
          b(localzbwf.L());
          if ((localzbwf.L().a == 4) && (!localzbwf.J()))
          {
            if (this.p == null) {
              this.p = new ArrayList();
            }
            zf.a(this.p, localzbwf.L());
          }
          break;
        case 4177: 
          b(localzbwf);
          break;
        case 4109: 
          localzbwf.b(B());
          break;
        case 4146: 
          b(localzbwf);
          break;
        case 4103: 
          a(localzbwf.getBorder());
          break;
        case 4106: 
          d(localzbwf.getArea());
          break;
        case 4198: 
          a(localzbwf.getArea());
          break;
        case 10: 
        case 574: 
          throw new IOException("File is corrupted");
        default: 
          this.e.a(i1 - 6);
        }
        break;
      }
    }
  }
  
  private void a(Area paramArea)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    do
    {
      b();
      zf.a(localArrayList, this.g);
      this.f = this.e.b(this.d);
      if ((this.f & 0xFFFF) != 2129) {
        break;
      }
      this.e.a(6);
      this.f = this.e.b(this.d);
    } while (((this.f & 0xFFFF) == 4198) && ((this.f & 0xFFFF) == 60));
    this.e.a(-10);
    paramArea.getFillFormat().a(paramArea.getFillFormat().a(localArrayList), false);
  }
  
  private void b(Area paramArea)
    throws Exception
  {
    b();
    TextureFill localTextureFill = paramArea.getFillFormat().getTextureFill();
    if (localTextureFill == null) {
      return;
    }
    PicFormatOption localPicFormatOption = new PicFormatOption();
    switch (this.g[0])
    {
    case 1: 
      localPicFormatOption.setType(0);
      break;
    case 2: 
      localPicFormatOption.setType(1);
      break;
    case 3: 
      localPicFormatOption.setType(2);
      break;
    default: 
      localPicFormatOption.setType(0);
    }
    localPicFormatOption.a = zc.e(this.g, 2);
    localPicFormatOption.a(zc.e(this.g, 4));
    if (localPicFormatOption.getType() == 2) {
      localPicFormatOption.setScale(zc.f(this.g, 6));
    }
    localTextureFill.setPicFormatOption(localPicFormatOption);
  }
  
  private void c(Area paramArea)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    do
    {
      b();
      zf.a(localArrayList, this.g);
      this.f = this.e.b(this.d);
    } while (((this.f & 0xFFFF) == 4198) || ((this.f & 0xFFFF) == 60));
    this.e.a(-2);
    paramArea.getFillFormat().a(paramArea.getFillFormat().a(localArrayList), false);
  }
  
  private void a(Axis paramAxis)
    throws Exception
  {
    b();
    paramAxis.setDisplayUnitLabelShown((this.g[14] & 0xFF & 0x2) != 0);
    switch (this.g[4])
    {
    case 1: 
      paramAxis.setDisplayUnit(1);
      break;
    case 2: 
      paramAxis.setDisplayUnit(2);
      break;
    case 5: 
      paramAxis.setDisplayUnit(5);
      break;
    case 8: 
      paramAxis.setDisplayUnit(8);
      break;
    case 9: 
      paramAxis.setDisplayUnit(9);
      break;
    }
  }
  
  private void b(Axis paramAxis)
    throws Exception
  {
    b();
    if (paramAxis.b() == 0)
    {
      paramAxis.getTickLabels().setOffset(zc.e(this.g, 4));
      if (paramAxis.getTickLabelSpacing() == 1) {
        paramAxis.a((this.g[8] & 0xFF & 0x1) != 0);
      }
    }
  }
  
  private Color a(Axis paramAxis, boolean[] paramArrayOfBoolean)
    throws Exception
  {
    b();
    switch (this.g[0])
    {
    case 0: 
      paramAxis.setMajorTickMark(2);
      break;
    case 1: 
      paramAxis.setMajorTickMark(1);
      break;
    case 2: 
      paramAxis.setMajorTickMark(3);
      break;
    case 3: 
      paramAxis.setMajorTickMark(0);
      break;
    }
    switch (this.g[1])
    {
    case 0: 
      paramAxis.setMinorTickMark(2);
      break;
    case 1: 
      paramAxis.setMinorTickMark(1);
      break;
    case 2: 
      paramAxis.setMinorTickMark(3);
      break;
    case 3: 
      paramAxis.setMinorTickMark(0);
      break;
    }
    switch (this.g[2])
    {
    case 0: 
      paramAxis.setTickLabelPosition(3);
      break;
    case 1: 
      paramAxis.setTickLabelPosition(1);
      break;
    case 2: 
      paramAxis.setTickLabelPosition(0);
      break;
    case 3: 
      paramAxis.setTickLabelPosition(2);
      break;
    }
    if ((this.g[24] & 0xFF & 0x2) != 0) {
      paramAxis.getTickLabels().setBackgroundMode(0);
    } else {
      switch (this.g[3])
      {
      case 1: 
        paramAxis.getTickLabels().setBackgroundMode(2);
        break;
      case 2: 
        paramAxis.getTickLabels().setBackgroundMode(1);
        break;
      }
    }
    if ((this.g[24] & 0xFF & 0x20) == 0) {
      if (((this.g[28] & 0xFF) > 90) && ((this.g[28] & 0xFF) != 255))
      {
        paramAxis.getTickLabels().setRotationAngle(90 - (this.g[28] & 0xFF));
      }
      else
      {
        if ((this.g[28] & 0xFF) == 255) {
          paramAxis.getTickLabels().b(true);
        }
        paramAxis.getTickLabels().setRotationAngle(this.g[28]);
      }
    }
    if ((this.g[25] & 0xFF & 0x40) != 0) {
      paramAxis.getTickLabels().setTextDirection(1);
    } else if ((this.g[25] & 0xFF & 0x80) != 0) {
      paramAxis.getTickLabels().setTextDirection(2);
    }
    paramArrayOfBoolean[0] = ((this.g[24] & 0xFF & 0x1) != 0 ? 1 : false);
    if (paramArrayOfBoolean[0] == 0) {
      return b(this.g, 4);
    }
    return Color.getEmpty();
  }
  
  private void c(Axis paramAxis)
    throws Exception
  {
    b();
    TickLabels localTickLabels = paramAxis.getTickLabels();
    localTickLabels.setNumberFormatLinked(false);
    int i1 = zc.e(this.g, 0) & 0xFFFF;
    String str = g(i1);
    if ((str == null) || ("".equals(str)))
    {
      localTickLabels.c(i1);
      localTickLabels.a = false;
    }
    else
    {
      localTickLabels.setNumberFormat(str);
    }
  }
  
  private void a(boolean paramBoolean)
    throws Exception
  {
    b();
    int i1 = zc.e(this.g, 18) & 0xFFFF;
    zka localzka = this.b.q().b(i1);
    localzka.b(paramBoolean);
    localzka.k((this.g[16] & 0xFF & 0x1) != 0);
    int i2 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i2++;
        E();
        break;
      case 4119: 
        m(localzka);
        break;
      case 4120: 
        j(localzka);
        break;
      case 4121: 
        i(localzka);
        break;
      case 4193: 
        h(localzka);
        break;
      case 4199: 
        localzka.a(q());
        break;
      case 4123: 
        g(localzka);
        break;
      case 4122: 
        e(localzka);
        break;
      case 4158: 
        d(localzka);
        break;
      case 4160: 
        c(localzka);
        break;
      case 4159: 
        b(localzka);
        break;
      case 4130: 
        k(localzka);
        break;
      case 4154: 
        l(localzka);
        break;
      case 4117: 
        r();
        break;
      case 4132: 
        x();
        break;
      case 2154: 
        this.u = a(null, true);
        break;
      case 4157: 
        a(localzka);
        break;
      case 4124: 
        f(localzka);
        break;
      case 4102: 
        a(localzka);
        break;
      case 4148: 
        F();
        i2--;
        if (i2 == 0)
        {
          s(localzka);
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void a(zka paramzka)
    throws Exception
  {
    b();
    paramzka.j(true);
    DropBars localDropBars = paramzka.u();
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i1++;
        E();
        break;
      case 4103: 
        a(localDropBars.getBorder());
        break;
      case 4106: 
        d(localDropBars.getArea());
        break;
      case 4198: 
        c(localDropBars.getArea());
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0)
        {
          this.f = this.e.b(this.d);
          if ((this.f & 0xFFFF) == 4157)
          {
            b();
          }
          else
          {
            this.e.a(-2);
            return;
          }
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void b(zka paramzka)
    throws Exception
  {
    b();
    if ((this.g[0] & 0xFF & 0x1) != 0) {
      paramzka.b(69);
    } else {
      paramzka.b(70);
    }
    paramzka.m((this.g[0] & 0xFF & 0x2) != 0);
  }
  
  private void c(zka paramzka)
    throws Exception
  {
    b();
    paramzka.n((this.g[0] & 0xFF & 0x1) != 0);
    paramzka.b(59);
  }
  
  private void d(zka paramzka)
    throws Exception
  {
    b();
    paramzka.n((this.g[0] & 0xFF & 0x1) != 0);
    paramzka.m((this.g[0] & 0xFF & 0x2) != 0);
    paramzka.b(58);
  }
  
  private void e(zka paramzka)
    throws Exception
  {
    b();
    int i1 = (this.g[0] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i2 = (this.g[0] & 0xFF & 0x2) != 0 ? 1 : 0;
    paramzka.m((this.g[0] & 0xFF & 0x4) != 0);
    if (i1 != 0)
    {
      if (i2 != 0) {
        paramzka.b(2);
      } else {
        paramzka.b(1);
      }
    }
    else {
      paramzka.b(0);
    }
  }
  
  private void f(zka paramzka)
    throws Exception
  {
    b();
    Line localLine = null;
    switch (this.g[0])
    {
    case 0: 
      paramzka.h(true);
      localLine = paramzka.s();
      break;
    case 1: 
      paramzka.d(true);
      localLine = paramzka.o();
      break;
    case 2: 
      paramzka.f(true);
      localLine = paramzka.q();
      break;
    case 3: 
      localLine = paramzka.O();
      break;
    }
    if (localLine == null) {
      return;
    }
    this.f = this.e.b(this.d);
    if ((this.f & 0xFFFF) != 4103) {
      throw new IOException("File is corrupted");
    }
    a(localLine);
  }
  
  private void g(zka paramzka)
    throws Exception
  {
    b();
    int i1 = (this.g[4] & 0xFF & 0x1) != 0 ? 1 : 0;
    if (i1 != 0)
    {
      paramzka.m((this.g[4] & 0xFF & 0x4) != 0);
      paramzka.l((this.g[4] & 0xFF & 0x2) != 0);
      paramzka.b(12);
      paramzka.h(zc.e(this.g, 0));
      switch (this.g[2])
      {
      case 1: 
        paramzka.i(0);
        break;
      case 2: 
        paramzka.i(1);
        break;
      }
    }
    else
    {
      paramzka.b(63);
    }
  }
  
  private void h(zka paramzka)
    throws Exception
  {
    b();
    switch (this.g[0])
    {
    case 0: 
      return;
    case 1: 
      paramzka.b(46);
      break;
    case 2: 
      paramzka.b(49);
      break;
    }
    if (this.g[1] != 1) {
      switch (this.g[2])
      {
      case 0: 
        paramzka.g(0);
        paramzka.a(zc.b(this.g, 4));
        break;
      case 1: 
        paramzka.g(1);
        paramzka.a(zc.f(this.g, 12));
        break;
      case 2: 
        paramzka.g(2);
        paramzka.a(zc.b(this.g, 6));
        break;
      case 3: 
        paramzka.g(3);
        break;
      }
    }
    paramzka.f(zc.e(this.g, 8));
    paramzka.c(zc.e(this.g, 10));
    paramzka.m((this.g[20] & 0xFF & 0x1) != 0);
  }
  
  private int[] q()
    throws Exception
  {
    b();
    int i1 = this.g[0] & 0xFF;
    int i2 = i1 - 1;
    ArrayList localArrayList = new ArrayList();
    for (int i3 = this.g.length - 1; (i3 > 0) && (i2 >= 0); i3--) {
      if (this.g[i3] == 0)
      {
        i2 -= 8;
      }
      else
      {
        if ((i3 != 0) && ((this.g[i3] & 0xFF & 0x1) != 0)) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x2) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x4) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x8) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x10) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x20) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x40) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
        if ((this.g[i3] & 0xFF & 0x80) != 0) {
          zf.a(localArrayList, Integer.valueOf(i2));
        }
        i2--;
      }
    }
    if (localArrayList.size() > 0)
    {
      int[] arrayOfInt = new int[localArrayList.size()];
      Collections.sort(localArrayList);
      for (int i4 = 0; i4 < localArrayList.size(); i4++) {
        arrayOfInt[i4] = ((Integer)localArrayList.get(i4)).intValue();
      }
      return arrayOfInt;
    }
    return null;
  }
  
  private void i(zka paramzka)
    throws Exception
  {
    b();
    paramzka.d(zc.e(this.g, 0));
    paramzka.j(zc.e(this.g, 2));
    paramzka.m((this.g[4] & 0xFF & 0x1) != 0);
    paramzka.o((this.g[4] & 0xFF & 0x2) != 0);
    if (paramzka.K() == 0) {
      paramzka.b(44);
    } else {
      paramzka.b(35);
    }
  }
  
  private void j(zka paramzka)
    throws Exception
  {
    b();
    int i1 = (this.g[0] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i2 = (this.g[0] & 0xFF & 0x2) != 0 ? 1 : 0;
    paramzka.m((this.g[0] & 0xFF & 0x4) != 0);
    int i3 = 40;
    if (i1 != 0) {
      if (i2 != 0) {
        i3 = 42;
      } else {
        i3 = 41;
      }
    }
    paramzka.b(i3);
  }
  
  private void k(zka paramzka)
    throws Exception
  {
    this.e.a(12);
  }
  
  private void l(zka paramzka)
    throws Exception
  {
    b();
    this.b.setRotationAngle(zc.b(this.g, 0));
    this.b.setElevation(zc.b(this.g, 2));
    this.b.setPerspective((short)(zc.b(this.g, 4) / 2));
    int i1 = zc.e(this.g, 6) & 0xFFFF;
    if ((this.g[12] & 0xFF & 0x10) != 0) {
      this.b.m = i1;
    } else if ((i1 >= 5) && (i1 <= 500)) {
      this.b.m = i1;
    }
    this.b.setDepthPercent(zc.b(this.g, 8));
    this.b.setGapDepth(zc.b(this.g, 10));
    this.b.setAutoScaling((this.g[12] & 0xFF & 0x4) != 0);
    this.b.setWallsAndGridlines2D((this.g[12] & 0xFF & 0x20) != 0);
    this.b.setRightAngleAxes((this.g[12] & 0xFF & 0x1) == 0);
    int i2 = (this.g[12] & 0xFF & 0x2) != 0 ? 1 : 0;
    switch (paramzka.j())
    {
    case 14: 
      if (i2 != 0) {
        paramzka.b(18);
      } else {
        paramzka.b(17);
      }
      break;
    case 16: 
      paramzka.b(20);
      break;
    case 15: 
      paramzka.b(19);
      break;
    case 6: 
      paramzka.b(9);
      break;
    case 8: 
      paramzka.b(11);
      break;
    case 7: 
      paramzka.b(10);
      break;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
      paramzka.b(43);
      break;
    case 44: 
      paramzka.b(45);
      break;
    case 47: 
      paramzka.b(48);
      break;
    case 0: 
      paramzka.b(3);
      break;
    case 2: 
      paramzka.b(5);
      break;
    case 1: 
      paramzka.b(4);
      break;
    case 70: 
      if ((this.b.getElevation() == 90) && (this.b.getRotationAngle() == 0)) {
        paramzka.b(72);
      }
      break;
    case 69: 
      if ((this.b.getElevation() == 90) && (this.b.getRotationAngle() == 0)) {
        paramzka.b(71);
      }
      break;
    }
  }
  
  private void m(zka paramzka)
    throws Exception
  {
    b();
    paramzka.e(-zc.b(this.g, 0));
    paramzka.c(zc.b(this.g, 2));
    int i1 = (this.g[4] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i2 = (this.g[4] & 0xFF & 0x2) != 0 ? 1 : 0;
    int i3 = (this.g[4] & 0xFF & 0x4) != 0 ? 1 : 0;
    paramzka.m((this.g[4] & 0xFF & 0x8) != 0);
    int i4;
    if (i1 != 0)
    {
      i4 = 6;
      if (i2 != 0) {
        if (i3 != 0) {
          i4 = 8;
        } else {
          i4 = 7;
        }
      }
    }
    else
    {
      i4 = 14;
      if (i2 != 0) {
        if (i3 != 0) {
          i4 = 16;
        } else {
          i4 = 15;
        }
      }
    }
    paramzka.b(i4);
  }
  
  private void r()
    throws Exception
  {
    this.b.setShowLegend(true);
    Legend localLegend = this.b.getLegend();
    a(localLegend);
    int i1 = 0;
    zbwf localzbwf = new zbwf(this.j, this.b);
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i1++;
        E();
        break;
      case 4175: 
        b(localLegend);
        break;
      case 4133: 
        a(localzbwf, false);
        break;
      case 4146: 
        a(localzbwf);
        break;
      case 2205: 
        b();
        localzbwf.a = new byte[this.h];
        System.arraycopy(this.g, 0, localzbwf.a, 0, this.h & 0xFFFF);
        break;
      case 2213: 
        b();
        localzbwf.b(new byte[this.h]);
        System.arraycopy(this.g, 0, localzbwf.c(), 0, this.h & 0xFFFF);
        break;
      case 2206: 
        b();
        localzbwf.c = new byte[this.h];
        System.arraycopy(this.g, 0, localzbwf.c, 0, this.h & 0xFFFF);
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0)
        {
          localzbwf.a(localLegend, true);
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void a(Legend paramLegend)
    throws Exception
  {
    b();
    int i1 = (this.g[18] & 0xFF & 0x1) != 0 ? 1 : 0;
    paramLegend.j((this.g[18] & 0xFF & 0x10) != 0);
    int i2 = zc.a(this.g, 0);
    int i3 = zc.a(this.g, 4);
    if ((i2 >= 0) && (i3 >= 0))
    {
      paramLegend.e(i2);
      paramLegend.f(i3);
      int i4 = zc.a(this.g, 8);
      if (i4 != 0) {
        paramLegend.h(i4);
      }
      i4 = zc.a(this.g, 12);
      if (i4 != 0) {
        paramLegend.g(i4);
      }
      paramLegend.e((this.g[18] & 0xFF & 0x4) != 0);
      paramLegend.f((this.g[18] & 0xFF & 0x8) != 0);
    }
    switch (this.g[16])
    {
    case 0: 
      paramLegend.a(0);
      break;
    case 1: 
      paramLegend.a(1);
      break;
    case 2: 
      paramLegend.a(2);
      break;
    case 3: 
      paramLegend.a(3);
      break;
    case 4: 
      paramLegend.a(4);
      break;
    case 7: 
      if (paramLegend.m()) {
        paramLegend.a(3);
      } else {
        paramLegend.a(7);
      }
      break;
    }
  }
  
  private void s()
    throws Exception
  {
    this.o = true;
    this.e.a(2);
    int i1 = this.e.b(this.d);
    if ((i1 & 0xFFFF) != 4146) {
      throw new IOException("File is corrupted");
    }
    a(this.b.getPlotArea());
  }
  
  private void d(Axis paramAxis)
    throws Exception
  {
    b();
    int i1 = this.g[40];
    boolean bool = (i1 & 0xFF & 0x20) != 0;
    paramAxis.setLogarithmic(bool);
    if ((i1 & 0xFF & 0x1) == 0) {
      if (bool) {
        paramAxis.setMinValue(Double.valueOf(Math.pow(10.0D, zc.f(this.g, 0))));
      } else {
        paramAxis.setMinValue(Double.valueOf(zc.f(this.g, 0)));
      }
    }
    if ((i1 & 0xFF & 0x2) == 0) {
      if (bool) {
        paramAxis.setMaxValue(Double.valueOf(Math.pow(10.0D, zc.f(this.g, 8))));
      } else {
        paramAxis.setMaxValue(Double.valueOf(zc.f(this.g, 8)));
      }
    }
    if ((i1 & 0xFF & 0x4) == 0) {
      if (bool) {
        paramAxis.setMajorUnit(Math.pow(10.0D, zc.f(this.g, 16)));
      } else {
        paramAxis.setMajorUnit(zc.f(this.g, 16));
      }
    }
    if ((i1 & 0xFF & 0x8) == 0) {
      if (bool) {
        paramAxis.setMinorUnit(Math.pow(10.0D, zc.f(this.g, 24)));
      } else {
        paramAxis.setMinorUnit(zc.f(this.g, 24));
      }
    }
    if ((i1 & 0xFF & 0x10) == 0) {
      if (bool) {
        paramAxis.c(Math.pow(10.0D, zc.f(this.g, 32)));
      } else {
        paramAxis.c(zc.f(this.g, 32));
      }
    }
    paramAxis.setPlotOrderReversed((i1 & 0xFF & 0x40) != 0);
    if ((i1 & 0xFF & 0x80) != 0) {
      paramAxis.setCrossType(1);
    }
  }
  
  private void e(Axis paramAxis)
    throws Exception
  {
    b();
    int i1 = this.g[0];
    int i2 = this.e.b(this.d);
    if ((i2 & 0xFFFF) != 4103)
    {
      this.e.a(-2);
      return;
    }
    switch (i1)
    {
    case 0: 
      h(paramAxis);
      break;
    case 1: 
      Line localLine1 = new Line(this.b, paramAxis);
      a(localLine1);
      paramAxis.a(localLine1);
      break;
    case 2: 
      Line localLine2 = new Line(this.b, paramAxis);
      a(localLine2);
      paramAxis.b(localLine2);
      break;
    case 3: 
      if (paramAxis.b() == 0)
      {
        this.v = true;
        a(this.b.C().getBorder());
      }
      else if (paramAxis.b() == 1)
      {
        a(this.b.v().getBorder());
      }
      else
      {
        this.v = true;
        a(this.b.C().getBorder());
      }
      i2 = this.e.b(this.d);
      if ((i2 & 0xFFFF) == 2132)
      {
        d(2133);
        i2 = this.e.b(this.d);
      }
      if ((i2 & 0xFFFF) != 4106) {
        throw new IOException("File is corrupted");
      }
      Object localObject = null;
      switch (paramAxis.b())
      {
      case 0: 
        localObject = this.b.C();
        break;
      case 1: 
        localObject = this.b.v();
        break;
      default: 
        localObject = this.b.C();
      }
      d((Area)localObject);
      i2 = this.e.b(this.d);
      if ((i2 & 0xFFFF) != 4198) {
        this.e.a(-2);
      } else {
        c((Area)localObject);
      }
      break;
    default: 
      throw new IOException("File is corrupted");
    }
  }
  
  private void d(int paramInt)
    throws Exception
  {
    do
    {
      this.h = this.e.b(this.d);
      this.e.a(this.h & 0xFFFF);
      this.f = this.e.b(this.d);
    } while ((this.f & 0xFFFF) != paramInt);
    this.h = this.e.b(this.d);
    this.e.a(this.h & 0xFFFF);
  }
  
  private void f(Axis paramAxis)
    throws Exception
  {
    b();
    paramAxis.setPlotOrderReversed((this.g[6] & 0xFF & 0x4) != 0);
    paramAxis.setAxisBetweenCategories((this.g[6] & 0xFF & 0x1) != 0);
    int i1 = (this.g[6] & 0xFF & 0x2) != 0 ? 1 : 0;
    if (i1 != 0) {
      paramAxis.setCrossType(1);
    } else {
      paramAxis.setCrossAt(zc.e(this.g, 0));
    }
    int i2 = zc.e(this.g, 2);
    if ((i2 & 0xFFFF) != 1) {
      paramAxis.setTickLabelSpacing(i2);
    }
    paramAxis.setTickMarkSpacing(zc.e(this.g, 4));
  }
  
  private DateTime a(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      DateTime localDateTime = new DateTime(1900, 1, 1);
      switch (paramInt2)
      {
      case 1: 
        localDateTime = localDateTime.addMonths(paramInt1);
        break;
      case 2: 
        localDateTime = localDateTime.addYears(paramInt1);
        break;
      }
      return localDateTime;
    }
    return CellsHelper.getDateTimeFromDouble(paramInt1, this.j.p().getSettings().getDate1904());
  }
  
  private void g(Axis paramAxis)
    throws Exception
  {
    b();
    int i1 = (this.g[16] & 0xFF & 0x10) != 0 ? 1 : 0;
    int i2 = (this.g[16] & 0xFF & 0x80) != 0 ? 1 : 0;
    if (i1 != 0) {
      paramAxis.setCategoryType(2);
    } else if (i2 != 0) {
      paramAxis.setCategoryType(0);
    } else {
      paramAxis.setCategoryType(1);
    }
    paramAxis.setBaseUnitScale(h(this.g[12] & 0xFF));
    paramAxis.setBaseUnitAuto((this.g[16] & 0xFF & 0x20) != 0);
    int i3;
    if ((this.g[16] & 0xFF & 0x1) != 1)
    {
      i3 = zc.e(this.g, 0) & 0xFFFF;
      if ((i1 != 0) && (!paramAxis.isBaseUnitAuto())) {
        paramAxis.setMinValue(a(i3, paramAxis.getBaseUnitScale()));
      } else {
        paramAxis.setMinValue(Integer.valueOf(i3));
      }
    }
    if ((this.g[16] & 0xFF & 0x2) != 2)
    {
      i3 = zc.e(this.g, 2) & 0xFFFF;
      if ((i1 != 0) && (!paramAxis.isBaseUnitAuto())) {
        paramAxis.setMaxValue(a(i3, paramAxis.getBaseUnitScale()));
      } else {
        paramAxis.setMaxValue(Integer.valueOf(i3));
      }
    }
    if ((this.g[16] & 0xFF & 0x4) != 4)
    {
      paramAxis.a(zc.e(this.g, 4));
      paramAxis.setAutomaticMajorUnit(false);
      paramAxis.e(h(this.g[6] & 0xFF));
    }
    if ((this.g[16] & 0xFF & 0x8) != 8)
    {
      paramAxis.b(zc.e(this.g, 8));
      paramAxis.setAutomaticMinorUnit(false);
      paramAxis.f(h(this.g[10] & 0xFF));
    }
    if ((this.g[16] & 0xFF & 0x40) != 64)
    {
      paramAxis.setCrossAt(zc.e(this.g, 14));
    }
    else
    {
      if ((i1 != 0) && (paramAxis.getCrossType() != 1)) {
        paramAxis.setCrossType(0);
      }
      paramAxis.f = true;
    }
  }
  
  private void t()
    throws Exception
  {
    b();
    this.l = (this.g[0] == 2);
  }
  
  private void u()
    throws Exception
  {
    b();
    this.b.a(this.g[0]);
    if ((this.g[0] & 0xFF & 0x18) == 24)
    {
      this.b.getPlotArea().e(false);
      this.b.getPlotArea().f(false);
      this.b.getPlotArea().g(false);
    }
    switch (this.g[2])
    {
    case 0: 
      this.b.setPlotEmptyCellsType(0);
      break;
    case 1: 
      this.b.setPlotEmptyCellsType(1);
      break;
    case 2: 
      this.b.setPlotEmptyCellsType(2);
      break;
    }
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt)
  {
    double d1 = (zc.e(paramArrayOfByte, paramInt + 2) & 0xFFFF) + (zc.e(paramArrayOfByte, paramInt) & 0xFFFF) / 65536.0F;
    return (int)(d1 * zbxp.a() / 72.0D + 0.5D);
  }
  
  void a()
    throws Exception
  {
    b();
    this.w = a(this.g, 8);
    this.x = a(this.g, 12);
    if ((this.k.getType() == 2) && (this.b == this.k.getCharts().get(0))) {
      this.b.getChartObject().a(0, false, a(this.g, 0), a(this.g, 4), this.w, this.x);
    }
  }
  
  private void v()
    throws Exception
  {
    b();
    this.b.a((zc.e(this.g, 2) & 0xFFFF) + (zc.e(this.g, 0) & 0xFFFF) / 65536.0F);
    this.b.b((zc.e(this.g, 6) & 0xFFFF) + (zc.e(this.g, 4) & 0xFFFF) / 65536.0F);
    this.f = this.e.b(this.d);
    if ((this.f & 0xFFFF) != 4146)
    {
      this.b.getChartArea().getBorder().setVisible(false);
      this.b.getChartArea().getArea().setFormatting(1);
      this.e.a(-2);
      return;
    }
    a(this.b.getChartArea());
    this.b.setRectangularCornered(!this.b.getChartArea().getArea().getInvertIfNegative());
  }
  
  private void w()
    throws Exception
  {
    a(this.b.getChartArea());
    this.b.setRectangularCornered(!this.b.getChartArea().getArea().getInvertIfNegative());
  }
  
  private void a(ChartFrame paramChartFrame)
    throws Exception
  {
    b(paramChartFrame);
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i1++;
        E();
        break;
      case 4103: 
        a(paramChartFrame.getBorder());
        break;
      case 4106: 
        d(paramChartFrame.getArea());
        break;
      case 4198: 
        c(paramChartFrame.getArea());
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0) {
          return;
        }
        break;
      case 2212: 
        paramChartFrame.a(z());
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void x()
    throws Exception
  {
    b();
    int i1 = this.g[0];
    this.f = this.e.b(this.d);
    zbwf localzbwf = new zbwf(this.j, this.b);
    localzbwf.m(true);
    a(localzbwf, false);
    switch (i1)
    {
    case 0: 
    case 1: 
      if ((localzbwf.L() != null) && (localzbwf.L().d))
      {
        if (this.r == null) {
          this.r = new HashMap();
        }
        this.r.put(Integer.valueOf(i1 & 0xFF), localzbwf);
      }
      break;
    case 2: 
      localzbwf.a(this.b.getChartArea(), false, false);
      break;
    case 3: 
      if (localzbwf.l() != -1) {
        this.b.getChartArea().a(localzbwf.l());
      }
      break;
    }
  }
  
  private void a(zbwf paramzbwf, boolean paramBoolean)
    throws Exception
  {
    c(paramzbwf);
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        E();
        i1++;
        break;
      case 4175: 
        a(paramzbwf, paramBoolean);
        break;
      case 4134: 
        paramzbwf.c(l());
        paramzbwf.p = c(paramzbwf.l());
        break;
      case 4176: 
        a(paramzbwf);
        break;
      case 4177: 
        b(paramzbwf);
        break;
      case 4109: 
        paramzbwf.b(B());
        break;
      case 4146: 
        paramzbwf.r = true;
        a(paramzbwf);
        break;
      case 4135: 
        b(paramzbwf.L());
        if ((paramzbwf.L().a == 4) && (!paramzbwf.J()))
        {
          if (this.p == null) {
            this.p = new ArrayList();
          }
          zf.a(this.p, paramzbwf.L());
        }
        break;
      case 2155: 
        a(paramzbwf.M());
        break;
      case 2205: 
        b();
        paramzbwf.a = new byte[this.h];
        System.arraycopy(this.g, 0, paramzbwf.a, 0, this.h & 0xFFFF);
        break;
      case 2213: 
        b();
        paramzbwf.b(new byte[this.h]);
        System.arraycopy(this.g, 0, paramzbwf.c(), 0, this.h & 0xFFFF);
        break;
      case 2214: 
        b();
        paramzbwf.b = new byte[this.h];
        System.arraycopy(this.g, 0, paramzbwf.b, 0, this.h & 0xFFFF);
        break;
      case 2206: 
        b();
        paramzbwf.c = new byte[this.h];
        System.arraycopy(this.g, 0, paramzbwf.c, 0, this.h & 0xFFFF);
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0) {
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void a(zbwf paramzbwf)
    throws Exception
  {
    b();
    paramzbwf.a(new ArrayList());
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 2; i3 < (this.h & 0xFFFF) - 4; i3 += 4)
    {
      i1 = i2;
      i2 = zc.e(this.g, i3 + 4) & 0xFFFF;
      FontSetting localFontSetting = new FontSetting(i1, i2 - i1, this.j, this.b);
      localFontSetting.getFont().a(this.j.i(zc.e(this.g, i3 + 2) & 0xFFFF), null);
      zf.a(paramzbwf.E(), localFontSetting);
    }
  }
  
  private void a(zauc paramzauc)
    throws Exception
  {
    b();
    if (paramzauc == null) {
      return;
    }
    paramzauc.d = true;
    paramzauc.e = this.g[12];
    int i1 = zc.e(this.g, 14) & 0xFFFF;
    if (i1 != 0) {
      if (this.g[16] == 0) {
        paramzauc.f = Encoding.getASCII().a(this.g, 17, i1);
      } else {
        paramzauc.f = Encoding.getUnicode().a(this.g, 17, 2 * i1);
      }
    }
  }
  
  private void b(zauc paramzauc)
    throws Exception
  {
    b();
    paramzauc.a = this.g[0];
    paramzauc.b = zc.e(this.g, 2);
    paramzauc.c = zc.e(this.g, 4);
  }
  
  private void b(zbwf paramzbwf)
    throws Exception
  {
    b();
    paramzbwf.m = ((this.g[2] & 0xFF & 0x1) == 0);
    Object localObject;
    if (!paramzbwf.m)
    {
      i1 = zc.e(this.g, 4) & 0xFFFF;
      localObject = g(i1);
      if ((localObject != null) && (!"".equals(localObject))) {
        paramzbwf.d((String)localObject);
      }
      paramzbwf.a(i1);
    }
    int i1 = zc.e(this.g, 6) & 0xFFFF;
    if (i1 != 0)
    {
      localObject = new byte[i1 + 2];
      System.arraycopy(this.g, 6, localObject, 0, localObject.length);
      zjk localzjk = new zjk(this.b);
      localzjk.c = ((byte[])localObject);
      paramzbwf.i = localzjk;
    }
  }
  
  private void b(Legend paramLegend)
    throws Exception
  {
    b();
    paramLegend.g(this.g[2] == 2);
    if (!paramLegend.p()) {
      if (this.b.getChartObject().T())
      {
        paramLegend.n((int)(paramLegend.t() * this.w * 72.0F / (zbxp.a() * 4000) - zc.a(this.g, 12)));
        paramLegend.o((int)(paramLegend.s() * this.x * 72.0F / (zbxp.a() * 4000) - zc.a(this.g, 16)));
      }
      else
      {
        paramLegend.n((int)(paramLegend.getWidth() / 4000.0F * this.w * 72.0F / zbxp.a() - zc.a(this.g, 12)));
        paramLegend.o((int)(paramLegend.getHeight() / 4000.0F * this.x * 72.0F / zbxp.a() - zc.a(this.g, 16)));
      }
    }
  }
  
  private void a(ChartFrame paramChartFrame, boolean paramBoolean)
    throws Exception
  {
    if (paramBoolean)
    {
      b();
      paramChartFrame.e(zc.b(this.g, 4));
      paramChartFrame.f(zc.b(this.g, 8));
      paramChartFrame.h(zc.b(this.g, 12));
      paramChartFrame.g(zc.b(this.g, 16));
    }
    else
    {
      this.e.a(22);
    }
  }
  
  private void c(zbwf paramzbwf)
    throws Exception
  {
    b();
    switch (this.g[0])
    {
    case 1: 
      paramzbwf.setTextHorizontalAlignment(7);
      break;
    case 2: 
      paramzbwf.setTextHorizontalAlignment(1);
      break;
    case 3: 
      paramzbwf.setTextHorizontalAlignment(8);
      break;
    case 4: 
      paramzbwf.setTextHorizontalAlignment(6);
      break;
    case 7: 
      paramzbwf.setTextHorizontalAlignment(3);
      break;
    }
    switch (this.g[1])
    {
    case 1: 
      paramzbwf.setTextVerticalAlignment(9);
      break;
    case 2: 
      paramzbwf.setTextVerticalAlignment(1);
      break;
    case 3: 
      paramzbwf.setTextVerticalAlignment(0);
      break;
    case 4: 
      paramzbwf.setTextVerticalAlignment(6);
      break;
    case 7: 
      paramzbwf.setTextVerticalAlignment(3);
      break;
    }
    if ((this.h & 0xFFFF) <= 8) {
      return;
    }
    zbwc localzbwc = paramzbwf.K();
    localzbwc.a = zc.a(this.g, 8);
    localzbwc.b = zc.a(this.g, 12);
    localzbwc.c = zc.a(this.g, 16);
    localzbwc.d = zc.a(this.g, 20);
    paramzbwf.o = zc.e(this.g, 24);
    int i1 = (this.g[24] & 0xFF & 0x80) != 0 ? 1 : 0;
    if (i1 != 0) {
      paramzbwf.setBackgroundMode(0);
    } else {
      switch (this.g[2])
      {
      case 1: 
        paramzbwf.setBackgroundMode(2);
        break;
      case 2: 
        paramzbwf.setBackgroundMode(1);
        break;
      }
    }
    int i2 = zc.e(this.g, 30);
    if ((i2 & 0xFFFF) == 255)
    {
      paramzbwf.setRotationAngle(255);
      paramzbwf.k(true);
    }
    else if ((i2 & 0xFFFF) == 254)
    {
      paramzbwf.n = true;
    }
    else if ((i2 & 0xFFFF) > 90)
    {
      paramzbwf.setRotationAngle(90 - (i2 & 0xFFFF));
    }
    else
    {
      paramzbwf.setRotationAngle(i2);
    }
    if ((this.g[29] & 0xFF & 0x40) != 0) {
      paramzbwf.setTextDirection(1);
    } else if ((this.g[29] & 0xFF & 0x80) != 0) {
      paramzbwf.setTextDirection(2);
    }
    switch (this.g[28] & 0xFF & 0xF)
    {
    case 1: 
      paramzbwf.n(3);
      break;
    case 2: 
      paramzbwf.n(2);
      break;
    case 3: 
      paramzbwf.n(0);
      break;
    case 4: 
      paramzbwf.n(1);
      break;
    case 5: 
      paramzbwf.n(4);
      break;
    case 6: 
      paramzbwf.n(5);
      break;
    case 7: 
      paramzbwf.n(6);
      break;
    case 8: 
      paramzbwf.n(7);
      break;
    case 9: 
      paramzbwf.n(8);
      break;
    case 10: 
      paramzbwf.q = true;
      paramzbwf.n(9);
      break;
    }
    if ((this.g[24] & 0xFF & 0x1) == 0) {
      paramzbwf.a(c(this.g, 26));
    } else {
      paramzbwf.a(Color.getEmpty());
    }
    paramzbwf.l = ((this.g[24] & 0xFF & 0x2) != 0);
  }
  
  private void a(Series paramSeries)
    throws Exception
  {
    d(paramSeries);
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i1++;
        E();
        break;
      case 4177: 
        e(paramSeries);
        break;
      case 4109: 
        String str = B();
        if (paramSeries.l() == null) {
          paramSeries.a(str);
        } else {
          paramSeries.c = str;
        }
        break;
      case 4102: 
        a(paramSeries);
        break;
      case 4165: 
        c(paramSeries);
        this.b.getNSeries().a(paramSeries);
        zf.a(this.q, new zip(paramSeries, (byte)0));
        break;
      case 4163: 
        e(this.q.size() - 1);
        break;
      case 4170: 
        b(paramSeries);
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0) {
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void e(int paramInt)
    throws Exception
  {
    b();
    int i1 = zc.e(this.g, 0) & 0xFFFF;
    if (i1 == 65535) {
      i1 = paramInt;
    }
    LegendEntry localLegendEntry = this.b.getLegend().getLegendEntries().get(i1);
    zip localzip = (zip)this.q.get(paramInt);
    localzip.g = localLegendEntry;
    if ((this.g[2] & 0xFF & 0x1) != 0)
    {
      localLegendEntry.setDeleted(true);
      return;
    }
    zbwf localzbwf = new zbwf(this.j, this.b);
    int i2 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i2++;
        E();
        break;
      case 4133: 
        a(localzbwf, false);
        break;
      case 4148: 
        F();
        i2--;
        if (i2 == 0)
        {
          localzbwf.a(localLegendEntry);
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private void b(Series paramSeries)
    throws Exception
  {
    b();
    int i1 = (zc.e(this.g, 0) & 0xFFFF) - 1;
    zip localzip = null;
    if (i1 >= this.q.size())
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4171: 
        localzip = new zip(paramSeries, (byte)1);
        b();
        localzip.d = this.g;
        localzip.e = i1;
        zf.a(this.q, localzip);
        break;
      case 4187: 
        localzip = new zip(paramSeries, (byte)2);
        b();
        localzip.d = this.g;
        localzip.e = i1;
        zf.a(this.q, localzip);
        break;
      default: 
        this.e.a(-2);
      }
      return;
    }
    localzip = (zip)this.q.get(i1);
    if (localzip.b == 0)
    {
      Series localSeries = (Series)localzip.a;
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4171: 
        b(localSeries, paramSeries, null);
        this.t += 1;
        break;
      case 4187: 
        a(localSeries, paramSeries, null);
        break;
      default: 
        this.e.a(-2);
      }
    }
    else
    {
      throw new CellsException(6, "Unspported TrendLine/ErrorBar in the chart.");
    }
  }
  
  private void a(Series paramSeries1, Series paramSeries2, zip paramzip)
    throws Exception
  {
    b();
    int i1 = 1;
    int i2 = 2;
    switch (this.g[0])
    {
    case 1: 
      i1 = 0;
      i2 = 3;
      break;
    case 2: 
      i1 = 0;
      i2 = 1;
      break;
    case 3: 
      i2 = 3;
      break;
    case 4: 
      i2 = 1;
      break;
    default: 
      return;
    }
    ErrorBar localErrorBar = null;
    if (i1 != 0) {
      localErrorBar = paramSeries1.getYErrorBar();
    } else {
      localErrorBar = paramSeries1.getXErrorBar();
    }
    if (paramzip == null)
    {
      paramzip = new zip(localErrorBar, (byte)2);
      zf.a(this.q, paramzip);
    }
    else
    {
      paramzip.a = localErrorBar;
    }
    paramzip.c = (i2 == 3);
    if ((localErrorBar.getDisplayType() != 2) && (localErrorBar.getDisplayType() != i2) && (localErrorBar.a() == i1))
    {
      localErrorBar.a(0);
      if (localErrorBar.getType() == 0) {
        switch (i2)
        {
        case 1: 
          localErrorBar.b(paramSeries2.m());
          break;
        case 3: 
          localErrorBar.a(paramSeries2.m());
          break;
        }
      }
      return;
    }
    localErrorBar.a(i2);
    switch (this.g[1])
    {
    case 1: 
      localErrorBar.setType(2);
      break;
    case 2: 
      localErrorBar.setType(1);
      break;
    case 3: 
      localErrorBar.setType(3);
      break;
    case 4: 
      localErrorBar.setType(0);
      break;
    case 5: 
      localErrorBar.setType(4);
      break;
    }
    localErrorBar.setShowMarkerTTop(this.g[2] == 1);
    localErrorBar.a(zc.f(this.g, 4));
    localErrorBar.a(paramSeries2.getBorder());
    if (localErrorBar.getType() == 0) {
      switch (i2)
      {
      case 1: 
        localErrorBar.b(paramSeries2.m());
        break;
      case 3: 
        localErrorBar.a(paramSeries2.m());
        break;
      }
    }
  }
  
  private void y()
    throws Exception
  {
    for (int i1 = 0; i1 < this.q.size(); i1++)
    {
      zip localzip1 = (zip)this.q.get(i1);
      if ((localzip1.b != 0) && (localzip1.d != null))
      {
        zip localzip2 = (zip)this.q.get(localzip1.e);
        if (localzip2.b == 0) {
          switch (localzip1.b)
          {
          case 1: 
            b((Series)localzip2.a, (Series)localzip1.a, localzip1);
            break;
          case 2: 
            a((Series)localzip2.a, (Series)localzip1.a, localzip1);
          }
        }
      }
    }
  }
  
  private void b(Series paramSeries1, Series paramSeries2, zip paramzip)
    throws Exception
  {
    if (paramzip == null) {
      b();
    }
    int i1 = 1;
    switch (this.g[0])
    {
    case 0: 
      if (this.g[1] == 1) {
        i1 = 1;
      } else {
        i1 = 4;
      }
      break;
    case 1: 
      i1 = 0;
      break;
    case 2: 
      i1 = 2;
      break;
    case 3: 
      i1 = 5;
      break;
    case 4: 
      i1 = 3;
      break;
    }
    int i2 = paramSeries1.getTrendLines().a(i1);
    Trendline localTrendline = paramSeries1.getTrendLines().get(i2);
    if (paramzip == null) {
      zf.a(this.q, new zip(localTrendline, (byte)1));
    } else {
      paramzip.a = localTrendline;
    }
    switch (i1)
    {
    case 4: 
      localTrendline.a = (this.g[1] & 0xFF);
      break;
    case 3: 
      localTrendline.o(this.g[1] & 0xFF);
      break;
    }
    double d1 = zc.f(this.g, 2);
    if (!Double.isNaN(d1)) {
      localTrendline.setIntercept(d1);
    }
    localTrendline.setDisplayEquation(this.g[10] == 1);
    localTrendline.setDisplayRSquared(this.g[11] == 1);
    localTrendline.setForward(zc.f(this.g, 12));
    localTrendline.a(zc.f(this.g, 20));
    if ((paramSeries2.getName() != null) && (!"".equals(paramSeries2.getName())))
    {
      localTrendline.setNameAuto(false);
      localTrendline.setName(paramSeries2.getName());
    }
    localTrendline.a(paramSeries2.getBorder());
  }
  
  private void c(Series paramSeries)
    throws Exception
  {
    b();
    paramSeries.a(f(zc.e(this.g, 0) & 0xFFFF));
  }
  
  private void a(Object paramObject)
    throws Exception
  {
    b();
    int i1 = 0;
    zpz localzpz = new zpz(paramObject);
    if ((this.g[6] & 0xFF & 0x1) != 0) {
      localzpz.c = true;
    }
    Object localObject;
    if ((paramObject instanceof Series))
    {
      localObject = (Series)paramObject;
      i3 = zc.e(this.g, 0);
      if ((i3 & 0xFFFF) == 65534)
      {
        G();
        return;
      }
      if (i3 != 65535)
      {
        ChartPoint localChartPoint = ((Series)localObject).getPoints().a(i3 & 0xFFFF);
        localChartPoint.a(localzpz);
        paramObject = localChartPoint;
        i1 = 1;
      }
      else
      {
        ((Series)localObject).a(localzpz);
        ((Series)localObject).a(zc.e(this.g, 4));
      }
    }
    else if ((paramObject instanceof zka))
    {
      localObject = (zka)paramObject;
      ((zka)localObject).a(localzpz);
    }
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        i2++;
        E();
        break;
      case 4191: 
        b(localzpz);
        break;
      case 4103: 
        a(localzpz.f());
        i3 = 1;
        break;
      case 4106: 
        d(localzpz.e());
        i4 = 1;
        break;
      case 4198: 
        c(localzpz.e());
        break;
      case 2206: 
        if (localzpz.a == null) {
          localzpz.a = new ArrayList();
        }
        zf.a(localzpz.a, p());
        break;
      case 4156: 
        b(localzpz.e());
        break;
      case 4107: 
        a(localzpz.l());
        break;
      case 4105: 
        a(localzpz.j());
        break;
      case 4189: 
        a(localzpz);
        break;
      case 4108: 
        if ((paramObject instanceof Series))
        {
          a(((Series)paramObject).getDataLabels());
        }
        else if ((paramObject instanceof ChartPoint))
        {
          a(((ChartPoint)paramObject).getDataLabels());
        }
        else if ((paramObject instanceof zka))
        {
          b();
          this.s = this.g[0];
        }
        else
        {
          a(null);
        }
        break;
      case 2212: 
        localzpz.b = z();
        break;
      case 4148: 
        if ((i1 != 0) && (i4 == 0) && (i3 == 0))
        {
          localzpz.f().c(true);
          localzpz.e().setFormatting(0);
        }
        F();
        i2--;
        if (i2 == 0) {
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private byte[] z()
    throws Exception
  {
    b();
    int i1 = this.h & 0xFFFF;
    byte[] arrayOfByte = new byte[i1];
    System.arraycopy(this.g, 0, arrayOfByte, 0, i1);
    return arrayOfByte;
  }
  
  private byte[] A()
    throws Exception
  {
    b();
    int i1 = this.h & 0xFFFF;
    byte[] arrayOfByte = new byte[i1];
    System.arraycopy(this.g, 0, arrayOfByte, 0, i1);
    return arrayOfByte;
  }
  
  private void a(zpz paramzpz)
    throws Exception
  {
    b();
    paramzpz.b((this.g[0] & 0xFF & 0x1) != 0);
    paramzpz.d((this.g[0] & 0xFF & 0x2) != 0);
    paramzpz.f((this.g[0] & 0xFF & 0x4) != 0);
  }
  
  private void b(zpz paramzpz)
    throws Exception
  {
    b();
    switch (this.g[0])
    {
    case 0: 
      switch (this.g[1])
      {
      case 0: 
        paramzpz.b(0);
        break;
      case 1: 
        paramzpz.b(1);
        break;
      case 2: 
        paramzpz.b(2);
      }
      break;
    case 1: 
      switch (this.g[1])
      {
      case 0: 
        paramzpz.b(3);
        break;
      case 1: 
        paramzpz.b(4);
        break;
      case 2: 
        paramzpz.b(5);
      }
      break;
    }
  }
  
  private void a(DataLabels paramDataLabels)
    throws Exception
  {
    if (paramDataLabels == null)
    {
      this.e.a(4);
      return;
    }
    b();
    boolean bool = (this.g[0] & 0xFF & 0x1) != 0;
    if (bool) {
      paramDataLabels.a(1, bool);
    }
    bool = (this.g[0] & 0xFF & 0x2) != 0;
    if (bool) {
      paramDataLabels.a(2, bool);
    }
    bool = (this.g[0] & 0xFF & 0x10) != 0;
    if (bool) {
      paramDataLabels.a(3, bool);
    }
    bool = (this.g[0] & 0xFF & 0x20) != 0;
    if (bool) {
      paramDataLabels.a(4, bool);
    }
  }
  
  private void d(Series paramSeries)
    throws Exception
  {
    b();
    this.m = (zc.e(this.g, 6) & 0xFFFF);
  }
  
  private String B()
    throws Exception
  {
    b();
    int i1 = this.g[2];
    if (i1 == 0) {
      return "";
    }
    if (this.g[3] == 0) {
      return Encoding.getASCII().a(this.g, 4, i1 & 0xFF);
    }
    return Encoding.getUnicode().a(this.g, 4, 2 * (i1 & 0xFF));
  }
  
  private void e(Series paramSeries)
    throws Exception
  {
    b();
    int i1 = zc.e(this.g, 6) & 0xFFFF;
    int i2 = zc.e(this.g, 4) & 0xFFFF;
    if (i1 != 0)
    {
      byte[] arrayOfByte = new byte[i1 + 2];
      System.arraycopy(this.g, 6, arrayOfByte, 0, i1 + 2);
      zjk localzjk = new zjk(this.b);
      localzjk.a(2);
      localzjk.c = arrayOfByte;
      switch (this.g[0])
      {
      case 0: 
        paramSeries.a(arrayOfByte);
        break;
      case 1: 
        paramSeries.a(localzjk);
        paramSeries.d = i2;
        break;
      case 2: 
        paramSeries.b(localzjk);
        break;
      case 3: 
        paramSeries.c(localzjk);
        break;
      }
    }
  }
  
  private void b(ChartFrame paramChartFrame)
    throws Exception
  {
    b();
    paramChartFrame.setShadow((this.g[0] & 0xFF & 0x4) != 0);
    paramChartFrame.g((this.g[2] & 0xFF & 0x1) != 0);
  }
  
  private void h(Axis paramAxis)
    throws Exception
  {
    b();
    if (((this.g[8] & 0xFF & 0x8) != 0) && ((this.g[8] & 0xFF & 0x4) == 0) && (this.g[4] == 5)) {
      paramAxis.setVisible(false);
    }
    if (!paramAxis.isVisible()) {
      return;
    }
    Line localLine = paramAxis.getAxisLine();
    int i1 = (this.g[8] & 0xFF & 0x1) != 0 ? 1 : 0;
    if (i1 != 0) {
      return;
    }
    localLine.m(0);
    switch (this.g[4])
    {
    case 0: 
      localLine.m(0);
      break;
    case 1: 
      localLine.m(1);
      break;
    case 2: 
      localLine.m(2);
      break;
    case 3: 
      localLine.m(3);
      break;
    case 4: 
      localLine.m(4);
      break;
    case 5: 
      localLine.setVisible(false);
      break;
    case 6: 
      localLine.m(6);
      break;
    case 7: 
      localLine.m(7);
      break;
    case 8: 
      localLine.m(8);
      break;
    }
    switch (this.g[6])
    {
    case -1: 
      localLine.setWeight(-1);
      break;
    case 0: 
      localLine.setWeight(0);
      break;
    case 1: 
      localLine.setWeight(1);
      break;
    case 2: 
      localLine.setWeight(2);
      break;
    }
    if ((this.g[10] & 0xFF) < 64) {
      localLine.a(b(this.g, 0));
    }
  }
  
  private void a(Line paramLine)
    throws Exception
  {
    b();
    boolean bool = (this.g[8] & 0xFF & 0x1) != 0;
    if (bool)
    {
      paramLine.c(bool);
      return;
    }
    paramLine.m(0);
    switch (this.g[6])
    {
    case -1: 
      paramLine.setWeight(-1);
      break;
    case 0: 
      paramLine.setWeight(0);
      break;
    case 1: 
      paramLine.setWeight(1);
      break;
    case 2: 
      paramLine.setWeight(2);
      break;
    }
    int i1 = this.g[10] & 0xFF;
    if (i1 < 64) {
      paramLine.a(this.j.o().e(i1));
    }
    switch (this.g[4])
    {
    case 0: 
      paramLine.m(0);
      break;
    case 1: 
      paramLine.m(1);
      break;
    case 2: 
      paramLine.m(2);
      break;
    case 3: 
      paramLine.m(3);
      break;
    case 4: 
      paramLine.m(4);
      break;
    case 5: 
      paramLine.setVisible(false);
      break;
    case 6: 
      paramLine.m(6);
      break;
    case 7: 
      paramLine.m(7);
      break;
    case 8: 
      paramLine.m(8);
      break;
    }
  }
  
  private void a(zkd paramzkd)
    throws Exception
  {
    b();
    paramzkd.a(zc.e(this.g, 0));
  }
  
  private void d(Area paramArea)
    throws Exception
  {
    b();
    int i1 = (this.g[10] & 0xFF & 0x1) != 0 ? 1 : 0;
    paramArea.setInvertIfNegative((this.g[10] & 0xFF & 0x2) != 0);
    if (i1 != 0)
    {
      paramArea.setFormatting(0);
      return;
    }
    switch (this.g[8])
    {
    case 0: 
      paramArea.setFormatting(1);
      break;
    case 1: 
      paramArea.setFormatting(2);
      break;
    case 2: 
      paramArea.getFillFormat().setPattern(7);
      break;
    case 3: 
      paramArea.getFillFormat().setPattern(10);
      break;
    case 4: 
      paramArea.getFillFormat().setPattern(13);
      break;
    case 5: 
      paramArea.getFillFormat().setPattern(25);
      break;
    case 6: 
      paramArea.getFillFormat().setPattern(24);
      break;
    case 7: 
      paramArea.getFillFormat().setPattern(16);
      break;
    case 8: 
      paramArea.getFillFormat().setPattern(17);
      break;
    case 9: 
      paramArea.getFillFormat().setPattern(37);
      break;
    case 10: 
      paramArea.getFillFormat().setPattern(42);
      break;
    case 11: 
      paramArea.getFillFormat().setPattern(21);
      break;
    case 12: 
      paramArea.getFillFormat().setPattern(20);
      break;
    case 13: 
      paramArea.getFillFormat().setPattern(14);
      break;
    case 14: 
      paramArea.getFillFormat().setPattern(15);
      break;
    case 15: 
      paramArea.getFillFormat().setPattern(35);
      break;
    case 16: 
      paramArea.getFillFormat().setPattern(5);
      break;
    case 17: 
      paramArea.getFillFormat().setPattern(4);
      break;
    case 18: 
      paramArea.getFillFormat().setPattern(2);
      break;
    }
    if ((paramArea.getFormatting() == 2) && (paramArea.getFillFormat().getFillType() == 2))
    {
      int i2 = zc.a(this.g, 0);
      int i3 = zc.e(this.g, 12) & 0xFFFF;
      if ((i2 != 0) || (i3 >= 64)) {
        paramArea.getFillFormat().getSolidFill().a.a(2, b(this.g, 0).toArgb());
      } else {
        paramArea.getFillFormat().getSolidFill().a.a(3, zc.e(this.g, 12) & 0xFFFF);
      }
      i2 = zc.a(this.g, 4);
      i3 = zc.e(this.g, 14) & 0xFFFF;
      if ((i2 != 0) || (i3 >= 64)) {
        paramArea.getFillFormat().getSolidFill().b.a(2, b(this.g, 4).toArgb());
      } else {
        paramArea.getFillFormat().getSolidFill().b.a(3, zc.e(this.g, 14) & 0xFFFF);
      }
    }
  }
  
  private void a(Marker paramMarker)
    throws Exception
  {
    b();
    int i1 = (this.g[10] & 0xFF & 0x1) != 0 ? 1 : 0;
    if (i1 != 0) {
      return;
    }
    switch (this.g[8])
    {
    case 0: 
      paramMarker.setMarkerStyle(5);
      break;
    case 1: 
      paramMarker.setMarkerStyle(7);
      break;
    case 2: 
      paramMarker.setMarkerStyle(3);
      break;
    case 3: 
      paramMarker.setMarkerStyle(9);
      break;
    case 4: 
      paramMarker.setMarkerStyle(10);
      break;
    case 5: 
      paramMarker.setMarkerStyle(8);
      break;
    case 6: 
      paramMarker.setMarkerStyle(4);
      break;
    case 7: 
      paramMarker.setMarkerStyle(2);
      break;
    case 8: 
      paramMarker.setMarkerStyle(1);
      break;
    case 9: 
      paramMarker.setMarkerStyle(6);
      break;
    }
    paramMarker.setMarkerSize((zc.e(this.g, 16) & 0xFFFF) / 20);
    int i2;
    if ((this.g[10] & 0xFF & 0x10) != 0)
    {
      paramMarker.d(1);
    }
    else
    {
      i2 = zc.e(this.g, 14) & 0xFFFF;
      switch (i2)
      {
      case 255: 
        paramMarker.b(Color.fromArgb(this.g[4] & 0xFF, this.g[5] & 0xFF, this.g[6] & 0xFF));
        break;
      default: 
        paramMarker.b(this.i.e(i2));
      }
    }
    if ((this.g[10] & 0xFF & 0x20) != 0)
    {
      paramMarker.c(1);
    }
    else
    {
      i2 = zc.e(this.g, 12) & 0xFFFF;
      switch (i2)
      {
      case 255: 
        paramMarker.a(Color.fromArgb(this.g[0] & 0xFF, this.g[1] & 0xFF, this.g[2] & 0xFF));
        break;
      case 79: 
        paramMarker.a(Color.getBlack());
        break;
      default: 
        paramMarker.a(this.i.e(i2));
      }
    }
  }
  
  private void C()
    throws Exception
  {
    this.e.a(2);
  }
  
  private void D()
    throws Exception
  {
    this.e.a(18);
  }
  
  private void E()
    throws Exception
  {
    this.e.a(2);
  }
  
  private void F()
    throws Exception
  {
    this.e.a(2);
  }
  
  private zka f(int paramInt)
  {
    if (paramInt >= this.b.q().getCount())
    {
      int i1 = paramInt - this.b.q().getCount() + 1;
      for (int i2 = 0; i2 < i1; i2++)
      {
        zka localzka = new zka(this.b.q());
        this.b.q().a(localzka);
      }
    }
    return this.b.q().a(paramInt);
  }
  
  private String g(int paramInt)
  {
    Iterator localIterator = this.j.B().iterator();
    while (localIterator.hasNext())
    {
      zzw localzzw = (zzw)localIterator.next();
      if (localzzw.b() == paramInt) {
        return localzzw.a();
      }
    }
    return "";
  }
  
  private void G()
    throws Exception
  {
    int i1 = 0;
    for (;;)
    {
      this.f = this.e.b(this.d);
      switch (this.f)
      {
      case 4147: 
        E();
        i1++;
        break;
      case 4148: 
        F();
        i1--;
        if (i1 == 0) {
          return;
        }
        break;
      case 10: 
      case 574: 
        throw new IOException("File is corrupted");
      default: 
        this.h = this.e.b(this.d);
        this.e.a(this.h & 0xFFFF);
      }
    }
  }
  
  private int h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private Color b(byte[] paramArrayOfByte, int paramInt)
  {
    return Color.fromArgb(paramArrayOfByte[paramInt] & 0xFF, paramArrayOfByte[(paramInt + 1)] & 0xFF, paramArrayOfByte[(paramInt + 2)] & 0xFF);
  }
  
  private Color c(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = zc.b(paramArrayOfByte, paramInt);
    return this.j.o().e(i1);
  }
  
  private void n(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if (localzpz == null) {
      return;
    }
    switch (paramzka.j())
    {
    case 17: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
          paramzka.b(27);
          break;
        case 3: 
          paramzka.b(34);
          break;
        case 1: 
          paramzka.b(56);
        }
      }
      break;
    case 20: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
        case 5: 
          paramzka.b(23);
          break;
        case 3: 
          paramzka.b(30);
          break;
        case 1: 
        case 2: 
          paramzka.b(52);
        }
      }
      break;
    case 18: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
          paramzka.b(21);
          break;
        case 3: 
          paramzka.b(28);
          break;
        case 1: 
          paramzka.b(50);
        }
      }
      break;
    case 19: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
          paramzka.b(22);
          break;
        case 3: 
          paramzka.b(29);
          break;
        case 1: 
          paramzka.b(51);
        }
      }
      break;
    case 11: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
        case 5: 
          paramzka.b(26);
          break;
        case 3: 
          paramzka.b(33);
          break;
        case 1: 
        case 2: 
          paramzka.b(55);
        }
      }
      break;
    case 9: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
          paramzka.b(24);
          break;
        case 3: 
          paramzka.b(31);
          break;
        case 1: 
          paramzka.b(53);
        }
      }
      break;
    case 10: 
      if (localzpz.d) {
        switch (localzpz.d())
        {
        case 4: 
          paramzka.b(25);
          break;
        case 3: 
          paramzka.b(32);
          break;
        case 1: 
          paramzka.b(54);
        }
      }
      break;
    }
  }
  
  private void o(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if (localzpz == null) {
      return;
    }
    if ((localzpz.k() == null) || (localzpz.j().getMarkerStyle() != 5)) {
      return;
    }
    switch (paramzka.j())
    {
    case 42: 
      paramzka.b(39);
      break;
    case 41: 
      paramzka.b(38);
      break;
    case 40: 
      paramzka.b(37);
      break;
    }
  }
  
  private void p(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if (localzpz == null) {
      return;
    }
    if ((localzpz.i() == null) || (localzpz.l().a() == 0)) {
      return;
    }
    switch (paramzka.j())
    {
    case 44: 
      paramzka.b(47);
      break;
    case 45: 
      paramzka.b(48);
      break;
    case 35: 
      paramzka.b(36);
      break;
    }
  }
  
  private void q(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if (localzpz == null) {
      return;
    }
    if (localzpz.o()) {
      paramzka.b(13);
    }
  }
  
  private void r(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if (localzpz == null) {
      return;
    }
    int i1 = (localzpz.k() == null) || (localzpz.j().getMarkerStyle() != 5) ? 1 : 0;
    if (i1 == 0) {
      paramzka.b(57);
    }
  }
  
  private void a(zka paramzka, zpz paramzpz)
  {
    int i1 = (paramzpz.k() == null) || (paramzpz.j().getMarkerStyle() != 5) ? 1 : 0;
    int i2 = (paramzpz.g() == null) || (paramzpz.f().isVisible()) ? 1 : 0;
    boolean bool = paramzpz.m();
    if (i2 == 0)
    {
      paramzka.b(60);
      return;
    }
    if (i1 != 0)
    {
      if (bool) {
        paramzka.b(61);
      } else {
        paramzka.b(63);
      }
    }
    else if (bool) {
      paramzka.b(62);
    } else {
      paramzka.b(64);
    }
  }
  
  private void s(zka paramzka)
  {
    zpz localzpz = paramzka.e();
    if ((localzpz == null) && (this.b.getNSeries().getCount() == 1)) {
      localzpz = this.b.getNSeries().get(0).h();
    }
    if (localzpz == null) {
      return;
    }
    switch (paramzka.j())
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      n(paramzka);
      break;
    case 40: 
    case 41: 
    case 42: 
      o(paramzka);
      break;
    case 35: 
    case 44: 
    case 45: 
      p(paramzka);
      break;
    case 63: 
      a(paramzka, localzpz);
      break;
    case 12: 
      q(paramzka);
      break;
    case 58: 
      r(paramzka);
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */