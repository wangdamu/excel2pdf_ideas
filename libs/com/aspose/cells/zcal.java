package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.c.zr;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcal
{
  private Workbook e;
  private WorksheetCollection f;
  private zajl g;
  private int h = 15;
  private Cells i;
  private Worksheet j;
  int a;
  private LoadFilter k;
  private LightCellsDataHandler l;
  private boolean m;
  boolean b;
  private boolean n;
  private boolean o;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private boolean t;
  private boolean u;
  private zbdx[] v = new zbdx[32];
  private boolean w;
  private boolean x;
  private int y;
  private int z;
  private int A;
  private boolean B;
  private HashMap C = new HashMap();
  private zbdx D = new zbdx();
  private zbdx E;
  private zv F;
  private zt G;
  private zbdm H;
  private zt I;
  private Row J;
  private zgs K = new zgs();
  private zgs L;
  private int M = -1;
  private int N = -1;
  private int O = -1;
  private RowCollection P;
  private zahq Q;
  private zajb R;
  private HashMap S;
  private int[] T = null;
  private int U = 1;
  private int V = 5;
  private int W;
  private int X;
  private byte[] Y;
  private byte[] Z;
  private ArrayList aa;
  private HashMap ab = new HashMap();
  private ArrayList ac;
  private ArrayList ad;
  zxf c;
  private zxf ae = null;
  boolean d = false;
  private HashMap af = new HashMap();
  
  private boolean a(int paramInt)
  {
    this.w = true;
    if (this.A == paramInt) {
      return !this.B;
    }
    f();
    this.E = this.D;
    if (this.y > 0) {
      if (paramInt > this.A)
      {
        if (!c(paramInt)) {
          this.E = this.D;
        }
      }
      else
      {
        if (this.z >= this.y) {
          this.z = (this.y - 1);
        }
        this.E = this.v[this.z];
        if (this.E.a > paramInt)
        {
          if (this.z > 0) {
            for (this.z -= 1;; this.z -= 1)
            {
              this.E = this.v[this.z];
              if (this.E.a == paramInt) {
                break;
              }
              if (this.E.a < paramInt)
              {
                this.z += 1;
                this.E = this.D;
                break;
              }
              if (this.z == 0)
              {
                this.E = this.D;
                break;
              }
            }
          }
        }
        else if (this.E.a < paramInt)
        {
          this.z += 1;
          this.E = this.D;
        }
      }
    }
    this.A = paramInt;
    if ((this.m) && (!this.l.startRow(paramInt)))
    {
      this.B = true;
      return false;
    }
    if (this.x)
    {
      this.D.a(0, this.i);
      this.x = false;
    }
    this.E.a = paramInt;
    e();
    this.N = -1;
    if ((this.m) && (!this.l.processRow(this.J)))
    {
      this.B = true;
      if (this.M > -1) {
        this.F.c(this.M, 1);
      }
      return false;
    }
    return true;
  }
  
  private boolean c()
  {
    if ((this.m) && (!this.l.startCell(this.K.a))) {
      return false;
    }
    this.N = this.I.a(this.K.a, this.N);
    if (this.N < 0) {
      this.N = this.I.a(-this.N - 1, this.K);
    }
    this.L = this.I.a(this.N, this.K, 6);
    return true;
  }
  
  private boolean d()
  {
    this.I.b(this.N, this.L, 6);
    if (this.m) {
      if (!this.l.processCell(new Cell(this.J, this.N, this.L, this.L == this.K)))
      {
        this.I.c(this.N, 1);
        return false;
      }
    }
    if (this.L.a > this.O) {
      this.O = this.L.a;
    }
    return true;
  }
  
  private void e()
  {
    this.H.e(-1);
    this.M = this.F.a(this.A, this.M);
    if (this.M > -1)
    {
      this.G = this.F.f(this.M);
      if (this.E == this.D) {
        this.E = this.G.a(new zbdx(), 15);
      }
      int i1 = this.G.a();
      if (i1 > 0)
      {
        this.I = this.H.f(this.H.a(-1, this.E, Math.max(32, i1)));
        this.I.a(-1, this.G, -1, i1, false);
      }
      else
      {
        this.I = this.H.f(this.H.a(-1, this.E, 32));
      }
    }
    else
    {
      this.I = this.H.f(this.H.a(-1, this.E, 32));
    }
    this.J = new Row(this.i, this.P, this.I, false);
  }
  
  private void f()
  {
    if ((this.B) && (!this.u)) {
      this.B = false;
    } else if ((this.A > -1) && ((!this.m) || (this.I.a() > 0))) {
      if (this.M < 0)
      {
        this.M = this.F.a(-this.M - 1, this.I, false);
        this.F.f(this.M).l(0, 0);
      }
      else
      {
        this.G.b(this.E, 13);
        this.G.a(this.I, false);
        this.G.l(0, 0);
      }
    }
  }
  
  zcal(Workbook paramWorkbook, LoadOptions paramLoadOptions)
    throws Exception
  {
    this.e = paramWorkbook;
    this.f = this.e.getWorksheets();
    this.f.clear();
    this.Y = new byte[2];
    if (paramLoadOptions == null)
    {
      this.k = new LoadFilter(Integer.MAX_VALUE);
      this.a = Integer.MAX_VALUE;
      this.l = null;
      this.m = false;
      this.n = true;
      this.o = true;
      this.p = true;
      this.q = true;
      this.r = true;
      this.b = true;
      this.t = true;
      this.g = this.f.g;
    }
    else
    {
      this.k = paramLoadOptions.getLoadFilter();
      this.a = this.k.getLoadDataFilterOptions();
      this.l = paramLoadOptions.getLightCellsDataHandler();
      if (this.l != null)
      {
        this.m = true;
        this.g = new zbsv();
        this.f.g = this.g;
      }
      else
      {
        this.m = false;
        this.g = this.f.g;
      }
      this.b = ((this.a & 0x20) != 0);
      this.t = ((this.a & 0x40) != 0);
      this.n = ((this.a & 0x1) != 0);
      this.o = ((this.a & 0x2) != 0);
      this.p = ((this.a & 0x4) != 0);
      this.q = ((this.a & 0x10) != 0);
      this.r = ((this.a & 0x8) != 0);
      this.s = ((this.a & 0x1F) != 0);
    }
  }
  
  private void f(zqj paramzqj)
    throws Exception
  {
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) != 2057) {
      throw new Exception("Bad Workbook file format.");
    }
    this.X = paramzqj.b(this.Y);
    this.Z = new byte[this.X];
    paramzqj.a(this.Z);
    if (this.Z[1] == 6)
    {
      if ((this.Z[0] & 0xFF) == 128) {
        throw new CellsException(19, "This Excel files contains Microsoft Graph Charts.");
      }
      this.V = 5;
    }
    else
    {
      if (this.Z[1] == 5) {
        throw new CellsException(19, "This Excel files contains (Excel95 or earlier file format) records.");
      }
      throw new CellsException(19, "Bad Workbook file format.");
    }
  }
  
  private void a(int paramInt, zqj paramzqj)
    throws Exception
  {
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if (this.W == paramInt) {
        break;
      }
      this.X = paramzqj.b(this.Y);
      paramzqj.a(this.X & 0xFFFF);
    }
  }
  
  private void g(zqj paramzqj)
    throws Exception
  {
    do
    {
      if (this.b)
      {
        a(paramzqj);
        zzw localzzw = new zzw();
        localzzw.b(this.Z);
        zf.a(this.f.B(), localzzw);
        int i1 = zc.e(this.Z, 0);
        if ((i1 & 0xFFFF) > (this.f.x() & 0xFFFF)) {
          this.f.d(i1);
        }
      }
      else
      {
        h(paramzqj);
      }
      this.W = paramzqj.b(this.Y);
    } while ((this.W & 0xFFFF) == 1054);
    paramzqj.a(-2);
  }
  
  private void h(zqj paramzqj)
    throws Exception
  {
    this.X = paramzqj.b(this.Y);
    paramzqj.a(this.X & 0xFFFF);
  }
  
  int a(zqj paramzqj)
    throws Exception
  {
    this.X = paramzqj.b(this.Y);
    if ((this.X & 0xFFFF) != 0)
    {
      this.Z = new byte[this.X];
      paramzqj.a(this.Z);
    }
    else
    {
      this.Z = null;
    }
    return this.X;
  }
  
  private void i(zqj paramzqj)
    throws Exception
  {
    if ((this.b) && (this.aa == null)) {
      this.aa = new ArrayList();
    }
    do
    {
      if (this.b)
      {
        a(paramzqj);
        zf.a(this.aa, this.Z);
      }
      else
      {
        h(paramzqj);
      }
      this.W = paramzqj.b(this.Y);
    } while ((this.W & 0xFFFF) == 224);
    paramzqj.a(-2);
  }
  
  private void j(zqj paramzqj)
  {
    try
    {
      String str;
      if (this.Z[7] == 0)
      {
        localObject = new byte[2 * this.Z.length - 16];
        for (int i2 = 0; i2 < this.Z.length - 8; i2++) {
          localObject[(2 * i2)] = this.Z[(8 + i2)];
        }
        str = Encoding.getUnicode().a((byte[])localObject);
      }
      else
      {
        str = Encoding.getUnicode().a(this.Z, 8, this.Z.length - 8);
      }
      if (str.length() >= 32) {
        str = str.substring(0, 31);
      }
      int i1 = this.f.c(str);
      Object localObject = this.f.get(i1);
      if ((this.T != null) && (i1 < this.T.length))
      {
        ((Worksheet)localObject).e = this.T[i1];
        this.f.c = this.U;
      }
      this.ab.put(Integer.valueOf(zc.a(this.Z, 0)), Integer.valueOf(i1));
      ((Worksheet)localObject).a(this.Z[4]);
      switch (this.Z[5])
      {
      case 0: 
        ((Worksheet)localObject).setType(1);
        break;
      case 1: 
        ((Worksheet)localObject).setType(3);
        break;
      case 2: 
        ((Worksheet)localObject).setType(2);
        break;
      case 6: 
        ((Worksheet)localObject).setType(0);
        break;
      case 3: 
      case 4: 
      case 5: 
      default: 
        ((Worksheet)localObject).setType(4);
      }
    }
    catch (Exception localException)
    {
      throw new CellsException(6, "Invalid sheet name info");
    }
  }
  
  private void k(zqj paramzqj)
    throws Exception
  {
    if (this.o)
    {
      ArrayList localArrayList = new ArrayList();
      a(paramzqj);
      zf.a(localArrayList, this.Z);
      for (;;)
      {
        this.W = paramzqj.b(this.Y);
        if ((this.W & 0xFFFF) != 60) {
          break;
        }
        a(paramzqj);
        zf.a(localArrayList, this.Z);
      }
      paramzqj.a(-2);
      zbel localzbel = new zbel(localArrayList, this.f);
      localzbel.a();
    }
    else
    {
      h(paramzqj);
      for (;;)
      {
        this.W = paramzqj.b(this.Y);
        if ((this.W & 0xFFFF) != 60) {
          break;
        }
        h(paramzqj);
      }
      paramzqj.a(-2);
    }
  }
  
  void b(zqj paramzqj)
    throws Exception
  {
    f(paramzqj);
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      int i2;
      int i4;
      int i6;
      Object localObject;
      int i3;
      switch (this.W)
      {
      case 23: 
        n(paramzqj);
        break;
      case 24: 
        x(paramzqj);
        break;
      case 2196: 
        w(paramzqj);
        break;
      case 49: 
        u(paramzqj);
        break;
      case 61: 
        v(paramzqj);
        break;
      case 133: 
        q(paramzqj);
        break;
      case 140: 
        E(paramzqj);
        break;
      case 146: 
        p(paramzqj);
        break;
      case 211: 
        this.X = paramzqj.b(this.Y);
        if ((this.X & 0xFFFF) != 0) {
          paramzqj.a(this.X & 0xFFFF);
        }
        this.f.b(true);
        break;
      case 445: 
        this.X = paramzqj.b(this.Y);
        if ((this.X & 0xFFFF) != 0) {
          paramzqj.a(this.X & 0xFFFF);
        }
        this.f.c(true);
        break;
      case 218: 
        a(paramzqj);
        this.e.getSettings().a(zc.b(this.Z, 0));
        break;
      case 224: 
        i(paramzqj);
        break;
      case 2173: 
        al(paramzqj);
        break;
      case 2189: 
        am(paramzqj);
        break;
      case 235: 
        if ((this.a & 0x200) != 0) {
          a(paramzqj, this.f.L());
        } else {
          h(paramzqj);
        }
        break;
      case 252: 
        k(paramzqj);
        break;
      case 352: 
        a(paramzqj);
        if ((this.Z[0] != 0) || (this.Z[1] != 0)) {
          this.f.a(true);
        }
        break;
      case 425: 
        ae(paramzqj);
        break;
      case 430: 
        o(paramzqj);
        break;
      case 442: 
        a(paramzqj);
        if (this.Z[2] == 0) {
          this.f.b(zct.a(this.Z, 3, this.Z.length - 3));
        } else {
          this.f.b(Encoding.getUnicode().a(this.Z, 3, this.Z.length - 3));
        }
        break;
      case 659: 
        r(paramzqj);
        break;
      case 2190: 
        s(paramzqj);
        break;
      case 1054: 
        g(paramzqj);
        break;
      case 10: 
        paramzqj.a(2);
        int i1 = ((this.f.U() * 8 + zlp.a) / 8 + 1) * 8;
        double d1 = (i1 - zlp.a) / this.f.U();
        for (i2 = 0; i2 < this.f.getCount(); i2++)
        {
          Cells localCells = this.f.get(i2).getCells();
          localCells.getColumns().d = d1;
        }
        zug.a(this.e);
        return;
      case 222: 
        a(paramzqj);
        i2 = zc.e(this.Z, 2) & 0xFFFF;
        i4 = zc.e(this.Z, 4) & 0xFFFF;
        i6 = this.Z[6] & 0xFF;
        int i7 = this.Z[7] & 0xFF;
        this.f.setOleSize(i2, i4, i6, i7);
        break;
      case 25: 
        a(paramzqj);
        if (((this.X & 0xFFFF) != 0) && (this.Z[0] == 1)) {
          this.f.D().a = true;
        }
        break;
      case 18: 
        a(paramzqj);
        if (((this.X & 0xFFFF) != 0) && (this.Z[0] == 1)) {
          this.f.D().b = true;
        }
        break;
      case 19: 
        a(paramzqj);
        i2 = zc.e(this.Z, 0);
        if ((i2 & 0xFFFF) != 0) {
          this.f.D().a(i2);
        }
        break;
      case 14: 
        a(paramzqj);
        if (this.Z[0] == 0) {
          this.e.getSettings().setPrecisionAsDisplayed(true);
        }
        break;
      case 34: 
        a(paramzqj);
        if ((this.Z != null) && (this.Z[0] != 0)) {
          this.e.getSettings().setDate1904(true);
        }
        break;
      case 141: 
        a(paramzqj);
        switch (this.Z[0])
        {
        case 0: 
          this.e.getSettings().setDisplayDrawingObjects(0);
          break;
        case 1: 
          this.e.getSettings().setDisplayDrawingObjects(1);
          break;
        case 2: 
          this.e.getSettings().setDisplayDrawingObjects(2);
        }
        break;
      case 134: 
        a(paramzqj);
        break;
      case 91: 
        a(paramzqj);
        localObject = this.e.getSettings().getWriteProtection();
        ((WriteProtection)localObject).setRecommendReadOnly(this.Z[0] == 1);
        ((WriteProtection)localObject).a(zc.e(this.Z, 2));
        break;
      case 47: 
        this.X = paramzqj.b(this.Y);
        this.Z = new byte[this.X];
        paramzqj.a(this.Z);
        this.d = true;
        if ((this.Z[0] == 0) && (this.Z[1] == 0))
        {
          localObject = this.e.getSettings().getPassword();
          if ((this.e.getSettings().getPassword() == null) || ("".equals(this.e.getSettings().getPassword()))) {
            localObject = "VelvetSweatshop";
          }
          i4 = zc.e(this.Z, 2);
          i6 = zc.e(this.Z, 4);
          if (!zca.a((String)localObject, i6, i4)) {
            throw new CellsException(8, "Invalid password.");
          }
          this.e.getSettings().a(0);
          a(paramzqj.a, this.ae, new zca((String)localObject));
        }
        else if (this.Z[4] == 1)
        {
          this.e.getSettings().a(1);
          localObject = new byte[16];
          byte[] arrayOfByte1 = new byte[16];
          byte[] arrayOfByte2 = new byte[16];
          System.arraycopy(this.Z, 6, localObject, 0, 16);
          System.arraycopy(this.Z, 22, arrayOfByte1, 0, 16);
          System.arraycopy(this.Z, 38, arrayOfByte2, 0, 16);
          try
          {
            ztl localztl = null;
            if ((this.e.getSettings().getPassword() == null) || ("".equals(this.e.getSettings().getPassword()))) {
              localztl = new ztl("VelvetSweatshop", (byte[])localObject, arrayOfByte1, arrayOfByte2);
            } else {
              localztl = new ztl(this.e.getSettings().getPassword(), (byte[])localObject, arrayOfByte1, arrayOfByte2);
            }
            a(paramzqj.a, this.ae, localztl);
          }
          catch (Exception localException1)
          {
            if ((this.e.getSettings().getPassword() == null) || ("".equals(this.e.getSettings().getPassword()))) {
              throw new CellsException(8, "Please provide password for the Workbook file.");
            }
            throw new CellsException(8, "Invalid password.");
          }
        }
        else
        {
          i3 = zc.a(this.Z, 10);
          int i5 = 10;
          long l1 = zc.d(this.Z, i5 + 12);
          long l2 = zc.d(this.Z, i5 + 16);
          long l3 = zc.d(this.Z, i5 + 20);
          long l4 = zc.d(this.Z, i5 + 24);
          String str = Encoding.getUnicode().a(this.Z, i5 + 36, i3 - 34);
          this.e.getSettings().a(3);
          this.e.getSettings().b((int)(l3 & 0xFFFFFFFF));
          i5 = 14 + i3;
          i3 = zc.a(this.Z, i5);
          i5 += 4;
          byte[] arrayOfByte3 = new byte[i3];
          byte[] arrayOfByte4 = new byte[i3];
          System.arraycopy(this.Z, i5, arrayOfByte3, 0, i3);
          i5 += i3;
          System.arraycopy(this.Z, i5, arrayOfByte4, 0, i3);
          i5 += i3;
          i3 = zc.a(this.Z, i5);
          byte[] arrayOfByte5 = new byte[i3];
          i5 += 4;
          System.arraycopy(this.Z, i5, arrayOfByte5, 0, i3);
          i5 += i3;
          try
          {
            zcc localzcc = null;
            if ((this.e.getSettings().getPassword() == null) || ("".equals(this.e.getSettings().getPassword()))) {
              localzcc = new zcc("VelvetSweatshop", arrayOfByte3, str, l4, 0L, l2, l1, l3);
            } else {
              localzcc = new zcc(this.e.getSettings().getPassword(), arrayOfByte3, str, l4, 0L, l2, l1, l3);
            }
            if (!localzcc.b(arrayOfByte4, arrayOfByte5)) {
              throw new CellsException(8, "Invalid password.");
            }
            a(paramzqj.a, this.ae, localzcc);
            this.e.getSettings().a(3);
            this.e.getSettings().b((int)(l3 & 0xFFFFFFFF));
          }
          catch (Exception localException2)
          {
            if ((this.e.getSettings().getPassword() == null) || ("".equals(this.e.getSettings().getPassword()))) {
              throw new CellsException(8, "Please provide password for the Workbook file.");
            }
            throw new CellsException(8, "Invalid password.");
          }
        }
        break;
      case 317: 
        a(paramzqj);
        if ((this.X & 0xFFFF) > 0)
        {
          this.T = new int[(this.X & 0xFFFF) / 2];
          for (i3 = 0; i3 < this.T.length; i3++)
          {
            this.T[i3] = (zc.e(this.Z, i3 * 2) & 0xFFFF);
            if (this.T[i3] == 0)
            {
              this.T = null;
              this.U = 1;
              break;
            }
            if (this.T[i3] > this.U) {
              this.U = this.T[i3];
            }
          }
        }
        break;
      case 156: 
        a(paramzqj);
        this.f.z().a(zc.e(this.Z, 0));
        break;
      case 431: 
        a(paramzqj);
        this.f.z().a(this.Z);
        break;
      case 444: 
        a(paramzqj);
        this.f.z().b(this.Z);
        break;
      case 213: 
        m(paramzqj);
        break;
      case 92: 
      case 193: 
      case 194: 
      case 195: 
      case 225: 
      case 226: 
        if ((this.a & 0x8000) != 0)
        {
          a(paramzqj, this.W & 0xFFFF);
          if (this.f.z().a() == null) {
            this.f.z().a(new ArrayList());
          }
          zf.a(this.f.z().a(), this.Z);
        }
        else
        {
          h(paramzqj);
        }
        break;
      case 66: 
        a(paramzqj);
        this.f.p().getSettings().e = zc.b(this.Z, 0);
        break;
      case 2147: 
        if ((this.a & 0x8000) != 0)
        {
          a(paramzqj);
          this.e.getSettings().c().a(this.Z);
        }
        else
        {
          h(paramzqj);
        }
        break;
      case 2198: 
        l(paramzqj);
        break;
      case 2148: 
        if ((this.a & 0x8000) != 0)
        {
          a(paramzqj);
          zf.a(this.f.z().b(), this.Z);
        }
        else
        {
          h(paramzqj);
        }
        break;
      case 2150: 
        if ((this.a & 0x200) != 0) {
          a(paramzqj, this.f.N());
        } else {
          h(paramzqj);
        }
        break;
      case 2188: 
        a(paramzqj);
        this.e.getSettings().setCheckCompatibility(this.Z[12] == 0);
        break;
      case 60: 
        h(paramzqj);
        break;
      case 96: 
        this.e.d = 52;
        this.X = paramzqj.b(this.Y);
        paramzqj.a(this.X & 0xFFFF);
        break;
      default: 
        this.X = paramzqj.b(this.Y);
        paramzqj.a(this.X & 0xFFFF);
      }
    }
  }
  
  private void l(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x8000) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = 0;
    if ((this.X & 0xFFFF) >= 16)
    {
      i1 = zc.a(this.Z, 12);
      this.e.d().c = i1;
    }
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    localzh.b(this.Z, 16, (this.X & 0xFFFF) - 16);
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2175)
      {
        paramzqj.a(-2);
        break;
      }
      a(paramzqj);
      localzh.b(this.Z, 12, (this.X & 0xFFFF) - 12);
    }
    zcjm localzcjm = null;
    try
    {
      boolean bool = false;
      Object localObject;
      if (localzh.h() != 0L)
      {
        localzh.b(0L);
        localObject = com.aspose.cells.a.f.zi.a(localzh);
        String str = "theme/theme/theme1.xml";
        if (((com.aspose.cells.a.f.zi)localObject).a(str, true) != -1)
        {
          com.aspose.cells.a.f.zh localzh1 = ((com.aspose.cells.a.f.zi)localObject).a(str);
          zm localzm = ((com.aspose.cells.a.f.zi)localObject).a(localzh1);
          localzcjm = zauz.a(localzm, null, true);
          bool = true;
          localzm.a();
        }
        ((com.aspose.cells.a.f.zi)localObject).b();
      }
      else if (i1 == 124226)
      {
        localzcjm = zauz.a(zvt.d());
      }
      if (localzcjm != null)
      {
        localObject = new zaln(this.e);
        ((zaln)localObject).a(localzcjm, bool);
      }
    }
    catch (Exception localException) {}
  }
  
  private void m(zqj paramzqj)
    throws Exception
  {
    paramzqj.a(-2);
    if ((this.a & 0x2000) != 0)
    {
      zaws localzaws = null;
      byte b1 = 1;
      while (a(paramzqj, false)) {
        switch (this.W)
        {
        case 213: 
          a(paramzqj);
          localzaws = new zaws(this.f.W());
          this.f.W().b(localzaws);
          localzaws.b = (zc.e(this.Z, 0) & 0xFFFF);
          if (localzaws.b > this.f.W().b) {
            this.f.W().b = localzaws.b;
          }
          break;
        case 227: 
          a(paramzqj);
          int i1 = zc.e(this.Z, 0) & 0xFFFF;
          b1 = ztr.e(i1);
          localzaws.f = zawr.a(localzaws, b1);
          switch (b1)
          {
          case 1: 
            d(paramzqj, (zboy)localzaws.f);
            break;
          case 4: 
            a(paramzqj, (zno)localzaws.f);
            break;
          case 3: 
          case 5: 
          case 6: 
          case 7: 
          default: 
            break;
          case 2: 
          case 8: 
            a(paramzqj, (zbxs)localzaws.f);
          }
          break;
        }
      }
    }
    else
    {
      while (a(paramzqj, false)) {
        h(paramzqj);
      }
    }
  }
  
  private boolean a(zqj paramzqj, boolean paramBoolean)
    throws Exception
  {
    this.W = paramzqj.b(this.Y);
    switch (this.W)
    {
    case 133: 
    case 352: 
    case 425: 
      break;
    case 213: 
      if (!paramBoolean) {
        return true;
      }
      break;
    default: 
      return true;
    }
    paramzqj.a(-2);
    return false;
  }
  
  private void a(zqj paramzqj, zboy paramzboy)
    throws Exception
  {
    a(paramzqj);
    int i1 = 0;
    int i2 = zc.e(this.Z, i1) & 0xFFFF;
    int i3 = zc.e(this.Z, i1 + 2) & 0xFFFF;
    int i4 = this.Z[(i1 + 4)] & 0xFF;
    int i5 = this.Z[(i1 + 5)] & 0xFF;
    i1 += 6;
    String str1 = a(this.Z, i1);
    String str2 = a(str1, CellsHelper.a(i2, i4, i3, i5, 65535, 255));
    paramzboy.b = str2;
  }
  
  private void b(zqj paramzqj, zboy paramzboy)
    throws Exception
  {
    a(paramzqj);
    int i1 = 0;
    int[] arrayOfInt = { i1 };
    String str1 = zct.a(this.Z, arrayOfInt);
    i1 = arrayOfInt[0];
    if (str1.startsWith("=")) {
      str1 = str1.substring(1);
    }
    String str2 = a(this.Z, i1);
    String str3 = a(str2, str1);
    paramzboy.b = str3;
  }
  
  private void c(zqj paramzqj, zboy paramzboy)
    throws Exception
  {
    a(paramzqj);
    int i1 = 0;
    String str1 = Name.b(this.Z[i1]);
    i1 += 2;
    String str2 = a(this.Z, i1);
    String str3 = a(str2, str1);
    paramzboy.b = str3;
  }
  
  private void a(zqj paramzqj, zawp paramzawp)
    throws Exception
  {
    a(paramzqj);
    byte[] arrayOfByte = new byte[this.Z.length - 4];
    System.arraycopy(this.Z, 4, arrayOfByte, 0, arrayOfByte.length);
    paramzawp.s.a(arrayOfByte);
  }
  
  private void d(zqj paramzqj, zboy paramzboy)
    throws Exception
  {
    while (a(paramzqj, true)) {
      switch (this.W)
      {
      case 81: 
        a(paramzqj, paramzboy);
        break;
      case 82: 
        b(paramzqj, paramzboy);
        break;
      case 437: 
        c(paramzqj, paramzboy);
        break;
      case 2148: 
        a(paramzqj, paramzboy.a);
      }
    }
  }
  
  String a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || ("".equals(paramString1))) {
      return paramString2;
    }
    if (zamm.a(paramString1)) {
      return "'" + paramString1 + "'!" + paramString2;
    }
    return paramString1 + "!" + paramString2;
  }
  
  private void a(zqj paramzqj, zno paramzno)
    throws Exception
  {
    int i1 = 0;
    int i2 = 0;
    String[] arrayOfString = null;
    int i3 = 0;
    int i4 = 0;
    while (a(paramzqj, true))
    {
      Object localObject;
      switch (this.W)
      {
      case 208: 
        a(paramzqj);
        paramzno.b = new znp[zc.b(this.Z, 0)];
        paramzno.a = ((this.Z[5] & 0xFF & 0x80) != 0);
        if (!paramzno.a) {
          paramzno.c = new String[zc.b(this.Z, 4)][];
        } else {
          paramzno.c = new String[1][];
        }
        for (int i5 = 0; i5 < paramzno.b.length; i5++) {
          paramzno.b[i5] = new znp(paramzno, zc.b(this.Z, 2));
        }
        break;
      case 81: 
        a(paramzqj, paramzno.b[i1].b);
        i1++;
        break;
      case 82: 
        b(paramzqj, paramzno.b[i1].b);
        i1++;
        break;
      case 437: 
        c(paramzqj, paramzno.b[i1].b);
        i1++;
        break;
      case 210: 
        a(paramzqj);
        localObject = new int[this.Z.length / 2];
        for (int i6 = 0; i6 < localObject.length; i6++) {
          localObject[i6] = (zc.e(this.Z, i6 * 2) & 0xFFFF);
        }
        paramzno.b[i2].a = ((int[])localObject);
        i2++;
        break;
      case 209: 
        a(paramzqj);
        arrayOfString = new String[zc.e(this.Z, 0)];
        paramzno.c[i3] = arrayOfString;
        i3++;
        i4 = 0;
        break;
      case 205: 
        a(paramzqj);
        localObject = zct.a(this.Z, 0);
        arrayOfString[i4] = localObject;
        i4++;
        break;
      case 2148: 
        a(paramzqj, paramzno.d);
      }
    }
  }
  
  private void a(zqj paramzqj, zbxs paramzbxs)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    while (a(paramzqj, true))
    {
      a(paramzqj, this.W & 0xFFFF);
      localzh.b(this.Z, 0, this.Z.length);
    }
    localzh.b();
    paramzbxs.d = localzh.o();
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = zc.e(this.Z, paramInt) & 0xFFFF;
    String str = null;
    if (i1 == 0) {
      return null;
    }
    str = zct.a(this.Z, paramInt);
    if (str.charAt(0) == '\002') {
      str = str.substring(1);
    }
    str = zbti.e(str);
    return str;
  }
  
  private void n(zqj paramzqj)
    throws Exception
  {
    if ((!this.m) && (this.a == 0))
    {
      h(paramzqj);
      return;
    }
    zbth localzbth = this.f.w();
    int i1 = 0;
    for (int i2 = 0; i2 < localzbth.getCount(); i2++)
    {
      zbti localzbti2 = localzbth.a(i2);
      if (localzbti2.e())
      {
        i1 = 1;
        break;
      }
    }
    if (i1 == 0)
    {
      zbti localzbti1 = new zbti(1);
      this.f.c(localzbth.getCount());
      localzbth.a(localzbti1);
    }
    a(paramzqj);
    int i3 = zc.e(this.Z, 0);
    this.f.r().clear();
    int i4;
    int i5;
    int i6;
    int i7;
    if ((i3 & 0xFFFF) * 6 + 2 > this.Z.length)
    {
      i4 = (this.Z.length - 2) / 6;
      int i8;
      for (i5 = 0; i5 < i4; i5++)
      {
        i6 = zc.e(this.Z, 6 * i5 + 2);
        i7 = zc.e(this.Z, 6 * i5 + 4);
        i8 = zc.e(this.Z, 6 * i5 + 6);
        this.f.r().b(i6 & 0xFFFF, i7 & 0xFFFF, i8 & 0xFFFF);
      }
      for (;;)
      {
        this.W = paramzqj.b(this.Y);
        if ((this.W & 0xFFFF) != 60)
        {
          paramzqj.a(-2);
          break;
        }
        a(paramzqj);
        i4 = this.Z.length / 6;
        for (i5 = 0; i5 < i4; i5++)
        {
          i6 = zc.e(this.Z, 6 * i5);
          i7 = zc.e(this.Z, 6 * i5 + 2);
          i8 = zc.e(this.Z, 6 * i5 + 4);
          this.f.r().b(i6 & 0xFFFF, i7 & 0xFFFF, i8 & 0xFFFF);
        }
      }
    }
    else
    {
      for (i4 = 0; i4 < (i3 & 0xFFFF); i4++)
      {
        i5 = zc.e(this.Z, 6 * i4 + 2);
        i6 = zc.e(this.Z, 6 * i4 + 4);
        i7 = zc.e(this.Z, 6 * i4 + 6);
        this.f.r().b(i5 & 0xFFFF, i6 & 0xFFFF, i7 & 0xFFFF);
      }
    }
  }
  
  private void o(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (this.f.w() == null) {
      this.f.a(new zbth());
    }
    zbti localzbti = new zbti();
    int i2;
    int i3;
    Object localObject;
    if (this.Z.length == 4)
    {
      if ((this.Z[2] == 1) && (this.Z[3] == 4))
      {
        localzbti.a(1);
        this.f.c(this.f.w().getCount());
      }
      else if ((this.Z[2] == 1) && (this.Z[3] == 58))
      {
        localzbti.a(2);
      }
    }
    else
    {
      int i1 = zc.e(this.Z, 0) & 0xFFFF;
      localzbti.a(i1 == 0 ? 3 : 0);
      i2 = 2;
      i3 = zc.e(this.Z, i2) & 0xFFFF;
      if (this.Z[(i2 + 2)] == 1)
      {
        localzbti.c(Encoding.getUnicode().a(this.Z, i2 + 3, i3 * 2));
        i2 += 3 + i3 * 2;
      }
      else
      {
        localObject = new byte[2 * i3];
        for (int i4 = 0; i4 < i3; i4++) {
          localObject[(2 * i4)] = this.Z[(i2 + 3 + i4)];
        }
        localzbti.c(Encoding.getUnicode().a((byte[])localObject, 0, localObject.length));
        i2 += 3 + i3;
      }
      if ((i1 == 0) && (((i3 > 1) && (localzbti.i().charAt(0) == '\001')) || (localzbti.i().indexOf(3) == -1))) {
        localzbti.a(0);
      }
      localObject = zbti.e(localzbti.i());
      if (i1 != 0)
      {
        String[] arrayOfString = new String[i1];
        for (int i6 = 0; i6 < i1; i6++)
        {
          i3 = zc.e(this.Z, i2) & 0xFFFF;
          if (this.Z[(i2 + 2)] == 1)
          {
            arrayOfString[i6] = Encoding.getUnicode().a(this.Z, i2 + 3, i3 * 2);
            i2 += 3 + i3 * 2;
          }
          else
          {
            byte[] arrayOfByte2 = new byte[2 * i3];
            for (int i7 = 0; (i7 < i3) && (i2 + 3 + i7 < this.Z.length); i7++) {
              arrayOfByte2[(2 * i7)] = this.Z[(i2 + 3 + i7)];
            }
            arrayOfString[i6] = Encoding.getUnicode().a(arrayOfByte2, 0, arrayOfByte2.length);
            i2 += 3 + i3;
          }
          if ((i2 >= (this.X & 0xFFFF)) && (i6 != i1 - 1))
          {
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            a(paramzqj);
            i2 = 0;
          }
        }
        localzbti.a(arrayOfString);
      }
    }
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 35) {
        break;
      }
      a(paramzqj);
      zwh localzwh = new zwh(localzbti);
      localzwh.d(zc.e(this.Z, 0));
      localzwh.a(zc.a(this.Z, 2));
      i2 = 8;
      if (localzwh.i())
      {
        localzwh.b = (this.Z[i2] & 0xFF);
        switch (this.Z[i2])
        {
        case 0: 
          localzwh.a("CONSOLIDATE_AREA");
          break;
        case 1: 
          localzwh.a("AUTO_OPEN");
          break;
        case 2: 
          localzwh.a("AUTO_CLOSE");
          break;
        case 3: 
          localzwh.a("EXTRACT");
          break;
        case 4: 
          localzwh.a("DATABASE");
          break;
        case 5: 
          localzwh.a("CRITERIA");
          break;
        case 6: 
          localzwh.a("PRINT_AREA");
          break;
        case 7: 
          localzwh.a("PRINT_TITLES");
          break;
        case 8: 
          localzwh.a("RECORDER");
          break;
        case 9: 
          localzwh.a("DATA_FORM");
          break;
        case 10: 
          localzwh.a("AUTO_ACTIVATE");
          break;
        case 11: 
          localzwh.a("AUTO_DEACTIVATE");
          break;
        case 12: 
          localzwh.a("SHEET_TITLE");
          break;
        case 13: 
          localzwh.a("_FILTERDATABASE");
          break;
        }
        i2++;
      }
      else if (this.Z[7] == 0)
      {
        i3 = this.Z[6] & 0xFF;
        localObject = new byte[2 * i3];
        for (int i5 = 0; i5 < i3; i5++) {
          localObject[(2 * i5)] = this.Z[(8 + i5)];
        }
        localzwh.a(Encoding.getUnicode().a((byte[])localObject, 0, localObject.length));
        i2 += (this.Z[6] & 0xFF);
      }
      else
      {
        localzwh.a(Encoding.getUnicode().a(this.Z, 8, (this.Z[6] & 0xFF) * 2));
        i2 += (this.Z[6] & 0xFF) * 2;
      }
      if (this.Z.length - i2 > 0)
      {
        byte[] arrayOfByte1 = new byte[this.Z.length - i2];
        System.arraycopy(this.Z, i2, arrayOfByte1, 0, arrayOfByte1.length);
        localzwh.b(arrayOfByte1);
      }
      if ((localzbti.a() == 3) && (localzbti.b().size() == 0) && (this.Z.length == 9)) {
        localzbti.a(4);
      }
      zf.a(localzbti.b(), localzwh);
    }
    paramzqj.a(-2);
    this.f.w().a(localzbti);
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 89) {
        break;
      }
      a(paramzqj, localzbti);
    }
    paramzqj.a(-2);
  }
  
  private void a(zqj paramzqj, zbti paramzbti)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0) & 0xFFFF;
    int i2 = zc.e(this.Z, 2) & 0xFFFF;
    zwr localzwr = paramzbti.b(i2);
    if (i1 == 0) {
      return;
    }
    for (int i3 = 0; i3 < i1; i3++)
    {
      this.W = paramzqj.b(this.Y);
      if (((this.W & 0xFFFF) == 90) || ((this.W & 0xFFFF) == 60))
      {
        a(paramzqj);
        int i4 = this.Z[1] & 0xFF;
        int i5 = this.Z[0] & 0xFF;
        int i6 = zc.e(this.Z, 2) & 0xFFFF;
        zwn localzwn = localzwr.e(i6);
        int i7 = 4;
        int i8 = -1;
        for (int i9 = i4; i9 <= i5; i9++)
        {
          if (i7 >= this.Z.length)
          {
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            a(paramzqj);
            i7 = 0;
          }
          if ((this.Z[i7] != 2) && (i7 + 9 > this.Z.length))
          {
            byte[] arrayOfByte1 = this.Z;
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              break;
            }
            a(paramzqj);
            byte[] arrayOfByte2 = this.Z;
            this.Z = new byte[this.Z.length + arrayOfByte1.length - i7];
            System.arraycopy(arrayOfByte1, i7, this.Z, 0, arrayOfByte1.length - i7);
            System.arraycopy(arrayOfByte2, arrayOfByte1.length - i7, this.Z, 0, arrayOfByte2.length);
            i7 = 0;
          }
          switch (this.Z[i7])
          {
          case 0: 
            i7 += 9;
            break;
          case 1: 
            localzwn.a(i8, i9, 1, this.Z, i7 + 1);
            i7 += 9;
            break;
          case 2: 
            localzwn.a(i8, i9, 2, this.Z, i7 + 1);
            int i10 = zc.e(this.Z, i7 + 1) & 0xFFFF;
            if (this.Z[(i7 + 3)] == 0) {
              i7 += 4 + i10;
            } else {
              i7 += 4 + i10 * 2;
            }
            break;
          case 4: 
            localzwn.a(i8, i9, 4, this.Z, i7 + 1);
            i7 += 9;
            break;
          case 16: 
            localzwn.a(i8, i9, 3, this.Z, i7 + 1);
            i7 += 9;
            break;
          default: 
            return;
          }
          i8 = i9;
        }
      }
      else
      {
        paramzqj.a(-2);
        return;
      }
    }
  }
  
  private void a(zqj paramzqj, zoh paramzoh)
    throws Exception
  {
    a(paramzqj);
    int i1;
    if (paramzoh == null)
    {
      i1 = zc.a(this.Z, 16);
      if (i1 <= 65) {
        this.j.c(zc.a(this.Z, 16));
      }
      if ((this.X & 0xFFFF) == 40) {
        this.j.o = b(this.Z, 24);
      }
    }
    else
    {
      i1 = zc.a(this.Z, 16);
      if (i1 <= 65) {
        paramzoh.f(zc.a(this.Z, 16));
      }
      if ((this.X & 0xFFFF) == 40) {
        paramzoh.r = b(this.Z, 24);
      }
    }
  }
  
  private void p(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x20) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    for (int i2 = 0; i2 < (i1 & 0xFFFF); i2++)
    {
      int i3 = zc.a(this.Z, 4 * i2 + 2);
      this.f.o().a(i3, i2 + 8);
    }
  }
  
  private void q(zqj paramzqj)
    throws Exception
  {
    if ((this.ad != null) || (this.aa != null))
    {
      zbzv localzbzv = (zbzv)this.f.C();
      byte[] arrayOfByte;
      if (this.ad != null) {
        for (i1 = 0; i1 < this.ad.size(); i1++)
        {
          arrayOfByte = (byte[])this.ad.get(i1);
          b(arrayOfByte);
        }
      } else {
        localzbzv.c();
      }
      this.ad = null;
      for (int i1 = 0; i1 < this.aa.size(); i1++)
      {
        arrayOfByte = (byte[])this.aa.get(i1);
        Style localStyle = new Style(this.f);
        int i2 = localStyle.a(arrayOfByte);
        localzbzv.c(localStyle);
        if ((this.af != null) && (this.af.get(Integer.valueOf(i1)) != null))
        {
          boolean bool = ((zbzi)this.af.get(Integer.valueOf(i1))).b(localStyle);
          if ((bool) && (i1 == 15)) {
            this.f.A().set(0, localStyle.getFont());
          }
        }
      }
      if (this.ac != null) {
        for (i1 = 0; i1 < this.ac.size(); i1++)
        {
          arrayOfByte = (byte[])this.ac.get(i1);
          a(arrayOfByte);
        }
      }
      this.f.V();
      this.aa = null;
    }
    a(paramzqj);
    j(paramzqj);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    int i1 = zc.e(paramArrayOfByte, 0) & 0xFFFF;
    int i2 = i1 & 0x8000;
    i1 &= 0xFFF;
    String str = "";
    Object localObject;
    if (i2 == 0)
    {
      if (paramArrayOfByte[2] == 0) {
        return;
      }
      if (paramArrayOfByte[4] == 0)
      {
        localObject = new byte[2 * paramArrayOfByte.length - 10];
        for (int i3 = 0; i3 < paramArrayOfByte.length - 5; i3++) {
          localObject[(2 * i3)] = paramArrayOfByte[(i3 + 5)];
        }
        str = Encoding.getUnicode().a((byte[])localObject);
      }
      else
      {
        str = Encoding.getUnicode().a(paramArrayOfByte, 5, paramArrayOfByte.length - 5);
      }
    }
    else
    {
      switch (paramArrayOfByte[2])
      {
      case 0: 
        str = "Normal";
        break;
      case 1: 
        str = "RowLevel_" + Byte.toString(paramArrayOfByte[3]);
        break;
      case 2: 
        str = "ColLevel_" + Byte.toString(paramArrayOfByte[3]);
        break;
      case 3: 
        str = "Comma";
        break;
      case 4: 
        str = "Currency";
        break;
      case 5: 
        str = "Percent";
        break;
      case 6: 
        str = "Comma [0]";
        break;
      case 7: 
        str = "Currency [0]";
        break;
      case 8: 
        str = "Hyperlink";
        break;
      case 9: 
        str = "Followed Hyperlink";
        break;
      }
    }
    if ((str != null) && (!"".equals(str)) && (i1 < this.f.C().b()))
    {
      localObject = this.f.C().a(i1);
      this.f.s().a((Style)localObject);
      ((Style)localObject).a(str);
    }
  }
  
  private void r(zqj paramzqj)
    throws Exception
  {
    if ((this.b) && (this.ac == null)) {
      this.ac = new ArrayList();
    }
    do
    {
      if (this.b)
      {
        a(paramzqj);
        zf.a(this.ac, this.Z);
      }
      else
      {
        h(paramzqj);
      }
      this.W = paramzqj.b(this.Y);
    } while ((this.W & 0xFFFF) == 659);
    paramzqj.a(-2);
  }
  
  private void s(zqj paramzqj)
    throws Exception
  {
    if (((this.a & 0x2000) != 0) || ((this.a & 0x4000) != 0))
    {
      a(paramzqj);
      TableStyleCollection localTableStyleCollection = this.f.getTableStyles();
      int i1 = zc.e(this.Z, 16) & 0xFFFF;
      int i2 = zc.e(this.Z, 18) & 0xFFFF;
      int i3 = 20;
      localTableStyleCollection.a(Encoding.getUnicode().a(this.Z, i3, i1 * 2));
      if (localTableStyleCollection.a() != null) {
        i3 += i1 * 2;
      }
      localTableStyleCollection.b(Encoding.getUnicode().a(this.Z, i3, i2 * 2));
      for (;;)
      {
        this.W = paramzqj.b(this.Y);
        if ((this.W & 0xFFFF) != 2191) {
          break;
        }
        t(paramzqj);
      }
      paramzqj.a(-2);
      return;
    }
    h(paramzqj);
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) == 2191)
    {
      h(paramzqj);
      for (;;)
      {
        this.W = paramzqj.b(this.Y);
        if ((this.W & 0xFFFF) != 2191) {
          break;
        }
        h(paramzqj);
      }
      paramzqj.a(-2);
      return;
    }
    paramzqj.a(-2);
  }
  
  private void t(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    TableStyle localTableStyle = null;
    int i1 = zc.e(this.Z, 18) & 0xFFFF;
    int i2 = 20;
    String str = Encoding.getUnicode().a(this.Z, i2, i1 * 2);
    int i3 = this.f.getTableStyles().c(str);
    localTableStyle = this.f.getTableStyles().get(i3);
    localTableStyle.a((this.Z[12] & 0xFF & 0x2) != 0);
    localTableStyle.b((this.Z[12] & 0xFF & 0x4) != 0);
    TableStyleElementCollection localTableStyleElementCollection = new TableStyleElementCollection(localTableStyle);
    localTableStyle.a(localTableStyleElementCollection);
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 2192: 
        a(localTableStyle, paramzqj);
      }
    }
    paramzqj.a(-2);
  }
  
  private void a(TableStyle paramTableStyle, zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.a(this.Z, 12);
    int i2 = zc.a(this.Z, 16);
    int i3 = zc.a(this.Z, 20);
    try
    {
      TableStyleElement localTableStyleElement = new TableStyleElement(paramTableStyle.getTableStyleElements(), zcij.F(i1));
      localTableStyleElement.setSize(i2);
      localTableStyleElement.a = i3;
      paramTableStyle.getTableStyleElements().a(localTableStyleElement);
    }
    catch (Exception localException) {}
  }
  
  private void u(zqj paramzqj)
    throws Exception
  {
    if ((this.b) && (this.ad == null)) {
      this.ad = new ArrayList();
    }
    do
    {
      if (this.b)
      {
        a(paramzqj);
        zf.a(this.ad, this.Z);
      }
      else
      {
        h(paramzqj);
      }
      this.W = paramzqj.b(this.Y);
    } while ((this.W & 0xFFFF) == 49);
    paramzqj.a(-2);
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    Font localFont = new Font(this.f, null, false);
    localFont.a(paramArrayOfByte);
    if (this.f.A().size() > 3) {
      localFont.d(this.f.A().size() + 1);
    } else {
      localFont.d(this.f.A().size());
    }
    zf.a(this.f.A(), localFont);
  }
  
  private void v(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x8000) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    this.e.getSettings().c(zc.e(this.Z, 0));
    this.e.getSettings().d(zc.e(this.Z, 2));
    this.e.getSettings().e(zc.e(this.Z, 4));
    this.e.getSettings().f(zc.e(this.Z, 6));
    int i1 = this.Z[8];
    int i2 = (byte)(i1 & 0xFF & 0x1);
    this.f.p().getSettings().setHidden(i2 != 0);
    i2 = (byte)(i1 & 0xFF & 0x2);
    this.f.p().getSettings().setMinimized(i2 != 0);
    i2 = (byte)(i1 & 0xFF & 0x8);
    if (i2 == 0) {
      this.f.p().getSettings().setHScrollBarVisible(false);
    } else {
      this.f.p().getSettings().setHScrollBarVisible(true);
    }
    i2 = (byte)(i1 & 0xFF & 0x10);
    if (i2 == 0) {
      this.f.p().getSettings().setVScrollBarVisible(false);
    } else {
      this.f.p().getSettings().setVScrollBarVisible(true);
    }
    i2 = (byte)(i1 & 0xFF & 0x20);
    if (i2 == 0) {
      this.f.p().getSettings().setShowTabs(false);
    } else {
      this.f.p().getSettings().setShowTabs(true);
    }
    this.f.b(zc.e(this.Z, 10) & 0xFFFF);
    this.f.k(zc.e(this.Z, 12));
    this.f.p().getSettings().setSheetTabBarWidth(zc.e(this.Z, 16));
  }
  
  private void w(zqj paramzqj)
    throws Exception
  {
    if (!this.t)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    Name localName = null;
    if (this.f.getNames().getCount() > 0) {
      localName = this.f.getNames().get(this.f.getNames().getCount() - 1);
    } else {
      return;
    }
    int i1 = zc.e(this.Z, 12) & 0xFFFF;
    int i2 = zc.e(this.Z, 14) & 0xFFFF;
    if (i2 == 0) {
      return;
    }
    int i3 = 0;
    if (this.Z[16] == 0) {
      i3 = 17 + i1;
    } else {
      i3 = 17 + i1 * 2;
    }
    if (this.Z[i3] == 0) {
      localName.setComment(Encoding.getASCII().a(this.Z, i3 + 1, i2));
    } else {
      localName.setComment(Encoding.getUnicode().a(this.Z, i3 + 1, i2 * 2));
    }
  }
  
  private void x(zqj paramzqj)
    throws Exception
  {
    do
    {
      if (this.t)
      {
        a(paramzqj);
        g();
      }
      else
      {
        h(paramzqj);
      }
      this.W = paramzqj.b(this.Y);
    } while ((this.W & 0xFFFF) == 24);
    paramzqj.a(-2);
  }
  
  private void g()
  {
    Name localName = new Name(this.f);
    localName.b(this.Z);
    this.f.getNames().a(localName, false);
  }
  
  private void a(zqj paramzqj, HorizontalPageBreakCollection paramHorizontalPageBreakCollection)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    for (int i2 = 0; i2 < (i1 & 0xFFFF); i2++)
    {
      int i3 = zc.e(this.Z, 6 * i2 + 2) & 0xFFFF;
      int i4 = zc.e(this.Z, 6 * i2 + 4) & 0xFFFF;
      int i5 = zc.e(this.Z, 6 * i2 + 6) & 0xFFFF;
      if (i5 < i4)
      {
        int i6 = i4;
        i4 = i5;
        i5 = i6;
      }
      paramHorizontalPageBreakCollection.add(i3, i4, i5);
    }
  }
  
  private void a(zqj paramzqj, VerticalPageBreakCollection paramVerticalPageBreakCollection)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    for (int i2 = 0; i2 < (i1 & 0xFFFF); i2++)
    {
      int i3 = zc.e(this.Z, 6 * i2 + 2) & 0xFFFF;
      int i4 = zc.e(this.Z, 6 * i2 + 4) & 0xFFFF;
      int i5 = zc.e(this.Z, 6 * i2 + 6) & 0xFFFF;
      if (i5 < i4)
      {
        int i6 = i4;
        i4 = i5;
        i5 = i6;
      }
      paramVerticalPageBreakCollection.add(i4, i5, i3);
    }
  }
  
  private void y(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = zc.b(this.Z, 2);
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    byte[] arrayOfByte = null;
    if (this.t)
    {
      arrayOfByte = new byte[this.Z.length - 20];
      System.arraycopy(this.Z, 20, arrayOfByte, 0, arrayOfByte.length);
    }
    int i1 = 0;
    Object localObject1 = null;
    if (((this.Z[12] & 0xFF) == 255) && ((this.Z[13] & 0xFF) == 255)) {}
    switch (this.Z[6])
    {
    case 0: 
    case 3: 
      break;
    case 1: 
      i1 = 2;
      localObject1 = this.Z[8] == 0 ? znq.e : znq.d;
      break;
    case 2: 
      i1 = 3;
      localObject1 = com.aspose.cells.a.c.zi.a(this.Z[8]);
      break;
    default: 
      i1 = 1;
      localObject1 = Double.valueOf(zc.f(this.Z, 6));
      break;
      i1 = 1;
      localObject1 = Double.valueOf(zc.f(this.Z, 6));
    }
    Object localObject2 = null;
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 519: 
        i1 = 4;
        localObject1 = c(paramzqj);
        break;
      case 566: 
        if (this.t) {
          localObject2 = new zaal(this.A, this.L.a, A(paramzqj));
        } else {
          h(paramzqj);
        }
        break;
      case 545: 
        if (this.t)
        {
          localObject2 = new zaaj(this.A, this.L.a, z(paramzqj));
          ((zaai)localObject2).b(true);
        }
        else
        {
          h(paramzqj);
        }
        break;
      case 1212: 
        if (this.t) {
          localObject2 = new zaaj(this.A, this.L.a, B(paramzqj));
        } else {
          h(paramzqj);
        }
        break;
      }
    }
    paramzqj.a(-2);
    if (!this.t)
    {
      if (i1 == 4) {
        localObject1 = this.g.a((String)localObject1);
      }
      this.L.c = i1;
      this.L.d = localObject1;
      d();
      return;
    }
    if (localObject2 == null) {
      localObject2 = new zaai(this.A, this.L.a);
    }
    ((zaai)localObject2).b = arrayOfByte;
    ((zaai)localObject2).c = i1;
    ((zaai)localObject2).d = localObject1;
    this.i.a.a((zaai)localObject2);
    this.L.c = 5;
    this.L.d = localObject2;
    if (((zaai)localObject2).a() != null)
    {
      if ((!((zaai)localObject2).a().a().c()) && ((this.m) || (((zaai)localObject2).d()))) {
        this.C.put(Integer.valueOf(this.A << 8 | this.L.a), localObject2);
      }
    }
    else if (((zaai)localObject2).b() != null)
    {
      if ((this.m) && (!((zaai)localObject2).b().a.c())) {
        this.C.put(Integer.valueOf(this.A << 8 | this.L.a), localObject2);
      }
    }
    else if ((arrayOfByte[0] == 5) && (arrayOfByte[1] == 0) && ((arrayOfByte[2] == 1) || ((this.m) && (arrayOfByte[2] == 2))))
    {
      int i2 = 0;
      int i3 = 0;
      int[] arrayOfInt1 = { i2 };
      int[] arrayOfInt2 = { i3 };
      this.i.p().y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
      i2 = arrayOfInt1[0];
      i3 = arrayOfInt2[0];
      Integer localInteger = Integer.valueOf(i2 << 8 | i3);
      Object localObject3 = this.C.get(localInteger);
      Object localObject4;
      int i4;
      if (localObject3 == null)
      {
        localObject4 = new zgs();
        ((zgs)localObject4).a = ((short)i3);
        if (i2 == this.A)
        {
          i4 = this.I.b(i3);
          if (i4 > -1)
          {
            localObject4 = this.I.c(i4, (zgs)localObject4);
            if (((zgs)localObject4).c == 5) {
              localObject3 = ((zgs)localObject4).d;
            }
          }
        }
        else
        {
          localObject4 = this.P.a.a(i2, (zgs)localObject4, 4);
          if ((localObject4 != null) && (((zgs)localObject4).c == 5)) {
            localObject3 = ((zgs)localObject4).d;
          }
        }
      }
      if (localObject3 != null)
      {
        localObject4 = (zaai)localObject3;
        i4 = 0;
        Object localObject5;
        if (((zaai)localObject4).a() != null)
        {
          localObject5 = ((zaaj)localObject4).a();
          ((zaai)localObject2).b(((zbf)localObject5).b());
          CellArea localCellArea = ((zbf)localObject5).a();
          i4 = 1;
          if ((this.A == localCellArea.EndRow) && (this.L.a == localCellArea.EndColumn)) {
            this.C.remove(localInteger);
          }
        }
        else if (((zaai)localObject4).b() != null)
        {
          i4 = 2;
          localObject5 = ((zaal)localObject4).b().a;
          if ((this.A == ((CellArea)localObject5).EndRow) && (this.L.a == ((CellArea)localObject5).EndColumn)) {
            this.C.remove(localInteger);
          }
        }
        if ((this.m) && ((i4 & 0xFF) > 0))
        {
          localObject5 = ((zaai)localObject4).b;
          int i5 = ((zaai)localObject4).e;
          short s1 = ((zaai)localObject4).f;
          int i6 = ((zaai)localObject4).c;
          Object localObject6 = ((zaai)localObject4).d;
          ((zaai)localObject4).e = ((zaai)localObject2).e;
          ((zaai)localObject4).f = ((zaai)localObject2).f;
          ((zaai)localObject4).c = ((zaai)localObject2).c;
          ((zaai)localObject4).d = ((zaai)localObject2).d;
          ((zaai)localObject4).b = this.f.y().a().a(i4, this.A, this.L.a);
          this.L.d = localObject4;
          if (d())
          {
            this.L.d = localObject2;
            this.I.b(this.N, this.L);
          }
          else
          {
            this.i.a.b(((zaai)localObject2).a);
          }
          ((zaai)localObject4).b = ((byte[])localObject5);
          ((zaai)localObject4).e = i5;
          ((zaai)localObject4).f = s1;
          ((zaai)localObject4).c = i6;
          ((zaai)localObject4).d = localObject6;
          return;
        }
      }
    }
    if (!d()) {
      this.i.a.b(((zaai)localObject2).a);
    }
  }
  
  String c(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0) & 0xFFFF;
    boolean bool = (this.Z[2] & 0xFF & 0x1) == 0;
    int i2 = (this.Z[2] & 0xFF & 0x4) != 0 ? 1 : 0;
    int i3 = (this.Z[2] & 0xFF & 0x8) != 0 ? 1 : 0;
    int i4 = 3 + (i3 != 0 ? 2 : 0) + (i2 != 0 ? 4 : 0);
    int i5 = ((this.X & 0xFFFF) - i4) / (bool ? 1 : 2);
    String str = zct.a(this.Z, i4, bool, i5);
    i1 -= i5;
    while (i1 > 0)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 60: 
      case 519: 
        a(paramzqj);
        bool = (this.Z[0] & 0xFF & 0x1) == 0;
        i4 = 1;
        i5 = ((this.X & 0xFFFF) - i4) / (bool ? 1 : 2);
        str = str + zct.a(this.Z, i4, bool, i5);
        i1 -= i5;
        break;
      default: 
        paramzqj.a(-2);
        return str;
      }
    }
    return str;
  }
  
  private zbf z(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(this.Z, 0) & 0xFFFF);
    localCellArea.EndRow = (zc.e(this.Z, 2) & 0xFFFF);
    localCellArea.StartColumn = (this.Z[4] & 0xFF);
    localCellArea.EndColumn = (this.Z[5] & 0xFF);
    byte[] arrayOfByte = new byte[(this.X & 0xFFFF) - 12];
    System.arraycopy(this.Z, 12, arrayOfByte, 0, arrayOfByte.length);
    return new zbf(localCellArea, true, arrayOfByte);
  }
  
  private zacb A(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    zacb localzacb = new zacb();
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(this.Z, 0) & 0xFFFF);
    localCellArea.EndRow = (zc.e(this.Z, 2) & 0xFFFF);
    localCellArea.StartColumn = (this.Z[4] & 0xFF);
    localCellArea.EndColumn = (this.Z[5] & 0xFF);
    localzacb.a = localCellArea;
    localzacb.a(this.Z[6]);
    if (localzacb.d())
    {
      localzacb.b = (zc.e(this.Z, 8) & 0xFFFF);
      localzacb.c = (zc.e(this.Z, 10) & 0xFFFF);
      localzacb.d = (zc.e(this.Z, 12) & 0xFFFF);
      localzacb.e = (zc.e(this.Z, 14) & 0xFFFF);
    }
    else if (localzacb.f())
    {
      localzacb.d = (zc.e(this.Z, 8) & 0xFFFF);
      localzacb.e = (zc.e(this.Z, 10) & 0xFFFF);
    }
    else
    {
      localzacb.b = (zc.e(this.Z, 8) & 0xFFFF);
      localzacb.c = (zc.e(this.Z, 10) & 0xFFFF);
    }
    return localzacb;
  }
  
  private zbf B(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(this.Z, 0) & 0xFFFF);
    localCellArea.EndRow = (zc.e(this.Z, 2) & 0xFFFF);
    localCellArea.StartColumn = (this.Z[4] & 0xFF);
    localCellArea.EndColumn = (this.Z[5] & 0xFF);
    byte[] arrayOfByte = new byte[(this.X & 0xFFFF) - 8];
    System.arraycopy(this.Z, 8, arrayOfByte, 0, arrayOfByte.length);
    return new zbf(localCellArea, false, arrayOfByte);
  }
  
  private void C(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    int i1 = this.Z[6];
    if (this.Z[7] == 0)
    {
      if (!this.q) {
        return;
      }
      this.L.c = 2;
      this.L.d = Boolean.valueOf(this.Z[6] != 0);
    }
    else
    {
      if (!this.r) {
        return;
      }
      this.L.c = 3;
      this.L.d = com.aspose.cells.a.c.zi.a(this.Z[6]);
    }
    d();
  }
  
  private void D(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    d();
  }
  
  private void E(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    this.e.getSettings().setLanguageCode(b(zc.e(this.Z, 0) & 0xFFFF));
    this.e.getSettings().setRegion(b(zc.e(this.Z, 2) & 0xFFFF));
  }
  
  private int b(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 7: 
      return 7;
    case 20: 
      return 20;
    case 30: 
      return 30;
    case 31: 
      return 31;
    case 32: 
      return 32;
    case 33: 
      return 33;
    case 34: 
      return 34;
    case 36: 
      return 36;
    case 39: 
      return 39;
    case 41: 
      return 41;
    case 43: 
      return 43;
    case 44: 
      return 44;
    case 45: 
      return 45;
    case 46: 
      return 46;
    case 47: 
      return 47;
    case 48: 
      return 48;
    case 49: 
      return 49;
    case 52: 
      return 52;
    case 55: 
      return 55;
    case 61: 
      return 61;
    case 64: 
      return 64;
    case 66: 
      return 66;
    case 81: 
      return 81;
    case 82: 
      return 82;
    case 84: 
      return 84;
    case 86: 
      return 86;
    case 90: 
      return 90;
    case 91: 
      return 91;
    case 213: 
      return 213;
    case 216: 
      return 216;
    case 218: 
      return 218;
    case 351: 
      return 351;
    case 354: 
      return 354;
    case 358: 
      return 358;
    case 420: 
      return 420;
    case 886: 
      return 886;
    case 961: 
      return 961;
    case 962: 
      return 962;
    case 963: 
      return 963;
    case 964: 
      return 964;
    case 965: 
      return 965;
    case 966: 
      return 966;
    case 971: 
      return 971;
    case 972: 
      return 972;
    case 974: 
      return 974;
    case 981: 
      return 981;
    }
    return 0;
  }
  
  private void a(zqj paramzqj, int[] paramArrayOfInt)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a(this.Z[2] & 0xFF);
    int i1 = Row.e(this.I);
    for (int i3 = 4; i3 < this.Z.length - 2; i3 += 2) {
      if (!c())
      {
        zgs tmp76_73 = this.K;
        tmp76_73.a = ((short)(tmp76_73.a + 1));
      }
      else
      {
        this.L.b = (zc.e(this.Z, i3) & 0xFFFF);
        if (this.L.b > this.h) {
          this.L.b = 15;
        }
        int i2;
        if (i1 < 0) {
          i2 = this.L.b == (paramArrayOfInt[this.L.a] & 0xFFFF) ? 1 : 0;
        } else {
          i2 = i1 == this.L.b ? 1 : 0;
        }
        this.L.c = 0;
        this.L.d = null;
        this.I.b(this.N, this.L, 6);
        if (this.m)
        {
          if (this.l.processCell(new Cell(this.J, this.N, this.L, this.L == this.K)))
          {
            if (this.L.a > this.O) {
              this.O = this.L.a;
            }
          }
          else {
            this.I.c(this.N, 1);
          }
        }
        else if (i2 != 0) {
          this.I.c(this.N, 1);
        }
        zgs tmp336_333 = this.K;
        tmp336_333.a = ((short)(tmp336_333.a + 1));
      }
    }
    if ((!this.m) && (this.L.a > this.O)) {
      this.O = this.L.a;
    }
  }
  
  private void F(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    byte b1 = this.Z[0];
    int i1 = zc.e(this.Z, 2);
    int i2 = paramzqj.b(this.Y);
    if ((i2 & 0xFFFF) != 128)
    {
      this.i.a(b1);
      this.i.a(i1);
    }
    paramzqj.a(-2);
  }
  
  private void G(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    if ((i1 & 0xFFFF) != 8)
    {
      int i2 = (i1 & 0xFFFF) * 8;
      double d1 = 0.0D;
      if (i2 >= 12) {
        d1 = (i2 - 5) / 7.0D;
      } else {
        d1 = i2 / 12.0D;
      }
      this.i.getColumns().c = d1;
      this.i.getColumns().d = d1;
    }
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) == 512) {
      a(paramzqj);
    } else {
      paramzqj.a(-2);
    }
  }
  
  private void h()
  {
    this.y = 0;
    this.z = 0;
    this.J = null;
    this.A = -1;
    this.B = false;
  }
  
  private boolean c(int paramInt)
  {
    if (this.z >= this.y) {
      return false;
    }
    this.E = this.v[this.z];
    if (this.E.a == this.A)
    {
      this.z += 1;
      if (this.z == this.y) {
        return false;
      }
      this.E = this.v[this.z];
    }
    if (this.E.a == paramInt) {
      return true;
    }
    if (this.E.a > paramInt) {
      return false;
    }
    this.A = this.E.a;
    do
    {
      if ((!this.m) || (this.l.startRow(this.A)))
      {
        e();
        if (this.m) {
          this.l.processRow(this.J);
        } else {
          f();
        }
      }
      this.z += 1;
      if (this.z == this.y) {
        return false;
      }
      this.E = this.v[this.z];
      this.A = this.E.a;
      if (this.A == paramInt) {
        return true;
      }
    } while (this.A <= paramInt);
    return false;
  }
  
  private void H(zqj paramzqj)
    throws Exception
  {
    if (this.w)
    {
      this.w = false;
      f();
      c(Integer.MAX_VALUE);
      h();
    }
    else if (this.y >= this.v.length)
    {
      f();
      c(Integer.MAX_VALUE);
      h();
    }
    zbdx localzbdx = new zbdx();
    this.v[(this.y++)] = localzbdx;
    a(paramzqj);
    localzbdx.a = (zc.e(this.Z, 0) & 0xFFFF);
    if ((this.Z[7] & 0xFF & 0x80) == 0) {
      localzbdx.e = ((short)Math.min(zc.b(this.Z, 6), 8190));
    } else {
      localzbdx.e = ((short)Math.min(zc.b(this.Z, 6) & 0x7FFF, 8190));
    }
    localzbdx.b = this.Z[12];
    localzbdx.c = this.Z[15];
    localzbdx.d = (this.Z[14] & 0xFF | (localzbdx.c & 0xFF & 0xF) << 8);
    if ((localzbdx.d < 15) || (localzbdx.d > this.h)) {
      localzbdx.d = 15;
    }
    zbdx tmp247_246 = localzbdx;
    tmp247_246.c = ((byte)(tmp247_246.c & 0xF0));
    int i1 = localzbdx.e();
    if ((i1 & 0xFF) > (this.i.s() & 0xFF)) {
      this.i.c(i1);
    }
  }
  
  private void b(zqj paramzqj, int[] paramArrayOfInt)
    throws Exception
  {
    if (!this.b)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    int i2 = zc.e(this.Z, 2);
    int i3;
    if ((i2 & 0xFFFF) >= 256)
    {
      this.i.getColumns().a().a(this.Z);
      this.i.getColumns().a().a(i1 & 0xFFFF);
      for (i3 = i1 & 0xFFFF; i3 <= 255; i3++) {
        paramArrayOfInt[i3] = this.i.getColumns().a().c();
      }
    }
    else
    {
      for (i3 = i1 & 0xFFFF; (i3 <= (i2 & 0xFFFF)) && (i3 <= 255); i3++)
      {
        Column localColumn = this.i.getColumns().get(i3);
        localColumn.a(this.Z);
        if ((localColumn.b() & 0xFF) > (this.i.r() & 0xFF)) {
          this.i.b(localColumn.b());
        }
        paramArrayOfInt[i3] = localColumn.c();
      }
    }
  }
  
  private void I(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    int i1 = zc.e(this.Z, 6) & 0xFFFF;
    String str;
    if (i1 > 0)
    {
      if (this.Z[8] == 0) {
        str = zct.a(this.Z, 9, i1);
      } else {
        str = Encoding.getUnicode().a(this.Z, 9, i1 * 2);
      }
    }
    else {
      str = "";
    }
    this.L.c = 4;
    zbbj localzbbj = this.g.a(str);
    this.L.d = localzbbj;
    if (!d()) {
      this.g.d(localzbbj);
    }
  }
  
  private void J(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    this.L.c = 1;
    this.L.d = Double.valueOf(zc.f(this.Z, 6));
    d();
  }
  
  private void K(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    this.L.c = 6;
    this.L.d = Integer.valueOf(zc.a(this.Z, 6));
    d();
  }
  
  private void L(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = zc.b(this.Z, 2);
    for (int i1 = 6; i1 < (this.X & 0xFFFF); i1 += 6) {
      if (!c())
      {
        zgs tmp65_62 = this.K;
        tmp65_62.a = ((short)(tmp65_62.a + 1));
      }
      else
      {
        this.L.c = 6;
        this.L.b = (zc.e(this.Z, i1 - 2) & 0xFFFF);
        if (this.L.b > this.h) {
          this.L.b = 15;
        }
        this.L.d = Integer.valueOf(zc.a(this.Z, i1));
        d();
        zgs tmp157_154 = this.K;
        tmp157_154.a = ((short)(tmp157_154.a + 1));
      }
    }
  }
  
  private void M(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (!a(zc.e(this.Z, 0) & 0xFFFF)) {
      return;
    }
    this.K.a = ((short)(this.Z[2] & 0xFF));
    if (!c()) {
      return;
    }
    this.L.b = (zc.e(this.Z, 4) & 0xFFFF);
    if (this.L.b > this.h) {
      this.L.b = 15;
    }
    this.L.c = 4;
    zbbj localzbbj = this.g.a(zc.a(this.Z, 6));
    localzbbj.d += 1;
    this.L.d = localzbbj;
    d();
  }
  
  private void N(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    this.j.getHyperlinks().a(this.Z);
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) == 2048)
    {
      a(paramzqj);
      if (this.j.getHyperlinks().getCount() != 0)
      {
        Hyperlink localHyperlink = this.j.getHyperlinks().get(this.j.getHyperlinks().getCount() - 1);
        localHyperlink.setScreenTip(Encoding.getUnicode().a(this.Z, 10, this.Z.length - 12));
      }
    }
    else
    {
      paramzqj.a(-2);
    }
  }
  
  private void O(zqj paramzqj)
    throws Exception
  {
    int[] arrayOfInt = new int['Ā'];
    for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
      arrayOfInt[i1] = 15;
    }
    this.n = ((this.a & 0x1) != 0);
    this.o = ((this.a & 0x2) != 0);
    this.p = ((this.a & 0x4) != 0);
    this.q = ((this.a & 0x10) != 0);
    this.r = ((this.a & 0x8) != 0);
    this.s = ((this.a & 0x1F) != 0);
    this.u = false;
    this.S = new HashMap();
    this.P = this.i.getRows();
    this.F = this.i.e();
    this.H = new zbdm(1, 32, this.g, this.i.a);
    this.I = null;
    this.J = null;
    this.G = null;
    this.y = -1;
    this.z = 0;
    this.A = -1;
    this.B = false;
    this.w = false;
    this.x = true;
    this.C.clear();
    boolean bool = false;
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      double d1;
      int i9;
      Object localObject;
      switch (this.W)
      {
      case 12: 
        a(paramzqj);
        this.e.getSettings().setMaxIteration(zc.e(this.Z, 0));
        break;
      case 13: 
        a(paramzqj);
        switch (zc.e(this.Z, 0))
        {
        case 0: 
          this.e.getSettings().setCalcMode(2);
          break;
        case 1: 
          this.e.getSettings().setCalcMode(0);
          break;
        default: 
          this.e.getSettings().setCalcMode(1);
        }
        break;
      case 15: 
        a(paramzqj);
        this.e.getSettings().a((zc.e(this.Z, 0) & 0xFFFF) == 0);
        break;
      case 16: 
        a(paramzqj);
        this.e.getSettings().setMaxChange(zc.f(this.Z, 0));
        break;
      case 17: 
        a(paramzqj);
        this.e.getSettings().setIteration(this.Z[0] == 1);
        break;
      case 95: 
        a(paramzqj);
        this.e.getSettings().setRecalculateBeforeSave(this.Z[0] == 1);
        break;
      case 20: 
        a(paramzqj);
        if ((this.Z != null) && (this.Z.length != 0)) {
          this.i.h().b(this.Z);
        }
        break;
      case 21: 
        a(paramzqj);
        if ((this.Z != null) && (this.Z.length != 0)) {
          this.i.h().c(this.Z);
        }
        break;
      case 26: 
        a(paramzqj, this.j.getVerticalPageBreaks());
        break;
      case 27: 
        a(paramzqj, this.j.getHorizontalPageBreaks());
        break;
      case 28: 
        Y(paramzqj);
        break;
      case 29: 
        if (this.j.t() == null) {
          this.j.a(new zbew(this.j));
        }
        a(paramzqj, this.j.t());
        break;
      case 38: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        this.i.h().setLeftMarginInch(d1);
        break;
      case 39: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        this.i.h().setRightMarginInch(d1);
        break;
      case 40: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        this.i.h().setTopMarginInch(d1);
        break;
      case 41: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        this.i.h().setBottomMarginInch(d1);
        break;
      case 42: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          this.i.h().setPrintHeadings(false);
        } else {
          this.i.h().setPrintHeadings(true);
        }
        break;
      case 43: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          this.i.h().setPrintGridlines(false);
        } else {
          this.i.h().setPrintGridlines(true);
        }
        break;
      case 77: 
        this.X = paramzqj.b(this.Y);
        if ((this.a & 0x8000) == 0)
        {
          paramzqj.a(this.X & 0xFFFF);
        }
        else
        {
          int i2 = paramzqj.b(this.Y) & 0xFFFF;
          if (i2 != 0)
          {
            paramzqj.a((this.X & 0xFFFF) - 2);
          }
          else
          {
            byte[] arrayOfByte1 = new byte[(this.X & 0xFFFF) - 2];
            paramzqj.a(arrayOfByte1);
            ArrayList localArrayList = new ArrayList();
            zf.a(localArrayList, arrayOfByte1);
            int i3 = arrayOfByte1.length;
            for (;;)
            {
              this.W = paramzqj.b(this.Y);
              if ((this.W & 0xFFFF) == 77)
              {
                this.X = paramzqj.b(this.Y);
                i2 = paramzqj.b(this.Y) & 0xFFFF;
                arrayOfByte1 = new byte[(this.X & 0xFFFF) - 2];
                paramzqj.a(arrayOfByte1);
                zf.a(localArrayList, arrayOfByte1);
                i3 += arrayOfByte1.length;
              }
              else
              {
                if ((this.W & 0xFFFF) != 60) {
                  break;
                }
                a(paramzqj);
                zf.a(localArrayList, this.Z);
                i3 += (this.X & 0xFFFF);
              }
            }
            paramzqj.a(-2);
            byte[] arrayOfByte2 = new byte[i3];
            i3 = 0;
            for (int i4 = 0; i4 < localArrayList.size(); i4++)
            {
              arrayOfByte1 = (byte[])localArrayList.get(i4);
              System.arraycopy(arrayOfByte1, 0, arrayOfByte2, i3, arrayOfByte1.length);
              i3 += arrayOfByte1.length;
            }
            this.j.getCells().h().setPrinterSettings(arrayOfByte2);
          }
        }
        break;
      case 549: 
        this.Q = null;
        F(paramzqj);
        break;
      case 85: 
        this.Q = null;
        G(paramzqj);
        break;
      case 125: 
        this.Q = null;
        b(paramzqj, arrayOfInt);
        break;
      case 174: 
        R(paramzqj);
        break;
      case 129: 
        a(paramzqj);
        this.j.i = zc.b(this.Z, 0);
        if ((this.j.i & 0x100) == 0) {
          this.i.h().setPercentScale(true);
        } else {
          this.i.h().setPercentScale(false);
        }
        if ((this.j.i & 0x40) == 0) {
          this.j.getOutline().SummaryRowBelow = false;
        }
        if ((this.j.i & 0x80) == 0) {
          this.j.getOutline().SummaryColumnRight = false;
        }
        break;
      case 131: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          this.i.h().setCenterHorizontally(false);
        } else {
          this.i.h().setCenterHorizontally(true);
        }
        break;
      case 132: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          this.i.h().setCenterVertically(false);
        } else {
          this.i.h().setCenterVertically(true);
        }
        break;
      case 144: 
        a(paramzqj);
        this.j.a(new zbql());
        this.j.q().b(this.Z);
        break;
      case 153: 
        this.Q = null;
        a(paramzqj);
        i1 = zc.e(this.Z, 0);
        double d2 = 0.0D;
        if (256 + zlp.a(this.f) > (i1 & 0xFFFF)) {
          d2 = (i1 & 0xFFFF) / (256.0D + zlp.a(this.f));
        } else {
          d2 = ((i1 & 0xFFFF) - zlp.a(this.f)) / 256.0D;
        }
        if (d2 < 0.0D) {
          d2 = 0.0D;
        }
        this.i.getColumns().a(d2);
        break;
      case 157: 
        a(paramzqj);
        Name localName = this.f.getNames().a("_FILTERDATABASE", this.j.getIndex());
        if (localName != null) {
          this.j.getAutoFilter().a(localName);
        }
        break;
      case 155: 
        paramzqj.a(2);
        break;
      case 158: 
        a(paramzqj);
        a(0, this.j.getAutoFilter());
        break;
      case 2174: 
        X(paramzqj);
        break;
      case 160: 
        a(paramzqj);
        bool = true;
        int i5 = zc.e(this.Z, 0);
        int i6 = zc.e(this.Z, 2);
        this.j.setZoom((i5 & 0xFFFF) * 100 / (i6 & 0xFFFF));
        break;
      case 161: 
        if ((this.a & 0x8000) == 0)
        {
          h(paramzqj);
        }
        else
        {
          a(paramzqj);
          this.i.h().a(this.Z);
          this.W = paramzqj.b(this.Y);
          if ((this.W & 0xFFFF) == 2204) {
            a(this.i.h(), paramzqj, null);
          } else {
            paramzqj.a(-2);
          }
        }
        break;
      case 176: 
        ab(paramzqj);
        break;
      case 233: 
        Z(paramzqj);
        break;
      case 440: 
        N(paramzqj);
        break;
      case 426: 
        af(paramzqj);
        break;
      case 215: 
        this.e.i();
        f();
        c(Integer.MAX_VALUE);
        h();
        h(paramzqj);
        break;
      case 6: 
      case 1030: 
        if ((!this.u) && ((this.t) || (this.s))) {
          y(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 513: 
        if (this.n) {
          D(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 516: 
        if (this.o) {
          I(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 520: 
        this.R = null;
        if ((this.s) && (this.y < 0))
        {
          if ((this.m) && (!this.l.startSheet(this.j)))
          {
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.u = true;
          }
          this.y = 0;
        }
        if (this.s) {
          H(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 515: 
        if (this.p) {
          J(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 517: 
        if ((this.q) || (this.r)) {
          C(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 638: 
        if (this.p) {
          K(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 189: 
        if (this.p) {
          L(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 190: 
        if (this.n) {
          a(paramzqj, arrayOfInt);
        } else {
          h(paramzqj);
        }
        break;
      case 2146: 
        a(paramzqj, null);
        break;
      case 2150: 
        a(paramzqj, this.j.getPageSetup());
        break;
      case 229: 
        aj(paramzqj);
        break;
      case 236: 
        if ((this.a & 0x200) != 0)
        {
          if (this.Q == null) {
            this.Q = new zlx(this.i, 255);
          } else {
            this.i.b = this.Q;
          }
          if (this.R == null)
          {
            this.i.getRows().b(0);
            this.R = this.i.getRows().b;
          }
          else
          {
            this.i.getRows().b = this.R;
          }
          zapu localzapu = new zapu(this, paramzqj, this.f, this.j, this.j);
          localzapu.b();
          this.i.k();
          this.i.getRows().b();
        }
        else
        {
          Q(paramzqj);
        }
        break;
      case 253: 
        if (this.o) {
          M(paramzqj);
        } else {
          h(paramzqj);
        }
        break;
      case 65: 
        a(paramzqj, this.j.b());
        break;
      case 60: 
        h(paramzqj);
        break;
      case 10: 
        paramzqj.a(2);
        f();
        c(Integer.MAX_VALUE);
        a(bool);
        return;
      case 432: 
        ai(paramzqj);
        break;
      case 2169: 
        ag(paramzqj);
        break;
      case 2171: 
        ah(paramzqj);
        break;
      case 18: 
        a(paramzqj);
        this.j.getProtection().setAllowEditingContent(this.Z[0] == 0);
        break;
      case 221: 
        a(paramzqj);
        this.j.getProtection().setAllowEditingScenario(this.Z[0] == 0);
        break;
      case 99: 
        a(paramzqj);
        this.j.getProtection().setAllowEditingObject(this.Z[0] == 0);
        break;
      case 19: 
        a(paramzqj);
        this.j.getProtection().a(zc.e(this.Z, 0));
        break;
      case 429: 
        ac(paramzqj);
        break;
      case 434: 
        int i7 = (this.a & 0x1000) != 0 ? 1 : 0;
        a(paramzqj);
        if (i7 != 0) {
          this.j.getValidations().a(this.Z);
        }
        int i8 = zc.a(this.Z, 14);
        for (i9 = 0; i9 < i8; i9++)
        {
          paramzqj.a(2);
          if (i7 != 0)
          {
            a(paramzqj);
            zop localzop = new zop(this.j);
            Validation localValidation = localzop.a(this.Z);
            if (localValidation != null) {
              this.j.getValidations().a(localValidation);
            }
          }
          else
          {
            h(paramzqj);
          }
        }
        break;
      case 442: 
        aa(paramzqj);
        break;
      case 2151: 
        a(paramzqj);
        if (this.Z[12] == 2) {
          this.j.getProtection().a(this.Z);
        }
        break;
      case 2152: 
        a(paramzqj);
        if (this.Z[12] == 2) {
          j();
        } else if (this.Z[12] == 3) {
          i();
        }
        break;
      case 574: 
        ad(paramzqj);
        break;
      case 2187: 
        b(paramzqj, null);
        break;
      case 2161: 
        a(paramzqj);
        if (this.Z[12] == 5)
        {
          i9 = zc.a(this.Z, 23);
          if (i9 > this.f.e) {
            this.f.e = i9;
          }
          U(paramzqj);
        }
        else
        {
          if (this.j.H() == null) {
            this.j.c(new ArrayList());
          }
          localObject = new byte[(this.X & 0xFFFF) + 4];
          System.arraycopy(zc.a(this.W), 0, localObject, 0, 2);
          System.arraycopy(zc.a(this.X), 2, localObject, 0, 2);
          System.arraycopy(this.Z, 0, localObject, 4, this.Z.length);
          zf.a(this.j.H(), localObject);
        }
        break;
      case 2167: 
        S(paramzqj);
        break;
      case 2162: 
      case 2168: 
        T(paramzqj);
        break;
      case 2165: 
        if ((this.a & 0x4000) != 0)
        {
          if (this.j.H() == null) {
            this.j.c(new ArrayList());
          }
          a(paramzqj, this.W & 0xFFFF);
          zf.a(this.j.H(), this.Z);
        }
        else
        {
          h(paramzqj);
        }
        break;
      case 1048: 
        W(paramzqj);
        break;
      case 2197: 
        a(paramzqj);
        localObject = null;
        switch ((this.Z[12] & 0xFF) >> 3 & 0x7)
        {
        case 2: 
          localObject = this.j.getAutoFilter().getSorter();
          break;
        case 0: 
          localObject = this.j.s();
          break;
        }
        if (localObject != null) {
          a((DataSorter)localObject, paramzqj);
        }
        break;
      case 239: 
        P(paramzqj);
        break;
      default: 
        this.X = paramzqj.b(this.Y);
        paramzqj.a(this.X & 0xFFFF);
      }
    }
  }
  
  private void P(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = 4;
    int i2 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 2;
    CellArea localCellArea = new CellArea();
    if (i2 != 0) {
      for (int i3 = 0; i3 < i2; i3++)
      {
        int i5;
        if (i1 + 8 > (this.X & 0xFFFF)) {
          if (i1 == (this.X & 0xFFFF))
          {
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              return;
            }
            a(paramzqj);
            i1 = 0;
          }
          else
          {
            byte[] arrayOfByte = new byte[8];
            i5 = (this.X & 0xFFFF) - i1;
            System.arraycopy(this.Z, i1, arrayOfByte, 0, i5);
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) != 60)
            {
              paramzqj.a(-2);
              return;
            }
            a(paramzqj);
            System.arraycopy(this.Z, 0, arrayOfByte, i5, 8 - i5);
            i1 = 8 - i5;
            localCellArea.StartRow = (zc.e(arrayOfByte, 0) & 0xFFFF);
            localCellArea.EndRow = (zc.e(arrayOfByte, 2) & 0xFFFF);
            localCellArea.StartColumn = zc.b(arrayOfByte, 4);
            localCellArea.EndColumn = zc.b(arrayOfByte, 6);
            for (int i6 = localCellArea.StartRow; i6 <= localCellArea.EndRow; i6++) {
              for (int i7 = localCellArea.StartColumn; i7 <= localCellArea.EndColumn; i7++) {
                this.i.get(i6, i7).a(true);
              }
            }
            continue;
          }
        }
        localCellArea.StartRow = (zc.e(this.Z, i1) & 0xFFFF);
        localCellArea.EndRow = (zc.e(this.Z, i1 + 2) & 0xFFFF);
        localCellArea.StartColumn = zc.b(this.Z, i1 + 4);
        localCellArea.EndColumn = zc.b(this.Z, i1 + 6);
        for (int i4 = localCellArea.StartRow; i4 <= localCellArea.EndRow; i4++) {
          for (i5 = localCellArea.StartColumn; i5 <= localCellArea.EndColumn; i5++) {
            this.i.get(i4, i5).a(true);
          }
        }
        i1 += 8;
      }
    }
  }
  
  private void Q(zqj paramzqj)
    throws Exception
  {
    this.X = paramzqj.b(this.Y);
    paramzqj.a(this.X & 0xFFFF);
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) != 93)
    {
      paramzqj.a(-2);
      return;
    }
    this.X = paramzqj.b(this.Y);
    paramzqj.a(4);
    paramzqj.a(this.Y);
    paramzqj.a((this.X & 0xFFFF) - 6);
    if (this.Y[0] != 5) {
      return;
    }
    d(paramzqj);
  }
  
  void d(zqj paramzqj)
    throws Exception
  {
    this.W = paramzqj.b(this.Y);
    if ((this.W & 0xFFFF) != 2057)
    {
      h(paramzqj);
      return;
    }
    paramzqj.a(18);
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 10: 
        paramzqj.a(2);
        return;
      }
      h(paramzqj);
    }
  }
  
  private void R(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 0) & 0xFFFF;
    ScenarioCollection localScenarioCollection = this.i.g().getScenarios();
    localScenarioCollection.a = (zc.e(this.Z, 2) & 0xFFFF);
    localScenarioCollection.b = (zc.e(this.Z, 4) & 0xFFFF);
    int i2 = zc.e(this.Z, 6) & 0xFFFF;
    int i4;
    if (i2 > 0)
    {
      localScenarioCollection.c = new ArrayList();
      int i3 = 8;
      for (i4 = 0; i4 < i2; i4++)
      {
        CellArea localCellArea = new CellArea();
        localCellArea.StartRow = (zc.e(this.Z, i3) & 0xFFFF);
        localCellArea.EndRow = (zc.e(this.Z, i3 + 2) & 0xFFFF);
        localCellArea.StartColumn = zc.b(this.Z, i3 + 4);
        localCellArea.EndColumn = zc.b(this.Z, i3 + 6);
        i3 += 8;
        zf.a(localScenarioCollection.c, localCellArea);
      }
    }
    while (i1 > 0)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 60: 
      case 175: 
        a(paramzqj);
        Scenario localScenario = new Scenario();
        localScenarioCollection.a(localScenario);
        i4 = 0;
        int i5 = zc.e(this.Z, i4) & 0xFFFF;
        i4 += 2;
        localScenario.setLocked(this.Z[i4] != 0);
        localScenario.setHidden(this.Z[(i4 + 1)] != 0);
        i4 += 2;
        int i6 = this.Z[i4] & 0xFF;
        int i7 = this.Z[(i4 + 1)] & 0xFF;
        int i8 = this.Z[(i4 + 2)] & 0xFF;
        i4 += 3;
        boolean bool = this.Z[i4] == 0;
        localScenario.b = zct.a(this.Z, i4 + 1, bool, i6);
        i4 += localScenario.b.length() + (bool ? 0 : localScenario.b.length()) + 1;
        if (i8 != 0)
        {
          bool = this.Z[(i4 + 2)] == 0;
          localScenario.c = zct.a(this.Z, i4);
          i4 += localScenario.getUser().length() + (bool ? 0 : localScenario.getUser().length()) + 3;
        }
        if (i7 != 0)
        {
          bool = this.Z[(i4 + 2)] == 0;
          localScenario.a = zct.a(this.Z, i4);
          i4 += localScenario.getComment().length() + (bool ? 0 : localScenario.getComment().length()) + 3;
        }
        for (int i9 = 0; i9 < i5; i9++)
        {
          ScenarioInputCell localScenarioInputCell1 = new ScenarioInputCell();
          localScenario.getInputCells().a(localScenarioInputCell1);
          localScenarioInputCell1.a = (zc.e(this.Z, i4) & 0xFFFF);
          localScenarioInputCell1.b = (zc.b(this.Z, i4 + 2) & 0x3FFF);
          localScenarioInputCell1.e = ((this.Z[(i4 + 3)] & 0xFF & 0x40) != 0);
          i4 += 4;
        }
        i9 = 0;
        for (int i10 = 0; i10 < i5; i10++)
        {
          ScenarioInputCell localScenarioInputCell2 = localScenario.getInputCells().get(i10);
          if (i4 >= (this.X & 0xFFFF))
          {
            this.W = paramzqj.b(this.Y);
            if (((this.W & 0xFFFF) == 60) || ((this.W & 0xFFFF) == 175))
            {
              a(paramzqj);
              i4 = 0;
            }
            else
            {
              paramzqj.a(-2);
              return;
            }
          }
          int i11;
          if (i4 + 3 > (this.X & 0xFFFF))
          {
            i11 = (this.X & 0xFFFF) - i4;
            byte[] arrayOfByte1 = new byte[3];
            System.arraycopy(this.Z, i4, arrayOfByte1, 0, i11);
            this.W = paramzqj.b(this.Y);
            if (((this.W & 0xFFFF) == 60) || ((this.W & 0xFFFF) == 175))
            {
              a(paramzqj);
              i4 = 0;
            }
            else
            {
              paramzqj.a(-2);
              return;
            }
            System.arraycopy(this.Z, 0, arrayOfByte1, i11, 3 - i11);
            i4 = 3 - i11;
            i9 = zc.e(arrayOfByte1, 0) & 0xFFFF;
            bool = arrayOfByte1[2] == 0;
            localScenarioInputCell2.c = zct.a(this.Z, i4, bool, i9);
            i4 += localScenarioInputCell2.c.length() + (bool ? 0 : localScenarioInputCell2.c.length());
          }
          else
          {
            i9 = zc.e(this.Z, i4) & 0xFFFF;
            bool = this.Z[(i4 + 2)] == 0;
            i11 = i9 + 3 + (bool ? 0 : i9);
            if (i4 + i11 > (this.X & 0xFFFF))
            {
              int i12 = (this.X & 0xFFFF) - i4;
              byte[] arrayOfByte2 = new byte[i11];
              System.arraycopy(this.Z, i4, arrayOfByte2, 0, i12);
              this.W = paramzqj.b(this.Y);
              if (((this.W & 0xFFFF) == 60) || ((this.W & 0xFFFF) == 175))
              {
                a(paramzqj);
                i4 = 0;
              }
              else
              {
                paramzqj.a(-2);
                return;
              }
              System.arraycopy(this.Z, 0, arrayOfByte2, i12, i11 - i12);
              i4 = i11 - i12;
              localScenarioInputCell2.c = zct.a(arrayOfByte2, 3, bool, i9);
            }
            else
            {
              localScenarioInputCell2.c = zct.a(this.Z, i4 + 3, bool, i9);
              i4 += i11;
            }
          }
        }
        if (i4 + i5 * 2 < (this.X & 0xFFFF)) {
          if (((this.W & 0xFFFF) == 60) || ((this.W & 0xFFFF) == 175))
          {
            a(paramzqj);
            i4 = 0;
          }
          else
          {
            paramzqj.a(-2);
            return;
          }
        }
        break;
      default: 
        paramzqj.a(-2);
        return;
      }
      i1--;
    }
  }
  
  private void a(ShapeCollection paramShapeCollection)
  {
    if ((paramShapeCollection != null) && (paramShapeCollection.getCount() > 0))
    {
      if (this.Q == null) {
        this.Q = new zlx(this.i, 255);
      } else {
        this.i.b = this.Q;
      }
      if (this.R == null)
      {
        this.i.getRows().b(0);
        this.R = this.i.getRows().b;
      }
      else
      {
        this.i.getRows().b = this.R;
      }
      for (int i1 = 0; i1 < paramShapeCollection.getCount(); i1++)
      {
        Shape localShape = paramShapeCollection.get(i1);
        if (localShape.getMsoDrawingType() == 8)
        {
          MsoFormatPicture localMsoFormatPicture = localShape.getFormatPicture();
          localMsoFormatPicture.a();
        }
        if (localShape.R().i().c != null)
        {
          int i2 = localShape.R().i().a();
          double d1 = 0.0D;
          double d2 = 0.0D;
          if ((localShape.isGroup()) && (!localShape.W()))
          {
            d1 = localShape.R().i().c.j;
            d2 = localShape.R().i().c.k;
          }
          if ((!localShape.T()) && (!localShape.W())) {
            localShape.a(i2, 0, 0, 0, 0, 0, 0, 0, 0);
          }
          if ((d1 != 0.0D) && (d2 != 0.0D))
          {
            localShape.setWidth((int)(localShape.getWidth() * d1 + 0.5D));
            localShape.setHeight((int)(localShape.getHeight() * d2 + 0.5D));
          }
          if (i2 != 2) {
            localShape.setPlacement(i2);
          }
          if (localShape.getMsoDrawingType() == 5)
          {
            Chart localChart = ((ChartShape)localShape).a();
            a(localChart.p());
          }
        }
      }
      this.i.k();
      this.i.getRows().b();
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if ((this.j.w() != null) && (this.j.getShapes().getCount() == 0))
    {
      this.f.L().d().b(this.j.l.d().c().a() & 0xFFFF);
      this.j.l = null;
    }
    a(this.j.w());
    if (!paramBoolean) {
      switch (this.j.getViewType())
      {
      case 0: 
        this.j.setZoom(100);
        break;
      case 1: 
        this.j.setZoom(100);
        break;
      }
    }
  }
  
  private void b(zqj paramzqj, zoh paramzoh)
    throws Exception
  {
    a(paramzqj);
    if (paramzoh == null)
    {
      if (this.j.y() != null)
      {
        int i1 = zc.e(this.Z, 12) & 0xFFFF;
        if ((i1 >= 10) && (i1 <= 400)) {
          this.j.y()[2] = i1;
        }
      }
      if ((this.Z[14] & 0xFF & 0x1) != 0) {
        this.j.n = 2;
      }
      this.j.setRulerVisible((this.Z[14] & 0xFF & 0x2) != 0);
    }
    else
    {
      if (paramzoh.C() != null) {
        paramzoh.C()[2] = (zc.e(this.Z, 12) & 0xFFFF);
      }
      if ((this.Z[14] & 0xFF & 0x1) != 0) {
        paramzoh.d(2);
      }
      paramzoh.s((this.Z[14] & 0xFF & 0x2) != 0);
    }
  }
  
  private void i()
  {
    int i1 = this.j.getErrorCheckOptions().add();
    ErrorCheckOption localErrorCheckOption = this.j.getErrorCheckOptions().get(i1);
    int i2 = 19;
    int i3 = zc.e(this.Z, i2) & 0xFFFF;
    i2 += 8;
    for (int i4 = 0; i4 < i3; i4++)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = (zc.e(this.Z, i2) & 0xFFFF);
      localCellArea.EndRow = (zc.e(this.Z, i2 + 2) & 0xFFFF);
      localCellArea.StartColumn = zc.b(this.Z, i2 + 4);
      localCellArea.EndColumn = zc.b(this.Z, i2 + 6);
      localErrorCheckOption.addRange(localCellArea);
      i2 += 8;
    }
    localErrorCheckOption.b = zc.a(this.Z, i2);
    i2 += 4;
  }
  
  private void j()
    throws Exception
  {
    ProtectedRange localProtectedRange = new ProtectedRange(this.j.getAllowEditRanges());
    int i1 = 19;
    int i2 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 8;
    for (int i3 = 0; i3 < i2; i3++)
    {
      localObject = new CellArea();
      ((CellArea)localObject).StartRow = (zc.e(this.Z, i1) & 0xFFFF);
      ((CellArea)localObject).EndRow = (zc.e(this.Z, i1 + 2) & 0xFFFF);
      ((CellArea)localObject).StartColumn = (zc.e(this.Z, i1 + 4) & 0xFFFF);
      ((CellArea)localObject).EndColumn = (zc.e(this.Z, i1 + 6) & 0xFFFF);
      localProtectedRange.a((CellArea)localObject);
      i1 += 8;
    }
    i3 = (this.Z[i1] & 0xFF & 0x1) != 0 ? 1 : 0;
    i1 += 4;
    if (i1 + 4 > (this.X & 0xFFFF)) {
      return;
    }
    localProtectedRange.a(zc.e(this.Z, i1));
    i1 += 4;
    Object localObject = { i1 };
    localProtectedRange.setName(a(this.Z, (int[])localObject));
    i1 = localObject[0];
    if (i3 != 0)
    {
      int i4 = zc.a(this.Z, i1);
      localProtectedRange.a = new byte[i4 + 4];
      System.arraycopy(this.Z, i1, localProtectedRange.a, 0, i4 + 4);
    }
    this.j.getAllowEditRanges().a(localProtectedRange);
  }
  
  private void S(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x4000) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.b(this.Z, 12);
    int i2 = zc.a(this.Z, 14);
    ListObject localListObject = this.j.getListObjects().a(i2);
    if (localListObject == null) {
      return;
    }
    int i3 = 18;
    int i4;
    if (i1 == 0)
    {
      i4 = zc.a(this.Z, 18);
      int i5 = zc.a(this.Z, 22);
      int i6 = zc.a(this.Z, 26);
      int i7 = zc.a(this.Z, 30);
      int i8 = zc.a(this.Z, 34);
      int i9 = zc.a(this.Z, 38);
      int i10 = zc.a(this.Z, 42);
      int i11 = zc.a(this.Z, 46);
      int i12 = zc.a(this.Z, 50);
      i3 = 54;
      Style localStyle;
      if (i4 != 0)
      {
        localStyle = new Style(this.f);
        localStyle.a((byte)0);
        i3 = a(i3, localStyle, i4);
        localListObject.b(localStyle);
      }
      if (i6 != 0)
      {
        localStyle = new Style(this.f);
        localStyle.a((byte)0);
        i3 = a(i3, localStyle, i6);
        localListObject.c(localStyle);
      }
      if (i8 != 0)
      {
        localStyle = new Style(this.f);
        localStyle.a((byte)0);
        i3 = a(i3, localStyle, i8);
        localListObject.f(localStyle);
      }
    }
    else if (i1 == 1)
    {
      i4 = this.Z[18];
      localListObject.setShowTableStyleFirstColumn((i4 & 0xFF & 0x1) != 0);
      localListObject.setShowTableStyleLastColumn((i4 & 0xFF & 0x2) != 0);
      localListObject.setShowTableStyleRowStripes((i4 & 0xFF & 0x4) != 0);
      localListObject.setShowTableStyleColumnStripes((i4 & 0xFF & 0x8) != 0);
      i3 += 2;
      int[] arrayOfInt2 = { i3 };
      String str = a(this.Z, arrayOfInt2);
      i3 = arrayOfInt2[0];
      if (zw.b(str)) {
        localListObject.setTableStyleType(0);
      } else {
        localListObject.setTableStyleName(str);
      }
    }
    else if (i1 == 2)
    {
      int[] arrayOfInt1 = { i3 };
      localListObject.c(a(this.Z, arrayOfInt1));
      i3 = arrayOfInt1[0];
      arrayOfInt1[0] = i3;
      localListObject.setComment(a(this.Z, arrayOfInt1));
      i3 = arrayOfInt1[0];
    }
  }
  
  private void T(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x4000) == 0)
    {
      h(paramzqj);
      return;
    }
    this.Z = V(paramzqj);
    ListObject localListObject = new ListObject(this.j.getListObjects());
    localListObject.setTableStyleType(0);
    this.j.getListObjects().a(localListObject);
    if (this.Z[12] != 5)
    {
      localListObject.d = this.Z;
      return;
    }
    int i1 = zc.e(this.Z, 19) & 0xFFFF;
    int i2 = zc.a(this.Z, 21);
    int i3 = 27;
    ArrayList localArrayList = new ArrayList();
    for (int i4 = 0; i4 < i1; i4++)
    {
      CellArea localCellArea2 = new CellArea();
      localCellArea2.StartRow = (zc.e(this.Z, i3) & 0xFFFF);
      localCellArea2.EndRow = (zc.e(this.Z, i3 + 2) & 0xFFFF);
      localCellArea2.StartColumn = (zc.e(this.Z, i3 + 4) & 0xFFFF);
      localCellArea2.EndColumn = (zc.e(this.Z, i3 + 6) & 0xFFFF);
      i3 += 8;
      zf.a(localArrayList, localCellArea2);
    }
    CellArea localCellArea1 = (CellArea)localArrayList.get(0);
    localListObject.a(localCellArea1.StartRow);
    localListObject.c(localCellArea1.EndRow);
    localListObject.b(localCellArea1.StartColumn);
    localListObject.d(localCellArea1.EndColumn);
    switch (this.Z[i3])
    {
    case 1: 
      localListObject.a = 1;
      break;
    case 2: 
      localListObject.a = 2;
      break;
    case 3: 
      localListObject.a = 3;
      break;
    default: 
      localListObject.a = 0;
    }
    if (localListObject.getDataSourceType() != 0)
    {
      localListObject.d = this.Z;
      return;
    }
    localListObject.k(zc.a(this.Z, i3 + 4));
    boolean bool1 = this.Z[(i3 + 8)] == 1;
    localListObject.setShowHeaderRow(bool1);
    boolean bool2 = this.Z[(i3 + 12)] == 1;
    localListObject.e(zc.a(this.Z, i3 + 28));
    if ((localListObject.d() & 0x2) != 0) {
      localListObject.n().setRange(localListObject.y());
    }
    localListObject.b(bool2);
    localListObject.f(zc.a(this.Z, i3 + 32));
    localListObject.g(zc.a(this.Z, i3 + 36));
    localListObject.h(zc.a(this.Z, i3 + 40));
    localListObject.i(zc.a(this.Z, i3 + 44));
    localListObject.a(new byte[16]);
    System.arraycopy(this.Z, i3 + 48, localListObject.l(), 0, 16);
    i3 += 64;
    int[] arrayOfInt1 = { i3 };
    localListObject.d(a(this.Z, arrayOfInt1));
    i3 = arrayOfInt1[0];
    int i5 = zc.e(this.Z, i3) & 0xFFFF;
    i3 += 2;
    int[] arrayOfInt2;
    if (localListObject.h())
    {
      arrayOfInt2 = new int[] { i3 };
      localListObject.a(a(this.Z, arrayOfInt2));
      i3 = arrayOfInt2[0];
    }
    if (localListObject.i())
    {
      arrayOfInt2 = new int[] { i3 };
      localListObject.b(a(this.Z, arrayOfInt2));
      i3 = arrayOfInt2[0];
    }
    for (int i6 = 0; i6 < i5; i6++)
    {
      ListColumn localListColumn = new ListColumn(localListObject.getListColumns());
      localListObject.getListColumns().a(localListColumn);
      localListColumn.n = zc.a(this.Z, i3);
      localListColumn.m = zc.a(this.Z, i3 + 4);
      localListColumn.g = zc.a(this.Z, i3 + 8);
      localListColumn.a(this.Z[(i3 + 12)] & 0xFF);
      int i7 = zc.a(this.Z, i3 + 16);
      int i8 = zc.a(this.Z, i3 + 20);
      long l1 = zc.d(this.Z, i3 + 24);
      localListColumn.o = l1;
      int i9 = zc.a(this.Z, i3 + 28);
      int i10 = zc.a(this.Z, i3 + 32);
      i3 += 36;
      Object localObject = { i3 };
      localListColumn.a(a(this.Z, (int[])localObject));
      i3 = localObject[0];
      if (!localListObject.g())
      {
        localObject = new int[] { i3 };
        String str = a(this.Z, (int[])localObject);
        i3 = localObject[0];
        localListColumn.a(str);
      }
      if (i7 > 0)
      {
        localObject = new Style(this.f);
        i3 = a(i3, (Style)localObject, i7);
        localListColumn.d((Style)localObject);
      }
      if (i9 > 0)
      {
        localObject = new Style(this.f);
        i3 = a(i3, (Style)localObject, i9);
        localListColumn.b((Style)localObject);
      }
      int i11;
      if ((l1 & 0xFFFFFFFF & 1L) != 0L)
      {
        i11 = zc.a(this.Z, i3);
        if (i11 != 0) {
          a(i3 + 6, localListObject.getAutoFilter());
        }
        i3 += 6 + i11;
      }
      if ((l1 & 0xFFFFFFFF & 0x4) != 0L)
      {
        i11 = zc.e(this.Z, i3) & 0xFFFF;
        i3 += 2 + i11;
      }
      if ((l1 & 0xFFFFFFFF & 0x8) != 0L)
      {
        i11 = zc.e(this.Z, i3) & 0xFFFF;
        localListColumn.e = new byte[i11 + 2];
        System.arraycopy(this.Z, i3, localListColumn.e, 0, i11 + 2);
        i3 += i11 + 2;
      }
      if ((l1 & 0xFFFFFFFF & 0x80) != 0L)
      {
        i11 = zc.e(this.Z, i3) & 0xFFFF;
        localListColumn.f = new byte[i11 + 2];
        System.arraycopy(this.Z, i3, localListColumn.f, 0, i11 + 2);
        localListColumn.b = ((l1 & 0xFFFFFFFF & 0x100) != 0L);
        i3 += i11 + 2;
      }
      if ((l1 & 0xFFFFFFFF & 0x400) != 0L)
      {
        int[] arrayOfInt3 = { i3 };
        localListColumn.e(a(this.Z, arrayOfInt3));
        i3 = arrayOfInt3[0];
      }
      if (this.Z[12] == 1)
      {
        int i12 = zc.a(this.Z, i3);
        i3 += 4;
        int i13 = zc.a(this.Z, i3);
        i3 += 4;
        long l2 = zc.d(this.Z, i3);
        i3 += 4;
        long l3 = zc.d(this.Z, i3);
        i3 += 4;
        int i14;
        if ((l3 & 0xFFFFFFFF & 0x10) != 0L) {
          switch (localListColumn.m)
          {
          case 1: 
          case 8: 
          case 11: 
            i14 = zc.e(this.Z, i3) & 0xFFFF;
            i3 += 2;
            i3 += (this.Z[(i3 + 2)] == 0 ? i14 + 3 : i14 * 2 + 3);
            break;
          case 2: 
          case 6: 
            i3 += 8;
            break;
          case 3: 
            i3 += 4;
            break;
          case 4: 
            i3 += 8;
            break;
          }
        }
        if ((l3 & 0xFFFFFFFF & 0x40) != 0L)
        {
          i14 = zc.e(this.Z, i3) & 0xFFFF;
          i3 += 2 + i14;
        }
        i3 += 4;
      }
      if (this.Z[12] != 3) {}
    }
  }
  
  private void U(zqj paramzqj)
    throws Exception
  {
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if (((this.W & 0xFFFF) != 2162) && ((this.W & 0xFFFF) != 2168)) {
        break;
      }
      T(paramzqj);
    }
    paramzqj.a(-2);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, Style paramStyle)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = paramStyle.e();
    int i1 = paramInt;
    long l1 = zc.d(paramArrayOfByte, i1);
    i1 += 4;
    int i2 = zc.e(paramArrayOfByte, i1);
    int i3 = (paramArrayOfByte[i1] & 0xFF & 0x1) != 0 ? 1 : 0;
    i1 += 2;
    if ((l1 & 0xFFFFFFFF) == 0L) {
      return i1;
    }
    int i4;
    if ((l1 & 0xFFFFFFFF & 0x2000000) != 0L) {
      if (i3 == 0)
      {
        i4 = paramArrayOfByte[(i1 + 1)] & 0xFF;
        for (int i5 = 0; i5 < localWorksheetCollection.B().size(); i5++)
        {
          zzw localzzw = (zzw)localWorksheetCollection.B().get(i5);
          if (localzzw.b() == i4)
          {
            if ((localzzw.a() == null) || ("".equals(localzzw.a()))) {
              break;
            }
            paramStyle.b(localzzw.a());
            break;
          }
        }
        paramStyle.f(i4);
        paramStyle.b(24);
        i1 += 2;
      }
      else
      {
        i4 = zc.e(paramArrayOfByte, i1) & 0xFFFF;
        i1 += 2;
        if (i4 > 0)
        {
          int[] arrayOfInt = { i1 };
          paramStyle.b(a(paramArrayOfByte, arrayOfInt));
          i1 = arrayOfInt[0];
        }
      }
    }
    int i6;
    int i8;
    int i9;
    int i10;
    if ((l1 & 0xFFFFFFFF & 0x4000000) != 0L)
    {
      i4 = zc.a(paramArrayOfByte, i1 + 92) == 0 ? 1 : 0;
      i6 = zc.a(paramArrayOfByte, i1 + 96) == 0 ? 1 : 0;
      int i7 = zc.a(paramArrayOfByte, i1 + 100) == 0 ? 1 : 0;
      i8 = (paramArrayOfByte[(i1 + 88)] & 0xFF & 0x2) == 0 ? 1 : 0;
      i9 = (paramArrayOfByte[(i1 + 88)] & 0xFF & 0x80) == 0 ? 1 : 0;
      i10 = zc.a(paramArrayOfByte, i1 + 64);
      if (i10 != -1) {
        paramStyle.getFont().setSize((short)(i10 / 20));
      }
      if (i8 != 0) {
        paramStyle.getFont().setItalic((paramArrayOfByte[(i1 + 68)] & 0xFF & 0x2) != 0);
      }
      if (i7 != 0) {
        paramStyle.getFont().b(zc.e(paramArrayOfByte, i1 + 72) & 0xFFFF);
      }
      if (i9 != 0) {
        paramStyle.getFont().setStrikeout((paramArrayOfByte[(i1 + 68)] & 0xFF & 0x80) != 0);
      }
      if (i4 != 0)
      {
        int i11 = zc.b(paramArrayOfByte, i1 + 74);
        switch (i11)
        {
        case 1: 
          paramStyle.getFont().setSuperscript(true);
          break;
        case 2: 
          paramStyle.getFont().setSubscript(true);
          break;
        }
      }
      if (i6 != 0) {
        switch (zc.b(paramArrayOfByte, i1 + 76))
        {
        case 0: 
          paramStyle.getFont().setUnderline(0);
          break;
        case 1: 
          paramStyle.getFont().setUnderline(1);
          break;
        case 2: 
          paramStyle.getFont().setUnderline(2);
          break;
        case 33: 
          paramStyle.getFont().setUnderline(3);
          break;
        case 34: 
          paramStyle.getFont().setUnderline(4);
          break;
        }
      }
      i10 = zc.a(paramArrayOfByte, i1 + 80);
      if (i10 != -1) {
        paramStyle.getFont().setColor(localWorksheetCollection.o().e(i10));
      }
      i1 += 118;
    }
    if ((l1 & 0xFFFFFFFF & 0x8000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 1L) == 0L) {
        paramStyle.setHorizontalAlignment(ztr.a(paramArrayOfByte[i1] & 0xFF & 0x7, false));
      }
      if ((l1 & 0xFFFFFFFF & 0x2) == 0L) {
        paramStyle.setVerticalAlignment(ztr.a((paramArrayOfByte[i1] & 0xFF & 0x70) >> 4, true));
      }
      if ((l1 & 0xFFFFFFFF & 0x4) == 0L) {
        paramStyle.setTextWrapped((paramArrayOfByte[i1] & 0xFF & 0x8) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x8) == 0L) {
        paramStyle.setRotationAngle(paramArrayOfByte[(i1 + 1)]);
      }
      if ((l1 & 0xFFFFFFFF & 0x10) == 0L) {
        paramStyle.setJustifyDistributed((paramArrayOfByte[i1] & 0xFF & 0x80) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x20) == 0L)
      {
        i4 = paramArrayOfByte[(i1 + 2)] & 0xFF & 0xF;
        i6 = paramArrayOfByte[(i1 + 4)] & 0xFF;
        if (i6 != 255) {
          paramStyle.setIndentLevel(i6);
        } else {
          paramStyle.setIndentLevel(i4);
        }
      }
      if ((l1 & 0xFFFFFFFF & 0x40) == 0L) {
        paramStyle.setShrinkToFit((paramArrayOfByte[(i1 + 2)] & 0xFF & 0x10) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x80) == 0L) {
        paramStyle.j((paramArrayOfByte[(i1 + 2)] & 0xFF & 0x20) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x80000000) != 0L) {
        switch ((paramArrayOfByte[(i1 + 2)] & 0xFF & 0xC0) >> 2)
        {
        case 0: 
          paramStyle.setTextDirection(0);
          break;
        case 1: 
          paramStyle.setTextDirection(1);
          break;
        case 2: 
          paramStyle.setTextDirection(2);
          break;
        }
      }
      i1 += 8;
    }
    if ((l1 & 0xFFFFFFFF & 0x10000000) != 0L)
    {
      if ((i2 & 0xFFFF & 0x4) != 0) {
        paramStyle.getBorders().a = true;
      }
      i4 = zc.e(paramArrayOfByte, i1);
      long l2 = zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF;
      i8 = 0;
      i9 = 0;
      i10 = 0;
      if ((l1 & 0xFFFFFFFF & 0x400) == 0L)
      {
        paramStyle.getBorders().getByBorderType(1).setLineStyle(i4 & 0xFFFF & 0xF);
        i8 = (int)(l2 & 0xFFFFFFFF & 0x3F);
        paramStyle.getBorders().getByBorderType(1).setColor(localWorksheetCollection.o().e(i8));
      }
      if ((l1 & 0xFFFFFFFF & 0x800) == 0L)
      {
        paramStyle.getBorders().getByBorderType(2).setLineStyle((i4 & 0xFFFF & 0xF0) >> 4);
        i8 = (int)((l2 & 0xFFFFFFFF & 0x3F8) >> 7);
        paramStyle.getBorders().getByBorderType(2).setColor(localWorksheetCollection.o().e(i8));
      }
      i9 = (l2 & 0xFFFFFFFF & 0x4000) != 0L ? 1 : 0;
      i10 = (l2 & 0xFFFFFFFF & 0x8000) != 0L ? 1 : 0;
      l2 = zc.d(paramArrayOfByte, i1 + 4);
      if ((l1 & 0xFFFFFFFF & 0x1000) == 0L)
      {
        paramStyle.getBorders().getByBorderType(4).setLineStyle((i4 & 0xFFFF & 0xF00) >> 8);
        i8 = (int)(l2 & 0xFFFFFFFF & 0x3F);
        paramStyle.getBorders().getByBorderType(4).setColor(localWorksheetCollection.o().e(i8));
      }
      if ((l1 & 0xFFFFFFFF & 0x2000) == 0L)
      {
        paramStyle.getBorders().getByBorderType(8).setLineStyle((i4 & 0xFFFF & 0xF000) >> 12);
        i8 = (int)((l2 & 0xFFFFFFFF & 0x3F8) >> 7);
        paramStyle.getBorders().getByBorderType(8).setColor(localWorksheetCollection.o().e(i8));
      }
      if (((l1 & 0xFFFFFFFF & 0x4000) == 0L) && (i9 != 0))
      {
        paramStyle.getBorders().getByBorderType(16).setLineStyle((int)((l2 & 0xFFFFFFFF & 0x1E00000) >> 21));
        i8 = (int)((l2 & 0xFFFFFFFF & 0x1FC00) >> 14);
        paramStyle.getBorders().getByBorderType(16).setColor(localWorksheetCollection.o().e(i8));
      }
      if (((l1 & 0xFFFFFFFF & 0x8000) == 0L) && (i10 != 0))
      {
        paramStyle.getBorders().getByBorderType(32).setLineStyle((int)((l2 & 0xFFFFFFFF & 0x1E00000) >> 21));
        i8 = (int)((l2 & 0xFFFFFFFF & 0x1FC00) >> 14);
        paramStyle.getBorders().getByBorderType(32).setColor(localWorksheetCollection.o().e(i8));
      }
      i1 += 8;
    }
    if ((l1 & 0xFFFFFFFF & 0x20000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 0x10000) == 0L) {
        paramStyle.setPattern((paramArrayOfByte[(i1 + 1)] & 0xFF) >> 2);
      }
      i4 = 0;
      if ((l1 & 0xFFFFFFFF & 0x20000) == 0L)
      {
        i4 = paramArrayOfByte[(i1 + 2)] & 0xFF & 0x7F;
        paramStyle.setForegroundColor(localWorksheetCollection.o().e(i4));
      }
      if ((l1 & 0xFFFFFFFF & 0x40000) == 0L)
      {
        i4 = (zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF & 0x3F80) >> 7;
        paramStyle.setBackgroundColor(localWorksheetCollection.o().e(i4));
      }
      i1 += 4;
    }
    if ((l1 & 0xFFFFFFFF & 0x40000000) != 0L)
    {
      if ((l1 & 0xFFFFFFFF & 0x100) == 0L) {
        paramStyle.setLocked((paramArrayOfByte[i1] & 0xFF & 0x1) != 0);
      }
      if ((l1 & 0xFFFFFFFF & 0x200) == 0L) {
        paramStyle.setFormulaHidden((paramArrayOfByte[i1] & 0xFF & 0x2) != 0);
      }
      i1 += 2;
    }
    return i1;
  }
  
  private static String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
    throws Exception
  {
    int i1 = zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF;
    String str = null;
    if (paramArrayOfByte[(paramArrayOfInt[0] + 2)] == 0)
    {
      str = Encoding.getASCII().a(paramArrayOfByte, paramArrayOfInt[0] + 3, i1);
      paramArrayOfInt[0] += 3 + i1;
    }
    else
    {
      str = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0] + 3, i1 * 2);
      paramArrayOfInt[0] += 3 + i1 * 2;
    }
    return str;
  }
  
  private byte[] V(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    byte[] arrayOfByte;
    for (Object localObject = this.Z;; localObject = arrayOfByte)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2165) {
        break;
      }
      a(paramzqj);
      arrayOfByte = new byte[localObject.length + (this.X & 0xFFFF) - 12];
      System.arraycopy(localObject, 0, arrayOfByte, 0, localObject.length);
      System.arraycopy(this.Z, 12, arrayOfByte, localObject.length, (this.X & 0xFFFF) - 12);
    }
    paramzqj.a(-2);
    return (byte[])localObject;
  }
  
  private void a(PageSetup paramPageSetup, zqj paramzqj, byte[] paramArrayOfByte)
    throws Exception
  {
    a(paramzqj);
    int i1 = 12;
    if (i1 + 16 < (this.X & 0xFFFF))
    {
      i2 = 1;
      if (paramArrayOfByte == null) {
        for (i3 = 0; i3 < 16; i3++) {
          if (this.Z[(i1 + i3)] != 0)
          {
            i2 = 0;
            break;
          }
        }
      } else {
        for (i3 = 0; i3 < 16; i3++) {
          if (this.Z[(i1 + i3)] != paramArrayOfByte[i3])
          {
            i2 = 0;
            break;
          }
        }
      }
      if (i2 != 0) {
        i1 += 16;
      }
    }
    paramPageSetup.a(this.Z[i1]);
    i1 += 2;
    int i2 = zc.e(this.Z, i1) & 0xFFFF;
    int i3 = zc.e(this.Z, i1 + 2) & 0xFFFF;
    int i4 = zc.e(this.Z, i1 + 4) & 0xFFFF;
    int i5 = zc.e(this.Z, i1 + 6) & 0xFFFF;
    i1 += 8;
    String str;
    if (i2 != 0)
    {
      i2 = zc.e(this.Z, i1) & 0xFFFF;
      i1 += 2;
      str = null;
      if (this.Z[i1] == 0)
      {
        str = Encoding.getASCII().a(this.Z, i1 + 1, i2);
        i1 += 1 + i2;
      }
      else
      {
        str = Encoding.getUnicode().a(this.Z, i1 + 1, i2 * 2);
        i1 += 1 + i2 * 2;
      }
      paramPageSetup.a = new String[3];
      PageSetup.a(str, paramPageSetup.a);
    }
    if (i3 != 0)
    {
      i3 = zc.e(this.Z, i1) & 0xFFFF;
      i1 += 2;
      str = null;
      if (this.Z[i1] == 0)
      {
        str = Encoding.getASCII().a(this.Z, i1 + 1, i3);
        i1 += 1 + i3;
      }
      else
      {
        str = Encoding.getUnicode().a(this.Z, i1 + 1, i3 * 2);
        i1 += 1 + i3 * 2;
      }
      paramPageSetup.b = new String[3];
      PageSetup.a(str, paramPageSetup.b);
    }
    if (i4 != 0)
    {
      i4 = zc.e(this.Z, i1) & 0xFFFF;
      i1 += 2;
      str = null;
      if (this.Z[i1] == 0)
      {
        str = Encoding.getASCII().a(this.Z, i1 + 1, i4);
        i1 += 1 + i4;
      }
      else
      {
        str = Encoding.getUnicode().a(this.Z, i1 + 1, i4 * 2);
        i1 += 1 + i4 * 2;
      }
      paramPageSetup.d = new String[3];
      PageSetup.a(str, paramPageSetup.d);
    }
    if (i5 != 0)
    {
      i5 = zc.e(this.Z, i1) & 0xFFFF;
      i1 += 2;
      str = null;
      if (this.Z[i1] == 0)
      {
        str = Encoding.getASCII().a(this.Z, i1 + 1, i5);
        i1 += 1 + i5;
      }
      else
      {
        str = Encoding.getUnicode().a(this.Z, i1 + 1, i5 * 2);
        i1 += 1 + i5 * 2;
      }
      paramPageSetup.c = new String[3];
      PageSetup.a(str, paramPageSetup.c);
    }
  }
  
  private void W(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.a(this.Z, 2);
    int i2 = this.Z[6] & 0xFF;
    if (i2 + 7 > (this.X & 0xFFFF)) {
      return;
    }
    String str1 = Encoding.getASCII().a(this.Z, 7, i2);
    int i3 = 7 + i2;
    int i4 = (this.X & 0xFFFF) - i3;
    String str2 = "";
    if (i1 > i4)
    {
      byte[] arrayOfByte = new byte[i1];
      System.arraycopy(this.Z, i3, arrayOfByte, 0, i4);
      i3 = i4;
      while (i3 < i1)
      {
        this.W = paramzqj.b(this.Y);
        if (((this.W & 0xFFFF) != 1084) && ((this.W & 0xFFFF) != 60)) {
          break;
        }
        a(paramzqj);
        System.arraycopy(this.Z, 0, arrayOfByte, i3, this.X & 0xFFFF);
        i3 += (this.X & 0xFFFF);
      }
      str2 = Encoding.getUnicode().a(arrayOfByte, 0, i1);
    }
    else
    {
      str2 = Encoding.getUnicode().a(this.Z, i3, i1);
    }
    this.j.getCustomProperties().add(str1, str2);
  }
  
  private int a(int paramInt, AutoFilter paramAutoFilter)
  {
    zxm localzxm = null;
    int i1 = paramInt + 24;
    try
    {
      int i2 = zc.e(this.Z, paramInt + 0) & 0xFFFF;
      localzxm = new zxm(i2);
      localzxm.b = zc.e(this.Z, paramInt + 2);
      paramInt += 4;
      int i3 = 0;
      int i4 = 0;
      int i5;
      switch (this.Z[paramInt])
      {
      case 0: 
        i3 = 1;
        break;
      case 2: 
        localzxm.f = Double.valueOf(zayi.a(this.Z, paramInt + 2));
        break;
      case 4: 
        localzxm.f = Double.valueOf(zc.f(this.Z, paramInt + 2));
        break;
      case 6: 
        i5 = this.Z[(paramInt + 6)] & 0xFF;
        if (this.Z[i1] == 0)
        {
          localzxm.f = Encoding.getASCII().a(this.Z, i1 + 1, i5);
          i1 += 1 + i5;
        }
        else
        {
          localzxm.f = Encoding.getUnicode().a(this.Z, i1 + 1, i5 * 2);
          i1 += 1 + i5 * 2;
        }
        break;
      case 8: 
        if (this.Z[(paramInt + 3)] == 1) {
          switch (this.Z[(paramInt + 2)])
          {
          case 0: 
            localzxm.f = "#NULL!";
            break;
          case 7: 
            localzxm.f = "#DIV/0!";
            break;
          case 15: 
            localzxm.f = "#VALUE!";
            break;
          case 23: 
            localzxm.f = "#REF!";
            break;
          case 29: 
            localzxm.f = "#NAME?";
            break;
          case 36: 
            localzxm.f = "#NUM!";
            break;
          case 42: 
            localzxm.f = "#N/A";
          }
        } else {
          localzxm.f = Boolean.valueOf(this.Z[(paramInt + 2)] == 1);
        }
        break;
      case 12: 
        localzxm.c = 2;
        i4 = 1;
        break;
      case 13: 
        localzxm.c = 4;
        i4 = 1;
      }
      if ((i3 == 0) && (i4 == 0)) {
        switch (this.Z[(paramInt + 1)])
        {
        case 0: 
          localzxm.c = 6;
          break;
        case 1: 
          localzxm.c = 1;
          break;
        case 2: 
          localzxm.c = 2;
          break;
        case 3: 
          localzxm.c = 0;
          break;
        case 4: 
          localzxm.c = 3;
          break;
        case 5: 
          localzxm.c = 4;
          break;
        case 6: 
          localzxm.c = 5;
        }
      }
      i3 = 0;
      i4 = 0;
      paramInt += 10;
      switch (this.Z[paramInt])
      {
      case 0: 
        i3 = 1;
        break;
      case 2: 
        localzxm.e = Double.valueOf(zayi.a(this.Z, paramInt + 2));
        break;
      case 4: 
        localzxm.e = Double.valueOf(zc.f(this.Z, paramInt + 2));
        break;
      case 6: 
        i5 = this.Z[(paramInt + 6)] & 0xFF;
        if (this.Z[i1] == 0)
        {
          localzxm.e = Encoding.getASCII().a(this.Z, i1 + 1, i5);
          i1 += 1 + i5;
        }
        else
        {
          localzxm.e = Encoding.getUnicode().a(this.Z, i1 + 1, i5 * 2);
          i1 += 1 + i5 * 2;
        }
        break;
      case 8: 
        if (this.Z[(paramInt + 3)] == 1) {
          switch (this.Z[(paramInt + 2)])
          {
          case 0: 
            localzxm.e = "#NULL!";
            break;
          case 7: 
            localzxm.e = "#DIV/0!";
            break;
          case 15: 
            localzxm.e = "#VALUE!";
            break;
          case 23: 
            localzxm.e = "#REF!";
            break;
          case 29: 
            localzxm.e = "#NAME?";
            break;
          case 36: 
            localzxm.e = "#NUM!";
            break;
          case 42: 
            localzxm.e = "#N/A";
          }
        } else {
          localzxm.e = Boolean.valueOf(this.Z[(paramInt + 2)] == 1);
        }
        break;
      case 12: 
        localzxm.d = 2;
        i4 = 1;
        break;
      case 13: 
        localzxm.d = 4;
        i4 = 1;
      }
      if ((i3 == 0) && (i4 == 0)) {
        switch (this.Z[(paramInt + 1)])
        {
        case 0: 
          localzxm.d = 6;
          break;
        case 1: 
          localzxm.d = 1;
          break;
        case 2: 
          localzxm.d = 2;
          break;
        case 3: 
          localzxm.d = 0;
          break;
        case 4: 
          localzxm.d = 3;
          break;
        case 5: 
          localzxm.d = 4;
          break;
        case 6: 
          localzxm.d = 5;
        }
      }
    }
    finally
    {
      a(paramAutoFilter, localzxm);
    }
    return i1;
  }
  
  private static void a(AutoFilter paramAutoFilter, zxm paramzxm)
  {
    FilterColumn localFilterColumn = paramzxm.a(paramAutoFilter.c);
    paramAutoFilter.c.a(localFilterColumn);
    paramAutoFilter.b = false;
  }
  
  private void X(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    int i1 = zc.e(this.Z, 12) & 0xFFFF;
    AutoFilter localAutoFilter = null;
    int i2 = zc.a(this.Z, 40);
    if ((this.Z[34] == 8) || (i2 == -1))
    {
      localAutoFilter = this.j.getAutoFilter();
    }
    else
    {
      localObject = this.j.getListObjects().a(i2);
      if (localObject == null) {
        return;
      }
      localAutoFilter = ((ListObject)localObject).getAutoFilter();
    }
    Object localObject = new FilterColumn(localAutoFilter.getFilterColumns(), i1);
    ((FilterColumn)localObject).a(zc.a(this.Z, 14) == 1);
    int i3 = zc.a(this.Z, 18);
    int i4 = zc.a(this.Z, 22);
    if ((i3 != 0) || (i4 != 0)) {
      return;
    }
    int i5 = zc.a(this.Z, 26);
    int i6 = zc.a(this.Z, 30);
    MultipleFilterCollection localMultipleFilterCollection = new MultipleFilterCollection();
    for (int i7 = 0; i7 < i5; i7++)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2175)
      {
        paramzqj.a(-2);
        return;
      }
      a(paramzqj);
      switch (this.Z[12])
      {
      case 6: 
        if (this.Z[13] == 2) {
          if (this.Z[22] == 0) {
            localMultipleFilterCollection.b(Encoding.getASCII().a(this.Z, 23, this.Z[14] & 0xFF));
          } else {
            localMultipleFilterCollection.b(Encoding.getUnicode().a(this.Z, 23, (this.Z[14] & 0xFF) * 2));
          }
        }
        break;
      case 12: 
        localMultipleFilterCollection.setMatchBlank(true);
      }
    }
    for (i7 = 0; i7 < i6; i7++)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2175)
      {
        paramzqj.a(-2);
        return;
      }
      a(paramzqj);
      DateTimeGroupItem localDateTimeGroupItem = new DateTimeGroupItem();
      localDateTimeGroupItem.setYear(zc.b(this.Z, 12));
      localDateTimeGroupItem.setMonth(zc.b(this.Z, 14));
      localDateTimeGroupItem.setDay(zc.a(this.Z, 16));
      localDateTimeGroupItem.setHour(zc.b(this.Z, 20));
      localDateTimeGroupItem.setMinute(zc.b(this.Z, 22));
      localDateTimeGroupItem.setSecond(zc.b(this.Z, 24));
      switch (this.Z[32])
      {
      case 1: 
        localDateTimeGroupItem.setDateTimeGroupingType(3);
        break;
      case 2: 
        localDateTimeGroupItem.setDateTimeGroupingType(0);
        break;
      case 3: 
        localDateTimeGroupItem.setDateTimeGroupingType(1);
        break;
      case 4: 
        localDateTimeGroupItem.setDateTimeGroupingType(2);
        break;
      case 5: 
        localDateTimeGroupItem.setDateTimeGroupingType(4);
        break;
      default: 
        localDateTimeGroupItem.setDateTimeGroupingType(5);
      }
      localMultipleFilterCollection.a(localDateTimeGroupItem);
    }
    ((FilterColumn)localObject).setFilter(localMultipleFilterCollection);
    ((FilterColumn)localObject).setFilterType(3);
    localAutoFilter.c.a((FilterColumn)localObject);
  }
  
  private void Y(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x200) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 6) & 0xFFFF;
    Object localObject1 = null;
    Object localObject2 = this.j.getShapes().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Shape localShape = (Shape)((Iterator)localObject2).next();
      if (localShape.O() == i1)
      {
        localObject1 = localShape;
        break;
      }
    }
    if ((localObject1 == null) || (!(localObject1 instanceof CommentShape))) {
      return;
    }
    localObject2 = ((CommentShape)localObject1).a();
    ((Comment)localObject2).a(zc.e(this.Z, 0) & 0xFFFF);
    ((Comment)localObject2).b(this.Z[2] & 0xFF);
    this.j.getComments().a((Comment)localObject2);
    ((Comment)localObject2).a(true);
    int i2 = zc.e(this.Z, 8) & 0xFFFF;
    if (this.Z[10] == 0) {
      ((Comment)localObject2).setAuthor(Encoding.getASCII().a(this.Z, 11, i2));
    } else {
      ((Comment)localObject2).setAuthor(Encoding.getUnicode().a(this.Z, 11, i2 * 2));
    }
  }
  
  private void Z(zqj paramzqj)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    paramzqj.a(-2);
    e(paramzqj);
    zf.a(localArrayList, this.Z);
    int i1 = this.Z.length - 12;
    int i2 = zc.a(this.Z, 8);
    i2 -= i1;
    while (i2 > 0)
    {
      e(paramzqj);
      int i3 = zc.b(this.Z, 0);
      if ((i3 != 233) && (i3 != 60)) {
        throw new IOException("File is corrupted");
      }
      zf.a(localArrayList, this.Z);
      i2 -= this.Z.length - 4;
    }
    this.j.b(localArrayList);
  }
  
  private void aa(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    if (this.Z[2] == 0) {
      this.j.p = zct.a(this.Z, 3, this.Z.length - 3);
    } else {
      this.j.p = Encoding.getUnicode().a(this.Z, 3, this.Z.length - 3);
    }
  }
  
  private void ab(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x2000) == 0)
    {
      h(paramzqj);
      return;
    }
    zaxh localzaxh = new zaxh();
    localzaxh.a(this.f, this.j, this, paramzqj);
  }
  
  private void a(zqj paramzqj, zbew paramzbew)
    throws Exception
  {
    if (this.a == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    zbev localzbev = new zbev(this.Z[0] & 0xFF);
    localzbev.a(this.Z[0]);
    localzbev.a(zc.e(this.Z, 1));
    localzbev.b(zc.b(this.Z, 3));
    localzbev.c(zc.e(this.Z, 5));
    for (int i1 = 9; i1 + 6 <= this.Z.length; i1 += 6)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = (zc.e(this.Z, i1) & 0xFFFF);
      localCellArea.EndRow = (zc.e(this.Z, i1 + 2) & 0xFFFF);
      localCellArea.StartColumn = (this.Z[(i1 + 4)] & 0xFF);
      localCellArea.EndColumn = (this.Z[(i1 + 5)] & 0xFF);
      zf.a(localzbev.b(), localCellArea);
    }
    zf.a(paramzbew, localzbev);
  }
  
  private void ac(zqj paramzqj)
    throws Exception
  {
    paramzqj.a(-2);
    if (this.j.p() == null) {
      this.j.a(new ArrayList());
    }
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      if (((this.W & 0xFFFF) == 442) || ((this.W & 0xFFFF) == 10) || ((this.W & 0xFFFF) == 239) || ((this.W & 0xFFFF) == 432) || ((this.W & 0xFFFF) == 440))
      {
        paramzqj.a(-2);
        break;
      }
      this.X = paramzqj.b(this.Y);
      paramzqj.a(-4);
      this.Z = new byte[(this.X & 0xFFFF) + 4];
      paramzqj.a(this.Z);
      zf.a(this.j.p(), this.Z);
    }
  }
  
  private void ad(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    this.j.b(zc.e(this.Z, 0) & 0xFFFF & 0x3FF);
    if ((this.Z[1] & 0xFF & 0x8) != 0) {
      this.j.n = 1;
    }
    this.j.setFirstVisibleRow(zc.e(this.Z, 2));
    this.j.setFirstVisibleColumn(this.Z[4] & 0xFF & 0xFF);
    this.j.d(this.Z[6]);
    if ((this.X & 0xFFFF) > 10)
    {
      int i1 = zc.e(this.Z, 10) & 0xFFFF;
      if (i1 != 0) {
        this.j.y()[1] = i1;
      }
      i1 = zc.e(this.Z, 12) & 0xFFFF;
      if (i1 != 0) {
        this.j.y()[0] = i1;
      }
    }
  }
  
  private void ae(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    zoj localzoj = new zoj();
    this.f.n().a(localzoj);
    int i1 = 4;
    localzoj.a = zc.b(this.Z, i1);
    i1 += 4;
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(this.Z, i1, arrayOfByte, 0, 16);
    localzoj.b = new com.aspose.cells.b.a.zh(arrayOfByte);
    i1 += 16;
    localzoj.c = zc.a(this.Z, i1);
    localzoj.d = zc.a(this.Z, i1 + 4);
    localzoj.e = zc.a(this.Z, i1 + 8);
    localzoj.f = zc.a(this.Z, i1 + 12);
    i1 += 16;
    localzoj.h = zc.b(this.Z, i1);
    i1 += 2;
    int i2 = zc.b(this.Z, i1);
    localzoj.a((i2 & 0x1) != 0);
    localzoj.b((i2 & 0x2) != 0);
    switch (i2 & 0xC)
    {
    case 0: 
      localzoj.a(2);
      break;
    case 4: 
      localzoj.a(1);
      break;
    case 8: 
      localzoj.a(0);
    }
    localzoj.n((i2 & 0x10) != 0);
    localzoj.c((i2 & 0x20) != 0);
    localzoj.d((i2 & 0x40) != 0);
    localzoj.m((i2 & 0x80) != 0);
    switch (i2 & 0x300)
    {
    case 0: 
      localzoj.b(0);
      break;
    case 256: 
      localzoj.b(2);
      break;
    case 512: 
      localzoj.b(1);
    }
    localzoj.e((i2 & 0x400) != 0);
    localzoj.f((i2 & 0x800) != 0);
    localzoj.g((i2 & 0x1000) != 0);
    localzoj.h((i2 & 0x2000) != 0);
    localzoj.i((i2 & 0x4000) != 0);
    localzoj.j((i2 & 0x8000) != 0);
    i1 += 4;
    localzoj.k((this.Z[i1] & 0xFF & 0x1) != 0);
    localzoj.l((this.Z[i1] & 0xFF & 0x2) != 0);
    i1 += 2;
    localzoj.i = (zc.e(this.Z, i1) & 0xFFFF);
    i1 += 2;
    localzoj.j = zct.a(this.Z, i1);
  }
  
  private void af(zqj paramzqj)
    throws Exception
  {
    a(paramzqj);
    zoh localzoh = new zoh(this.j);
    this.j.K().a(localzoh);
    byte[] arrayOfByte1 = new byte[16];
    System.arraycopy(this.Z, 0, arrayOfByte1, 0, 16);
    localzoh.n = new com.aspose.cells.b.a.zh(arrayOfByte1);
    int i1 = 16;
    localzoh.q = zc.b(this.Z, i1);
    i1 += 4;
    localzoh.c(zc.b(this.Z, i1));
    i1 += 4;
    localzoh.f(zc.b(this.Z, i1));
    i1 += 4;
    localzoh.c().a(this.Z[i1]);
    i1 += 4;
    int i2 = zc.a(this.Z, i1);
    localzoh.d((i2 & 0x1) != 0);
    localzoh.l((i2 & 0x2) != 0);
    localzoh.m((i2 & 0x4) != 0);
    localzoh.n((i2 & 0x8) != 0);
    localzoh.r((i2 & 0x10) != 0);
    localzoh.q((i2 & 0x20) != 0);
    localzoh.e().setCenterHorizontally((i2 & 0x40) != 0);
    localzoh.e().setCenterVertically((i2 & 0x80) != 0);
    localzoh.e().setPrintHeadings((i2 & 0x100) != 0);
    localzoh.e().setPrintGridlines((i2 & 0x200) != 0);
    localzoh.e().setPercentScale((i2 & 0x400) != 0);
    localzoh.h((i2 & 0x800) != 0);
    localzoh.i((i2 & 0x1000) != 0);
    localzoh.c((i2 & 0x2000) != 0);
    localzoh.e((i2 & 0x4000) != 0);
    localzoh.o((i2 & 0x8000) != 0);
    localzoh.p((i2 & 0x10000) == 0);
    localzoh.k((i2 & 0x20000) != 0);
    localzoh.j((i2 & 0x40000) != 0);
    localzoh.a((i2 & 0x80000) != 0);
    localzoh.b((i2 & 0x200000) != 0);
    localzoh.g((i2 & 0x2000000) != 0);
    localzoh.d((i2 & 0x4000000) == 0 ? 0 : 1);
    if ((i2 & 0x8000000) != 0) {
      localzoh.d(2);
    }
    localzoh.s((i2 & 0x20000000) != 0);
    i1 += 4;
    localzoh.p.StartRow = (zc.e(this.Z, i1) & 0xFFFF);
    localzoh.p.EndRow = (zc.e(this.Z, i1 + 2) & 0xFFFF);
    localzoh.p.StartColumn = zc.b(this.Z, i1 + 4);
    localzoh.p.EndColumn = zc.b(this.Z, i1 + 6);
    i1 += 8;
    localzoh.e = zc.f(this.Z, i1);
    localzoh.f = zc.f(this.Z, i1 + 8);
    i1 += 16;
    if (i1 < this.Z.length)
    {
      localzoh.g = true;
      localzoh.c().setFirstVisibleColumnOfRightPane(zc.e(this.Z, i1));
      localzoh.c().setFirstVisibleRowOfBottomPane(zc.e(this.Z, i1 + 2));
    }
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      double d1;
      int i5;
      switch (this.W)
      {
      case 20: 
        a(paramzqj);
        if ((this.Z != null) && (this.Z.length != 0)) {
          localzoh.e().b(this.Z);
        }
        break;
      case 21: 
        a(paramzqj);
        if ((this.Z != null) && (this.Z.length != 0)) {
          localzoh.e().c(this.Z);
        }
        break;
      case 26: 
        a(paramzqj, localzoh.g());
        break;
      case 27: 
        a(paramzqj, localzoh.f());
        break;
      case 29: 
        a(paramzqj, localzoh.d());
        break;
      case 38: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        localzoh.e().setLeftMarginInch(d1);
        break;
      case 39: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        localzoh.e().setRightMarginInch(d1);
        break;
      case 40: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        localzoh.e().setTopMarginInch(d1);
        break;
      case 41: 
        a(paramzqj);
        d1 = zc.f(this.Z, 0);
        if ((d1 < 0.0D) || (d1 > 49.0D)) {
          d1 = 0.0D;
        }
        localzoh.e().setBottomMarginInch(d1);
        break;
      case 42: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          localzoh.e().setPrintHeadings(false);
        } else {
          localzoh.e().setPrintHeadings(true);
        }
        break;
      case 43: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          localzoh.e().setPrintGridlines(false);
        } else {
          localzoh.e().setPrintGridlines(true);
        }
        break;
      case 77: 
        this.X = paramzqj.b(this.Y);
        int i3 = paramzqj.b(this.Y) & 0xFFFF;
        if (i3 != 0)
        {
          paramzqj.a((this.X & 0xFFFF) - 2);
        }
        else
        {
          byte[] arrayOfByte2 = new byte[(this.X & 0xFFFF) - 2];
          paramzqj.a(arrayOfByte2);
          ArrayList localArrayList = new ArrayList();
          zf.a(localArrayList, arrayOfByte2);
          int i4 = arrayOfByte2.length;
          for (;;)
          {
            this.W = paramzqj.b(this.Y);
            if ((this.W & 0xFFFF) == 77)
            {
              this.X = paramzqj.b(this.Y);
              i3 = paramzqj.b(this.Y) & 0xFFFF;
              arrayOfByte2 = new byte[(this.X & 0xFFFF) - 2];
              paramzqj.a(arrayOfByte2);
              zf.a(localArrayList, arrayOfByte2);
              i4 += arrayOfByte2.length;
            }
            else
            {
              if ((this.W & 0xFFFF) != 60) {
                break;
              }
              a(paramzqj);
              zf.a(localArrayList, this.Z);
              i4 += (this.X & 0xFFFF);
            }
          }
          paramzqj.a(-2);
          byte[] arrayOfByte3 = new byte[i4];
          i4 = 0;
          for (i5 = 0; i5 < localArrayList.size(); i5++)
          {
            arrayOfByte2 = (byte[])localArrayList.get(i5);
            System.arraycopy(arrayOfByte2, 0, arrayOfByte3, i4, arrayOfByte2.length);
            i4 += arrayOfByte2.length;
          }
          localzoh.e().setPrinterSettings(arrayOfByte3);
        }
        break;
      case 129: 
        a(paramzqj);
        i5 = zc.b(this.Z, 0);
        if ((i5 & 0x100) == 0) {
          localzoh.e().setPercentScale(true);
        } else {
          localzoh.e().setPercentScale(false);
        }
        if ((i5 & 0x40) == 0) {
          localzoh.h().SummaryRowBelow = false;
        }
        if ((i5 & 0x80) == 0) {
          localzoh.h().SummaryColumnRight = false;
        }
        break;
      case 131: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          localzoh.e().setCenterHorizontally(false);
        } else {
          localzoh.e().setCenterHorizontally(true);
        }
        break;
      case 132: 
        a(paramzqj);
        if ((this.Z[0] == 0) && (this.Z[1] == 0)) {
          localzoh.e().setCenterVertically(false);
        } else {
          localzoh.e().setCenterVertically(true);
        }
        break;
      case 160: 
        a(paramzqj);
        int i6 = zc.e(this.Z, 0);
        int i7 = zc.e(this.Z, 2);
        localzoh.c((i6 & 0xFFFF) * 100 / (i7 & 0xFFFF));
        break;
      case 161: 
        if ((this.a & 0x8000) == 0)
        {
          h(paramzqj);
        }
        else
        {
          a(paramzqj);
          localzoh.e().a(this.Z);
          this.W = paramzqj.b(this.Y);
          if ((this.W & 0xFFFF) == 2204) {
            a(localzoh.e(), paramzqj, localzoh.n.a());
          } else {
            paramzqj.a(-2);
          }
        }
        break;
      case 2146: 
        a(paramzqj, localzoh);
        break;
      case 2150: 
        a(paramzqj, localzoh.e());
        break;
      case 65: 
        a(paramzqj, localzoh.c());
        break;
      case 2187: 
        b(paramzqj, localzoh);
        break;
      case 157: 
        a(paramzqj);
        String str = "Z_" + zw.a(zs.a(localzoh.n), "-", "_") + "_.wvu.FilterData";
        Name localName = this.f.getNames().a(str, this.j.getIndex());
        if (localName != null) {
          localzoh.b().a(localName);
        }
        break;
      case 158: 
        a(paramzqj);
        a(0, localzoh.b());
        break;
      case 427: 
        this.X = paramzqj.b(this.Y);
        paramzqj.a(this.X & 0xFFFF);
        return;
      default: 
        this.X = paramzqj.b(this.Y);
        paramzqj.a(this.X & 0xFFFF);
      }
    }
  }
  
  void e(zqj paramzqj)
    throws Exception
  {
    this.W = paramzqj.b(this.Y);
    a(paramzqj, this.W & 0xFFFF);
  }
  
  void a(zqj paramzqj, int paramInt)
    throws Exception
  {
    a(paramzqj);
    if ((this.Z != null) && (this.Z.length != 0))
    {
      byte[] arrayOfByte = new byte[this.Z.length + 4];
      System.arraycopy(zc.a(paramInt), 0, arrayOfByte, 0, 2);
      System.arraycopy(zc.a(this.Z.length), 0, arrayOfByte, 2, 2);
      System.arraycopy(this.Z, 0, arrayOfByte, 4, this.Z.length);
      this.Z = arrayOfByte;
    }
    else
    {
      this.Z = new byte[4];
      System.arraycopy(zc.a(paramInt), 0, this.Z, 0, 2);
    }
  }
  
  private void ag(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x800) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    ConditionalFormattingCollection localConditionalFormattingCollection = this.j.getConditionalFormattings();
    FormatConditionCollection localFormatConditionCollection = null;
    int i1 = localConditionalFormattingCollection.add();
    localFormatConditionCollection = localConditionalFormattingCollection.get(i1);
    int i2 = 12;
    int i3 = zc.e(this.Z, i2) & 0xFFFF;
    localFormatConditionCollection.c = ((this.Z[14] & 0xFF & 0x1) != 0);
    int i4 = (zc.e(this.Z, i2 + 2) & 0xFFFF) >> 1;
    this.S.put(Integer.valueOf(i4), Integer.valueOf(i1));
    i2 += 12;
    int i5 = Math.min(zc.e(this.Z, i2) & 0xFFFF, ((this.X & 0xFFFF) - i2 - 2) / 8);
    i2 += 2;
    Object localObject;
    for (int i6 = 0; i6 < i5; i6++)
    {
      localObject = new CellArea();
      ((CellArea)localObject).StartRow = (zc.e(this.Z, i2) & 0xFFFF);
      ((CellArea)localObject).EndRow = (zc.e(this.Z, i2 + 2) & 0xFFFF);
      ((CellArea)localObject).StartColumn = (zc.e(this.Z, i2 + 4) & 0xFFFF);
      ((CellArea)localObject).EndColumn = (zc.e(this.Z, i2 + 6) & 0xFFFF);
      zf.a(localFormatConditionCollection.b, localObject);
      i2 += 8;
    }
    for (i6 = 0; i6 < i3; i6++)
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2170)
      {
        paramzqj.a(-2);
        break;
      }
      localObject = new FormatCondition(localFormatConditionCollection);
      localFormatConditionCollection.a((FormatCondition)localObject);
      a(paramzqj, (FormatCondition)localObject);
    }
  }
  
  private int a(int paramInt1, Style paramStyle, int paramInt2)
    throws Exception
  {
    int i1 = paramInt1;
    int i2 = i1;
    i1 = a(this.Z, i1, paramStyle);
    int i3 = i1 - i2;
    if (paramInt2 == i3) {
      return i1;
    }
    i1 += 6;
    i3 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 2;
    int[] arrayOfInt = { i1 };
    zbzi localzbzi = a(this.Z, arrayOfInt, i3);
    i1 = arrayOfInt[0];
    localzbzi.b(paramStyle);
    return i1;
  }
  
  private int a(int paramInt, Style paramStyle)
    throws Exception
  {
    int i1 = paramInt;
    int i2 = zc.e(this.Z, i1) & 0xFFFF;
    int i3 = i2;
    int i4 = i1;
    i1 += 4;
    if (i2 == 0)
    {
      i1 += 2;
      return i1;
    }
    int i5 = i1;
    i1 = a(this.Z, i1, paramStyle);
    i2 -= i1 - i5;
    if (i2 == 0) {
      return i1;
    }
    i1 += 6;
    i2 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 2;
    int[] arrayOfInt = { i1 };
    zbzi localzbzi = a(this.Z, arrayOfInt, i2);
    i1 = arrayOfInt[0];
    localzbzi.b(paramStyle);
    if (i4 + 4 + i3 != i1) {
      i1 = i4 + 6 + i3;
    }
    return i1;
  }
  
  private void a(zqj paramzqj, FormatCondition paramFormatCondition)
    throws Exception
  {
    a(paramzqj);
    paramFormatCondition.b = ztr.c(this.Z[13]);
    int i1 = 18;
    i1 = a(i1, paramFormatCondition.getStyle());
    int i2 = zc.e(this.Z, 14) & 0xFFFF;
    byte[] arrayOfByte;
    if (i2 != 0)
    {
      arrayOfByte = new byte[i2 + 2];
      System.arraycopy(zc.a(i2), 0, arrayOfByte, 0, 2);
      System.arraycopy(this.Z, i1, arrayOfByte, 2, i2);
      paramFormatCondition.a(arrayOfByte);
    }
    i1 += i2;
    i2 = zc.e(this.Z, 16) & 0xFFFF;
    if (i2 != 0)
    {
      arrayOfByte = new byte[i2 + 2];
      System.arraycopy(zc.a(i2), 0, arrayOfByte, 0, 2);
      System.arraycopy(this.Z, i1, arrayOfByte, 2, i2);
      paramFormatCondition.b(arrayOfByte);
    }
    i1 += i2;
    i2 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 2 + i2;
    paramFormatCondition.setStopIfTrue((this.Z[i1] & 0xFF & 0x2) != 0);
    i1++;
    paramFormatCondition.setPriority(zc.e(this.Z, i1));
    i1 += 2;
    if (paramFormatCondition.getPriority() > paramFormatCondition.a.e.f()) {
      paramFormatCondition.a.e.a(paramFormatCondition.getPriority() + 1);
    }
    switch (this.Z[12])
    {
    case 1: 
      paramFormatCondition.c = 0;
      break;
    case 2: 
      paramFormatCondition.c = 1;
      break;
    }
    int i3 = zc.e(this.Z, i1) & 0xFFFF;
    i1 += 2;
    a(paramFormatCondition, i3, i1, true, this.Z[12] & 0xFF);
  }
  
  private void a(FormatCondition paramFormatCondition, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i1 = paramInt2;
    i1++;
    Object localObject1;
    int i5;
    switch (paramInt1)
    {
    case 0: 
      if (paramFormatCondition.c != 1) {
        paramFormatCondition.c = 0;
      }
      break;
    case 1: 
      paramFormatCondition.c = 1;
      break;
    case 2: 
      paramFormatCondition.c = 2;
      localObject1 = new ColorScale(this.e, paramFormatCondition);
      paramFormatCondition.a((ColorScale)localObject1);
      break;
    case 3: 
      paramFormatCondition.c = 3;
      localObject1 = new DataBar(this.e, paramFormatCondition);
      paramFormatCondition.a((DataBar)localObject1);
      break;
    case 4: 
      paramFormatCondition.c = 4;
      localObject1 = new IconSet(paramFormatCondition);
      paramFormatCondition.a((IconSet)localObject1);
      break;
    case 5: 
      paramFormatCondition.c = 5;
      localObject1 = new Top10();
      paramFormatCondition.a((Top10)localObject1);
      ((Top10)localObject1).setBottom((this.Z[i1] & 0xFF & 0x1) == 0);
      ((Top10)localObject1).setPercent((this.Z[i1] & 0xFF & 0x2) != 0);
      ((Top10)localObject1).setRank(zc.e(this.Z, i1 + 1));
      break;
    case 7: 
      paramFormatCondition.c = 6;
      break;
    case 8: 
      String str1;
      switch (this.Z[i1])
      {
      case 0: 
      case 1: 
        localObject1 = null;
        if (paramFormatCondition.a() != null)
        {
          str1 = paramFormatCondition.getFormula1();
          if (str1 != null)
          {
            String str2 = str1.toUpperCase();
            int i6 = str2.indexOf("SEARCH(");
            if (i6 != -1)
            {
              int i7 = zaap.a(str1.toCharArray(), ',', i6 + 6);
              if (i7 != -1) {
                localObject1 = "=" + str1.substring(i6 + 7, i6 + 7 + (i7 - (i6 + 7)));
              }
            }
          }
        }
        if (localObject1 != null)
        {
          paramFormatCondition.setText((String)localObject1);
          switch (this.Z[i1])
          {
          case 0: 
            paramFormatCondition.c = 8;
            break;
          case 1: 
            paramFormatCondition.c = 9;
          }
        }
        break;
      case 2: 
      case 3: 
        localObject1 = null;
        if (paramFormatCondition.a() != null)
        {
          str1 = paramFormatCondition.getFormula1();
          if (str1 != null)
          {
            i5 = str1.lastIndexOf("=");
            if (i5 > 1) {
              localObject1 = str1.substring(i5);
            }
          }
        }
        if (localObject1 != null)
        {
          paramFormatCondition.setText((String)localObject1);
          switch (this.Z[i1])
          {
          case 2: 
            paramFormatCondition.c = 10;
            break;
          case 3: 
            paramFormatCondition.c = 11;
          }
        }
        break;
      }
      break;
    case 9: 
      paramFormatCondition.c = 12;
      break;
    case 10: 
      paramFormatCondition.c = 13;
      break;
    case 11: 
      paramFormatCondition.c = 14;
      break;
    case 12: 
      paramFormatCondition.c = 15;
      break;
    case 15: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(0);
      break;
    case 16: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(2);
      break;
    case 17: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(1);
      break;
    case 18: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(3);
      break;
    case 19: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(5);
      break;
    case 20: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(6);
      break;
    case 21: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(7);
      break;
    case 22: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(9);
      break;
    case 23: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(8);
      break;
    case 24: 
      paramFormatCondition.c = 16;
      paramFormatCondition.setTimePeriod(4);
      break;
    case 25: 
      paramFormatCondition.c = 17;
      paramFormatCondition.getAboveAverage().setAboveAverage(true);
      paramFormatCondition.getAboveAverage().setEqualAverage(false);
      paramFormatCondition.getAboveAverage().setStdDev(zc.e(this.Z, i1));
      break;
    case 26: 
      paramFormatCondition.c = 17;
      paramFormatCondition.getAboveAverage().setAboveAverage(false);
      paramFormatCondition.getAboveAverage().setEqualAverage(false);
      paramFormatCondition.getAboveAverage().setStdDev(zc.e(this.Z, i1));
      break;
    case 27: 
      paramFormatCondition.c = 7;
      break;
    case 29: 
      paramFormatCondition.c = 17;
      paramFormatCondition.getAboveAverage().setAboveAverage(true);
      paramFormatCondition.getAboveAverage().setEqualAverage(true);
      paramFormatCondition.getAboveAverage().setStdDev(zc.e(this.Z, i1));
      break;
    case 30: 
      paramFormatCondition.c = 17;
      paramFormatCondition.getAboveAverage().setAboveAverage(false);
      paramFormatCondition.getAboveAverage().setEqualAverage(true);
      paramFormatCondition.getAboveAverage().setStdDev(zc.e(this.Z, i1));
      break;
    }
    i1 += 16;
    if (paramBoolean)
    {
      ConditionalFormattingValue localConditionalFormattingValue2;
      switch (paramInt3)
      {
      case 3: 
        localObject1 = null;
        if (paramFormatCondition.getType() != 2)
        {
          paramFormatCondition.c = 2;
          localObject1 = new ColorScale(this.e, paramFormatCondition);
          paramFormatCondition.a((ColorScale)localObject1);
        }
        else
        {
          localObject1 = paramFormatCondition.getColorScale();
        }
        int i3 = this.Z[(i1 + 3)] & 0xFF;
        i1 += 6;
        Object localObject2;
        for (i5 = 0; i5 < i3; i5++)
        {
          localObject2 = new ConditionalFormattingValue(paramFormatCondition);
          i1 = a(i1, (ConditionalFormattingValue)localObject2);
          if (i5 == 0) {
            ((ColorScale)localObject1).a = ((ConditionalFormattingValue)localObject2);
          } else if (i5 == 2) {
            ((ColorScale)localObject1).c = ((ConditionalFormattingValue)localObject2);
          } else if (i3 == 2) {
            ((ColorScale)localObject1).c = ((ConditionalFormattingValue)localObject2);
          } else {
            ((ColorScale)localObject1).b = ((ConditionalFormattingValue)localObject2);
          }
          i1 += 8;
        }
        for (i5 = 0; i5 < i3; i5++)
        {
          i1 += 8;
          localObject2 = b(this.Z, i1);
          i1 += 16;
          if (i5 == 0) {
            ((ColorScale)localObject1).d = ((zaml)localObject2);
          } else if (i5 == 2) {
            ((ColorScale)localObject1).f = ((zaml)localObject2);
          } else if (i3 == 2) {
            ((ColorScale)localObject1).f = ((zaml)localObject2);
          } else {
            ((ColorScale)localObject1).e = ((zaml)localObject2);
          }
        }
        break;
      case 4: 
        localObject1 = null;
        if (paramFormatCondition.getType() != 3)
        {
          paramFormatCondition.c = 3;
          localObject1 = new DataBar(this.e, paramFormatCondition);
          paramFormatCondition.a((DataBar)localObject1);
        }
        else
        {
          localObject1 = paramFormatCondition.getDataBar();
        }
        i1 += 3;
        ((DataBar)localObject1).setShowValue((this.Z[i1] & 0xFF & 0x2) == 0);
        i1++;
        ((DataBar)localObject1).setMinLength(this.Z[i1]);
        ((DataBar)localObject1).setMaxLength(this.Z[(i1 + 1)]);
        i1 += 2;
        ((DataBar)localObject1).b(b(this.Z, i1));
        i1 += 16;
        ConditionalFormattingValue localConditionalFormattingValue1 = new ConditionalFormattingValue(paramFormatCondition);
        i1 = a(i1, localConditionalFormattingValue1);
        localConditionalFormattingValue2 = new ConditionalFormattingValue(paramFormatCondition);
        i1 = a(i1, localConditionalFormattingValue2);
        ((DataBar)localObject1).a(localConditionalFormattingValue2);
        ((DataBar)localObject1).b(localConditionalFormattingValue1);
        break;
      case 5: 
        if (paramFormatCondition.getType() != 5)
        {
          paramFormatCondition.c = 5;
          localObject1 = new Top10();
          paramFormatCondition.a((Top10)localObject1);
        }
        i1 += 2;
        i1++;
        paramFormatCondition.getTop10().setBottom((this.Z[i1] & 0xFF & 0x1) == 0);
        paramFormatCondition.getTop10().setPercent((this.Z[i1] & 0xFF & 0x2) != 0);
        i1++;
        paramFormatCondition.getTop10().setRank(zc.e(this.Z, i1));
        i1 += 2;
        break;
      case 6: 
        if (paramFormatCondition.getType() != 4)
        {
          paramFormatCondition.c = 4;
          localObject1 = new IconSet(paramFormatCondition);
          paramFormatCondition.a((IconSet)localObject1);
        }
        i1 += 3;
        int i2 = this.Z[i1] & 0xFF;
        i1++;
        paramFormatCondition.getIconSet().a(ztr.h(this.Z[i1] & 0xFF));
        i1++;
        paramFormatCondition.getIconSet().setShowValue((this.Z[i1] & 0xFF & 0x1) == 0);
        paramFormatCondition.getIconSet().b = ((this.Z[i1] & 0xFF & 0x4) != 0);
        i1++;
        for (int i4 = 0; i4 < i2; i4++)
        {
          localConditionalFormattingValue2 = new ConditionalFormattingValue(paramFormatCondition);
          paramFormatCondition.getIconSet().getCfvos().a(localConditionalFormattingValue2);
          i1 = a(i1, localConditionalFormattingValue2);
          localConditionalFormattingValue2.setGTE(this.Z[i1] == 1);
          i1 += 5;
        }
        break;
      }
    }
  }
  
  private zaml b(byte[] paramArrayOfByte, int paramInt)
  {
    zaml localzaml = new zaml(false);
    int i1 = 0;
    switch (paramArrayOfByte[paramInt])
    {
    case 0: 
      i1 = 0;
      break;
    case 1: 
      i1 = 3;
      localzaml.a(i1, zc.a(paramArrayOfByte, paramInt + 4));
      break;
    case 2: 
      i1 = 2;
      localzaml.a(2, Color.fromArgb(this.Z[(paramInt + 7)] & 0xFF, this.Z[(paramInt + 4)] & 0xFF, this.Z[(paramInt + 5)] & 0xFF, this.Z[(paramInt + 6)] & 0xFF).toArgb());
      break;
    case 3: 
      i1 = 4;
      localzaml.a(i1, zc.a(paramArrayOfByte, paramInt + 4));
      break;
    case 4: 
      return localzaml;
    }
    localzaml.a(zc.f(paramArrayOfByte, paramInt + 8));
    return localzaml;
  }
  
  private int a(int paramInt, ConditionalFormattingValue paramConditionalFormattingValue)
  {
    int i1 = paramInt;
    switch (this.Z[i1])
    {
    case 1: 
      paramConditionalFormattingValue.setType(3);
      return b(i1 + 1, paramConditionalFormattingValue);
    case 2: 
      paramConditionalFormattingValue.setType(2);
      return i1 + 3;
    case 3: 
      paramConditionalFormattingValue.setType(1);
      return i1 + 3;
    case 4: 
      paramConditionalFormattingValue.setType(4);
      return b(i1 + 1, paramConditionalFormattingValue);
    case 5: 
      paramConditionalFormattingValue.setType(5);
      return b(i1 + 1, paramConditionalFormattingValue);
    case 7: 
      paramConditionalFormattingValue.setType(0);
      return b(i1 + 1, paramConditionalFormattingValue);
    }
    return i1;
  }
  
  private int b(int paramInt, ConditionalFormattingValue paramConditionalFormattingValue)
  {
    int i1 = zc.e(this.Z, paramInt) & 0xFFFF;
    if (i1 != 0)
    {
      byte[] arrayOfByte = new byte[(zc.e(this.Z, paramInt) & 0xFFFF) + 2];
      System.arraycopy(this.Z, paramInt, arrayOfByte, 0, arrayOfByte.length);
      paramConditionalFormattingValue.a(arrayOfByte);
      return paramInt + arrayOfByte.length;
    }
    paramConditionalFormattingValue.a(zc.f(this.Z, paramInt + 2));
    return paramInt + 10;
  }
  
  private void ah(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x800) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 16) & 0xFFFF;
    if (this.S.get(Integer.valueOf(i1)) == null) {
      return;
    }
    i1 = ((Integer)this.S.get(Integer.valueOf(i1))).intValue();
    FormatConditionCollection localFormatConditionCollection = this.j.getConditionalFormattings().get(i1);
    if (this.Z[12] == 0)
    {
      int i2 = 18;
      int i3 = zc.e(this.Z, i2) & 0xFFFF;
      if ((i3 < 0) || (i3 >= localFormatConditionCollection.getCount())) {
        return;
      }
      i2 += 2;
      FormatCondition localFormatCondition2 = localFormatConditionCollection.get(i3);
      localFormatCondition2.b = ztr.c(this.Z[i2]);
      i2++;
      int i4 = this.Z[i2] & 0xFF;
      i2++;
      localFormatCondition2.setPriority(zc.e(this.Z, i2));
      if (localFormatCondition2.getPriority() > localFormatConditionCollection.e.f()) {
        localFormatConditionCollection.e.a(localFormatCondition2.getPriority() + 1);
      }
      i2 += 2;
      if ((this.Z[i2] & 0xFF & 0x1) == 0) {
        return;
      }
      localFormatCondition2.setStopIfTrue((this.Z[i2] & 0xFF & 0x2) != 0);
      if (this.Z[(i2 + 1)] != 0)
      {
        i2 += 2;
        i2 = a(i2, localFormatCondition2.getStyle());
      }
      else
      {
        i2 += 2;
      }
      a(localFormatCondition2, i4, i2, false, 0);
    }
    else
    {
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2170)
      {
        paramzqj.a(-2);
      }
      else
      {
        FormatCondition localFormatCondition1 = new FormatCondition(localFormatConditionCollection);
        a(paramzqj, localFormatCondition1);
        localFormatConditionCollection.a(localFormatCondition1);
      }
    }
  }
  
  private void ai(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x800) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    ConditionalFormattingCollection localConditionalFormattingCollection = this.j.getConditionalFormattings();
    FormatConditionCollection localFormatConditionCollection = null;
    int i1 = localConditionalFormattingCollection.add();
    localFormatConditionCollection = localConditionalFormattingCollection.get(i1);
    localFormatConditionCollection.a(this.Z, this.X & 0xFFFF);
    this.S.put(Integer.valueOf((zc.e(this.Z, 2) & 0xFFFF) >> 1), Integer.valueOf(i1));
    for (;;)
    {
      this.W = paramzqj.b(this.Y);
      switch (this.W)
      {
      case 432: 
        a(paramzqj);
        i1 = localConditionalFormattingCollection.add();
        localFormatConditionCollection = localConditionalFormattingCollection.get(i1);
        localFormatConditionCollection.a(this.Z, this.X & 0xFFFF);
        this.S.put(Integer.valueOf((zc.e(this.Z, 2) & 0xFFFF) >> 1), Integer.valueOf(i1));
        break;
      case 433: 
        a(paramzqj);
        if (localFormatConditionCollection == null) {
          localFormatConditionCollection = localConditionalFormattingCollection.get(localConditionalFormattingCollection.getCount() - 1);
        }
        FormatCondition localFormatCondition = new FormatCondition(localFormatConditionCollection);
        localFormatCondition.a(this.Z, this.X & 0xFFFF);
        localFormatCondition.setPriority(localFormatConditionCollection.e.f());
        localFormatConditionCollection.e.a(localFormatConditionCollection.e.f() + 1);
        localFormatCondition.setStopIfTrue(true);
        localFormatConditionCollection.a(localFormatCondition);
      }
    }
    paramzqj.a(-2);
  }
  
  private void a(zqj paramzqj, PaneCollection paramPaneCollection)
    throws Exception
  {
    a(paramzqj);
    paramPaneCollection.c(zc.e(this.Z, 2));
    paramPaneCollection.d(zc.e(this.Z, 0));
    paramPaneCollection.a(zc.e(this.Z, 4));
    paramPaneCollection.b(zc.e(this.Z, 6));
    paramPaneCollection.a(this.Z[8]);
  }
  
  private void aj(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x400) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 0);
    zapd localzapd = this.i.o();
    for (int i2 = 0; i2 < (i1 & 0xFFFF); i2++)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = (zc.e(this.Z, 8 * i2 + 2) & 0xFFFF);
      localCellArea.EndRow = (zc.e(this.Z, 8 * i2 + 4) & 0xFFFF);
      localCellArea.StartColumn = (this.Z[(8 * i2 + 6)] & 0xFF);
      localCellArea.EndColumn = (this.Z[(8 * i2 + 8)] & 0xFF);
      localzapd.a(localCellArea);
    }
  }
  
  private void ak(zqj paramzqj)
    throws Exception
  {
    for (int i1 = 0; i1 < this.f.getCount(); i1++)
    {
      this.R = null;
      this.f.p().i();
      Object localObject = this.ab.get(Integer.valueOf((int)paramzqj.b()));
      if (localObject != null) {
        this.j = this.f.get(((Integer)localObject).intValue());
      } else {
        this.j = this.f.get(i1);
      }
      this.k.startSheet(this.j);
      this.a = this.k.getLoadDataFilterOptions();
      if (this.a == 0)
      {
        a(10, paramzqj);
        paramzqj.a(2);
      }
      else
      {
        this.i = this.j.getCells();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.C.clear();
        if (this.j.getType() == 2)
        {
          a(2057, paramzqj);
          paramzqj.a(-2);
          if ((this.a & 0x100) != 0)
          {
            this.P = this.i.getRows();
            this.F = this.i.e();
            Chart localChart = new Chart(this.j);
            this.j.getCharts().a(localChart);
            zkp localzkp = new zkp(this, paramzqj, this.f, this.j);
            localzkp.a(localChart);
          }
          else
          {
            a(10, paramzqj);
            paramzqj.a(2);
          }
        }
        else
        {
          if (this.m) {
            this.i.a(128, 128, 16);
          } else {
            this.i.a(4096, 4096, 64);
          }
          O(paramzqj);
          this.F.a(-10, 0, 0, 0);
          this.i.f();
          this.i.a((short)this.O);
        }
      }
    }
  }
  
  static com.aspose.cells.b.a.d.zh a(zxf paramzxf)
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = paramzxf.a().a("Workbook");
    if (localzh == null) {
      localzh = paramzxf.a().a("WORKBOOK");
    }
    if (localzh == null)
    {
      localzh = paramzxf.a().a("Book");
      if (localzh != null)
      {
        byte[] arrayOfByte = new byte[6];
        localzh.a(arrayOfByte, 0, arrayOfByte.length);
        if ((arrayOfByte[0] == 9) && (arrayOfByte[1] == 8) && (arrayOfByte[2] == 16) && (arrayOfByte[3] == 0) && (arrayOfByte[4] == 0) && (arrayOfByte[5] == 6)) {
          localzh.a(-6L, 1);
        } else {
          return null;
        }
      }
    }
    return localzh;
  }
  
  private void c(zxf paramzxf)
    throws Exception
  {
    this.c = paramzxf;
    com.aspose.cells.b.a.d.zh localzh1 = paramzxf.a().a("Workbook");
    if (localzh1 == null)
    {
      localzh1 = paramzxf.a().a("WORKBOOK");
      paramzxf.a().g("WORKBOOK");
    }
    else
    {
      paramzxf.a().g("Workbook");
    }
    if (localzh1 == null)
    {
      localzh1 = paramzxf.a().a("Book");
      if (localzh1 != null)
      {
        byte[] arrayOfByte = new byte[6];
        localzh1.a(arrayOfByte, 0, arrayOfByte.length);
        if ((arrayOfByte[0] == 9) && (arrayOfByte[1] == 8) && (arrayOfByte[2] == 16) && (arrayOfByte[3] == 0) && (arrayOfByte[4] == 0) && (arrayOfByte[5] == 6))
        {
          paramzxf.a().g("Book");
          localzh1.a(-6L, 1);
        }
        else
        {
          throw new CellsException(19, "This Excel files contains BIFF7(Excel95 or earlier file format) records.");
        }
      }
      else
      {
        throw new CellsException(18, "File is corrupted");
      }
    }
    a(localzh1);
    if (localzh1.h() > 20000000L)
    {
      localzh1 = null;
      zg.a();
      zg.b();
    }
    else
    {
      localzh1 = null;
    }
    Object localObject1;
    Object localObject2;
    for (int i1 = 0; i1 < this.f.getCount(); i1++) {
      if ((this.f.get(i1).v() != null) && (this.f.get(i1).getOleObjects().getCount() != 0))
      {
        localObject1 = this.f.get(i1).getOleObjects().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (OleObject)((Iterator)localObject1).next();
          if (((OleObject)localObject2).s() > this.f.d) {
            this.f.d = ((OleObject)localObject2).s();
          }
          boolean bool1 = ((OleObject)localObject2).i();
          if ((bool1) && (!((OleObject)localObject2).c()))
          {
            String str2 = "MBD" + zp.d(((OleObject)localObject2).s());
            zaoz localzaoz = paramzxf.a().b(str2);
            ((OleObject)localObject2).a(localzaoz.a());
            com.aspose.cells.b.a.d.zh localzh2 = null;
            if (FileFormatUtil.b(localzaoz))
            {
              localzh2 = localzaoz.a("\001Ole10Native");
              ((OleObject)localObject2).b(true);
            }
            else if (FileFormatUtil.a(localzaoz))
            {
              boolean bool2 = false;
              ((OleObject)localObject2).c(FileFormatUtil.a(null, null, localzaoz).getFileFormatType());
              Object localObject3;
              if (((OleObject)localObject2).m() == 33)
              {
                if (localzaoz.b("MAPIMessage") != null)
                {
                  localObject3 = localzaoz.a();
                  localzaoz = localzaoz.b("MAPIMessage");
                  localzaoz.a((com.aspose.cells.b.a.zh)localObject3);
                }
              }
              else if ((((OleObject)localObject2).m() == 255) && (localzaoz.a("Package") != null))
              {
                localObject3 = localzaoz.a();
                localzh2 = localzaoz.a("Package");
                int i2 = FileFormatUtil.b(localzh2).getFileFormatType();
                ((OleObject)localObject2).c(i2);
                bool2 = FileFormatUtil.e(i2);
              }
              if (!bool2)
              {
                localObject3 = new zxf(localzaoz);
                localzh2 = new com.aspose.cells.b.a.d.zh();
                ((zxf)localObject3).a(localzh2);
              }
            }
            else
            {
              localzh2 = localzaoz.a("CONTENTS");
              localzaoz.g("CONTENTS");
            }
            if (localzh2 != null)
            {
              paramzxf.a().g(str2);
              ((OleObject)localObject2).a(false);
              if (((OleObject)localObject2).k()) {
                ((OleObject)localObject2).a(localzh2);
              } else {
                ((OleObject)localObject2).setObjectData(localzh2.o());
              }
            }
          }
        }
      }
    }
    localzh1 = paramzxf.a().a("User Names");
    if (localzh1 != null) {
      this.e.getSettings().setShared(true);
    }
    if ((this.a & 0x20000) != 0)
    {
      localzh1 = paramzxf.a().a("XML");
      if (localzh1 != null)
      {
        paramzxf.a().g("XML");
        String str1 = Encoding.getUTF8().a(localzh1.m());
        localObject1 = null;
        localObject2 = null;
        try
        {
          localObject1 = zauy.a(localzh1);
          localObject2 = new zqh(this.e);
          zaly localzaly = new zaly((zqh)localObject2);
          localzaly.a((zcjy)localObject1);
        }
        finally
        {
          if (localObject1 != null) {
            ((zcjy)localObject1).c();
          }
          if (localObject2 != null) {
            ((zqh)localObject2).dispose();
          }
        }
      }
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, zca paramzca)
    throws Exception
  {
    ztn localztn = new ztn();
    long l1 = paramzm.i();
    localztn.a(paramzm, paramzca);
    paramzm.b(l1);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    for (int i1 = 0; i1 < localzaoz.b(); i1++)
    {
      com.aspose.cells.b.a.d.zh localzh = (com.aspose.cells.b.a.d.zh)localzaoz.b(i1);
      localztn.a(localzh, paramzca);
      localzh.b(0L);
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, ztl paramztl)
    throws Exception
  {
    ztn localztn = new ztn();
    long l1 = paramzm.i();
    localztn.a(paramzm, paramztl);
    paramzm.b(l1);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    for (int i1 = 0; i1 < localzaoz.b(); i1++)
    {
      com.aspose.cells.b.a.d.zh localzh = (com.aspose.cells.b.a.d.zh)localzaoz.b(i1);
      localztn.a(localzh, paramztl);
      localzh.b(0L);
    }
  }
  
  private void a(zm paramzm, zxf paramzxf, zcc paramzcc)
    throws Exception
  {
    ztn localztn = new ztn();
    long l1 = paramzm.i();
    localztn.a(paramzm, paramzcc);
    paramzm.b(l1);
    zaoz localzaoz = paramzxf.a().b("_SX_DB_CUR");
    if (localzaoz != null) {
      for (int i1 = 0; i1 < localzaoz.b(); i1++)
      {
        com.aspose.cells.b.a.d.zh localzh2 = (com.aspose.cells.b.a.d.zh)localzaoz.b(i1);
        localztn.a(localzh2, paramzcc);
        localzh2.b(0L);
      }
    }
    com.aspose.cells.b.a.d.zh localzh1 = paramzxf.a().a("encryption");
    if (localzh1 != null)
    {
      ztj.a(localzh1, paramzxf, paramzcc);
      paramzxf.a().g("encryption");
    }
  }
  
  void b(zxf paramzxf)
    throws Exception
  {
    boolean bool = zdb.a(paramzxf);
    if (bool)
    {
      this.e.getSettings().h = true;
      this.e.i = new zdb(paramzxf);
    }
    this.ae = paramzxf;
    this.f.p().getSettings().f = true;
    c(paramzxf);
    zaoz localzaoz = paramzxf.a().b("_VBA_PROJECT_CUR");
    if (localzaoz != null)
    {
      if (this.f.k()) {
        this.f.a(new VbaProject(this.e, localzaoz, null));
      }
      paramzxf.a().g("_VBA_PROJECT_CUR");
    }
    try
    {
      a(this.c, this.f);
    }
    catch (Exception localException) {}
    this.f.p().getSettings().f = false;
  }
  
  static void a(zxf paramzxf, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    BuiltInDocumentPropertyCollection localBuiltInDocumentPropertyCollection = paramWorksheetCollection.getBuiltInDocumentProperties();
    CustomDocumentPropertyCollection localCustomDocumentPropertyCollection = paramWorksheetCollection.getCustomDocumentProperties();
    zss.a(paramzxf, localBuiltInDocumentPropertyCollection, localCustomDocumentPropertyCollection);
    DocumentProperty localDocumentProperty;
    if (localBuiltInDocumentPropertyCollection.contains("Version"))
    {
      localDocumentProperty = localBuiltInDocumentPropertyCollection.get("Version");
      if (localDocumentProperty.getType() == 3)
      {
        int i1 = localDocumentProperty.toInt();
        localDocumentProperty.setValue(zp.a((i1 & 0xFFFF0000) >> 16, 2) + "." + zp.a(i1 & 0xFFFF, 4));
      }
    }
    if ((paramWorksheetCollection.G() != null) && (localBuiltInDocumentPropertyCollection.contains("DigSig")))
    {
      localDocumentProperty = localBuiltInDocumentPropertyCollection.get("DigSig");
      if (localDocumentProperty.getType() == 5) {
        paramWorksheetCollection.G().b((byte[])localDocumentProperty.getValue());
      }
      localBuiltInDocumentPropertyCollection.remove("DigSig");
    }
    Object localObject;
    if (localCustomDocumentPropertyCollection.contains("_PID_LINKBASE"))
    {
      localDocumentProperty = localCustomDocumentPropertyCollection.get("_PID_LINKBASE");
      if ((localDocumentProperty.getValue() instanceof byte[]))
      {
        localObject = (byte[])localDocumentProperty.getValue();
        localBuiltInDocumentPropertyCollection.setHyperlinkBase(Encoding.getUnicode().a((byte[])localObject, 0, localObject.length - 2));
      }
      else
      {
        localBuiltInDocumentPropertyCollection.setHyperlinkBase(zs.a(localDocumentProperty));
      }
      localCustomDocumentPropertyCollection.remove("_PID_LINKBASE");
    }
    if (localCustomDocumentPropertyCollection.contains("_PID_HLINKS"))
    {
      localDocumentProperty = localCustomDocumentPropertyCollection.get("_PID_HLINKS");
      localObject = Encoding.getUnicode();
      if ((localDocumentProperty.getValue() instanceof byte[]))
      {
        byte[] arrayOfByte = (byte[])localDocumentProperty.getValue();
        int i2 = 4;
        Iterator localIterator = paramWorksheetCollection.iterator();
        while (localIterator.hasNext())
        {
          Worksheet localWorksheet = (Worksheet)localIterator.next();
          for (int i3 = 0; i3 < localWorksheet.getHyperlinks().getCount(); i3++) {
            while (i2 < arrayOfByte.length)
            {
              i2 += 16;
              int i4 = zc.a(arrayOfByte, i2 + 4);
              i2 += 8;
              int i5 = i2 + 6;
              int i6 = zc.b(arrayOfByte, i2 + 6);
              i2 += 8;
              i2 += 4;
              int i7 = zc.a(arrayOfByte, i2) * 2;
              i2 += 4;
              String str1 = ((Encoding)localObject).a(arrayOfByte, i2, i7 - 2);
              i2 += (i7 % 4 != 0 ? i7 / 4 * 4 + 4 : i7);
              i2 += 4;
              i7 = zc.a(arrayOfByte, i2) * 2;
              i2 += 4;
              String str2 = ((Encoding)localObject).a(arrayOfByte, i2, i7 - 2);
              i2 += (i7 % 4 != 0 ? i7 / 4 * 4 + 4 : i7);
              if (i7 > 2) {
                str1 = str1 + "#" + str2;
              }
              if (i4 == 0)
              {
                Hyperlink localHyperlink = localWorksheet.getHyperlinks().get(i3);
                if (i6 == 1)
                {
                  localHyperlink.a = str1;
                  arrayOfByte[i5] = 0;
                  break;
                }
                if (i6 != 2) {
                  break;
                }
                break;
              }
            }
          }
        }
      }
    }
  }
  
  private void a(com.aspose.cells.b.a.d.zh paramzh)
    throws Exception
  {
    zqj localzqj = new zqj(paramzh);
    this.f.u();
    if (!this.b) {
      ((zbzv)this.f.C()).d();
    }
    b(localzqj);
    this.h = (this.f.C().b() - 1);
    int i1 = 0;
    if ((this.f.w() != null) && (this.f.w().getCount() != 0))
    {
      for (int i2 = 0; i2 < this.f.w().getCount(); i2++)
      {
        zbti localzbti2 = this.f.w().a(i2);
        if (localzbti2.e())
        {
          i1 = i2;
          break;
        }
      }
    }
    else
    {
      this.f.a(new zbth());
      zbti localzbti1 = new zbti();
      localzbti1.a(1);
      this.f.w().a(localzbti1);
      i1 = 0;
    }
    for (int i3 = 0; i3 < this.f.getCount(); i3++) {
      this.f.r().a(i1, i3, i3);
    }
    ak(localzqj);
    k();
  }
  
  private void k()
  {
    if (this.m) {
      this.f.q();
    }
    this.f.W().a();
    int i1 = 1;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      if ((localWorksheet.getType() == 2) || (localWorksheet.w() != null))
      {
        i1 = 0;
        break;
      }
    }
    if (i1 != 0) {
      this.f.a(null);
    }
  }
  
  private void b(zqj paramzqj, boolean paramBoolean)
    throws Exception
  {
    this.W = paramzqj.b(this.Y);
    if (paramBoolean)
    {
      if ((this.W & 0xFFFF) == 2150) {
        a(paramzqj);
      } else {
        throw new IOException("File is corrupted");
      }
    }
    else {
      switch (this.W)
      {
      case 60: 
      case 235: 
        a(paramzqj);
        break;
      default: 
        throw new IOException("File is corrupted");
      }
    }
  }
  
  private void a(zqj paramzqj, zse paramzse)
    throws Exception
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    byte[] arrayOfByte1 = null;
    a(paramzqj);
    int i4 = 0;
    boolean bool = paramzse.a() == 1;
    if (bool) {
      i4 = 14;
    }
    int i5 = i4;
    i2 = zc.a(this.Z, i5 + 4);
    i5 += 8;
    zwy localzwy1 = 0;
    int i6 = 0;
    while (i2 > 0)
    {
      if ((i5 < (this.X & 0xFFFF)) && (i5 + 8 > (this.X & 0xFFFF)))
      {
        arrayOfByte1 = new byte[8];
        int i7 = (this.X & 0xFFFF) - i5;
        System.arraycopy(this.Z, i5, arrayOfByte1, 0, i7);
        b(paramzqj, bool);
        System.arraycopy(this.Z, i4, arrayOfByte1, i7, 8 - i7);
        localzwy1 = (short)((zc.e(arrayOfByte1, 0) & 0xFFFF) >> 4);
        i6 = (byte)(arrayOfByte1[0] & 0xFF & 0xF);
        i3 = zc.e(arrayOfByte1, 2);
        i1 = zc.a(arrayOfByte1, 4);
        i5 = i4 + 8 - i7;
      }
      else
      {
        if (i5 == (this.X & 0xFFFF))
        {
          b(paramzqj, bool);
          i5 = i4;
        }
        localzwy1 = (short)((zc.e(this.Z, i5) & 0xFFFF) >> 4);
        i6 = (byte)(this.Z[i5] & 0xFF & 0xF);
        i3 = zc.e(this.Z, i5 + 2);
        i1 = zc.a(this.Z, i5 + 4);
        i5 += 8;
      }
      i2 -= i1 + 8;
      int i9;
      zwy localzwy2;
      int i10;
      switch (i3)
      {
      case 61446: 
        zsd localzsd = paramzse.d();
        zww localzww = localzsd.b();
        localzww.a = zc.a(this.Z, i5);
        int i8 = zc.a(this.Z, i5 + 4) - 1;
        localzww.b = zc.a(this.Z, i5 + 8);
        localzww.c = zc.a(this.Z, i5 + 12);
        i5 += 16;
        for (i9 = 0; i9 < i8; i9++)
        {
          localzwy2 = new zwy();
          zf.a(localzsd.c(), localzwy2);
          if ((i5 < (this.X & 0xFFFF)) && (i5 + 8 > (this.X & 0xFFFF)))
          {
            arrayOfByte1 = new byte[8];
            i10 = (this.X & 0xFFFF) - i5;
            System.arraycopy(this.Z, i5, arrayOfByte1, 0, i10);
            b(paramzqj, bool);
            i5 = i4;
            System.arraycopy(this.Z, i5, arrayOfByte1, i10, 8 - i10);
            localzwy2.a = zc.a(arrayOfByte1, 0);
            localzwy2.b = zc.a(arrayOfByte1, 4);
            i5 += 8 - i10;
          }
          else
          {
            if (i5 == (this.X & 0xFFFF))
            {
              b(paramzqj, bool);
              i5 = i4;
            }
            localzwy2.a = zc.a(this.Z, i5);
            localzwy2.b = zc.a(this.Z, i5 + 4);
            i5 += 8;
          }
          if (localzwy2.a > (localzsd.d() & 0xFFFF)) {
            localzsd.a(localzwy2.a);
          }
        }
        break;
      case 61441: 
        i9 = i1;
        localzwy2 = localzwy1;
        i10 = 1;
        while (i9 != 0)
        {
          if (i10 != 0) {
            if ((i5 < (this.X & 0xFFFF)) && (i5 + 8 > (this.X & 0xFFFF)))
            {
              arrayOfByte1 = new byte[8];
              int i11 = (this.X & 0xFFFF) - i5;
              System.arraycopy(this.Z, i5, arrayOfByte1, 0, i11);
              b(paramzqj, bool);
              i5 = i4;
              System.arraycopy(this.Z, i5, arrayOfByte1, i11, 8 - i11);
              localzwy1 = (short)((zc.e(arrayOfByte1, i5) & 0xFFFF) >> 4);
              i3 = zc.e(arrayOfByte1, 2);
              i1 = zc.a(arrayOfByte1, 4);
              i5 += 8 - i11;
            }
            else
            {
              if (i5 == (this.X & 0xFFFF))
              {
                b(paramzqj, bool);
                i5 = i4;
              }
              localzwy1 = (short)((zc.e(this.Z, i5) & 0xFFFF) >> 4);
              i3 = zc.e(this.Z, i5 + 2);
              i1 = zc.a(this.Z, i5 + 4);
              i5 += 8;
            }
          }
          Object localObject;
          if ((i3 & 0xFFFF) != 61447)
          {
            if (localzwy2 > 0) {
              throw new IOException("File is corrupted");
            }
            i9 -= 8 + i1;
            if (i1 != 0)
            {
              localObject = new byte[i1];
              i5 = a(paramzqj, i4, i5, (byte[])localObject, 0, i1);
            }
          }
          else
          {
            localzwy2--;
            localObject = null;
            int i12 = 0;
            if (i1 <= 38) {
              i1 = 36;
            }
            i9 -= i1 + 8;
            localObject = new zcf();
            paramzse.b().a((zcf)localObject);
            ((zcf)localObject).a((byte)localzwy1);
            byte[] arrayOfByte2 = new byte[i1];
            i5 = a(paramzqj, i4, i5, arrayOfByte2, 0, i1);
            zwv localzwv = ((zcf)localObject).g();
            localzwv.a = arrayOfByte2[i12];
            localzwv.b = arrayOfByte2[(i12 + 1)];
            int i13 = 1;
            for (int i14 = 0; i14 < 16; i14++) {
              if (arrayOfByte2[(i12 + 2 + i14)] != 0)
              {
                i13 = 0;
                break;
              }
            }
            i12 += 18;
            localzwv.d = zc.b(arrayOfByte2, i12);
            long l1 = zc.d(arrayOfByte2, i12 + 2);
            i12 += 6;
            localzwv.e = zc.a(arrayOfByte2, i12);
            i12 += 8;
            localzwv.f = arrayOfByte2[i12];
            int i15 = arrayOfByte2[(i12 + 1)];
            localzwv.g = arrayOfByte2[(i12 + 2)];
            localzwv.h = arrayOfByte2[(i12 + 3)];
            i12 += 4;
            if (i15 != 0) {
              i12 += (i15 & 0xFF);
            }
            if (i1 == 36)
            {
              if ((i13 != 0) || ((l1 & 0xFFFFFFFF) <= 8L))
              {
                ((zcf)localObject).g().c = new byte[16];
              }
              else
              {
                arrayOfByte2 = new byte[8];
                i5 = a(paramzqj, i4, i5, arrayOfByte2, 0, 8);
                int i16 = zc.e(arrayOfByte2, 2);
                if ((i16 & 0xFFFF) == 61447)
                {
                  localzwy1 = (short)((zc.e(arrayOfByte2, 0) & 0xFFFF) >> 4);
                  i3 = i16;
                  i1 = zc.a(arrayOfByte2, 4);
                  i10 = 0;
                  ((zcf)localObject).g().c = new byte[16];
                }
                else
                {
                  i12 = 0;
                  i1 = zc.a(arrayOfByte2, i12 + 4);
                  i9 -= i1 + 8;
                }
              }
            }
            else
            {
              i10 = 1;
              zde localzde = ((zcf)localObject).f();
              localzde.a((short)((zc.e(arrayOfByte2, i12) & 0xFFFF) >> 4));
              localzde.a(zc.e(arrayOfByte2, i12 + 2));
              i1 = zc.a(arrayOfByte2, i12 + 4);
              i12 += 8;
              if (arrayOfByte2.length == 8)
              {
                arrayOfByte2 = new byte[i1];
                i5 = a(paramzqj, i4, i5, arrayOfByte2, 0, i1);
                i12 = 0;
              }
              int i17 = i1 - (arrayOfByte2.length - i12);
              i9 -= i17;
              int i18 = 0;
              switch (((zcf)localObject).n())
              {
              case 6: 
                i18 = (localzde.d() ^ 0x6E0) == 1 ? 1 : 0;
                break;
              case 7: 
                i18 = (localzde.d() ^ 0x7A8) == 1 ? 1 : 0;
                break;
              case 4: 
                i18 = (localzde.d() ^ 0x542) == 1 ? 1 : 0;
                break;
              case 2: 
                i18 = (localzde.d() ^ 0x3D4) == 1 ? 1 : 0;
              }
              if (localzde.g())
              {
                i12 += 16;
                if (i18 != 0)
                {
                  localzde.a(new byte[16]);
                  System.arraycopy(arrayOfByte2, i12, localzde.a(), 0, 16);
                  i12 += 16;
                }
                localzde.a = zc.a(arrayOfByte2, i12);
                i12 += 4;
                i19 = zc.a(arrayOfByte2, i12 + 8) - zc.a(arrayOfByte2, i12);
                i12 += 16;
                ((zcf)localObject).a((int)(zc.a(arrayOfByte2, i12) * zbxp.a() / 914400 + 0.5D));
                ((zcf)localObject).b((int)(zc.a(arrayOfByte2, i12 + 4) * zbxp.a() / 914400 + 0.5D));
                if ((((zcf)localObject).n() == 3) && (((zcf)localObject).k() != 0)) {
                  ((zcf)localObject).c(i19 * 96 / ((zcf)localObject).k());
                }
                i12 += 8;
                i12 += 4;
                localzde.b = arrayOfByte2[i12];
                localzde.c = arrayOfByte2[(i12 + 1)];
                i12 += 2;
              }
              else
              {
                if (i18 != 0)
                {
                  localzde.a(new byte[16]);
                  System.arraycopy(arrayOfByte2, i12, localzde.a(), 0, 16);
                  i12 += 16;
                }
                localzde.d = arrayOfByte2[(i12 + 16)];
                i12 += 17;
              }
              int i19 = arrayOfByte2.length - i12;
              localzde.b(new byte[i19 + i17]);
              System.arraycopy(arrayOfByte2, i12, localzde.e(), 0, i19);
              if (i17 != 0) {
                i5 = a(paramzqj, i4, i5, localzde.e(), i19, i17);
              }
              byte[] arrayOfByte3 = zr.a(localzde.e());
              ((zcf)localObject).g().c = arrayOfByte3;
              if (!((zcf)localObject).f().g()) {
                switch (((zcf)localObject).n())
                {
                case 7: 
                  ((zcf)localObject).a(zc.a(localzde.e(), 4));
                  ((zcf)localObject).b(zc.a(localzde.e(), 8));
                  break;
                default: 
                  try
                  {
                    int[] arrayOfInt = zn.a(((zcf)localObject).n() == -2, localzde.e(), zbxp.a());
                    ((zcf)localObject).a(arrayOfInt[0]);
                    ((zcf)localObject).b(arrayOfInt[1]);
                  }
                  catch (Exception localException) {}
                }
              }
            }
          }
        }
      default: 
        arrayOfByte1 = new byte[8 + i1];
        System.arraycopy(zc.a((short)(localzwy1 << 4 | i6 & 0xFF)), 0, arrayOfByte1, 0, 2);
        System.arraycopy(zc.a(i3), 0, arrayOfByte1, 2, 2);
        System.arraycopy(zc.a(i1), 0, arrayOfByte1, 4, 4);
        i5 = a(paramzqj, i4, i5, arrayOfByte1, 8, i1);
        zf.a(paramzse.e(), arrayOfByte1);
      }
    }
  }
  
  void a(zqj paramzqj, PageSetup paramPageSetup)
    throws Exception
  {
    if ((this.a & 0x200) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = 14;
    ShapeCollection localShapeCollection = null;
    if ((this.Z[(i1 + 2)] == 2) && ((this.Z[(i1 + 3)] & 0xFF) == 240))
    {
      int i2 = zc.b(this.Z, i1 + 8) >> 4;
      localShapeCollection = new ShapeCollection(this.f, this.j, this.f.N(), paramPageSetup, i2);
      paramPageSetup.a(localShapeCollection);
      i1 += 16;
      localShapeCollection.d().c().a(zc.a(this.Z, i1));
      localShapeCollection.d().c().b(zc.a(this.Z, i1 + 4));
      i1 += 16;
      i3 = zc.a(this.Z, i1 + 4);
      i1 += 8 + i3;
    }
    if (localShapeCollection == null) {
      localShapeCollection = paramPageSetup.i();
    }
    Picture localPicture = null;
    int i3 = 0;
    int i4 = 1;
    while (i1 < (this.X & 0xFFFF))
    {
      i3 = zc.e(this.Z, i1 + 2);
      switch (i3)
      {
      case 61444: 
        localPicture = new Picture(localShapeCollection);
        localPicture.a(null);
        localPicture.g(i4++);
        localShapeCollection.c(localPicture);
        i1 += 8;
        break;
      case 61450: 
        localPicture.R().j().a((short)((zc.e(this.Z, i1) & 0xFFFF) >> 4));
        i1 += 8;
        localPicture.R().j().c(zc.a(this.Z, i1));
        localPicture.R().j().d(zc.a(this.Z, i1 + 4));
        i1 += 8;
        break;
      case 61456: 
        i1 += 8;
        localPicture.a(0, false, 0, 0, zc.a(this.Z, i1), zc.a(this.Z, i1 + 4));
        i1 += 8;
        break;
      case 61451: 
        localPicture.R().d().a();
        int i5 = zc.b(this.Z, i1) >> 4;
        i1 += 8;
        int i6 = i1 + i5 * 6;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++)
        {
          i7 = zc.e(this.Z, i1);
          i8 = zc.a(this.Z, i1 + 2);
          if ((i7 & 0xFFFF & 0x8000) != 0)
          {
            if (i8 != 0)
            {
              byte[] arrayOfByte = new byte[i8];
              System.arraycopy(this.Z, i6, arrayOfByte, 0, i8);
              localPicture.R().d().a(i7, 4, arrayOfByte);
              i6 += i8;
            }
          }
          else {
            localPicture.R().d().a(i7, 0, Integer.valueOf(i8));
          }
          i1 += 6;
        }
        i1 = i6;
        break;
      default: 
        i1 += 8 + zc.a(this.Z, i1 + 4);
      }
    }
  }
  
  private int a(zqj paramzqj, int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
    throws Exception
  {
    if (paramInt2 + paramInt4 <= (this.X & 0xFFFF))
    {
      System.arraycopy(this.Z, paramInt2, paramArrayOfByte, paramInt3, paramInt4);
      paramInt2 += paramInt4;
      return paramInt2;
    }
    int i1 = 0;
    int i2 = paramInt4 + paramInt3;
    for (;;)
    {
      if (i2 - paramInt3 <= (this.X & 0xFFFF) - paramInt2)
      {
        i1 = i2 - paramInt3;
        System.arraycopy(this.Z, paramInt2, paramArrayOfByte, paramInt3, i1);
        paramInt2 += i1;
        return paramInt2;
      }
      i1 = (this.X & 0xFFFF) - paramInt2;
      System.arraycopy(this.Z, paramInt2, paramArrayOfByte, paramInt3, i1);
      paramInt3 += i1;
      b(paramzqj, paramInt1 != 0);
      paramInt2 = paramInt1;
    }
  }
  
  private zaml c(byte[] paramArrayOfByte, int paramInt)
  {
    zaml localzaml = new zaml(false);
    double d1 = zc.b(paramArrayOfByte, paramInt + 2) * 1.0D / 32767.0D;
    localzaml.a(d1);
    switch (paramArrayOfByte[paramInt])
    {
    case 0: 
      localzaml.b(true);
      break;
    case 1: 
      int i1 = zc.a(paramArrayOfByte, paramInt + 4);
      if (i1 >= 64) {
        localzaml.a(1, i1);
      } else {
        localzaml.a(3, i1);
      }
      break;
    case 2: 
      int i2 = ((paramArrayOfByte[(paramInt + 4)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 5)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 6)] & 0xFF);
      localzaml.a(2, i2);
      break;
    case 3: 
      localzaml.a(4, zc.a(paramArrayOfByte, paramInt + 4));
    }
    return localzaml;
  }
  
  private void al(zqj paramzqj)
    throws Exception
  {
    if ((this.a & 0x20) == 0)
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    int i1 = zc.e(this.Z, 12) & 0xFFFF;
    if (i1 != 0) {
      return;
    }
    int i2 = zc.e(this.Z, 14) & 0xFFFF;
    int i3 = zc.e(this.Z, 18) & 0xFFFF;
    int i4 = 20;
    int[] arrayOfInt = { i4 };
    zbzi localzbzi = a(this.Z, arrayOfInt, i3);
    i4 = arrayOfInt[0];
    this.af.put(Integer.valueOf(i2), localzbzi);
  }
  
  private zbzi a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    zbzi localzbzi = new zbzi();
    for (int i1 = 0; (i1 < paramInt) && (paramArrayOfInt[0] < paramArrayOfByte.length); i1++)
    {
      int i2 = paramArrayOfByte[paramArrayOfInt[0]] & 0xFF;
      zbzg localzbzg = new zbzg();
      localzbzg.a = i2;
      int i3 = zc.e(paramArrayOfByte, paramArrayOfInt[0] + 2) & 0xFFFF;
      switch (i2)
      {
      case 4: 
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 13: 
        localzbzg.b = c(paramArrayOfByte, paramArrayOfInt[0] + 4);
        break;
      case 0: 
      case 1: 
        localzbzg.b = Color.fromArgb(paramArrayOfByte[(paramArrayOfInt[0] + 4)] & 0xFF, paramArrayOfByte[(paramArrayOfInt[0] + 5)] & 0xFF, paramArrayOfByte[(paramArrayOfInt[0] + 6)] & 0xFF);
        break;
      case 14: 
        localzbzg.b = Integer.valueOf(paramArrayOfByte[(paramArrayOfInt[0] + 4)] & 0xFF);
        break;
      case 6: 
        int i4 = paramArrayOfInt[0] + 4;
        GradientFill localGradientFill = new GradientFill(null, null);
        localzbzg.b = localGradientFill;
        if (paramArrayOfByte[i4] == 0)
        {
          localGradientFill.b = new zadp();
          i4 += 4;
          localGradientFill.e().a = ((int)(zc.f(paramArrayOfByte, i4) * 6000.0D));
          i4 += 8;
          localGradientFill.g().b = ((int)(zc.f(paramArrayOfByte, i4) * 100000.0D));
          localGradientFill.g().e = ((int)(zc.f(paramArrayOfByte, i4 + 8) * 100000.0D));
          localGradientFill.g().c = ((int)(zc.f(paramArrayOfByte, i4 + 16) * 100000.0D));
          localGradientFill.g().d = ((int)(zc.f(paramArrayOfByte, i4 + 24) * 100000.0D));
          i4 += 32;
        }
        else
        {
          i4 += 4;
          localGradientFill.b = new zadq();
          localGradientFill.f().a = 1;
          i4 += 8;
          localGradientFill.f().b = ((int)(zc.f(paramArrayOfByte, i4) * 100000.0D));
          localGradientFill.f().e = ((int)(zc.f(paramArrayOfByte, i4 + 8) * 100000.0D));
          localGradientFill.f().c = ((int)(zc.f(paramArrayOfByte, i4 + 16) * 100000.0D));
          localGradientFill.f().d = ((int)(zc.f(paramArrayOfByte, i4 + 24) * 100000.0D));
          i4 += 32;
        }
        int i5 = zc.a(paramArrayOfByte, i4);
        i4 += 4;
        for (int i6 = 0; i6 < i5; i6++)
        {
          GradientStop localGradientStop = new GradientStop(localGradientFill.getGradientStops());
          localGradientStop.a.c(false);
          localGradientFill.getGradientStops().a(localGradientStop);
          switch (paramArrayOfByte[i4])
          {
          case 0: 
            break;
          case 1: 
            localGradientStop.a.a(3, zc.a(paramArrayOfByte, i4 + 2));
            break;
          case 2: 
            int i7 = ((paramArrayOfByte[(i4 + 2)] & 0xFF) << 16) + ((paramArrayOfByte[(i4 + 3)] & 0xFF) << 8) + (paramArrayOfByte[(i4 + 4)] & 0xFF);
            localGradientStop.a.a(2, i7);
            break;
          case 3: 
            localGradientStop.a.a(4, zc.a(paramArrayOfByte, i4 + 2));
            break;
          }
          i4 += 6;
          localGradientStop.setPosition(zc.f(paramArrayOfByte, i4) * 100.0D);
          i4 += 8;
          localGradientStop.a.a(zc.f(paramArrayOfByte, i4));
          i4 += 8;
        }
        break;
      case 15: 
        localzbzg.b = Short.valueOf(zc.b(paramArrayOfByte, paramArrayOfInt[0] + 4));
        break;
      case 2: 
      case 3: 
      case 12: 
      default: 
        paramArrayOfInt[0] += i3;
        break;
      }
      paramArrayOfInt[0] += i3;
      localzbzi.a(localzbzg);
    }
    return localzbzi;
  }
  
  void a(Border paramBorder, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = 0;
    boolean[] arrayOfBoolean = { i1 };
    paramBorder.a = a(paramArrayOfByte, paramInt, arrayOfBoolean);
    i1 = arrayOfBoolean[0];
    paramInt += 8;
    paramBorder.setLineStyle(zcij.m(this.Z[paramInt] & 0xFF));
  }
  
  zaml a(byte[] paramArrayOfByte, int paramInt, boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    zaml localzaml = new zaml(false);
    localzaml.a(zc.b(paramArrayOfByte, paramInt + 2) / 32767.0D);
    int i1 = (paramArrayOfByte[paramInt] & 0xFF & 0xFE) >> 1;
    switch (i1)
    {
    case 0: 
      localzaml.b(true);
      break;
    case 1: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(3, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 2: 
      paramInt += 4;
      localzaml.a(2, ((paramArrayOfByte[paramInt] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 2)] & 0xFF));
      break;
    case 3: 
      if ((paramArrayOfByte[(paramInt + 1)] & 0xFF) >= 64) {
        localzaml.b(true);
      } else {
        localzaml.a(4, paramArrayOfByte[(paramInt + 1)] & 0xFF);
      }
      break;
    case 4: 
      paramArrayOfBoolean[0] = true;
      break;
    default: 
      localzaml.b(true);
    }
    return localzaml;
  }
  
  private void am(zqj paramzqj)
    throws Exception
  {
    if (((this.a & 0x2000) == 0) && ((this.a & 0x4000) == 0) && ((this.a & 0x800) == 0))
    {
      h(paramzqj);
      return;
    }
    a(paramzqj);
    zcdi localzcdi = new zcdi(this.f);
    int i1 = 0;
    int i2 = 0;
    localzcdi.a = ((this.Z[12] & 0xFF & 0x2) != 0);
    int i3 = 16;
    int i4 = zc.b(this.Z, i3);
    i3 += 2;
    Border localBorder = null;
    int i7 = 0;
    int i8 = -1;
    for (int i9 = 0; i9 < i4; i9++)
    {
      int i5 = zc.b(this.Z, i3);
      int i6 = zc.b(this.Z, i3 + 2);
      boolean[] arrayOfBoolean;
      switch (i5)
      {
      case 0: 
        localzcdi.b.setPattern(zcij.p(this.Z[(i3 + 4)] & 0xFF));
        break;
      case 1: 
        arrayOfBoolean = new boolean[] { i7 };
        localzcdi.b.b = a(this.Z, i3 + 4, arrayOfBoolean);
        i7 = arrayOfBoolean[0];
        localzcdi.b.b(34);
        break;
      case 2: 
        arrayOfBoolean = new boolean[] { i7 };
        localzcdi.b.a = a(this.Z, i3 + 4, arrayOfBoolean);
        i7 = arrayOfBoolean[0];
        localzcdi.b.b(35);
        break;
      case 5: 
        arrayOfBoolean = new boolean[] { i7 };
        localzcdi.a().a(a(this.Z, i3 + 4, arrayOfBoolean));
        i7 = arrayOfBoolean[0];
        localzcdi.b.b(16);
        break;
      case 6: 
        a(localzcdi.b.getBorders().getByBorderType(4), this.Z, i3 + 4);
        break;
      case 7: 
        a(localzcdi.b.getBorders().getByBorderType(8), this.Z, i3 + 4);
        break;
      case 8: 
        a(localzcdi.b.getBorders().getByBorderType(1), this.Z, i3 + 4);
        break;
      case 9: 
        a(localzcdi.b.getBorders().getByBorderType(2), this.Z, i3 + 4);
        break;
      case 10: 
        i8 = i3;
        break;
      case 11: 
        a(localzcdi.b.getBorders().getByBorderType(64), this.Z, i3 + 4);
        break;
      case 12: 
        a(localzcdi.b.getBorders().getByBorderType(128), this.Z, i3 + 4);
        break;
      case 13: 
        i1 = this.Z[(i3 + 4)] == 1 ? 1 : 0;
        break;
      case 14: 
        i2 = this.Z[(i3 + 4)] == 1 ? 1 : 0;
        break;
      case 15: 
        localzcdi.b.setHorizontalAlignment(zcij.g(this.Z[(i3 + 4)] & 0xFF));
        break;
      case 16: 
        localzcdi.b.setVerticalAlignment(zcij.e(this.Z[(i3 + 4)] & 0xFF));
        break;
      case 17: 
        localzcdi.b.setRotationAngle(this.Z[(i3 + 4)]);
        break;
      case 18: 
        localzcdi.b.setIndentLevel(zc.b(this.Z, i3 + 4));
        break;
      case 19: 
        switch (this.Z[(i3 + 4)])
        {
        case 1: 
          localzcdi.b.setTextDirection(1);
          break;
        case 2: 
          localzcdi.b.setTextDirection(2);
          break;
        default: 
          localzcdi.b.setTextDirection(0);
        }
        break;
      case 20: 
        localzcdi.b.setTextWrapped(this.Z[(i3 + 4)] != 0);
        break;
      case 22: 
        localzcdi.b.setShrinkToFit(this.Z[(i3 + 4)] != 0);
        break;
      case 24: 
        localzcdi.a().a(zcgj.e(this.Z, i3 + 4), true, 0);
        break;
      case 25: 
        localzcdi.a().b(zc.b(this.Z, i3 + 4));
        break;
      case 26: 
        localzcdi.a().setUnderline(zcij.c(zc.b(this.Z, i3 + 4)));
        break;
      case 27: 
        switch (this.Z[(i3 + 4)])
        {
        case 1: 
          localzcdi.a().setSuperscript(true);
          break;
        case 2: 
          localzcdi.a().setSubscript(true);
        }
        break;
      case 28: 
        localzcdi.a().setItalic(this.Z[(i3 + 4)] != 0);
        break;
      case 29: 
        localzcdi.a().setStrikeout(this.Z[(i3 + 4)] != 0);
        break;
      case 34: 
        localzcdi.a().setCharset(this.Z[(i3 + 4)]);
        break;
      case 35: 
        localzcdi.a().a(this.Z[(i3 + 4)]);
        break;
      case 36: 
        localzcdi.a().c(zc.b(this.Z, i3 + 4));
        break;
      case 37: 
        localzcdi.a().e(zcij.c(this.Z[(i3 + 4)]));
        break;
      case 38: 
        int i10 = i3 + 4;
        localzcdi.b.b(zcgj.e(this.Z, i10));
        break;
      case 41: 
        localzcdi.b.f(zc.b(this.Z, i3 + 4));
        break;
      case 43: 
        localzcdi.b.setFormulaHidden(this.Z[(i3 + 4)] != 0);
        break;
      case 44: 
        localzcdi.b.setLocked(this.Z[(i3 + 4)] != 0);
        break;
      }
      i3 += i6;
    }
    if (i8 != -1)
    {
      if (i1 != 0)
      {
        localBorder = localzcdi.b.getBorders().getByBorderType(32);
        a(localBorder, this.Z, i3 + 4);
      }
      if (i2 != 0) {
        a(localzcdi.b.getBorders().getByBorderType(16), this.Z, i3 + 4);
      }
    }
    this.f.getDxfs().b(localzcdi.b);
  }
  
  private void a(DataSorter paramDataSorter, zqj paramzqj)
    throws Exception
  {
    paramDataSorter.setSortLeftToRight((this.Z[12] & 0xFF & 0x1) != 0);
    paramDataSorter.setCaseSensitive((this.Z[12] & 0xFF & 0x2) != 0);
    if ((this.Z[12] & 0xFF & 0x4) != 0) {
      paramDataSorter.b = "pinYin";
    }
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = zc.a(this.Z, 14);
    localCellArea.EndRow = (zc.e(this.Z, 18) & 0xFFFF);
    localCellArea.StartColumn = (zc.e(this.Z, 22) & 0xFFFF);
    localCellArea.EndColumn = (zc.e(this.Z, 26) & 0xFFFF);
    paramDataSorter.a(localCellArea);
    int i1 = zc.a(this.Z, 30);
    while (i1 > 0)
    {
      i1--;
      this.W = paramzqj.b(this.Y);
      if ((this.W & 0xFFFF) != 2175)
      {
        paramzqj.a(-2);
        break;
      }
      a(paramzqj);
      int i2 = zc.e(this.Z, 12);
      zrr localzrr1 = new zrr(paramDataSorter);
      int i3;
      Style localStyle;
      switch ((i2 & 0xFFFF) >> 1 & 0xF)
      {
      case 0: 
        String str = null;
        int i4 = zc.a(this.Z, 38);
        if (i4 > 0) {
          if (this.Z[42] == 0) {
            str = Encoding.getASCII().a(this.Z, 43, i4);
          } else {
            str = Encoding.getUnicode().a(this.Z, 43, i4 * 2);
          }
        }
        localzrr1.a(str);
        break;
      case 1: 
        i3 = zc.a(this.Z, 30);
        if ((i3 > -1) && (i3 < this.f.getDxfs().getCount()))
        {
          localStyle = new Style(paramDataSorter.a.getWorksheets());
          localStyle.copy(paramDataSorter.a.getWorksheets().getDxfs().get(i3));
          localzrr1.b(localStyle);
        }
        break;
      case 2: 
        i3 = zc.a(this.Z, 30);
        if ((i3 > -1) && (i3 < this.f.getDxfs().getCount()))
        {
          localStyle = new Style(paramDataSorter.a.getWorksheets());
          localStyle.copy(paramDataSorter.a.getWorksheets().getDxfs().get(i3));
          localzrr1.c(localStyle);
        }
        break;
      case 3: 
        localzrr1.a(ztr.h(zc.a(this.Z, 30)), zc.a(this.Z, 34));
        break;
      }
      if ((i2 & 0xFFFF & 0x1) != 0) {
        localzrr1.a(1);
      }
      paramDataSorter.a(localzrr1);
      int i5;
      if (paramDataSorter.getSortLeftToRight())
      {
        i3 = zc.a(this.Z, 14);
        i5 = zc.a(this.Z, 18);
      }
      else
      {
        i3 = zc.a(this.Z, 22);
        i5 = zc.a(this.Z, 26);
      }
      localzrr1.b(i3);
      while (i3 < i5)
      {
        i3++;
        zrr localzrr2 = new zrr(paramDataSorter);
        localzrr2.a(localzrr1);
        localzrr2.b(i3);
        paramDataSorter.a(localzrr2);
      }
    }
  }
  
  byte[] a()
  {
    return this.Z;
  }
  
  int b()
  {
    return this.X;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */