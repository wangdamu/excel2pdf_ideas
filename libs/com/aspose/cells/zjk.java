package com.aspose.cells;

import com.aspose.cells.a.c.zy;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zjk
{
  private int d = 0;
  private String e = null;
  private ArrayList f;
  private ArrayList g;
  Chart a;
  public ArrayList b;
  public byte[] c;
  
  public int a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public ArrayList c()
  {
    return this.f;
  }
  
  public ArrayList d()
  {
    return this.g;
  }
  
  Worksheet e()
  {
    return this.a.getWorksheet();
  }
  
  zjk(Chart paramChart, String paramString, zjk paramzjk)
  {
    this.a = paramChart;
    if (paramString != null) {
      b(paramString);
    }
    if (paramzjk != null)
    {
      this.g = paramzjk.d();
      this.f = paramzjk.c();
    }
  }
  
  zjk(Chart paramChart, zjk paramzjk)
  {
    this(paramChart, null, paramzjk);
  }
  
  zjk(Chart paramChart)
  {
    this.a = paramChart;
  }
  
  void f()
  {
    if (this.c != null)
    {
      zcw localzcw = new zcw(this.a.n());
      this.c = localzcw.a(this.c, -1);
    }
  }
  
  void g()
  {
    if (this.c != null) {
      this.c = zcv.a(this.c, -1, 0, 0, false, null);
    }
  }
  
  public Range[] h()
  {
    if (this.c == null) {
      return null;
    }
    Worksheet localWorksheet = this.a.getWorksheet();
    return zabx.c(2, this, true, this.c, 0, -1, 0, 0, localWorksheet.c(), localWorksheet.getIndex());
  }
  
  public Range i()
  {
    Range[] arrayOfRange = h();
    if (arrayOfRange == null) {
      return null;
    }
    return arrayOfRange[0];
  }
  
  zbap[] j()
  {
    if (this.c == null) {
      return null;
    }
    Worksheet localWorksheet = this.a.getWorksheet();
    return zabx.a(2, this, true, this.c, 0, -1, 0, 0, localWorksheet.c(), localWorksheet.getIndex());
  }
  
  public boolean k()
  {
    return h() != null;
  }
  
  public boolean l()
  {
    if (this.c == null) {
      return true;
    }
    if ((this.b != null) && (this.b.size() > 0)) {
      return true;
    }
    zbap[] arrayOfzbap = j();
    if (arrayOfzbap == null) {
      return false;
    }
    for (int i = 0; i < arrayOfzbap.length; i++)
    {
      zbap localzbap = arrayOfzbap[i];
      zwp localzwp = arrayOfzbap[i].a();
      Cells localCells = null;
      if (localzwp != null)
      {
        if ((localzwp.a & 0xFFFF) != p().v()) {
          return true;
        }
        if (((localzwp.b & 0xFFFF) >= 0) && ((localzwp.b & 0xFFFF) < p().getCount())) {
          localCells = p().get(localzwp.b & 0xFFFF).getCells();
        }
      }
      else
      {
        if (localCells == null) {
          localCells = e().getCells();
        }
        int j = localzbap.b();
        int k = localzbap.f();
        int m = localzbap.d();
        int n = localzbap.h();
        if (j == k)
        {
          if (localCells.getRowHeight(j) != 0.0D) {
            while (m <= n)
            {
              if (localCells.getColumnWidth(m) != 0.0D) {
                return true;
              }
              m++;
            }
          }
        }
        else if (localCells.getColumnWidth(m) != 0.0D) {
          while (j <= k)
          {
            if (localCells.getRowHeight(j) != 0.0D) {
              return true;
            }
            j++;
          }
        }
      }
    }
    return false;
  }
  
  public boolean m()
  {
    if (this.c != null)
    {
      zbap[] arrayOfzbap = j();
      if (arrayOfzbap == null) {
        return false;
      }
      if (arrayOfzbap.length > 1) {
        return a(arrayOfzbap);
      }
      return arrayOfzbap[0].f() > arrayOfzbap[0].b();
    }
    return false;
  }
  
  private boolean a(zbap[] paramArrayOfzbap)
  {
    CellArea localCellArea = CellArea.createCellArea(paramArrayOfzbap[0].b(), paramArrayOfzbap[0].d(), paramArrayOfzbap[0].f(), paramArrayOfzbap[0].h());
    for (int i = 1; i < paramArrayOfzbap.length; i++)
    {
      zbap localzbap = paramArrayOfzbap[i];
      int j = localzbap.b();
      int k = localzbap.d();
      int m = localzbap.f();
      int n = localzbap.h();
      if (j < localCellArea.StartRow) {
        localCellArea.StartRow = j;
      }
      if (m > localCellArea.EndRow) {
        localCellArea.EndRow = m;
      }
      if (k < localCellArea.StartColumn) {
        localCellArea.StartColumn = k;
      }
      if (n > localCellArea.EndColumn) {
        localCellArea.EndColumn = n;
      }
    }
    return localCellArea.StartRow != localCellArea.EndRow;
  }
  
  public boolean n()
  {
    if (this.c != null)
    {
      int i = w();
      switch (this.c[i])
      {
      case 42: 
      case 43: 
      case 60: 
      case 61: 
      case 74: 
      case 75: 
      case 92: 
      case 93: 
      case 106: 
      case 107: 
      case 124: 
      case 125: 
        return true;
      }
    }
    return false;
  }
  
  boolean o()
  {
    if (this.c != null)
    {
      int i = w();
      switch (this.c[i])
      {
      case 35: 
      case 67: 
      case 99: 
        return true;
      }
    }
    return false;
  }
  
  WorksheetCollection p()
  {
    return this.a.n();
  }
  
  public String q()
  {
    switch (this.d)
    {
    case 2: 
      return p().d().a(-1, -1, this.c, 0, 0, false, false);
    case 1: 
    case 3: 
      return zjo.b(this.b);
    }
    return "";
  }
  
  private int w()
  {
    return p().p().h() ? 4 : 2;
  }
  
  public String b(int paramInt)
  {
    if (zum.a(paramInt))
    {
      Name localName = null;
      int i = w();
      switch (this.c[w()])
      {
      case 35: 
      case 67: 
      case 99: 
        localName = p().getNames().get(zc.b(this.c, i + 1) - 1);
        break;
      case 57: 
      case 89: 
      case 105: 
        int j = zc.b(this.c, i + 1);
        int k = p().r().a(p(), j);
        if (k != -1) {
          localName = p().getNames().get(zc.b(this.c, i + 3) - 1);
        }
        break;
      }
      if (localName != null) {
        return localName.getRefersTo();
      }
    }
    return q();
  }
  
  public ArrayList a(boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt, boolean[] paramArrayOfBoolean)
  {
    if ((paramBoolean2) && (this.b != null) && (this.b.size() > 0)) {
      return zjo.a(this.b, b(), paramBoolean1, paramBoolean2, paramArrayOfInt);
    }
    if (this.c != null)
    {
      paramArrayOfInt[0] = a(paramBoolean1);
      if (paramArrayOfInt[0] > 1) {
        return a(paramBoolean1, paramArrayOfInt);
      }
    }
    paramArrayOfInt[0] = 1;
    ArrayList localArrayList = a(false, paramBoolean2, paramArrayOfBoolean, false);
    return localArrayList;
  }
  
  private int a(boolean paramBoolean)
  {
    int i = 1;
    zbap[] arrayOfzbap = j();
    if (arrayOfzbap == null) {
      return i;
    }
    for (int j = 0; j < arrayOfzbap.length; j++)
    {
      zbap localzbap = arrayOfzbap[j];
      int k = localzbap.b();
      int m = localzbap.f();
      int n = localzbap.d();
      int i1 = localzbap.h();
      if ((k != m) && (n != i1))
      {
        int i2 = 0;
        if (paramBoolean) {
          i2 = i1 - n + 1;
        } else {
          i2 = m - k + 1;
        }
        if (i2 > i) {
          i = i2;
        }
      }
    }
    return i;
  }
  
  ArrayList a(boolean paramBoolean, int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    boolean[] arrayOfBoolean = new boolean[paramArrayOfInt[0]];
    for (int j = 0; j < paramArrayOfInt[0]; j++) {
      zf.a(localArrayList, new ArrayList());
    }
    j = 1;
    zbap[] arrayOfzbap = j();
    if (arrayOfzbap == null)
    {
      paramArrayOfInt[0] = 1;
      return (ArrayList)localArrayList.get(0);
    }
    for (int k = 0; k < arrayOfzbap.length; k++)
    {
      zbap localzbap = arrayOfzbap[k];
      Object localObject1 = localzbap.b();
      Object localObject2 = localzbap.f();
      Object localObject3 = localzbap.d();
      Object localObject4 = localzbap.h();
      zwp localzwp = localzbap.a();
      Object localObject5;
      Object localObject6;
      Object localObject7;
      if ((localzwp.a & 0xFFFF) != p().v())
      {
        if ((this.b != null) && (this.b.size() != 0))
        {
          localObject5 = new ArrayList();
          localObject6 = this.b.iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject7 = ((Iterator)localObject6).next();
            if ((paramArrayOfInt[0] == 2) && (localObject7 != null))
            {
              String str1 = zs.a(localObject7);
              if (str1.startsWith("\n"))
              {
                String str2 = str1.substring(1);
                zf.a((ArrayList)localObject5, new zjt(str2, 0, null));
              }
              else
              {
                zf.a((ArrayList)localObject5, new zjt(localObject7, 0, null));
              }
            }
            else
            {
              zf.a((ArrayList)localObject5, new zjt(localObject7, 0, null));
            }
          }
          paramArrayOfInt[0] = 1;
          return (ArrayList)localObject5;
        }
        paramArrayOfInt[0] = 1;
        localObject5 = new ArrayList();
        a((ArrayList)localObject5, false, localObject1, localObject3, localObject2, localObject4, localzwp.a & 0xFFFF, localzwp.b & 0xFFFF);
        return (ArrayList)localObject5;
      }
      if (((localzwp.b & 0xFFFF) < 0) || ((localzwp.b & 0xFFFF) >= p().getCount()))
      {
        paramArrayOfInt[0] = 1;
        if ((this.b != null) && (this.b.size() != 0))
        {
          localObject5 = new ArrayList();
          localObject6 = this.b.iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject7 = ((Iterator)localObject6).next();
            zf.a((ArrayList)localObject5, new zjt(localObject7, 0, null));
          }
          return (ArrayList)localObject5;
        }
        return null;
      }
      if ((localObject3 != localObject4) && (localObject1 != localObject2))
      {
        localObject5 = p().get(localzwp.b & 0xFFFF).getCells();
        if (localObject2 > ((Cells)localObject5).e(0)) {
          localObject2 = ((Cells)localObject5).e(0);
        }
        localObject6 = null;
        int n;
        if (paramBoolean) {
          for (localObject7 = localObject1; localObject7 <= localObject2; localObject7++) {
            for (n = 0; n < paramArrayOfInt[0]; n++)
            {
              localObject6 = a((ArrayList)localArrayList.get(n), (Cells)localObject5, localObject7, localObject3 + n, false, false, 1);
              if (!((zjt)localObject6).e)
              {
                arrayOfBoolean[n] = true;
                i = 1;
              }
            }
          }
        } else {
          for (localObject7 = localObject3; localObject7 <= localObject4; localObject7++) {
            for (n = 0; n < paramArrayOfInt[0]; n++)
            {
              localObject6 = a((ArrayList)localArrayList.get(n), (Cells)localObject5, localObject1 + n, localObject7, false, false, 1);
              if (!((zjt)localObject6).e)
              {
                arrayOfBoolean[n] = true;
                i = 1;
              }
            }
          }
        }
      }
    }
    if (i != 0)
    {
      k = 0;
      int m = 0;
      while (m < arrayOfBoolean.length)
      {
        if (arrayOfBoolean[m] == 0)
        {
          localArrayList.remove(k--);
          paramArrayOfInt[0] -= 1;
        }
        m++;
        k++;
      }
      if (localArrayList.size() == 1)
      {
        paramArrayOfInt[0] = 1;
        return (ArrayList)localArrayList.get(0);
      }
      return localArrayList;
    }
    paramArrayOfInt[0] = 1;
    return (ArrayList)localArrayList.get(0);
  }
  
  void b(String paramString)
  {
    if (zw.b(paramString))
    {
      this.c = null;
      return;
    }
    Object localObject;
    if (paramString.charAt(0) == '{')
    {
      if (paramString.charAt(paramString.length() - 1) == '}')
      {
        localObject = paramString.substring(1, 1 + (paramString.length() - 2)).trim();
        if ("".equals(localObject)) {
          throw new CellsException(6, "Invalid Chart data.");
        }
        ArrayList localArrayList = zjo.a((String)localObject);
        this.b = new ArrayList();
        this.d = 1;
        for (int i = 0; i < localArrayList.size(); i++)
        {
          String str2 = (String)localArrayList.get(i);
          try
          {
            if (zarb.b(str2))
            {
              double d1 = zauj.C(str2);
              zf.a(this.b, Double.valueOf(d1));
            }
            else if (ztr.d(str2))
            {
              zf.a(this.b, str2);
            }
            else if ((str2 != null) && (zy.a(str2, "TRUE")))
            {
              zf.a(this.b, Double.valueOf(1.0D));
            }
            else if ((str2 != null) && (zy.a(str2, "FALSE")))
            {
              zf.a(this.b, Double.valueOf(0.0D));
            }
            else
            {
              this.d = 3;
              break;
            }
          }
          catch (Exception localException)
          {
            throw new CellsException(6, "Invalid Chart data.");
          }
        }
        if (this.d == 3)
        {
          this.b.clear();
          for (int j = 0; j < localArrayList.size(); j++)
          {
            String str1 = (String)localArrayList.get(j);
            if ((str1 != null) && (!"".equals(str1)) && (str1.charAt(0) == '"')) {
              str1 = str1.substring(1, 1 + (str1.length() - 2)).trim();
            }
            zf.a(this.b, str1);
          }
        }
      }
      else
      {
        throw new CellsException(6, "Invalide Chart data format.");
      }
    }
    else
    {
      localObject = e();
      this.d = 2;
      if (zaap.a(paramString, ',') != -1)
      {
        if (paramString.startsWith("=")) {
          paramString = paramString.substring(1).trim();
        }
        if (paramString.charAt(0) != '(') {
          paramString = '(' + paramString + ')';
        }
        if (paramString.startsWith("(=")) {
          paramString = zw.a(paramString, "(=", "=(");
        }
      }
      this.c = ((Worksheet)localObject).c().y().a(((Worksheet)localObject).getIndex(), paramString, 0, 0, 0, 32, false, true, true);
    }
  }
  
  private void a(Range paramRange, boolean paramBoolean1, boolean paramBoolean2, ArrayList paramArrayList)
  {
    CellArea localCellArea = paramRange.a();
    int i = localCellArea.StartRow;
    int j = localCellArea.EndRow;
    int k = localCellArea.StartColumn;
    int m = localCellArea.EndColumn;
    Cells localCells = paramRange.b;
    if (i == j) {
      while (k <= m)
      {
        a(paramArrayList, localCells, i, k, paramBoolean1, paramBoolean2, 1);
        k++;
      }
    }
    int n = localCells.e(0);
    if ((i == 0) && (j == 1048575)) {
      j = n;
    }
    if (j > 1000000) {
      j = localCells.getMaxDataRow();
    }
    while (i <= j)
    {
      if (i > n)
      {
        Style localStyle = null;
        zjt localzjt = new zjt();
        zf.a(paramArrayList, localzjt);
        if ((localCells.getRowHeight(i) == 0.0D) || (localCells.getColumnWidth(k) == 0.0D)) {
          localzjt.d = false;
        }
        localzjt.e = true;
        localzjt.g = 3;
        localStyle = zjo.a(localCells, i, k);
        if (paramBoolean1) {
          localzjt.a = Double.valueOf(0.0D);
        } else {
          localzjt.a = "";
        }
        if (localStyle != null)
        {
          localzjt.b = localStyle.getNumber();
          localzjt.c = localStyle.s();
          localzjt.f = localStyle.isDateTime();
        }
      }
      else
      {
        a(paramArrayList, localCells, i, k, paramBoolean1, paramBoolean2, j - i + 1);
      }
      i++;
    }
  }
  
  public ArrayList a(boolean paramBoolean1, boolean paramBoolean2, boolean[] paramArrayOfBoolean, boolean paramBoolean3)
  {
    paramArrayOfBoolean[0] = false;
    int i = (this.b != null) && (this.b.size() != 0) ? 1 : 0;
    ArrayList localArrayList = new ArrayList();
    if ((paramBoolean2) && (i != 0))
    {
      zjo.a(this.b, b(), localArrayList, paramBoolean1);
      return localArrayList;
    }
    if (((this.d == 1) || (this.d == 3)) && (this.b != null))
    {
      zjo.a(this.b, b(), localArrayList, paramBoolean1);
      return localArrayList;
    }
    zbap[] arrayOfzbap = j();
    if (arrayOfzbap == null)
    {
      paramArrayOfBoolean[0] = n();
      if (this.b != null) {
        zjo.a(this.b, b(), localArrayList, paramBoolean1);
      }
      return localArrayList;
    }
    zaca localzaca = x();
    for (int j = 0; j < arrayOfzbap.length; j++)
    {
      zbap localzbap = arrayOfzbap[j];
      zwp localzwp = localzbap.a();
      int k = localzbap.b();
      int m = localzbap.f();
      int n = localzbap.d();
      int i1 = localzbap.h();
      if ((localzwp != null) && ((localzwp.a & 0xFFFF) != p().v()))
      {
        if ((i != 0) && (!a(localzwp.a & 0xFFFF, localzwp.b & 0xFFFF, k, n, m, i1))) {
          paramArrayOfBoolean[0] = true;
        } else {
          a(localArrayList, paramBoolean1, k, n, m, i1, localzwp.a & 0xFFFF, localzwp.b & 0xFFFF);
        }
      }
      else if (((localzwp.b & 0xFFFF) < 0) || ((localzwp.b & 0xFFFF) >= p().getCount()))
      {
        paramArrayOfBoolean[0] = true;
        zf.a(localArrayList, new zjt(Double.valueOf(0.0D), 0, null));
      }
      else
      {
        a(localzbap.b(localzaca), paramBoolean1, paramBoolean3, localArrayList);
      }
    }
    if ((paramArrayOfBoolean[0] != 0) && (this.b != null))
    {
      localArrayList = new ArrayList();
      zjo.a(this.b, b(), localArrayList, paramBoolean1);
      return localArrayList;
    }
    return localArrayList;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    zbti localzbti = p().w().a(paramInt1);
    if ((paramInt2 < 0) || (localzbti.c() == null) || (paramInt2 > localzbti.c().length)) {
      return false;
    }
    zwr localzwr = localzbti.c(paramInt2);
    if ((localzwr != null) && (localzwr.c()))
    {
      Object[][] arrayOfObject = zwm.a(localzwr, paramInt3, paramInt4, paramInt5, paramInt6);
      for (int i = 0; i < arrayOfObject.length; i++) {
        for (int j = 0; j < arrayOfObject[i].length; j++) {
          if (arrayOfObject[i][j] != null) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void a(ArrayList paramArrayList, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    String str = "General";
    zbti localzbti = p().w().a(paramInt5);
    zwr localzwr = localzbti.c(paramInt6);
    int i = (localzwr != null) && (localzwr.c()) ? 1 : 0;
    if ((paramInt6 < 0) || (localzbti.c() == null) || (paramInt6 > localzbti.c().length) || (i == 0))
    {
      if (paramBoolean) {
        zf.a(paramArrayList, new zjt(null, 0, str));
      } else {
        zf.a(paramArrayList, new zjt(null, 0, str));
      }
      return;
    }
    Object[][] arrayOfObject = zwm.a(localzwr, paramInt1, paramInt2, paramInt3, paramInt4);
    for (int j = 0; j < arrayOfObject.length; j++) {
      for (int k = 0; k < arrayOfObject[j].length; k++) {
        if (arrayOfObject[j][k] == null)
        {
          if (paramBoolean) {
            zf.a(paramArrayList, new zjt(null, 0, str));
          } else {
            zf.a(paramArrayList, new zjt(null, 0, str));
          }
        }
        else
        {
          zjt localzjt;
          if (paramBoolean)
          {
            if ((arrayOfObject[j][k] instanceof Double))
            {
              zf.a(paramArrayList, new zjt(arrayOfObject[j][k], 0, str));
            }
            else if ((arrayOfObject[j][k] != null) && (("NA".equals(zs.a(arrayOfObject[j][k]))) || ("#N/A".equals(zs.a(arrayOfObject[j][k])))))
            {
              localzjt = new zjt();
              localzjt.g = 2;
              localzjt.a = "#N/A";
              localzjt.c = str;
              zf.a(paramArrayList, localzjt);
            }
            else
            {
              zf.a(paramArrayList, new zjt(Double.valueOf(0.0D), 0, str));
            }
          }
          else if ((arrayOfObject[j][k] instanceof Double))
          {
            zf.a(paramArrayList, new zjt(arrayOfObject[j][k], 0, str));
          }
          else if ((arrayOfObject[j][k] != null) && (("NA".equals(zs.a(arrayOfObject[j][k]))) || ("#N/A".equals(zs.a(arrayOfObject[j][k])))))
          {
            localzjt = new zjt();
            localzjt.g = 2;
            localzjt.a = "#N/A";
            localzjt.c = str;
            zf.a(paramArrayList, localzjt);
          }
          else
          {
            zf.a(paramArrayList, new zjt(zs.a(arrayOfObject[j][k]), 0, str));
          }
        }
      }
    }
  }
  
  public zjt a(ArrayList paramArrayList, Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3)
  {
    Style localStyle = null;
    Cell localCell = null;
    zjt localzjt = new zjt();
    if ((paramCells.getRowHeight(paramInt1) == 0.0D) || (paramCells.getColumnWidth(paramInt2) == 0.0D)) {
      localzjt.d = false;
    }
    localCell = paramCells.checkCell(paramInt1, paramInt2);
    if (localCell == null)
    {
      localzjt.e = true;
      localzjt.g = 3;
      localStyle = zjo.a(paramCells, paramInt1, paramInt2);
      if (paramBoolean1) {
        localzjt.a = Double.valueOf(0.0D);
      } else {
        localzjt.a = "";
      }
      if (localStyle != null)
      {
        localzjt.b = localStyle.getNumber();
        localzjt.c = localStyle.s();
        localzjt.f = localStyle.isDateTime();
      }
    }
    else
    {
      if ((paramBoolean2) && (!paramBoolean1) && (localCell.getType() == 3) && (localCell.isMerged()) && (paramInt3 > 1)) {
        localCell = localCell.getMergedRange().getCellOrNull(0, 0);
      }
      localzjt.e = false;
      localzjt.g = localCell.getType();
      switch (localCell.getType())
      {
      case 3: 
        localzjt.e = true;
        if (paramBoolean1) {
          localzjt.a = Double.valueOf(0.0D);
        } else {
          localzjt.a = "";
        }
        break;
      default: 
        if (paramBoolean1) {
          localzjt.a = a(localCell);
        } else {
          localzjt.a = a(localCell);
        }
        break;
      }
      localStyle = localCell.p();
      if (localStyle != null)
      {
        if ((localStyle.s() == null) || ("".equals(localStyle.s()))) {
          localzjt.c = p().p().getSettings().f().d(localStyle.getNumber());
        } else {
          localzjt.c = localStyle.s();
        }
        localzjt.b = localStyle.getNumber();
        localzjt.f = localStyle.isDateTime();
      }
      else
      {
        localzjt.c = "";
        localzjt.b = 0;
      }
    }
    zf.a(paramArrayList, localzjt);
    return localzjt;
  }
  
  private Object a(Cell paramCell)
  {
    try
    {
      switch (paramCell.getType())
      {
      case 0: 
        return paramCell.getValue();
      case 1: 
      case 4: 
        return Double.valueOf(paramCell.getDoubleValue());
      case 2: 
      case 3: 
      case 5: 
      case 6: 
        return paramCell.k();
      }
      return Integer.valueOf(0);
    }
    catch (Exception localException) {}
    return Integer.valueOf(0);
  }
  
  public String r()
  {
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    ArrayList localArrayList = a(false, false, arrayOfBoolean, true);
    i = arrayOfBoolean[0];
    if ((i != 0) || (localArrayList == null) || (localArrayList.size() == 0)) {
      return "";
    }
    zjt localzjt = (zjt)localArrayList.get(0);
    return a(localzjt);
  }
  
  private String a(zjt paramzjt)
  {
    switch (paramzjt.g)
    {
    case 1: 
      if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
      {
        double d1 = 0.0D;
        try
        {
          d1 = ((Double)paramzjt.a).doubleValue();
        }
        catch (Exception localException)
        {
          return paramzjt.a();
        }
        String str2 = null;
        str2 = paramzjt.c;
        if (((str2 == null) || ("".equals(str2))) && (paramzjt.b != 0)) {
          str2 = e().d().getSettings().f().d(paramzjt.b);
        }
        DateTime localDateTime = CellsHelper.getDateTimeFromDouble(d1, e().d().getSettings().getDate1904());
        if ((str2 != null) && ("".equals(str2))) {
          str2 = null;
        }
        zzz localzzz2 = e().d().getSettings().f().a(str2, localDateTime, false);
        return localzzz2.h();
      }
      return paramzjt.a();
    }
    if ((paramzjt.a != null) && (!"".equals(paramzjt.a())))
    {
      String str1 = null;
      str1 = paramzjt.c;
      if (((str1 == null) || ("".equals(str1))) && (paramzjt.b != 0)) {
        str1 = e().d().getSettings().f().d(paramzjt.b);
      }
      if ((str1 != null) && ("".equals(str1))) {
        str1 = null;
      }
      zzz localzzz1 = e().d().getSettings().f().a(str1, paramzjt.a, false);
      return localzzz1.h();
    }
    return paramzjt.a();
  }
  
  private zaca x()
  {
    return zabx.a(2, this, p(), this.a.getWorksheet().getIndex(), 0, 0);
  }
  
  public int s()
  {
    if ((this.b != null) && (!k())) {
      return this.b.size();
    }
    zbap[] arrayOfzbap = j();
    if (arrayOfzbap != null)
    {
      int i = 0;
      for (int j = 0; j < arrayOfzbap.length; j++)
      {
        zbap localzbap = arrayOfzbap[j];
        zwp localzwp = localzbap.a();
        int k = localzbap.b();
        int m = localzbap.f();
        int n = localzbap.d();
        int i1 = localzbap.h();
        if (k == m) {
          i += i1 - n + 1;
        } else {
          i += m - k + 1;
        }
      }
      return i;
    }
    return this.b == null ? 0 : this.b.size();
  }
  
  public void a(zjk paramzjk, int paramInt, CopyOptions paramCopyOptions)
  {
    this.d = paramzjk.a();
    if (paramzjk.b != null)
    {
      this.b = new ArrayList(paramzjk.b.size());
      zf.a(this.b, paramzjk.b);
    }
    if (paramzjk.c != null) {
      this.c = zaam.a(paramzjk.c, -1, 0, 0, paramCopyOptions);
    }
    this.e = paramzjk.b();
    this.g = paramzjk.d();
    this.f = paramzjk.c();
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  public boolean t()
  {
    int i = 0;
    if ((this.g == null) || (this.g.size() == 0)) {
      i = 1;
    }
    int j = 0;
    if ((this.f == null) || (this.f.size() == 0)) {
      j = 1;
    }
    if ((i != 0) && (j != 0)) {
      return true;
    }
    if (((i != 0) && (j == 0)) || ((i == 0) && (j != 0))) {
      return false;
    }
    if (this.g.size() != this.f.size()) {
      return false;
    }
    for (int k = 0; k < this.g.size(); k++)
    {
      Object localObject1;
      Object localObject2;
      if (((this.g.get(k) instanceof zjt)) && ((this.f.get(k) instanceof zjt)))
      {
        localObject1 = (zjt)this.g.get(k);
        localObject2 = (zjt)this.f.get(k);
        if (!((zjt)localObject1).a((zjt)localObject2)) {
          return false;
        }
      }
      else if (((this.g.get(k) instanceof ArrayList)) && ((this.f.get(k) instanceof ArrayList)))
      {
        localObject1 = (ArrayList)this.g.get(k);
        localObject2 = (ArrayList)this.f.get(k);
        if (((ArrayList)localObject1).size() != ((ArrayList)localObject2).size()) {
          return false;
        }
        for (int m = 0; m < ((ArrayList)localObject1).size(); m++) {
          if (((((ArrayList)localObject1).get(m) instanceof zjt)) && ((((ArrayList)localObject2).get(m) instanceof zjt)))
          {
            zjt localzjt1 = (zjt)((ArrayList)localObject1).get(m);
            zjt localzjt2 = (zjt)((ArrayList)localObject2).get(m);
            if (!localzjt1.a(localzjt2)) {
              return false;
            }
          }
          else
          {
            return false;
          }
        }
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public void u()
  {
    this.f = this.g;
  }
  
  public void v()
  {
    if (this.c == null) {
      return;
    }
    if (!zaaq.a(this.c, -1, -1, p())) {
      return;
    }
    this.c = null;
    if (this.b == null)
    {
      this.b = new ArrayList();
      zf.a(this.b, Double.valueOf(0.0D));
      this.d = 1;
    }
    else
    {
      switch (this.d)
      {
      case 0: 
      case 2: 
        Iterator localIterator = this.b.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = localIterator.next();
          if (localObject != null) {
            if (((localObject instanceof String)) || ((localObject instanceof Boolean)))
            {
              this.d = 3;
              return;
            }
          }
        }
        this.d = 1;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zjk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */