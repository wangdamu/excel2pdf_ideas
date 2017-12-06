package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.a.d.zn;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Chart
{
  zqm a = null;
  ArrayList b = null;
  byte[] c = null;
  byte[] d = null;
  String e = null;
  private int r = -1;
  private ChartShape s;
  private int t = 0;
  private int u = 0;
  boolean f = false;
  boolean g = false;
  private ArrayList v;
  private String w = null;
  private int x = -1;
  private PivotOptions y;
  private String z;
  private byte A = 2;
  private int B = 0;
  private boolean C = false;
  boolean h = true;
  private boolean D;
  private boolean E = false;
  private WorksheetCollection F;
  private Worksheet G;
  private ShapeCollection H;
  private int I = 0;
  private int J = 14;
  zkb i;
  private SeriesCollection K;
  private Title L;
  private PlotArea M;
  private ChartArea N;
  Axis j;
  Axis k;
  Axis l;
  private Axis O;
  private Axis P;
  private Legend Q;
  private ChartDataTable R;
  private boolean S = true;
  private boolean T = true;
  private boolean U;
  private int V = 150;
  private boolean W = false;
  private Floor X;
  private Walls Y;
  private Walls Z;
  private boolean aa;
  private int ab = 20;
  private int ac = 15;
  private boolean ad = true;
  private boolean ae = true;
  int m = 100;
  private short af = 15;
  private int ag = 100;
  boolean n = false;
  boolean o = false;
  private ArrayList ah;
  private ArrayList ai;
  PageSetup p;
  private double aj = 1.0D;
  private double ak = 1.0D;
  int q;
  private int al = 0;
  private zbpa am;
  private boolean an = false;
  private zrs ao = null;
  private Line ap;
  private zji aq = null;
  private zkm ar;
  
  int a()
  {
    return this.r;
  }
  
  void a(int paramInt)
  {
    if ((paramInt >= 1) && (paramInt <= 48)) {
      this.r = paramInt;
    }
  }
  
  public int getStyle()
  {
    return this.r;
  }
  
  public void setStyle(int value)
  {
    if ((value >= 1) && (value <= 48))
    {
      this.r = value;
      if (this.a != null) {
        this.a.e = null;
      }
    }
  }
  
  public ChartShape getChartObject()
  {
    return this.s;
  }
  
  int b()
  {
    if (this.f) {
      return this.t;
    }
    return this.s.getWidth();
  }
  
  void b(int paramInt)
  {
    this.t = paramInt;
    this.f = true;
  }
  
  int c()
  {
    if (this.g) {
      return this.u;
    }
    return this.s.getHeight();
  }
  
  void c(int paramInt)
  {
    this.u = paramInt;
    this.g = true;
  }
  
  ArrayList d()
  {
    if (this.v == null) {
      this.v = new ArrayList();
    }
    return this.v;
  }
  
  String e()
  {
    return this.w;
  }
  
  void a(String paramString)
  {
    this.w = paramString;
    this.x = zamr.a(paramString);
  }
  
  int f()
  {
    if (this.x != -1) {
      return this.x;
    }
    return this.F.p().getSettings().f().e();
  }
  
  ArrayList g()
  {
    return this.v;
  }
  
  public boolean getHidePivotFieldButtons()
  {
    return !this.y.DropZonesVisible;
  }
  
  public void setHidePivotFieldButtons(boolean value)
  {
    this.y.DropZonesVisible = (!value);
  }
  
  public PivotOptions getPivotOptions()
  {
    return this.y;
  }
  
  public String getPivotSource()
  {
    return this.z;
  }
  
  public void setPivotSource(String value)
  {
    this.z = value;
  }
  
  boolean h()
  {
    return (this.z != null) && (!"".equals(this.z));
  }
  
  /* Error */
  public boolean isChartDataChanged()
    throws Exception
  {
    // Byte code:
    //   0: new 101	com/aspose/cells/zkq
    //   3: dup
    //   4: aconst_null
    //   5: invokespecial 553	com/aspose/cells/zkq:<init>	(Lcom/aspose/cells/ImageOrPrintOptions;)V
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: invokevirtual 558	com/aspose/cells/zkq:e	(Lcom/aspose/cells/Chart;)V
    //   14: aload_1
    //   15: ifnull +21 -> 36
    //   18: aload_1
    //   19: invokevirtual 554	com/aspose/cells/zkq:a	()V
    //   22: goto +14 -> 36
    //   25: astore_2
    //   26: aload_1
    //   27: ifnull +7 -> 34
    //   30: aload_1
    //   31: invokevirtual 554	com/aspose/cells/zkq:a	()V
    //   34: aload_2
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual 271	com/aspose/cells/Chart:getNSeries	()Lcom/aspose/cells/SeriesCollection;
    //   40: invokeinterface 587 1 0
    //   45: astore_2
    //   46: aload_2
    //   47: invokeinterface 588 1 0
    //   52: ifeq +83 -> 135
    //   55: aload_2
    //   56: invokeinterface 589 1 0
    //   61: checkcast 59	com/aspose/cells/Series
    //   64: astore_3
    //   65: aload_3
    //   66: invokevirtual 428	com/aspose/cells/Series:o	()Lcom/aspose/cells/zjk;
    //   69: ifnull +15 -> 84
    //   72: aload_3
    //   73: invokevirtual 428	com/aspose/cells/Series:o	()Lcom/aspose/cells/zjk;
    //   76: invokevirtual 531	com/aspose/cells/zjk:t	()Z
    //   79: ifne +5 -> 84
    //   82: iconst_1
    //   83: ireturn
    //   84: aload_3
    //   85: invokevirtual 427	com/aspose/cells/Series:m	()Lcom/aspose/cells/zjk;
    //   88: ifnull +15 -> 103
    //   91: aload_3
    //   92: invokevirtual 427	com/aspose/cells/Series:m	()Lcom/aspose/cells/zjk;
    //   95: invokevirtual 531	com/aspose/cells/zjk:t	()Z
    //   98: ifne +5 -> 103
    //   101: iconst_1
    //   102: ireturn
    //   103: aload_3
    //   104: invokevirtual 425	com/aspose/cells/Series:getType	()I
    //   107: invokestatic 306	com/aspose/cells/ChartCollection:q	(I)Z
    //   110: ifeq +22 -> 132
    //   113: aload_3
    //   114: invokevirtual 429	com/aspose/cells/Series:p	()Lcom/aspose/cells/zjk;
    //   117: ifnull +15 -> 132
    //   120: aload_3
    //   121: invokevirtual 429	com/aspose/cells/Series:p	()Lcom/aspose/cells/zjk;
    //   124: invokevirtual 531	com/aspose/cells/zjk:t	()Z
    //   127: ifne +5 -> 132
    //   130: iconst_1
    //   131: ireturn
    //   132: goto -86 -> 46
    //   135: iconst_0
    //   136: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	Chart
    //   8	23	1	localzkq	zkq
    //   25	10	2	localObject	Object
    //   45	11	2	localIterator	Iterator
    //   64	57	3	localSeries	Series
    // Exception table:
    //   from	to	target	type
    //   9	14	25	finally
  }
  
  void i()
  {
    Iterator localIterator = getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      if (localSeries.o() != null) {
        localSeries.o().u();
      }
      if (localSeries.m() != null) {
        localSeries.m().u();
      }
      if ((ChartCollection.q(localSeries.getType())) && (localSeries.p() != null)) {
        localSeries.p().u();
      }
    }
  }
  
  void j()
  {
    if (h())
    {
      refreshPivotData();
    }
    else
    {
      boolean bool = R();
      for (int i1 = 0; i1 < getNSeries().getCount(); i1++)
      {
        Series localSeries = getNSeries().get(i1);
        if ((localSeries.o() != null) && (localSeries.o().c != null) && (localSeries.o().c.length > 0)) {
          a(bool, localSeries.o());
        }
        if ((localSeries.m() != null) && (localSeries.m().c != null) && (localSeries.m().c.length > 0)) {
          a(localSeries.m());
        }
      }
    }
  }
  
  private void a(boolean paramBoolean, zjk paramzjk)
  {
    int i1 = 1;
    int i2 = 0;
    int[] arrayOfInt = { i1 };
    boolean[] arrayOfBoolean = { i2 };
    ArrayList localArrayList1 = paramzjk.a(paramBoolean, false, arrayOfInt, arrayOfBoolean);
    i1 = arrayOfInt[0];
    i2 = arrayOfBoolean[0];
    ArrayList localArrayList2 = new ArrayList();
    if ((localArrayList1 != null) && (localArrayList1.size() != 0))
    {
      int i3;
      Object localObject1;
      if (i1 == 1)
      {
        for (i3 = 0; i3 < localArrayList1.size(); i3++)
        {
          zjt localzjt1 = (zjt)localArrayList1.get(i3);
          if ((!getPlotVisibleCells()) || (localzjt1.d))
          {
            localObject1 = "";
            if ((!localzjt1.e) && (!"".equals(localzjt1.a()))) {
              localObject1 = localzjt1.a;
            }
            zf.a(localArrayList2, localObject1);
          }
        }
      }
      else
      {
        i3 = localArrayList1.size();
        int i4 = ((ArrayList)localArrayList1.get(0)).size();
        localObject1 = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
          zf.a((ArrayList)localObject1, new StringBuilder());
        }
        Object localObject2;
        for (i5 = i3 - 1; i5 >= 0; i5--)
        {
          localObject2 = (ArrayList)localArrayList1.get(i5);
          for (int i6 = 0; i6 < ((ArrayList)localObject2).size(); i6++)
          {
            zjt localzjt2 = (zjt)((ArrayList)localObject2).get(i6);
            String str = "";
            if ((!localzjt2.e) && (!"".equals(localzjt2.a()))) {
              str = localzjt2.a();
            }
            StringBuilder localStringBuilder = (StringBuilder)((ArrayList)localObject1).get(i6);
            if (i5 == i3 - 1) {
              localStringBuilder.append(str);
            } else {
              localStringBuilder.append("\n" + str);
            }
          }
        }
        for (i5 = 0; i5 < i4; i5++)
        {
          localObject2 = (StringBuilder)((ArrayList)localObject1).get(i5);
          a((StringBuilder)localObject2, '\n');
          zf.a(localArrayList2, localObject2);
        }
      }
    }
    if (localArrayList2.size() != 0) {
      paramzjk.b = localArrayList2;
    } else {
      paramzjk.b = null;
    }
  }
  
  private void a(zjk paramzjk)
  {
    int i1 = 0;
    StringBuilder localStringBuilder = new StringBuilder(50);
    boolean[] arrayOfBoolean = { i1 };
    ArrayList localArrayList1 = paramzjk.a(true, false, arrayOfBoolean, true);
    i1 = arrayOfBoolean[0];
    ArrayList localArrayList2 = new ArrayList();
    if ((localArrayList1 != null) && (localArrayList1.size() != 0)) {
      for (int i2 = 0; i2 < localArrayList1.size(); i2++)
      {
        zjt localzjt = (zjt)localArrayList1.get(i2);
        if ((!getPlotVisibleCells()) || (localzjt.d))
        {
          String str = "0";
          if ((localzjt.g == 4) || (localzjt.g == 1) || (localzjt.g == 0)) {
            str = localzjt.b();
          }
          zf.a(localArrayList2, str);
        }
      }
    }
    if (localArrayList2.size() != 0) {
      paramzjk.b = localArrayList2;
    } else {
      paramzjk.b = null;
    }
  }
  
  private void a(StringBuilder paramStringBuilder, char paramChar)
  {
    while ((paramStringBuilder.length() > 0) && (paramStringBuilder.charAt(paramStringBuilder.length() - 1) == paramChar)) {
      paramStringBuilder.delete(paramStringBuilder.length() - 1, paramStringBuilder.length() - 1 + 1);
    }
  }
  
  private boolean R()
  {
    boolean bool = false;
    for (int i1 = 0; i1 < getNSeries().getCount(); i1++)
    {
      zjk localzjk = getNSeries().get(i1).m();
      if ((localzjk != null) && (localzjk.m()))
      {
        bool = true;
        break;
      }
    }
    return bool;
  }
  
  public void refreshPivotData()
  {
    PivotTable localPivotTable = null;
    if ((this.z == null) || ("".equals(this.z))) {
      return;
    }
    String str1 = this.z;
    int i1 = -1;
    if (str1.charAt(0) == '[')
    {
      i1 = str1.lastIndexOf(']');
      if (i1 == -1) {
        return;
      }
      localObject = str1.substring(1, 1 + (i1 - 2));
      str1 = str1.substring(i1 + 1);
    }
    i1 = str1.lastIndexOf('!');
    Object localObject = this.G;
    String str2 = ((Worksheet)localObject).getName();
    if (i1 != -1)
    {
      str2 = str1.substring(0, 0 + i1);
      if (str2.charAt(0) == '\'') {
        str2 = str2.substring(1, 1 + (str2.length() - 2));
      }
      localObject = this.F.get(str2);
      if (localObject == null) {
        return;
      }
      str1 = str1.substring(i1 + 1);
    }
    boolean bool = zamm.a(str2);
    String str3 = str2;
    if (bool) {
      str3 = '\'' + str3 + '\'';
    }
    for (int i2 = 0; (((Worksheet)localObject).b != null) && (i2 < ((Worksheet)localObject).b.getCount()); i2++) {
      if (com.aspose.cells.b.a.zw.a(((Worksheet)localObject).b.get(i2).getName(), str1, true) == 0)
      {
        localPivotTable = ((Worksheet)localObject).b.get(i2);
        break;
      }
    }
    if (localPivotTable == null) {
      return;
    }
    localPivotTable.a(this, str3);
  }
  
  byte k()
  {
    return this.A;
  }
  
  void a(byte paramByte)
  {
    this.A = paramByte;
  }
  
  public int getPlotEmptyCellsType()
  {
    return this.B;
  }
  
  public void setPlotEmptyCellsType(int value)
  {
    this.B = value;
  }
  
  public boolean getPlotVisibleCells()
  {
    return (this.A & 0xFF & 0x2) != 0;
  }
  
  public void setPlotVisibleCells(boolean value)
  {
    if (value) {
      this.A = ((byte)(this.A | 0x2));
    } else {
      this.A = ((byte)(this.A & 0xFD));
    }
  }
  
  boolean l()
  {
    return this.C;
  }
  
  void a(boolean paramBoolean)
  {
    this.h = false;
    this.C = paramBoolean;
  }
  
  public String getName()
  {
    if ((this.G.getType() == 2) && (this.G.getCharts().get(0) == this)) {
      return this.G.getName();
    }
    return getChartObject().getName();
  }
  
  public void setName(String value)
  {
    if ((this.G.getType() == 2) && (this.G.getCharts().get(0) == this)) {
      this.G.setName(value);
    } else {
      getChartObject().setName(value);
    }
  }
  
  public boolean getSizeWithWindow()
  {
    return (k() & 0xFF & 0x4) == 0;
  }
  
  public void setSizeWithWindow(boolean value)
  {
    a((byte)(k() & 0xFF & 0xFB));
    if (!value) {
      a((byte)(k() & 0xFF | 0x4));
    }
  }
  
  boolean m()
  {
    return this.D;
  }
  
  void b(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  Chart(Worksheet sheet, int chartType)
  {
    this.F = sheet.c();
    this.G = sheet;
    this.D = (!sheet.c().p().h());
    this.s = new ChartShape(sheet.getShapes(), this);
    this.K = new SeriesCollection(this);
    this.N = new ChartArea(this);
    this.y = new PivotOptions(this);
    this.M = new PlotArea(this);
    this.M.a();
    this.j = new Axis(0, true, this);
    this.k = new Axis(1, true, this);
    this.k.getMajorGridLines().setVisible(true);
    this.l = new Axis(1, false, this);
    this.O = new Axis(0, false, this);
    this.l.setCrossType(1);
    this.O.setCrossType(1);
    this.J = chartType;
    S();
  }
  
  Chart(Worksheet sheet)
  {
    this.F = sheet.c();
    this.G = sheet;
    this.D = (!sheet.c().p().h());
    this.s = new ChartShape(sheet.getShapes(), this);
    this.K = new SeriesCollection(this);
    this.N = new ChartArea(this);
    this.y = new PivotOptions(this);
    this.M = new PlotArea(this);
    this.j = new Axis(0, true, this);
    this.k = new Axis(1, true, this);
    this.l = new Axis(1, false, this);
    this.O = new Axis(0, false, this);
    this.i = new zkb(this);
  }
  
  Chart(Worksheet sheet, ShapeCollection shapes)
  {
    this.F = sheet.c();
    this.G = sheet;
    this.D = (!sheet.c().p().h());
    this.s = new ChartShape(shapes, this);
    this.K = new SeriesCollection(this);
    this.N = new ChartArea(this);
    this.y = new PivotOptions(this);
    this.M = new PlotArea(this);
    this.j = new Axis(0, true, this);
    this.k = new Axis(1, true, this);
    this.l = new Axis(1, false, this);
    this.O = new Axis(0, false, this);
    this.i = new zkb(this);
  }
  
  private void S()
  {
    if (this.G.getType() == 2) {
      this.A = (this.A = (byte)(this.A | 0x4));
    }
    if (ChartCollection.c(this.J))
    {
      this.M.getBorder().setVisible(false);
      this.M.getArea().setFormatting(1);
    }
    else if ((ChartCollection.b(this.J)) && (!ChartCollection.e(this.J)))
    {
      this.Y = new Walls(this);
    }
    switch (this.J)
    {
    case 3: 
    case 43: 
    case 69: 
    case 70: 
      this.ad = false;
      break;
    case 71: 
    case 72: 
      this.ad = false;
      this.ac = 90;
      this.ab = 0;
      this.af = 0;
      break;
    case 45: 
    case 48: 
      this.ab = 0;
      this.ad = false;
      break;
    }
    this.i = new zkb(this);
    zka localzka = null;
    switch (this.J)
    {
    case 65: 
      localzka = new zka(this.i, 37, false);
      localzka.c(true);
      this.i.a(localzka);
      break;
    case 66: 
      localzka = new zka(this.i, 37, false);
      localzka.c(true);
      localzka.i(true);
      this.i.a(localzka);
      break;
    case 67: 
      getSecondValueAxis().setVisible(true);
      localzka = new zka(this.i, 14, false);
      this.i.a(localzka);
      localzka = new zka(this.i, 37, true);
      localzka.c(true);
      this.i.a(localzka);
      break;
    case 68: 
      getSecondValueAxis().setVisible(true);
      localzka = new zka(this.i, 14, false);
      this.i.a(localzka);
      localzka = new zka(this.i, 37, true);
      localzka.c(true);
      localzka.c(100);
      localzka.i(true);
      this.i.a(localzka);
      break;
    default: 
      localzka = new zka(this.i, this.J, false);
      this.i.a(localzka);
    }
    T();
  }
  
  private void T()
  {
    if (this.c != null) {
      return;
    }
    switch (this.J)
    {
    case 73: 
      a("395.xml", "c_10.xml");
      this.i.a(0).c(100);
      getCategoryAxis().setMajorTickMark(2);
      getValueAxis().i = null;
      getValueAxis().setMajorTickMark(2);
      getTitle().setAutoText(true);
      break;
    case 75: 
    case 79: 
      a("395.xml", "c_10.xml");
      this.i.a(0).c(0);
      getCategoryAxis().setMajorTickMark(2);
      getValueAxis().i = null;
      getValueAxis().setMajorTickMark(2);
      getTitle().setAutoText(true);
      if (this.J == 75)
      {
        getSecondValueAxis().setVisible(true);
        getSecondValueAxis().setMajorTickMark(2);
        getSecondValueAxis().setDisplayUnit(10);
        getSecondValueAxis().b(false);
      }
      break;
    case 74: 
    case 76: 
    case 77: 
    case 78: 
      a("395.xml", "c_10.xml");
      this.i.a(0).c(50);
      getCategoryAxis().setMajorTickMark(2);
      getValueAxis().i = null;
      getValueAxis().setMajorTickMark(2);
      getLegend().setPosition(2);
      getLegend().i = 1;
      getTitle().setAutoText(true);
      break;
    }
  }
  
  void a(String paramString1, String paramString2)
  {
    byte[][] arrayOfByte = com.aspose.cells.a.c.zw.a(paramString1, paramString2);
    if (paramString1 != null) {
      this.c = arrayOfByte[0];
    }
    if (paramString2 != null) {
      this.d = arrayOfByte[1];
    }
  }
  
  WorksheetCollection n()
  {
    return this.F;
  }
  
  public Worksheet getWorksheet()
  {
    return this.G;
  }
  
  ChartCollection o()
  {
    return this.G.getCharts();
  }
  
  public ShapeCollection getShapes()
  {
    if (this.H == null) {
      this.H = new ShapeCollection(this.F, this.G, this.F.L(), this, -1);
    }
    return this.H;
  }
  
  ShapeCollection p()
  {
    return this.H;
  }
  
  void a(ShapeCollection paramShapeCollection)
  {
    this.H = paramShapeCollection;
  }
  
  public int getPrintSize()
  {
    return this.I;
  }
  
  public void setPrintSize(int value)
  {
    this.I = value;
  }
  
  public int getType()
  {
    return this.J;
  }
  
  public void setType(int value)
  {
    if (this.J == value) {
      return;
    }
    this.J = value;
    if ((this.Q != null) && (this.Q.F() != null)) {
      this.Q.H();
    }
    S();
    int i1;
    switch (this.J)
    {
    case 65: 
      if (this.K.getCount() != 3) {
        throw new CellsException(0, "To creat this stock chart,arrange the data on the your in this order:high price,low price,closing price");
      }
      for (i1 = 0; i1 < 3; i1++)
      {
        this.K.get(i1).getBorder().setVisible(false);
        this.K.get(i1).a(this.i.a(0));
      }
      this.K.get(2).getMarker().setMarkerStyle(4);
      this.K.get(2).getMarker().a(Color.getBlack());
      this.K.get(2).getMarker().b(Color.getBlack());
      break;
    case 66: 
      if (this.K.getCount() != 4) {
        throw new CellsException(0, "To creat this stock chart,arrange the data on the your in this order:opening price,high price,low price,closing price");
      }
      for (i1 = 0; i1 < 4; i1++)
      {
        this.K.get(i1).getBorder().setVisible(false);
        this.K.get(i1).a(this.i.a(0));
      }
      break;
    case 67: 
      if (this.K.getCount() != 4) {
        throw new CellsException(0, "To creat this stock chart,arrange the data on the your in this order:volumn traded,high price,low price,closing price");
      }
      this.K.get(0).a(this.i.a(0));
      for (i1 = 1; i1 < 4; i1++)
      {
        this.K.get(i1).getBorder().setVisible(false);
        this.K.get(i1).a(this.i.a(1));
      }
      this.K.get(3).getMarker().setMarkerStyle(4);
      this.K.get(3).getMarker().a(Color.getBlack());
      this.K.get(3).getMarker().b(Color.getBlack());
      break;
    case 68: 
      if (this.K.getCount() != 5) {
        throw new CellsException(0, "To creat this stock chart,arrange the data on the your in this order:volumn traded,opening price,high price,low price,closing price");
      }
      this.K.get(0).a(this.i.a(0));
      for (i1 = 1; i1 < 5; i1++)
      {
        this.K.get(i1).getBorder().setVisible(false);
        this.K.get(i1).a(this.i.a(1));
      }
      break;
    default: 
      Iterator localIterator = this.K.iterator();
      while (localIterator.hasNext())
      {
        Series localSeries = (Series)localIterator.next();
        localSeries.a(this.i.a(0));
        localSeries.d();
      }
    }
  }
  
  zkb q()
  {
    return this.i;
  }
  
  void d(int paramInt)
  {
    this.J = paramInt;
  }
  
  public void move(int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn)
  {
    this.s.moveToRange(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn);
  }
  
  public SeriesCollection getNSeries()
  {
    return this.K;
  }
  
  public Title getTitle()
  {
    if (this.L == null)
    {
      this.L = new Title(this);
      this.L.getBorder().setVisible(false);
      this.L.getArea().setFormatting(1);
    }
    return this.L;
  }
  
  Title r()
  {
    return this.L;
  }
  
  /**
   * @deprecated
   */
  public ChartFrame getPlotAreaWithoutTickLabels()
  {
    ChartFrame localChartFrame = new ChartFrame(this);
    localChartFrame.a(this.M.getInnerX(), this.M.getInnerY(), this.M.getInnerWidth(), this.M.getInnerHeight());
    return localChartFrame;
  }
  
  public PlotArea getPlotArea()
  {
    return this.M;
  }
  
  public ChartArea getChartArea()
  {
    return this.N;
  }
  
  public Axis getCategoryAxis()
  {
    return this.j;
  }
  
  public Axis getValueAxis()
  {
    return this.k;
  }
  
  public Axis getSecondValueAxis()
  {
    return this.l;
  }
  
  public Axis getSecondCategoryAxis()
  {
    return this.O;
  }
  
  public Axis getSeriesAxis()
  {
    if (this.P == null) {
      this.P = new Axis(2, true, this);
    }
    return this.P;
  }
  
  Axis s()
  {
    return this.P;
  }
  
  void a(boolean paramBoolean, Axis paramAxis)
  {
    if (paramBoolean) {
      switch (paramAxis.b())
      {
      case 0: 
        this.O = paramAxis;
        break;
      case 1: 
        this.l = paramAxis;
        break;
      }
    } else {
      switch (paramAxis.b())
      {
      case 0: 
        this.j = paramAxis;
        break;
      case 1: 
        this.k = paramAxis;
        break;
      case 2: 
        this.P = paramAxis;
        break;
      }
    }
  }
  
  void a(boolean paramBoolean, Axis paramAxis1, Axis paramAxis2)
  {
    if (("valax".equals(paramAxis1.d.toLowerCase())) && ("valax".equals(paramAxis2.d.toLowerCase()))) {
      if (("b".equals(paramAxis1.e)) || ("t".equals(paramAxis1.e))) {
        paramAxis1.a(0);
      } else {
        paramAxis2.a(0);
      }
    }
    a(paramBoolean, paramAxis1);
    a(paramBoolean, paramAxis2);
  }
  
  public Legend getLegend()
  {
    if (this.Q == null) {
      this.Q = new Legend(this);
    }
    return this.Q;
  }
  
  Legend t()
  {
    return this.Q;
  }
  
  public ChartDataTable getChartDataTable()
  {
    if (this.R == null) {
      this.R = new ChartDataTable(this);
    }
    return this.R;
  }
  
  ChartDataTable u()
  {
    return this.R;
  }
  
  /**
   * @deprecated
   */
  public boolean isLegendShown()
  {
    return this.S;
  }
  
  /**
   * @deprecated
   */
  public void setLegendShown(boolean value)
  {
    this.S = value;
  }
  
  public boolean getShowLegend()
  {
    return this.S;
  }
  
  public void setShowLegend(boolean value)
  {
    this.S = value;
  }
  
  public boolean isRectangularCornered()
  {
    return this.T;
  }
  
  public void setRectangularCornered(boolean value)
  {
    this.T = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isDataTableShown()
  {
    return this.U;
  }
  
  /**
   * @deprecated
   */
  public void setDataTableShown(boolean value)
  {
    this.U = value;
  }
  
  public boolean getShowDataTable()
  {
    return this.U;
  }
  
  public void setShowDataTable(boolean value)
  {
    this.U = value;
  }
  
  public int getFirstSliceAngle()
  {
    return this.i.a(0).A();
  }
  
  public void setFirstSliceAngle(int value)
  {
    if ((value < 0) || (value > 360)) {
      throw new IllegalArgumentException("First slice angle should be degree 0 to 360.");
    }
    this.i.a(0).d(value);
  }
  
  public int getGapWidth()
  {
    return this.i.a(0).z();
  }
  
  public void setGapWidth(int value)
  {
    if ((value < 0) || (value > 500)) {
      throw new IllegalArgumentException("The GapWidth should be degree 0 to 500.");
    }
    this.i.a(0).c(value);
  }
  
  public int getGapDepth()
  {
    return this.V;
  }
  
  public void setGapDepth(int value)
  {
    if ((value < 0) || (value > 500)) {
      throw new IllegalArgumentException("The GapWidth should be degree 0 to 500.");
    }
    this.V = value;
  }
  
  public void calculate()
    throws Exception
  {
    a(true, false);
  }
  
  void c(boolean paramBoolean)
  {
    this.W = paramBoolean;
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    zjd localzjd = new zjd();
    if (paramBoolean1)
    {
      localzjd.a(this, paramBoolean1, paramBoolean2);
    }
    else if (!this.W)
    {
      localzjd.a(this, paramBoolean1, paramBoolean2);
      this.W = true;
    }
  }
  
  void a(Chart paramChart, CopyOptions paramCopyOptions)
    throws Exception
  {
    if (paramCopyOptions.i() != paramCopyOptions.j()) {
      paramChart.calculate();
    }
    this.c = paramChart.c;
    this.d = paramChart.d;
    this.B = paramChart.B;
    this.T = paramChart.T;
    this.q = paramChart.q;
    this.j.a(paramChart.j, paramCopyOptions);
    this.k.a(paramChart.k, paramCopyOptions);
    this.O.a(paramChart.O, paramCopyOptions);
    this.l.a(paramChart.l, paramCopyOptions);
    this.r = paramChart.r;
    if (paramChart.a != null)
    {
      this.a = new zqm();
      if (paramChart.a.e != null) {
        this.a.e = paramChart.a.e;
      }
      this.a.a = paramChart.a.a;
    }
    if (paramChart.i != null)
    {
      this.i.clear();
      Iterator localIterator = paramChart.i.iterator();
      while (localIterator.hasNext())
      {
        zka localzka1 = (zka)localIterator.next();
        zka localzka2 = new zka(this.i);
        localzka2.a(localzka1, paramCopyOptions);
        this.i.b(localzka2);
      }
    }
    if (paramChart.P != null) {
      getSeriesAxis().a(paramChart.P, paramCopyOptions);
    } else {
      this.P = null;
    }
    this.N.a(paramChart.N, paramCopyOptions);
    this.U = paramChart.U;
    this.S = paramChart.S;
    if (paramChart.Q != null)
    {
      if (this.Q == null) {
        this.Q = new Legend(this);
      }
      this.Q.a(paramChart.Q, paramCopyOptions);
    }
    this.J = paramChart.J;
    if (paramChart.R != null)
    {
      this.R = new ChartDataTable(this);
      this.R.a(paramChart.R, paramCopyOptions);
    }
    else
    {
      this.R = null;
    }
    if (paramChart.L != null)
    {
      if (this.L == null) {
        this.L = new Title(this);
      }
      this.L.a(paramChart.L, paramCopyOptions);
    }
    else
    {
      this.L = null;
    }
    this.M.a(paramChart.M, paramCopyOptions);
    this.K.a(paramChart.K, paramCopyOptions);
    this.ab = paramChart.ab;
    this.ag = paramChart.ag;
    this.aa = paramChart.aa;
    this.ad = paramChart.ad;
    this.ae = paramChart.ae;
    this.ac = paramChart.ac;
    this.m = paramChart.m;
    if (paramChart.Y != null)
    {
      this.Y = new Walls(this);
      this.Y.a(paramChart.Y, paramCopyOptions);
    }
    else
    {
      this.Y = null;
    }
    if (paramChart.X != null)
    {
      this.X = new Floor(this);
      this.X.a(paramChart.X, paramCopyOptions);
    }
    else
    {
      this.X = null;
    }
    this.A = paramChart.A;
    if ((paramChart.H != null) && (paramChart.H.getCount() != 0))
    {
      this.H = null;
      getShapes().a(paramChart.getShapes(), paramCopyOptions);
    }
    else
    {
      this.H = null;
    }
    this.p = null;
    if (paramChart.p != null) {
      getPageSetup().copy(paramChart.p, paramCopyOptions);
    }
    this.z = paramChart.z;
    this.y.a(paramChart.y);
    this.aj = paramChart.aj;
    this.ak = paramChart.ak;
    this.al = paramChart.al;
    this.an = paramChart.an;
    this.ao = paramChart.ao;
  }
  
  public Floor getFloor()
  {
    if ((ChartCollection.b(this.J)) && (this.X == null)) {
      this.X = new Floor(this);
    }
    return this.X;
  }
  
  Floor v()
  {
    if (this.X == null) {
      this.X = new Floor(this);
    }
    return this.X;
  }
  
  Floor w()
  {
    return this.X;
  }
  
  public Walls getWalls()
  {
    if ((ChartCollection.b(this.J)) && (this.Y == null)) {
      this.Y = new Walls(this);
    }
    return this.Y;
  }
  
  public Walls getBackWall()
  {
    if ((ChartCollection.b(this.J)) && (this.Y == null)) {
      this.Y = new Walls(this);
    }
    return this.Y;
  }
  
  public Walls getSideWall()
  {
    if ((ChartCollection.b(this.J)) && (this.Z == null)) {
      this.Z = new Walls(this);
    }
    return this.Z;
  }
  
  Walls x()
  {
    return this.Y;
  }
  
  Walls y()
  {
    return this.Y;
  }
  
  Walls z()
  {
    if (this.Y == null) {
      this.Y = new Walls(this);
    }
    return this.Y;
  }
  
  Walls A()
  {
    return this.Z;
  }
  
  Walls B()
  {
    if (this.Z == null) {
      this.Z = new Walls(this);
    }
    return this.Z;
  }
  
  Walls C()
  {
    if (this.Y == null) {
      this.Y = new Walls(this);
    }
    return this.Y;
  }
  
  public boolean getWallsAndGridlines2D()
  {
    if (!ChartCollection.b(this.J)) {
      this.aa = false;
    }
    return this.aa;
  }
  
  public void setWallsAndGridlines2D(boolean value)
  {
    if (ChartCollection.b(this.J)) {
      this.aa = value;
    }
  }
  
  public int getRotationAngle()
  {
    return this.ab;
  }
  
  public void setRotationAngle(int value)
  {
    if ((this.J == 11) || (this.J == 9) || (this.J == 10))
    {
      if ((value >= 0) && (value <= 44)) {
        this.ab = value;
      } else {
        throw new IllegalArgumentException();
      }
    }
    else if ((value >= 0) && (value <= 360)) {
      this.ab = value;
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  /**
   * @deprecated
   */
  public int getRotation()
  {
    return this.ab;
  }
  
  /**
   * @deprecated
   */
  public void setRotation(int value)
  {
    setRotationAngle(value);
  }
  
  public int getElevation()
  {
    return this.ac;
  }
  
  public void setElevation(int value)
  {
    if ((this.J == 11) || (this.J == 9) || (this.J == 10))
    {
      if ((value >= 0) && (value <= 44)) {
        this.ac = value;
      } else {
        throw new IllegalArgumentException();
      }
    }
    else if ((value >= -90) && (value <= 90)) {
      this.ac = value;
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public boolean getRightAngleAxes()
  {
    return this.ad;
  }
  
  public void setRightAngleAxes(boolean value)
  {
    this.ad = value;
  }
  
  public boolean getAutoScaling()
  {
    return this.ae;
  }
  
  public void setAutoScaling(boolean value)
  {
    this.ae = value;
  }
  
  public int getHeightPercent()
  {
    return this.m;
  }
  
  public void setHeightPercent(int value)
  {
    if ((value < 5) || (value > 500)) {
      throw new CellsException(0, "the height of a 3-D chart as a percentage of the chart width must be between 5 and 500.");
    }
    this.m = value;
  }
  
  public short getPerspective()
  {
    return this.af;
  }
  
  public void setPerspective(short value)
  {
    if ((this.af < 0) || (this.af > 100)) {
      throw new CellsException(0, "The perspective must be between 0 and 100.");
    }
    this.af = value;
  }
  
  public boolean getIs3D()
  {
    return ChartCollection.b(this.J);
  }
  
  boolean D()
  {
    switch (this.J)
    {
    case 76: 
    case 77: 
    case 78: 
    case 79: 
      return true;
    }
    return false;
  }
  
  public int getDepthPercent()
  {
    return this.ag;
  }
  
  public void setDepthPercent(int value)
  {
    if ((value >= 20) && (value <= 2000)) {
      this.ag = value;
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  za E()
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    ImageFormat localImageFormat = ImageFormat.getBmp();
    return a(localImageOrPrintOptions);
  }
  
  za a(ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    zkq localzkq = new zkq(paramImageOrPrintOptions);
    try
    {
      za localza = localzkq.a(this);
      return localza;
    }
    finally
    {
      if (localzkq != null) {
        localzkq.a();
      }
    }
  }
  
  public void toImage(String imageFile)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    ImageFormat localImageFormat = zbxz.a(zk.d(imageFile), null);
    localImageOrPrintOptions.setImageFormat(localImageFormat);
    toImage(imageFile, localImageOrPrintOptions);
  }
  
  public void toImage(String imageFile, ImageFormat imageFormat)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(imageFormat);
    toImage(imageFile, localImageOrPrintOptions);
  }
  
  public void toImage(String imageFile, long jpegQuality)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(ImageFormat.getJpeg());
    localImageOrPrintOptions.setQuality((int)jpegQuality);
    toImage(imageFile, localImageOrPrintOptions);
  }
  
  void a(zm paramzm, long paramLong)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(ImageFormat.getJpeg());
    localImageOrPrintOptions.setQuality((int)paramLong);
    a(paramzm, localImageOrPrintOptions);
  }
  
  void a(zm paramzm, ImageFormat paramImageFormat)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    localImageOrPrintOptions.setImageFormat(paramImageFormat);
    a(paramzm, localImageOrPrintOptions);
  }
  
  /* Error */
  public void toPdf(String fileName)
    throws Exception
  {
    // Byte code:
    //   0: new 77	com/aspose/cells/b/a/d/ze
    //   3: dup
    //   4: aload_1
    //   5: iconst_2
    //   6: invokespecial 488	com/aspose/cells/b/a/d/ze:<init>	(Ljava/lang/String;I)V
    //   9: astore_2
    //   10: aload_0
    //   11: aload_2
    //   12: invokevirtual 251	com/aspose/cells/Chart:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   15: aload_2
    //   16: ifnull +21 -> 37
    //   19: aload_2
    //   20: invokevirtual 489	com/aspose/cells/b/a/d/ze:a	()V
    //   23: goto +14 -> 37
    //   26: astore_3
    //   27: aload_2
    //   28: ifnull +7 -> 35
    //   31: aload_2
    //   32: invokevirtual 489	com/aspose/cells/b/a/d/ze:a	()V
    //   35: aload_3
    //   36: athrow
    //   37: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	Chart
    //   0	38	1	fileName	String
    //   9	23	2	localze	ze
    //   26	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	15	26	finally
  }
  
  /* Error */
  public void toPdf(OutputStream stream)
    throws Exception
  {
    // Byte code:
    //   0: new 78	com/aspose/cells/b/a/d/zh
    //   3: dup
    //   4: invokespecial 490	com/aspose/cells/b/a/d/zh:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: invokevirtual 251	com/aspose/cells/Chart:a	(Lcom/aspose/cells/b/a/d/zm;)V
    //   13: aload_2
    //   14: lconst_0
    //   15: iconst_0
    //   16: invokevirtual 492	com/aspose/cells/b/a/d/zh:a	(JI)J
    //   19: pop2
    //   20: aload_2
    //   21: aload_1
    //   22: invokevirtual 493	com/aspose/cells/b/a/d/zh:a	(Ljava/io/OutputStream;)V
    //   25: aload_2
    //   26: ifnull +21 -> 47
    //   29: aload_2
    //   30: invokevirtual 491	com/aspose/cells/b/a/d/zh:a	()V
    //   33: goto +14 -> 47
    //   36: astore_3
    //   37: aload_2
    //   38: ifnull +7 -> 45
    //   41: aload_2
    //   42: invokevirtual 491	com/aspose/cells/b/a/d/zh:a	()V
    //   45: aload_3
    //   46: athrow
    //   47: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	Chart
    //   0	48	1	stream	OutputStream
    //   7	35	2	localzh	zh
    //   36	10	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	25	36	finally
  }
  
  void a(zm paramzm)
    throws Exception
  {
    zbmq localzbmq = new zbmq(this.s);
    PdfSaveOptions localPdfSaveOptions = new PdfSaveOptions();
    this.n = true;
    localzbmq.a(paramzm, localPdfSaveOptions);
    this.n = false;
  }
  
  public void toImage(String imageFile, ImageOrPrintOptions options)
    throws Exception
  {
    ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
    if (options != null) {
      localImageOrPrintOptions.a(options);
    }
    String str = zk.d(imageFile);
    str = str.toLowerCase();
    if (".svg".equals(str))
    {
      localImageOrPrintOptions.setSaveFormat(22);
    }
    else if (".xps".equals(str))
    {
      localImageOrPrintOptions.setSaveFormat(20);
    }
    else
    {
      localObject1 = zbxz.a(str, localImageOrPrintOptions.getImageFormat());
      localImageOrPrintOptions.setImageFormat((ImageFormat)localObject1);
    }
    Object localObject1 = new ze(imageFile, 2);
    try
    {
      a((zm)localObject1, localImageOrPrintOptions);
    }
    finally
    {
      if (localObject1 != null) {
        ((ze)localObject1).a();
      }
    }
  }
  
  public void toImage(OutputStream stream, ImageOrPrintOptions options)
    throws Exception
  {
    zh localzh = new zh();
    try
    {
      a(localzh, options);
      localzh.a(0L, 0);
      localzh.a(stream);
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
  }
  
  void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions)
    throws Exception
  {
    if (paramImageOrPrintOptions == null) {
      paramImageOrPrintOptions = new ImageOrPrintOptions();
    }
    Object localObject1;
    if ((paramImageOrPrintOptions.getSaveFormat() == 22) || (paramImageOrPrintOptions.getSaveFormat() == 20))
    {
      localObject1 = F();
      zs localzs = getActualChartSize();
      zbxz.a(paramzm, (zn)localObject1, paramImageOrPrintOptions, localzs.b(), localzs.c());
    }
    else
    {
      localObject1 = new zkq(paramImageOrPrintOptions);
      try
      {
        ((zkq)localObject1).a(paramzm, this);
      }
      finally
      {
        if (localObject1 != null) {
          ((zkq)localObject1).a();
        }
      }
    }
  }
  
  zb F()
    throws Exception
  {
    zkq localzkq = new zkq(null);
    try
    {
      zb localzb = localzkq.b(this);
      return localzb;
    }
    finally
    {
      if (localzkq != null) {
        localzkq.a();
      }
    }
  }
  
  public zs getActualChartSize()
  {
    double d1 = 0.0D;
    if (getChartArea().getBorder().isVisible())
    {
      d1 = getChartArea().getBorder().getWeightPt();
      if ((!getChartArea().getBorder().k()) && (getChartArea().getBorder().getFormattingType() == 0)) {
        d1 = 0.75D;
      } else if (d1 < 0.25D) {
        d1 = 0.25D;
      }
    }
    int i1 = (int)Math.ceil(zbxz.d(d1));
    return new zs(getChartObject().getWidth() + i1, getChartObject().getHeight() + i1);
  }
  
  ArrayList G()
  {
    if (this.ah == null) {
      this.ah = new ArrayList();
    }
    return this.ah;
  }
  
  void a(Font paramFont, ArrayList paramArrayList)
  {
    if (paramFont.d()) {
      b(paramFont, paramArrayList);
    } else {
      c(paramFont, paramArrayList);
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    if (n().p().h()) {
      return;
    }
    this.ai = new ArrayList();
    if (this.ah == null) {
      this.ah = new ArrayList();
    }
    c(paramArrayList);
    this.ai = null;
    if (this.H != null) {
      this.H.b();
    }
  }
  
  void b(Font paramFont, ArrayList paramArrayList)
  {
    zbm localzbm1 = paramFont.c();
    if (localzbm1 == null) {
      return;
    }
    Object localObject = this.ah.iterator();
    while (((Iterator)localObject).hasNext())
    {
      zbm localzbm2 = (zbm)((Iterator)localObject).next();
      if (localzbm2.a(localzbm1, paramFont))
      {
        paramFont.d(localzbm2.d);
        localzbm1.d = paramFont.m();
        return;
      }
    }
    zf.a(paramArrayList, paramFont);
    paramFont.d(paramArrayList.size());
    localObject = paramFont.c();
    zf.a(this.ah, localObject);
    ((zbm)localObject).d = paramFont.m();
  }
  
  int a(Font paramFont, ArrayList paramArrayList, int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    int i1 = 0;
    for (i1 = paramInt; i1 < paramArrayList.size(); i1++)
    {
      Font localFont = (Font)paramArrayList.get(i1);
      if (((!paramFont.d()) || (!localFont.d()) || (paramFont.c() != localFont.c())) && (paramFont.a(localFont)))
      {
        paramFont.d(localFont.m());
        return i1;
      }
    }
    zf.a(paramArrayList, paramFont);
    paramFont.d(paramArrayList.size());
    paramArrayOfBoolean[0] = true;
    return i1;
  }
  
  void c(Font paramFont, ArrayList paramArrayList)
  {
    Iterator localIterator1 = this.ai.iterator();
    while (localIterator1.hasNext())
    {
      Font localFont = (Font)localIterator1.next();
      if (localFont.a(paramFont))
      {
        paramFont.d(localFont.m());
        return;
      }
    }
    int i1 = -1;
    int i2 = 0;
    for (int i3 = 0;; i3 = 0)
    {
      boolean[] arrayOfBoolean = { i2 };
      i1 = a(paramFont, paramArrayList, i1 + 1, arrayOfBoolean);
      i2 = arrayOfBoolean[0];
      if (i2 != 0)
      {
        zf.a(this.ai, paramFont);
        break;
      }
      Iterator localIterator2 = this.ah.iterator();
      while (localIterator2.hasNext())
      {
        zbm localzbm = (zbm)localIterator2.next();
        if (localzbm.d == paramFont.m())
        {
          i3 = 1;
          break;
        }
      }
      if (i3 == 0)
      {
        zf.a(this.ai, paramFont);
        return;
      }
    }
  }
  
  zbm e(int paramInt)
  {
    if (this.ah == null) {
      return null;
    }
    Iterator localIterator = this.ah.iterator();
    while (localIterator.hasNext())
    {
      zbm localzbm = (zbm)localIterator.next();
      if (localzbm.d == paramInt) {
        return localzbm;
      }
    }
    return null;
  }
  
  void b(ArrayList paramArrayList)
  {
    if ((this.F.p().f() == 1) && (this.N.j() == null)) {
      return;
    }
    Font localFont1 = this.N.j();
    if ((localFont1 != null) || (this.N.l() == -1) || (this.N.a() == -1)) {
      if (this.N.getAutoScaleFont())
      {
        Font localFont2;
        zbm localzbm;
        if (this.N.l() == -1)
        {
          localFont2 = this.N.getFont();
          localzbm = localFont2.c();
          localzbm.c = 0;
          b(localFont2, paramArrayList);
          this.N.c(localFont2.m());
        }
        if (this.N.a() == -1)
        {
          localFont2 = this.N.getFont();
          localzbm = new zbm(this, 0, false);
          localzbm.a(localFont2.c());
          localzbm.c = 1;
          Font localFont3 = new Font(n(), localzbm, true);
          localFont3.a(localFont2, null);
          localFont3.a(localzbm);
          b(localFont3, paramArrayList);
          this.N.a(localFont3.m());
        }
      }
      else if (localFont1 != null)
      {
        a(localFont1, paramArrayList);
        this.N.c(localFont1.m());
      }
    }
  }
  
  void c(ArrayList paramArrayList)
  {
    b(paramArrayList);
    if ((this.U) && (this.R != null) && (this.R.a() != null)) {
      a(this.R.a(), paramArrayList);
    }
    a(this.L, paramArrayList);
    Object localObject;
    if (this.Q != null)
    {
      a(this.Q, paramArrayList);
      if ((this.S) && (this.Q.F() != null))
      {
        LegendEntryCollection localLegendEntryCollection = this.Q.getLegendEntries();
        for (int i2 = 0; i2 < localLegendEntryCollection.getCount(); i2++)
        {
          localObject = localLegendEntryCollection.b(i2);
          if ((localObject != null) && (((LegendEntry)localObject).a() != null)) {
            a(((LegendEntry)localObject).a(), paramArrayList);
          }
        }
      }
    }
    a(this.j, paramArrayList);
    a(this.k, paramArrayList);
    a(this.l, paramArrayList);
    a(getSecondCategoryAxis(), paramArrayList);
    a(this.k, getSecondValueAxis(), paramArrayList);
    if (s() != null) {
      a(s(), paramArrayList);
    }
    for (int i1 = 0; i1 < this.K.getCount(); i1++)
    {
      Series localSeries = this.K.get(i1);
      a(localSeries.r(), paramArrayList);
      if (localSeries.c() != null)
      {
        localObject = localSeries.getPoints();
        for (int i4 = 0; i4 < ((ChartPointCollection)localObject).a(); i4++) {
          a(((ChartPointCollection)localObject).c(i4).j(), paramArrayList);
        }
      }
      if ((localSeries.q() != null) && (localSeries.getTrendLines().getCount() != 0)) {
        for (int i3 = 0; i3 < localSeries.getTrendLines().getCount(); i3++)
        {
          Trendline localTrendline = localSeries.getTrendLines().get(i3);
          a(localTrendline.b(), paramArrayList);
        }
      }
    }
  }
  
  void a(Title paramTitle, ArrayList paramArrayList)
  {
    if (paramTitle != null)
    {
      Font localFont = paramTitle.i();
      if (localFont != null)
      {
        a(localFont, paramArrayList);
        paramTitle.c(localFont.m());
      }
      if (paramTitle.E() != null)
      {
        Iterator localIterator = paramTitle.E().iterator();
        while (localIterator.hasNext())
        {
          FontSetting localFontSetting = (FontSetting)localIterator.next();
          if (localFontSetting.h() != null) {
            a(localFontSetting.h(), paramArrayList);
          }
        }
      }
    }
  }
  
  void a(ChartFrame paramChartFrame, ArrayList paramArrayList)
  {
    if (paramChartFrame == null) {
      return;
    }
    Font localFont = paramChartFrame.i();
    if (localFont != null)
    {
      a(localFont, paramArrayList);
      paramChartFrame.c(localFont.m());
    }
  }
  
  void a(DataLabels paramDataLabels, ArrayList paramArrayList)
  {
    if (paramDataLabels == null) {
      return;
    }
    Font localFont = paramDataLabels.i();
    if (localFont != null)
    {
      a(localFont, paramArrayList);
      paramDataLabels.c(localFont.m());
    }
    if (paramDataLabels.E() != null)
    {
      Iterator localIterator = paramDataLabels.E().iterator();
      while (localIterator.hasNext())
      {
        FontSetting localFontSetting = (FontSetting)localIterator.next();
        if (localFontSetting.h() != null) {
          a(localFontSetting.h(), paramArrayList);
        }
      }
    }
  }
  
  void a(Axis paramAxis, ArrayList paramArrayList)
  {
    if (paramAxis == null) {
      return;
    }
    if ((paramAxis.k() != null) && (paramAxis.getTickLabels().a() != null))
    {
      a(paramAxis.getTickLabels().getFont(), paramArrayList);
      paramAxis.getTickLabels().a(paramAxis.getTickLabels().getFont().m());
    }
    if ((paramAxis.m() != null) && (paramAxis.m().j() != null))
    {
      a(paramAxis.getDisplayUnitLabel().getFont(), paramArrayList);
      paramAxis.getDisplayUnitLabel().c(paramAxis.getDisplayUnitLabel().getFont().m());
    }
    a(paramAxis.n(), paramArrayList);
  }
  
  void a(Axis paramAxis1, Axis paramAxis2, ArrayList paramArrayList)
  {
    int i1 = (paramAxis1.b() == 1) && (paramAxis1.getDisplayUnit() != 0) && (paramAxis1.isDisplayUnitLabelShown()) ? 1 : 0;
    Font localFont = null;
    if (i1 != 0)
    {
      localFont = paramAxis1.getDisplayUnitLabel().getFont();
      a(localFont, paramArrayList);
      if (paramAxis1.getDisplayUnitLabel().getAutoScaleFont()) {
        localFont.c().d = localFont.m();
      }
      paramAxis1.getDisplayUnitLabel().c(localFont.m());
    }
    i1 = (paramAxis2.b() == 1) && (paramAxis2.getDisplayUnit() != 0) && (paramAxis2.isDisplayUnitLabelShown()) ? 1 : 0;
    if (i1 != 0)
    {
      localFont = paramAxis2.getDisplayUnitLabel().getFont();
      a(localFont, paramArrayList);
      if (paramAxis2.getDisplayUnitLabel().getAutoScaleFont()) {
        localFont.c().d = localFont.m();
      }
      paramAxis2.getDisplayUnitLabel().c(localFont.m());
    }
  }
  
  void H()
  {
    TickLabels localTickLabels = this.j.k();
    if ((localTickLabels != null) && (localTickLabels.getNumberFormat() != null) && (!localTickLabels.getNumberFormatLinked())) {
      localTickLabels.c(this.F.d(localTickLabels.getNumberFormat()));
    }
    localTickLabels = this.k.k();
    if ((localTickLabels != null) && (localTickLabels.getNumberFormat() != null) && (!localTickLabels.getNumberFormatLinked())) {
      localTickLabels.c(this.F.d(localTickLabels.getNumberFormat()));
    }
    localTickLabels = getSecondValueAxis().k();
    if ((localTickLabels != null) && (localTickLabels.getNumberFormat() != null) && (!localTickLabels.getNumberFormatLinked())) {
      localTickLabels.c(this.F.d(localTickLabels.getNumberFormat()));
    }
    if (s() != null)
    {
      localTickLabels = s().k();
      if ((localTickLabels != null) && (localTickLabels.getNumberFormat() != null) && (!localTickLabels.getNumberFormatLinked())) {
        localTickLabels.c(this.F.d(localTickLabels.getNumberFormat()));
      }
    }
    localTickLabels = getSecondCategoryAxis().k();
    if ((localTickLabels != null) && (localTickLabels.getNumberFormat() != null) && (!localTickLabels.getNumberFormatLinked())) {
      localTickLabels.c(this.F.d(localTickLabels.getNumberFormat()));
    }
    Iterator localIterator1 = this.K.iterator();
    while (localIterator1.hasNext())
    {
      Series localSeries = (Series)localIterator1.next();
      DataLabels localDataLabels = null;
      if (localSeries.c() != null)
      {
        ArrayList localArrayList = localSeries.c().a;
        Iterator localIterator2 = localArrayList.iterator();
        while (localIterator2.hasNext())
        {
          ChartPoint localChartPoint = (ChartPoint)localIterator2.next();
          if ((localChartPoint.j() != null) && (localChartPoint.j().W()))
          {
            localDataLabels = localChartPoint.j();
            if ((!localDataLabels.getNumberFormatLinked()) && (localDataLabels.getNumberFormat() != null)) {
              localDataLabels.a(this.F.d(localDataLabels.getNumberFormat()));
            }
          }
        }
      }
      localDataLabels = localSeries.r();
      if ((localDataLabels != null) && (localDataLabels.W())) {
        if ((!localDataLabels.getNumberFormatLinked()) && (localDataLabels.getNumberFormat() != null)) {
          localDataLabels.a(this.F.d(localDataLabels.getNumberFormat()));
        }
      }
    }
  }
  
  public int getPlacement()
  {
    return getChartObject().getPlacement();
  }
  
  public void setPlacement(int value)
  {
    getChartObject().setPlacement(value);
  }
  
  public PageSetup getPageSetup()
  {
    if (this.p == null)
    {
      this.p = new PageSetup(this.G, this);
      this.p.b();
    }
    return this.p;
  }
  
  double I()
  {
    return this.aj;
  }
  
  void a(double paramDouble)
  {
    this.aj = paramDouble;
  }
  
  double J()
  {
    return this.ak;
  }
  
  void b(double paramDouble)
  {
    this.ak = paramDouble;
  }
  
  void K()
  {
    if ((p() != null) && (p().getCount() > 0)) {
      getShapes().m();
    }
    Title localTitle = r();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.g();
    }
    localTitle = this.j.n();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.g();
    }
    localTitle = this.k.n();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.g();
    }
    for (int i1 = 0; i1 < this.K.getCount(); i1++)
    {
      Series localSeries = this.K.get(i1);
      Object localObject1 = localSeries.l();
      Object localObject2;
      if ((localObject1 != null) && ((localObject1 instanceof byte[])))
      {
        localObject2 = (byte[])localObject1;
        localSeries.a(zcv.a((byte[])localObject2, -1, 0, 0, false, null));
      }
      if (localSeries.o() != null) {
        localSeries.o().g();
      }
      if (localSeries.m() != null) {
        localSeries.m().g();
      }
      if (localSeries.p() != null) {
        localSeries.p().g();
      }
      if (localSeries.y() != null)
      {
        localObject2 = localSeries.y();
        if (((ErrorBar)localObject2).c() != null) {
          ((ErrorBar)localObject2).c().g();
        }
        if (((ErrorBar)localObject2).b() != null) {
          ((ErrorBar)localObject2).b().g();
        }
      }
      if (localSeries.z() != null)
      {
        localObject2 = localSeries.z();
        if (((ErrorBar)localObject2).c() != null) {
          ((ErrorBar)localObject2).c().g();
        }
        if (((ErrorBar)localObject2).b() != null) {
          ((ErrorBar)localObject2).b().g();
        }
      }
      if ((localSeries.r() != null) && (localSeries.getDataLabels().i != null)) {
        localSeries.getDataLabels().i.g();
      }
      if (localSeries.c() != null)
      {
        localObject2 = localSeries.c().a;
        for (int i2 = 0; i2 < ((ArrayList)localObject2).size(); i2++)
        {
          ChartPoint localChartPoint = (ChartPoint)((ArrayList)localObject2).get(i2);
          if (localChartPoint.j() != null)
          {
            DataLabels localDataLabels = localChartPoint.j();
            if (localDataLabels.i != null) {
              localDataLabels.i.g();
            }
          }
        }
      }
    }
  }
  
  void a(zcw paramzcw)
  {
    if ((p() != null) && (p().getCount() > 0)) {
      getShapes().a(paramzcw);
    }
    Title localTitle = r();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.f();
    }
    localTitle = this.j.n();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.f();
    }
    localTitle = this.k.n();
    if ((localTitle != null) && (localTitle.i != null)) {
      localTitle.i.f();
    }
    for (int i1 = 0; i1 < this.K.getCount(); i1++)
    {
      Series localSeries = this.K.get(i1);
      Object localObject1 = localSeries.l();
      Object localObject2;
      if ((localObject1 != null) && ((localObject1 instanceof byte[])))
      {
        localObject2 = (byte[])localObject1;
        localSeries.a(paramzcw.a((byte[])localObject2, -1));
      }
      if (localSeries.o() != null) {
        localSeries.o().f();
      }
      if (localSeries.m() != null) {
        localSeries.m().f();
      }
      if (localSeries.p() != null) {
        localSeries.p().f();
      }
      if (localSeries.y() != null)
      {
        localObject2 = localSeries.y();
        if (((ErrorBar)localObject2).c() != null) {
          ((ErrorBar)localObject2).c().f();
        }
        if (((ErrorBar)localObject2).b() != null) {
          ((ErrorBar)localObject2).b().f();
        }
      }
      if (localSeries.z() != null)
      {
        localObject2 = localSeries.z();
        if (((ErrorBar)localObject2).c() != null) {
          ((ErrorBar)localObject2).c().f();
        }
        if (((ErrorBar)localObject2).b() != null) {
          ((ErrorBar)localObject2).b().f();
        }
      }
      if ((localSeries.r() != null) && (localSeries.getDataLabels().i != null)) {
        localSeries.getDataLabels().i.f();
      }
      if (localSeries.c() != null)
      {
        localObject2 = localSeries.c().a;
        for (int i2 = 0; i2 < ((ArrayList)localObject2).size(); i2++)
        {
          ChartPoint localChartPoint = (ChartPoint)((ArrayList)localObject2).get(i2);
          if (localChartPoint.j() != null)
          {
            DataLabels localDataLabels = localChartPoint.j();
            if (localDataLabels.i != null) {
              localDataLabels.i.f();
            }
          }
        }
      }
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    if (this.p == null)
    {
      paramzrg.a(20);
      paramzrg.a(21);
      paramzrg.a(131203);
      paramzrg.c(0);
      paramzrg.a(131204);
      paramzrg.c(0);
      return;
    }
    if ((this.p.j() != null) && (this.p.j().getCount() != 0))
    {
      localObject1 = new zbbe();
      ((zbbe)localObject1).a(this.p.j());
      ((zbbe)localObject1).c(paramzrg);
    }
    Object localObject1 = new zags(true);
    ((zags)localObject1).a(this.p.f);
    ((zags)localObject1).a(paramzrg);
    zags localzags = new zags(false);
    localzags.a(this.p.e);
    localzags.a(paramzrg);
    paramzrg.c(131);
    paramzrg.c(2);
    if (this.p.getCenterHorizontally()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    paramzrg.c(132);
    paramzrg.c(2);
    if (this.p.getCenterVertically()) {
      paramzrg.c(1);
    } else {
      paramzrg.c(0);
    }
    if (this.p.getLeftMargin() >= 0.0D)
    {
      paramzrg.c(38);
      paramzrg.c(8);
      paramzrg.a(this.p.getLeftMarginInch());
    }
    if (this.p.getRightMargin() >= 0.0D)
    {
      paramzrg.c(39);
      paramzrg.c(8);
      paramzrg.a(this.p.getRightMarginInch());
    }
    if (this.p.getTopMargin() >= 0.0D)
    {
      paramzrg.c(40);
      paramzrg.c(8);
      paramzrg.a(this.p.getTopMarginInch());
    }
    if (this.p.getBottomMargin() >= 0.0D)
    {
      paramzrg.c(41);
      paramzrg.c(8);
      paramzrg.a(this.p.getBottomMarginInch());
    }
    if (this.p.getPrinterSettings() != null)
    {
      localObject2 = new zauq();
      ((zauq)localObject2).a(this.p.getPrinterSettings());
      ((zauq)localObject2).a(paramzrg);
    }
    Object localObject2 = new zbfl();
    ((zbfl)localObject2).b(this.p.d());
    ((zbfl)localObject2).a(paramzrg);
  }
  
  /**
   * @deprecated
   */
  public ChartShape getChartShape()
  {
    return getChartObject();
  }
  
  int L()
  {
    return this.al;
  }
  
  void f(int paramInt)
  {
    this.al = paramInt;
  }
  
  zbpa M()
  {
    return this.am;
  }
  
  void a(zbpa paramzbpa)
  {
    this.am = paramzbpa;
  }
  
  public boolean hasAxis(int aixsType, boolean isPrimary)
  {
    int i1 = 0;
    int i2 = 0;
    boolean bool = false;
    int i3 = 0;
    for (int i4 = 0; i4 < this.i.getCount(); i4++)
    {
      zka localzka = this.i.a(i4);
      if (!ChartCollection.d(localzka.j())) {
        i1 = 1;
      } else {
        i2 = 1;
      }
      if (localzka.m()) {
        i3 = 1;
      }
      if (!bool) {
        bool = ChartCollection.f(localzka.j());
      }
    }
    if ((i1 == 0) && (i2 == 0)) {
      return false;
    }
    if ((aixsType == 0) || (aixsType == 1))
    {
      if (isPrimary)
      {
        if ((i2 == 0) && (i1 != 0)) {
          return false;
        }
        if (aixsType == 0) {
          return this.j.isVisible();
        }
        return this.k.isVisible();
      }
      if ((i3 != 0) && (i1 == 0))
      {
        if (aixsType == 0) {
          return getSecondCategoryAxis().isVisible();
        }
        return getSecondValueAxis().isVisible();
      }
      return false;
    }
    if (bool) {
      return getSeriesAxis().isVisible();
    }
    return false;
  }
  
  boolean N()
  {
    return this.an;
  }
  
  public void setChartDataRange(String area, boolean isVertical)
  {
    this.K.clear();
    this.K.a(area, isVertical, true);
  }
  
  zrs O()
  {
    if (this.ao == null) {
      return getWorksheet().d().d();
    }
    return this.ao;
  }
  
  void a(zrs paramzrs)
  {
    this.ao = paramzrs;
  }
  
  void a(Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    for (int i1 = 0; i1 < this.K.getCount(); i1++)
    {
      Series localSeries = this.K.get(i1);
      Object localObject = localSeries.l();
      a(localSeries.m(), paramWorksheet, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
      a(localSeries.o(), paramWorksheet, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    }
  }
  
  private void a(zjk paramzjk, Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramzjk == null) {
      return;
    }
    Range localRange = paramzjk.i();
    if ((localRange == null) || (localRange.getWorksheet() != paramWorksheet)) {
      return;
    }
    CellArea localCellArea = localRange.a();
    int i1 = localCellArea.StartRow;
    int i2 = localCellArea.EndRow;
    if ((i1 == paramInt2) && (i2 == paramInt4))
    {
      int i3 = localCellArea.StartColumn;
      int i4 = localCellArea.EndColumn;
      if (i3 == i4) {
        zaaq.a(paramWorksheet, false, paramInt2 + 1, paramInt6, 0, 0, -1, -1, paramzjk.c);
      }
    }
  }
  
  public Line getLine()
  {
    if (this.ap == null) {
      this.ap = new Line(this, this);
    }
    return this.ap;
  }
  
  zji P()
  {
    if (this.aq == null) {
      this.aq = new zji();
    }
    return this.aq;
  }
  
  zkm Q()
  {
    if (this.ar == null) {
      this.ar = new zkm(this);
    }
    return this.ar;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator = getNSeries().iterator();
    while (localIterator.hasNext())
    {
      Series localSeries = (Series)localIterator.next();
      Object localObject = localSeries.l();
      if ((localObject != null) && ((localObject instanceof byte[])))
      {
        arrayOfByte = (byte[])localObject;
        localSeries.a(zaaq.a(arrayOfByte, 0, -1, this.F, paramInt1, paramInt2, 0, 0));
      }
      if ((localSeries.m() != null) && (localSeries.m().c != null))
      {
        arrayOfByte = localSeries.m().c;
        localSeries.m().c = zaaq.a(arrayOfByte, 0, -1, this.F, paramInt1, paramInt2, 0, 0);
      }
      if ((localSeries.o() != null) && (localSeries.o().c != null))
      {
        arrayOfByte = localSeries.o().c;
        localSeries.o().c = zaaq.a(arrayOfByte, 0, -1, this.F, paramInt1, paramInt2, 0, 0);
      }
      if ((localSeries.p() != null) && (localSeries.p().c != null))
      {
        arrayOfByte = localSeries.p().c;
        localSeries.p().c = zaaq.a(arrayOfByte, 0, -1, this.F, paramInt1, paramInt2, 0, 0);
      }
    }
  }
  
  boolean g(int paramInt)
  {
    ShapeCollection localShapeCollection = p();
    if ((localShapeCollection != null) && (localShapeCollection.h(paramInt))) {
      return true;
    }
    return a(paramInt, this.N);
  }
  
  void h(int paramInt)
  {
    ShapeCollection localShapeCollection = p();
    if (localShapeCollection != null) {
      localShapeCollection.j(paramInt);
    }
    b(paramInt, this.N);
  }
  
  private boolean a(int paramInt, ChartFrame paramChartFrame)
  {
    if ((paramChartFrame == null) || (paramChartFrame.h() == null)) {
      return false;
    }
    FillFormat localFillFormat = paramChartFrame.h().i();
    if (localFillFormat == null) {
      return false;
    }
    if (localFillFormat.getFillType() == 4)
    {
      TextureFill localTextureFill = localFillFormat.getTextureFill();
      if (localTextureFill.c + 1 == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  private void b(int paramInt, ChartFrame paramChartFrame)
  {
    if ((paramChartFrame == null) || (paramChartFrame.h() == null)) {
      return;
    }
    FillFormat localFillFormat = paramChartFrame.h().i();
    if (localFillFormat == null) {
      return;
    }
    if (localFillFormat.getFillType() == 4)
    {
      TextureFill localTextureFill = localFillFormat.getTextureFill();
      if ((localTextureFill.c != -1) && (localTextureFill.c + 1 >= paramInt)) {
        localTextureFill.c -= 1;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Chart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */