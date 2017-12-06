package com.aspose.cells;

import com.aspose.cells.a.c.zi;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;
import java.util.Iterator;

class zbyz
{
  private Workbook a;
  private WorksheetCollection b;
  private zbst c;
  private zbzv d;
  private boolean e;
  private Cells f;
  private RowCollection g;
  private TxtLoadOptions h;
  private HashMap i;
  private zik j;
  private zhz k;
  private zavm l = null;
  private zgs m = new zgs();
  private HashMap n = null;
  private ICustomParser[] o;
  private boolean p;
  private zzx q;
  private boolean r;
  private static final za s = new za(new String[] { "TRUE", "FALSE" });
  
  private zbyz(Cells paramCells, TxtLoadOptions paramTxtLoadOptions)
  {
    this.f = paramCells;
    this.b = paramCells.p();
    this.a = this.b.p();
    this.g = paramCells.getRows();
    WorkbookSettings localWorkbookSettings = this.a.getSettings();
    this.q = localWorkbookSettings.f();
    this.p = this.q.c();
    this.r = localWorkbookSettings.getCheckExcelRestriction();
    this.c = ((zbst)this.b.g);
    this.i = this.c.e();
    this.d = ((zbzv)this.b.C());
    this.h = paramTxtLoadOptions;
    this.o = paramTxtLoadOptions.getPreferredParsers();
    if (this.o != null) {
      this.l = new zavm();
    }
    if (paramTxtLoadOptions.getConvertNumericData())
    {
      this.j = this.q.h();
      this.l = new zavm();
      if (paramTxtLoadOptions.d()) {
        this.n = new HashMap();
      }
    }
    if (paramTxtLoadOptions.getConvertDateTimeData())
    {
      this.k = this.q.i();
      if (!paramTxtLoadOptions.getConvertNumericData())
      {
        this.l = new zavm();
        if (paramTxtLoadOptions.d()) {
          this.n = new HashMap();
        }
      }
    }
  }
  
  static void a(String paramString, Cells paramCells, int paramInt1, int paramInt2, TxtLoadOptions paramTxtLoadOptions)
    throws Exception
  {
    zbyz localzbyz = new zbyz(paramCells, paramTxtLoadOptions);
    localzbyz.a(paramString, paramInt1, paramInt2);
  }
  
  static void a(zn paramzn, Cells paramCells, int paramInt1, int paramInt2, TxtLoadOptions paramTxtLoadOptions)
    throws Exception
  {
    zbyz localzbyz = new zbyz(paramCells, paramTxtLoadOptions);
    localzbyz.a(paramzn, paramInt1, paramInt2);
  }
  
  private zavp a(String paramString, int paramInt)
  {
    if (zw.b(paramString)) {
      return null;
    }
    if (this.o != null)
    {
      ICustomParser localICustomParser = this.o[(this.o.length - 1)];
      if (localICustomParser != null)
      {
        Object localObject = localICustomParser.parseObject(paramString);
        if (localObject != null)
        {
          this.l.a(6);
          this.l.a(localObject);
          this.l.a(localICustomParser.getFormat());
          return this.l;
        }
      }
    }
    switch (s.a(paramString.toUpperCase()))
    {
    case 0: 
      this.l.a(0);
      this.l.a(znq.d);
      this.l.a(null);
      return this.l;
    case 1: 
      this.l.a(0);
      this.l.a(znq.e);
      this.l.a(null);
      return this.l;
    }
    if (this.i.get(paramString) != null) {
      return null;
    }
    if ((this.h.getConvertNumericData()) && (this.j.parseObject(paramString) != null)) {
      return this.j.a();
    }
    if ((this.h.getConvertDateTimeData()) && (this.k.parseObject(paramString) != null)) {
      return this.k.a();
    }
    return null;
  }
  
  private int a(zt paramzt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, StringBuilder paramStringBuilder)
  {
    if (paramStringBuilder.length() == 0) {
      return paramInt2;
    }
    String str = zs.a(paramStringBuilder);
    paramInt2 = paramzt.a(paramInt3, paramInt2);
    Cell localCell;
    if (paramInt2 > -1) {
      switch (paramzt.h(paramInt2))
      {
      case 4: 
      case 5: 
        localCell = new Cell(new Row(this.f, this.g, paramzt, false), paramInt2);
        localCell.f();
        break;
      }
    }
    if ((str.startsWith("=")) && (this.h.hasFormula()))
    {
      this.m.a(paramInt3);
      if (paramInt2 < 0)
      {
        paramInt2 = -paramInt2 - 1;
        paramzt.a(paramInt2, this.m);
      }
      localCell = new Cell(new Row(this.f, this.g, paramzt, false), paramInt2);
      localCell.setFormula(str);
    }
    else if (((this.h.getConvertNumericData()) || (this.h.getConvertDateTimeData())) && (str.length() < 30))
    {
      localCell = this.h.d() ? this.n.get(str) : null;
      Object localObject1;
      if (localCell != null)
      {
        zgs localzgs1;
        if (this.e)
        {
          if (paramInt2 < 0)
          {
            paramInt2 = -paramInt2 - 1;
            localzgs1 = (zgs)localCell;
            localzgs1.a = ((short)paramInt3);
            paramzt.a(paramInt2, localzgs1);
          }
          else
          {
            paramzt.b(paramInt2, (zgs)localCell, 6);
          }
        }
        else
        {
          zgs localzgs3;
          int i4;
          if (paramInt2 < 0)
          {
            paramInt2 = -paramInt2 - 1;
            if ((localCell instanceof zgs))
            {
              localzgs1 = (zgs)localCell;
              localzgs1.a = ((short)paramInt3);
              paramzt.a(paramInt2, localzgs1);
            }
            else
            {
              int i1 = Cell.a(this.f, paramInt1, paramInt3);
              localObject1 = (Object[])localCell;
              localzgs3 = (zgs)localObject1[0];
              localzgs3.a = ((short)paramInt3);
              if (i1 < 0)
              {
                if (localzgs3.b < 0) {
                  localzgs3.b = this.d.a(((Integer)localObject1[2]).intValue(), (String)localObject1[1], -1);
                }
                paramzt.a(paramInt2, localzgs3);
              }
              else
              {
                i4 = localzgs3.b;
                localzgs3.b = this.d.a(((Integer)localObject1[2]).intValue(), (String)localObject1[1], i1);
                paramzt.a(paramInt2, localzgs3);
                localzgs3.b = i4;
              }
            }
          }
          else if ((localCell instanceof zgs))
          {
            zgs localzgs2 = (zgs)localCell;
            paramzt.b(paramInt2, localzgs2);
          }
          else
          {
            int i2 = paramzt.g(paramInt2);
            if (i2 < 0) {
              i2 = Cell.a(this.f, paramInt1, paramInt3);
            }
            localObject1 = (Object[])localCell;
            localzgs3 = (zgs)localObject1[0];
            if (i2 < 0)
            {
              if (localzgs3.b < 0) {
                localzgs3.b = this.d.a(((Integer)localObject1[2]).intValue(), (String)localObject1[1], -1);
              }
              paramzt.b(paramInt2, localzgs3, 6);
            }
            else
            {
              i4 = localzgs3.b;
              localzgs3.b = this.d.a(((Integer)localObject1[2]).intValue(), (String)localObject1[1], i2);
              paramzt.b(paramInt2, localzgs3, 6);
              localzgs3.b = i4;
            }
          }
        }
      }
      else
      {
        this.m.a(paramInt3);
        zavp localzavp = a(str, paramInt3 - paramInt4);
        if (localzavp != null)
        {
          localObject1 = localzavp.e();
          int i3 = -1;
          Object localObject2;
          switch (localzavp.a())
          {
          case 1: 
            localObject2 = (DateTime)localzavp.d();
            if (!((zavo)localzavp).a(this.q))
            {
              this.m.c = 4;
              this.m.d = this.c.a(str);
              localObject1 = null;
            }
            else
            {
              if (this.h.getLoadStyleStrategy() == 1) {
                i3 = localzavp.b();
              } else if (this.h.getLoadStyleStrategy() == 0) {
                localObject1 = null;
              }
              zayi.a(zbxa.a((DateTime)localObject2, this.p), this.m);
            }
            break;
          case 4: 
            if ((localzavp instanceof zavq)) {
              zayi.a(((zavq)localzavp).i(), this.m);
            } else {
              zayi.a(((Double)localzavp.d()).doubleValue(), this.m);
            }
            if (localObject1 != null) {
              if (this.h.getLoadStyleStrategy() == 1) {
                i3 = localzavp.b();
              } else if (this.h.getLoadStyleStrategy() == 0) {
                localObject1 = null;
              }
            }
            break;
          case 0: 
            this.m.c = 2;
            this.m.d = localzavp.d();
            break;
          case 2: 
          case 3: 
          default: 
            if (!this.m.a(localzavp.d(), true)) {
              if (this.m.c == 1)
              {
                localObject2 = (DateTime)this.m.d;
                double d1 = zbxa.a((DateTime)localObject2, this.p);
                if (d1 < 0.0D)
                {
                  this.m.c = 4;
                  this.m.d = this.c.a(str);
                  localObject1 = null;
                }
                else
                {
                  if (this.h.getLoadStyleStrategy() == 1) {
                    i3 = localzavp.b();
                  } else if (this.h.getLoadStyleStrategy() == 0) {
                    localObject1 = null;
                  }
                  zayi.a(d1, this.m);
                }
              }
              else
              {
                this.m.c = 4;
                localObject2 = zs.a(this.m.d);
                if ((this.r) && (((String)localObject2).length() > 32767)) {
                  zhw.a(CellsHelper.cellIndexToName(paramzt.i(), paramInt3));
                }
                this.m.d = this.c.a((String)localObject2);
              }
            }
            break;
          }
          int i5;
          if (paramInt2 < 0)
          {
            paramInt2 = -paramInt2 - 1;
            if ((i3 > -1) || (localObject1 != null))
            {
              if (this.e)
              {
                this.m.b = this.d.a(i3, (String)localObject1, -1);
                if (this.h.d()) {
                  this.n.put(str, new zgs(this.m));
                }
              }
              else
              {
                i5 = Cell.a(this.f, paramInt1, paramInt3);
                this.m.b = this.d.a(i3, (String)localObject1, i5);
                if (this.h.d())
                {
                  zgs localzgs4 = new zgs(this.m);
                  if ((i5 > -1) && (i5 != 15)) {
                    localzgs4.b = -1;
                  }
                  this.n.put(str, new Object[] { localzgs4, localObject1, Integer.valueOf(i3) });
                }
              }
            }
            else if (this.h.d()) {
              this.n.put(str, new zgs(this.m));
            }
            paramzt.a(paramInt2, this.m);
          }
          else if ((i3 > -1) || (localObject1 != null))
          {
            i5 = paramzt.g(paramInt2);
            if (i5 < 0) {
              i5 = Cell.a(this.f, paramInt1, paramInt3);
            }
            this.m.b = this.d.a(i3, (String)localObject1, i5);
            if (this.h.d()) {
              this.n.put(str, new zgs(this.m));
            }
            paramzt.b(paramInt2, this.m, 6);
          }
          else
          {
            if (this.h.d()) {
              this.n.put(str, new zgs(this.m));
            }
            paramzt.b(paramInt2, this.m);
          }
        }
        else
        {
          paramInt2 = a(paramzt, paramInt2, paramInt3, str);
        }
      }
    }
    else
    {
      this.m.a(paramInt3);
      paramInt2 = a(paramzt, paramInt2, paramInt3, str);
    }
    paramStringBuilder.delete(0, 0 + paramStringBuilder.length());
    return paramInt2;
  }
  
  private int a(zt paramzt, int paramInt1, int paramInt2, String paramString)
  {
    if ((this.r) && (paramString.length() > 32767)) {
      zhw.a(CellsHelper.cellIndexToName(paramzt.i(), paramInt2));
    }
    byte b1 = ztr.b(paramString);
    if (b1 != -1)
    {
      this.m.c = 3;
      this.m.d = zi.a(b1);
    }
    else
    {
      this.m.c = 4;
      this.m.d = this.c.a(paramString);
    }
    if (paramInt1 < 0)
    {
      paramInt1 = -paramInt1 - 1;
      paramzt.a(paramInt1, this.m);
    }
    else
    {
      paramzt.b(paramInt1, this.m);
    }
    return paramInt1;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.f.getColumns().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Column)((Iterator)localObject1).next();
      if (((Column)localObject2).getIndex() >= paramInt2) {
        if ((((Column)localObject2).e()) && (((Column)localObject2).c() != 15))
        {
          this.e = false;
          return;
        }
      }
    }
    localObject1 = this.f.e();
    if (((zv)localObject1).a() < 1)
    {
      this.e = true;
      return;
    }
    Object localObject2 = ((zv)localObject1).b(paramInt1, -1, false);
    if (localObject2 != null)
    {
      int i1;
      zt localzt;
      zaiv localzaiv;
      do
      {
        i1 = ((zaiv)localObject2).a();
        if (i1 < 0) {
          break;
        }
        localzt = ((zv)localObject1).f(i1);
        if (Row.e(localzt) > -1)
        {
          this.e = false;
          return;
        }
        localzaiv = localzt.b(paramInt2, -1, false);
      } while (localzaiv == null);
      for (;;)
      {
        i1 = localzaiv.a();
        if (i1 < 0) {
          break;
        }
        int i2 = localzt.g(i1);
        if ((i2 != -1) && (i2 != 15))
        {
          this.e = false;
          return;
        }
      }
    }
    this.e = true;
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
    throws Exception
  {
    ze localze = zd.a(paramString, 3, 1, 3);
    zn localzn = this.h.a ? new zn(localze) : new zn(localze, this.h.getEncoding());
    if (this.h.c()) {
      b(localzn, paramInt1, paramInt2);
    } else {
      c(localzn, paramInt1, paramInt2);
    }
    localzn.a();
  }
  
  private void a(zn paramzn, int paramInt1, int paramInt2)
    throws Exception
  {
    if (this.h.c()) {
      b(paramzn, paramInt1, paramInt2);
    } else {
      c(paramzn, paramInt1, paramInt2);
    }
  }
  
  private String a(zn paramzn)
    throws Exception
  {
    String str = paramzn.f();
    if ((this.h.isMultiEncoded()) && (this.h.a))
    {
      if ((str == null) || (str.length() <= 0)) {
        return str;
      }
      if ((str.length() == 1) && (str.charAt(0) == 0)) {
        return a(paramzn);
      }
      char[] arrayOfChar = str.toCharArray();
      for (int i1 = arrayOfChar[0] == 0 ? 0 : 1; i1 < arrayOfChar.length; i1 += 2) {
        if (arrayOfChar[i1] != 0) {
          return str;
        }
      }
      if (paramzn.c() == 0)
      {
        paramzn.d();
        if (paramzn.c() == 10)
        {
          paramzn.d();
          if (paramzn.c() == 0) {
            paramzn.d();
          }
        }
      }
      return zw.a(str, "\000", "");
    }
    return str;
  }
  
  private void b(zn paramzn, int paramInt1, int paramInt2)
    throws Exception
  {
    int i1 = this.h.getSeparator();
    paramzn.b().a(0L, 0);
    zug.a(this.f.p().p());
    a(paramInt1, paramInt2);
    this.f.a(1000, 50);
    zv localzv = this.f.e();
    zt localzt = null;
    zbdx localzbdx = new zbdx();
    localzbdx.a(0, this.f);
    int i3 = 0;
    int i4 = paramInt1;
    int i5 = -1;
    int i6 = 0;
    int i7 = 50;
    int i8 = -1;
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramzn.c() != -1)
    {
      String str = a(paramzn);
      if (str != null)
      {
        if (i3 > paramInt2) {
          i7 = Math.max(i3 - paramInt2 + 1, i7);
        }
        i3 = paramInt2;
        i5++;
        i5 = localzv.a(i4, i5);
        int i2;
        if (i5 < 0)
        {
          localzbdx.a = i4;
          i5 = localzv.a(-i5 - 1, localzbdx, i7);
          localzt = localzv.f(i5);
          i2 = -1;
        }
        else
        {
          localzt = localzv.f(i5);
          i2 = Row.e(localzt);
        }
        i6 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
          if (str.charAt(i9) == '"')
          {
            if (localStringBuilder.length() != 0)
            {
              localStringBuilder.append(str.charAt(i9));
            }
            else
            {
              int i10 = 1;
              i9++;
              while (i10 != 0)
              {
                while (i9 < str.length())
                {
                  switch (str.charAt(i9))
                  {
                  case '"': 
                    if (i9 + 1 == str.length())
                    {
                      i10 = 0;
                    }
                    else if (str.charAt(i9 + 1) == '"')
                    {
                      localStringBuilder.append(str.charAt(i9));
                      i9++;
                    }
                    else
                    {
                      i10 = 0;
                    }
                    break;
                  default: 
                    localStringBuilder.append(str.charAt(i9));
                  }
                  if (i10 == 0) {
                    break;
                  }
                  i9++;
                }
                if (i10 != 0)
                {
                  if (paramzn.c() == -1) {
                    break;
                  }
                  localStringBuilder.append("\n");
                  str = a(paramzn);
                  i9 = 0;
                }
              }
            }
          }
          else if (str.charAt(i9) == i1)
          {
            i6 = a(localzt, i2, i6, i3++, paramInt2, localStringBuilder);
            if (i1 == 32)
            {
              i9 += 1;
              while (i9 < str.length())
              {
                if (str.charAt(i9) != ' ')
                {
                  i9--;
                  break;
                }
                i9++;
              }
            }
          }
          else
          {
            localStringBuilder.append(str.charAt(i9));
          }
        }
        if (localStringBuilder.length() > 0) {
          i6 = a(localzt, i2, i6, i3++, paramInt2, localStringBuilder);
        }
        localzt.l(0, 0);
        i4++;
        if (i3 - 1 > i8) {
          i8 = i3 - 1;
        }
      }
    }
    localzv.g(-10, 0);
    this.f.f();
    this.f.a((short)i8);
  }
  
  private void c(zn paramzn, int paramInt1, int paramInt2)
    throws Exception
  {
    String str1 = this.h.getSeparatorString();
    paramzn.b().a(0L, 0);
    zug.a(this.f.p().p());
    a(paramInt1, paramInt2);
    this.f.a(1000, 50);
    zv localzv = this.f.e();
    zt localzt = null;
    zbdx localzbdx = new zbdx();
    localzbdx.a(0, this.f);
    int i2 = 0;
    int i3 = paramInt1;
    int i4 = -1;
    int i5 = 0;
    int i6 = 50;
    int i7 = -1;
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramzn.c() != -1)
    {
      String str2 = paramzn.f();
      if (i2 > paramInt2) {
        i6 = Math.max(i2 - paramInt2 + 1, i6);
      }
      i2 = paramInt2;
      i4++;
      i4 = localzv.a(i3, i4);
      int i1;
      if (i4 < 0)
      {
        localzbdx.a = i3;
        i4 = localzv.a(-i4 - 1, localzbdx, i6);
        localzt = localzv.f(i4);
        i1 = -1;
      }
      else
      {
        localzt = localzv.f(i4);
        i1 = Row.e(localzt);
      }
      i5 = 0;
      for (int i8 = 0; i8 < str2.length(); i8++)
      {
        int i9;
        if (str2.charAt(i8) == '"')
        {
          if (localStringBuilder.length() != 0)
          {
            localStringBuilder.append(str2.charAt(i8));
          }
          else
          {
            i9 = 1;
            i8++;
            while (i9 != 0)
            {
              while (i8 < str2.length())
              {
                switch (str2.charAt(i8))
                {
                case '"': 
                  if (i8 + 1 == str2.length())
                  {
                    i9 = 0;
                  }
                  else if (str2.charAt(i8 + 1) == '"')
                  {
                    localStringBuilder.append(str2.charAt(i8));
                    i8++;
                  }
                  else
                  {
                    i9 = 0;
                  }
                  break;
                default: 
                  localStringBuilder.append(str2.charAt(i8));
                }
                if (i9 == 0) {
                  break;
                }
                i8++;
              }
              if ((i9 != 0) && (paramzn.c() != -1))
              {
                localStringBuilder.append("\n");
                str2 = paramzn.f();
                i8 = 0;
              }
            }
          }
        }
        else if (str2.charAt(i8) == str1.charAt(0))
        {
          i9 = 1;
          for (int i10 = 1; (i10 < str1.length()) && (i8 + i10 < str2.length()); i10++) {
            if (str2.charAt(i8 + i10) != str1.charAt(i10))
            {
              i9 = 0;
              break;
            }
          }
          if (i9 != 0)
          {
            i5 = a(localzt, i1, i5, i2++, paramInt2, localStringBuilder);
            i8 += str1.length() - 1;
          }
          else
          {
            localStringBuilder.append(str2.charAt(i8));
          }
        }
        else
        {
          localStringBuilder.append(str2.charAt(i8));
        }
      }
      if (localStringBuilder.length() > 0) {
        i5 = a(localzt, i1, i5, i2++, paramInt2, localStringBuilder);
      }
      localzt.l(0, 0);
      i3++;
      if (i2 - 1 > i7) {
        i7 = i2 - 1;
      }
    }
    localzv.g(-10, 0);
    this.f.f();
    this.f.a((short)i7);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */