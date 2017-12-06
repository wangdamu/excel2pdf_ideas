package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zj;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class Worksheet
  implements zj
{
  private int u = 1;
  private String v;
  private Cells w;
  private PaneCollection x;
  private Protection y;
  private WorksheetCollection z;
  QueryTableCollection a;
  PivotTableCollection b;
  int c = 1;
  private int A = 182;
  ListObjectCollection d;
  private zbvn B = null;
  int e;
  int f;
  HyperlinkCollection g;
  private AutoFilter C;
  boolean h = false;
  short i;
  private byte D;
  private ArrayList E;
  private zbql F;
  DataSorter j;
  zqv k = null;
  private zbew G;
  private SparklineGroupCollection H;
  private ChartCollection I;
  private CommentCollection J;
  private PictureCollection K;
  private TextBoxCollection L;
  private CheckBoxCollection M;
  private OleObjectCollection N;
  ShapeCollection l;
  private zbpr O;
  private ValidationCollection P;
  private ProtectedRangeCollection Q;
  ErrorCheckOptionCollection m;
  private Outline R;
  private int S;
  private int T;
  int n = 0;
  private int[] U = { 100, 60, 100 };
  private boolean V = true;
  zaml o;
  private int W = 64;
  String p;
  double[] q;
  private ArrayList X;
  private byte[] Y;
  ConditionalFormattingCollection r;
  private ArrayList Z;
  private CustomPropertyCollection aa;
  private SmartTagSetting ab;
  zoi s;
  ScenarioCollection t;
  
  public void dispose()
  {
    this.C = null;
    if (this.w != null) {
      this.w.dispose();
    }
    this.w = null;
    this.r = null;
    this.g = null;
    this.Q = null;
    this.Y = null;
    this.p = null;
    this.aa = null;
    this.s = null;
    this.q = null;
    this.m = null;
    this.d = null;
    this.R = null;
    this.y = null;
    this.X = null;
    this.t = null;
    this.ab = null;
    this.P = null;
    this.U = null;
    this.k = null;
    this.x = null;
    this.b = null;
    this.E = null;
    this.a = null;
    this.G = null;
    this.z = null;
    this.F = null;
    this.o = null;
    this.Z = null;
    this.I = null;
    this.J = null;
    this.M = null;
    this.N = null;
    this.l = null;
    this.H = null;
    this.L = null;
    this.K = null;
    this.O = null;
    zg.a(this);
  }
  
  public Protection getProtection()
  {
    if (this.y == null) {
      this.y = new Protection();
    }
    return this.y;
  }
  
  Protection a()
  {
    return this.y;
  }
  
  PaneCollection b()
  {
    if (this.x == null) {
      this.x = new PaneCollection(this);
    }
    return this.x;
  }
  
  public PaneCollection getPanes()
  {
    return this.x;
  }
  
  Worksheet(WorksheetCollection sheets)
  {
    this.z = sheets;
    this.f = sheets.getCount();
    sheets.c += 1;
    this.e = sheets.c;
    this.I = new ChartCollection(this);
    this.J = new CommentCollection(this);
    this.i = 1217;
    this.g = new HyperlinkCollection(this);
    this.w = new Cells(this);
    this.P = new ValidationCollection(this);
    this.Q = new ProtectedRangeCollection(this);
    this.R = new Outline();
    this.v = "";
    this.o = new zaml(false);
    this.o.b(true);
  }
  
  Worksheet(WorksheetCollection sheets, String sheetName)
  {
    this.z = sheets;
    this.f = sheets.getCount();
    sheets.c += 1;
    this.e = sheets.c;
    this.I = new ChartCollection(this);
    this.J = new CommentCollection(this);
    this.i = 1217;
    this.g = new HyperlinkCollection(this);
    this.w = new Cells(this);
    this.P = new ValidationCollection(this);
    this.Q = new ProtectedRangeCollection(this);
    this.R = new Outline();
    this.v = sheetName;
    this.o = new zaml(false);
    this.o.b(true);
  }
  
  WorksheetCollection c()
  {
    return this.z;
  }
  
  Workbook d()
  {
    return this.z.p();
  }
  
  public Workbook getWorkbook()
  {
    return this.z.p();
  }
  
  public Cells getCells()
  {
    return this.w;
  }
  
  public QueryTableCollection getQueryTables()
  {
    if (this.a == null) {
      this.a = new QueryTableCollection();
    }
    return this.a;
  }
  
  public PivotTableCollection getPivotTables()
  {
    if (this.b == null) {
      this.b = new PivotTableCollection(this);
    }
    return this.b;
  }
  
  PivotTableCollection e()
  {
    return this.b;
  }
  
  int f()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  void g()
  {
    this.w.j();
    if ((this.J != null) && (this.J.getCount() > 0))
    {
      Comment localComment = null;
      for (int i3 = this.J.getCount() - 1; i3 >= 0; i3--)
      {
        localComment = this.J.get(i3);
        if ((localComment.getRow() > 65535) || (localComment.getColumn() > 255)) {
          getShapes().b(localComment.getCommentShape());
        }
      }
    }
    if ((this.g != null) && (this.g.getCount() > 0)) {
      for (int i1 = this.g.getCount() - 1; i1 >= 0; i1--)
      {
        CellArea localCellArea2 = this.g.get(i1).getArea();
        if ((localCellArea2.StartRow > 65535) || (localCellArea2.StartColumn > 255))
        {
          this.g.removeAt(i1);
        }
        else if (localCellArea2.EndRow > 65535)
        {
          localCellArea2.EndRow = 65535;
          if (localCellArea2.EndColumn > 255) {
            localCellArea2.EndColumn = 255;
          }
          this.g.get(i1).a(localCellArea2);
        }
        else if (localCellArea2.EndColumn > 255)
        {
          localCellArea2.EndColumn = 255;
          this.g.get(i1).a(localCellArea2);
        }
      }
    }
    if ((this.x != null) && ((this.x.b() > 65535) || (this.x.c() > 255))) {
      if (i()) {
        unFreezePanes();
      } else {
        removeSplit();
      }
    }
    if ((this.G != null) && (this.G.size() > 0)) {
      for (int i4 = 0; i4 < this.G.size(); i4++)
      {
        zbev localzbev = (zbev)this.G.get(0);
        for (int i6 = localzbev.b().size() - 1; i6 >= 0; i6--)
        {
          CellArea localCellArea1 = (CellArea)localzbev.b().get(i6);
          if ((localCellArea1.StartRow > 65535) || (localCellArea1.StartColumn > 255))
          {
            if (localzbev.e() == i6) {
              if (this.x != null) {
                switch (localzbev.a())
                {
                case 3: 
                  localzbev.a(0, 0);
                  break;
                case 2: 
                  localzbev.a(this.x.b(), 0);
                  break;
                case 1: 
                  localzbev.a(0, this.x.c());
                  break;
                case 0: 
                  localzbev.a(this.x.b(), this.x.c());
                  break;
                }
              } else {
                localzbev.a(0, 0);
              }
            }
            if (localzbev.e() > i6) {
              localzbev.c(localzbev.e() - 1);
            }
            localzbev.b().remove(i6);
          }
          else
          {
            if (localCellArea1.EndRow > 65535) {
              localCellArea1.EndRow = 65535;
            }
            if (localCellArea1.EndColumn > 255) {
              localCellArea1.EndColumn = 255;
            }
            localzbev.b().set(i6, localCellArea1);
          }
        }
        if (localzbev.c() > 65535) {
          localzbev.a(65535);
        }
        if (localzbev.d() > 255) {
          localzbev.b(255);
        }
      }
    }
    if (this.S > 65535) {
      this.S = 0;
    }
    if (this.T > 255) {
      this.T = 0;
    }
    int i2;
    Object localObject;
    if ((this.P != null) && (this.P.getCount() > 0)) {
      for (i2 = this.P.getCount() - 1; i2 >= 0; i2--)
      {
        localObject = this.P.get(i2).getAreaList();
        for (int i5 = ((ArrayList)localObject).size() - 1; i5 >= 0; i5--)
        {
          CellArea localCellArea3 = (CellArea)((ArrayList)localObject).get(i5);
          if ((localCellArea3.StartRow > 65535) || (localCellArea3.StartColumn > 255))
          {
            ((ArrayList)localObject).remove(i5);
          }
          else if (localCellArea3.EndRow > 65535)
          {
            localCellArea3.EndRow = 65535;
            if (localCellArea3.EndColumn > 255) {
              localCellArea3.EndColumn = 255;
            }
            ((ArrayList)localObject).set(i5, localCellArea3);
          }
          else if (localCellArea3.EndColumn > 255)
          {
            localCellArea3.EndColumn = 255;
            ((ArrayList)localObject).set(i5, localCellArea3);
          }
        }
        if (((ArrayList)localObject).size() == 0) {
          this.P.removeAt(i2);
        }
      }
    }
    if ((this.r != null) && (this.r.getCount() > 0)) {
      for (i2 = this.r.getCount() - 1; i2 >= 0; i2--)
      {
        localObject = this.r.get(i2);
        ArrayList localArrayList = ((FormatConditionCollection)localObject).b;
        for (int i7 = localArrayList.size() - 1; i7 >= 0; i7--)
        {
          CellArea localCellArea4 = (CellArea)localArrayList.get(i7);
          if ((localCellArea4.StartRow > 65535) || (localCellArea4.StartColumn > 255))
          {
            localArrayList.remove(i7);
          }
          else if (localCellArea4.EndRow > 65535)
          {
            localCellArea4.EndRow = 65535;
            if (localCellArea4.EndColumn > 255) {
              localCellArea4.EndColumn = 255;
            }
            localArrayList.set(i7, localCellArea4);
          }
          else if (localCellArea4.EndColumn > 255)
          {
            localCellArea4.EndColumn = 255;
            localArrayList.set(i7, localCellArea4);
          }
        }
        if (localArrayList.size() == 0) {
          this.r.removeAt(i2);
        }
      }
    }
  }
  
  public int getType()
  {
    return this.u;
  }
  
  public void setType(int value)
  {
    this.u = value;
  }
  
  public String getName()
  {
    return this.v;
  }
  
  public void setName(String value)
  {
    if (zw.b(value)) {
      return;
    }
    String str1 = a(value);
    Iterator localIterator1 = this.z.iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      Iterator localIterator2 = localWorksheet.I.iterator();
      while (localIterator2.hasNext())
      {
        Chart localChart = (Chart)localIterator2.next();
        String str2 = localChart.getPivotSource();
        if (str2 != null)
        {
          int i1 = str2.indexOf("!");
          if (i1 != -1)
          {
            String str3 = str2.substring(0, 0 + i1);
            if (zy.a(str3, this.v))
            {
              String str4 = str2.substring(i1);
              localChart.setPivotSource(str1 + str4);
            }
          }
        }
      }
    }
    this.v = str1;
    this.z.g();
    this.z.ae();
  }
  
  String a(String paramString)
  {
    if (paramString.length() >= 32) {
      throw new CellsException(6, "The max length of the sheet name is 31");
    }
    for (int i1 = 0; i1 < paramString.length(); i1++) {
      switch (paramString.charAt(i1))
      {
      case '*': 
      case '/': 
      case ':': 
      case '?': 
      case '[': 
      case '\\': 
      case ']': 
        throw new CellsException(6, "Worksheet name could not contain any following characters :  : \\ / ? * [  or ]");
      }
    }
    if (!zy.a(paramString, this.v)) {
      for (i1 = 0; i1 < this.z.getCount(); i1++)
      {
        String str = this.z.get(i1).getName();
        if (zy.a(str, paramString)) {
          throw new CellsException(6, "The same worksheet name already exists");
        }
      }
    }
    return paramString;
  }
  
  void b(String paramString)
  {
    this.v = paramString;
  }
  
  int h()
  {
    return this.A;
  }
  
  void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  public boolean getShowFormulas()
  {
    return (this.A & 0xFFFF & 0x1) != 0;
  }
  
  public void setShowFormulas(boolean value)
  {
    if (value) {
      this.A |= 0x1;
    } else {
      this.A &= 0xFFFE;
    }
  }
  
  public boolean isGridlinesVisible()
  {
    return (this.A & 0xFFFF & 0x2) != 0;
  }
  
  public void setGridlinesVisible(boolean value)
  {
    if (value) {
      this.A |= 0x2;
    } else {
      this.A &= 0xFFFD;
    }
  }
  
  public boolean isRowColumnHeadersVisible()
  {
    return (this.A & 0xFFFF & 0x4) != 0;
  }
  
  public void setRowColumnHeadersVisible(boolean value)
  {
    if (value) {
      this.A |= 0x4;
    } else {
      this.A &= 0xFFFB;
    }
  }
  
  boolean i()
  {
    return (this.A & 0xFFFF & 0x8) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A |= 0x8;
    } else {
      this.A &= 0xFFF7;
    }
  }
  
  boolean j()
  {
    return (this.A & 0xFFFF & 0x100) == 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.A &= 0xFEFF;
    } else {
      this.A |= 0x100;
    }
  }
  
  public boolean getDisplayZeros()
  {
    return (this.A & 0xFFFF & 0x10) != 0;
  }
  
  public void setDisplayZeros(boolean value)
  {
    if (value) {
      this.A |= 0x10;
    } else {
      this.A &= 0xFFEF;
    }
  }
  
  public boolean getDisplayRightToLeft()
  {
    return (this.A & 0xFFFF & 0x40) != 0;
  }
  
  public void setDisplayRightToLeft(boolean value)
  {
    if (value) {
      this.A |= 0x40;
    } else {
      this.A &= 0xFFBF;
    }
  }
  
  public boolean isOutlineShown()
  {
    return (this.A & 0xFFFF & 0x80) != 0;
  }
  
  public void setOutlineShown(boolean value)
  {
    if (value) {
      this.A |= 0x80;
    } else {
      this.A &= 0xFF7F;
    }
  }
  
  public boolean isSelected()
  {
    return (this.A & 0xFFFF & 0x200) != 0;
  }
  
  public void setSelected(boolean value)
  {
    if (value) {
      this.A |= 0x600;
    } else {
      this.A &= 0xFDFF;
    }
  }
  
  public void freezePanes(int row, int column, int freezedRows, int freezedColumns)
  {
    zamm.a(row, column);
    if ((freezedRows < 0) || (freezedColumns < 0)) {
      throw new IllegalArgumentException("Row index and column index cannot all be zero.");
    }
    if ((row == 0) && (column == 0)) {
      throw new IllegalArgumentException("Row index and column index cannot all be zero.");
    }
    if ((freezedRows == 0) && (freezedColumns == 0)) {
      throw new IllegalArgumentException("Number of freezed rows and number of freezed columns cannot all be zero.");
    }
    if (this.x == null)
    {
      this.x = new PaneCollection(this);
      b(false);
    }
    else
    {
      boolean bool = i();
      if (!bool) {
        b(true);
      }
    }
    this.x.c(row, column, freezedRows, freezedColumns);
    a(true);
  }
  
  public int[] getFreezedPanes()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    if ((!i()) || (this.x == null)) {
      return null;
    }
    i1 = this.x.d() == 0 ? 0 : this.S + this.x.d();
    i2 = this.x.e() == 0 ? 0 : this.T + this.x.e();
    i3 = this.x.d();
    i4 = this.x.e();
    int[] arrayOfInt = { i1, i2, i3, i4 };
    return arrayOfInt;
  }
  
  public void split()
  {
    String str = getActiveCell();
    this.x = new PaneCollection(this);
    a(false);
    this.x.a(str);
  }
  
  public void freezePanes(String cellName, int freezedRows, int freezedColumns)
  {
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i2 };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i2 = arrayOfInt2[0];
    freezePanes(i1, i2, freezedRows, freezedColumns);
  }
  
  public void unFreezePanes()
  {
    if (i())
    {
      this.x = null;
      a(false);
      b(true);
      if (this.G != null) {
        for (int i1 = this.G.size() - 1; i1 >= 0; i1--)
        {
          zbev localzbev = (zbev)this.G.get(i1);
          if (localzbev.a() != 3) {
            this.G.remove(i1);
          }
        }
      }
    }
  }
  
  public void removeSplit()
  {
    if (!i())
    {
      this.x = null;
      if (this.G != null) {
        for (int i1 = this.G.size() - 1; i1 >= 0; i1--)
        {
          zbev localzbev = (zbev)this.G.get(i1);
          if (localzbev.a() != 3) {
            this.G.remove(i1);
          }
        }
      }
      b(true);
    }
    else
    {
      b(false);
    }
  }
  
  ListObjectCollection k()
  {
    return this.d;
  }
  
  public ListObjectCollection getListObjects()
  {
    if (this.d == null) {
      this.d = new ListObjectCollection(this);
    }
    return this.d;
  }
  
  zbvn l()
  {
    if (this.B == null) {
      this.B = new zbvn(this);
    }
    return this.B;
  }
  
  public int getTabId()
  {
    return this.e;
  }
  
  public void setTabId(int value)
  {
    this.e = value;
    if (value > this.z.c) {
      this.z.c = value;
    }
  }
  
  public HorizontalPageBreakCollection getHorizontalPageBreaks()
  {
    return this.w.b();
  }
  
  public VerticalPageBreakCollection getVerticalPageBreaks()
  {
    return this.w.c();
  }
  
  public void addPageBreaks(String cellName)
  {
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt1 = { i1 };
    int[] arrayOfInt2 = { i2 };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i1 = arrayOfInt1[0];
    i2 = arrayOfInt2[0];
    getHorizontalPageBreaks().add(i1, i2);
    getVerticalPageBreaks().add(i1, i2);
  }
  
  public HyperlinkCollection getHyperlinks()
  {
    return this.g;
  }
  
  public void copy(Worksheet sourceSheet)
    throws Exception
  {
    copy(sourceSheet, null);
  }
  
  public void copy(Worksheet sourceSheet, CopyOptions copyOptions)
    throws Exception
  {
    if (sourceSheet == null) {
      return;
    }
    if (this == sourceSheet) {
      return;
    }
    if (copyOptions == null) {
      copyOptions = new CopyOptions();
    }
    copyOptions.a(sourceSheet, this);
    copyOptions.b(0);
    this.w = new Cells(this);
    this.P = new ValidationCollection(this);
    this.Q = new ProtectedRangeCollection(this);
    this.R = new Outline();
    if (this.u != 2)
    {
      if (copyOptions.getCopyNames()) {
        copyOptions.a(0);
      }
      if (sourceSheet.d != null)
      {
        this.d = new ListObjectCollection(this);
        this.d.a(sourceSheet.d, copyOptions);
      }
      if (sourceSheet.ab != null)
      {
        this.ab = new SmartTagSetting(this);
        this.ab.a(sourceSheet.ab);
      }
      this.T = sourceSheet.T;
      this.S = sourceSheet.S;
      this.V = sourceSheet.V;
      this.u = sourceSheet.u;
      if (sourceSheet.C != null) {
        getAutoFilter().a(sourceSheet.C);
      } else {
        this.C = null;
      }
      if (sourceSheet.r != null)
      {
        this.r = new ConditionalFormattingCollection(this);
        this.r.a(sourceSheet.r, copyOptions);
      }
      else
      {
        this.r = null;
      }
      if (sourceSheet.P.getCount() > 0)
      {
        this.P.clear();
        this.P.a(sourceSheet.P, copyOptions);
      }
      if (sourceSheet.Q.getCount() > 0)
      {
        this.Q.clear();
        this.Q.a(sourceSheet.Q);
      }
      if (sourceSheet.x != null)
      {
        this.x = new PaneCollection(this);
        this.x.a(sourceSheet.x);
      }
      else
      {
        this.x = null;
      }
      a(sourceSheet);
      if ((!copyOptions.a()) && (this.z == sourceSheet.z) && (this.z.getActiveSheetIndex() == sourceSheet.getIndex())) {
        this.z.setActiveSheetIndex(getIndex());
      }
      if (sourceSheet.y != null)
      {
        this.y = new Protection();
        this.y.copy(sourceSheet.y);
      }
      else
      {
        this.y = null;
      }
      this.w.a(sourceSheet.w, copyOptions);
      if (sourceSheet.g.getCount() > 0) {
        this.g.a(sourceSheet.g, copyOptions);
      }
      if ((sourceSheet.b != null) && (sourceSheet.b.getCount() != 0))
      {
        this.b = new PivotTableCollection(this);
        getPivotTables().a(sourceSheet.b, copyOptions);
      }
      else
      {
        this.b = null;
      }
      this.R = sourceSheet.R;
    }
    b(sourceSheet);
    if ((!copyOptions.a()) && (this.f != c().getActiveSheetIndex())) {
      setSelected(false);
    }
    if ((!sourceSheet.isVisible()) && (this.z.getCount() == 1))
    {
      setVisible(true);
      this.z.setActiveSheetIndex(0);
    }
    a(sourceSheet, copyOptions);
    if (sourceSheet.aa != null)
    {
      this.aa = new CustomPropertyCollection();
      this.aa.a(sourceSheet.aa);
    }
    if (copyOptions.a())
    {
      this.e = sourceSheet.e;
      this.p = sourceSheet.p;
      if (sourceSheet.k != null) {
        this.k = sourceSheet.k;
      }
    }
    else
    {
      Object localObject;
      if (sourceSheet.z == this.z)
      {
        if (this.z.p().getSettings().getEnableMacros())
        {
          localObject = this.z.H();
          if (localObject != null) {
            ((VbaProject)localObject).a(sourceSheet.getCodeName(), getCodeName());
          }
        }
        if ((sourceSheet.k != null) && (this.k == null)) {
          this.k = new zqv();
        }
      }
      else
      {
        localObject = this.z.getSheetByCodeName(sourceSheet.p);
        if ((localObject == null) || (localObject == this)) {
          this.p = sourceSheet.p;
        } else {
          this.p = getCodeName();
        }
      }
    }
  }
  
  private void a(Worksheet paramWorksheet)
  {
    this.G = null;
    if ((paramWorksheet.G != null) && (paramWorksheet.G.size() > 0))
    {
      this.G = new zbew(this);
      for (int i1 = 0; i1 < paramWorksheet.G.size(); i1++)
      {
        zbev localzbev1 = (zbev)paramWorksheet.G.get(i1);
        zbev localzbev2 = new zbev(localzbev1.a() & 0xFF);
        localzbev2.a(localzbev1);
        zf.a(this.G, localzbev2);
      }
    }
  }
  
  private void b(Worksheet paramWorksheet)
  {
    this.D = paramWorksheet.D;
    this.n = paramWorksheet.n;
    System.arraycopy(paramWorksheet.U, 0, this.U, 0, this.U.length);
    this.o.f(paramWorksheet.o);
    this.A = paramWorksheet.A;
    this.i = paramWorksheet.i;
    this.Y = paramWorksheet.Y;
  }
  
  public void autoFitColumn(int columnIndex, int firstRow, int lastRow)
    throws Exception
  {
    zamm.b(columnIndex);
    zamm.b(firstRow, lastRow);
    zlo.a(this.w, firstRow, lastRow, columnIndex, columnIndex, null);
  }
  
  public void autoFitColumns()
    throws Exception
  {
    zlo.a(this.w, 0, 1048575, 0, 16383, null);
  }
  
  public void autoFitColumns(AutoFitterOptions options)
    throws Exception
  {
    zlo.a(this.w, 0, 1048575, 0, 16383, options);
  }
  
  public void autoFitColumn(int columnIndex)
    throws Exception
  {
    zamm.b(columnIndex);
    zlo.a(this.w, 0, 1048575, columnIndex, columnIndex, null);
  }
  
  public void autoFitColumns(int firstColumn, int lastColumn)
    throws Exception
  {
    zamm.b(firstColumn);
    zamm.b(lastColumn);
    zlo.a(this.w, 0, 1048575, firstColumn, lastColumn, null);
  }
  
  public void autoFitColumns(int firstColumn, int lastColumn, AutoFitterOptions options)
    throws Exception
  {
    zamm.b(firstColumn);
    zamm.b(lastColumn);
    zlo.a(this.w, 0, 1048575, firstColumn, lastColumn, options);
  }
  
  public void autoFitColumns(int firstRow, int firstColumn, int lastRow, int lastColumn)
    throws Exception
  {
    zamm.b(firstColumn);
    zamm.b(lastColumn);
    zlo.a(this.w, firstRow, lastRow, firstColumn, lastColumn, null);
  }
  
  public void autoFitColumns(int firstRow, int firstColumn, int lastRow, int lastColumn, AutoFitterOptions options)
    throws Exception
  {
    zamm.b(firstColumn);
    zamm.b(lastColumn);
    zlo.a(this.w, firstRow, lastRow, firstColumn, lastColumn, options);
  }
  
  public void autoFitRow(int rowIndex, int firstColumn, int lastColumn)
    throws Exception
  {
    zamm.a(rowIndex);
    zamm.c(firstColumn, lastColumn);
    autoFitRow(rowIndex, rowIndex, firstColumn, lastColumn);
  }
  
  public void autoFitRow(int rowIndex, int firstColumn, int lastColumn, AutoFitterOptions options)
    throws Exception
  {
    zamm.a(rowIndex);
    zamm.c(firstColumn, lastColumn);
    zbdj.a(this.w, rowIndex, rowIndex, firstColumn, lastColumn, options);
  }
  
  public void autoFitRows()
    throws Exception
  {
    if (this.w.getRows().getCount() == 0) {
      return;
    }
    Row localRow = this.w.getRows().getRowByIndex(this.w.getRows().getCount() - 1);
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    zbdj.a(this.w, 0, localRow.getIndex(), 0, this.w.b((short)0), localAutoFitterOptions);
  }
  
  public void autoFitRows(boolean onlyAuto)
    throws Exception
  {
    if (this.w.getRows().getCount() == 0) {
      return;
    }
    Row localRow = this.w.getRows().getRowByIndex(this.w.getRows().getCount() - 1);
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    localAutoFitterOptions.setOnlyAuto(onlyAuto);
    zbdj.a(this.w, 0, localRow.getIndex(), 0, this.w.b((short)0), localAutoFitterOptions);
  }
  
  public void autoFitRows(AutoFitterOptions options)
    throws Exception
  {
    if (this.w.getRows().getCount() == 0) {
      return;
    }
    Row localRow = this.w.getRows().getRowByIndex(this.w.getRows().getCount() - 1);
    zbdj.a(this.w, 0, localRow.getIndex(), 0, this.w.b((short)0), options);
  }
  
  public void autoFitRows(int startRow, int endRow)
    throws Exception
  {
    zamm.a(startRow);
    zamm.a(endRow);
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    localAutoFitterOptions.a = true;
    zbdj.a(this.w, startRow, endRow, 0, 16383, localAutoFitterOptions);
  }
  
  public void autoFitRows(int startRow, int endRow, AutoFitterOptions options)
    throws Exception
  {
    zamm.a(startRow);
    zamm.a(endRow);
    options.a = true;
    zbdj.a(this.w, startRow, endRow, 0, 16383, options);
  }
  
  public void autoFitRow(int startRow, int endRow, int startColumn, int endColumn)
    throws Exception
  {
    zamm.a(startRow, startColumn, endRow, endColumn);
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    localAutoFitterOptions.a = ((startColumn == 0) && (endColumn == 16383));
    zbdj.a(this.w, startRow, endRow, startColumn, endColumn, localAutoFitterOptions);
  }
  
  public void autoFitRow(int rowIndex)
    throws Exception
  {
    zamm.a(rowIndex);
    AutoFitterOptions localAutoFitterOptions = new AutoFitterOptions();
    localAutoFitterOptions.a = true;
    zbdj.a(this.w, rowIndex, rowIndex, 0, 16383, localAutoFitterOptions);
  }
  
  public PageSetup getPageSetup()
  {
    if ((this.u == 2) && (this.I.getCount() > 0)) {
      return this.I.get(0).getPageSetup();
    }
    return this.w.h();
  }
  
  public AutoFilter getAutoFilter()
  {
    if (this.C == null) {
      this.C = new AutoFilter(this, this);
    }
    return this.C;
  }
  
  public void advancedFilter(boolean isFilter, String listRange, String criteriaRange, String copyTo, boolean uniqueRecordOnly)
  {
    zaq localzaq = new zaq(this.w);
    localzaq.a(isFilter, listRange, criteriaRange, copyTo, uniqueRecordOnly);
  }
  
  public void removeAutoFilter()
  {
    this.C = null;
  }
  
  public boolean hasAutofilter()
  {
    if (this.C == null) {
      return false;
    }
    return this.C.g() != 0;
  }
  
  boolean m()
  {
    return (this.i & 0x4000) != 0;
  }
  
  public boolean getTransitionEvaluation()
  {
    return (this.i & 0x4000) != 0;
  }
  
  public void setTransitionEvaluation(boolean value)
  {
    if (value) {
      this.i = ((short)(this.i | 0x4000));
    } else {
      this.i = ((short)(this.i & 0xBFFF));
    }
  }
  
  public boolean getTransitionEntry()
  {
    return (this.i & 0x2000) != 0;
  }
  
  public void setTransitionEntry(boolean value)
  {
    if (value) {
      this.i = ((short)(this.i | 0x2000));
    } else {
      this.i = ((short)(this.i & 0xDFFF));
    }
  }
  
  byte n()
  {
    return this.D;
  }
  
  void a(byte paramByte)
  {
    this.D = paramByte;
  }
  
  public int getVisibilityType()
  {
    switch (this.D)
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
  
  public void setVisibilityType(int value)
  {
    if (getVisibilityType() == value) {
      return;
    }
    if (value == 0)
    {
      this.D = 0;
      this.z.setActiveSheetIndex(getIndex());
    }
    else if (this.D == 0)
    {
      int i1 = -1;
      for (int i2 = getIndex() + 1; i2 < this.z.getCount(); i2++) {
        if (this.z.get(i2).isVisible())
        {
          i1 = i2;
          break;
        }
      }
      if (i1 == -1) {
        for (i2 = getIndex() - 1; i2 >= 0; i2--) {
          if (this.z.get(i2).isVisible())
          {
            i1 = i2;
            break;
          }
        }
      }
      if (i1 == -1) {
        throw new CellsException(10, "A workbook must contain at least a visible worksheet");
      }
      this.D = ((byte)value);
      setSelected(false);
      this.z.b(i1);
      if (this.z.P() == getIndex()) {
        this.z.k(i1);
      }
    }
    else
    {
      this.D = ((byte)value);
    }
  }
  
  public void setVisible(boolean isVisible, boolean ignoreError)
  {
    if (ignoreError)
    {
      if (isVisible)
      {
        this.D = 0;
      }
      else
      {
        this.D = 1;
        setSelected(false);
      }
    }
    else {
      setVisible(isVisible);
    }
  }
  
  public boolean isVisible()
  {
    return this.D == 0;
  }
  
  public void setVisible(boolean value)
  {
    if (isVisible() == value) {
      return;
    }
    if (value)
    {
      this.D = 0;
      this.z.setActiveSheetIndex(getIndex());
    }
    else
    {
      int i1 = -1;
      for (int i2 = getIndex() + 1; i2 < this.z.getCount(); i2++) {
        if (this.z.get(i2).isVisible())
        {
          i1 = i2;
          break;
        }
      }
      if (i1 == -1) {
        for (i2 = getIndex() - 1; i2 >= 0; i2--) {
          if (this.z.get(i2).isVisible())
          {
            i1 = i2;
            break;
          }
        }
      }
      if (i1 == -1) {
        throw new CellsException(10, "A workbook must contain at least a visible worksheet");
      }
      this.D = 1;
      setSelected(false);
      if (this.z.getActiveSheetIndex() == getIndex()) {
        this.z.b(i1);
      }
      if (this.z.P() == getIndex()) {
        this.z.k(i1);
      }
    }
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      this.D = 0;
    } else if (paramBoolean2) {
      this.D = 2;
    } else {
      this.D = 1;
    }
  }
  
  boolean o()
  {
    return this.D == 2;
  }
  
  ArrayList p()
  {
    return this.E;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.E = paramArrayList;
  }
  
  zbql q()
  {
    return this.F;
  }
  
  void a(zbql paramzbql)
  {
    this.F = paramzbql;
  }
  
  DataSorter r()
  {
    return this.j;
  }
  
  DataSorter s()
  {
    if (this.j == null) {
      this.j = new DataSorter(this);
    }
    return this.j;
  }
  
  zbew t()
  {
    return this.G;
  }
  
  void a(zbew paramzbew)
  {
    this.G = paramzbew;
  }
  
  public void selectRange(int startRow, int startColumn, int totalRows, int totalColumns, boolean removeOthers)
  {
    if (this.G == null)
    {
      this.G = new zbew(this);
      zbev localzbev = new zbev(3);
      localzbev.a(startRow, startColumn, totalRows, totalColumns, removeOthers);
      zf.a(this.G, localzbev);
    }
    else
    {
      this.G.a(startRow, startColumn, totalRows, totalColumns, removeOthers);
    }
  }
  
  public void removeAllDrawingObjects()
  {
    if (this.K != null) {
      this.K.clear();
    }
    if (this.J != null) {
      this.J.clear();
    }
    if (this.I != null) {
      this.I.c();
    }
    if (this.L != null) {
      this.L.clear();
    }
    if (this.M != null) {
      this.M.clear();
    }
    if (this.N != null) {
      this.N.clear();
    }
    if (this.l != null) {
      this.l.clear();
    }
  }
  
  public void clearComments()
  {
    if (this.J != null) {
      this.J.clear();
    }
  }
  
  public SparklineGroupCollection getSparklineGroupCollection()
  {
    if (this.H == null) {
      this.H = new SparklineGroupCollection(this);
    }
    return this.H;
  }
  
  public ChartCollection getCharts()
  {
    return this.I;
  }
  
  private void a(Worksheet paramWorksheet, CopyOptions paramCopyOptions)
    throws Exception
  {
    removeAllDrawingObjects();
    if (paramWorksheet.u == 2)
    {
      Chart localChart1 = new Chart(this);
      Chart localChart2 = paramWorksheet.I.get(0);
      localChart1.getChartObject().a(localChart2.getChartObject(), paramCopyOptions);
      this.I.a(localChart1);
      return;
    }
    if ((paramWorksheet.l != null) && (paramWorksheet.l.getCount() != 0)) {
      getShapes().a(paramWorksheet.getShapes(), paramCopyOptions);
    }
    if ((paramWorksheet.H != null) && (paramWorksheet.H.getCount() != 0)) {
      getSparklineGroupCollection().a(paramWorksheet.getSparklineGroupCollection(), paramCopyOptions);
    }
  }
  
  public CommentCollection getComments()
  {
    return this.J;
  }
  
  public PictureCollection getPictures()
  {
    if (this.K == null) {
      this.K = new PictureCollection(getShapes());
    }
    return this.K;
  }
  
  PictureCollection u()
  {
    return this.K;
  }
  
  public TextBoxCollection getTextBoxes()
  {
    if (this.L == null) {
      this.L = new TextBoxCollection(getShapes());
    }
    return this.L;
  }
  
  public CheckBoxCollection getCheckBoxes()
  {
    if (this.M == null) {
      this.M = new CheckBoxCollection(getShapes());
    }
    return this.M;
  }
  
  public OleObjectCollection getOleObjects()
  {
    if (this.N == null) {
      this.N = new OleObjectCollection(getShapes());
    }
    return this.N;
  }
  
  OleObjectCollection v()
  {
    return this.N;
  }
  
  public ShapeCollection getShapes()
  {
    if (this.l == null) {
      this.l = new ShapeCollection(this.z, this, this.z.L(), this, -1);
    }
    return this.l;
  }
  
  ShapeCollection w()
  {
    return this.l;
  }
  
  void a(ShapeCollection paramShapeCollection)
  {
    this.l = paramShapeCollection;
  }
  
  zbpr x()
  {
    if (null == this.O) {
      this.O = new zbpr(this);
    }
    return this.O;
  }
  
  private void e(int paramInt)
  {
    Protection localProtection = getProtection();
    switch (paramInt)
    {
    case 0: 
      localProtection.setAllowEditingContent(false);
      localProtection.setAllowEditingObject(false);
      localProtection.setAllowEditingScenario(false);
      break;
    case 1: 
      localProtection.setAllowEditingContent(false);
      break;
    case 2: 
      localProtection.setAllowEditingObject(false);
      break;
    case 3: 
      localProtection.setAllowEditingScenario(false);
      break;
    }
  }
  
  public void protect(int type)
  {
    if ((this.y == null) || ((this.y.b() & 0xFFFF) == 0)) {
      e(type);
    }
  }
  
  public void protect(int type, String password, String oldPassword)
  {
    if ((this.y != null) && (!this.y.verifyPassword(oldPassword))) {
      return;
    }
    e(type);
    getProtection().a(zui.a(password));
  }
  
  public void unprotect()
  {
    unprotect(null);
  }
  
  public void unprotect(String password)
  {
    if (this.y == null) {
      return;
    }
    if (this.y.verifyPassword(password)) {
      this.y = null;
    } else {
      throw new CellsException(8, "Invalid password for unprotecting the worksheet.");
    }
  }
  
  public int getIndex()
  {
    return this.f;
  }
  
  public void moveTo(int index)
  {
    if (index != this.f) {
      this.z.a(this.f, index);
    }
    for (int i1 = 0; i1 < this.z.getCount(); i1++)
    {
      Worksheet localWorksheet = this.z.get(i1);
      localWorksheet.f = i1;
      if (localWorksheet.isSelected()) {
        this.z.setActiveSheetIndex(i1);
      }
    }
  }
  
  public boolean isProtected()
  {
    return (this.y != null) && (!this.y.getAllowEditingContent());
  }
  
  public ValidationCollection getValidations()
  {
    return this.P;
  }
  
  public ProtectedRangeCollection getAllowEditRanges()
  {
    return this.Q;
  }
  
  public ErrorCheckOptionCollection getErrorCheckOptions()
  {
    if (this.m == null) {
      this.m = new ErrorCheckOptionCollection(this);
    }
    return this.m;
  }
  
  public Outline getOutline()
  {
    return this.R;
  }
  
  public int getFirstVisibleRow()
  {
    return this.S;
  }
  
  public void setFirstVisibleRow(int value)
  {
    this.S = value;
  }
  
  public int getFirstVisibleColumn()
  {
    return this.T;
  }
  
  public void setFirstVisibleColumn(int value)
  {
    zamm.b(value);
    this.T = value;
  }
  
  public int replace(String oldString, String newString)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.w.getRows().getCount(); i2++)
    {
      Row localRow = this.w.getRows().getRowByIndex(i2);
      for (int i3 = 0; i3 < localRow.a(); i3++)
      {
        Cell localCell = localRow.getCellByIndex(i3);
        zgs localzgs = localCell.c.e();
        if ((localzgs.c == 4) && (((String)localzgs.d).indexOf(oldString) != -1))
        {
          localCell.putValue(zw.a((String)localzgs.d, oldString, newString));
          i1++;
        }
      }
    }
    return i1;
  }
  
  int[] y()
  {
    return this.U;
  }
  
  public int getZoom()
  {
    switch (this.n)
    {
    case 0: 
      return this.U[0];
    case 1: 
      return this.U[1];
    case 2: 
      return this.U[2];
    }
    return 100;
  }
  
  public void setZoom(int value)
  {
    if ((value >= 10) && (value <= 400)) {
      switch (this.n)
      {
      case 0: 
        this.U[0] = value;
        break;
      case 1: 
        this.U[1] = value;
        break;
      case 2: 
        this.U[2] = value;
        break;
      }
    }
  }
  
  public int getViewType()
  {
    return this.n;
  }
  
  public void setViewType(int value)
  {
    this.n = value;
  }
  
  public boolean isPageBreakPreview()
  {
    return this.n == 1;
  }
  
  public void setPageBreakPreview(boolean value)
  {
    setViewType(value ? 1 : 0);
  }
  
  public boolean isRulerVisible()
  {
    return this.V;
  }
  
  public void setRulerVisible(boolean value)
  {
    this.V = value;
  }
  
  public ArrayList getSelectedRanges()
  {
    if ((this.G == null) || (this.G.size() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.G.size(); i1++)
    {
      zbev localzbev = (zbev)this.G.get(i1);
      for (int i2 = 0; i2 < localzbev.b().size(); i2++)
      {
        CellArea localCellArea = (CellArea)localzbev.b().get(i2);
        Range localRange = this.w.createRange(localCellArea.StartRow, localCellArea.StartColumn, localCellArea.EndRow - localCellArea.StartRow + 1, localCellArea.EndColumn - localCellArea.StartColumn + 1);
        zf.a(localArrayList, localRange);
      }
    }
    return localArrayList;
  }
  
  public Color getTabColor()
  {
    if (this.o.b()) {
      return Color.getEmpty();
    }
    return this.o.b(this.z.p());
  }
  
  public void setTabColor(Color value)
  {
    if (com.aspose.cells.a.c.zh.a(value)) {
      this.o.b(true);
    } else {
      this.o.a(2, value.toArgb());
    }
  }
  
  void c(int paramInt)
  {
    if (paramInt >= 64) {
      this.o.b(true);
    } else {
      this.o.a(3, paramInt);
    }
  }
  
  int z()
  {
    if (this.o.b()) {
      return 64;
    }
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    int i2 = this.o.a(this.z, 64, false, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    return i2;
  }
  
  Color A()
  {
    if (this.W >= 64) {
      return Color.getEmpty();
    }
    return this.z.o().a(this.W);
  }
  
  void a(Color paramColor)
  {
    int i1 = this.z.o().a(paramColor);
    if (i1 == -1) {
      throw new CellsException(6, "This color is not in the palette. Please add it to palette first.");
    }
    this.W = i1;
  }
  
  int B()
  {
    return this.W;
  }
  
  void d(int paramInt)
  {
    this.W = paramInt;
  }
  
  String C()
  {
    return this.p;
  }
  
  void c(String paramString)
  {
    this.p = paramString;
  }
  
  public String getCodeName()
  {
    if ((this.p == null) || ("".equals(this.p)))
    {
      int i1 = 0;
      for (int i2 = 0; i2 < c().getCount(); i2++)
      {
        Worksheet localWorksheet1 = c().get(i2);
        if ((localWorksheet1.p != null) && (!"".equals(localWorksheet1.p)))
        {
          i1 = 1;
          break;
        }
      }
      if (i1 != 0)
      {
        String str1 = null;
        int i3 = 0;
        for (int i4 = 0; i4 < c().getCount(); i4++)
        {
          Worksheet localWorksheet2 = c().get(i4);
          if ((localWorksheet2.p == null) || ("".equals(localWorksheet2.p)))
          {
            for (;;)
            {
              i3++;
              str1 = "Sheet" + i3;
              int i5 = 0;
              for (int i6 = 0; i6 < c().getCount(); i6++) {
                if (i6 != getIndex())
                {
                  String str2 = c().get(i6).p;
                  if ((str2 != null) && (zy.a(str2, str1)))
                  {
                    i5 = 1;
                    break;
                  }
                }
              }
              if (i5 == 0) {
                break;
              }
            }
            localWorksheet2.p = str1;
          }
        }
      }
      else
      {
        return "Sheet" + (getIndex() + 1);
      }
    }
    return this.p;
  }
  
  public void setCodeName(String value)
  {
    this.p = value;
    VbaProject localVbaProject = this.z.H();
    if (localVbaProject != null)
    {
      int i1 = getIndex();
      if (i1 < localVbaProject.getModules().getCount()) {
        localVbaProject.getModules().get(i1).a = value;
      }
    }
  }
  
  double[] D()
  {
    if (this.q == null) {
      this.q = zauu.a(this);
    }
    return this.q;
  }
  
  void E()
  {
    this.q = null;
  }
  
  void b(ArrayList paramArrayList)
  {
    this.X = paramArrayList;
  }
  
  /**
   * @deprecated
   */
  public void setBackground(byte[] pictureData)
  {
    this.X = null;
    this.Y = pictureData;
  }
  
  public byte[] getBackgroundImage()
    throws Exception
  {
    if (this.Y != null) {
      return this.Y;
    }
    if (this.X != null)
    {
      byte[] arrayOfByte1 = (byte[])this.X.get(0);
      int i1 = zc.e(arrayOfByte1, 16) & 0xFFFF;
      int i2 = zc.e(arrayOfByte1, 18) & 0xFFFF;
      int i3 = i1 * 3;
      int i4 = i3 % 4;
      if (i4 != 0)
      {
        i4 = 4 - i4;
        i3 += i4;
      }
      za localza = new za(i1, i2);
      int i5 = 24;
      int i9 = 1;
      for (int i10 = i2 - 1; i10 >= 0; i10--)
      {
        for (int i11 = 0; i11 < i1; i11++)
        {
          if (i5 >= arrayOfByte1.length)
          {
            arrayOfByte1 = (byte[])this.X.get(i9++);
            i5 = 4;
          }
          int i8 = arrayOfByte1[(i5++)] & 0xFF;
          if (i5 >= arrayOfByte1.length)
          {
            arrayOfByte1 = (byte[])this.X.get(i9++);
            i5 = 4;
          }
          int i7 = arrayOfByte1[(i5++)] & 0xFF;
          if (i5 >= arrayOfByte1.length)
          {
            arrayOfByte1 = (byte[])this.X.get(i9++);
            i5 = 4;
          }
          int i6 = arrayOfByte1[(i5++)] & 0xFF;
          localza.a(i11, i10, Color.fromArgb(i6, i7, i8));
        }
        i5 += i4;
        if ((i10 != 0) && (i5 >= arrayOfByte1.length))
        {
          arrayOfByte1 = (byte[])this.X.get(i9++);
          i5 -= arrayOfByte1.length;
          i5 += 4;
        }
      }
      com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
      try
      {
        localza.a(localzh, ImageFormat.getPng());
        localza.d();
        byte[] arrayOfByte2 = localzh.o();
        return arrayOfByte2;
      }
      finally
      {
        if (localzh != null) {
          localzh.a();
        }
      }
    }
    return null;
  }
  
  public void setBackgroundImage(byte[] value)
  {
    this.X = null;
    this.Y = value;
  }
  
  Object F()
  {
    if (this.X != null) {
      return this.X;
    }
    return this.Y;
  }
  
  ConditionalFormattingCollection G()
  {
    return this.r;
  }
  
  public ConditionalFormattingCollection getConditionalFormattings()
  {
    if (this.r == null) {
      this.r = new ConditionalFormattingCollection(this);
    }
    return this.r;
  }
  
  public String getActiveCell()
  {
    if (this.G == null) {
      return "A1";
    }
    return this.G.b();
  }
  
  public void setActiveCell(String value)
  {
    if (this.G == null) {
      this.G = new zbew(this);
    }
    this.G.a(value);
  }
  
  ArrayList H()
  {
    return this.Z;
  }
  
  void c(ArrayList paramArrayList)
  {
    this.Z = paramArrayList;
  }
  
  public CustomPropertyCollection getCustomProperties()
  {
    if (this.aa == null) {
      this.aa = new CustomPropertyCollection();
    }
    return this.aa;
  }
  
  CustomPropertyCollection I()
  {
    return this.aa;
  }
  
  public CellArea[] getPrintingPageBreaks(ImageOrPrintOptions options)
    throws Exception
  {
    this.w.getRows().a(17);
    this.w.getRows().b(1);
    this.w.b = new zlw(this.w, 16383);
    this.w.c = new zlt(this.w, 16383);
    try
    {
      zuj localzuj = new zuj(c().p(), new zbyr(c().p()));
      localzuj.a(this, options);
      CellArea[] arrayOfCellArea1 = new CellArea[localzuj.f.size()];
      for (int i1 = 0; i1 < localzuj.f.size(); i1++)
      {
        zaus localzaus = (zaus)localzuj.f.get(i1);
        arrayOfCellArea1[i1] = new CellArea();
        arrayOfCellArea1[i1].StartRow = localzaus.c.a;
        arrayOfCellArea1[i1].StartColumn = localzaus.c.b;
        arrayOfCellArea1[i1].EndRow = localzaus.c.c;
        arrayOfCellArea1[i1].EndColumn = localzaus.c.d;
      }
      CellArea[] arrayOfCellArea2 = arrayOfCellArea1;
      return arrayOfCellArea2;
    }
    finally
    {
      this.w.getRows().a();
      this.w.getRows().b();
      this.w.l();
      this.w.k();
    }
  }
  
  public SmartTagSetting getSmartTagSetting()
  {
    if (this.ab == null) {
      this.ab = new SmartTagSetting(this);
    }
    return this.ab;
  }
  
  SmartTagSetting J()
  {
    return this.ab;
  }
  
  public String toString()
  {
    return zs.a(new StringBuilder().append("Aspose.Cells.Worksheet[ ").append(getName()).append(" ]"));
  }
  
  zoi K()
  {
    if (this.s == null) {
      this.s = new zoi();
    }
    return this.s;
  }
  
  public ScenarioCollection getScenarios()
  {
    if (this.t == null) {
      this.t = new ScenarioCollection();
    }
    return this.t;
  }
  
  public Object calculateFormula(String formula)
  {
    return calculateFormula(formula, new CalculationOptions());
  }
  
  public Object calculateFormula(String formula, CalculationOptions opts)
  {
    return a(c().y().a(-1, formula, 0, 0, 0, 64, false, true, false), 0, -1, opts);
  }
  
  Object a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, CalculationOptions paramCalculationOptions)
  {
    zaca localzaca = new zaca(this, 3, paramCalculationOptions);
    zaag localzaag = new zaag(localzaca, paramArrayOfByte, paramInt1, paramInt2);
    zaie localzaie = localzaag.a();
    if (localzaie == null)
    {
      localzaca.c();
      return null;
    }
    Object localObject = localzaie.b(localzaca);
    localzaca.c();
    return localObject;
  }
  
  public void refreshPivotTables()
    throws Exception
  {
    int i1 = getPivotTables().getCount();
    PivotTable localPivotTable = null;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localPivotTable = getPivotTables().get(i2);
      localPivotTable.setRefreshDataFlag(true);
      localPivotTable.refreshData();
      localPivotTable.calculateData();
      localPivotTable.setRefreshDataFlag(false);
    }
  }
  
  public void calculateFormula(boolean recursive, boolean ignoreError, ICustomFunction customFunction)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = ignoreError;
    localCalculationOptions.setCustomFunction(customFunction);
    calculateFormula(localCalculationOptions, recursive);
  }
  
  public void calculateFormula(CalculationOptions options, boolean recursive)
  {
    zaca localzaca = new zaca(this, 2, options);
    CellsException localCellsException1 = null;
    try
    {
      for (int i1 = this.z.getCount() - 1; i1 > -1; i1--)
      {
        localCells = this.z.get(i1).getCells();
        localzabw = localCells.a;
        localCells.getRows().a(16);
        if (localzaca.p.o) {
          localzabw.a();
        } else if ((recursive) || (i1 == this.f)) {
          localzabw.a((byte)0);
        } else {
          localzabw.a((byte)2);
        }
      }
      this.z.af();
      Cells localCells = this.w;
      zahb localzahb = localCells.getRows().a;
      zgs localzgs1 = new zgs();
      zabw localzabw = localCells.a;
      int i4 = localzabw.d;
      for (int i5 = 0; i5 < i4; i5++)
      {
        zaai localzaai = localzabw.a(i5);
        if ((localzaai != null) && (localzaai.c() != 2))
        {
          localzgs1.a = localzaai.f;
          zgs localzgs2 = localzahb.a(localzaai.e, localzgs1, 4);
          if ((localzgs2 == null) || (localzgs2.d != localzaai)) {
            localzabw.b(i5);
          } else {
            localzaca.c(localzaai);
          }
        }
      }
    }
    catch (CellsException localCellsException2)
    {
      int i2;
      if ((localCellsException2.getCode() != 17) || (!zw.b(localCellsException2.getMessage()))) {
        localCellsException1 = localCellsException2;
      }
    }
    finally
    {
      int i3;
      for (int i6 = this.z.getCount() - 1; i6 > -1; i6--) {
        this.z.get(i6).getCells().getRows().a();
      }
      localzaca.c();
    }
    if (localCellsException1 != null) {
      throw localCellsException1;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Worksheet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */