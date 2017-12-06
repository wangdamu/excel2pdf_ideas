package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

class zabz
{
  zbwt a = new zbwt();
  zbwr b = new zbwr();
  zbws c = new zbws();
  private boolean P;
  public Workbook d;
  public WorksheetCollection e;
  public int f;
  public boolean g;
  public zzx h;
  public boolean i;
  public boolean j;
  public double k;
  public DateTime l;
  public boolean m;
  public int n;
  public boolean o;
  public int p;
  public Encoding q;
  public boolean r;
  public boolean s = false;
  public int t = 1;
  public HashMap u;
  public HashMap v;
  public HashMap w;
  public HashMap x;
  public HashMap y;
  public boolean z = false;
  public short A;
  public zaak[][] B;
  public zbvk C;
  public long[] D;
  public int E = 0;
  public int F;
  public zaqg[] G;
  public int[] H;
  public int I = 0;
  public long[] J;
  public int K = 0;
  public CalculationOptions L;
  public Random M;
  public zaah N;
  private int Q;
  public int O = -1;
  private int R = -1;
  private zkv S;
  
  void a()
  {
    if (this.S != null)
    {
      this.S.a();
      this.S = null;
    }
    if (this.C != null)
    {
      this.C.dispose();
      this.C = null;
    }
    if (this.u != null) {
      this.u.clear();
    }
    if (this.v != null) {
      this.v.clear();
    }
    if (this.w != null) {
      this.w.clear();
    }
    if (this.x != null) {
      this.x.clear();
    }
    if (this.y != null) {
      this.y.clear();
    }
    this.a.a();
    this.b.a();
    this.c.a();
  }
  
  public zabz(Workbook paramWorkbook, int paramInt, CalculationOptions paramCalculationOptions)
  {
    this.d = paramWorkbook;
    this.L = paramCalculationOptions;
    this.e = paramWorkbook.getWorksheets();
    WorkbookSettings localWorkbookSettings = paramWorkbook.getSettings();
    this.f = this.e.v();
    this.g = (!paramWorkbook.h());
    this.h = localWorkbookSettings.f();
    if (localWorkbookSettings.getDate1904())
    {
      this.i = true;
      this.l = znq.n;
      this.k = znq.r;
    }
    else
    {
      this.i = false;
      this.l = znq.p;
      this.k = znq.q;
    }
    this.j = localWorkbookSettings.getPrecisionAsDisplayed();
    if (localWorkbookSettings.getIteration())
    {
      this.n = localWorkbookSettings.getMaxIteration();
      this.m = (this.n > 0);
    }
    else
    {
      this.n = 0;
      this.m = false;
    }
    this.p = paramInt;
    if (paramInt == 3) {
      this.P = true;
    }
    this.o = localWorkbookSettings.getCreateCalcChain();
    if (paramCalculationOptions != null)
    {
      this.Q = (paramCalculationOptions.f > -1 ? paramCalculationOptions.f : localWorkbookSettings.getCalcStackSize());
      this.F = this.Q;
      if (this.P)
      {
        this.E = -1;
      }
      else
      {
        this.D = new long[this.Q << 1];
        this.E = 0;
        this.S = new zkv(this.L.a());
        this.G = new zaqg[8];
        this.H = new int[this.G.length];
        if (this.o) {
          this.J = new long[16];
        }
      }
      if (paramCalculationOptions.j != null) {
        this.q = paramCalculationOptions.j;
      } else {
        this.q = m();
      }
      switch (this.h.e())
      {
      case 4: 
      case 17: 
      case 18: 
      case 1028: 
      case 1041: 
      case 1042: 
      case 2052: 
      case 3076: 
      case 4100: 
      case 5124: 
      case 31748: 
        this.r = true;
        break;
      default: 
        this.r = false;
        break;
      }
    }
    else
    {
      this.q = m();
      this.r = false;
    }
  }
  
  public zabz(Workbook paramWorkbook)
  {
    this(paramWorkbook, 0, null);
  }
  
  zkv b()
  {
    if ((this.P) && (this.S == null)) {
      this.S = new zkv(this.L.a());
    }
    return this.S;
  }
  
  Random c()
  {
    if (this.M == null) {
      this.M = zit.b();
    }
    return this.M;
  }
  
  void a(int paramInt)
  {
    if ((this.v == null) || (this.v.size() < 1)) {
      return;
    }
    long[] arrayOfLong = new long[this.v.size()];
    int i1 = 0;
    Iterator localIterator = this.v.keySet().iterator();
    while (localIterator.hasNext()) {
      arrayOfLong[(i1++)] = ((Long)localIterator.next()).longValue();
    }
    for (i1 = 0; i1 < arrayOfLong.length; i1++)
    {
      long l1 = arrayOfLong[i1];
      int i2 = (int)(l1 & 0xFF);
      if ((i2 == paramInt) || (a((zfh)this.v.get(Long.valueOf(l1)), i2))) {
        this.v.remove(Long.valueOf(l1));
      }
    }
  }
  
  private boolean a(zfh paramzfh, int paramInt)
  {
    return this.e.get(paramInt).getCells().a(paramzfh.b, paramzfh.b.StartRow, paramzfh.b.StartColumn, new zhi(true, true, false, false), false, true) == null;
  }
  
  void a(Object paramObject, zfh paramzfh)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    this.v.put(paramObject, paramzfh);
  }
  
  zfh a(Object paramObject)
  {
    if (this.v == null) {
      return null;
    }
    return (zfh)this.v.get(paramObject);
  }
  
  void b(Object paramObject)
  {
    if (this.v == null) {
      return;
    }
    this.v.remove(paramObject);
  }
  
  int d()
  {
    this.F += this.Q;
    if (this.F > this.D.length)
    {
      long[] arrayOfLong = new long[this.D.length + this.Q];
      System.arraycopy(this.D, 0, arrayOfLong, 0, this.E);
      this.D = arrayOfLong;
    }
    this.R = -1;
    if (this.I > 0) {
      for (int i1 = this.I - 1; i1 > -1; i1--)
      {
        if (this.H[i1] < this.t) {
          return i1;
        }
        this.G[i1].b = false;
      }
    }
    return -1;
  }
  
  void e()
  {
    this.F = this.Q;
  }
  
  int b(int paramInt)
  {
    return Math.min(this.Q, this.F - paramInt);
  }
  
  void c(int paramInt)
  {
    this.F = (this.E + paramInt);
    if (this.F > this.D.length)
    {
      long[] arrayOfLong = new long[this.D.length + this.Q];
      System.arraycopy(this.D, 0, arrayOfLong, 0, this.E);
      this.D = arrayOfLong;
    }
  }
  
  void a(long paramLong)
  {
    if (this.L.n.c()) {
      this.L.n.b.append('|');
    }
    if ((this.P) && (this.E < 0))
    {
      this.D = new long[this.Q << 1];
      this.D[0] = paramLong;
      this.E = 1;
    }
    else
    {
      this.D[this.E] = paramLong;
      this.E += 1;
      if (this.E == this.F) {
        throw new zgi();
      }
    }
  }
  
  void f()
  {
    if ((this.I > 0) && (this.H[(this.I - 1)] >= this.E))
    {
      this.G[(this.I - 1)].b = false;
      for (this.I -= 2; (this.I > -1) && (this.H[this.I] >= this.E); this.I -= 1) {
        this.G[this.I].b = false;
      }
      this.I += 1;
    }
    this.E -= 1;
    if ((this.z) && (this.C != null)) {
      this.C.a(this);
    }
    if ((this.L.n.c()) && (this.L.n.b.length() > 0)) {
      this.L.n.b.setLength(this.L.n.b.length() - 1);
    }
  }
  
  long g()
  {
    if ((this.I > 0) && (this.H[(this.I - 1)] >= this.E))
    {
      this.G[(this.I - 1)].b = false;
      for (this.I -= 2; (this.I > -1) && (this.H[this.I] >= this.E); this.I -= 1) {
        this.G[this.I].b = false;
      }
      this.I += 1;
    }
    this.E -= 1;
    if ((this.L.n.c()) && (this.L.n.b.length() > 0)) {
      this.L.n.b.setLength(this.L.n.b.length() - 1);
    }
    return this.D[this.E];
  }
  
  void a(zaqg paramzaqg)
  {
    if ((this.P) && (this.G == null))
    {
      this.G = new zaqg[8];
      this.H = new int[this.G.length];
    }
    else if (this.I == this.G.length)
    {
      zaqg[] arrayOfzaqg = new zaqg[this.G.length << 1];
      System.arraycopy(this.G, 0, arrayOfzaqg, 0, this.G.length);
      this.G = arrayOfzaqg;
      int[] arrayOfInt = new int[arrayOfzaqg.length];
      System.arraycopy(this.H, 0, arrayOfInt, 0, this.H.length);
      this.H = arrayOfInt;
    }
    paramzaqg.b = true;
    this.G[this.I] = paramzaqg;
    this.H[this.I] = this.E;
    this.I += 1;
  }
  
  zaqg h()
  {
    zaqg localzaqg = this.G[(--this.I)];
    localzaqg.b = false;
    return localzaqg;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    while (this.E > paramInt1)
    {
      this.E -= 1;
      long l1 = this.D[this.E];
      this.e.get(zaai.a(l1)).getCells().a.a(zaai.b(l1)).a((byte)0);
    }
    this.F = paramInt2;
  }
  
  void a(zaai paramzaai, int paramInt)
  {
    if (this.O > -1)
    {
      long l1 = zaai.a(paramInt, paramzaai.a);
      int i1;
      if (this.O << 1 < this.E)
      {
        for (i1 = this.O - 1; i1 > -1; i1--) {
          if (this.D[i1] == l1) {
            throw new zgh(1, Long.valueOf(l1));
          }
        }
      }
      else
      {
        i1 = 1;
        for (int i2 = this.O; i2 < this.E; i2++) {
          if (this.D[i2] == l1)
          {
            i1 = 0;
            break;
          }
        }
        if (i1 != 0) {
          throw new zgh(1, Long.valueOf(l1));
        }
      }
    }
    if ((this.s) && (this.E <= this.t)) {
      return;
    }
    throw new zge(paramInt, paramzaai);
  }
  
  void i()
  {
    do
    {
      this.D[(this.t - 1)] = this.D[this.t];
      this.t += 1;
    } while (this.t != this.E);
    this.E -= 1;
  }
  
  long[] d(int paramInt)
  {
    if (this.E == paramInt + 1) {
      return new long[] { this.D[paramInt] };
    }
    long[] arrayOfLong1 = new long[this.E - paramInt];
    long[] arrayOfLong2 = new long[arrayOfLong1.length];
    long l1 = this.D[paramInt];
    int i1 = zaai.a(l1);
    Worksheet localWorksheet = this.e.get(i1);
    zaai localzaai = localWorksheet.getCells().a.a(zaai.b(l1));
    arrayOfLong1[0] = Cell.a(zaai.a(l1), localzaai.e, localzaai.f);
    arrayOfLong2[0] = l1;
    if (this.L.n.a)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Circular chain[");
      localStringBuilder1.append(arrayOfLong1.length);
      localStringBuilder1.append("]: ");
      a(localStringBuilder1, this.D, paramInt, this.E, "->");
      zl.a(zs.a(localStringBuilder1));
    }
    for (int i3 = 1; i3 < arrayOfLong1.length; i3++)
    {
      l1 = this.D[(i3 + paramInt)];
      i1 = zaai.a(l1);
      localWorksheet = this.e.get(i1);
      localzaai = localWorksheet.getCells().a.a(zaai.b(l1));
      long l2 = Cell.a(zaai.a(l1), localzaai.e, localzaai.f);
      int i2 = za.a(arrayOfLong1, 0, i3, l2);
      if (i2 < 0) {
        i2 = -i2 - 1;
      }
      if (i2 < i3)
      {
        System.arraycopy(arrayOfLong1, i2, arrayOfLong1, i2 + 1, i3 - i2);
        arrayOfLong1[i2] = l2;
        System.arraycopy(arrayOfLong2, i2, arrayOfLong2, i2 + 1, i3 - i2);
        arrayOfLong2[i2] = l1;
      }
      else
      {
        arrayOfLong1[i2] = l2;
        arrayOfLong2[i2] = l1;
      }
    }
    if (this.L.n.a)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("After sorting: ");
      a(localStringBuilder2, arrayOfLong2, 0, arrayOfLong2.length, "->");
      zl.a(zs.a(localStringBuilder2));
    }
    return arrayOfLong2;
  }
  
  void a(StringBuilder paramStringBuilder, long[] paramArrayOfLong, int paramInt1, int paramInt2, String paramString)
  {
    long l1 = paramArrayOfLong[paramInt1];
    int i1 = zaai.a(l1);
    Worksheet localWorksheet = this.e.get(i1);
    zaai localzaai1 = localWorksheet.getCells().a.a(zaai.b(l1));
    paramStringBuilder.append(localWorksheet.getName());
    paramStringBuilder.append('!');
    CellsHelper.a(paramStringBuilder, localzaai1.e, localzaai1.f);
    paramInt1++;
    while (paramInt1 < paramInt2)
    {
      paramStringBuilder.append(paramString);
      l1 = paramArrayOfLong[paramInt1];
      int i2 = zaai.a(l1);
      localWorksheet = this.e.get(i2);
      if (i2 != i1)
      {
        i1 = i2;
        paramStringBuilder.append(localWorksheet.getName());
        paramStringBuilder.append('!');
      }
      zaai localzaai2 = localWorksheet.getCells().a.a(zaai.b(l1));
      CellsHelper.a(paramStringBuilder, localzaai2.e, localzaai2.f);
      paramInt1++;
    }
    zl.a(zs.a(paramStringBuilder));
  }
  
  void e(int paramInt)
  {
    this.s = false;
    int i1 = this.E - paramInt;
    if (this.o) {
      if ((this.P) && (this.J == null))
      {
        this.J = new long[Math.max(16, i1)];
      }
      else if (this.J.length < this.K + i1)
      {
        long[] arrayOfLong = new long[Math.max(this.J.length << 1, this.J.length + i1)];
        System.arraycopy(this.J, 0, arrayOfLong, 0, this.K);
        this.J = arrayOfLong;
      }
    }
    while (paramInt < this.E)
    {
      long l1 = this.D[paramInt];
      if (this.o)
      {
        this.J[this.K] = l1;
        this.K += 1;
      }
      this.e.get(zaai.a(l1)).getCells().a.a(zaai.b(l1)).a((byte)2);
      paramInt++;
    }
    this.E -= i1;
  }
  
  void j()
  {
    for (int i1 = 0; i1 < this.K; i1++)
    {
      long l1 = this.J[i1];
      this.e.get(zaai.a(l1)).getCells().a.a(zaai.b(l1)).a((byte)0);
    }
  }
  
  void a(long paramLong, zaie paramzaie)
  {
    if (this.z)
    {
      this.y.put(Long.valueOf(paramLong), paramzaie);
    }
    else
    {
      if (this.y == null) {
        this.y = new HashMap();
      }
      this.y.put(Long.valueOf(paramLong), paramzaie);
      this.z = true;
    }
  }
  
  boolean a(CellArea paramCellArea, int paramInt)
  {
    Iterator localIterator = this.y.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      long l1 = ((Long)localObject).longValue();
      if ((Cell.a(l1) == paramInt) && (paramCellArea.a(Cell.b(l1))) && (paramCellArea.b(Cell.c(l1)))) {
        return true;
      }
    }
    return false;
  }
  
  void a(int paramInt, zaai paramzaai)
  {
    if (this.B[paramInt] == null) {
      this.B[paramInt] = new zaak[this.e.get(paramInt).getCells().a.d];
    }
    if (this.B[paramInt][paramzaai.a] == null) {
      this.B[paramInt][paramzaai.a] = new zaak(paramzaai, this.A);
    } else {
      this.B[paramInt][paramzaai.a].a = this.A;
    }
  }
  
  void b(int paramInt, zaai paramzaai)
  {
    if (this.B[paramInt] == null) {
      this.B[paramInt] = new zaak[this.e.get(paramInt).getCells().a.d];
    }
    if (this.B[paramInt][paramzaai.a] == null) {
      this.B[paramInt][paramzaai.a] = new zaak(paramzaai);
    } else {
      this.B[paramInt][paramzaai.a].a(paramzaai);
    }
  }
  
  void b(long paramLong)
  {
    if (this.C != null) {
      this.C.a(paramLong, this.E);
    }
  }
  
  boolean a(int paramInt, zaai paramzaai, boolean paramBoolean)
  {
    return (this.z) && (this.C != null) && (this.C.a(paramInt, paramzaai, paramBoolean, this));
  }
  
  void c(long paramLong)
  {
    if (this.R < 0) {
      this.R = this.E;
    }
    int i1 = this.R;
    for (this.R -= 1; this.D[this.R] != paramLong; this.R -= 1) {}
    this.E -= i1 - this.R - 1;
    System.arraycopy(this.D, i1, this.D, this.R + 1, this.E - this.R - 1);
  }
  
  public int k()
  {
    return this.g ? 65535 : 1048575;
  }
  
  public int l()
  {
    return this.g ? 255 : 16383;
  }
  
  zahf a(String paramString)
  {
    zahf localzahf = null;
    if (this.u != null) {
      localzahf = (zahf)this.u.get(paramString);
    }
    if (localzahf != null) {
      return localzahf;
    }
    if (this.h.m() != null)
    {
      localzahf = (zahf)this.h.m().get(paramString);
      if (localzahf != null) {
        return localzahf;
      }
    }
    localzahf = this.h.b(paramString, false);
    if (this.u == null) {
      this.u = new HashMap();
    }
    this.u.put(paramString, localzahf);
    return localzahf;
  }
  
  zzz a(String paramString, int paramInt, Object paramObject)
  {
    return a(paramString).a(this.h.j(), paramInt, paramObject);
  }
  
  private Encoding m()
  {
    switch (this.h.e())
    {
    case 4: 
    case 1028: 
    case 2052: 
    case 3076: 
    case 4100: 
    case 5124: 
    case 31748: 
      return Encoding.getEncoding("GB18030");
    case 25: 
    case 1049: 
      return Encoding.getEncoding("windows-1251");
    case 7: 
    case 1031: 
    case 1033: 
    case 2055: 
    case 2057: 
    case 3079: 
    case 4103: 
    case 5127: 
      return Encoding.getEncoding("windows-1252");
    case 5: 
    case 14: 
    case 21: 
    case 24: 
    case 26: 
    case 27: 
    case 28: 
    case 36: 
    case 1029: 
    case 1038: 
    case 1045: 
    case 1048: 
    case 1050: 
    case 1051: 
    case 1052: 
    case 1060: 
    case 2074: 
      return Encoding.getEncoding("windows-1250");
    case 17: 
    case 1041: 
      return Encoding.getEncoding("Shift-JIS");
    case 18: 
    case 1042: 
      return Encoding.getEncoding("KSC5601");
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zabz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */