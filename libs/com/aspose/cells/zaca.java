package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;

class zaca
  extends zaae
{
  public Cells g;
  public boolean h = false;
  public boolean i = false;
  public boolean j = false;
  public boolean k = false;
  public CellArea l = CellArea.a;
  public int m = 0;
  public int n = -1;
  public zwp o;
  public zabz p;
  
  void c()
  {
    this.c = null;
    this.g = null;
    this.b = null;
    this.o = null;
    this.p.a();
    this.p = null;
  }
  
  public zaca(Worksheet paramWorksheet)
  {
    this.p = new zabz(paramWorksheet.d());
    a(paramWorksheet);
  }
  
  public zaca(Workbook paramWorkbook, int paramInt, CalculationOptions paramCalculationOptions)
  {
    this.p = new zabz(paramWorkbook, paramInt, paramCalculationOptions);
    this.o = l();
  }
  
  public zaca(Worksheet paramWorksheet, int paramInt, CalculationOptions paramCalculationOptions)
  {
    this.p = new zabz(paramWorksheet.d(), paramInt, paramCalculationOptions);
    a(paramWorksheet);
  }
  
  public zaca(zaca paramzaca)
  {
    super.a(paramzaca);
    this.g = paramzaca.g;
    this.h = paramzaca.h;
    this.i = paramzaca.i;
    this.j = paramzaca.j;
    this.l = paramzaca.l;
    this.n = paramzaca.n;
    this.o = paramzaca.o;
    this.p = paramzaca.p;
  }
  
  public void d()
  {
    this.h = false;
    this.i = false;
    this.f = false;
    this.j = false;
    this.l = CellArea.a;
    this.m = 0;
  }
  
  public void a(zaai paramzaai)
  {
    super.a(paramzaai);
    this.h = paramzaai.d();
    this.i = false;
    this.j = false;
    this.l = CellArea.a;
    this.m = 0;
  }
  
  public zaca e()
  {
    if (this.h)
    {
      if (this.l.c())
      {
        localzaca = new zaca(this);
        localzaca.l = CellArea.createCellArea(this.d, this.e, this.d + 2, this.e + 2);
        if (this.j) {
          localzaca.f();
        }
        return localzaca;
      }
      return this;
    }
    zaca localzaca = new zaca(this);
    localzaca.h = true;
    if ((this.l.b()) || (this.l.c())) {
      localzaca.l = CellArea.createCellArea(this.d, this.e, this.d + 2, this.e + 2);
    } else if (this.j) {
      localzaca.f();
    }
    return localzaca;
  }
  
  public void a(Worksheet paramWorksheet)
  {
    this.c = paramWorksheet;
    this.n = paramWorksheet.getIndex();
    this.o = a(this.p.f, this.n, this.n);
    this.g = paramWorksheet.getCells();
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
    this.c = this.p.e.get(paramInt);
    this.o = a(this.p.f, this.n, this.n);
    this.g = this.c.getCells();
  }
  
  public boolean a()
  {
    return (this.p.p == 0) || (this.p.L.getCustomFunction() != null);
  }
  
  public WorksheetCollection b()
  {
    return this.p.e;
  }
  
  public void f()
  {
    if (this.p.o) {
      this.m = 0;
    }
    if (this.l.d()) {
      this.m = 2;
    } else if (this.l.e()) {
      this.m = 1;
    } else {
      this.m = 3;
    }
  }
  
  public void b(int paramInt)
  {
    if ((paramInt & this.m) == this.m) {
      return;
    }
    if (this.m == 3) {
      this.m = paramInt;
    } else {
      this.m = 0;
    }
  }
  
  public boolean g()
  {
    return (this.p.L.n.e == this.n) && (this.p.L.n.f == this.d) && (this.p.L.n.g == this.e);
  }
  
  boolean h()
  {
    return this.a == 10;
  }
  
  zaah i()
  {
    if (this.p.N == null) {
      this.p.N = new zaah(this.p.d);
    }
    this.p.N.a(this);
    this.p.N.r = true;
    return this.p.N;
  }
  
  zaie a(String paramString, int paramInt, boolean paramBoolean)
  {
    zaad localzaad = new zaad(this.p.e);
    boolean bool1 = this.i;
    boolean bool2 = this.j;
    this.i = false;
    this.f = false;
    this.j = false;
    this.p.e.b = true;
    try
    {
      if (!paramBoolean)
      {
        if ((paramString.indexOf('R') == -1) && (paramString.indexOf('C') == -1))
        {
          localObject1 = zabc.c;
          return (zaie)localObject1;
        }
        paramString = zauw.b(paramString, this.d, this.e);
      }
      Object localObject1 = localzaad.a(this.c.getIndex(), paramString, this.d, this.e, 0, 32, true, 0);
      localObject2 = new zaag(this, (byte[])localObject1, 0, -1, false);
      zaie localzaie1 = ((zaag)localObject2).a();
      zaie localzaie2 = localzaie1;
      return localzaie2;
    }
    catch (Exception localException)
    {
      Object localObject2 = zabc.c;
      return (zaie)localObject2;
    }
    finally
    {
      if (bool1)
      {
        this.i = true;
        this.f = true;
        if (bool2) {
          this.j = true;
        }
      }
      this.p.e.b = false;
    }
  }
  
  zacc j()
  {
    if (this.p.g) {
      return new zacd();
    }
    return new zace();
  }
  
  zabb a(DateTime paramDateTime)
  {
    return new zabb(zbxa.a(paramDateTime, this.p.i));
  }
  
  double b(DateTime paramDateTime)
  {
    return zbxa.a(paramDateTime, this.p.i);
  }
  
  boolean a(double paramDouble)
  {
    return (paramDouble >= 0.0D) && (paramDouble < this.p.k);
  }
  
  DateTime b(double paramDouble)
  {
    if (paramDouble == 0.0D) {
      return this.p.l;
    }
    return CellsHelper.getDateTimeFromDouble(paramDouble, this.p.i);
  }
  
  zwp c(int paramInt)
  {
    return a(this.p.f, paramInt, paramInt);
  }
  
  zwp a(int paramInt1, int paramInt2)
  {
    return a(this.p.f, paramInt1, paramInt2);
  }
  
  zwp a(int paramInt1, int paramInt2, int paramInt3)
  {
    zwq localzwq = this.p.e.r();
    int i1 = localzwq.e(paramInt1, paramInt2, paramInt3);
    if (i1 > -1) {
      return localzwq.b(i1);
    }
    long l1 = paramInt1 << 32 | paramInt3 << 16 | paramInt2;
    if (this.p.w != null)
    {
      localObject = this.p.w.get(Long.valueOf(l1));
      if (localObject != null) {
        return (zwp)localObject;
      }
    }
    else
    {
      this.p.w = new HashMap();
      localObject = l();
      if (localObject != null) {
        this.p.w.put(Long.valueOf((((zwp)localObject).a & 0xFFFF) << 32 | 0xFFFEFFFE), localObject);
      }
    }
    Object localObject = new zwp(paramInt1 & 0xFFFF, paramInt2 & 0xFFFF, paramInt3 & 0xFFFF);
    this.p.w.put(Long.valueOf(l1), localObject);
    return (zwp)localObject;
  }
  
  private void k()
  {
    zaca localzaca = new zaca(this);
    int i1 = this.p.d();
    for (;;)
    {
      long l1 = this.p.g();
      Worksheet localWorksheet = this.p.e.get(zaai.a(l1));
      zaai localzaai1 = localWorksheet.getCells().a.a(zaai.b(l1));
      if (localzaai1.c() != 2)
      {
        localzaai1.a((byte)0);
        if (localWorksheet != localzaca.c) {
          localzaca.a(localWorksheet);
        }
        int i2 = -1;
        zaai localzaai2 = null;
        try
        {
          localzaai1.b(localzaca);
        }
        catch (zgi localzgi)
        {
          i2 = -2;
        }
        catch (zge localzge)
        {
          i2 = localzge.a;
          localzaai2 = localzge.b;
        }
        if (i2 == -2)
        {
          i1 = this.p.d();
        }
        else if (i2 > -1)
        {
          if (this.p.s)
          {
            this.p.i();
            return;
          }
          if (this.p.m)
          {
            localzaca.b(localzaai2);
          }
          else
          {
            localzaai1.a((byte)2);
            if (localzaai1.c == 0)
            {
              localzaai1.c = 6;
              localzaai1.d = Integer.valueOf(2);
            }
            if (this.p.L.n.a)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Circular Reference for ");
              b(localStringBuilder);
              localStringBuilder.append("->");
              localStringBuilder.append(this.p.e.get(i2).getName());
              localStringBuilder.append('!');
              CellsHelper.a(localStringBuilder, localzaai2.e, localzaai2.f);
              zl.a(zs.a(localStringBuilder));
            }
          }
        }
      }
      this.p.F -= 1;
      if (this.p.E < this.p.t)
      {
        if (!this.p.s) {
          break;
        }
        this.p.f();
        break;
      }
    }
    this.p.e();
    this.p.I = (i1 + 1);
  }
  
  void b(zaai paramzaai)
  {
    long l1 = zaai.a(this.n, paramzaai.a);
    for (int i1 = 0; (i1 < this.p.E) && (this.p.D[i1] != l1); i1++) {}
    if (i1 == this.p.E)
    {
      if (this.p.L.n.a) {
        zl.a(zs.a(b(new StringBuilder()).append(": CalcFlag denotes circular but cannot be found in stack")));
      }
      return;
    }
    this.p.s = true;
    int i2 = this.p.t;
    this.p.t = (this.p.E + 1);
    long[] arrayOfLong1 = this.p.d(i1);
    int i3 = this.p.b(i1);
    zaca localzaca = new zaca(this);
    Object localObject2 = null;
    int i6 = 0;
    zgk localzgk = new zgk(this.p.d.getSettings().getMaxChange());
    for (int i7 = this.p.n; i7 > 0; i7--)
    {
      int i5 = 1;
      for (int i8 = 0; i8 < arrayOfLong1.length; i8++)
      {
        l1 = arrayOfLong1[i8];
        int i9;
        if (i6 > 0)
        {
          i9 = 0;
          for (int i10 = 0; i10 < localObject2.length; i10++) {
            if (l1 == localObject2[i10])
            {
              localObject2[i10] = -1L;
              i6--;
              i9 = 1;
              break;
            }
          }
          if (i9 != 0) {}
        }
        else
        {
          Worksheet localWorksheet = this.p.e.get(zaai.a(l1));
          if (localWorksheet != localzaca.c) {
            localzaca.a(localWorksheet);
          }
          paramzaai = localWorksheet.getCells().a.a(zaai.b(l1));
          int i4 = paramzaai.c;
          Object localObject1 = paramzaai.d;
          for (;;)
          {
            i9 = 0;
            Object localObject3 = null;
            try
            {
              this.p.c(i3);
              paramzaai.b(localzaca);
            }
            catch (zgi localzgi)
            {
              i9 = 1;
            }
            catch (zge localzge)
            {
              this.p.i();
              long[] arrayOfLong2 = new long[i8 + i6];
              for (int i11 = 0; i11 < i8; i11++) {
                arrayOfLong2[i11] = arrayOfLong1[i11];
              }
              if (i6 > 0) {
                for (i11 = localObject2.length - 1; i11 > -1; i11--) {
                  if (localObject2[i11] != -1L)
                  {
                    i6--;
                    arrayOfLong2[(i8 + i6)] = localObject2[i11];
                    if (i6 < 1) {
                      break;
                    }
                  }
                }
              }
              arrayOfLong1 = this.p.d(i1);
              i6 = arrayOfLong2.length;
              localObject2 = arrayOfLong2;
              i8 = -1;
              break;
            }
            catch (zgh localzgh)
            {
              localObject3 = localzgh;
            }
            catch (CellsException localCellsException)
            {
              if ((this.p.L.b) && (localCellsException.getCode() != 17)) {
                a(localCellsException);
              } else {
                localObject3 = localCellsException;
              }
            }
            catch (Exception localException)
            {
              if (this.p.L.b) {
                a(localException);
              } else {
                localObject3 = new CellsException(5, zs.a(c(new StringBuilder("Error in calculating Cell in circular[")).append("]")), localException);
              }
            }
            if (localObject3 != null) {
              throw ((Throwable)localObject3);
            }
            if (i9 == 0) {
              break;
            }
            k();
            i3 = this.p.b(0);
          }
          if ((i5 != 0) && (localzgk.a(i4, localObject1, paramzaai.c, paramzaai.d))) {
            i5 = 0;
          }
        }
      }
      if (i5 != 0) {
        break;
      }
    }
    this.p.e(i1);
    this.p.t = i2;
    this.p.c(i3);
  }
  
  void c(zaai paramzaai)
  {
    if (paramzaai.c() == 0)
    {
      if (this.p.o) {
        this.g.a.f.a(paramzaai);
      }
      int i1 = 0;
      Object localObject = null;
      try
      {
        paramzaai.b(this);
      }
      catch (zgi localzgi)
      {
        i1 = 1;
      }
      catch (zge localzge)
      {
        if (this.p.L.b) {
          a(localzge);
        } else {
          localObject = new CellsException(5, zs.a(a(null)));
        }
      }
      catch (CellsException localCellsException)
      {
        if ((this.p.L.b) && (localCellsException.getCode() != 17)) {
          a(localCellsException);
        } else {
          localObject = localCellsException;
        }
      }
      catch (Exception localException)
      {
        if (this.p.L.b) {
          a(localException);
        } else {
          localObject = new CellsException(5, zs.a(c(new StringBuilder("Error in calculating cell [")).append("]: ").append(zl.a(localException))));
        }
      }
      if (localObject != null) {
        throw ((Throwable)localObject);
      }
      if (i1 != 0) {
        k();
      }
    }
    else if (paramzaai.c() == 1)
    {
      throw new CellsException(5, zs.a(a(null)));
    }
  }
  
  zaie a(zaie paramzaie)
  {
    if (paramzaie.i()) {
      return paramzaie;
    }
    int i1 = this.p.E;
    try
    {
      return paramzaie.e(this);
    }
    catch (zgi localzgi) {}catch (zge localzge)
    {
      this.p.L.setRecursive(false);
      zaie localzaie = paramzaie.e(this);
      this.p.L.setRecursive(true);
      return localzaie;
    }
    int i2 = this.p.t;
    this.p.t = (i1 + 1);
    k();
    this.p.t = i2;
    return paramzaie.e(this);
  }
  
  zaiw a(zaai paramzaai, zaie paramzaie)
  {
    this.p.b.a = paramzaie;
    return a(this.p.b, paramzaai) ? this.p.b.b : null;
  }
  
  void b(zaai paramzaai, zaie paramzaie)
  {
    this.p.a.a = paramzaie;
    a(this.p.a, paramzaai);
  }
  
  void a(zaai paramzaai, zaag paramzaag)
  {
    this.p.c.a = paramzaag;
    a(this.p.c, paramzaai);
  }
  
  private boolean a(zajq paramzajq, zaai paramzaai)
  {
    Object localObject1 = null;
    try
    {
      this.p.a(zaai.a(this.n, paramzaai.a));
      paramzajq.a(this, paramzaai);
      this.p.f();
      boolean bool1 = true;
      return bool1;
    }
    catch (zgi localzgi)
    {
      localObject1 = localzgi;
    }
    catch (zge localzge)
    {
      if (this.p.m)
      {
        if ((this.p.s) || (localzge.b != paramzaai)) {
          localObject1 = localzge;
        }
      }
      else
      {
        paramzajq.b(this, paramzaai);
        this.p.f();
        if (localzge.b == paramzaai)
        {
          if (this.p.L.n.a) {
            zl.a(zs.a(a(null)));
          }
          bool2 = false;
          return bool2;
        }
        localObject1 = localzge;
      }
    }
    catch (zgh localzgh)
    {
      paramzajq.c(this, paramzaai);
      this.p.f();
      localObject1 = localzgh;
    }
    catch (CellsException localCellsException)
    {
      if ((this.p.L.b) && (localCellsException.getCode() != 17))
      {
        a(localCellsException);
        paramzajq.b(this, paramzaai);
        this.p.f();
        bool2 = false;
        return bool2;
      }
      localObject1 = localCellsException;
    }
    catch (Exception localException)
    {
      boolean bool2;
      if (this.p.L.b)
      {
        a(localException);
        paramzajq.b(this, paramzaai);
        this.p.f();
        bool2 = false;
        return bool2;
      }
      localObject1 = new CellsException(5, zs.a(c(new StringBuilder("Error in calculating Cell[")).append("]")), localException);
    }
    finally
    {
      paramzajq.d(this, paramzaai);
    }
    if (localObject1 != null) {
      throw ((Throwable)localObject1);
    }
    b(paramzaai);
    return false;
  }
  
  StringBuilder a(StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder == null) {
      paramStringBuilder = new StringBuilder();
    }
    return c(paramStringBuilder.append("Circular Reference for "));
  }
  
  StringBuilder b(StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder == null) {
      paramStringBuilder = new StringBuilder();
    }
    if (this.a == 1)
    {
      paramStringBuilder.append("Name[");
      zaqg localzaqg = (zaqg)this.b;
      if (localzaqg.g > 0) {
        paramStringBuilder.append(this.p.e.get(localzaqg.g - 1).getName());
      }
      paramStringBuilder.append(localzaqg.f).append("] based on ");
    }
    paramStringBuilder.append('[').append(this.n).append(']').append(this.c.getName()).append('!');
    CellsHelper.a(paramStringBuilder, this.d, this.e);
    return paramStringBuilder;
  }
  
  StringBuilder c(StringBuilder paramStringBuilder)
  {
    paramStringBuilder = b(paramStringBuilder);
    if ((this.a == 0) && (this.p.E > 1))
    {
      long l1 = this.p.D[(this.p.E - 1)];
      int i1 = zaai.a(l1);
      zaai localzaai;
      if (i1 != this.n)
      {
        Worksheet localWorksheet = this.p.e.get(i1);
        paramStringBuilder.append("<-");
        paramStringBuilder.append(localWorksheet.getName());
        paramStringBuilder.append('!');
        localzaai = localWorksheet.getCells().a.a(zaai.b(l1));
        CellsHelper.a(paramStringBuilder, localzaai.e, localzaai.f);
      }
      else
      {
        int i2 = zaai.b(l1);
        if (i2 != ((zaai)this.b).a)
        {
          paramStringBuilder.append("<-");
          localzaai = this.g.a.a(zaai.b(l1));
          CellsHelper.a(paramStringBuilder, localzaai.e, localzaai.f);
        }
      }
    }
    return paramStringBuilder;
  }
  
  void a(CellsException paramCellsException)
  {
    if (this.p.L.n.a) {
      if (paramCellsException.getCode() == 5) {
        zl.a(paramCellsException.getMessage());
      } else {
        zl.a(zs.a(c(new StringBuilder("CellsException[Code:").append(paramCellsException.getCode()).append(",Message:").append(paramCellsException.getMessage()).append("] for Cell[")).append("]")));
      }
    }
  }
  
  void a(Exception paramException)
  {
    if (this.p.L.n.a) {
      zl.a(zs.a(c(new StringBuilder("Error in calculating Cell[")).append("]: ").append(zl.a(paramException))));
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.g.a.f.a(((zaai)this.b).a, paramInt1, paramInt2, paramInt3);
  }
  
  private zwp l()
  {
    zbth localzbth = this.p.e.w();
    int i1 = localzbth.getCount();
    for (int i2 = 0; i2 < i1; i2++) {
      if (localzbth.a(i2).a() == 5)
      {
        zwq localzwq = this.p.e.r();
        int i3 = localzwq.e(i2, 65534, 65534);
        if (i3 > -1) {
          return localzwq.b(i3);
        }
        return new zwp(i2 & 0xFFFF, 65534, 65534);
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */