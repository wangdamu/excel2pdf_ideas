package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Cell
{
  int a;
  Row b;
  zgs c;
  Cells d;
  private boolean e = true;
  
  void a()
  {
    if (this.b.c.g() < 0) {
      throw new CellsException(7, "Cell's row has been removed: " + j());
    }
    this.a = this.b.c.b(this.c.a, this.a);
    if (this.a < 0) {
      throw new CellsException(7, "Cell has been removed: " + j());
    }
  }
  
  void b()
  {
    if (this.b.c.g() < 0) {
      throw new CellsException(7, "Cell's row has been removed: " + j());
    }
    if (this.a > -1)
    {
      this.a = this.b.c.b(this.c.a, this.a);
      if (this.a < 0) {
        throw new CellsException(7, "Cell has been removed: " + j());
      }
      if (this.e) {
        this.c = this.b.c.a(this.a, this.c, 7);
      }
    }
  }
  
  void c()
  {
    if (this.e) {
      b();
    } else if (this.c.b < 0) {
      this.b.c.h();
    }
  }
  
  private void K()
  {
    switch (this.c.c)
    {
    case 5: 
      J();
      L();
      this.d.a.b(((zaai)this.c.d).a);
      break;
    case 4: 
      this.d.p().g.d((zbbj)this.c.d);
      break;
    }
  }
  
  void a(String paramString)
  {
    K();
    this.c.c = 4;
    this.c.d = this.d.p().g.a(paramString);
    this.b.c.b(this.a, this.c);
    L();
  }
  
  void a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    if ((this.c.c == paramInt) && ((paramInt == 0) || (this.c.d.equals(paramObject)))) {
      return;
    }
    if (paramBoolean) {
      K();
    }
    this.c.c = paramInt;
    this.c.d = paramObject;
    this.b.c.b(this.a, this.c);
    L();
  }
  
  void a(zgs paramzgs, int paramInt, boolean paramBoolean)
  {
    if (((paramInt & 0x2) != 0) && (paramzgs.b == this.c.b))
    {
      paramInt &= 0xFFFFFFFD;
      if (paramInt == 0) {
        return;
      }
    }
    if ((paramInt & 0x4) != 0)
    {
      if ((this.c.c == paramzgs.c) && ((paramzgs.c == 0) || (this.c.d.equals(paramzgs.d))))
      {
        paramInt &= 0xFFFFFFFB;
        if (paramInt == 0) {
          return;
        }
      }
      if (paramBoolean) {
        K();
      }
      L();
    }
    this.b.c.b(this.a, paramzgs, paramInt);
  }
  
  void a(int paramInt)
  {
    this.c.b = paramInt;
    this.b.c.j(this.a, paramInt);
  }
  
  void a(boolean paramBoolean)
  {
    this.c.e = paramBoolean;
    if (this.c.c == 4) {
      this.b.c.b(this.a, this.c);
    }
  }
  
  public void calculate(CalculationOptions options)
  {
    b();
    if (this.c.c != 5) {
      return;
    }
    Worksheet localWorksheet = this.d.g();
    zaca localzaca = new zaca(localWorksheet, 3, options);
    zaai localzaai = (zaai)this.c.d;
    localzaca.p.e.af();
    if (localzaca.p.o)
    {
      localzaca.p.e.ad();
      localzaai.a((byte)0);
    }
    else if (options.getRecursive())
    {
      localzaca.p.e.a((byte)0);
    }
    else
    {
      localzaai.a((byte)0);
    }
    localzaca.c(localzaai);
    localzaca.c();
  }
  
  public void calculate(boolean ignoreError, ICustomFunction customFunction)
  {
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = ignoreError;
    localCalculationOptions.setCustomFunction(customFunction);
    calculate(localCalculationOptions);
  }
  
  public Worksheet getWorksheet()
  {
    return this.d.g();
  }
  
  Cell(Row row, int cellPos)
  {
    this.b = row;
    this.d = row.b;
    this.a = cellPos;
    zgs localzgs = new zgs();
    this.c = this.b.c.a(cellPos, localzgs, 7);
    this.e = (this.c == localzgs);
  }
  
  Cell(Row row, int cellPos, zgs celldata, boolean needSyncData)
  {
    this.b = row;
    this.d = row.b;
    this.c = celldata;
    this.a = cellPos;
    this.e = needSyncData;
  }
  
  private void L()
  {
    if (this.d.p().p().getSettings().c)
    {
      zaas localzaas = this.d.a.f;
      if (localzaas != null) {
        localzaas.b(this.b.getIndex(), this.c.a);
      }
    }
  }
  
  public void putValue(boolean boolValue)
  {
    b();
    a(2, boolValue ? znq.d : znq.e, true);
  }
  
  public void putValue(int intValue)
  {
    b();
    int i = this.c.c;
    Object localObject1 = this.c.d;
    zayi.a(intValue, this.c);
    int j = this.c.c;
    Object localObject2 = this.c.d;
    this.c.c = i;
    this.c.d = localObject1;
    a(j, localObject2, true);
  }
  
  public void putValue(double doubleValue)
  {
    b();
    if ((Double.isNaN(doubleValue)) || (Double.isInfinite(doubleValue)))
    {
      zuf localzuf = zuf.c;
      byte b1 = ztr.b(localzuf);
      a(3, zi.a(b1), true);
    }
    else
    {
      a(doubleValue);
    }
  }
  
  private void a(double paramDouble)
  {
    if (this.e)
    {
      int i = this.c.c;
      Object localObject1 = this.c.d;
      zayi.a(paramDouble, this.c);
      int j = this.c.c;
      Object localObject2 = this.c.d;
      this.c.c = i;
      this.c.d = localObject1;
      a(j, localObject2, true);
    }
    else
    {
      a(1, Double.valueOf(paramDouble), true);
    }
  }
  
  boolean d()
  {
    return this.c.a();
  }
  
  boolean e()
  {
    return this.c.c == 0;
  }
  
  void f()
  {
    a(0, null, true);
  }
  
  public void putValue(String stringValue, boolean isConverted, boolean setStyle)
  {
    if ((!isConverted) || (stringValue == null) || ("".equals(stringValue)))
    {
      putValue(stringValue);
      return;
    }
    zzx localzzx = this.d.p().p().getSettings().f();
    String str = null;
    zgs localzgs = null;
    Object localObject;
    if (localzzx.h().parseObject(stringValue) != null)
    {
      localObject = localzzx.h().a();
      localzgs = new zgs(this.c);
      zayi.a(((zavq)localObject).i(), localzgs);
      str = ((zavq)localObject).e();
    }
    else if (localzzx.i().parseObject(stringValue) != null)
    {
      localObject = localzzx.i().a();
      if (((zavo)localObject).a() == 1)
      {
        if (!((zavo)localObject).a(localzzx))
        {
          putValue(stringValue);
          return;
        }
        localzgs = new zgs(this.c);
        zayi.a(zbxa.a((DateTime)((zavo)localObject).d(), localzzx.c()), localzgs);
      }
      else
      {
        localzgs = new zgs(this.c);
        zayi.a(((Double)((zavo)localObject).d()).doubleValue(), localzgs);
      }
      str = ((zavo)localObject).e();
    }
    else
    {
      putValue(stringValue);
      return;
    }
    b();
    if (setStyle)
    {
      localObject = a(this.d, this.b, this.c, this.a, false);
      if (!zw.b(((Style)localObject).s(), str))
      {
        ((Style)localObject).b(str);
        localzgs.b = this.d.p().C().a((Style)localObject);
        a(localzgs, 6, true);
        return;
      }
    }
    a(localzgs.c, localzgs.d, true);
  }
  
  public void putValue(String stringValue, boolean isConverted)
  {
    putValue(stringValue, isConverted, false);
  }
  
  public void putValue(String stringValue)
  {
    b();
    if (stringValue == null)
    {
      a(0, null, true);
      return;
    }
    if ((stringValue.length() > 0) && (stringValue.charAt(0) == '\''))
    {
      stringValue = stringValue.substring(1);
      if ((getWorksheet().d().getSettings().getCheckExcelRestriction()) && (stringValue.length() > 32767)) {
        zhw.a(j());
      }
      Style localStyle = a(this.d, this.b, this.c, this.a, false);
      if (a(stringValue, this.c))
      {
        if (localStyle.w()) {
          return;
        }
        localStyle.k(true);
        a(this.d.p().C().a(localStyle));
      }
      else if (localStyle.w())
      {
        a(stringValue);
      }
      else
      {
        K();
        zgs localzgs = new zgs();
        localzgs.c = 4;
        localzgs.d = this.d.p().g.a(stringValue);
        localStyle.k(true);
        localzgs.b = this.d.p().C().a(localStyle);
        a(localzgs, 6, false);
      }
    }
    else
    {
      if ((getWorksheet().d().getSettings().getCheckExcelRestriction()) && (stringValue.length() > 32767)) {
        zhw.a(j());
      }
      byte b1 = ztr.b(stringValue);
      if (b1 != -1)
      {
        a(3, zi.a(b1), true);
      }
      else
      {
        if (a(stringValue, this.c)) {
          return;
        }
        a(stringValue);
      }
    }
  }
  
  private boolean a(String paramString, zgs paramzgs)
  {
    if (paramzgs.c != 4) {
      return false;
    }
    zbbj localzbbj = (zbbj)paramzgs.d;
    return (!localzbbj.f()) && (localzbbj.c.equals(paramString));
  }
  
  public void putValue(DateTime dateTime)
  {
    b();
    double d1 = CellsHelper.getDoubleFromDateTime(dateTime, this.d.p().p().getSettings().getDate1904());
    if (d1 < 0.0D) {
      a(4, this.d.p().g.a(a(dateTime)), true);
    } else {
      a(d1);
    }
  }
  
  private String a(DateTime paramDateTime)
  {
    zzx localzzx = getWorksheet().d().getSettings().f();
    zahf localzahf = localzzx.a(p());
    if (localzahf.a() == 3) {
      return localzahf.a(localzzx.j(), 16, paramDateTime).h();
    }
    return com.aspose.cells.b.a.zs.a(paramDateTime);
  }
  
  public DateTime getDateTimeValue()
  {
    if (this.e) {
      b();
    }
    if (this.c.d == null) {
      throw new CellsException(7, "Cell contains no data in Cell " + j());
    }
    switch (this.c.c)
    {
    case 5: 
      zaai localzaai = (zaai)this.c.d;
      switch (localzaai.c)
      {
      case 1: 
        return CellsHelper.getDateTimeFromDouble(((Double)localzaai.d).doubleValue(), this.d.p().p().getSettings().getDate1904());
      case 6: 
        return CellsHelper.getDateTimeFromDouble(zayi.a(((Integer)localzaai.d).intValue()), this.d.p().p().getSettings().getDate1904());
      }
      break;
    case 1: 
      return CellsHelper.getDateTimeFromDouble(((Double)this.c.d).doubleValue(), this.d.p().p().getSettings().getDate1904());
    case 6: 
      return CellsHelper.getDateTimeFromDouble(zayi.a(((Integer)this.c.d).intValue()), this.d.p().p().getSettings().getDate1904());
    case 0: 
      throw new CellsException(7, "Cell contains no data in Cell " + j());
    }
    throw new CellsException(7, "Not a DateTime value in Cell " + j());
  }
  
  public void putValue(Object objectValue)
  {
    if (objectValue == null)
    {
      b();
      a(0, null, true);
      return;
    }
    int i = zaoj.a(objectValue.getClass());
    zgs localzgs = new zgs();
    if (!localzgs.a(i, objectValue, this.e)) {
      switch (localzgs.c)
      {
      case 4: 
        putValue((String)localzgs.d);
        return;
      case 1: 
        putValue((DateTime)localzgs.d);
        return;
      }
    }
    b();
    a(localzgs.c, localzgs.d, true);
  }
  
  public int getRow()
  {
    return this.b.c.i();
  }
  
  public int getColumn()
  {
    return this.c.a;
  }
  
  void a(Cell paramCell, CopyOptions paramCopyOptions)
  {
    c(paramCell, paramCopyOptions);
    if (paramCell.g())
    {
      if (paramCell.A()) {
        setFormula(paramCell.getFormula());
      }
      if (paramCell.c.a != this.c.a)
      {
        zaai localzaai = (zaai)this.c.d;
        zaaq.a(this.d.p(), 0, 0, 0, this.c.a, this.c.a - paramCell.c.a, paramCell.c.a, localzaai.b, -1, -1);
        if (localzaai.a() != null) {
          localzaai.a().a(this.d.g(), this.d == paramCell.d, paramCell.F().a(), getRow(), this.c.a);
        }
      }
    }
  }
  
  void a(Cell paramCell, int paramInt, CopyOptions paramCopyOptions)
  {
    c(paramCell, paramCopyOptions);
    if (paramCell.c.c == 5)
    {
      if (paramCell.A()) {
        setFormula(paramCell.getFormula());
      }
      if ((paramCell.getRow() != getRow()) && (this.c.c == 5))
      {
        int i = paramCell.getRow();
        int j = getRow();
        zaai localzaai = (zaai)this.c.d;
        zaaq.a(this.d.p(), j, j - i, i, 0, 0, 0, localzaai.b, -1, -1);
        if ((paramCell.F() != null) && (paramCell.F().b()))
        {
          zaaq.a(this.d.p(), j, j - i, i, 0, 0, 0, localzaai.a().c(), -1, -1);
          CellArea localCellArea = (CellArea)zban.a(paramCell.F().a(), i, paramInt, j);
          F().a(localCellArea);
        }
      }
    }
  }
  
  static void a(zt paramzt, int paramInt1, int paramInt2, int paramInt3, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramzt.h(paramInt1) == 5) {
      ((zaai)paramzt.i(paramInt1)).b(paramInt2, paramInt3, paramWorksheet, paramBoolean);
    }
  }
  
  void a(CellArea paramCellArea, int paramInt, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (this.c.c == 5)
    {
      zaai localzaai = (zaai)this.c.d;
      if ((localzaai.f >= paramCellArea.StartColumn) && (localzaai.f <= paramCellArea.EndColumn) && (localzaai.e >= paramCellArea.StartRow)) {
        localzaai.e += paramInt;
      }
      a(localzaai, 0, paramCellArea, paramInt, paramWorksheet, paramBoolean);
    }
  }
  
  static void a(zt paramzt, int paramInt1, CellArea paramCellArea, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramzt.h(paramInt1) == 5)
    {
      zaai localzaai = (zaai)paramzt.i(paramInt1);
      if ((localzaai.f >= paramCellArea.StartColumn) && (localzaai.f <= paramCellArea.EndColumn) && (localzaai.e >= paramCellArea.StartRow)) {
        localzaai.e += paramInt2;
      }
      a(localzaai, 0, paramCellArea, paramInt2, paramWorksheet, paramBoolean);
    }
  }
  
  int b(CellArea paramCellArea, int paramInt, Worksheet paramWorksheet, boolean paramBoolean)
  {
    int i = 0;
    int j = getRow();
    int k = this.c.a;
    if ((k >= paramCellArea.StartColumn) && (k <= paramCellArea.EndColumn) && (j >= paramCellArea.StartRow)) {
      if (j > paramCellArea.EndRow)
      {
        j -= paramInt;
        i = 1;
      }
      else
      {
        return 2;
      }
    }
    if (this.c.c == 5)
    {
      zaai localzaai = (zaai)this.c.d;
      localzaai.e = j;
      a(localzaai, 4, paramCellArea, paramInt, paramWorksheet, paramBoolean);
    }
    return i;
  }
  
  static boolean b(zt paramzt, int paramInt1, CellArea paramCellArea, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramzt.h(paramInt1) == 5)
    {
      boolean bool = false;
      zaai localzaai = (zaai)paramzt.i(paramInt1);
      if ((localzaai.e >= paramCellArea.StartRow) && (localzaai.e <= paramCellArea.EndRow) && (localzaai.f >= paramCellArea.StartColumn))
      {
        zaai tmp60_58 = localzaai;
        tmp60_58.f = ((short)(tmp60_58.f + (short)paramInt2));
        bool = true;
      }
      a(localzaai, 3, paramCellArea, paramInt2, paramWorksheet, paramBoolean);
      return bool;
    }
    int i = paramzt.i();
    if ((i < paramCellArea.StartRow) || (i > paramCellArea.EndRow)) {
      return false;
    }
    return paramzt.a(paramInt1) >= paramCellArea.StartColumn;
  }
  
  static void c(zt paramzt, int paramInt1, CellArea paramCellArea, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramzt.h(paramInt1) == 5)
    {
      zaai localzaai = (zaai)paramzt.i(paramInt1);
      if ((localzaai.e >= paramCellArea.StartRow) && (localzaai.e <= paramCellArea.EndRow) && (localzaai.f > paramCellArea.EndColumn))
      {
        zaai tmp57_55 = localzaai;
        tmp57_55.f = ((short)(tmp57_55.f - (short)paramInt2));
      }
      a(localzaai, 1, paramCellArea, paramInt2, paramWorksheet, paramBoolean);
    }
  }
  
  static void a(zaai paramzaai, int paramInt1, CellArea paramCellArea, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    switch (paramInt1)
    {
    case 1: 
      zaaq.c(paramCellArea, paramInt2, paramWorksheet, paramBoolean, paramzaai.b, -1, -1);
      break;
    case 3: 
      zaaq.a(paramCellArea, paramInt2, paramWorksheet, paramBoolean, paramzaai.b, -1, -1, 0, 0, 0, 0);
      if (paramzaai.a() != null) {
        zaaq.a(paramCellArea, paramInt2, paramWorksheet, paramBoolean, paramzaai.a().c(), -1, -1, 0, 0, 0, 0);
      }
      break;
    case 4: 
      zaaq.b(paramCellArea, paramInt2, paramWorksheet, paramBoolean, paramzaai.b, -1, -1);
      if (paramzaai.a() != null) {
        paramzaai.a().a(paramWorksheet, paramBoolean, paramCellArea, paramInt2, 4, paramzaai.e + paramInt2, paramzaai.f, paramzaai.e, paramzaai.f);
      }
      break;
    case 0: 
      zaaq.a(paramCellArea, paramInt2, paramWorksheet, paramBoolean, paramzaai.b, -1, -1);
      if (paramzaai.a() != null) {
        paramzaai.a().a(paramWorksheet, paramBoolean, paramCellArea, paramInt2, 0, paramzaai.e - paramInt2, paramzaai.f, paramzaai.e, paramzaai.f);
      }
      break;
    }
    if (paramzaai.b() != null) {
      paramzaai.b().a(paramzaai, paramInt1, paramCellArea, paramInt2, paramWorksheet, paramBoolean);
    }
  }
  
  public boolean isFormula()
  {
    if (this.e) {
      b();
    }
    return this.c.c == 5;
  }
  
  boolean g()
  {
    return this.c.c == 5;
  }
  
  boolean a(Cell paramCell)
  {
    if (paramCell != null) {
      return paramCell.a(null);
    }
    if ((this.c.d != null) && ((this.c.d instanceof zaai)))
    {
      zaai localzaai = (zaai)this.c.d;
      if (localzaai.a() != null) {
        return zaaq.b(this.d.p(), localzaai.a().c(), -1);
      }
      if (localzaai.b != null) {
        return zaaq.b(this.d.p(), localzaai.b, -1);
      }
    }
    return false;
  }
  
  zaai h()
  {
    if (this.c.c == 5) {
      return (zaai)this.c.d;
    }
    return null;
  }
  
  public int getType()
  {
    if (this.e) {
      b();
    }
    if (this.c.d == null) {
      return 3;
    }
    return b(this.c.c, this.c.d);
  }
  
  private int b(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 2: 
      return 0;
    case 1: 
    case 6: 
      if (p().isDateTime()) {
        return 1;
      }
      return 4;
    case 4: 
      return 5;
    case 5: 
      zaai localzaai = (zaai)paramObject;
      return b(localzaai.c, localzaai.d);
    case 0: 
      return 3;
    case 3: 
      return 2;
    }
    return 6;
  }
  
  int i()
  {
    if ((this.c.d instanceof zbbj)) {
      return ((zbbj)this.c.d).e;
    }
    return -1;
  }
  
  public String getName()
  {
    return CellsHelper.cellIndexToName(getRow(), this.c.a);
  }
  
  String j()
  {
    return CellsHelper.cellIndexToName(getRow(), this.c.a);
  }
  
  public boolean isErrorValue()
  {
    if (this.e) {
      b();
    }
    if (!g()) {
      return false;
    }
    zaai localzaai = (zaai)this.c.d;
    return ((zaai)this.c.d).c == 3;
  }
  
  public String getStringValue(int formatStrategy)
  {
    switch (formatStrategy)
    {
    case 0: 
      return getStringValueWithoutFormat();
    case 1: 
      return getStringValue();
    case 2: 
      return getDisplayStringValue();
    }
    return getStringValue();
  }
  
  public String getStringValue()
  {
    c();
    return k();
  }
  
  public String getStringValueWithoutFormat()
  {
    if (this.e) {
      b();
    }
    return this.c.a(true, this.d.p().p().getSettings());
  }
  
  String k()
  {
    return b(this.d, this.b.c, this.c);
  }
  
  public int getNumberCategoryType()
  {
    c();
    Style localStyle = p();
    String str = localStyle.s();
    if ((str == null) || ("".equals(str)))
    {
      int i = zzx.c(localStyle.getNumber());
      if (i != 0) {
        return i;
      }
    }
    return l().g();
  }
  
  zahf l()
  {
    zahf localzahf = getWorksheet().d().getSettings().f().a(p());
    if (localzahf.a() == 6)
    {
      zgs localzgs = this.c.e();
      int i;
      switch (localzgs.c)
      {
      case 0: 
      case 3: 
        return getWorksheet().d().getSettings().f().k();
      case 1: 
        i = 14;
        break;
      case 6: 
        i = 9;
        break;
      case 2: 
        i = 3;
        break;
      case 4: 
      case 5: 
      default: 
        i = 18;
      }
      localzahf = ((zaab)localzahf).b(null, i, localzgs.d);
      if (localzahf == null) {
        return getWorksheet().d().getSettings().f().k();
      }
    }
    return localzahf;
  }
  
  private boolean a(zgs paramzgs)
  {
    Style localStyle = p();
    if ((localStyle.s() == null) || ("".equals(localStyle.s())))
    {
      if (localStyle.getNumber() == 0) {
        return false;
      }
      return a(getWorksheet().d().getSettings().f().e(localStyle.getNumber()), paramzgs);
    }
    return a(getWorksheet().d().getSettings().f().a(localStyle.s(), true), paramzgs);
  }
  
  private boolean a(zahf paramzahf, zgs paramzgs)
  {
    switch (paramzahf.a())
    {
    case 2: 
    case 4: 
    case 5: 
    case 6: 
      zaai localzaai = null;
      double d1 = 0.0D;
      switch (paramzgs.c)
      {
      case 6: 
        d1 = zayi.a(((Integer)paramzgs.d).intValue());
        break;
      case 1: 
        d1 = ((Double)paramzgs.d).doubleValue();
        break;
      case 5: 
        localzaai = (zaai)paramzgs.d;
        switch (localzaai.c)
        {
        case 6: 
          d1 = zayi.a(((Integer)localzaai.d).intValue());
          break;
        case 1: 
          d1 = ((Double)localzaai.d).doubleValue();
          break;
        default: 
          return false;
        }
        break;
      default: 
        return false;
      }
      double d2 = ((zl)paramzahf).a(d1);
      if (d1 != d2)
      {
        zayi.a(d2, paramzgs);
        if (localzaai != null)
        {
          localzaai.c = paramzgs.c;
          localzaai.d = paramzgs.d;
          paramzgs.c = 5;
          paramzgs.d = localzaai;
        }
        return true;
      }
      return false;
    }
    return false;
  }
  
  Object m()
  {
    zgs localzgs = this.c.e();
    switch (localzgs.c)
    {
    case 3: 
      return localzgs.g();
    case 1: 
      if (p().isDateTime())
      {
        double d1 = ((Double)localzgs.d).doubleValue();
        if (d1 >= 0.0D) {
          return zbxa.a(d1, this.d.p().p().getSettings().getDate1904());
        }
      }
      return localzgs.d;
    case 6: 
      if (p().isDateTime())
      {
        int i = ((Integer)localzgs.d).intValue();
        if (i >= 0) {
          return zbxa.a(i, this.d.p().p().getSettings().getDate1904());
        }
      }
      return localzgs.d;
    }
    return localzgs.d;
  }
  
  int n()
  {
    if (this.c.d == null) {
      return 3;
    }
    return b(this.c.c, this.c.d);
  }
  
  public String getDisplayStringValue()
  {
    c();
    if (getWorksheet().getShowFormulas())
    {
      if (this.c.c == 5) {
        return t();
      }
      return this.c.a(true, getWorksheet().d().getSettings());
    }
    zgs localzgs = this.c.e();
    if (localzgs.c == 0) {
      return "";
    }
    if (localzgs.c == 3) {
      return getWorksheet().getWorkbook().getSettings().getGlobalizationSettings().getErrorValueString(localzgs.g());
    }
    zgt localzgt = new zgt(r(), this.d);
    a(localzgt, false, null);
    if (localzgt.c)
    {
      localObject = new Style(this.d.p());
      ((Style)localObject).copy(localzgt.a);
      localzgt.a = ((Style)localObject);
      localzgt.c = (localzgt.b == 15);
    }
    Object localObject = new zzu();
    ((zzu)localObject).a(getWorksheet().getWorkbook().getSettings().getGlobalizationSettings());
    zic localzic = new zic(this.d, getRow(), this.c.a, localzgt.a, localzgt.c);
    ((zzu)localObject).a(localzic);
    return a(a(localzgs, (zzu)localObject, localzgt.a, this.d), localzic, localzgt.a);
  }
  
  String a(int paramInt, boolean paramBoolean)
  {
    return a(this.d, this.b.c, this.c, paramInt, paramBoolean);
  }
  
  public int getIntValue()
  {
    if (this.e) {
      b();
    }
    zgs localzgs = this.c.e();
    switch (localzgs.c)
    {
    case 6: 
      return ((Integer)localzgs.d).intValue();
    case 1: 
      double d1 = ((Double)localzgs.d).doubleValue();
      if ((d1 <= 2.147483647E9D) && (d1 >= -2.147483648E9D)) {
        return (int)zga.b(d1);
      }
      throw new CellsException(7, "Cell value type is double , but the value is out of integer range.");
    case 0: 
      throw new CellsException(7, "Cell contains no data in Cell " + j());
    }
    throw new CellsException(7, "Not a numeric value in Cell " + this.d.g().getName() + "!" + j());
  }
  
  public double getDoubleValue()
  {
    if (this.e) {
      b();
    }
    zgs localzgs = this.c.e();
    switch (localzgs.c)
    {
    case 6: 
      return ((Integer)localzgs.d).intValue();
    case 1: 
      return ((Double)localzgs.d).doubleValue();
    }
    throw new CellsException(7, "Not a numeric value in Cell " + this.d.g().getName() + "!" + j());
  }
  
  public float getFloatValue()
  {
    double d1 = getDoubleValue();
    if ((d1 < 3.4028234663852886E38D) && (d1 > -3.4028234663852886E38D)) {
      return (float)d1;
    }
    throw new CellsException(7, "Cell value type is double ,but the value is out of float range.");
  }
  
  public boolean getBoolValue()
  {
    if (this.e) {
      b();
    }
    switch (this.c.c)
    {
    case 0: 
      throw new CellsException(7, "Cell contains no datain in Cell" + j());
    case 2: 
      return ((Boolean)this.c.d).booleanValue();
    case 5: 
      zaai localzaai = (zaai)this.c.d;
      if (localzaai.c == 2) {
        return ((Boolean)localzaai.d).booleanValue();
      }
      break;
    }
    throw new CellsException(7, "Cell value type is not booleanin Cell" + j());
  }
  
  public Style getDisplayStyle()
  {
    if (this.e) {
      b();
    }
    zgt localzgt = new zgt(r(), this.d);
    a(localzgt, true, null);
    if (localzgt.c)
    {
      Style localStyle = new Style(this.d.p());
      localStyle.copy(localzgt.a);
      return localStyle;
    }
    return localzgt.a;
  }
  
  void a(zgt paramzgt, boolean paramBoolean, zaca paramzaca)
  {
    Worksheet localWorksheet = getWorksheet();
    ListObjectCollection localListObjectCollection = localWorksheet.k();
    Object localObject1;
    if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
    {
      int i = localListObjectCollection.b(getRow(), getColumn());
      if (i > -1)
      {
        localObject1 = localListObjectCollection.get(i);
        int j = ((ListObject)localObject1).c(getRow(), getColumn());
        if (j > -1) {
          localListObjectCollection.a.a(i, j, paramzgt);
        }
      }
    }
    ConditionalFormattingCollection localConditionalFormattingCollection = localWorksheet.G();
    Object localObject2;
    if ((localConditionalFormattingCollection != null) && (localConditionalFormattingCollection.getCount() > 0))
    {
      if (paramzaca != null) {
        if (paramzgt.e == null)
        {
          paramzaca.d = getRow();
          paramzaca.e = this.c.a;
        }
        else
        {
          paramzaca.d = paramzgt.e.getRow();
          paramzaca.e = paramzgt.e.c.a;
        }
      }
      localObject1 = zla.a(localWorksheet, paramzgt.e == null ? this : paramzgt.e, paramzaca, paramzgt.a, paramzgt.c);
      if ((((zfe)localObject1).a != null) || (((zfe)localObject1).c != null))
      {
        paramzgt.d = ((zfe)localObject1).c;
        localObject2 = new ConditionalFormattingResult((zfe)localObject1);
        if ((((zfe)localObject1).a != null) || (((ConditionalFormattingResult)localObject2).getConditionalFormattingColorScale() != null))
        {
          if ((paramzgt.c) && (((zfe)localObject1).b == paramzgt.a))
          {
            paramzgt.a();
            ((zfe)localObject1).b = paramzgt.a;
          }
          paramzgt.a = ((ConditionalFormattingResult)localObject2).a();
          paramzgt.c = false;
          if ((paramBoolean) && (((ConditionalFormattingResult)localObject2).getConditionalStyle() != null) && (((ConditionalFormattingResult)localObject2).getConditionalStyle().isModified(16))) {
            paramBoolean = false;
          }
        }
      }
    }
    if ((paramBoolean) && (!localWorksheet.getShowFormulas()))
    {
      localObject1 = paramzgt.a.s();
      if (zw.b((String)localObject1)) {
        localObject1 = localWorksheet.d().getSettings().f().d(paramzgt.a.getNumber());
      }
      if ((localObject1 != null) && (((String)localObject1).indexOf('[') > -1))
      {
        localObject2 = this.c.e();
        int k = 18;
        switch (((zgs)localObject2).c)
        {
        case 0: 
        case 3: 
          paramBoolean = false;
          break;
        case 1: 
          if ((!localWorksheet.getDisplayZeros()) && (((Double)((zgs)localObject2).d).doubleValue() == 0.0D)) {
            paramBoolean = false;
          } else {
            k = 14;
          }
          break;
        case 6: 
          if ((!localWorksheet.getDisplayZeros()) && (((Integer)((zgs)localObject2).d).intValue() == 0)) {
            paramBoolean = false;
          } else {
            k = 9;
          }
          break;
        case 2: 
          k = 3;
          break;
        }
        if (paramBoolean)
        {
          zahf localzahf = localWorksheet.d().getSettings().f().a((String)localObject1, paramzgt.c);
          if (localzahf.a() == 6) {
            localzahf = ((zaab)localzahf).b(null, k, ((zgs)localObject2).d);
          }
          if ((localzahf != null) && (!localzahf.b().d().isEmpty()))
          {
            paramzgt.a();
            paramzgt.a.getFont().setColor(localzahf.b().d());
          }
        }
      }
    }
  }
  
  Style a(boolean[] paramArrayOfBoolean)
  {
    c();
    paramArrayOfBoolean[0] = true;
    int i = 1;
    ConditionalFormattingResult localConditionalFormattingResult = getConditionalFormattingResult();
    Style localStyle;
    if (localConditionalFormattingResult != null)
    {
      localStyle = localConditionalFormattingResult.a();
      paramArrayOfBoolean[0] = ((localConditionalFormattingResult.getConditionalStyle() == null) && (localConditionalFormattingResult.getConditionalFormattingColorScale() == null) ? 1 : false);
      if ((localConditionalFormattingResult.getConditionalStyle() != null) && (localConditionalFormattingResult.getConditionalStyle().isModified(16))) {
        i = 0;
      }
    }
    else
    {
      localStyle = o();
    }
    Object localObject1;
    Object localObject2;
    if ((i != 0) && ((localStyle.s() != null) || (localStyle.getNumber() != 0)))
    {
      localObject1 = getWorksheet().d().getSettings().f();
      localObject2 = localStyle.s();
      if (localObject2 == null) {
        localObject2 = ((zzx)localObject1).d(localStyle.getNumber());
      }
      if (((String)localObject2).indexOf('[') > -1)
      {
        zgs localzgs = this.c.e();
        if (localzgs.c != 0)
        {
          zahf localzahf = ((zzx)localObject1).a((String)localObject2, false);
          if (localzahf.a() == 6) {
            localzahf = ((zaab)localzahf).a(localzgs.d);
          }
          if ((localzahf != null) && (!localzahf.b().d().isEmpty()))
          {
            localStyle.getFont().setColor(localzahf.b().d());
            paramArrayOfBoolean[0] = false;
          }
        }
      }
    }
    if ((getWorksheet().getListObjects() != null) && (getWorksheet().getListObjects().getCount() > 0))
    {
      localObject1 = getWorksheet().d();
      try
      {
        localObject2 = getWorksheet().getListObjects().a(getRow(), this.c.a);
        if (localObject2 != null)
        {
          paramArrayOfBoolean[0] = false;
          zla.a(localStyle, (Style)localObject2, ((Workbook)localObject1).getWorksheets().Q());
        }
      }
      catch (Exception localException) {}
    }
    return localStyle;
  }
  
  public FormatConditionCollection[] getFormatConditions()
  {
    c();
    return zla.a(this.d.g(), getRow(), getColumn());
  }
  
  Style o()
  {
    Style localStyle = new Style(this.d.p());
    localStyle.a(this.d.p(), r());
    return localStyle;
  }
  
  public Style getStyle()
  {
    b();
    return a(this.d, this.b, this.c, this.a, true);
  }
  
  public Style getStyle(boolean checkBorders)
  {
    if (checkBorders) {
      b();
    } else {
      c();
    }
    return a(this.d, this.b, this.c, this.a, checkBorders);
  }
  
  void a(Style paramStyle, boolean paramBoolean)
  {
    if (paramStyle == null)
    {
      b(-1);
    }
    else
    {
      WorksheetCollection localWorksheetCollection = this.d.p();
      if (paramStyle.e() == null) {
        paramStyle.a(localWorksheetCollection);
      }
      if ((!paramBoolean) || (!paramStyle.isModified(1)))
      {
        b(localWorksheetCollection.C().a(paramStyle));
        return;
      }
      Style localStyle1 = o();
      b(localWorksheetCollection.C().a(paramStyle));
      Cell localCell = null;
      Style localStyle2 = null;
      Border localBorder = null;
      if ((this.c.a > 0) && (paramStyle.isModified(2)) && (!paramStyle.getBorders().getByBorderType(1).b(localStyle1.getBorders().getByBorderType(1))))
      {
        localCell = this.d.checkCell(getRow(), this.c.a - 1);
        if ((localCell != null) && (localCell.q()))
        {
          localStyle2 = localCell.o();
          localBorder = paramStyle.getBorders().getByBorderType(1);
          localStyle2.getBorders().getByBorderType(2).setLineStyle(localBorder.getLineStyle());
          if (localBorder.getLineStyle() != 0) {
            localStyle2.getBorders().getByBorderType(2).a.f(localBorder.a);
          }
          localCell.a(localStyle2);
        }
      }
      if ((getRow() > 0) && (paramStyle.isModified(4)))
      {
        localCell = this.d.checkCell(getRow() - 1, this.c.a);
        if ((localCell != null) && (localCell.q()))
        {
          localStyle2 = localCell.o();
          localBorder = paramStyle.getBorders().getByBorderType(4);
          localStyle2.getBorders().getByBorderType(8).setLineStyle(localBorder.getLineStyle());
          if (localBorder.getLineStyle() != 0) {
            localStyle2.getBorders().getByBorderType(8).a.f(localBorder.a);
          }
          localCell.a(localStyle2);
        }
      }
      if ((this.c.a < 16383) && (paramStyle.isModified(3)) && (!paramStyle.getBorders().getByBorderType(2).b(localStyle1.getBorders().getByBorderType(2))))
      {
        localCell = this.d.checkCell(getRow(), this.c.a + 1);
        if ((localCell != null) && (localCell.q()))
        {
          localStyle2 = localCell.o();
          localBorder = paramStyle.getBorders().getByBorderType(2);
          localStyle2.getBorders().getByBorderType(1).setLineStyle(localBorder.getLineStyle());
          if (localBorder.getLineStyle() != 0) {
            localStyle2.getBorders().getByBorderType(1).a.f(localBorder.a);
          }
          localCell.a(localStyle2);
        }
      }
      if ((getRow() < 1048575) && (paramStyle.isModified(5)) && (!paramStyle.getBorders().getByBorderType(8).b(localStyle1.getBorders().getByBorderType(8))))
      {
        localCell = this.d.checkCell(getRow() + 1, this.c.a);
        if ((localCell != null) && (localCell.q()))
        {
          localStyle2 = localCell.o();
          localBorder = paramStyle.getBorders().getByBorderType(8);
          localStyle2.getBorders().getByBorderType(4).setLineStyle(localBorder.getLineStyle());
          if (localBorder.getLineStyle() != 0) {
            localStyle2.getBorders().getByBorderType(4).a.f(localBorder.a);
          }
          localCell.a(localStyle2);
        }
      }
    }
  }
  
  public void setStyle(Style style)
  {
    b();
    a(style, this.d.g().d().getSettings().getUpdateAdjacentCellsBorder());
  }
  
  void a(Style paramStyle)
  {
    a(paramStyle, null);
  }
  
  void a(Style paramStyle, CopyOptions paramCopyOptions)
  {
    if (paramStyle == null)
    {
      b(-1);
    }
    else
    {
      if (paramStyle.e() == null) {
        paramStyle.a(this.d.p());
      }
      b(this.d.p().C().a(paramStyle));
    }
  }
  
  public void setStyle(Style style, boolean explicitFlag)
  {
    b();
    if (!explicitFlag)
    {
      setStyle(style);
      return;
    }
    if (style == null) {
      return;
    }
    WorksheetCollection localWorksheetCollection = this.d.p();
    if (style.e() == null) {
      style.a(localWorksheetCollection);
    }
    Style localStyle1 = new Style(localWorksheetCollection);
    localStyle1.a(localWorksheetCollection, r());
    if (style.l())
    {
      if (style.isModified(25)) {
        localStyle1.setHorizontalAlignment(style.getHorizontalAlignment());
      }
      if (style.isModified(26)) {
        localStyle1.setVerticalAlignment(style.getVerticalAlignment());
      }
      if (style.isModified(27)) {
        localStyle1.setIndentLevel(style.getIndentLevel());
      }
      if (style.isModified(29)) {
        localStyle1.setTextWrapped(style.isTextWrapped());
      }
      if (style.isModified(30)) {
        localStyle1.setShrinkToFit(style.getShrinkToFit());
      }
      if (style.isModified(28)) {
        localStyle1.setRotationAngle(style.getRotationAngle());
      }
      if (style.isModified(31)) {
        localStyle1.setTextDirection(style.getTextDirection());
      }
    }
    if (style.k())
    {
      if (style.isModified(13)) {
        localStyle1.getFont().setName(style.getFont().getName());
      }
      if (style.isModified(16))
      {
        localStyle1.b(16);
        localStyle1.getFont().e(style.getFont());
      }
      if (style.isModified(15)) {
        localStyle1.getFont().setCharset(style.getFont().getCharset());
      }
      if (style.isModified(14)) {
        localStyle1.getFont().a(style.getFont().h());
      }
      if (style.isModified(18)) {
        localStyle1.getFont().setItalic(style.getFont().isItalic());
      }
      if (style.isModified(23))
      {
        localStyle1.getFont().setSubscript(style.getFont().isSubscript());
        localStyle1.getFont().setSuperscript(style.getFont().isSuperscript());
      }
      if (style.isModified(12)) {
        localStyle1.getFont().setDoubleSize(style.getFont().getDoubleSize());
      }
      if (style.isModified(20)) {
        localStyle1.getFont().setStrikeout(style.getFont().isStrikeout());
      }
      if (style.isModified(19)) {
        localStyle1.getFont().setUnderline(style.getFont().getUnderline());
      }
      if (style.isModified(17)) {
        localStyle1.getFont().b(style.getFont().g());
      }
    }
    if (style.m())
    {
      boolean bool = localWorksheetCollection.p().getSettings().getUpdateAdjacentCellsBorder();
      Cell localCell;
      Style localStyle2;
      Border localBorder;
      if ((style.isModified(4)) && (!style.getBorders().getByBorderType(4).b(localStyle1.getBorders().getByBorderType(4))))
      {
        localStyle1.getBorders().getByBorderType(4).setLineStyle(style.getBorders().getByBorderType(4).getLineStyle());
        localStyle1.getBorders().getByBorderType(4).a.f(style.getBorders().getByBorderType(4).a);
        if ((getRow() > 0) && (bool))
        {
          localCell = this.d.checkCell(getRow() - 1, this.c.a);
          if ((localCell != null) && (localCell.q()))
          {
            localStyle2 = localCell.o();
            localBorder = style.getBorders().getByBorderType(4);
            localStyle2.getBorders().getByBorderType(8).setLineStyle(localBorder.getLineStyle());
            if (localBorder.getLineStyle() != 0) {
              localStyle2.getBorders().getByBorderType(8).a.f(localBorder.a);
            }
            localCell.a(localStyle2);
          }
        }
      }
      if ((style.isModified(5)) && (!style.getBorders().getByBorderType(8).b(localStyle1.getBorders().getByBorderType(8))))
      {
        localStyle1.getBorders().getByBorderType(8).setLineStyle(style.getBorders().getByBorderType(8).getLineStyle());
        localStyle1.getBorders().getByBorderType(8).a.f(style.getBorders().getByBorderType(8).a);
        if ((getRow() < 1048575) && (bool))
        {
          localCell = this.d.checkCell(getRow() + 1, this.c.a);
          if ((localCell != null) && (localCell.q()))
          {
            localStyle2 = localCell.o();
            localBorder = style.getBorders().getByBorderType(8);
            localStyle2.getBorders().getByBorderType(4).setLineStyle(localBorder.getLineStyle());
            if (localBorder.getLineStyle() != 0) {
              localStyle2.getBorders().getByBorderType(4).a.f(localBorder.a);
            }
            localCell.a(localStyle2);
          }
        }
      }
      if ((style.isModified(2)) && (!style.getBorders().getByBorderType(1).b(localStyle1.getBorders().getByBorderType(1))))
      {
        localStyle1.getBorders().getByBorderType(1).setLineStyle(style.getBorders().getByBorderType(1).getLineStyle());
        localStyle1.getBorders().getByBorderType(1).a.f(style.getBorders().getByBorderType(1).a);
        if ((this.c.a > 0) && (bool))
        {
          localCell = this.d.checkCell(getRow(), this.c.a - 1);
          if ((localCell != null) && (localCell.q()))
          {
            localStyle2 = localCell.o();
            localBorder = style.getBorders().getByBorderType(1);
            localStyle2.getBorders().getByBorderType(2).setLineStyle(localBorder.getLineStyle());
            if (localBorder.getLineStyle() != 0) {
              localStyle2.getBorders().getByBorderType(2).a.f(localBorder.a);
            }
            localCell.a(localStyle2);
          }
        }
      }
      if ((style.isModified(3)) && (!style.getBorders().getByBorderType(2).b(localStyle1.getBorders().getByBorderType(2))))
      {
        localStyle1.getBorders().getByBorderType(2).setLineStyle(style.getBorders().getByBorderType(2).getLineStyle());
        localStyle1.getBorders().getByBorderType(2).a.f(style.getBorders().getByBorderType(2).a);
        if ((this.c.a < 16383) && (bool))
        {
          localCell = this.d.checkCell(getRow(), this.c.a + 1);
          if ((localCell != null) && (localCell.q()))
          {
            localStyle2 = localCell.o();
            localBorder = style.getBorders().getByBorderType(2);
            localStyle2.getBorders().getByBorderType(1).setLineStyle(localBorder.getLineStyle());
            if (localBorder.getLineStyle() != 0) {
              localStyle2.getBorders().getByBorderType(1).a.f(localBorder.a);
            }
            localCell.a(localStyle2);
          }
        }
      }
      if (style.isModified(10))
      {
        localStyle1.getBorders().getByBorderType(32).setLineStyle(style.getBorders().getByBorderType(32).getLineStyle());
        localStyle1.getBorders().getByBorderType(32).a.f(style.getBorders().getByBorderType(32).a);
      }
      if (style.isModified(9))
      {
        localStyle1.getBorders().getByBorderType(16).setLineStyle(style.getBorders().getByBorderType(16).getLineStyle());
        localStyle1.getBorders().getByBorderType(16).a.f(style.getBorders().getByBorderType(16).a);
      }
    }
    if ((style.j()) && (style.isModified(24)))
    {
      localStyle1.a(style.r(), style.t());
      localStyle1.m(localStyle1.isDateTime());
    }
    if (style.n())
    {
      localStyle1.g(true);
      if (style.isModified(33)) {
        localStyle1.setPattern(style.getPattern());
      }
      if (style.isModified(34))
      {
        localStyle1.b.f(style.b);
        localStyle1.b(34);
      }
      if (style.isModified(35))
      {
        localStyle1.a.f(style.a);
        localStyle1.b(35);
      }
    }
    if (style.o())
    {
      if ((style.isModified(36)) || (!style.g())) {
        localStyle1.setLocked(style.isLocked());
      }
      if ((style.isModified(37)) || (!style.g())) {
        localStyle1.setFormulaHidden(style.isFormulaHidden());
      }
    }
    b(this.d.p().C().a(localStyle1));
  }
  
  public void setStyle(Style style, StyleFlag flag)
  {
    b();
    if (flag.getAll() == true)
    {
      setStyle(style);
      return;
    }
    if (style == null)
    {
      b(-1);
    }
    else
    {
      if (style.e() == null) {
        style.a(this.d.p());
      }
      Style localStyle = getStyle();
      zbtc.a(style, localStyle, flag);
      b(this.d.p().C().a(localStyle));
    }
  }
  
  Style p()
  {
    return a(this.d, this.b.c, this.c);
  }
  
  boolean q()
  {
    int i = s();
    return (i != -1) && (i != 15);
  }
  
  public int getSharedStyleIndex()
  {
    c();
    return r();
  }
  
  int r()
  {
    int i = s();
    if (i != -1) {
      return i;
    }
    i = a(this.d, Row.e(this.b.c), this.c.a);
    if (i == -1) {
      return 15;
    }
    return i;
  }
  
  int s()
  {
    return this.c.b;
  }
  
  void b(int paramInt)
  {
    if (paramInt < this.d.p().C().b()) {
      a(paramInt);
    }
  }
  
  String t()
  {
    this.d.p().p().c();
    return this.d.p().d().a(this);
  }
  
  public String getFormula()
  {
    if (this.e) {
      b();
    }
    if (this.c.c != 5) {
      return null;
    }
    return t();
  }
  
  public void setFormula(String value)
  {
    b();
    f();
    if (!zw.b(value)) {
      this.d.p().y().a(this, value.trim(), (byte)0, true);
    }
  }
  
  public void setFormula(String formula, Object value)
  {
    b();
    f();
    if ((formula != null) && (!"".equals(formula)))
    {
      this.d.p().y().a(this, formula.trim(), (byte)0, true);
      if (this.c.c == 5) {
        ((zaai)this.c.d).a(this, value);
      }
    }
  }
  
  String u()
  {
    if (!g()) {
      return null;
    }
    zaai localzaai = (zaai)this.c.d;
    String str = localzaai.j();
    if (str != null) {
      return str;
    }
    return this.d.p().d().a(this);
  }
  
  void b(String paramString)
  {
    if (this.d.p().p().getSettings().getParsingFormulaOnOpen())
    {
      this.d.p().y().a(this, paramString.trim(), (byte)0, false);
    }
    else
    {
      zaai localzaai = new zaai(getRow(), this.c.a, "=" + paramString);
      a(localzaai);
    }
  }
  
  public String getR1C1Formula()
  {
    if (this.e) {
      b();
    }
    if (!g()) {
      return null;
    }
    this.d.p().p().c();
    return zauw.a(this);
  }
  
  public void setR1C1Formula(String value)
  {
    b();
    String str = zauw.b(value, getRow(), this.c.a);
    setFormula(str);
  }
  
  public boolean containsExternalLink()
  {
    if (this.e) {
      b();
    }
    if (g())
    {
      this.d.p().p().c();
      byte[] arrayOfByte1 = v();
      if (this.d.p().y().a((byte)1, arrayOfByte1))
      {
        int i = 0;
        int j = 0;
        int[] arrayOfInt1 = { i };
        int[] arrayOfInt2 = { j };
        this.d.p().y().a(arrayOfByte1, arrayOfInt1, arrayOfInt2);
        i = arrayOfInt1[0];
        j = arrayOfInt2[0];
        Cell localCell = this.d.checkCell(i, j);
        if (localCell != null)
        {
          zbf localzbf = localCell.F();
          byte[] arrayOfByte2 = localzbf.c();
          return zaaq.a(arrayOfByte2, -1, -1, this.d.p());
        }
      }
      else
      {
        return zaaq.a(arrayOfByte1, -1, -1, this.d.p());
      }
    }
    return false;
  }
  
  public ReferredAreaCollection getPrecedents()
  {
    if (this.e) {
      b();
    }
    if (!g()) {
      return null;
    }
    Worksheet localWorksheet = this.d.g();
    localWorksheet.d().c();
    CalculationOptions localCalculationOptions = new CalculationOptions();
    localCalculationOptions.b = true;
    localCalculationOptions.m = false;
    zaca localzaca = new zaca(localWorksheet, 3, localCalculationOptions);
    ReferredAreaCollection localReferredAreaCollection = new ReferredAreaCollection();
    ((zaai)this.c.d).a(localReferredAreaCollection, localzaca);
    localzaca.c();
    return localReferredAreaCollection;
  }
  
  public Cell[] getDependents(boolean isAll)
  {
    return this.d.getDependents(isAll, getRow(), this.c.a);
  }
  
  public Iterator getLeafs()
  {
    if (this.d.a.f == null) {
      return null;
    }
    ArrayList localArrayList = this.d.a.f.a(getRow(), this.c.a);
    if (localArrayList == null) {
      return null;
    }
    return localArrayList.iterator();
  }
  
  byte[] v()
  {
    if (g()) {
      return ((zaai)this.c.d).b;
    }
    return null;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    zaai localzaai;
    if (!g())
    {
      localzaai = new zaai(getRow(), this.c.a, paramArrayOfByte);
      a(localzaai);
    }
    else
    {
      localzaai = (zaai)this.c.d;
      localzaai.b = paramArrayOfByte;
    }
  }
  
  void b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    if ((paramArrayOfByte[0] == 5) && ((paramArrayOfByte[4] == 1) || (paramArrayOfByte[4] == 2)))
    {
      byte[] arrayOfByte = new byte[15];
      arrayOfByte[0] = 7;
      arrayOfByte[4] = paramArrayOfByte[4];
      System.arraycopy(paramArrayOfByte, 5, arrayOfByte, 5, 4);
      System.arraycopy(paramArrayOfByte, 13, arrayOfByte, 9, 2);
      a(arrayOfByte);
    }
    else
    {
      a(paramArrayOfByte);
    }
  }
  
  public int getWidthOfValue()
    throws Exception
  {
    return w().b();
  }
  
  public int getHeightOfValue()
    throws Exception
  {
    String str = getStringValue(0);
    if ((str == null) || ("".equals(str))) {
      return 0;
    }
    return w().c();
  }
  
  com.aspose.cells.b.a.b.zs w()
    throws Exception
  {
    Cells localCells = this.d;
    zgw localzgw = new zgw(getRow(), getColumn());
    localzgw.a(this);
    localzgw.a(o());
    int i = 0;
    int j = 0;
    Range localRange = getMergedRange();
    if (localRange == null)
    {
      i = localCells.getColumnWidthPixel(getColumn());
      j = localCells.getRowHeightPixel(getRow());
    }
    else
    {
      localObject = localRange.a();
      for (k = ((CellArea)localObject).StartColumn; k <= ((CellArea)localObject).EndColumn; k++) {
        i += localCells.getColumnWidthPixel(k);
      }
      for (k = ((CellArea)localObject).StartRow; k <= ((CellArea)localObject).EndRow; k++) {
        j += localCells.getRowHeightPixel(k);
      }
    }
    localzgw.a(I());
    localzgw.b(false);
    Object localObject = zha.a(localzgw, i, j);
    int k = (int)(((zgz)localObject).f * zbxp.a() / 72.0F + 0.5D);
    int m = (int)(((zgz)localObject).e * zbxp.a() / 72.0F + 0.5D);
    com.aspose.cells.b.a.b.zs localzs = new com.aspose.cells.b.a.b.zs(m, k);
    int n = Math.abs(localzgw.c().getRotationAngle());
    if ((n > 0) && (n != 255)) {
      localzs = new com.aspose.cells.b.a.b.zs((int)(m * Math.cos(3.141592653589793D * n / 180.0D) + k * Math.sin(3.141592653589793D * n / 180.0D)), (int)(m * Math.sin(3.141592653589793D * n / 180.0D) + k * Math.cos(3.141592653589793D * n / 180.0D)));
    }
    return localzs;
  }
  
  byte[] x()
  {
    byte[] arrayOfByte1 = v();
    if (arrayOfByte1 == null) {
      return null;
    }
    if (this.d.p().y().a((byte)1, arrayOfByte1))
    {
      byte[] arrayOfByte2 = new byte[17];
      arrayOfByte2[0] = 5;
      arrayOfByte2[4] = 1;
      System.arraycopy(arrayOfByte1, 5, arrayOfByte2, 5, 4);
      arrayOfByte2[9] = 4;
      System.arraycopy(arrayOfByte1, 9, arrayOfByte2, 13, 2);
      return arrayOfByte2;
    }
    return arrayOfByte1;
  }
  
  public boolean isArrayHeader()
  {
    if (this.e) {
      b();
    }
    if (g()) {
      return ((zaai)this.c.d).k();
    }
    return false;
  }
  
  public CellArea getArrayRange()
  {
    if (!z()) {
      return new CellArea();
    }
    zaai localzaai = (zaai)this.c.d;
    if (localzaai.a() != null) {
      return localzaai.a().a();
    }
    byte[] arrayOfByte = localzaai.b;
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    this.d.p().y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    Cell localCell = this.d.getRows().a(i, false, true, false).a(j, false, true);
    localzaai = (zaai)localCell.c.d;
    return localzaai.a().a();
  }
  
  boolean y()
  {
    if (g()) {
      return ((zaai)this.c.d).l();
    }
    return false;
  }
  
  public boolean isInArray()
  {
    if (this.e) {
      b();
    }
    return z();
  }
  
  boolean z()
  {
    if (g()) {
      return ((zaai)this.c.d).d();
    }
    return false;
  }
  
  boolean A()
  {
    if (g()) {
      return ((zaai)this.c.d).b(this.d);
    }
    return false;
  }
  
  public boolean isInTable()
  {
    if (this.e) {
      b();
    }
    return B();
  }
  
  boolean B()
  {
    if (g()) {
      return ((zaai)this.c.d).a(this.d);
    }
    return false;
  }
  
  Cell C()
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    this.d.p().y().a(v(), arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return this.d.getRows().a(i, false, true, false).a(j, false, true);
  }
  
  zaai D()
  {
    if (!g()) {
      return null;
    }
    zaai localzaai1 = (zaai)this.c.d;
    byte[] arrayOfByte1 = localzaai1.b;
    if (!this.d.p().y().a((byte)1, arrayOfByte1)) {
      return localzaai1;
    }
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    this.d.p().y().a(arrayOfByte1, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    Cell localCell;
    if (i == getRow())
    {
      if (j == this.c.a) {
        localCell = this;
      } else {
        localCell = this.b.a(j, true, true);
      }
    }
    else {
      localCell = this.d.checkCell(i, j);
    }
    if ((localCell != null) && (localCell.g()))
    {
      zaai localzaai2 = (zaai)localCell.c.d;
      if ((localzaai2.a() != null) && (!localzaai2.a().b()))
      {
        byte[] arrayOfByte2 = localzaai2.a().c();
        byte[] arrayOfByte3 = new byte[arrayOfByte2.length];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, arrayOfByte2.length);
        zaaq.a(arrayOfByte3, -1, -1, localzaai1.e, localzaai1.f, this.d.p());
        zaai localzaai3 = new zaai(localzaai1.e, localzaai1.f);
        localzaai3.a(localzaai1);
        localzaai3.b = arrayOfByte3;
        return localzaai3;
      }
    }
    return localzaai1;
  }
  
  void E()
  {
    if (g())
    {
      zaai localzaai = (zaai)this.c.d;
      byte[] arrayOfByte = localzaai.b;
      if (this.d.p().y().a((byte)1, arrayOfByte))
      {
        int i = 0;
        int j = 0;
        int[] arrayOfInt1 = { i };
        int[] arrayOfInt2 = { j };
        this.d.p().y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
        i = arrayOfInt1[0];
        j = arrayOfInt2[0];
        Cell localCell;
        if (i == getRow())
        {
          if (j == this.c.a) {
            localCell = this;
          } else {
            localCell = this.b.a(j, true, true);
          }
        }
        else {
          localCell = this.d.checkCell(i, j);
        }
        if ((localCell != null) && (localCell.g()))
        {
          localzaai = (zaai)localCell.c.d;
          if ((localzaai.a() != null) && (!localzaai.a().b())) {
            localCell.J();
          }
        }
      }
    }
  }
  
  public void setArrayFormula(String arrayFormula, int rowNumber, int columnNumber)
  {
    if ((rowNumber <= 0) || (columnNumber <= 0)) {
      throw new IllegalArgumentException();
    }
    if (((rowNumber > 1) || (columnNumber > 1)) && (this.d.g().getListObjects().c(getRow(), getColumn()) != null))
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = getRow();
      localCellArea.StartColumn = getColumn();
      localCellArea.EndRow = (getRow() + rowNumber - 1);
      localCellArea.EndColumn = (getColumn() + columnNumber - 1);
      ListObjectCollection localListObjectCollection = this.d.g().getListObjects();
      for (int i = 0; i < localListObjectCollection.getCount(); i++)
      {
        int j = localListObjectCollection.get(i).D().c(localCellArea);
        if (j != 0) {
          throw new CellsException(7, "Mutli-Cell array formulas are not allowed in the tables.");
        }
      }
    }
    a(arrayFormula, rowNumber, columnNumber);
  }
  
  void a(String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      throw new IllegalArgumentException();
    }
    zamm.a(getRow() + paramInt1 - 1, this.c.a + paramInt2 - 1);
    b();
    f();
    String str = paramString.trim();
    this.d.p().y().a(this, str, paramInt1, paramInt2);
    byte[] arrayOfByte1 = ((zaai)this.c.d).b;
    ((zaai)this.c.d).b(true);
    int i = getRow();
    int j = i + paramInt1;
    int k = this.c.a + paramInt2;
    for (int m = i; m < j; m++)
    {
      Row localRow;
      if (m == i) {
        localRow = this.b;
      } else {
        localRow = this.d.getRows().a(m, false, true, false);
      }
      for (int n = this.c.a; n < k; n++) {
        if ((m != getRow()) || (n != this.c.a))
        {
          Cell localCell = localRow.a(n, false, true);
          localCell.f();
          byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
          zaai localzaai = new zaai(m, n, arrayOfByte2);
          localzaai.b(true);
          localCell.a(localzaai);
        }
      }
    }
    if (j > i) {
      b();
    }
  }
  
  zaal a(CellArea paramCellArea, boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, boolean paramBoolean3, boolean paramBoolean4)
  {
    byte[] arrayOfByte = this.d.p().y().a().a((byte)2, this.b.c.i(), this.c.a);
    zacb localzacb = new zacb();
    zaal localzaal = new zaal(this.b.c.i(), this.c.a, localzacb, arrayOfByte);
    localzacb.a = paramCellArea;
    localzacb.b(paramBoolean3);
    localzacb.c(paramBoolean4);
    if (paramBoolean1)
    {
      localzacb.d(true);
      localzacb.a(paramString1);
      localzacb.b(paramString2);
    }
    else if (localzacb.f())
    {
      localzacb.d(false);
      localzacb.e(false);
      localzacb.b(paramString1);
    }
    else
    {
      localzacb.d(false);
      localzacb.e(true);
      localzacb.b(paramString1);
    }
    return localzaal;
  }
  
  public void removeArrayFormula(boolean leaveNormalFormula)
  {
    b();
    zaai localzaai = (zaai)this.c.d;
    if (!localzaai.d()) {
      return;
    }
    zbf localzbf = localzaai.a();
    if (localzbf == null)
    {
      localObject = localzaai.b;
      int i = 0;
      int j = 0;
      int[] arrayOfInt1 = { i };
      int[] arrayOfInt2 = { j };
      this.d.p().y().a((byte[])localObject, arrayOfInt1, arrayOfInt2);
      i = arrayOfInt1[0];
      j = arrayOfInt2[0];
      Cell localCell = this.d.getRows().a(i, false, true, false).a(j, false, true);
      localzaai = (zaai)localCell.c.d;
      localzbf = localzaai.a();
    }
    if (localzbf == null) {
      return;
    }
    Object localObject = localzbf.a();
    this.d.a((CellArea)localObject, ((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn, new zho(this.d, leaveNormalFormula ? localzbf.c() : null), false, false);
    b();
  }
  
  public void setAddInFormula(String addInFileName, String addInFunction)
  {
    b();
    f();
    if ((addInFileName != null) && (!"".equals(addInFileName))) {
      addInFileName = zbti.a(addInFileName, 8);
    }
    addInFunction = addInFunction.trim().toUpperCase();
    String str = null;
    zaad localzaad = this.d.p().y();
    String[] arrayOfString = { str };
    byte[] arrayOfByte = localzaad.a(addInFunction, arrayOfString, this);
    str = arrayOfString[0];
    int i = -1;
    int j = -1;
    int k = -1;
    zbth localzbth = this.d.p().w();
    int m = 0;
    int n = 0;
    zbti localzbti = null;
    for (int i1 = 0; i1 < localzbth.getCount(); i1++)
    {
      localzbti = localzbth.a(i1);
      if ((addInFileName == null) || ("".equals(addInFileName)))
      {
        if (localzbti.f())
        {
          i = i1;
          m = 1;
        }
      }
      else if (zw.b(localzbti.i(), addInFileName))
      {
        i = i1;
        m = 1;
      }
      if (m != 0) {
        break;
      }
    }
    Object localObject2;
    Object localObject1;
    if (m == 0)
    {
      localzbti = new zbti();
      if ((addInFileName == null) || ("".equals(addInFileName)))
      {
        localzbti.a(2);
      }
      else
      {
        localzbti.a(0);
        localzbti.c(addInFileName);
        localzbti.a(new String[] { "Sheet1" });
      }
      zwh localzwh = new zwh(localzbti);
      localzwh.a(str, this.d.p().p().h());
      zf.a(localzbti.b(), localzwh);
      k = 1;
      this.d.p().w().a(localzbti);
      j = this.d.p().r().b(this.d.p().w().getCount() - 1 & 0xFFFF, 65534, 65534);
    }
    else
    {
      j = this.d.p().r().f(i, 65534, 65534);
      m = 1;
      for (int i2 = 0; i2 < localzbti.b().size(); i2++)
      {
        localObject2 = (zwh)localzbti.b().get(i2);
        if (zy.a(((zwh)localObject2).e(), str))
        {
          k = i2 + 1;
          n = 1;
          break;
        }
      }
      if (n == 0)
      {
        localObject1 = new zwh(localzbti);
        ((zwh)localObject1).a(str, this.d.p().p().h());
        zf.a(localzbti.b(), localObject1);
        k = localzbti.b().size();
      }
    }
    System.arraycopy(com.aspose.cells.b.a.zc.a(j), 0, arrayOfByte, 1, 2);
    System.arraycopy(com.aspose.cells.b.a.zc.a(k), 0, arrayOfByte, 3, 2);
    if (this.d.p().p().h())
    {
      localObject2 = new byte[8 + arrayOfByte.length];
      System.arraycopy(com.aspose.cells.b.a.zc.a(arrayOfByte.length), 0, localObject2, 0, 4);
      System.arraycopy(arrayOfByte, 0, localObject2, 4, arrayOfByte.length);
      localObject1 = new zaai(getRow(), this.c.a, (byte[])localObject2);
    }
    else
    {
      localObject2 = new byte[2 + arrayOfByte.length];
      System.arraycopy(com.aspose.cells.b.a.zc.a((short)arrayOfByte.length), 0, localObject2, 0, 2);
      System.arraycopy(arrayOfByte, 0, localObject2, 2, arrayOfByte.length);
      localObject1 = new zaai(getRow(), this.c.a, (byte[])localObject2);
    }
    a((zaai)localObject1);
  }
  
  void b(Cell paramCell, int paramInt, CopyOptions paramCopyOptions)
  {
    if (paramCell == null)
    {
      switch (paramInt)
      {
      case 0: 
      case 1: 
      case 8: 
      case 11: 
        f();
        b(-1);
        break;
      case 2: 
      case 3: 
        f();
        b(-1);
        break;
      case 7: 
        b(-1);
        break;
      case 9: 
      case 12: 
        f();
        b(-1);
        break;
      }
      return;
    }
    boolean bool = false;
    Object localObject1;
    Object localObject2;
    switch (paramInt)
    {
    case 0: 
    case 1: 
      g(paramCell, paramCopyOptions);
      break;
    case 2: 
    case 3: 
      b(paramCell, paramCopyOptions);
      localObject1 = getStyle();
      localObject2 = new StyleFlag();
      ((StyleFlag)localObject2).setNumberFormat(true);
      ((StyleFlag)localObject2).setFont(true);
      ((StyleFlag)localObject2).setCellShading(true);
      ((StyleFlag)localObject2).setLocked(true);
      ((StyleFlag)localObject2).setHideFormula(true);
      ((StyleFlag)localObject2).setHorizontalAlignment(true);
      ((StyleFlag)localObject2).setVerticalAlignment(true);
      ((StyleFlag)localObject2).setIndent(true);
      ((StyleFlag)localObject2).setRotation(true);
      ((StyleFlag)localObject2).setShrinkToFit(true);
      ((StyleFlag)localObject2).setTextDirection(true);
      ((StyleFlag)localObject2).setWrapText(true);
      zbtc.a(paramCell.getStyle(), (Style)localObject1, (StyleFlag)localObject2);
      a((Style)localObject1);
      break;
    case 7: 
      if (paramCell.d.p() != this.d.p()) {
        a(paramCell.p());
      } else {
        b(paramCell.r());
      }
      break;
    case 8: 
      b(paramCell, paramCopyOptions);
      bool = paramCell.g();
      break;
    case 9: 
      b(paramCell, paramCopyOptions);
      localObject1 = new StyleFlag();
      ((StyleFlag)localObject1).setNumberFormat(true);
      localObject2 = getStyle();
      zbtc.a(paramCell.getStyle(), (Style)localObject2, (StyleFlag)localObject1);
      a((Style)localObject2);
      bool = paramCell.g();
      break;
    case 11: 
      putValue(paramCell.getValue());
      break;
    case 12: 
      localObject1 = new StyleFlag();
      ((StyleFlag)localObject1).setNumberFormat(true);
      localObject2 = getStyle();
      zbtc.a(paramCell.getStyle(), (Style)localObject2, (StyleFlag)localObject1);
      a((Style)localObject2);
      break;
    }
    if ((bool) && (g()) && ((paramCell.getRow() != getRow()) || (paramCell.c.a != this.c.a)))
    {
      localObject1 = (zaai)this.c.d;
      zaaq.a(this.d.p(), getRow(), getRow() - paramCell.getRow(), paramCell.getRow(), this.c.a, this.c.a - paramCell.c.a, paramCell.c.a, ((zaai)localObject1).b, -1, -1);
      if (((zaai)localObject1).a() != null) {
        ((zaai)localObject1).a().a(this.d.g(), this.d == paramCell.d, paramCell.F().a(), getRow(), this.c.a);
      }
    }
  }
  
  public void copy(Cell cell)
  {
    CopyOptions localCopyOptions = new CopyOptions(2, cell, this);
    g(cell, localCopyOptions);
  }
  
  private void g(Cell paramCell, CopyOptions paramCopyOptions)
  {
    b();
    if (equals(paramCell)) {
      return;
    }
    this.d.p().p().c();
    f();
    if (paramCell.A()) {
      paramCell.E();
    }
    c(paramCell, paramCopyOptions);
    if ((g()) && ((paramCell.getRow() != getRow()) || (paramCell.c.a != this.c.a)))
    {
      zaai localzaai = (zaai)this.c.d;
      zaaq.a(this.d.p(), getRow(), getRow() - paramCell.getRow(), paramCell.getRow(), this.c.a, this.c.a - paramCell.c.a, paramCell.c.a, localzaai.b, -1, -1);
      if (localzaai.a() != null) {
        localzaai.a().a(this.d.g(), this.d == paramCell.d, paramCell.F().a(), getRow(), this.c.a);
      }
    }
  }
  
  zbf F()
  {
    if (g()) {
      return ((zaai)this.c.d).a();
    }
    return null;
  }
  
  void a(zbf paramzbf)
  {
    if (g())
    {
      zaai localzaai = (zaai)this.c.d;
      zaaj localzaaj = new zaaj(localzaai.e, localzaai.f, paramzbf);
      localzaaj.a(localzaai);
      this.d.a.a(localzaai.a, localzaaj);
      this.c.d = localzaaj;
    }
  }
  
  zacb G()
  {
    if (g()) {
      return ((zaai)this.c.d).b();
    }
    return null;
  }
  
  void b(Cell paramCell, CopyOptions paramCopyOptions)
  {
    if (paramCell.c.c == 4) {
      d(paramCell, paramCopyOptions);
    } else if (paramCell.g()) {
      f(paramCell, paramCopyOptions);
    } else {
      a(paramCell.c.c, paramCell.c.d, true);
    }
  }
  
  void c(Cell paramCell, CopyOptions paramCopyOptions)
  {
    if (paramCell.c.c == 4) {
      d(paramCell, paramCopyOptions);
    } else if (paramCell.g()) {
      f(paramCell, paramCopyOptions);
    } else {
      a(paramCell.c.c, paramCell.c.d, true);
    }
    if (paramCell.d.p() != this.d.p())
    {
      if (paramCopyOptions != null)
      {
        int i = paramCopyOptions.d(paramCell.r());
        b(i);
      }
      else
      {
        a(paramCell.p(), paramCopyOptions);
      }
    }
    else {
      b(paramCell.r());
    }
  }
  
  void d(Cell paramCell, CopyOptions paramCopyOptions)
  {
    zbbj localzbbj = (zbbj)paramCell.c.d;
    if (localzbbj.f())
    {
      zbdd localzbdd1 = (zbdd)localzbbj;
      if ((this.d.p() == paramCell.d.p()) && (localzbdd1.j()))
      {
        localzbdd1.d += 1;
        a(4, localzbdd1, true);
        return;
      }
      zbdd localzbdd2 = new zbdd(localzbdd1.c, null);
      localzbdd2.a(paramCell, localzbdd1, this);
      this.d.d().a(localzbdd2);
      a(4, localzbdd2, true);
    }
    else if (this.d.p() == paramCell.d.p())
    {
      localzbbj.d += 1;
      a(4, localzbbj, true);
    }
    else
    {
      a(4, localzbbj.c);
    }
    this.c.e = paramCell.c.e;
  }
  
  void e(Cell paramCell, CopyOptions paramCopyOptions)
  {
    if (paramCell.c.c == 4) {
      d(paramCell, paramCopyOptions);
    } else if (paramCell.g())
    {
      if ((paramCopyOptions.a()) || (paramCell.d.p() == this.d.p()))
      {
        zaai localzaai = ((zaai)paramCell.c.d).a(getRow(), this.c.a, paramCell.d.p(), this.d.p(), paramCopyOptions);
        a(localzaai);
      }
      else
      {
        f(paramCell, paramCopyOptions);
      }
    }
    else {
      a(paramCell.c.c, paramCell.c.d, true);
    }
    if ((paramCopyOptions.a()) || (paramCell.d.p() == this.d.p()))
    {
      b(paramCell.s());
    }
    else
    {
      int i = paramCell.s();
      if (paramCopyOptions.d.get(Integer.valueOf(i)) != null)
      {
        b(((Integer)paramCopyOptions.d.get(Integer.valueOf(i))).intValue());
      }
      else
      {
        Style localStyle1 = paramCell.p();
        if (localStyle1 == null)
        {
          b(-1);
        }
        else
        {
          zbzv localzbzv = (zbzv)this.d.p().C();
          if ((localStyle1.h() != -1) && (localStyle1.h() != 0))
          {
            if (paramCopyOptions.d.get(Integer.valueOf(localStyle1.h())) == null)
            {
              Style localStyle2 = paramCell.d.p().e(localStyle1.h());
              paramCopyOptions.d.put(Integer.valueOf(localStyle1.h()), Integer.valueOf(localzbzv.g(localStyle2)));
            }
            int j = ((Integer)paramCopyOptions.d.get(Integer.valueOf(localStyle1.h()))).intValue();
            b(localzbzv.a(localStyle1, j));
          }
          else
          {
            b(localzbzv.a(localStyle1));
          }
        }
        paramCopyOptions.d.put(Integer.valueOf(i), Integer.valueOf(s()));
      }
    }
  }
  
  void f(Cell paramCell, CopyOptions paramCopyOptions)
  {
    if (paramCopyOptions != null) {
      paramCopyOptions.a = true;
    }
    zaai localzaai1 = (zaai)paramCell.c.d;
    if ((paramCopyOptions != null) && (paramCopyOptions.e == 2)) {
      localzaai1 = paramCell.D();
    }
    zaai localzaai2 = localzaai1.a(getRow(), getColumn(), paramCell.d.p(), this.d.p(), paramCopyOptions);
    if ((paramCopyOptions != null) && (!paramCopyOptions.a))
    {
      zaai localzaai3 = (zaai)paramCell.c.d;
      if (localzaai3.c == 4) {
        putValue((String)localzaai3.d);
      } else {
        a(localzaai3.c, localzaai3.d, true);
      }
    }
    else
    {
      a(localzaai2);
    }
  }
  
  void a(byte paramByte)
  {
    if (g()) {
      h().a(paramByte);
    }
  }
  
  void a(zaai paramzaai)
  {
    this.d.a.a(paramzaai);
    a(5, paramzaai, true);
  }
  
  void a(int paramInt, Object paramObject)
  {
    if (this.c.c == 5)
    {
      zaai localzaai = (zaai)this.c.d;
      localzaai.c = paramInt;
      localzaai.d = paramObject;
      return;
    }
    if (paramInt == 4) {
      a(4, this.d.p().g.a((String)paramObject), false);
    } else {
      a(paramInt, paramObject, false);
    }
  }
  
  void a(Object paramObject, byte paramByte)
  {
    a(paramByte);
    zaai localzaai = (zaai)this.c.d;
    Object localObject = localzaai.d;
    if (paramObject == null)
    {
      localzaai.c = 6;
      localzaai.d = Integer.valueOf(2);
      return;
    }
    if ((paramObject instanceof zuf))
    {
      localzaai.c = 3;
      localzaai.d = zi.a(ztr.b((zuf)paramObject));
      return;
    }
    if ((paramObject instanceof String))
    {
      localzaai.c = 4;
      localzaai.d = paramObject;
      return;
    }
    if (com.aspose.cells.a.c.zc.a(paramObject))
    {
      if (z())
      {
        zaad.a(paramObject, this);
      }
      else
      {
        Object[][] arrayOfObject = (Object[][])paramObject;
        a(arrayOfObject[0][0], paramByte);
      }
      return;
    }
    localzaai.a(this, paramObject);
    if (this.d.p().p().getSettings().getPrecisionAsDisplayed()) {
      a(this.c);
    }
  }
  
  public Object getValue()
  {
    c();
    return m();
  }
  
  public void setValue(Object value)
  {
    putValue(value);
  }
  
  public boolean isStyleSet()
  {
    if (this.e) {
      b();
    }
    return q();
  }
  
  void a(String paramString, ArrayList paramArrayList)
  {
    Object localObject;
    if ((paramArrayList.size() == 0) || (paramArrayList.size() == 1))
    {
      putValue(paramString);
      if (paramArrayList.size() == 1)
      {
        localObject = (FontSetting)paramArrayList.get(0);
        Style localStyle = getStyle();
        localStyle.getFont().a(((FontSetting)localObject).getFont(), null);
        a(localStyle);
      }
    }
    else
    {
      localObject = new zbdd(paramString, null);
      ((zbdd)localObject).a(paramArrayList);
      this.d.d().a((zbbj)localObject);
      a(4, localObject, true);
    }
  }
  
  public FontSetting characters(int startIndex, int length)
  {
    b();
    if (this.c.c != 4) {
      throw new CellsException(7, "This method only works on cell with string value.");
    }
    Object localObject1 = null;
    zbbj localzbbj = (zbbj)this.c.d;
    if (localzbbj.f())
    {
      localObject1 = (zbdd)this.c.d;
      if (((zbdd)localObject1).j()) {
        if (((zbdd)localObject1).d > 1)
        {
          localObject2 = new zbdd(((zbdd)localObject1).c, null, 1);
          ((zbdd)localObject2).a((zbdd)localObject1, this);
          localObject1.d -= 1;
          localObject1 = localObject2;
          this.d.d().a((zbbj)localObject1);
          a(4, localObject1, false);
        }
        else
        {
          ((zbdd)localObject1).a(this);
        }
      }
    }
    else
    {
      this.d.d().d(localzbbj);
      localObject1 = new zbdd(((zbbj)this.c.d).c, null, 1);
      ((zbdd)localObject1).a(new ArrayList());
      this.d.d().a((zbbj)localObject1);
      a(4, localObject1, false);
    }
    Object localObject2 = ((zbdd)localObject1).i();
    for (int i = 0; i < ((ArrayList)localObject2).size(); i++)
    {
      localFontSetting1 = (FontSetting)((ArrayList)localObject2).get(i);
      if ((localFontSetting1.getLength() == length) && (localFontSetting1.getStartIndex() == startIndex)) {
        return localFontSetting1;
      }
    }
    FontSetting localFontSetting1 = new FontSetting(startIndex, length, this.d.p());
    i = 0;
    for (int j = 0; j < ((ArrayList)localObject2).size(); j++)
    {
      FontSetting localFontSetting2 = (FontSetting)((ArrayList)localObject2).get(j);
      if ((localFontSetting2.getStartIndex() <= startIndex) && (localFontSetting2.getLength() + localFontSetting2.getStartIndex() >= length + startIndex))
      {
        i = 1;
        localFontSetting1.getFont().a(localFontSetting2.getFont(), null);
      }
    }
    if (i == 0) {
      localFontSetting1.getFont().a(p().getFont(), null);
    }
    localFontSetting1.getFont().o();
    zf.a((ArrayList)localObject2, localFontSetting1);
    return localFontSetting1;
  }
  
  public boolean isRichText()
  {
    if (this.e) {
      b();
    }
    return H();
  }
  
  boolean H()
  {
    return (this.c.c == 4) && (((zbbj)this.c.d).f());
  }
  
  public FontSetting[] getCharacters()
  {
    return getCharacters(false);
  }
  
  public FontSetting[] getCharacters(boolean flag)
  {
    if (H())
    {
      zbdd localzbdd = (zbdd)this.c.d;
      ArrayList localArrayList = localzbdd.a(this.d.p(), k().length(), p().getFont());
      FontSetting[] arrayOfFontSetting = new FontSetting[localArrayList.size()];
      for (int i = 0; i < arrayOfFontSetting.length; i++) {
        arrayOfFontSetting[i] = ((FontSetting)localArrayList.get(i));
      }
      if (flag)
      {
        ListObjectCollection localListObjectCollection = this.d.g().k();
        if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
        {
          int j = localListObjectCollection.b(getRow(), getColumn());
          if (j > -1)
          {
            ListObject localListObject = localListObjectCollection.get(j);
            int k = localListObject.c(getRow(), getColumn());
            if (k > -1)
            {
              Style localStyle1 = localListObject.n(k);
              Style localStyle2 = this.d.g().c().Q();
              if (localStyle1.isModified(11)) {
                for (int m = 0; m < arrayOfFontSetting.length; m++) {
                  zla.a(arrayOfFontSetting[m].getFont(), localStyle1, localStyle2);
                }
              }
            }
          }
        }
      }
      return arrayOfFontSetting;
    }
    return null;
  }
  
  public void setCharacters(FontSetting[] characters)
  {
    if (this.c.c != 4) {
      throw new CellsException(7, "This method only works on cell with string value.");
    }
    if ((characters == null) || (characters.length == 0))
    {
      if (isRichText()) {
        putValue(getStringValue());
      }
      return;
    }
    zbdd localzbdd = null;
    zbbj localzbbj = (zbbj)this.c.d;
    if (characters.length == 1)
    {
      FontSetting localFontSetting = characters[0];
      if ((localFontSetting.getStartIndex() == 0) && (localzbbj.c.length() == localFontSetting.getLength()))
      {
        if (localzbbj.f()) {
          putValue(localzbbj.c);
        }
        Style localStyle = o();
        localStyle.getFont().a(localFontSetting.getFont(), null);
        setStyle(localStyle);
        return;
      }
    }
    if (localzbbj.f())
    {
      localzbdd = (zbdd)localzbbj;
    }
    else
    {
      this.d.d().d(localzbbj);
      localzbdd = new zbdd(((zbbj)this.c.d).c, null, 1);
      this.d.d().a(localzbdd);
      a(4, localzbdd, false);
    }
    localzbdd.g = new ArrayList();
    zf.b(localzbdd.g, characters);
    localzbdd.f = null;
  }
  
  ArrayList I()
  {
    ArrayList localArrayList1 = new ArrayList();
    Style localStyle = getStyle();
    Object localObject;
    if (!H())
    {
      localObject = new zqb();
      ((zqb)localObject).a = k();
      ((zqb)localObject).b = localStyle.q();
      zf.a(localArrayList1, localObject);
    }
    else
    {
      localObject = (zbdd)this.c.d;
      ArrayList localArrayList2 = ((zbdd)localObject).a(this.d.p(), k().length(), p().getFont());
      for (int i = 0; i < localArrayList2.size(); i++)
      {
        FontSetting localFontSetting = (FontSetting)localArrayList2.get(i);
        zqb localzqb = new zqb();
        localzqb.a = ((zbdd)localObject).c.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength());
        localzqb.b = (localFontSetting.h() == null ? localStyle.getFont() : localFontSetting.getFont());
        zf.a(localArrayList1, localzqb);
      }
    }
    return localArrayList1;
  }
  
  ArrayList a(zzu paramzzu, Style paramStyle)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    if (!H())
    {
      localObject1 = new zqb();
      if (getWorksheet().getShowFormulas())
      {
        if (this.c.c == 5) {
          ((zqb)localObject1).a = t();
        } else {
          ((zqb)localObject1).a = this.c.a(true, getWorksheet().getWorkbook().getSettings());
        }
      }
      else
      {
        localObject2 = this.c.e();
        ((zqb)localObject1).a = b((zgs)localObject2, paramzzu, paramStyle, this.d);
      }
      localObject2 = paramStyle.q();
      if (localObject2 != null)
      {
        ((zqb)localObject1).b = new Font(this.d.p(), null, false);
        ((zqb)localObject1).b.a((Font)localObject2, null);
      }
      zf.a(localArrayList, localObject1);
    }
    else
    {
      localObject1 = (zbdd)this.c.d;
      localObject2 = ((zbdd)localObject1).a(this.d.p(), k().length(), p().getFont());
      Font localFont1 = paramStyle.q();
      for (int i = 0; i < ((ArrayList)localObject2).size(); i++)
      {
        FontSetting localFontSetting = (FontSetting)((ArrayList)localObject2).get(i);
        zqb localzqb = new zqb();
        localzqb.a = ((zbdd)localObject1).c.substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength());
        Font localFont2 = localFontSetting.h();
        if (localFont2 == null) {
          localFont2 = localFont1;
        }
        if (localFont2 != null)
        {
          localzqb.b = new Font(this.d.p(), null, false);
          localzqb.b.a(localFont2, null);
        }
        zf.a(localArrayList, localzqb);
      }
    }
    return localArrayList;
  }
  
  public boolean isMerged()
  {
    return this.d.o().c(getRow(), this.c.a);
  }
  
  public Range getMergedRange()
  {
    return this.d.o().a(this.d, getRow(), this.c.a);
  }
  
  public String getHtmlString()
    throws Exception
  {
    return zgv.a(this);
  }
  
  public void setHtmlString(String value)
  {
    zgv.a(this, value);
  }
  
  void J()
  {
    if (y())
    {
      zaai localzaai1 = (zaai)this.c.d;
      byte[] arrayOfByte1 = localzaai1.a().c();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
      zaaq.a(arrayOfByte2, -1, -1, localzaai1.e, localzaai1.f, this.d.p());
      zaai localzaai2 = new zaai(localzaai1.e, localzaai1.f);
      localzaai2.a(localzaai1);
      localzaai2.b = arrayOfByte2;
      this.d.a.a(localzaai1.a, localzaai2);
      this.c.d = localzaai2;
      CellArea localCellArea = localzaai1.a().a();
      int i = localCellArea.StartColumn;
      int j = localCellArea.EndColumn;
      RowCollection localRowCollection = this.d.getRows();
      zv localzv = this.d.e();
      zaja localzaja = localRowCollection.a.a(localCellArea.StartRow, localCellArea.EndRow, false);
      zgs localzgs1 = new zgs();
      zgs localzgs2 = localzgs1;
      while (localzaja.hasNext())
      {
        zt localzt = localzaja.e();
        zaiv localzaiv = localzt.b(i, j, false);
        if (localzaiv != null) {
          for (;;)
          {
            int k = localzaiv.a();
            if (k < 0) {
              break;
            }
            localzgs2 = localzt.a(k, localzgs1, 7);
            if (localzgs2.c == 5)
            {
              localzaai1 = (zaai)localzgs2.d;
              if ((localzaai1 != localzaai2) && (this.d.p().y().a((byte)1, localzaai1.b)))
              {
                int m = 0;
                int n = 0;
                int[] arrayOfInt1 = { m };
                int[] arrayOfInt2 = { n };
                this.d.p().y().a(localzaai1.b, arrayOfInt1, arrayOfInt2);
                m = arrayOfInt1[0];
                n = arrayOfInt2[0];
                if ((m == localzaai2.e) && (n == localzaai2.f))
                {
                  arrayOfByte2 = new byte[arrayOfByte1.length];
                  System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
                  zaaq.a(arrayOfByte2, -1, -1, localzt.i(), localzgs2.a, this.d.p());
                  localzaai1.b = arrayOfByte2;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void setSharedFormula(String sharedFormula, int rowNumber, int columnNumber)
  {
    if ((rowNumber <= 0) || (columnNumber <= 0)) {
      throw new IllegalArgumentException();
    }
    b();
    f();
    String str = sharedFormula.trim();
    WorksheetCollection localWorksheetCollection = this.d.p();
    localWorksheetCollection.y().b(this, str, rowNumber, columnNumber);
    byte[] arrayOfByte1 = v();
    int i = getRow();
    int j = i + rowNumber;
    int k = this.c.a + columnNumber;
    for (int m = i; m < j; m++)
    {
      Row localRow;
      if (m == i) {
        localRow = this.b;
      } else {
        localRow = this.d.getRows().a(m, false, true, false);
      }
      for (int n = this.c.a; n < k; n++) {
        if ((m != getRow()) || (n != this.c.a))
        {
          Cell localCell = localRow.a(n, false, true);
          localCell.f();
          byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
          zaai localzaai = new zaai(m, n, arrayOfByte2);
          localCell.a(localzaai);
        }
      }
    }
  }
  
  byte[] a(String paramString, CellArea paramCellArea)
  {
    int i = paramCellArea.EndRow - paramCellArea.StartRow + 1;
    int j = paramCellArea.EndColumn - paramCellArea.StartColumn + 1;
    if ((i <= 0) || (j <= 0)) {
      throw new IllegalArgumentException();
    }
    f();
    this.d.p().y().b(this, paramString.trim(), i, j);
    zaai localzaai = (zaai)this.c.d;
    localzaai.a().a(paramCellArea);
    return localzaai.b;
  }
  
  void c(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    zaai localzaai = new zaai(getRow(), this.c.a, arrayOfByte);
    a(localzaai);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Aspose.Cells.Cell [ ");
    localStringBuilder.append(j());
    localStringBuilder.append("; ValueType : ");
    localStringBuilder.append(ztt.h(getType()));
    if (getType() != 3) {
      localStringBuilder.append("; Value : " + k());
    }
    if (g()) {
      localStringBuilder.append("; Formula:" + getFormula());
    }
    localStringBuilder.append(" ]");
    return com.aspose.cells.b.a.zs.a(localStringBuilder);
  }
  
  public boolean equals(Object obj)
  {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Cell)) {
      return false;
    }
    return equals((Cell)obj);
  }
  
  public int hashCode()
  {
    return this.d.hashCode() + (getRow() << 16 | getColumn());
  }
  
  public boolean equals(Cell cell)
  {
    return (cell == this) || ((this.d == cell.d) && (cell.getColumn() == getColumn()) && ((cell.b.c == this.b.c) || (cell.getRow() == getRow())));
  }
  
  public ConditionalFormattingResult getConditionalFormattingResult()
  {
    if (this.e) {
      b();
    }
    zfe localzfe = zla.a(this.d.g(), this, null, o(), false);
    if (localzfe == null) {
      return null;
    }
    if ((localzfe.a == null) && ((localzfe.c == null) || (localzfe.c.size() == 0))) {
      return null;
    }
    return new ConditionalFormattingResult(localzfe);
  }
  
  public Validation getValidation()
  {
    return this.d.g().getValidations().getValidationInCell(getRow(), getColumn());
  }
  
  public boolean getValidationValue()
  {
    Validation localValidation = getValidation();
    if (localValidation == null) {
      return true;
    }
    zaca localzaca = zla.a(getWorksheet());
    localzaca.d = getRow();
    localzaca.e = this.c.a;
    localzaca.a(localValidation);
    boolean bool = zbyi.a(localValidation, localzaca, this);
    localzaca.c();
    return bool;
  }
  
  public ListObject getTable()
  {
    return this.d.g().getListObjects().c(getRow(), getColumn());
  }
  
  static int a(Cells paramCells, zt paramzt, int paramInt)
  {
    int i = paramzt.g(paramInt);
    if (i > -1) {
      return i;
    }
    i = Row.e(paramzt);
    if (i < 0) {
      i = paramCells.g(paramzt.a(paramInt));
    }
    if (i < 0) {
      return 15;
    }
    return i;
  }
  
  static int a(Cells paramCells, int paramInt, zgs paramzgs)
  {
    if (paramzgs.b < 0)
    {
      if (paramInt > 0) {
        return paramInt;
      }
      paramInt = paramCells.g(paramzgs.a);
      if (paramInt != -1) {
        return paramInt;
      }
      return 15;
    }
    return paramzgs.b;
  }
  
  static Style b(Cells paramCells, zt paramzt, int paramInt)
  {
    Style localStyle = new Style(paramCells.p());
    localStyle.a(paramCells.p(), a(paramCells, paramzt, paramInt));
    return localStyle;
  }
  
  static Style c(Cells paramCells, zt paramzt, int paramInt)
  {
    int i = paramzt.g(paramInt);
    if (i < 0)
    {
      i = Row.e(paramzt);
      if (i < 0)
      {
        i = paramCells.g(paramzt.a(paramInt));
        if (i < 0) {
          return paramCells.p().Q();
        }
      }
    }
    return paramCells.p().f(i);
  }
  
  static Style a(Cells paramCells, zt paramzt, zgs paramzgs)
  {
    int i = paramzgs.b;
    if (i < 0)
    {
      i = Row.e(paramzt);
      if (i < 0)
      {
        i = paramCells.g(paramzgs.a);
        if (i < 0) {
          return paramCells.p().Q();
        }
      }
    }
    return paramCells.p().f(i);
  }
  
  static Style a(Cells paramCells, zt paramzt, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 0)
    {
      paramInt2 = Row.e(paramzt);
      if (paramInt2 < 0)
      {
        paramInt2 = paramCells.g(paramInt1);
        if (paramInt2 < 0) {
          return paramCells.p().Q();
        }
      }
    }
    return paramCells.p().f(paramInt2);
  }
  
  static Style b(Cells paramCells, int paramInt, zgs paramzgs)
  {
    int i = paramzgs.b;
    if (i < 0) {
      if (paramInt < 0)
      {
        i = paramCells.g(paramzgs.a);
        if (i < 0) {
          return paramCells.p().Q();
        }
      }
      else
      {
        i = paramInt;
      }
    }
    return paramCells.p().f(i);
  }
  
  static int a(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      paramInt1 = paramCells.g(paramInt2);
      if (paramInt1 < 0) {
        return 15;
      }
    }
    return paramInt1;
  }
  
  static Style a(Cells paramCells, Row paramRow, zgs paramzgs, int paramInt, boolean paramBoolean)
  {
    Style localStyle = new Style(paramCells.p());
    localStyle.copy(a(paramCells, paramRow.c, paramzgs));
    if (paramBoolean)
    {
      localStyle = paramCells.a(localStyle, paramRow.c.i(), paramzgs.a, 0, 1048575, false, paramRow.a.a);
      localStyle = paramCells.a(localStyle, paramRow.c, paramzgs.a, paramInt, 0, 16383, false);
    }
    return localStyle;
  }
  
  static String b(Cells paramCells, zt paramzt, zgs paramzgs)
  {
    zgs localzgs = paramzgs.e();
    switch (localzgs.c)
    {
    case 0: 
      return "";
    case 4: 
      return (String)localzgs.d;
    case 3: 
      return paramCells.g().getWorkbook().getSettings().getGlobalizationSettings().getErrorValueString(localzgs.g());
    }
    return a(a(localzgs, paramCells.g().d().getSettings().f().j(), a(paramCells, paramzt, paramzgs), paramCells));
  }
  
  static String a(Cells paramCells, Style paramStyle, zgs paramzgs)
  {
    zgs localzgs = paramzgs.e();
    switch (localzgs.c)
    {
    case 0: 
      return "";
    case 4: 
      return (String)localzgs.d;
    case 3: 
      return paramCells.g().getWorkbook().getSettings().getGlobalizationSettings().getErrorValueString(localzgs.g());
    }
    return a(a(localzgs, paramCells.g().d().getSettings().f().j(), paramStyle, paramCells));
  }
  
  private static String a(zzz paramzzz)
  {
    if ((paramzzz == null) || (paramzzz.b())) {
      return "";
    }
    if (paramzzz.e()) {
      return "###############################################################################################################################################################################################################################################################";
    }
    return paramzzz.a(0, true);
  }
  
  static String a(Cells paramCells, zt paramzt, zgs paramzgs, int paramInt, boolean paramBoolean)
  {
    zgs localzgs = paramzgs.e();
    if (localzgs.c == 0) {
      return "";
    }
    if (localzgs.c == 3) {
      return paramCells.g().getWorkbook().getSettings().getGlobalizationSettings().getErrorValueString(localzgs.g());
    }
    return a(a(localzgs, paramCells.g().d().getSettings().f().j(), a(paramCells, paramzt, paramzgs), paramCells), paramInt, paramBoolean);
  }
  
  static String a(Cells paramCells, Style paramStyle, zgs paramzgs, int paramInt, boolean paramBoolean)
  {
    return a(a(paramzgs.e(), paramCells.g().d().getSettings().f().j(), paramStyle, paramCells), paramInt, paramBoolean);
  }
  
  private static String a(zzz paramzzz, int paramInt, boolean paramBoolean)
  {
    if (paramzzz == null) {
      return "";
    }
    if (paramzzz.e())
    {
      if (paramInt <= 1) {
        return "#";
      }
    }
    else if (paramInt < 0) {
      return paramzzz.h();
    }
    return paramzzz.a(paramInt, paramBoolean);
  }
  
  static zzz a(zgs paramzgs, zzu paramzzu, Style paramStyle, Cells paramCells)
  {
    int i = 18;
    int j = 0;
    Object localObject;
    switch (paramzgs.c)
    {
    case 0: 
      return null;
    case 3: 
      localObject = new zzz();
      ((zzz)localObject).a(1, paramzzu.b() == null ? paramzgs.g() : paramzzu.b().getErrorValueString(paramzgs.g()));
      return (zzz)localObject;
    case 1: 
      if ((!paramCells.g().getDisplayZeros()) && (((Double)paramzgs.d).doubleValue() == 0.0D)) {
        j = 1;
      }
      i = 14;
      break;
    case 6: 
      if ((!paramCells.g().getDisplayZeros()) && (((Integer)paramzgs.d).intValue() == 0)) {
        j = 1;
      }
      i = 9;
      break;
    case 2: 
      i = 3;
      break;
    }
    if (j != 0)
    {
      localObject = paramStyle.s();
      if (localObject != null)
      {
        int k = ((String)localObject).indexOf(';');
        if ((k > -1) && (((String)localObject).indexOf(';', k + 1) > 0))
        {
          zzx localzzx = paramCells.g().d().getSettings().f();
          zahf localzahf = localzzx.a(paramStyle);
          if (localzahf.a() == 6)
          {
            zzy[] arrayOfzzy = ((zaab)localzahf).c();
            if ((arrayOfzzy.length == 3) && ((arrayOfzzy[2].a() == 6) || ((arrayOfzzy[2].a() == 1) && (arrayOfzzy[2].b() == 0.0D)))) {
              return ((zaab)localzahf).d()[2].a(localzzx.j(), 9, Integer.valueOf(0));
            }
          }
        }
      }
      return null;
    }
    return paramCells.g().d().getSettings().f().a(paramStyle).a(paramzzu, i, paramzgs.d);
  }
  
  static String b(zgs paramzgs, zzu paramzzu, Style paramStyle, Cells paramCells)
  {
    return a(a(paramzgs, paramzzu, paramStyle, paramCells), paramzzu.a(), paramStyle);
  }
  
  static String a(zzz paramzzz, zahy paramzahy, Style paramStyle)
  {
    if ((paramzzz == null) || (paramzzz.b())) {
      return "";
    }
    int i;
    if (paramzzz.e())
    {
      i = paramzahy.a(null, '#');
      if (i < 1) {
        return "";
      }
      return zw.a('#', i);
    }
    if (paramStyle.getShrinkToFit()) {
      return paramzzz.a(0, true);
    }
    if (paramzzz.j() > 0) {
      for (i = paramzzz.j() - 1; i > -1; i--) {
        if (paramzzz.a(i)) {
          return paramzzz.a(Math.max(0, paramzahy.a(paramzzz.a(0, false), paramzzz.c(i))), true);
        }
      }
    }
    char[] arrayOfChar1;
    switch (paramStyle.getHorizontalAlignment())
    {
    case 4: 
      arrayOfChar1 = paramzzz.b(0, true);
      if ((arrayOfChar1 == null) || (arrayOfChar1.length < 1)) {
        return "";
      }
      int j = paramzahy.a(null, paramzzz.a(0, false));
      if (j < 2) {
        return new String(arrayOfChar1);
      }
      char[] arrayOfChar2 = new char[arrayOfChar1.length * j];
      j--;
      while (j > -1)
      {
        System.arraycopy(arrayOfChar1, 0, arrayOfChar2, j * arrayOfChar1.length, arrayOfChar1.length);
        j--;
      }
      return new String(arrayOfChar2);
    case 3: 
      arrayOfChar1 = paramzzz.b(0, true);
      if ((arrayOfChar1 == null) || (arrayOfChar1.length < 1)) {
        return "";
      }
      String str = new String(arrayOfChar1);
      str = zw.a(str);
      if (str.length() < arrayOfChar1.length)
      {
        if (str.equals("")) {
          return new String(arrayOfChar1);
        }
        arrayOfChar1 = str.toCharArray();
      }
      int k = paramzahy.a(new String(paramzzz.b(0, false), 0, arrayOfChar1.length), ' ');
      if (k < 1) {
        return str;
      }
      zami localzami = new zami();
      zgz.a(str, false, k + 1, localzami);
      if ((localzami.a() == 0) || (localzami.a() > k)) {
        return str;
      }
      k /= localzami.a();
      char[] arrayOfChar3 = new char[arrayOfChar1.length + k * localzami.a()];
      int m = arrayOfChar3.length;
      int n = arrayOfChar1.length;
      for (int i3 = localzami.a() - 1; i3 > -1; i3--)
      {
        int i2 = localzami.b(i3);
        i1 = n - i2;
        m -= i1;
        System.arraycopy(arrayOfChar1, i2, arrayOfChar3, m, i1);
        com.aspose.cells.a.c.zc.a(arrayOfChar3, m - k, m, ' ');
        m -= k;
        n = i2;
      }
      int i1 = localzami.b(0);
      System.arraycopy(arrayOfChar1, 0, arrayOfChar3, 0, i1);
      com.aspose.cells.a.c.zc.a(arrayOfChar3, i1, i1 + k, ' ');
      return new String(arrayOfChar3);
    }
    return paramzzz.a(0, true);
  }
  
  static void a(Worksheet paramWorksheet, int paramInt, zgs paramzgs, zgt paramzgt, boolean paramBoolean, zaca paramzaca)
  {
    ListObjectCollection localListObjectCollection = paramWorksheet.k();
    Object localObject1;
    if ((localListObjectCollection != null) && (localListObjectCollection.getCount() > 0))
    {
      int i = localListObjectCollection.b(paramInt, paramzgs.a);
      if (i > -1)
      {
        localObject1 = localListObjectCollection.get(i);
        int j = ((ListObject)localObject1).c(paramInt, paramzgs.a);
        if (j > -1) {
          localListObjectCollection.a.a(i, j, paramzgt);
        }
      }
    }
    ConditionalFormattingCollection localConditionalFormattingCollection = paramWorksheet.G();
    Object localObject2;
    if ((localConditionalFormattingCollection != null) && (localConditionalFormattingCollection.getCount() > 0))
    {
      if (paramzaca != null) {
        if (paramzgt.e == null)
        {
          paramzaca.d = paramInt;
          paramzaca.e = paramzgs.a;
        }
        else
        {
          paramzaca.d = paramzgt.e.getRow();
          paramzaca.e = paramzgt.e.c.a;
        }
      }
      localObject1 = zla.a(paramWorksheet, paramzgt.e, paramzaca, paramzgt.a, paramzgt.c);
      if ((((zfe)localObject1).a != null) || (((zfe)localObject1).c != null))
      {
        paramzgt.d = ((zfe)localObject1).c;
        localObject2 = new ConditionalFormattingResult((zfe)localObject1);
        if ((((zfe)localObject1).a != null) || (((ConditionalFormattingResult)localObject2).getConditionalFormattingColorScale() != null))
        {
          if ((paramzgt.c) && (((zfe)localObject1).b == paramzgt.a))
          {
            paramzgt.a();
            ((zfe)localObject1).b = paramzgt.a;
          }
          paramzgt.a = ((ConditionalFormattingResult)localObject2).a();
          paramzgt.c = false;
          if ((paramBoolean) && (((ConditionalFormattingResult)localObject2).getConditionalStyle() != null) && (((ConditionalFormattingResult)localObject2).getConditionalStyle().isModified(16))) {
            paramBoolean = false;
          }
        }
      }
    }
    if (paramBoolean)
    {
      localObject1 = paramzgt.a.s();
      if ((localObject1 == null) || (((String)localObject1).equals(""))) {
        localObject1 = paramWorksheet.d().getSettings().f().d(paramzgt.a.getNumber());
      }
      if ((localObject1 != null) && (((String)localObject1).indexOf('[') > -1))
      {
        localObject2 = paramzgs.e();
        int k = 18;
        switch (((zgs)localObject2).c)
        {
        case 0: 
        case 3: 
          paramBoolean = false;
          break;
        case 1: 
          if ((!paramWorksheet.getDisplayZeros()) && (((Double)((zgs)localObject2).d).doubleValue() == 0.0D)) {
            paramBoolean = false;
          } else {
            k = 14;
          }
          break;
        case 6: 
          if ((!paramWorksheet.getDisplayZeros()) && (((Integer)((zgs)localObject2).d).intValue() == 0)) {
            paramBoolean = false;
          } else {
            k = 9;
          }
          break;
        case 2: 
          k = 3;
          break;
        }
        if (paramBoolean)
        {
          zahf localzahf = paramWorksheet.d().getSettings().f().a((String)localObject1, paramzgt.c);
          if (localzahf.a() == 6) {
            localzahf = ((zaab)localzahf).b(null, k, ((zgs)localObject2).d);
          }
          if ((localzahf != null) && (!localzahf.b().d().isEmpty()))
          {
            paramzgt.a();
            paramzgt.a.getFont().setColor(localzahf.b().d());
          }
        }
      }
    }
  }
  
  static boolean a(Cells paramCells, zgs paramzgs, int paramInt)
  {
    if (paramzgs.c != 0) {
      return false;
    }
    if (paramzgs.b < 0) {
      return true;
    }
    if (paramzgs.b == paramInt) {
      return true;
    }
    if (paramInt > -1) {
      return false;
    }
    int i = paramCells.g(paramzgs.a);
    return (i > -1) && (paramzgs.b == i);
  }
  
  static long a(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt2 << 32 | paramInt3 << 16 | paramInt1;
  }
  
  static int a(long paramLong)
  {
    return (int)(paramLong & 0xFFFF);
  }
  
  static int b(long paramLong)
  {
    return (int)(paramLong >> 32);
  }
  
  static int c(long paramLong)
  {
    return (int)(paramLong >> 16 & 0xFFFF);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Cell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */