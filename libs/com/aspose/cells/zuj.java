package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class zuj
{
  private Workbook i;
  private WorksheetCollection j;
  private Worksheet k;
  private Cells l;
  private int m;
  private double n;
  private HashMap o;
  private double[] p;
  int a = -1;
  int b = -1;
  int c = -1;
  int d = -1;
  private double q;
  private double r;
  private double s;
  private double t;
  private double u;
  private double v;
  private Style w;
  private ArrayList x;
  private ArrayList y;
  private int z = -1;
  private int A = 0;
  private int B = -1;
  private int C = 0;
  private ArrayList D;
  private int E;
  private com.aspose.cells.b.a.b.zt F;
  com.aspose.cells.a.d.zf e;
  private double G = -1.1D;
  private double H = -1.1D;
  private double I = 0.0D;
  private double J = 0.0D;
  public ArrayList f;
  ArrayList g;
  private HashMap K = new HashMap();
  ImageOrPrintOptions h;
  private zbyr L;
  private double[] M;
  private int N = 100;
  private ArrayList O;
  
  zuj(Workbook paramWorkbook, zbyr paramzbyr)
  {
    this.i = paramWorkbook;
    this.L = paramzbyr;
    this.j = paramWorkbook.getWorksheets();
    this.p = new double[] { 1.0D, 1.0D };
    this.n = zbxp.a();
    this.o = new HashMap();
    this.w = paramWorkbook.getWorksheets().Q();
    for (int i1 = 0; i1 < this.j.getCount(); i1++) {
      this.j.get(i1).getConditionalFormattings().a();
    }
    this.F = new com.aspose.cells.b.a.b.zt(0.0F, 0.0F);
    this.E = (-(zlp.a + paramWorkbook.getWorksheets().U() + 2));
    this.f = new ArrayList();
    this.g = new ArrayList();
  }
  
  private void a()
  {
    ShapeCollection localShapeCollection = this.k.w();
    ArrayList localArrayList = new ArrayList();
    if (localShapeCollection != null) {
      for (int i1 = 0; i1 < localShapeCollection.getCount(); i1++)
      {
        Shape localShape = localShapeCollection.get(i1);
        if (!localShape.W())
        {
          zbje localzbje = new zbje(localShape, i1, null);
          com.aspose.cells.b.a.a.zf.a(localArrayList, localzbje);
        }
      }
    }
    this.K.put(this.k, localArrayList);
  }
  
  private void b()
    throws Exception
  {
    this.c = zavt.b(this.k, this.x);
    this.b = a(true, 0, 0, zavt.a(this.i), zavt.b(this.i));
    this.d = c();
    if (this.b < 0) {
      return;
    }
    if (this.d < 0) {
      return;
    }
    if (this.k.getPageSetup().a(false)) {
      this.a = zavt.a(this.k, this.x);
    } else {
      this.a = 0;
    }
    if (this.d == -1) {}
  }
  
  private void a(Worksheet paramWorksheet)
  {
    this.k = paramWorksheet;
    this.O = null;
    this.l = this.k.getCells();
    this.z = -1;
    this.A = -1;
    PageSetup localPageSetup = this.k.getCharts().get(0).getPageSetup();
    a(localPageSetup);
  }
  
  private void b(Worksheet paramWorksheet)
    throws Exception
  {
    this.k = paramWorksheet;
    this.O = null;
    this.l = paramWorksheet.getCells();
    this.z = -1;
    this.A = -1;
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    a(localPageSetup);
    a();
    zapd localzapd = paramWorksheet.getCells().o();
    this.x = new ArrayList(localzapd.getCount());
    for (int i1 = 0; i1 < localzapd.getCount(); i1++) {
      com.aspose.cells.b.a.a.zf.a(this.x, new zgr(localzapd.a(i1)));
    }
    Collections.sort(this.x);
    this.y = new ArrayList();
    this.a = -1;
    this.b = -1;
    this.c = -1;
    this.d = -1;
    b();
    if ((this.h != null) && (!this.h.a()))
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = this.l.getMinRow();
      localCellArea.StartColumn = this.l.getMinColumn();
      localCellArea.EndRow = this.l.e(0);
      localCellArea.EndColumn = this.l.b((short)0);
      this.O = new ArrayList();
      com.aspose.cells.b.a.a.zf.a(this.O, localCellArea);
      double d1 = 0.0D;
      d1 += b(localCellArea.StartColumn, localCellArea.EndColumn) / 72.0D;
      this.s = (d1 * 72.0D);
      d1 += (this.G + this.I) / 2.54D;
      this.q = d1;
      d1 = 0.0D;
      d1 += a(localCellArea.StartRow, localCellArea.EndRow) / 72.0D;
      this.t = (d1 * 72.0D);
      d1 += (this.H + this.J) / 2.54D;
      this.r = d1;
    }
    else
    {
      this.O = zavt.a(paramWorksheet);
    }
  }
  
  private boolean a(zgr paramzgr, Style paramStyle, boolean paramBoolean1, boolean paramBoolean2)
  {
    zaja localzaja = this.l.getRows().a.a(paramzgr.a, paramzgr.c, false);
    zgs localzgs1 = new zgs();
    zgs localzgs2 = localzgs1;
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if (localzt.k() != 0)
      {
        zaiv localzaiv = localzt.b(paramzgr.b, paramzgr.d, false);
        if (localzaiv != null) {
          for (;;)
          {
            int i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
            localzgs2 = localzt.a(i1, localzgs1, 7);
            if (((!paramBoolean1) && (!paramBoolean2)) || (d(localzgs2.a) > 0))
            {
              if ((localzgs2.h() != 3) && ((!paramBoolean1) || (!localzgs2.a()))) {
                return true;
              }
              if (!paramBoolean2)
              {
                Style localStyle = Cell.a(this.l, localzt, localzgs2);
                if ((localStyle != null) && (zavt.a(localStyle, this.w))) {
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  private int a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = -1;
    zaja localzaja = this.l.getRows().a.a(paramInt1, paramInt3, true);
    zgs localzgs1 = new zgs();
    zgs localzgs2 = localzgs1;
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if ((!Row.a(localzt)) && (localzt.k() != 0))
      {
        zaiv localzaiv = localzt.b(paramInt2, paramInt4, false);
        if (localzaiv != null) {
          for (;;)
          {
            int i2 = localzaiv.a();
            if (i2 < 0) {
              break;
            }
            localzgs2 = localzt.a(i2, localzgs1, 7);
            if (d(localzgs2.a) > 0)
            {
              if (localzgs2.h() != 3)
              {
                i1 = localzt.i();
                break;
              }
              Style localStyle = Cell.a(this.l, localzt, localzgs2);
              if ((localStyle != null) && (zavt.a(localStyle, this.w)))
              {
                i1 = localzt.i();
                break;
              }
            }
          }
        }
        if (i1 != -1) {
          break;
        }
      }
    }
    if ((!paramBoolean) && (i1 == paramInt3)) {
      return i1;
    }
    int i3;
    if ((this.x != null) && (this.x.size() > 0))
    {
      zgr localzgr;
      if (paramBoolean) {
        for (i3 = this.x.size() - 1; i3 >= 0; i3--)
        {
          localzgr = (zgr)this.x.get(i3);
          if ((i1 < localzgr.c) && (localzgr.c < paramInt3) && (a(localzgr, this.w, false, false))) {
            i1 = localzgr.c;
          }
        }
      } else {
        for (i3 = this.x.size() - 1; i3 >= 0; i3--)
        {
          localzgr = (zgr)this.x.get(i3);
          if ((localzgr.a <= paramInt3) && (localzgr.c >= paramInt1) && (localzgr.b <= paramInt4) && (localzgr.d >= paramInt2) && (localzgr.c > i1)) {
            i1 = localzgr.c;
          }
        }
      }
    }
    this.D = ((ArrayList)this.K.get(this.k));
    Object localObject;
    if ((this.D != null) && (this.D.size() > 0))
    {
      i3 = 0;
      for (int i4 = 0; i4 < this.D.size(); i4++)
      {
        localObject = (zbje)this.D.get(i4);
        if ((((zbje)localObject).l().isHidden() != true) && (((zbje)localObject).l().isPrintable()) && (!((zbje)localObject).l().W()))
        {
          i3 = ((zbje)localObject).m().EndRow;
          if (i3 > i1) {
            if (paramBoolean)
            {
              i1 = i3;
            }
            else if ((((zbje)localObject).c() <= paramInt3) && (((zbje)localObject).d() >= paramInt1) && (((zbje)localObject).f() <= paramInt4) && (((zbje)localObject).g() >= paramInt2))
            {
              if (i3 >= paramInt3)
              {
                i1 = paramInt3;
                return i1;
              }
              i1 = i3;
            }
          }
        }
      }
    }
    if ((this.k.getSparklineGroupCollection() != null) && (this.k.getSparklineGroupCollection().getCount() > 0)) {
      for (i3 = 0; i3 < this.k.getSparklineGroupCollection().getCount(); i3++)
      {
        SparklineGroup localSparklineGroup = this.k.getSparklineGroupCollection().get(i3);
        localObject = localSparklineGroup.getSparklineCollection();
        if (((SparklineCollection)localObject).b().getIndex() == this.k.getIndex()) {
          for (int i5 = 0; i5 < ((SparklineCollection)localObject).getCount(); i5++)
          {
            Sparkline localSparkline = ((SparklineCollection)localObject).get(i5);
            if (localSparkline.getRow() > i1) {
              i1 = localSparkline.getRow();
            }
          }
        }
      }
    }
    return i1;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    Cells localCells = this.k.getCells();
    int i1;
    if (this.x.size() > 0) {
      for (i1 = this.x.size() - 1; i1 >= 0; i1--)
      {
        localObject2 = (zgr)this.x.get(i1);
        if ((((zgr)localObject2).a <= paramInt3) && (((zgr)localObject2).c >= paramInt1) && (((zgr)localObject2).b <= paramInt4) && (((zgr)localObject2).d >= paramInt2)) {
          return true;
        }
      }
    }
    if ((this.D != null) && (this.D.size() > 0)) {
      for (i1 = 0; i1 < this.D.size(); i1++)
      {
        localObject2 = (zbje)this.D.get(i1);
        int i2 = ((zbje)localObject2).d();
        if (((zbje)localObject2).e() == 0.0D) {
          i2--;
        }
        int i3 = ((zbje)localObject2).g();
        if (((zbje)localObject2).h() == 0.0D) {
          i3--;
        }
        if ((((zbje)localObject2).c() <= paramInt3) && (i2 >= paramInt1) && (((zbje)localObject2).f() <= paramInt4) && (i3 >= paramInt2)) {
          return true;
        }
      }
    }
    Object localObject1 = null;
    Object localObject2 = null;
    zaja localzaja = localCells.getRows().a.a(paramInt1, paramInt3, true);
    while (localzaja.hasNext())
    {
      Row localRow = localzaja.f();
      if (localRow.a() > 0)
      {
        zaiv localzaiv = localRow.c.a(-1, -1, true);
        for (;;)
        {
          int i4 = localzaiv.a();
          if (i4 < 0) {
            break;
          }
          Style localStyle1 = null;
          Cell localCell = new Cell(localRow, i4);
          if (localCell.getColumn() > paramInt4)
          {
            if (localCell.c.h() != 3) {
              localObject1 = localCell;
            }
          }
          else if (localCell.getColumn() < paramInt2)
          {
            if (localCell.c.h() != 3) {
              localObject2 = localCell;
            }
          }
          else
          {
            if (localCell.c.h() != 3) {
              return true;
            }
            Style localStyle2 = localCell.p();
            if ((localStyle2 != null) && (zavt.a(localStyle2, this.w))) {
              return true;
            }
          }
          double d1;
          int i5;
          if ((localObject2 != null) && (((Cell)localObject2).c.h() == 5) && (((Cell)localObject2).p().getHorizontalAlignment() != 8))
          {
            localStyle1 = ((Cell)localObject2).p();
            if (!localStyle1.isTextWrapped())
            {
              d1 = zavt.a(((Cell)localObject2).a(0, false), localStyle1.getFont(), 1.0D, localStyle1.getRotationAngle());
              i5 = 0;
              i5 += c(((Cell)localObject2).getColumn(), paramInt2 - 1);
              if (i5 < d1 + 2.0D) {
                return true;
              }
            }
          }
          if ((localObject1 != null) && (((Cell)localObject1).c.h() == 5))
          {
            localStyle1 = ((Cell)localObject1).p();
            if ((localStyle1.getHorizontalAlignment() == 8) && (localCell.c.h() == 5) && (!localStyle1.isTextWrapped()))
            {
              d1 = zavt.a(((Cell)localObject1).a(0, false), localStyle1.getFont(), 1.0D, localStyle1.getRotationAngle());
              i5 = 0;
              i5 += c(paramInt4 + 1, ((Cell)localObject1).getColumn());
              if (i5 < d1 + 2.0D) {
                return true;
              }
            }
          }
          localObject1 = null;
          localObject2 = null;
        }
      }
    }
    return false;
  }
  
  private int c()
    throws Exception
  {
    int i1 = -1;
    zaja localzaja = this.l.getRows().a.a(-1, -1, false);
    zgs localzgs1 = new zgs();
    zgs localzgs2 = localzgs1;
    int i6;
    Object localObject2;
    Object localObject3;
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      if ((!Row.a(localzt)) && (localzt.k() != 0) && (localzt.a() > 0))
      {
        zaiv localzaiv = localzt.a(-1, -1, true);
        label358:
        for (;;)
        {
          int i2 = localzaiv.a();
          if (i2 < 0) {
            break;
          }
          localzgs2 = localzt.a(i2, localzgs1, 7);
          if (d(localzgs2.a) > 0)
          {
            Style localStyle = Cell.a(this.l, localzt, localzgs2);
            int i4 = localzgs2.h();
            if (i4 == 3)
            {
              if ((localStyle == null) || (!zavt.a(localStyle, this.w))) {
                break label358;
              }
              if (i1 >= localzgs2.a) {
                break;
              }
              i1 = localzgs2.a;
              break;
            }
            i6 = localzgs2.a;
            if ((i4 == 5) && (!localStyle.isTextWrapped()) && (!localStyle.getShrinkToFit()) && ((localStyle.getHorizontalAlignment() == 7) || (localStyle.getHorizontalAlignment() == 5)))
            {
              int i7 = localStyle.getRotationAngle();
              if ((i7 >= 0) && (i7 != 90) && (i7 != 255))
              {
                localObject2 = Cell.a(this.l, localzt, localzgs2, 0, false);
                localObject3 = this.w.getFont();
                if ((localStyle != null) && (localStyle.q() != null)) {
                  localObject3 = localStyle.q();
                }
                double d1 = zavt.b((String)localObject2, (Font)localObject3, 1.0D, localStyle.getRotationAngle());
                i6 = zavt.a(this.l.b, localzgs2.a, d1, this.M[0], false);
              }
            }
            if (i1 >= i6) {
              break;
            }
            i1 = i6;
            break;
          }
        }
      }
    }
    for (int i3 = this.x.size() - 1; i3 >= 0; i3--)
    {
      zgr localzgr = (zgr)this.x.get(i3);
      if ((i1 < localzgr.d) && (localzgr.d < 16383) && (a(localzgr, this.w, false, false))) {
        i1 = localzgr.d;
      }
    }
    ArrayList localArrayList = (ArrayList)this.K.get(this.k);
    int i5;
    Object localObject1;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      i5 = 0;
      for (i6 = 0; i6 < localArrayList.size(); i6++)
      {
        localObject1 = (zbje)localArrayList.get(i6);
        localObject2 = ((zbje)localObject1).l();
        if ((((Shape)localObject2).isHidden() != true) && (((Shape)localObject2).isPrintable()) && (!((Shape)localObject2).W()))
        {
          i5 = ((zbje)localObject1).m().EndColumn;
          if (i5 > i1) {
            i1 = i5;
          }
        }
      }
    }
    if ((this.k.getSparklineGroupCollection() != null) && (this.k.getSparklineGroupCollection().getCount() > 0)) {
      for (i5 = 0; i5 < this.k.getSparklineGroupCollection().getCount(); i5++)
      {
        SparklineGroup localSparklineGroup = this.k.getSparklineGroupCollection().get(i5);
        localObject1 = localSparklineGroup.getSparklineCollection();
        if (((SparklineCollection)localObject1).b().getIndex() == this.k.getIndex()) {
          for (int i8 = 0; i8 < ((SparklineCollection)localObject1).getCount(); i8++)
          {
            localObject3 = ((SparklineCollection)localObject1).get(i8);
            if (((Sparkline)localObject3).getColumn() > i1) {
              i1 = ((Sparkline)localObject3).getColumn();
            }
          }
        }
      }
    }
    return i1;
  }
  
  public void a(Worksheet paramWorksheet, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    this.h = paramImageOrPrintOptions;
    this.w = this.i.getDefaultStyle();
    a(paramWorksheet.getIndex());
  }
  
  private CellArea a(CellArea paramCellArea, boolean paramBoolean)
    throws Exception
  {
    int i1;
    int i3;
    int i2;
    int i4;
    if (paramBoolean)
    {
      i1 = paramCellArea.StartRow == -1 ? this.a : paramCellArea.StartRow;
      i3 = paramCellArea.StartColumn == -1 ? this.c : paramCellArea.StartColumn;
      i2 = paramCellArea.EndRow == -1 ? this.b : paramCellArea.EndRow;
      i4 = paramCellArea.EndColumn == -1 ? this.d : paramCellArea.EndColumn;
    }
    else
    {
      i1 = this.a;
      i2 = this.b;
      i3 = this.c;
      i4 = this.d;
    }
    int[] arrayOfInt = zavt.b(this.k);
    this.z = arrayOfInt[0];
    this.A = arrayOfInt[1];
    this.B = arrayOfInt[2];
    this.C = arrayOfInt[3];
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = i1;
    localCellArea.StartColumn = i3;
    localCellArea.EndRow = i2;
    localCellArea.EndColumn = i4;
    if (this.k.getPageSetup().getPrintHeadings())
    {
      com.aspose.cells.b.a.b.zt localzt = zavt.a(i2, this.i.getDefaultStyle().getFont(), new double[] { 1.0D, 1.0D });
      this.s -= localzt.b();
      this.t -= localzt.c();
    }
    if (!this.h.getOnlyArea())
    {
      this.N = zauu.a(this.k, this.s, this.t, i3, i4, i1, i2, this.z, this.A, this.B, this.C);
      this.p = new double[] { this.M[0] * this.N / 100.0D, this.M[1] * this.N / 100.0D };
    }
    return localCellArea;
  }
  
  private boolean a(zgr paramzgr)
  {
    if ((this.h == null) || (this.h.getPrintingPage() == 0)) {
      return true;
    }
    if (this.h.getPrintingPage() == 1)
    {
      if (a(paramzgr, this.w, true, false)) {
        return true;
      }
    }
    else if ((this.h.getPrintingPage() == 2) && (a(paramzgr, this.w, true, true))) {
      return true;
    }
    ShapeCollection localShapeCollection = this.k.w();
    if ((localShapeCollection != null) && (localShapeCollection.getCount() > 0))
    {
      Iterator localIterator = localShapeCollection.iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        if ((localShape.isHidden() != true) && (localShape.isPrintable()) && (!localShape.W()))
        {
          zp localzp1 = new zp(localShape.getUpperLeftColumn(), localShape.getUpperLeftRow(), localShape.getLowerRightColumn() - localShape.getUpperLeftColumn(), localShape.getLowerRightRow() - localShape.getUpperLeftRow());
          zp localzp2 = new zp(paramzgr.b, paramzgr.a, paramzgr.d - paramzgr.b, paramzgr.c - paramzgr.a);
          if (localzp1.a(localzp2)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void a(CellArea paramCellArea, boolean paramBoolean, int paramInt)
    throws Exception
  {
    CellArea localCellArea = a(paramCellArea, paramBoolean);
    PageSetup localPageSetup = this.k.getPageSetup();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    zp localzp = new zp(localCellArea.StartColumn, localCellArea.StartRow, localCellArea.EndColumn - localCellArea.StartColumn + 1, localCellArea.EndRow - localCellArea.StartRow + 1);
    a(this.t, localArrayList1, localzp);
    b(this.s, localArrayList3, localzp);
    a(localArrayList1, localArrayList2);
    b(localArrayList3, localArrayList4);
    f();
    h();
    zq localzq = new zq();
    if ((this.h != null) && (!this.h.a()))
    {
      localzq = new zq(0.0F, 0.0F, ((Float)localArrayList4.get(localArrayList4.size() - 1)).floatValue(), ((Float)localArrayList2.get(localArrayList2.size() - 1)).floatValue());
      if (!a(new zgr(paramCellArea))) {
        return;
      }
      a(new zgr(paramCellArea), localzq, localCellArea, paramInt);
      return;
    }
    zgr localzgr1 = new zgr();
    if ((localArrayList1.size() > 0) && (localArrayList3.size() > 0))
    {
      int i2;
      if (localPageSetup.getOrder() == 1) {
        for (i1 = 1; i1 < localArrayList1.size(); i1++)
        {
          localzgr1.c = (((Integer)localArrayList1.get(i1)).intValue() - 1);
          localzgr1.a = ((Integer)localArrayList1.get(i1 - 1)).intValue();
          for (i2 = 1; i2 < localArrayList3.size(); i2++)
          {
            localzgr1.d = (((Integer)localArrayList3.get(i2)).intValue() - 1);
            localzgr1.b = ((Integer)localArrayList3.get(i2 - 1)).intValue();
            if (this.k.getDisplayRightToLeft()) {
              localzq = new zq(-((Float)localArrayList4.get(i2)).floatValue(), ((Float)localArrayList2.get(i1 - 1)).floatValue(), ((Float)localArrayList4.get(i2)).floatValue() - ((Float)localArrayList4.get(i2 - 1)).floatValue(), ((Float)localArrayList2.get(i1)).floatValue() - ((Float)localArrayList2.get(i1 - 1)).floatValue());
            } else {
              localzq = new zq(((Float)localArrayList4.get(i2 - 1)).floatValue(), ((Float)localArrayList2.get(i1 - 1)).floatValue(), ((Float)localArrayList4.get(i2)).floatValue() - ((Float)localArrayList4.get(i2 - 1)).floatValue(), ((Float)localArrayList2.get(i1)).floatValue() - ((Float)localArrayList2.get(i1 - 1)).floatValue());
            }
            if ((paramBoolean) || (a(localzgr1))) {
              a(localzgr1, localzq, localCellArea, paramInt);
            }
          }
        }
      } else {
        for (i1 = 1; i1 < localArrayList3.size(); i1++)
        {
          localzgr1.d = (((Integer)localArrayList3.get(i1)).intValue() - 1);
          localzgr1.b = ((Integer)localArrayList3.get(i1 - 1)).intValue();
          if (localzgr1.b <= localzgr1.d) {
            for (i2 = 1; i2 < localArrayList1.size(); i2++)
            {
              localzgr1.c = (((Integer)localArrayList1.get(i2)).intValue() - 1);
              localzgr1.a = ((Integer)localArrayList1.get(i2 - 1)).intValue();
              if (this.k.getDisplayRightToLeft()) {
                localzq = new zq(-((Float)localArrayList4.get(i1)).floatValue(), ((Float)localArrayList2.get(i2 - 1)).floatValue(), ((Float)localArrayList4.get(i1)).floatValue() - ((Float)localArrayList4.get(i1 - 1)).floatValue(), ((Float)localArrayList2.get(i2)).floatValue() - ((Float)localArrayList2.get(i2 - 1)).floatValue());
              } else {
                localzq = new zq(((Float)localArrayList4.get(i1 - 1)).floatValue(), ((Float)localArrayList2.get(i2 - 1)).floatValue(), ((Float)localArrayList4.get(i1)).floatValue() - ((Float)localArrayList4.get(i1 - 1)).floatValue(), ((Float)localArrayList2.get(i2)).floatValue() - ((Float)localArrayList2.get(i2 - 1)).floatValue());
              }
              if ((paramBoolean) || (a(localzgr1))) {
                a(localzgr1, localzq, localCellArea, paramInt);
              }
            }
          }
        }
      }
      int i1 = this.f.size();
      for (int i3 = i1 - 1; i3 >= 0; i3--)
      {
        zgr localzgr2 = ((zaus)this.f.get(i3)).c;
        if ((paramBoolean) || (a(localzgr2.a, localzgr2.b, localzgr2.c, localzgr2.d))) {
          break;
        }
        this.f.remove(i3);
      }
    }
    else
    {
      a(localzgr1, new zq(), localCellArea, paramInt);
    }
  }
  
  private void d()
    throws Exception
  {
    if (this.k.getPageSetup().getPrintComments() != 2) {
      return;
    }
    if ((this.k.getComments() == null) && (this.k.getComments().getCount() == 0)) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator;
    Comment localComment1;
    if ((this.O == null) || (this.O.size() == 0))
    {
      localIterator = this.k.getComments().iterator();
      while (localIterator.hasNext())
      {
        localComment1 = (Comment)localIterator.next();
        com.aspose.cells.b.a.a.zf.a(localArrayList, localComment1);
      }
    }
    else
    {
      localIterator = this.k.getComments().iterator();
      while (localIterator.hasNext())
      {
        localComment1 = (Comment)localIterator.next();
        for (int i1 = 0; i1 < this.O.size(); i1++)
        {
          CellArea localCellArea = (CellArea)this.O.get(i1);
          if ((localComment1.getRow() >= localCellArea.StartRow) && (localComment1.getRow() <= localCellArea.EndRow) && (localComment1.getColumn() >= localCellArea.StartColumn) && (localComment1.getColumn() <= localCellArea.EndColumn))
          {
            com.aspose.cells.b.a.a.zf.a(localArrayList, localComment1);
            break;
          }
        }
      }
    }
    if (localArrayList.size() <= 0) {
      return;
    }
    float f1 = 0.0F;
    float f2 = 0.0F;
    zb localzb1 = new zb();
    float f3 = (float)(this.k.getCells().getStandardHeightPixels() * 72.0F * this.p[1]) / zbxp.a();
    int i2 = (int)(this.t / f3);
    int i3 = 0;
    a(localzb1);
    for (int i4 = 0; i4 < localArrayList.size(); i4++)
    {
      Comment localComment2 = (Comment)localArrayList.get(i4);
      zbox localzbox = (zbox)this.L.g.get(Integer.valueOf(this.l.g().getIndex()));
      float f4 = localzbox.a();
      double[] arrayOfDouble = localzbox.b;
      zmx localzmx = new zmx(f1, f2, localComment2, this.k, this.p, (float)this.s, (float)this.t, this.e, f4, arrayOfDouble);
      zb localzb2 = localzmx.a();
      if (i2 - i3 >= localzmx.b())
      {
        localzb1.a(localzb2);
        f2 += (localzmx.b() + 1) * f3;
        i3 += localzmx.b() + 1;
      }
      else if (i2 - i3 >= 1)
      {
        localzb1.a(localzmx.a(0));
        localzb1 = new zb();
        f2 = 0.0F;
        i3 = 0;
        a(localzb1);
        localzmx.a(new zo(f1, f2));
        localzb1.a(localzmx.a(1));
        f2 += (localzmx.c() + 1) * f3;
        i3 += localzmx.c() + 1;
      }
      else
      {
        localzb1 = new zb();
        f2 = 0.0F;
        i3 = 0;
        a(localzb1);
        localzmx.a(new zo(f1, f2));
        localzb1.a(localzmx.a());
        f2 += (localzmx.b() + 1) * f3;
        i3 += localzmx.b() + 1;
      }
    }
  }
  
  private void a(zb paramzb)
  {
    zaus localzaus = new zaus();
    localzaus.b = -1;
    localzaus.a = this.m;
    localzaus.h = this.q;
    localzaus.i = this.r;
    localzaus.n = this.G;
    localzaus.p = this.I;
    localzaus.o = this.H;
    localzaus.q = this.J;
    localzaus.r = paramzb;
    com.aspose.cells.b.a.a.zf.a(this.f, localzaus);
  }
  
  private void a(int paramInt)
    throws Exception
  {
    Worksheet localWorksheet = this.i.getWorksheets().get(paramInt);
    if (!localWorksheet.isVisible()) {
      return;
    }
    this.m = paramInt;
    this.M = zauu.a(localWorksheet);
    if (localWorksheet.getType() == 2)
    {
      c(localWorksheet);
      return;
    }
    b(localWorksheet);
    if ((this.O == null) || (this.O.size() == 0))
    {
      if (e()) {
        return;
      }
      a(new CellArea(), false, -1);
    }
    else
    {
      zban.a(this.O);
      int i1 = 0;
      for (int i2 = 0; i2 < this.O.size(); i2++)
      {
        CellArea localCellArea = (CellArea)this.O.get(i2);
        if (((localCellArea.StartRow == 0) && (localCellArea.EndRow == 65535)) || ((localCellArea.StartRow == -1) && (localCellArea.EndRow == -1)) || ((localCellArea.StartRow == 0) && (localCellArea.EndRow == 1048575)))
        {
          if (e()) {
            continue;
          }
          localCellArea.EndRow = this.b;
          localCellArea.StartRow = this.a;
          if (localCellArea.StartColumn == -1) {
            localCellArea.StartColumn = this.c;
          }
          if (localCellArea.EndColumn == -1) {
            localCellArea.EndColumn = this.d;
          }
        }
        else if ((localCellArea.StartColumn == -1) && (localCellArea.EndColumn == -1))
        {
          if (e()) {
            continue;
          }
          localCellArea.StartColumn = this.c;
          localCellArea.EndColumn = this.d;
        }
        i1 = 1;
        a(localCellArea, true, i2);
      }
      if (i1 == 0) {
        return;
      }
    }
    d();
  }
  
  private boolean e()
  {
    return (this.d < 0) || (this.c < 0) || (this.a < 0) || (this.b < 0);
  }
  
  private void c(Worksheet paramWorksheet)
  {
    a(paramWorksheet);
    zaus localzaus = new zaus();
    zgr localzgr = new zgr();
    g();
    localzaus.a = this.m;
    localzaus.c = localzgr;
    localzaus.d = 0;
    localzaus.e = 0;
    localzaus.f = 0;
    localzaus.g = 0;
    localzaus.h = this.q;
    localzaus.i = this.r;
    localzaus.j = this.s;
    localzaus.k = this.t;
    localzaus.l = this.x;
    double[] arrayOfDouble = { 0.0D, 0.0D };
    a(localzgr.b, localzgr.d, this.s / 72.0D, arrayOfDouble);
    localzaus.n = arrayOfDouble[0];
    localzaus.p = arrayOfDouble[1];
    b(localzgr.a, localzgr.c, this.t / 72.0D, arrayOfDouble);
    localzaus.o = arrayOfDouble[0];
    localzaus.q = arrayOfDouble[1];
    localzaus.m = new zq(0.0F, 0.0F, (float)this.q * 72.0F, (float)this.r * 72.0F);
    com.aspose.cells.b.a.a.zf.a(this.f, localzaus);
  }
  
  private void a(int paramInt1, int paramInt2, double paramDouble, double[] paramArrayOfDouble)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    if (this.k.getPageSetup().getCenterHorizontally())
    {
      double d3 = 0.0D;
      paramDouble *= 2.54D;
      int i1 = 0;
      for (int i2 = paramInt1; i2 <= paramInt2; i2++) {
        if ((i2 >= this.B) && (i2 <= this.C)) {
          i1 = 1;
        }
      }
      d3 += b(paramInt1, paramInt2);
      if ((i1 == 0) && (this.B >= 0) && (this.C >= 0)) {
        d3 += b(this.B, this.C);
      }
      d3 = d3 * this.p[0] / 72.0D * 2.54D;
      if (paramDouble > d3)
      {
        double d4 = (paramDouble - d3) / 2.0D;
        d1 = d4 + this.G;
        d1 = zr.b(d1, 2);
        d2 = d4 + this.I;
        d2 = zr.b(d2, 2);
      }
      else
      {
        d1 = this.G;
        d2 = this.I;
      }
    }
    else
    {
      d1 = this.G;
      d2 = this.I;
    }
    if (d1 < 0.0D) {
      d1 = 0.0D;
    }
    if (d2 < 0.0D) {
      d2 = 0.0D;
    }
    paramArrayOfDouble[0] = d1;
    paramArrayOfDouble[1] = d2;
  }
  
  private void b(int paramInt1, int paramInt2, double paramDouble, double[] paramArrayOfDouble)
  {
    double d1 = 0.0D;
    double d2 = 0.0D;
    if (this.k.getPageSetup().getCenterVertically())
    {
      double d3 = 0.0D;
      paramDouble *= 2.54D;
      int i1 = 0;
      for (int i2 = paramInt1; i2 <= paramInt2; i2++) {
        if ((i2 >= this.z) && (i2 <= this.A)) {
          i1 = 1;
        }
      }
      d3 += a(paramInt1, paramInt2) / 72.0D;
      if ((i1 == 0) && (this.z >= 0) && (this.A >= 0)) {
        d3 += a(this.z, this.A) / 72.0D;
      }
      d3 = d3 * this.p[1] * 2.54D;
      if (paramDouble > d3)
      {
        double d4 = (paramDouble - d3) / 2.0D;
        d1 = d4 + this.H;
        d1 = zr.b(d1, 2);
        d2 = d4 + this.J;
        d2 = zr.b(d2, 2);
      }
      else
      {
        d1 = this.H;
        d2 = this.J;
      }
    }
    else
    {
      d1 = this.H;
      d2 = this.J;
    }
    if (d1 < 0.0D) {
      d1 = 0.0D;
    }
    if (d2 < 0.0D) {
      d2 = 0.0D;
    }
    paramArrayOfDouble[0] = d1;
    paramArrayOfDouble[1] = d2;
  }
  
  private void a(zgr paramzgr, zq paramzq, CellArea paramCellArea, int paramInt)
  {
    zaus localzaus = new zaus();
    localzaus.b = paramInt;
    localzaus.a = this.m;
    localzaus.c = new zgr(paramzgr.a, paramzgr.b, paramzgr.c, paramzgr.d);
    localzaus.d = paramCellArea.StartRow;
    localzaus.e = paramCellArea.EndRow;
    localzaus.f = paramCellArea.StartColumn;
    localzaus.g = paramCellArea.EndColumn;
    double[] arrayOfDouble = { 0.0D, 0.0D };
    if (!this.h.getOnlyArea())
    {
      a(paramzgr.b, paramzgr.d, this.s / 72.0D, arrayOfDouble);
      localzaus.n = arrayOfDouble[0];
      localzaus.p = arrayOfDouble[1];
      b(paramzgr.a, paramzgr.c, this.t / 72.0D, arrayOfDouble);
      localzaus.o = arrayOfDouble[0];
      localzaus.q = arrayOfDouble[1];
    }
    double d1;
    if ((this.h != null) && (this.h.getOnePagePerSheet()))
    {
      localzaus.j = paramzq.h();
      if ((this.B != -1) && (this.B < paramzgr.b))
      {
        d1 = 0.0D;
        d1 += b(this.B, this.C);
        d1 *= this.p[0];
        localzaus.j += d1;
      }
      localzaus.k = paramzq.i();
      if ((this.z != -1) && (this.z < paramzgr.a))
      {
        d1 = 0.0D;
        d1 += a(this.z, this.A);
        d1 *= this.p[1];
        localzaus.k += d1;
      }
      localzaus.h = (localzaus.j / 72.0D + (localzaus.n + localzaus.p) / 2.5399999618530273D);
      localzaus.i = (localzaus.k / 72.0D + (localzaus.o + localzaus.q) / 2.5399999618530273D);
    }
    else if ((this.h != null) && (this.h.getAllColumnsInOnePagePerSheet()))
    {
      localzaus.j = paramzq.h();
      if ((this.B != -1) && (this.B < paramzgr.b))
      {
        d1 = 0.0D;
        d1 += b(this.B, this.C);
        d1 *= this.p[0];
        localzaus.j += d1;
      }
      localzaus.k = paramzq.i();
      localzaus.h = (localzaus.j / 72.0D + (localzaus.n + localzaus.p) / 2.5399999618530273D);
      localzaus.i = this.r;
    }
    else if ((this.h != null) && (this.h.getOnlyArea()))
    {
      localzaus.j = paramzq.h();
      if ((this.B != -1) && (this.B < paramzgr.b))
      {
        d1 = 0.0D;
        d1 += b(this.B, this.C);
        d1 *= this.p[0];
        localzaus.j += d1;
      }
      localzaus.k = paramzq.i();
      if ((this.z != -1) && (this.z < paramzgr.a))
      {
        d1 = 0.0D;
        d1 += a(this.z, this.A);
        d1 *= this.p[1];
        localzaus.k += d1;
      }
      localzaus.h = (localzaus.j / 72.0D);
      localzaus.i = (localzaus.k / 72.0D);
    }
    else
    {
      localzaus.h = this.q;
      localzaus.i = this.r;
      localzaus.j = this.s;
      localzaus.k = this.t;
    }
    localzaus.l = b(paramzgr);
    localzaus.m = paramzq;
    com.aspose.cells.b.a.a.zf.a(this.f, localzaus);
    this.i.i();
  }
  
  private void f()
  {
    if (this.x != null)
    {
      Iterator localIterator = this.x.iterator();
      while (localIterator.hasNext())
      {
        zgr localzgr = (zgr)localIterator.next();
        if (((localzgr.a <= this.A) && (localzgr.c >= this.z)) || ((localzgr.b <= this.C) && (localzgr.d >= this.B))) {
          com.aspose.cells.b.a.a.zf.a(this.y, localzgr);
        }
      }
    }
  }
  
  private ArrayList b(zgr paramzgr)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.y.iterator();
    zgr localzgr;
    while (localIterator.hasNext())
    {
      localzgr = (zgr)localIterator.next();
      com.aspose.cells.b.a.a.zf.a(localArrayList, localzgr);
    }
    if (this.x != null)
    {
      localIterator = this.x.iterator();
      while (localIterator.hasNext())
      {
        localzgr = (zgr)localIterator.next();
        if ((localzgr.a <= paramzgr.c) && (localzgr.b <= paramzgr.d) && (localzgr.c >= paramzgr.a) && (localzgr.d >= paramzgr.b)) {
          com.aspose.cells.b.a.a.zf.a(localArrayList, localzgr);
        }
      }
    }
    return localArrayList;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt2 <= paramInt1) && (paramInt3 >= paramInt1);
  }
  
  private double a(int paramInt, double paramDouble)
  {
    if (this.z == -1) {
      return 0.0D;
    }
    double d1;
    if (paramInt > this.A) {
      d1 = paramDouble;
    } else if ((paramInt > this.z) && (paramInt <= this.A)) {
      d1 = a(this.z, paramInt - 1);
    } else if (paramInt <= this.z) {
      d1 = 0.0D;
    } else {
      d1 = paramDouble;
    }
    return d1;
  }
  
  private ArrayList a(int paramInt1, int paramInt2, PageSetup paramPageSetup, double paramDouble)
  {
    ArrayList localArrayList = new ArrayList();
    double d1 = 0.0D;
    double d2 = this.t - a(paramInt1, paramDouble);
    for (int i1 = paramInt1; i1 < paramInt2; i1++)
    {
      double d3 = b(i1);
      d3 = zbra.a(d3);
      d1 += d3 * this.p[1];
      if (d1 >= d2)
      {
        com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(i1));
        d1 = d3 * this.p[1];
        d2 = this.t - a(i1, paramDouble);
      }
    }
    return localArrayList;
  }
  
  private void a(double paramDouble, ArrayList paramArrayList, zp paramzp)
  {
    PageSetup localPageSetup = this.k.getPageSetup();
    com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(paramzp.d()));
    com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(paramzp.d() + paramzp.f()));
    double d1 = 0.0D;
    if ((this.h == null) || (!this.h.getOnePagePerSheet()))
    {
      if (this.z != -1) {
        d1 = a(this.z, this.A);
      }
      if ((localPageSetup.isPercentScale()) || (localPageSetup.getFitToPagesTall() == 0) || (this.N == zauu.a))
      {
        a(paramArrayList, paramzp, d1 * this.p[1]);
        return;
      }
      if ((!localPageSetup.isPercentScale()) && (localPageSetup.getFitToPagesTall() != 0))
      {
        double[] arrayOfDouble = (double[])za.b(this.p);
        int i1 = localPageSetup.getFitToPagesTall();
        ArrayList localArrayList;
        do
        {
          localArrayList = (ArrayList)paramArrayList.clone();
          double d2 = 0.0D;
          for (int i2 = paramzp.d(); i2 < paramzp.d() + paramzp.f(); i2++)
          {
            double d3 = b(i2);
            d2 += d3;
            double d4 = paramDouble;
            if ((this.z >= 0) && (!a(this.z, a(localArrayList, i2), i2))) {
              d4 -= d1 * arrayOfDouble[1];
            }
            if (d2 * arrayOfDouble[1] - 0.0010000000474974513D > d4)
            {
              if (!paramArrayList.contains(Integer.valueOf(i2))) {
                com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(i2));
              }
              d2 = d3;
            }
          }
          if (localArrayList.size() - 1 <= i1) {
            break;
          }
          this.N -= 1;
          arrayOfDouble[0] = (this.M[0] * this.N / 100.0D);
          arrayOfDouble[1] = (this.M[1] * this.N / 100.0D);
        } while (this.N > zauu.a);
        this.p = arrayOfDouble;
        a(paramArrayList, paramzp, d1 * this.p[1]);
        return;
        this.p = arrayOfDouble;
        paramArrayList.clear();
        com.aspose.cells.b.a.a.zf.a(paramArrayList, localArrayList);
        Collections.sort(paramArrayList);
      }
    }
  }
  
  private void a(ArrayList paramArrayList, zp paramzp, double paramDouble)
  {
    PageSetup localPageSetup = this.k.getPageSetup();
    if ((localPageSetup.isPercentScale()) || (localPageSetup.getFitToPagesTall() == 0))
    {
      Object localObject1;
      Object localObject2;
      if (this.k.b != null)
      {
        Iterator localIterator1 = this.k.b.iterator();
        while (localIterator1.hasNext())
        {
          localObject1 = (PivotTable)localIterator1.next();
          localObject2 = ((PivotTable)localObject1).getHorizontalBreaks();
          if ((localObject2 != null) && (((ArrayList)localObject2).size() > 0))
          {
            Iterator localIterator3 = ((Iterable)localObject2).iterator();
            while (localIterator3.hasNext())
            {
              int i5 = ((Integer)localIterator3.next()).intValue();
              if (!paramArrayList.contains(Integer.valueOf(i5))) {
                com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(i5));
              }
            }
          }
        }
      }
      for (int i1 = 0; i1 < this.k.getHorizontalPageBreaks().getCount(); i1++)
      {
        localObject1 = this.k.getHorizontalPageBreaks().get(i1);
        localObject2 = new zp(((HorizontalPageBreak)localObject1).getStartColumn(), ((HorizontalPageBreak)localObject1).getRow(), ((HorizontalPageBreak)localObject1).getEndColumn() - ((HorizontalPageBreak)localObject1).getStartColumn(), 0);
        if ((paramzp.a((zp)localObject2)) && (!paramArrayList.contains(Integer.valueOf(((HorizontalPageBreak)localObject1).getRow())))) {
          com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(((HorizontalPageBreak)localObject1).getRow()));
        }
      }
      Collections.sort(paramArrayList);
    }
    ArrayList localArrayList = new ArrayList();
    int i3;
    for (int i2 = 0; i2 < paramArrayList.size() - 1; i2++)
    {
      i3 = ((Integer)paramArrayList.get(i2)).intValue();
      int i4 = ((Integer)paramArrayList.get(i2 + 1)).intValue();
      com.aspose.cells.b.a.a.zf.a(localArrayList, a(i3, i4, localPageSetup, paramDouble));
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      i3 = ((Integer)localIterator2.next()).intValue();
      if (!paramArrayList.contains(Integer.valueOf(i3))) {
        com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(i3));
      }
    }
    Collections.sort(paramArrayList);
  }
  
  private int a(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList.size() == 2) {
      return ((Integer)paramArrayList.get(0)).intValue();
    }
    return ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    PageSetup localPageSetup = this.k.getPageSetup();
    float f1 = 0.0F;
    int i1 = ((Integer)paramArrayList1.get(0)).intValue();
    int i2;
    if (i1 > 0) {
      for (i2 = 0; i2 < i1; i2++) {
        f1 += (float)b(i2) * (float)this.p[1];
      }
    }
    com.aspose.cells.b.a.a.zf.a(paramArrayList2, Float.valueOf(f1));
    for (int i3 = 1; i3 < paramArrayList1.size(); i3++)
    {
      i2 = ((Integer)paramArrayList1.get(i3)).intValue();
      for (int i4 = i1; i4 < i2; i4++) {
        f1 += (float)b(i4) * (float)this.p[1];
      }
      i1 = i2;
      com.aspose.cells.b.a.a.zf.a(paramArrayList2, Float.valueOf(f1));
    }
  }
  
  private void b(double paramDouble, ArrayList paramArrayList, zp paramzp)
  {
    com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(paramzp.c()));
    com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(paramzp.c() + paramzp.e()));
    PageSetup localPageSetup = this.k.getPageSetup();
    Cells localCells = this.k.getCells();
    double d1 = 0.0D;
    if ((this.h == null) || ((!this.h.getOnePagePerSheet()) && (!this.h.getAllColumnsInOnePagePerSheet())))
    {
      if (this.B != -1) {
        d1 += b(this.B, this.C);
      }
      if ((localPageSetup.isPercentScale()) || (localPageSetup.getFitToPagesWide() == 0) || (this.N == zauu.a))
      {
        a(paramDouble, paramArrayList, paramzp, d1 * this.p[0]);
        return;
      }
      int i1 = localPageSetup.getFitToPagesWide();
      if ((!localPageSetup.isPercentScale()) && (i1 != 0))
      {
        double[] arrayOfDouble = (double[])za.b(this.p);
        ArrayList localArrayList;
        do
        {
          localArrayList = (ArrayList)paramArrayList.clone();
          double d2 = 0.0D;
          for (int i2 = paramzp.c(); i2 < paramzp.c() + paramzp.e(); i2++)
          {
            d2 += c(i2);
            double d3 = paramDouble;
            if ((this.B >= 0) && (!a(this.B, a(localArrayList, i2), i2)))
            {
              if (d3 < d1 * arrayOfDouble[0])
              {
                d2 = 0.0D;
                d2 += d1 * arrayOfDouble[0];
                d2 += b(paramzp.c(), paramzp.c() + paramzp.e() - 1);
                this.p[0] = (paramDouble / d2);
                this.p[1] = this.p[0];
                return;
              }
              d3 -= d1 * arrayOfDouble[0];
            }
            if (d2 * arrayOfDouble[0] > d3)
            {
              if (!localArrayList.contains(Integer.valueOf(i2))) {
                com.aspose.cells.b.a.a.zf.a(localArrayList, Integer.valueOf(i2));
              }
              d2 = c(i2);
            }
          }
          if (localArrayList.size() - 1 <= i1) {
            break;
          }
          this.N -= 1;
          arrayOfDouble[0] = (this.M[0] * this.N / 100.0D);
          arrayOfDouble[1] = (this.M[1] * this.N / 100.0D);
        } while (this.N > zauu.a);
        this.p = arrayOfDouble;
        a(paramDouble, paramArrayList, paramzp, d1 * this.p[0]);
        return;
        this.p = arrayOfDouble;
        paramArrayList.clear();
        com.aspose.cells.b.a.a.zf.a(paramArrayList, localArrayList);
        Collections.sort(paramArrayList);
      }
    }
  }
  
  private void a(double paramDouble1, ArrayList paramArrayList, zp paramzp, double paramDouble2)
  {
    double d1 = 0.0D;
    PageSetup localPageSetup = this.k.getPageSetup();
    int i1 = paramzp.c();
    int i2 = 0;
    while (i1 < paramzp.c() + paramzp.e())
    {
      if (((localPageSetup.isPercentScale()) || (localPageSetup.getFitToPagesWide() == 0)) && (i2 < this.k.getVerticalPageBreaks().getCount()) && (this.k.getVerticalPageBreaks().get(i2).getColumn() == i1))
      {
        com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(i1));
        d1 = paramDouble2;
        i2++;
      }
      else
      {
        double d2 = c(i1) * this.p[0];
        d1 += d2;
        if ((d1 - 0.009999999776482582D > paramDouble1) && (i1 > 0))
        {
          if (i1 < paramzp.c() + paramzp.e()) {
            com.aspose.cells.b.a.a.zf.a(paramArrayList, Integer.valueOf(i1));
          }
          d1 = d2;
          if ((this.B != -1) && (this.B < i1)) {
            d1 += paramDouble2;
          }
        }
      }
      i1++;
    }
    Collections.sort(paramArrayList);
  }
  
  private void b(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    float f1 = 0.0F;
    int i1 = ((Integer)paramArrayList1.get(0)).intValue();
    if (i1 > 0) {
      f1 += (float)b(0, i1 - 1) * (float)this.p[0];
    }
    com.aspose.cells.b.a.a.zf.a(paramArrayList2, Float.valueOf(f1));
    for (int i3 = 1; i3 < paramArrayList1.size(); i3++)
    {
      int i2 = ((Integer)paramArrayList1.get(i3)).intValue();
      f1 += (float)b(i1, i2 - 1) * (float)this.p[0];
      i1 = i2;
      com.aspose.cells.b.a.a.zf.a(paramArrayList2, Float.valueOf(f1));
    }
  }
  
  private void a(PageSetup paramPageSetup)
  {
    double[] arrayOfDouble1 = { this.q };
    double[] arrayOfDouble2 = { this.r };
    zauu.a(paramPageSetup, arrayOfDouble1, arrayOfDouble2);
    this.q = arrayOfDouble1[0];
    this.r = arrayOfDouble2[0];
    double[] arrayOfDouble3 = { this.s };
    double[] arrayOfDouble4 = { this.t };
    zauu.a(this.k, arrayOfDouble3, arrayOfDouble4, this.q, this.r);
    this.s = arrayOfDouble3[0];
    this.t = arrayOfDouble4[0];
    if (this.s < 0.0D) {
      throw new CellsException(11, "Invalid left or right margin, Left margin in inch: " + paramPageSetup.getLeftMarginInch() + ", Right margin in inch: " + paramPageSetup.getRightMarginInch());
    }
    if (this.t < 0.0D) {
      throw new CellsException(11, "Invalid top or bottom margin, Top margin in inch: " + paramPageSetup.getTopMarginInch() + ", Bottom margin in inch: " + paramPageSetup.getBottomMarginInch());
    }
    this.u = paramPageSetup.getHeaderMargin();
    this.v = paramPageSetup.getFooterMargin();
    this.G = paramPageSetup.getLeftMargin();
    this.I = paramPageSetup.getRightMargin();
    this.H = paramPageSetup.getTopMargin();
    this.J = paramPageSetup.getBottomMargin();
  }
  
  private void g()
  {
    zbox localzbox = new zbox();
    localzbox.a = 100;
    localzbox.b = new double[] { 1.0D, 1.0D };
    localzbox.c = new double[] { 1.0D, 1.0D };
    localzbox.d = this.u;
    localzbox.e = this.v;
    localzbox.f = this.z;
    localzbox.g = this.A;
    localzbox.h = this.B;
    localzbox.i = this.C;
    localzbox.j = ((ArrayList)this.K.get(this.k));
    this.L.g.put(Integer.valueOf(this.m), localzbox);
  }
  
  private void h()
  {
    PageSetup localPageSetup = this.k.getPageSetup();
    int i1 = this.N;
    zbox localzbox;
    if (this.L.g.containsKey(Integer.valueOf(this.m)))
    {
      localzbox = (zbox)this.L.g.get(Integer.valueOf(this.m));
      if (i1 < localzbox.a)
      {
        localzbox.a = i1;
        localzbox.c = new double[] { this.p[0], this.p[1] };
      }
    }
    else
    {
      localzbox = new zbox();
      localzbox.a = i1;
      localzbox.b = new double[] { this.M[0], this.M[1] };
      localzbox.c = new double[] { this.p[0], this.p[1] };
      localzbox.d = this.u;
      localzbox.e = this.v;
      localzbox.f = this.z;
      localzbox.g = this.A;
      localzbox.h = this.B;
      localzbox.i = this.C;
      localzbox.j = ((ArrayList)this.K.get(this.k));
      this.L.g.put(Integer.valueOf(this.m), localzbox);
    }
  }
  
  private double b(int paramInt)
  {
    return zavt.a(this.l, paramInt);
  }
  
  private double a(int paramInt1, int paramInt2)
  {
    return zavt.a(this.l, paramInt1, paramInt2);
  }
  
  private double c(int paramInt)
  {
    return zavt.c(this.l, paramInt);
  }
  
  private double b(int paramInt1, int paramInt2)
  {
    return zavt.c(this.l, paramInt1, paramInt2);
  }
  
  private int d(int paramInt)
  {
    return zavt.d(this.l, paramInt);
  }
  
  private int c(int paramInt1, int paramInt2)
  {
    return zavt.d(this.l, paramInt1, paramInt2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */