package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.c.zo;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WorksheetCollection
  extends CollectionBase
{
  double a = 255.0D;
  boolean b;
  int c = 0;
  int d = 1024;
  int e = 0;
  int f;
  zajl g;
  zbyy h;
  HashMap i = new HashMap();
  private boolean n = false;
  private String o = null;
  private Object p = null;
  private zaaf q;
  private zayh r;
  private HashMap s;
  private NameCollection t;
  private zxf u;
  private boolean v;
  String j;
  private byte w;
  private zok x;
  private int y;
  private int z;
  private zwq A;
  private StyleCollection B;
  private int C;
  private zbth D;
  private int E;
  private zaad F;
  private zboz G;
  private ArrayList H;
  private ArrayList I;
  private DxfCollection J;
  private zajm K;
  VbaProject k;
  private zbpq L;
  private zbpy M;
  private zse N;
  private zse O;
  private int P;
  private Style Q;
  private XmlMapCollection R;
  private BuiltInDocumentPropertyCollection S;
  private CustomDocumentPropertyCollection T;
  private int U;
  Object l;
  private ExternalLinkCollection V;
  private zawq W;
  private DxfCollection X;
  private Workbook Y;
  private TableStyleCollection Z;
  private zbqg aa;
  private String ab;
  zbcj m;
  
  void a()
  {
    for (int i1 = getCount() - 1; i1 >= 0; i1--)
    {
      Worksheet localWorksheet = (Worksheet)this.InnerList.get(i1);
      this.InnerList.remove(i1);
      localWorksheet.dispose();
    }
    this.F = null;
    this.h = null;
    this.u = null;
    this.S = null;
    this.T = null;
    this.x = null;
    this.Q = null;
    this.J = null;
    this.V = null;
    if (this.q != null) {
      this.q.a();
    }
    this.q = null;
    this.t = null;
    this.p = null;
    this.r = null;
    this.m = null;
    this.s = null;
    this.X = null;
    this.aa = null;
    this.Z = null;
    this.Y = null;
    this.R = null;
    this.W = null;
    this.g = null;
    this.K = null;
    this.B = null;
    this.D = null;
    this.L = null;
    this.N = null;
    this.k = null;
    zg.a(this);
  }
  
  String b()
  {
    return this.o;
  }
  
  void a(String paramString)
  {
    this.o = paramString;
  }
  
  public boolean isRefreshAllConnections()
  {
    return this.n;
  }
  
  public void setRefreshAllConnections(boolean value)
  {
    this.n = value;
  }
  
  public Range createRange(String address, int sheetIndex)
  {
    byte[] arrayOfByte = y().a(-1, address, 0, 0, 2, 32, false, true, false);
    return zabx.b(0, null, true, arrayOfByte, 0, -1, 0, 0, this, sheetIndex);
  }
  
  Object c()
  {
    return this.p;
  }
  
  void a(Object paramObject)
  {
    this.p = paramObject;
  }
  
  zaaf d()
  {
    if (this.q == null) {
      this.q = new zaaf(this);
    }
    return this.q;
  }
  
  zayh e()
  {
    if (this.r == null) {
      this.r = new zayh(this);
    }
    return this.r;
  }
  
  HashMap f()
  {
    if (this.s == null)
    {
      this.s = new HashMap();
      for (int i1 = 0; i1 < getCount(); i1++)
      {
        int[] arrayOfInt = { i1, this.A.b(this.C, i1) };
        this.s.put(get(i1).getName().toUpperCase(), arrayOfInt);
      }
    }
    return this.s;
  }
  
  void g()
  {
    this.s = null;
  }
  
  public NameCollection getNames()
  {
    return this.t;
  }
  
  zxf h()
  {
    return this.u;
  }
  
  void a(zxf paramzxf)
  {
    this.u = paramzxf;
  }
  
  boolean i()
  {
    return this.v;
  }
  
  void a(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  String j()
  {
    return this.j;
  }
  
  void b(String paramString)
  {
    this.j = paramString;
  }
  
  boolean k()
  {
    return (this.w & 0xFF & 0x1) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.w = ((byte)(this.w | 0x1));
    } else {
      this.w = ((byte)(this.w & 0xFE));
    }
  }
  
  boolean l()
  {
    return (this.w & 0xFF & 0x2) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.w = ((byte)(this.w | 0x2));
    } else {
      this.w = ((byte)(this.w & 0xFD));
    }
  }
  
  zok m()
  {
    return this.x;
  }
  
  zok n()
  {
    if (this.x == null) {
      this.x = new zok();
    }
    return this.x;
  }
  
  void a(zok paramzok)
  {
    this.x = paramzok;
  }
  
  void a(WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    this.s = null;
    this.U = paramWorksheetCollection.U;
    this.o = paramWorksheetCollection.o;
    if (paramWorksheetCollection.h != null) {
      D().a(paramWorksheetCollection.h);
    }
    this.v = paramWorksheetCollection.v;
    this.j = paramWorksheetCollection.j;
    this.w = paramWorksheetCollection.w;
    if (paramWorksheetCollection.G != null)
    {
      this.G = new zboz();
      this.G.a(paramWorksheetCollection.G);
    }
    else
    {
      this.G = null;
    }
    if (paramWorksheetCollection.N != null)
    {
      this.N = new zse(this, 0);
      this.N.a(paramWorksheetCollection.N);
    }
    else
    {
      this.N = null;
    }
    if (paramWorksheetCollection.O != null)
    {
      this.O = new zse(this, 1);
      this.O.a(paramWorksheetCollection.O);
    }
    else
    {
      this.O = null;
    }
    this.E = paramWorksheetCollection.E;
    this.f = paramWorksheetCollection.f;
    this.z = paramWorksheetCollection.z;
    this.y = paramWorksheetCollection.y;
    this.P = paramWorksheetCollection.P;
    Object localObject1;
    Object localObject2;
    for (int i1 = 0; i1 < paramWorksheetCollection.H.size(); i1++)
    {
      localObject1 = new Font(this, null, false);
      localObject2 = (Font)paramWorksheetCollection.H.get(i1);
      ((Font)localObject1).a((Font)localObject2, null);
      ((Font)localObject1).d(((Font)localObject2).m());
      zf.a(this.H, localObject1);
    }
    for (i1 = 0; i1 < paramWorksheetCollection.I.size(); i1++)
    {
      localObject1 = new zzw();
      localObject2 = (zzw)paramWorksheetCollection.I.get(i1);
      ((zzw)localObject1).a((zzw)localObject2);
      zf.a(this.I, localObject1);
    }
    ((zbzv)this.K).a((zbzv)paramWorksheetCollection.K);
    if (paramWorksheetCollection.B.getCount() > 0) {
      this.B.a(paramWorksheetCollection.B);
    }
    for (i1 = 0; i1 < paramWorksheetCollection.getDxfs().getCount(); i1++)
    {
      localObject1 = new Style(this);
      localObject2 = paramWorksheetCollection.getDxfs().get(i1);
      ((Style)localObject1).copy((Style)localObject2);
      getDxfs().b((Style)localObject1);
    }
    for (i1 = 0; i1 < paramWorksheetCollection.Y().getCount(); i1++)
    {
      localObject1 = new Style(this);
      localObject2 = paramWorksheetCollection.Y().get(i1);
      ((Style)localObject1).copy((Style)localObject2);
      Y().b((Style)localObject1);
    }
    if ((paramWorksheetCollection.D != null) && (paramWorksheetCollection.D.getCount() > 0))
    {
      if (this.D == null) {
        this.D = new zbth();
      }
      for (i1 = 0; i1 < paramWorksheetCollection.D.getCount(); i1++)
      {
        localObject1 = paramWorksheetCollection.D.a(i1);
        localObject2 = new zbti();
        ((zbti)localObject2).b((zbti)localObject1);
        this.D.a((zbti)localObject2);
      }
    }
    this.InnerList.clear();
    CopyOptions localCopyOptions = new CopyOptions(0, p(), paramWorksheetCollection.p());
    this.t.a(paramWorksheetCollection.t, localCopyOptions);
    for (int i2 = 0; i2 < paramWorksheetCollection.InnerList.size(); i2++)
    {
      localObject2 = (Worksheet)paramWorksheetCollection.InnerList.get(i2);
      c(((Worksheet)localObject2).getName());
    }
    this.A.a(paramWorksheetCollection.A);
    this.C = paramWorksheetCollection.C;
    for (i2 = 0; i2 < paramWorksheetCollection.InnerList.size(); i2++)
    {
      localObject2 = (Worksheet)paramWorksheetCollection.InnerList.get(i2);
      Worksheet localWorksheet = get(i2);
      localCopyOptions.setCopyNames(false);
      localWorksheet.copy((Worksheet)localObject2, localCopyOptions);
    }
    this.u = paramWorksheetCollection.u;
    if (paramWorksheetCollection.k != null)
    {
      this.k = new VbaProject(this.Y, null, null);
      this.k.a(paramWorksheetCollection.k);
    }
    this.c = paramWorksheetCollection.c;
  }
  
  void a(zajl paramzajl)
  {
    this.g = paramzajl;
    for (int i1 = getCount() - 1; i1 > -1; i1--) {
      ((Worksheet)this.InnerList.get(i1)).getCells().a(paramzajl);
    }
  }
  
  zava o()
  {
    return this.Y.getSettings().d();
  }
  
  WorksheetCollection(Workbook workbook)
  {
    this.Y = workbook;
    this.t = new NameCollection(this);
    this.f = 1;
    this.B = new StyleCollection(this);
    this.F = new zaad(this);
    this.H = new ArrayList();
    this.I = new ArrayList();
    this.K = new zbzv(this);
    this.J = new DxfCollection(this);
    this.X = new DxfCollection(this);
    ((zbzv)this.K).d();
    V();
    this.g = new zbst();
    this.V = new ExternalLinkCollection(this);
    this.D = new zbth();
    zbti localzbti = new zbti(1);
    this.D.a(localzbti);
    this.h = null;
  }
  
  Workbook p()
  {
    return this.Y;
  }
  
  public Worksheet get(int index)
  {
    return (Worksheet)this.InnerList.get(index);
  }
  
  Worksheet a(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      if (localWorksheet.getTabId() == paramInt) {
        return localWorksheet;
      }
    }
    return null;
  }
  
  public Worksheet get(String sheetName)
  {
    for (int i1 = 0; i1 < this.InnerList.size(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.InnerList.get(i1);
      if (zy.a(localWorksheet.getName(), sheetName)) {
        return localWorksheet;
      }
    }
    return null;
  }
  
  void q()
  {
    zbst localzbst;
    if (this.g.d()) {
      localzbst = (zbst)this.g;
    } else {
      localzbst = new zbst();
    }
    int[] arrayOfInt1 = new int[this.g.a()];
    Object localObject1;
    Object localObject2;
    zaiv localzaiv1;
    for (int i1 = getCount() - 1; i1 > -1; i1--)
    {
      Cells localCells = get(i1).getCells();
      zv localzv = localCells.e();
      if (localzv.a() >= 1)
      {
        localObject1 = localzv.b();
        int i4;
        do
        {
          i4 = ((zaiv)localObject1).a();
          if (i4 < 0) {
            break;
          }
          localObject2 = localzv.f(i4);
        } while (((zt)localObject2).a() <= 0);
        localzaiv1 = ((zt)localObject2).b();
        for (;;)
        {
          i4 = localzaiv1.a();
          if (i4 < 0) {
            break;
          }
          if (((zt)localObject2).h(i4) == 4) {
            arrayOfInt1[((zt)localObject2).j(i4)] += 1;
          }
        }
      }
    }
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    int i2 = localzbst.a(arrayOfInt1, arrayOfInt2, this.g);
    arrayOfInt1 = null;
    if (i2 > 0) {
      for (int i3 = getCount() - 1; i3 > -1; i3--)
      {
        localObject1 = get(i3).getCells();
        localObject2 = ((Cells)localObject1).e();
        localzaiv1 = ((zv)localObject2).b();
        for (;;)
        {
          int i5 = localzaiv1.a();
          if (i5 >= 0)
          {
            zt localzt = ((zv)localObject2).f(i5);
            if ((localzt.a() > 0) && (!localzt.d()))
            {
              zaiv localzaiv2 = localzt.b();
              for (;;)
              {
                i5 = localzaiv2.a();
                if (i5 < 0) {
                  break;
                }
                if (localzt.h(i5) == 4)
                {
                  int i6 = localzt.j(i5);
                  if (i6 != arrayOfInt2[i6])
                  {
                    localzt.k(i5, arrayOfInt2[i6]);
                    i2--;
                    if (i2 == 0) {
                      break;
                    }
                  }
                }
              }
              if (i2 == 0) {
                break;
              }
            }
          }
        }
      }
    }
    a(localzbst);
  }
  
  zadm a(SaveOptions paramSaveOptions)
  {
    int i1 = -1;
    for (int i2 = 0; i2 < getCount(); i2++)
    {
      if ((get(i2).isVisible()) && (i1 == -1)) {
        i1 = i2;
      }
      if ((get(i2).getType() == 2) && (get(i2).getCharts().getCount() == 0)) {
        throw new CellsException(10, "A chart sheet must contain a chart.");
      }
    }
    if (i1 == -1) {
      throw new CellsException(10, "A workbook must contain at least a visible worksheet");
    }
    if (!get(getActiveSheetIndex()).isVisible()) {
      setActiveSheetIndex(i1);
    }
    if (this.P >= getCount()) {
      this.P = (getCount() - 1);
    }
    if (!get(this.P).isVisible())
    {
      for (i1 = this.P + 1; (i1 < getCount()) && (!get(i1).isVisible()); i1++) {}
      if (i1 >= getCount()) {
        for (i1 = this.P - 1; (i1 >= 0) && (!get(i1).isVisible()); i1--) {}
      }
      this.P = i1;
    }
    zadm localzadm = null;
    if (this.K.a())
    {
      b(paramSaveOptions);
      localObject1 = new zhn(this.Y, paramSaveOptions);
      localzadm = ((zhn)localObject1).a();
    }
    if (paramSaveOptions.getSortNames()) {
      this.t.sort();
    } else {
      this.t.c();
    }
    if ((p().getSettings().getShared()) && ((this.m == null) || (this.m.getCount() == 0))) {
      switch (paramSaveOptions.getSaveFormat())
      {
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 16: 
        ag().a();
        break;
      }
    }
    Object localObject1 = iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Worksheet localWorksheet = (Worksheet)((Iterator)localObject1).next();
      if (paramSaveOptions.getValidateMergedAreas()) {
        localWorksheet.getCells().i();
      }
      if (paramSaveOptions.getMergeAreas())
      {
        Iterator localIterator = localWorksheet.getValidations().iterator();
        Object localObject2;
        while (localIterator.hasNext())
        {
          localObject2 = (Validation)localIterator.next();
          zban.a(((Validation)localObject2).getAreaList());
        }
        localIterator = localWorksheet.getConditionalFormattings().iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (FormatConditionCollection)localIterator.next();
          zban.a(((FormatConditionCollection)localObject2).b);
        }
      }
      localWorksheet.getListObjects().updateColumnName();
      if (localWorksheet.r != null) {
        localWorksheet.r.a();
      }
      if (localWorksheet.getValidations() != null) {
        localWorksheet.getValidations().d();
      }
    }
    return localzadm;
  }
  
  public Worksheet getSheetByCodeName(String codeName)
  {
    for (int i1 = 0; i1 < this.InnerList.size(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.InnerList.get(i1);
      if ((localWorksheet.getCodeName() != null) && (zy.a(localWorksheet.getCodeName(), codeName))) {
        return localWorksheet;
      }
    }
    return null;
  }
  
  zwq r()
  {
    return this.A;
  }
  
  StyleCollection s()
  {
    return this.B;
  }
  
  public int getActiveSheetIndex()
  {
    return this.y;
  }
  
  public void setActiveSheetIndex(int value)
  {
    if ((value >= 0) && (value < getCount()))
    {
      this.y = value;
      if (value - 5 >= 0)
      {
        this.P = (value - 5);
        for (i1 = this.P; i1 < getCount(); i1++) {
          if (get(i1).isVisible())
          {
            this.P = i1;
            break;
          }
        }
      }
    }
    for (int i1 = 0; i1 < getCount(); i1++) {
      if (value != i1) {
        get(i1).setSelected(false);
      } else {
        get(i1).setSelected(true);
      }
    }
  }
  
  public void sortNames()
  {
    getNames().sort();
  }
  
  void b(int paramInt)
  {
    this.y = paramInt;
  }
  
  void t()
  {
    Worksheet localWorksheet = new Worksheet(this, "Sheet1");
    localWorksheet.setSelected(true);
    zf.a(this.InnerList, localWorksheet);
    this.A = new zwq();
    this.A.a(0, 0, 0);
  }
  
  void u()
  {
    this.f = 0;
    this.z = 0;
    this.G = new zboz();
    this.Q = null;
    this.InnerList.clear();
    this.A = new zwq();
    aj();
    this.D.clear();
    this.W = null;
  }
  
  public Worksheet insert(int index, int sheetType)
  {
    this.s = null;
    String str;
    for (;;)
    {
      this.f += 1;
      str = "Sheet" + this.f;
      if (get(str) == null) {
        break;
      }
    }
    return insert(index, sheetType, str);
  }
  
  public Worksheet insert(int index, int sheetType, String sheetName)
  {
    this.s = null;
    Worksheet localWorksheet1 = null;
    if (index >= getCount())
    {
      localWorksheet1 = add(sheetName);
      localWorksheet1.setType(sheetType);
      return localWorksheet1;
    }
    localWorksheet1 = new Worksheet(this, sheetName);
    localWorksheet1.a(sheetName);
    this.InnerList.add(index, localWorksheet1);
    this.A.c(this.C, index, getCount());
    getNames().b(index);
    for (int i1 = 0; i1 < getCount(); i1++)
    {
      Worksheet localWorksheet2 = get(i1);
      localWorksheet2.f = i1;
    }
    setActiveSheetIndex(localWorksheet1.getIndex());
    return localWorksheet1;
  }
  
  public int add(int type)
  {
    switch (type)
    {
    case 2: 
      if (getCount() < 65535)
      {
        Worksheet localWorksheet = new Worksheet(this);
        String str1;
        for (;;)
        {
          this.z += 1;
          str1 = "Chart" + this.z;
          i1 = 0;
          for (int i2 = 0; i2 < getCount(); i2++)
          {
            String str2 = get(i2).getName();
            if (zw.b(str2, str1)) {
              i1 = 1;
            }
          }
          if (i1 == 0) {
            break;
          }
        }
        localWorksheet.b(str1);
        zf.a(this.InnerList, localWorksheet);
        int i1 = this.InnerList.size() - 1;
        localWorksheet.setType(2);
        this.s = null;
        this.A.a(this.C, i1, i1);
        return i1;
      }
      throw new CellsException(10, "Too much worksheet objects.");
    case 1: 
      return add();
    }
    throw new CellsException(6, "Invalid worksheet type specified.");
  }
  
  int v()
  {
    return this.C;
  }
  
  void c(int paramInt)
  {
    this.C = paramInt;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) || (paramInt2 > this.InnerList.size() - 1)) {
      throw new IllegalArgumentException();
    }
    this.s = null;
    Worksheet localWorksheet = get(paramInt1);
    if (paramInt2 > paramInt1)
    {
      this.InnerList.add(paramInt2 + 1, localWorksheet);
      this.InnerList.remove(paramInt1);
    }
    else
    {
      this.InnerList.add(paramInt2, localWorksheet);
      this.InnerList.remove(paramInt1 + 1);
    }
    this.t.a(paramInt1, paramInt2);
    this.A.d(this.C, paramInt1, paramInt2);
  }
  
  public void swapSheet(int sheetIndex1, int sheetIndex2)
  {
    if ((sheetIndex1 < 0) || (sheetIndex1 >= this.InnerList.size()) || (sheetIndex2 < 0) || (sheetIndex2 >= this.InnerList.size())) {
      throw new IllegalArgumentException();
    }
    Worksheet localWorksheet1 = get(sheetIndex1);
    Worksheet localWorksheet2 = get(sheetIndex2);
    localWorksheet1.moveTo(sheetIndex2);
    localWorksheet2.moveTo(sheetIndex1);
  }
  
  public int add()
  {
    if (getCount() < 65535)
    {
      Worksheet localWorksheet = new Worksheet(this);
      String str = zamm.b(this);
      localWorksheet.b(str);
      zf.a(this.InnerList, localWorksheet);
      int i1 = this.InnerList.size() - 1;
      this.s = null;
      int i2 = 0;
      if ((this.D != null) && (this.D.getCount() != 0))
      {
        int i3 = 0;
        for (int i4 = 0; i4 < this.D.getCount(); i4++)
        {
          zbti localzbti = this.D.a(i4);
          if (localzbti.e())
          {
            i2 = i4;
            i3 = 1;
            break;
          }
        }
        if (i3 == 0) {
          i2 = this.D.getCount();
        }
      }
      this.A.a(i2, i1, i1);
      return i1;
    }
    throw new CellsException(10, "Too much worksheet objects.");
  }
  
  public Worksheet add(String sheetName)
  {
    int i1 = add();
    get(i1).setName(sheetName);
    this.s = null;
    return get(i1);
  }
  
  int c(String paramString)
  {
    int i1 = add();
    get(i1).b(paramString);
    this.s = null;
    return i1;
  }
  
  zbth w()
  {
    return this.D;
  }
  
  void a(zbth paramzbth)
  {
    this.D = paramzbth;
  }
  
  int[] a(String paramString, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = -1;
    int i3 = -1;
    zbth localzbth = w();
    int i4 = 0;
    int i5 = 0;
    zbti localzbti = null;
    for (int i6 = 0; i6 < localzbth.getCount(); i6++)
    {
      localzbti = localzbth.a(i6);
      if (localzbti.f())
      {
        i1 = i6;
        i4 = 1;
        break;
      }
    }
    if (i4 == 0)
    {
      if (!paramBoolean) {
        return null;
      }
      localzbti = new zbti();
      localzbti.a(2);
      zwh localzwh1 = new zwh(localzbti);
      localzwh1.a(paramString, false);
      zf.a(localzbti.b(), localzwh1);
      i3 = 0;
      w().a(localzbti);
      i2 = r().b(w().getCount() - 1 & 0xFFFF, 65534, 65534);
    }
    else
    {
      i2 = r().f(i1, 65534, 65534);
      i4 = 1;
      for (int i7 = 0; i7 < localzbti.b().size(); i7++)
      {
        zwh localzwh3 = (zwh)localzbti.b().get(i7);
        if (zy.a(localzwh3.e(), paramString))
        {
          i3 = i7;
          i5 = 1;
          break;
        }
      }
      if (i5 == 0)
      {
        if (!paramBoolean) {
          return null;
        }
        zwh localzwh2 = new zwh(localzbti);
        localzwh2.a(paramString, false);
        zf.a(localzbti.b(), localzwh2);
        i3 = localzbti.b().size() - 1;
      }
    }
    return new int[] { i2, i3 };
  }
  
  int x()
  {
    return this.E;
  }
  
  void d(int paramInt)
  {
    this.E = paramInt;
  }
  
  zaad y()
  {
    return this.F;
  }
  
  public void removeAt(String name)
  {
    for (int i1 = 0; i1 < this.InnerList.size(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.InnerList.get(i1);
      if (zy.a(localWorksheet.getName(), name))
      {
        removeAt(i1);
        break;
      }
    }
  }
  
  public void removeAt(int index)
  {
    this.s = null;
    if (index < getCount())
    {
      localObject = get(index).getPivotTables();
      for (i1 = ((PivotTableCollection)localObject).getCount() - 1; i1 >= 0; i1--) {
        ((PivotTableCollection)localObject).removeAt(i1);
      }
    }
    Object localObject = null;
    for (int i1 = 0; i1 < J().getCount(); i1++)
    {
      localObject = J().a(i1);
      if (W().a(((zbpp)localObject).i) == null)
      {
        J().b((zbpp)localObject);
        i1--;
      }
    }
    i1 = 0;
    if ((this.D != null) && (this.D.getCount() != 0)) {
      for (i2 = 0; i2 < this.D.getCount(); i2++)
      {
        zbti localzbti = this.D.a(i2);
        if (localzbti.e())
        {
          i1 = i2;
          break;
        }
      }
    }
    zhw.a(get(index).getCells(), get(index).getCells().e(), -1, -1);
    this.A.a(index, i1);
    if (this.k != null) {
      H().getModules().remove(get(index));
    }
    this.InnerList.remove(index);
    this.t.a(index);
    for (int i2 = index; i2 < getCount(); i2++) {
      get(i2).f = i2;
    }
    if (getCount() == 0) {
      this.y = 0;
    } else if (this.y > getCount() - 1) {
      this.y = (getCount() - 1);
    }
    if (getCount() == 0) {
      this.P = 0;
    } else if (this.P > getCount() - 1) {
      this.P = (getCount() - 1);
    }
  }
  
  public void clear()
  {
    this.InnerList.clear();
    this.f = 0;
  }
  
  Style e(int paramInt)
  {
    return this.K.a(paramInt);
  }
  
  Style f(int paramInt)
  {
    if ((paramInt == 15) || (paramInt < 0) || (paramInt >= this.K.b())) {
      return Q();
    }
    return this.K.a(paramInt);
  }
  
  String g(int paramInt)
  {
    for (int i1 = this.I.size() - 1; i1 >= 0; i1--)
    {
      zzw localzzw = (zzw)this.I.get(i1);
      if (paramInt == localzzw.b()) {
        return localzzw.a();
      }
    }
    return "";
  }
  
  zzw h(int paramInt)
  {
    for (int i1 = this.I.size() - 1; i1 >= 0; i1--)
    {
      zzw localzzw = (zzw)this.I.get(i1);
      if (paramInt == localzzw.b()) {
        return localzzw;
      }
    }
    return null;
  }
  
  public int addCopy(String sheetName)
    throws Exception
  {
    for (int i1 = 0; i1 < getCount(); i1++) {
      if (zw.b(get(i1).getName(), sheetName)) {
        return addCopy(i1);
      }
    }
    throw new CellsException(15, "Invalid worksheet name.");
  }
  
  public int addCopy(int sheetIndex)
    throws Exception
  {
    if ((sheetIndex < 0) || (sheetIndex > this.InnerList.size() - 1)) {
      throw new IllegalArgumentException("Parameter name: Invalid sheet index.");
    }
    p().a();
    int i1 = add();
    Worksheet localWorksheet1 = get(i1);
    Worksheet localWorksheet2 = (Worksheet)this.InnerList.get(sheetIndex);
    localWorksheet1.copy(localWorksheet2);
    return i1;
  }
  
  void b(WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    this.s = null;
    int i1 = getCount();
    for (int i2 = 0; i2 < paramWorksheetCollection.getCount(); i2++)
    {
      String str = paramWorksheetCollection.get(i2).getName();
      if (get(str) != null) {
        str = zamm.a(this, str);
      }
      c(str);
    }
    CopyOptions localCopyOptions = new CopyOptions(3, paramWorksheetCollection.p(), p());
    localCopyOptions.setCopyNames(false);
    localCopyOptions.b(i1);
    localCopyOptions.a(i1);
    for (int i3 = 0; i3 < paramWorksheetCollection.getCount(); i3++) {
      get(i3 + i1).copy(paramWorksheetCollection.get(i3), localCopyOptions);
    }
  }
  
  zboz z()
  {
    return this.G;
  }
  
  ArrayList A()
  {
    return this.H;
  }
  
  Font i(int paramInt)
  {
    if (paramInt > this.H.size()) {
      return null;
    }
    return (Font)A().get(paramInt > 4 ? paramInt - 1 : paramInt);
  }
  
  Font j(int paramInt)
  {
    if (paramInt < 0) {
      return null;
    }
    if (paramInt > 4) {
      paramInt--;
    }
    if (paramInt >= this.H.size()) {
      return null;
    }
    return (Font)A().get(paramInt);
  }
  
  ArrayList B()
  {
    return this.I;
  }
  
  public DxfCollection getDxfs()
  {
    return this.J;
  }
  
  zajm C()
  {
    return this.K;
  }
  
  void a(zajm paramzajm)
  {
    this.K = paramzajm;
  }
  
  int a(Style paramStyle)
  {
    return this.K.a(paramStyle);
  }
  
  private void b(SaveOptions paramSaveOptions)
  {
    getDxfs().a();
    for (int i1 = this.K.b() - 1; i1 > -1; i1--)
    {
      Style localStyle = this.K.a(i1);
      if (localStyle != null)
      {
        c(localStyle);
        if ((localStyle.s() != null) && (!"".equals(localStyle.s()))) {
          localStyle.f(d(localStyle.s()));
        }
      }
    }
    i1 = 0;
    switch (paramSaveOptions.getSaveFormat())
    {
    case 5: 
    case 14: 
      if (paramSaveOptions.getSaveFormat() == 5) {
        i1 = 1;
      }
      break;
    }
    d(i1);
    ak();
  }
  
  private void aj()
  {
    ((zbzv)this.K).clear();
    this.H.clear();
    this.I.clear();
    this.B.a();
  }
  
  private void c(Style paramStyle)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.H.size(); i2++)
    {
      Font localFont = (Font)this.H.get(i2);
      if (paramStyle.getFont().a(localFont))
      {
        if (i2 < 4) {
          paramStyle.getFont().d(i2);
        } else {
          paramStyle.getFont().d(i2 + 1);
        }
        i1 = 1;
        break;
      }
    }
    if (i1 == 0)
    {
      zf.a(this.H, paramStyle.getFont());
      paramStyle.getFont().d(this.H.size());
    }
  }
  
  void a(Font paramFont)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.H.size(); i2++)
    {
      Font localFont = (Font)this.H.get(i2);
      if (paramFont.a(localFont))
      {
        if (i2 < 4) {
          paramFont.d(i2);
        } else {
          paramFont.d(i2 + 1);
        }
        i1 = 1;
        break;
      }
    }
    if (i1 == 0)
    {
      zf.a(this.H, paramFont);
      paramFont.d(this.H.size());
    }
  }
  
  int b(Font paramFont)
  {
    for (int i1 = 0; i1 < this.H.size(); i1++)
    {
      Font localFont = (Font)this.H.get(i1);
      if (paramFont.a(localFont))
      {
        if (i1 < 4) {
          return i1;
        }
        return i1 + 1;
      }
    }
    i1 = zf.a(this.H, paramFont);
    if (i1 < 4) {
      return i1;
    }
    return i1 + 1;
  }
  
  int d(String paramString)
  {
    for (int i1 = 0; i1 < this.I.size(); i1++)
    {
      zzw localzzw2 = (zzw)this.I.get(i1);
      if (zw.b(paramString, localzzw2.a())) {
        return localzzw2.b();
      }
    }
    if ((this.E & 0xFFFF) < 176) {
      this.E = 176;
    }
    this.E += 1;
    zzw localzzw1 = new zzw();
    localzzw1.a(paramString, this.E);
    zf.a(this.I, localzzw1);
    return this.E;
  }
  
  void e(String paramString)
  {
    int i1 = 0;
    if (this.h != null)
    {
      if ((this.h.c != null) && (this.h.c.a != null))
      {
        if (!this.h.a().a(paramString)) {
          throw new CellsException(8, "Invalid password.");
        }
        this.h = null;
        return;
      }
      i1 = this.h.b();
    }
    if ((paramString == null) || ("".equals(paramString)))
    {
      if ((i1 & 0xFFFF) != 0) {
        throw new CellsException(8, "This workbook is protected with password.");
      }
    }
    else if ((i1 & 0xFFFF) != 0)
    {
      int i2 = zui.a(paramString);
      if (i1 != i2) {
        throw new CellsException(8, "Invalid password.");
      }
    }
    this.h = null;
  }
  
  zbyy D()
  {
    if (this.h == null) {
      this.h = new zbyy();
    }
    return this.h;
  }
  
  private void b(int paramInt, String paramString)
  {
    zbyy localzbyy = null;
    switch (paramInt)
    {
    case 4: 
      localzbyy = D();
      localzbyy.b = true;
      localzbyy.a = false;
      break;
    case 5: 
      localzbyy = D();
      localzbyy.b = false;
      localzbyy.a = true;
      break;
    case 0: 
      localzbyy = D();
      localzbyy.b = (localzbyy.a = 1);
      break;
    default: 
      return;
    }
    if ((paramString != null) && (!"".equals(paramString))) {
      localzbyy.a(zui.a(paramString));
    } else {
      localzbyy.a(0);
    }
  }
  
  int E()
  {
    if (this.h == null) {
      return 6;
    }
    if (this.h.b)
    {
      if (this.h.a) {
        return 0;
      }
      return 4;
    }
    if (this.h.a) {
      return 5;
    }
    return 6;
  }
  
  void a(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case 1: 
    case 2: 
    case 3: 
      return;
    }
    if ((this.h != null) && ((this.h.b() & 0xFFFF) != 0))
    {
      if (F()) {
        throw new CellsException(6, "This workbook is already protected, please unprotected it first.");
      }
      b(paramInt, paramString);
    }
    else
    {
      b(paramInt, paramString);
    }
  }
  
  boolean F()
  {
    if (this.h != null) {
      return (this.h.b) || (this.h.a);
    }
    return false;
  }
  
  VbaProject G()
  {
    return this.k;
  }
  
  void a(VbaProject paramVbaProject)
  {
    this.k = paramVbaProject;
  }
  
  VbaProject H()
  {
    if (this.k != null) {
      try
      {
        this.k.e();
      }
      catch (Exception localException) {}
    }
    return this.k;
  }
  
  zbpq I()
  {
    return this.L;
  }
  
  zbpq J()
  {
    if (null == this.L) {
      this.L = new zbpq(this);
    }
    return this.L;
  }
  
  zbpy K()
  {
    if (null == this.M) {
      this.M = new zbpy(this);
    }
    return this.M;
  }
  
  zse L()
  {
    if (this.N == null) {
      this.N = new zse(this, 0);
    }
    return this.N;
  }
  
  zse M()
  {
    return this.N;
  }
  
  void a(zse paramzse)
  {
    this.N = paramzse;
  }
  
  zse N()
  {
    if (this.O == null) {
      this.O = new zse(this, 1);
    }
    return this.O;
  }
  
  zse O()
  {
    return this.O;
  }
  
  static void a(WorksheetCollection paramWorksheetCollection, FontSettingCollection paramFontSettingCollection, int paramInt)
  {
    if (paramFontSettingCollection == null) {
      return;
    }
    paramFontSettingCollection.l();
    Iterator localIterator = paramFontSettingCollection.iterator();
    while (localIterator.hasNext())
    {
      FontSetting localFontSetting = (FontSetting)localIterator.next();
      if (localFontSetting.h() != null)
      {
        Font localFont1 = localFontSetting.h();
        int i1 = 1;
        if ((localFontSetting.g() >= 0) && (localFontSetting.g() < paramWorksheetCollection.H.size()))
        {
          int i2 = localFontSetting.r;
          if (i2 > 4) {
            i2--;
          }
          Font localFont2 = (Font)paramWorksheetCollection.H.get(i2);
          if (localFont1.a(localFont2))
          {
            i1 = 0;
            localFont1.d(localFontSetting.r);
          }
        }
        if (i1 != 0) {
          paramWorksheetCollection.a(localFont1);
        }
      }
      else
      {
        localFontSetting.r = paramInt;
      }
    }
  }
  
  private void d(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < getCount(); i1++)
    {
      Worksheet localWorksheet = (Worksheet)this.InnerList.get(i1);
      if (paramBoolean)
      {
        CommentCollection localCommentCollection = localWorksheet.getComments();
        int i2 = 0;
        if (localCommentCollection.getCount() != 0)
        {
          Font localFont = new Font(this, null, true);
          localFont.setSize(8);
          localFont.setBold(true);
          a(localFont);
          i2 = localFont.m();
        }
        for (int i3 = 0; i3 < localCommentCollection.getCount(); i3++)
        {
          Comment localComment = localCommentCollection.get(i3);
          a(this, localComment.b(), i2);
        }
        if (localWorksheet.getType() == 2) {
          localWorksheet.getCharts().get(0).a(this.H);
        } else if (localWorksheet.w() != null) {
          localWorksheet.getShapes().b();
        }
      }
      else if (localWorksheet.getType() == 2)
      {
        localWorksheet.getCharts().get(0).a(this.H);
      }
      else if (localWorksheet.w() != null)
      {
        localWorksheet.getShapes().c();
      }
    }
  }
  
  private void ak()
  {
    Object localObject1;
    Object localObject2;
    for (int i1 = 0; i1 < getDxfs().getCount(); i1++)
    {
      localObject1 = getDxfs().get(i1);
      if (((Style)localObject1).isModified(24))
      {
        localObject2 = ((Style)localObject1).s();
        if ((localObject2 != null) && (!"".equals(localObject2))) {
          ((Style)localObject1).f(d((String)localObject2));
        }
      }
    }
    Iterator localIterator1 = this.InnerList.iterator();
    while (localIterator1.hasNext())
    {
      localObject1 = (Worksheet)localIterator1.next();
      Object localObject3;
      Iterator localIterator2;
      Object localObject4;
      if (this.Y.getFileFormat() != 6)
      {
        localObject2 = ((Worksheet)localObject1).getCharts().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Chart)((Iterator)localObject2).next();
          ((Chart)localObject3).H();
          if ((((Chart)localObject3).p() != null) && (((Chart)localObject3).getShapes().getCount() > 0))
          {
            localIterator2 = ((Chart)localObject3).getShapes().iterator();
            while (localIterator2.hasNext())
            {
              localObject4 = (Shape)localIterator2.next();
              if (((Shape)localObject4).getMsoDrawingType() == 5) {
                ((ChartShape)localObject4).a().H();
              }
            }
          }
        }
      }
      if ((((Worksheet)localObject1).b != null) && (((Worksheet)localObject1).b.getCount() > 0))
      {
        localObject2 = ((Worksheet)localObject1).b.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (PivotTable)((Iterator)localObject2).next();
          String str;
          if (((PivotTable)localObject3).getDataFields().getCount() > 0)
          {
            localIterator2 = ((PivotTable)localObject3).getDataFields().a.iterator();
            while (localIterator2.hasNext())
            {
              localObject4 = (PivotField)localIterator2.next();
              str = ((PivotField)localObject4).getNumberFormat();
              if ((str != null) && (!"".equals(str))) {
                ((PivotField)localObject4).c(d(str));
              }
            }
          }
          if (((PivotTable)localObject3).getBaseFields().getCount() > 0)
          {
            localIterator2 = ((PivotTable)localObject3).getBaseFields().a.iterator();
            while (localIterator2.hasNext())
            {
              localObject4 = (PivotField)localIterator2.next();
              str = ((PivotField)localObject4).getNumberFormat();
              if ((str != null) && (!"".equals(str))) {
                ((PivotField)localObject4).c(d(str));
              }
            }
          }
        }
      }
    }
  }
  
  public Range getRangeByName(String rangeName)
  {
    int i1 = -1;
    int i2 = rangeName.lastIndexOf("!");
    if (i2 != -1)
    {
      String str = rangeName.substring(0, 0 + i2);
      if ((str == null) || ("".equals(str))) {
        return null;
      }
      if (str.charAt(0) == '\'') {
        str = str.substring(1, 1 + (str.length() - 2));
      }
      for (int i4 = 0; i4 < getCount(); i4++) {
        if (zw.b(str, get(i4).getName()))
        {
          i1 = i4;
          break;
        }
      }
      if (i1 == -1) {
        return null;
      }
      rangeName = rangeName.substring(i2 + 1);
      if ((rangeName == null) || ("".equals(rangeName))) {
        return null;
      }
    }
    int i3 = this.t.a(rangeName, i1, i1 == -1);
    if (i3 >= 0)
    {
      Name localName = this.t.get(i3);
      return localName.getRange();
    }
    return null;
  }
  
  Range f(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return null;
    }
    String str = null;
    int i3;
    if (paramString.charAt(0) == '\'')
    {
      char[] arrayOfChar = paramString.toCharArray();
      int i2 = 0;
      for (i3 = 1; i3 < arrayOfChar.length; i3++) {
        if (arrayOfChar[i3] == '\'')
        {
          i3++;
          if (i3 == arrayOfChar.length) {
            break;
          }
          if (arrayOfChar[i3] == '\'')
          {
            arrayOfChar[(i2++)] = '\'';
          }
          else
          {
            if (arrayOfChar[i3] != '!') {
              break;
            }
            if (i3 == arrayOfChar.length - 1) {
              return null;
            }
            str = new String(arrayOfChar, 0, i2);
            paramString = paramString.substring(i3 + 1);
            break;
          }
        }
        else
        {
          arrayOfChar[(i2++)] = arrayOfChar[i3];
        }
      }
    }
    else
    {
      i1 = paramString.indexOf("!");
      if (i1 == 0) {
        return null;
      }
      if (i1 > 0)
      {
        if (i1 == paramString.length() - 1) {
          return null;
        }
        str = paramString.substring(0, 0 + i1);
        paramString = paramString.substring(i1 + 1);
      }
    }
    if (str != null)
    {
      for (i1 = 0; i1 < getCount(); i1++) {
        if (zw.b(str, get(i1).getName()))
        {
          str = null;
          break;
        }
      }
      if (str != null) {
        return null;
      }
    }
    paramString = paramString.toLowerCase();
    for (int i1 = getCount() - 1; i1 > -1; i1--)
    {
      ListObjectCollection localListObjectCollection = get(i1).getListObjects();
      if (localListObjectCollection.getCount() > 0) {
        for (i3 = localListObjectCollection.getCount() - 1; i3 > -1; i3--)
        {
          ListObject localListObject = localListObjectCollection.get(i3);
          if (zw.b(localListObject.o().toLowerCase(), paramString))
          {
            Range localRange = new Range(localListObject.getStartRow(), localListObject.getStartColumn(), localListObject.getEndRow() - localListObject.getStartRow() + 1, localListObject.getEndColumn() - localListObject.getStartColumn() + 1, get(i1).getCells());
            localRange.a(localListObject.o());
            localRange.c = localListObject;
            return localRange;
          }
        }
      }
    }
    return null;
  }
  
  public Range[] getNamedRanges()
  {
    if (this.t.getCount() == 0) {
      return null;
    }
    return this.t.a(this);
  }
  
  public Range[] getNamedRangesAndTables()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.t.getCount() != 0)
    {
      Range[] arrayOfRange1 = this.t.a(this);
      if (arrayOfRange1 != null) {
        zf.b(localArrayList, arrayOfRange1);
      }
    }
    for (int i1 = 0; i1 < getCount(); i1++)
    {
      ListObjectCollection localListObjectCollection = get(i1).getListObjects();
      if (localListObjectCollection.getCount() > 0) {
        for (int i2 = 0; i2 < localListObjectCollection.getCount(); i2++)
        {
          ListObject localListObject = localListObjectCollection.get(i2);
          Range localRange = new Range(localListObject.getStartRow(), localListObject.getStartColumn(), localListObject.getEndRow() - localListObject.getStartRow() + 1, localListObject.getEndColumn() - localListObject.getStartColumn() + 1, get(i1).getCells());
          localRange.a(localListObject.b());
          zf.a(localArrayList, localRange);
        }
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    Range[] arrayOfRange2 = new Range[localArrayList.size()];
    zf.a(localArrayList, arrayOfRange2);
    return arrayOfRange2;
  }
  
  int P()
  {
    return this.P;
  }
  
  void k(int paramInt)
  {
    this.P = paramInt;
  }
  
  Style Q()
  {
    if (this.Q == null)
    {
      this.Q = new Style(this);
      this.Q.a(this, 15);
    }
    return this.Q;
  }
  
  void b(Style paramStyle)
  {
    if (paramStyle == null) {
      return;
    }
    paramStyle.a(this);
    Style localStyle = this.K.a(0);
    localStyle.copy(paramStyle);
    this.H.set(0, localStyle.getFont());
    localStyle.a(false);
    localStyle.a((byte)-1);
    localStyle.a(4095);
    this.Q = paramStyle;
    if (!paramStyle.g())
    {
      this.Q = new Style(this);
      this.Q.copy(paramStyle);
      this.Q.a(0);
      this.Q.a(true);
    }
    this.K.a(15, this.Q);
    V();
  }
  
  public XmlMapCollection getXmlMaps()
  {
    if (this.R == null) {
      this.R = new XmlMapCollection(this);
    }
    return this.R;
  }
  
  public void setXmlMaps(XmlMapCollection value)
  {
    this.R = value;
  }
  
  BuiltInDocumentPropertyCollection R()
  {
    return this.S;
  }
  
  public BuiltInDocumentPropertyCollection getBuiltInDocumentProperties()
  {
    if (this.S == null) {
      this.S = new BuiltInDocumentPropertyCollection();
    }
    return this.S;
  }
  
  CustomDocumentPropertyCollection S()
  {
    return this.T;
  }
  
  public CustomDocumentPropertyCollection getCustomDocumentProperties()
  {
    if (this.T == null) {
      this.T = new CustomDocumentPropertyCollection(this);
    }
    return this.T;
  }
  
  Font T()
  {
    return this.K.a(15).getFont();
  }
  
  int U()
  {
    return this.U;
  }
  
  void V()
  {
    Font localFont = (Font)A().get(0);
    if (localFont.getDoubleSize() == 0.0D) {
      throw new CellsException(6, "Default font size is 0.");
    }
    int[] arrayOfInt = zn.a(localFont.getName(), localFont.getDoubleSize(), localFont.p());
    this.U = arrayOfInt[1];
    this.a = (arrayOfInt[0] * 72.0F / zbxp.a() * 20.0F);
    for (int i1 = 0; i1 < getCount(); i1++) {
      get(i1).E();
    }
  }
  
  public Object getOleSize()
  {
    return this.l;
  }
  
  public void setOleSize(Object value)
  {
    this.l = value;
  }
  
  public void setOleSize(int startRow, int endRow, int startColumn, int endColumn)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = startRow;
    localCellArea.EndRow = endRow;
    localCellArea.StartColumn = startColumn;
    localCellArea.EndColumn = endColumn;
    this.l = localCellArea;
  }
  
  public ExternalLinkCollection getExternalLinks()
  {
    return this.V;
  }
  
  zawq W()
  {
    if (this.W == null) {
      this.W = new zawq(this);
    }
    return this.W;
  }
  
  zawq X()
  {
    return this.W;
  }
  
  DxfCollection Y()
  {
    if (null == this.X) {
      this.X = new DxfCollection(this);
    }
    return this.X;
  }
  
  TableStyleCollection Z()
  {
    return this.Z;
  }
  
  public TableStyleCollection getTableStyles()
  {
    if (this.Z == null) {
      this.Z = new TableStyleCollection(this);
    }
    return this.Z;
  }
  
  zbqg aa()
  {
    if (this.aa == null) {
      this.aa = new zbqg();
    }
    return this.aa;
  }
  
  zbqg ab()
  {
    return this.aa;
  }
  
  String ac()
  {
    if (this.ab == null) {
      this.ab = zo.a();
    }
    return this.ab;
  }
  
  void a(byte paramByte)
  {
    for (int i1 = getCount() - 1; i1 > -1; i1--) {
      ((Worksheet)this.InnerList.get(i1)).getCells().a.a(paramByte);
    }
  }
  
  void ad()
  {
    for (int i1 = getCount() - 1; i1 > -1; i1--) {
      ((Worksheet)this.InnerList.get(i1)).getCells().a.a();
    }
  }
  
  void ae()
  {
    for (int i1 = 0; i1 < this.t.getCount(); i1++)
    {
      Name localName = this.t.get(i1);
      localName.q();
    }
  }
  
  void af()
  {
    Object localObject;
    for (int i1 = 0; i1 < this.t.getCount(); i1++)
    {
      localObject = this.t.get(i1);
      if (((Name)localObject).b.a != null) {
        ((Name)localObject).b.a.a(null);
      }
    }
    if (this.D != null) {
      for (i1 = this.D.getCount() - 1; i1 > -1; i1--)
      {
        localObject = this.D.a(i1);
        if (!((zbti)localObject).e())
        {
          ArrayList localArrayList = ((zbti)localObject).b();
          for (int i2 = localArrayList.size() - 1; i2 > -1; i2--)
          {
            zwh localzwh = (zwh)localArrayList.get(i2);
            if (localzwh.a.a != null) {
              localzwh.a.a.a(null);
            }
          }
        }
      }
    }
  }
  
  public void clearPivottables()
  {
    if (this.W != null) {
      this.W = null;
    }
    for (int i1 = 0; i1 < getCount(); i1++) {
      get(i1).getPivotTables().clear();
    }
  }
  
  zbcj ag()
  {
    if (this.m == null) {
      this.m = new zbcj(this.Y);
    }
    return this.m;
  }
  
  zbcj ah()
    throws Exception
  {
    if (this.m == null)
    {
      this.m = new zbcj(this.Y);
      if (this.u != null)
      {
        zh localzh = this.u.a().a("Revision Log");
        if (localzh != null)
        {
          this.u.a().g("Revision Log");
          this.u.a().g("User Names");
          if (localzh.h() > 2L)
          {
            zcah localzcah = new zcah(new zqj(localzh), this);
            localzcah.a();
          }
        }
        h().a().a("Revision Log");
      }
    }
    return this.m;
  }
  
  zacc ai()
  {
    if (p().h()) {
      return new zace();
    }
    return new zacd();
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < getCount(); i1++)
    {
      Worksheet localWorksheet = get(i1);
      Cells localCells = localWorksheet.getCells();
      if (localCells.a.c > 0)
      {
        zaai[] arrayOfzaai = localCells.a.b;
        for (int i2 = localCells.a.d - 1; i2 > -1; i2--) {
          if (arrayOfzaai[i2] != null) {
            arrayOfzaai[i2].a(this, paramInt1, paramInt2);
          }
        }
      }
      if ((localWorksheet.d != null) && (localWorksheet.d.getCount() != 0)) {
        localWorksheet.d.f(paramInt1, paramInt2);
      }
      if ((localWorksheet.l != null) && (localWorksheet.l.getCount() > 0)) {
        localWorksheet.l.b(paramInt1, paramInt2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WorksheetCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */