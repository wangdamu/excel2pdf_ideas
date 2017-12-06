package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import java.util.ArrayList;

class zaas
{
  private zabw a;
  private zd[] b;
  private zc c;
  private zi d;
  
  zaas(zabw paramzabw)
  {
    this.a = paramzabw;
    this.b = new zd[paramzabw.b.length];
    this.c = new zc(null);
    this.d = new zi(null);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(paramInt1)) {
      return;
    }
    if (paramInt2 == this.a.a.getIndex()) {
      this.c.a(paramInt3, paramInt4, zaai.a(paramInt2, paramInt1));
    } else {
      this.a.a.c().get(paramInt2).getCells().a.f.c.a(paramInt3, paramInt4, zaai.a(this.a.a.getIndex(), paramInt1));
    }
    this.b[paramInt1].a(Cell.a(paramInt2, paramInt3, paramInt4));
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (!a(paramInt1)) {
      return;
    }
    zf localzf;
    if (paramInt2 == this.a.a.getIndex()) {
      localzf = this.d.a(paramInt3, (short)paramInt4, paramInt5, (short)paramInt6, zaai.a(paramInt2, paramInt1));
    } else {
      localzf = this.a.a.c().get(paramInt2).getCells().a.f.d.a(paramInt3, (short)paramInt4, paramInt5, (short)paramInt6, zaai.a(this.a.a.getIndex(), paramInt1));
    }
    this.b[paramInt1].a(paramInt2, paramInt3, localzf);
  }
  
  void a(zaai paramzaai)
  {
    if ((paramzaai.a < this.b.length) && (this.b[paramzaai.a] != null))
    {
      this.b[paramzaai.a].a(this, paramzaai);
      this.b[paramzaai.a] = null;
    }
  }
  
  ArrayList a(int paramInt1, int paramInt2)
  {
    za localza = new za(this.a.a.c());
    zj localzj = this.c.a(paramInt1);
    if (localzj != null) {
      localzj.a(paramInt2, localza);
    }
    if (this.d.b() > 0) {
      this.d.a(paramInt1, (short)paramInt2, localza);
    }
    return localza.a();
  }
  
  void b(int paramInt1, int paramInt2)
  {
    zb localzb = new zb(this.a.a.c());
    zj localzj = this.c.a(paramInt1);
    if (localzj != null) {
      localzj.a(paramInt2, localzb);
    }
    if (this.d.b() > 0) {
      this.d.a(paramInt1, (short)paramInt2, localzb);
    }
  }
  
  private boolean a(int paramInt)
  {
    if (paramInt < this.b.length)
    {
      if (this.b[paramInt] == null)
      {
        this.b[paramInt] = new ze(null);
        return true;
      }
      return this.b[paramInt].c();
    }
    zd[] arrayOfzd = new zd[this.a.b.length];
    System.arraycopy(this.b, 0, arrayOfzd, 0, this.b.length);
    this.b = arrayOfzd;
    this.b[paramInt] = new ze(null);
    return true;
  }
  
  private class za
    implements zaas.zh
  {
    private ArrayList b = new ArrayList();
    private WorksheetCollection c;
    
    za(WorksheetCollection paramWorksheetCollection)
    {
      this.c = paramWorksheetCollection;
    }
    
    ArrayList a()
    {
      return this.b;
    }
    
    public void a(long paramLong)
    {
      Cells localCells = this.c.get(zaai.a(paramLong)).getCells();
      zaai localzaai = localCells.a.a(zaai.b(paramLong));
      Cell localCell = localCells.checkCell(localzaai.e, localzaai.f);
      if ((localCell == null) || (localCell.c.d != localzaai))
      {
        localCells.a.b(localzaai.a);
        return;
      }
      zf.a(this.b, localCell);
    }
  }
  
  private class zb
    implements zaas.zh
  {
    private WorksheetCollection b;
    
    zb(WorksheetCollection paramWorksheetCollection)
    {
      this.b = paramWorksheetCollection;
    }
    
    public void a(long paramLong)
    {
      zabw localzabw = this.b.get(zaai.a(paramLong)).getCells().a;
      zaai localzaai = localzabw.a(zaai.b(paramLong));
      if (localzaai.c() == 2)
      {
        localzaai.a((byte)0);
        localzabw.f.b(localzaai.e, localzaai.f);
      }
    }
  }
  
  private static abstract interface zh
  {
    public abstract void a(long paramLong);
  }
  
  private class zg
  {
    int a;
    int b;
    zaas.zf c;
    
    zg(int paramInt1, int paramInt2, zaas.zf paramzf)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = paramzf;
    }
  }
  
  private class ze
    extends zaas.zd
  {
    private int e;
    private int f;
    
    private ze()
    {
      super(null);
    }
    
    protected int a()
    {
      return this.e;
    }
    
    protected int b()
    {
      return this.f;
    }
    
    public boolean c()
    {
      return true;
    }
    
    public void a(long paramLong)
    {
      switch (this.e)
      {
      case 0: 
        this.a = new long[] { paramLong, 0L };
        this.e = 1;
        return;
      case 1: 
        if (this.a[0] > paramLong)
        {
          this.a[1] = this.a[0];
          this.a[0] = paramLong;
          this.e = 2;
        }
        else if (this.a[0] < paramLong)
        {
          this.a[1] = paramLong;
          this.e = 2;
        }
        return;
      }
      int i = za.a(this.a, 0, this.e, paramLong);
      if (i > -1) {
        return;
      }
      i = -i - 1;
      if (this.e == this.a.length)
      {
        long[] arrayOfLong = new long[this.e << 1];
        if (i > 0) {
          System.arraycopy(this.a, 0, arrayOfLong, 0, i);
        }
        if (i < this.e) {
          System.arraycopy(this.a, i, arrayOfLong, i + 1, this.e - i);
        }
        this.a = arrayOfLong;
      }
      else if (i < this.e)
      {
        System.arraycopy(this.a, i, this.a, i + 1, this.e - i);
      }
      this.a[i] = paramLong;
    }
    
    public void a(int paramInt1, int paramInt2, zaas.zf paramzf)
    {
      zaas.zg localzg;
      switch (this.f)
      {
      case 0: 
        this.b = new zaas.zg[] { new zaas.zg(zaas.this, paramInt1, paramInt2, paramzf), null };
        this.f = 1;
        return;
      case 1: 
        localzg = this.b[0];
        if ((localzg.a == paramInt1) && (localzg.b == paramInt2) && (localzg.c == paramzf)) {
          return;
        }
        this.b[1] = new zaas.zg(zaas.this, paramInt1, paramInt2, paramzf);
        this.f = 2;
        return;
      }
      for (int i = this.f - 1; i > -1; i--)
      {
        localzg = this.b[i];
        if ((localzg.a == paramInt1) && (localzg.b == paramInt2) && (localzg.c == paramzf)) {
          return;
        }
      }
      if (this.f == this.b.length)
      {
        zaas.zg[] arrayOfzg = new zaas.zg[this.f << 1];
        System.arraycopy(this.b, 0, arrayOfzg, 0, this.f);
        this.b = arrayOfzg;
      }
      this.b[this.f] = new zaas.zg(zaas.this, paramInt1, paramInt2, paramzf);
      this.f += 1;
    }
  }
  
  private class zd
  {
    long[] a;
    zaas.zg[] b;
    
    private zd() {}
    
    protected int a()
    {
      if (this.a == null) {
        return 0;
      }
      return this.a.length;
    }
    
    protected int b()
    {
      if (this.b == null) {
        return 0;
      }
      return this.b.length;
    }
    
    public void a(zaas paramzaas, zaai paramzaai)
    {
      int i = zaas.a(paramzaas).a.getIndex();
      WorksheetCollection localWorksheetCollection = zaas.a(paramzaas).a.c();
      long l1 = zaai.a(i, paramzaai.a);
      int j = a();
      if (j > 0) {
        for (int n = j - 1; n > -1; n--)
        {
          long l2 = this.a[n];
          int m = Cell.a(l2);
          if (i == m) {
            zaas.b(paramzaas).b(Cell.b(l2), Cell.c(l2), l1);
          } else {
            zaas.b(localWorksheetCollection.get(m).getCells().a.f).b(Cell.b(l2), Cell.c(l2), l1);
          }
        }
      }
      j = b();
      if (b() > 0) {
        for (int k = j - 1; k > -1; k--)
        {
          zaas.zg localzg = this.b[k];
          if (localzg.c.b(l1)) {
            zaas.c(localWorksheetCollection.get(localzg.a).getCells().a.f).a(localzg.b, localzg.c);
          }
        }
      }
    }
    
    public boolean c()
    {
      return false;
    }
    
    public void a(long paramLong)
    {
      throw new CellsException(5, "Invalid logic for formula pool, the formula pool has been built.");
    }
    
    public void a(int paramInt1, int paramInt2, zaas.zf paramzf)
    {
      throw new CellsException(5, "Invalid logic for formula pool, the formula pool has been built.");
    }
  }
  
  private class zf
  {
    int a;
    short b;
    short c;
    int d = 0;
    long[] e = new long[2];
    
    public zf(int paramInt, short paramShort1, short paramShort2, long paramLong)
    {
      this.a = paramInt;
      this.b = paramShort1;
      this.c = paramShort2;
      this.d = 1;
      this.e[0] = paramLong;
    }
    
    public void a(long paramLong)
    {
      switch (this.d)
      {
      case 0: 
        this.d = 1;
        this.e[0] = paramLong;
        return;
      case 1: 
        if (this.e[0] == paramLong) {
          return;
        }
        this.d = 2;
        this.e[1] = paramLong;
        return;
      }
      int i = za.a(this.e, 0, this.d, paramLong);
      if (i > -1) {
        return;
      }
      i = -i - 1;
      if (this.d == this.e.length)
      {
        long[] arrayOfLong = new long[this.d << 1];
        if (i > 0) {
          System.arraycopy(this.e, 0, arrayOfLong, 0, i);
        }
        if (i < this.d) {
          System.arraycopy(this.e, i, arrayOfLong, i + 1, this.d - i);
        }
        this.e = arrayOfLong;
      }
      else if (i < this.d)
      {
        System.arraycopy(this.e, i, this.e, i + 1, this.d - i);
      }
      this.d += 1;
      this.e[i] = paramLong;
    }
    
    public boolean b(long paramLong)
    {
      switch (this.d)
      {
      case 0: 
        return true;
      case 1: 
        if (this.e[0] != paramLong) {
          return false;
        }
        this.d = 0;
        return true;
      }
      int i = za.a(this.e, 0, this.d, paramLong);
      if (i < 0) {
        return false;
      }
      this.d -= 1;
      System.arraycopy(this.e, i + 1, this.e, i, this.d - i);
      return false;
    }
    
    public void a(zaas.zh paramzh)
    {
      for (int i = 0; i < this.d; i++) {
        paramzh.a(this.e[i]);
      }
    }
  }
  
  private class zi
    implements zail
  {
    private int b = 0;
    private int[] c = new int[16];
    private int[] d = new int[16];
    private zaas.zf[][] e = new zaas.zf[16][];
    
    private zi() {}
    
    public int b()
    {
      return this.b;
    }
    
    public int c(int paramInt)
    {
      return this.c[paramInt];
    }
    
    public zaas.zf a(int paramInt1, short paramShort1, int paramInt2, short paramShort2, long paramLong)
    {
      int i = -1;
      switch (this.b)
      {
      case 0: 
        this.b = 1;
        this.c[0] = paramInt1;
        this.d[0] = 1;
        this.e[0] = { new zaas.zf(zaas.this, paramInt2, paramShort1, paramShort2, paramLong), null };
        return this.e[0][0];
      case 1: 
        if (this.c[0] < paramInt1)
        {
          this.b = 2;
          this.c[1] = paramInt1;
          this.d[1] = 1;
          this.e[1] = { new zaas.zf(zaas.this, paramInt2, paramShort1, paramShort2, paramLong), null };
          return this.e[1][0];
        }
        if (this.c[0] > paramInt1)
        {
          this.b = 2;
          this.c[1] = this.c[0];
          this.d[1] = this.d[0];
          this.e[1] = this.e[0];
          this.c[0] = paramInt1;
          this.d[0] = 1;
          this.e[0] = { new zaas.zf(zaas.this, paramInt2, paramShort1, paramShort2, paramLong), null };
          return this.e[0][0];
        }
        i = 0;
        break;
      default: 
        i = zld.a(this, paramInt1, 0, this.b - 1);
      }
      Object localObject1;
      Object localObject2;
      if (i > -1)
      {
        localObject1 = this.e[i];
        int j = this.d[i];
        if (j == 1)
        {
          localObject2 = localObject1[0];
          if ((((zaas.zf)localObject2).b == paramShort1) && (((zaas.zf)localObject2).a == paramInt2) && (((zaas.zf)localObject2).c == paramShort2))
          {
            ((zaas.zf)localObject2).a(paramLong);
            return (zaas.zf)localObject2;
          }
        }
        else
        {
          for (int k = j - 1; k > -1; k--)
          {
            localObject2 = localObject1[k];
            if ((((zaas.zf)localObject2).b == paramShort1) && (((zaas.zf)localObject2).a == paramInt2) && (((zaas.zf)localObject2).c == paramShort2))
            {
              ((zaas.zf)localObject2).a(paramLong);
              return (zaas.zf)localObject2;
            }
          }
        }
        if (j == localObject1.length)
        {
          zaas.zf[] arrayOfzf1 = new zaas.zf[j << 1];
          System.arraycopy(localObject1, 0, arrayOfzf1, 0, j);
          this.e[i] = arrayOfzf1;
          localObject1 = arrayOfzf1;
        }
        localObject1[j] = new zaas.zf(zaas.this, paramInt2, paramShort1, paramShort2, paramLong);
        this.d[i] += 1;
        return localObject1[j];
      }
      i = -i - 1;
      if (this.b == this.c.length)
      {
        localObject1 = new int[this.b << 1];
        localObject2 = new int[localObject1.length];
        zaas.zf[][] arrayOfzf = new zaas.zf[localObject1.length][];
        if (i > 0)
        {
          System.arraycopy(this.c, 0, localObject1, 0, i);
          System.arraycopy(this.d, 0, localObject2, 0, i);
          System.arraycopy(this.e, 0, arrayOfzf, 0, i);
        }
        if (i < this.b)
        {
          System.arraycopy(this.c, i, localObject1, i + 1, this.b - i);
          System.arraycopy(this.d, i, localObject2, i + 1, this.b - i);
          System.arraycopy(this.e, i, arrayOfzf, i + 1, this.b - i);
        }
        this.c = ((int[])localObject1);
        this.d = ((int[])localObject2);
        this.e = arrayOfzf;
      }
      else if (i < this.b)
      {
        System.arraycopy(this.c, i, this.c, i + 1, this.b - i);
        System.arraycopy(this.d, i, this.d, i + 1, this.b - i);
        System.arraycopy(this.e, i, this.e, i + 1, this.b - i);
      }
      this.b += 1;
      this.c[i] = paramInt1;
      this.d[i] = 1;
      this.e[i] = { new zaas.zf(zaas.this, paramInt2, paramShort1, paramShort2, paramLong), null };
      return this.e[i][0];
    }
    
    public void a(int paramInt, zaas.zf paramzf)
    {
      int i = -1;
      switch (this.b)
      {
      case 0: 
        return;
      case 1: 
        if (this.c[0] != paramInt) {
          return;
        }
        i = 0;
        break;
      default: 
        i = zld.a(this, paramInt, 0, this.b - 1);
      }
      if (i < 0) {
        return;
      }
      zaas.zf[] arrayOfzf = this.e[i];
      int j = this.d[i];
      if (j == 1)
      {
        if (arrayOfzf[0] == paramzf)
        {
          this.b -= 1;
          System.arraycopy(this.c, i + 1, this.c, i, this.b - i);
          System.arraycopy(this.d, i + 1, this.d, i, this.b - i);
          System.arraycopy(this.e, i + 1, this.e, i, this.b - i);
          this.e[this.b] = null;
        }
        return;
      }
      for (int k = j - 1; k > -1; k--) {
        if (arrayOfzf[k] == paramzf)
        {
          j--;
          this.d[i] -= 1;
          System.arraycopy(arrayOfzf, k + 1, arrayOfzf, k, j - k);
          arrayOfzf[j] = null;
          return;
        }
      }
    }
    
    public void a(int paramInt, short paramShort, zaas.zh paramzh)
    {
      if (this.b < 1) {
        return;
      }
      for (int j = 0; j < this.b; j++)
      {
        if (this.c[j] > paramInt) {
          return;
        }
        int i = this.d[j];
        if (i >= 1)
        {
          zaas.zf[] arrayOfzf = this.e[j];
          for (int k = 0; k < i; k++)
          {
            zaas.zf localzf = arrayOfzf[k];
            if ((localzf.a >= paramInt) && (localzf.b <= paramShort) && (localzf.c >= paramShort)) {
              localzf.a(paramzh);
            }
          }
        }
      }
    }
  }
  
  private class zj
    implements zail
  {
    private int b = 0;
    private short[] c = new short[2];
    private int[] d = new int[2];
    private long[][] e = new long[2][];
    
    private zj() {}
    
    public int b()
    {
      return this.b;
    }
    
    public int c(int paramInt)
    {
      return this.c[paramInt];
    }
    
    public void a(int paramInt, long paramLong)
    {
      int i;
      if (this.b < 1)
      {
        this.b += 1;
        i = 0;
      }
      else
      {
        i = zld.a(this, paramInt, 0, this.b - 1);
        Object localObject;
        if (i > -1)
        {
          localObject = this.e[i];
          int j = this.d[i];
          int k = za.a((long[])localObject, 0, j, paramLong);
          if (k > -1) {
            return;
          }
          k = -k - 1;
          if (j == localObject.length)
          {
            long[] arrayOfLong1 = new long[j << 1];
            if (k > 0) {
              System.arraycopy(localObject, 0, arrayOfLong1, 0, k);
            }
            if (k < j) {
              System.arraycopy(localObject, k, arrayOfLong1, k + 1, j - k);
            }
            this.e[i] = arrayOfLong1;
            localObject = arrayOfLong1;
          }
          else if (k < j)
          {
            System.arraycopy(localObject, k, localObject, k + 1, j - k);
          }
          this.d[i] = (j + 1);
          localObject[k] = paramLong;
          return;
        }
        i = -i - 1;
        if (this.c.length == this.b)
        {
          localObject = new short[this.b << 1];
          int[] arrayOfInt = new int[localObject.length];
          long[][] arrayOfLong = new long[localObject.length][];
          if (i > 0)
          {
            System.arraycopy(this.c, 0, localObject, 0, i);
            System.arraycopy(this.d, 0, arrayOfInt, 0, i);
            System.arraycopy(this.e, 0, arrayOfLong, 0, i);
          }
          if (i < this.b)
          {
            System.arraycopy(this.c, i, localObject, i + 1, this.b - i);
            System.arraycopy(this.d, i, arrayOfInt, i + 1, this.b - i);
            System.arraycopy(this.e, i, arrayOfLong, i + 1, this.b - i);
          }
          this.c = ((short[])localObject);
          this.d = arrayOfInt;
          this.e = arrayOfLong;
        }
        else if (i < this.b)
        {
          System.arraycopy(this.c, i, this.c, i + 1, this.b - i);
          System.arraycopy(this.d, i, this.d, i + 1, this.b - i);
          System.arraycopy(this.e, i, this.e, i + 1, this.b - i);
        }
        this.b += 1;
      }
      this.c[i] = ((short)paramInt);
      this.d[i] = 1;
      this.e[i] = { paramLong, 0L };
    }
    
    public boolean b(int paramInt, long paramLong)
    {
      int i = zld.a(this, paramInt, 0, this.b - 1);
      if (i < 0) {
        return false;
      }
      int j = this.d[i];
      if (j > 1)
      {
        long[] arrayOfLong = this.e[i];
        int k = za.a(arrayOfLong, 0, j, paramLong);
        if (k > -1)
        {
          j--;
          this.d[i] = j;
          if (k < j) {
            System.arraycopy(arrayOfLong, k + 1, arrayOfLong, k, j - k);
          }
          return true;
        }
      }
      else if (this.e[i][0] == paramLong)
      {
        this.b -= 1;
        if (i < this.b)
        {
          System.arraycopy(this.c, i + 1, this.c, i, this.b - i);
          System.arraycopy(this.e, i + 1, this.e, i, this.b - i);
          System.arraycopy(this.d, i + 1, this.d, i, this.b - i);
        }
        this.e[this.b] = null;
        return true;
      }
      return false;
    }
    
    public void a(int paramInt, zaas.zh paramzh)
    {
      if (this.b < 1) {
        return;
      }
      int i = zld.a(this, paramInt, 0, this.b - 1);
      if (i < 0) {
        return;
      }
      long[] arrayOfLong = this.e[i];
      for (int j = this.d[i] - 1; j > -1; j--) {
        paramzh.a(arrayOfLong[j]);
      }
    }
  }
  
  private class zc
    implements zail
  {
    private int b = 0;
    private int[] c = new int[16];
    private zaas.zj[] d = new zaas.zj[16];
    
    private zc() {}
    
    public int b()
    {
      return this.b;
    }
    
    public int c(int paramInt)
    {
      return this.c[paramInt];
    }
    
    public void a(int paramInt1, int paramInt2, long paramLong)
    {
      if (this.b < 1)
      {
        this.b += 1;
        this.c[0] = paramInt1;
        this.d[0] = new zaas.zj(zaas.this, null);
        this.d[0].a(paramInt2, paramLong);
        return;
      }
      int i = zld.a(this, paramInt1, 0, this.b - 1);
      if (i > -1)
      {
        this.d[i].a(paramInt2, paramLong);
        return;
      }
      i = -i - 1;
      if (this.c.length == this.b)
      {
        int[] arrayOfInt = new int[this.b << 1];
        zaas.zj[] arrayOfzj = new zaas.zj[arrayOfInt.length];
        if (i > 0)
        {
          System.arraycopy(this.c, 0, arrayOfInt, 0, i);
          System.arraycopy(this.d, 0, arrayOfzj, 0, i);
        }
        if (i < this.b)
        {
          System.arraycopy(this.c, i, arrayOfInt, i + 1, this.b - i);
          System.arraycopy(this.d, i, arrayOfzj, i + 1, this.b - i);
        }
        this.c = arrayOfInt;
        this.d = arrayOfzj;
      }
      else if (i < this.b)
      {
        System.arraycopy(this.c, i, this.c, i + 1, this.b - i);
        System.arraycopy(this.d, i, this.d, i + 1, this.b - i);
      }
      this.b += 1;
      this.c[i] = paramInt1;
      this.d[i] = new zaas.zj(zaas.this, null);
      this.d[i].a(paramInt2, paramLong);
    }
    
    public void b(int paramInt1, int paramInt2, long paramLong)
    {
      if (this.b < 1) {
        return;
      }
      int i = zld.a(this, paramInt1, 0, this.b - 1);
      if (i < 0) {
        return;
      }
      if ((this.d[i].b(paramInt2, paramLong)) && (this.d[i].b() < 1))
      {
        this.b -= 1;
        if (i < this.b)
        {
          System.arraycopy(this.c, i + 1, this.c, i, this.b - i);
          System.arraycopy(this.d, i + 1, this.d, i, this.b - i);
        }
        this.d[this.b] = null;
      }
    }
    
    public zaas.zj a(int paramInt)
    {
      if (this.b < 1) {
        return null;
      }
      int i = zld.a(this, paramInt, 0, this.b - 1);
      if (i < 0) {
        return null;
      }
      return this.d[i];
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */