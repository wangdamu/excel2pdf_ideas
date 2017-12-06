package com.aspose.cells;

import com.aspose.cells.a.c.zv;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.g.a.zb;
import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class WorkbookDesigner
{
  private Workbook a;
  private HashMap b;
  private Object c;
  private ze d;
  private ze e;
  private ISmartMarkerCallBack f;
  private boolean g;
  private boolean h = false;
  private zbqh i = null;
  private ArrayList j;
  private static final com.aspose.cells.b.c.a.za k = new com.aspose.cells.b.c.a.za(new String[] { "label", "labelposition", "labelstyle", "rangeborder", "formula", "arrayformula", "copystyle", "horizontal", "noadd", "numeric", "shift", "group", "picture", "html", "bean", "normal", "repeat", "merge" });
  
  public Workbook getWorkbook()
  {
    return this.a;
  }
  
  public void setWorkbook(Workbook value)
  {
    this.a = value;
  }
  
  public WorkbookDesigner()
  {
    this.a = new Workbook();
    this.b = new HashMap();
    this.d = new ze("\\((.+)\\)", 66);
    this.e = new ze("^\\((.+)\\)$", 66);
  }
  
  public WorkbookDesigner(Workbook workbook)
  {
    this.a = workbook;
    this.b = new HashMap();
    this.d = new ze("\\((.+)\\)", 66);
    this.e = new ze("^\\((.+)\\)$", 66);
  }
  
  public void clearDataSource()
  {
    this.c = null;
    this.b.clear();
  }
  
  public void setDataSource(String variable, Object data)
  {
    if ((variable != null) && (!"".equals(variable)))
    {
      Object localObject;
      Object[] arrayOfObject;
      int m;
      if ((data instanceof int[]))
      {
        localObject = (int[])data;
        arrayOfObject = new Object[localObject.length];
        for (m = 0; m < localObject.length; m++) {
          arrayOfObject[m] = com.aspose.cells.b.a.za.a(localObject, m);
        }
        a(variable, new ziu(variable, arrayOfObject));
      }
      else if ((data instanceof double[]))
      {
        localObject = (double[])data;
        arrayOfObject = new Object[localObject.length];
        for (m = 0; m < localObject.length; m++) {
          arrayOfObject[m] = com.aspose.cells.b.a.za.a(localObject, m);
        }
        a(variable, new ziu(variable, arrayOfObject));
      }
      else if ((data instanceof String[]))
      {
        localObject = (Object[])data;
        a(variable, new ziu(variable, (Object[])localObject));
      }
      else if ((data instanceof Collection))
      {
        localObject = (Collection)data;
        a(variable, zbqd.a((Collection)localObject));
      }
      else
      {
        localObject = new Object[] { data };
        a(variable, new ziu(variable, (Object[])localObject));
      }
    }
  }
  
  public void setDataSource(String variable, Object[] dataArray)
  {
    if ((variable != null) && (!"".equals(variable))) {
      a(variable, new ziu(variable, dataArray));
    }
  }
  
  private void a(zbqh paramzbqh)
    throws Exception
  {
    Worksheet localWorksheet = paramzbqh.a();
    b(localWorksheet.getCells(), paramzbqh);
    int m = -1;
    boolean bool = false;
    ArrayList localArrayList = new ArrayList();
    for (int n = 0; n < paramzbqh.getCount(); n++)
    {
      zbqc localzbqc = paramzbqh.a(n);
      if (localzbqc.h)
      {
        if (m == -1)
        {
          m = localzbqc.b;
        }
        else if (m != localzbqc.b)
        {
          if (localArrayList.size() != 0) {
            a(localWorksheet.getCells(), m, localArrayList, bool);
          }
          m = localzbqc.b;
          localArrayList.clear();
          bool = false;
        }
        if (localzbqc.w) {
          bool = true;
        }
        zf.a(localArrayList, localzbqc);
      }
    }
    if (localArrayList.size() != 0) {
      a(localWorksheet.getCells(), m, localArrayList, bool);
    }
  }
  
  private void a(Cells paramCells, int paramInt, ArrayList paramArrayList)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramInt;
    DataSorter localDataSorter = new DataSorter(getWorkbook());
    int m = 0;
    for (int n = 0; n < paramArrayList.size(); n++)
    {
      zbqc localzbqc = (zbqc)paramArrayList.get(n);
      if (n == 0)
      {
        localCellArea.StartColumn = localzbqc.c;
        localCellArea.EndRow = (localzbqc.c() + paramInt);
      }
      localCellArea.EndColumn = localzbqc.c;
      if ((localzbqc.h) && (localzbqc.K != -1))
      {
        if ((localzbqc.a == 1) || (localzbqc.a == 2)) {
          m = 1;
        }
        zrr localzrr = new zrr(localDataSorter);
        int i1 = localzbqc.K - 1;
        localzrr.b(localzbqc.c);
        localzrr.a(localzbqc.L ? 0 : 1);
        if (i1 >= localDataSorter.a().size()) {
          zf.a(localDataSorter.a(), localzrr);
        } else {
          localDataSorter.a().add(i1, localzrr);
        }
      }
    }
    if (m != 0) {
      this.a.calculateFormula();
    }
    localDataSorter.sort(paramCells, localCellArea);
  }
  
  private void a(Cells paramCells, int paramInt, ArrayList paramArrayList, boolean paramBoolean)
    throws Exception
  {
    zbqc localzbqc = null;
    ArrayList localArrayList1 = new ArrayList();
    zf.a(localArrayList1, paramArrayList);
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      localzbqc = (zbqc)paramArrayList.get(m);
      localzbqc.a();
      if (localzbqc.a == 1)
      {
        String str = zbqd.a(localzbqc.r, localzbqc.b, localzbqc.c);
        paramCells.a(localzbqc.b, localzbqc.c, false).setFormula(str);
        paramArrayList.remove(m--);
      }
    }
    Object localObject = null;
    int n;
    while (paramArrayList.size() > 0)
    {
      localzbqc = null;
      for (n = 0; n < paramArrayList.size(); n++)
      {
        localzbqc = (zbqc)paramArrayList.get(n);
        if (localzbqc.a == 0) {
          break;
        }
        localzbqc = null;
      }
      if (localzbqc == null) {
        break;
      }
      switch (localzbqc.a)
      {
      case 0: 
        n = 0;
        boolean[] arrayOfBoolean = { n };
        ArrayList localArrayList2 = a(paramArrayList, localzbqc.r, true, arrayOfBoolean, true);
        n = arrayOfBoolean[0];
        ICellsDataTable localICellsDataTable = a(localzbqc.r);
        int i1;
        if (localICellsDataTable.getCount() == 0)
        {
          for (i1 = 0; i1 < localArrayList2.size(); i1++)
          {
            localzbqc = (zbqc)localArrayList2.get(i1);
            switch (localzbqc.a)
            {
            case 2: 
              a(localzbqc, paramCells, localzbqc.d, localzbqc.e);
            }
          }
        }
        else if (n != 0)
        {
          a(paramCells, localArrayList2, localICellsDataTable);
        }
        else
        {
          i1 = 0;
          for (int i2 = 0; i2 < localArrayList2.size(); i2++)
          {
            localzbqc = (zbqc)localArrayList2.get(i2);
            if ((localzbqc.a == 0) && (localzbqc.q > i1)) {
              i1 = localzbqc.q;
            }
          }
          for (i2 = 0; i2 < localArrayList2.size(); i2++)
          {
            localzbqc = (zbqc)localArrayList2.get(i2);
            if ((localzbqc.a == 2) && (localzbqc.q == 0)) {
              localzbqc.q = i1;
            }
          }
          localICellsDataTable.beforeFirst();
          while (localICellsDataTable.next())
          {
            i2 = 1;
            for (int i3 = 0; i3 < localArrayList2.size(); i3++)
            {
              localzbqc = (zbqc)localArrayList2.get(i3);
              switch (localzbqc.a)
              {
              case 0: 
                localObject = localICellsDataTable.get(localzbqc.t);
                a(localzbqc, paramCells, localObject);
                localzbqc.d += localzbqc.ac * (localzbqc.q + 1);
                if (i2 < localzbqc.ac) {
                  i2 = localzbqc.ac;
                }
                break;
              case 2: 
                a(localzbqc, paramCells, localzbqc.d, localzbqc.e);
                localzbqc.d += 1 + localzbqc.q;
              }
            }
            if (i2 > 1) {
              for (i3 = 0; i3 < localArrayList2.size(); i3++)
              {
                localzbqc = (zbqc)localArrayList2.get(i3);
                if (localzbqc.a == 2) {
                  for (int i4 = 1; i4 < i2; i4++)
                  {
                    a(localzbqc, paramCells, localzbqc.d, localzbqc.e);
                    localzbqc.d += 1 + localzbqc.q;
                  }
                } else if (i2 > localzbqc.ac) {
                  localzbqc.d += (i2 - localzbqc.ac) * (localzbqc.q + 1);
                }
              }
            }
          }
        }
        break;
      }
    }
    if (paramArrayList.size() != 0) {
      for (n = 0; n < paramArrayList.size(); n++)
      {
        localzbqc = (zbqc)paramArrayList.get(n);
        if (localzbqc.a == 2) {
          a(localzbqc, paramCells, localzbqc.d, localzbqc.e);
        }
      }
    }
    a(paramCells, paramInt, localArrayList1);
  }
  
  private void a(Cells paramCells, ArrayList paramArrayList, ICellsDataTable paramICellsDataTable)
    throws Exception
  {
    boolean bool1 = false;
    zbqc localzbqc = (zbqc)paramArrayList.get(0);
    int m = 0;
    ArrayList localArrayList1 = new ArrayList();
    int n = localzbqc.b;
    HashMap localHashMap1 = new HashMap();
    int i1 = 0;
    ArrayList localArrayList2;
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
    {
      localzbqc = (zbqc)paramArrayList.get(i2);
      if (localzbqc.w)
      {
        localzbqc.y = -1;
        if (localzbqc.x == -1) {
          localzbqc.x = i1;
        }
        i1++;
      }
      else if (localzbqc.D != null)
      {
        for (i3 = 0; i3 < localzbqc.D.length; i3++) {
          if (!localHashMap1.containsKey(localzbqc.D[i3]))
          {
            localArrayList2 = new ArrayList();
            zf.a(localArrayList2, localzbqc);
            localHashMap1.put(localzbqc.D[i3], localArrayList2);
          }
          else
          {
            localArrayList2 = (ArrayList)localHashMap1.get(localzbqc.D[i3]);
            zf.a(localArrayList2, localzbqc);
          }
        }
      }
    }
    zbqc[] arrayOfzbqc = new zbqc[i1];
    for (int i3 = 0; i3 < paramArrayList.size(); i3++)
    {
      localzbqc = (zbqc)paramArrayList.get(i3);
      if (localzbqc.w) {
        arrayOfzbqc[localzbqc.x] = localzbqc;
      }
    }
    HashMap localHashMap2 = null;
    paramICellsDataTable.beforeFirst();
    while (paramICellsDataTable.next())
    {
      Object localObject1;
      if (localHashMap2 != null)
      {
        localArrayList2 = new ArrayList();
        for (int i5 = 0; i5 < arrayOfzbqc.length; i5++)
        {
          localArrayList2.clear();
          localzbqc = arrayOfzbqc[i5];
          Object localObject2 = localHashMap2.get(Integer.valueOf(localzbqc.t));
          Object localObject3 = paramICellsDataTable.get(localzbqc.t);
          boolean bool2 = zbqd.a(localObject2);
          boolean bool3 = zbqd.a(localObject3);
          if (bool2)
          {
            if (bool3) {
              continue;
            }
            if (localzbqc.y == -1)
            {
              localzbqc.y = n;
              localHashMap2.put(Integer.valueOf(localzbqc.t), localObject3);
              zf.a(localArrayList2, localzbqc);
              continue;
            }
          }
          else
          {
            if ((!bool3) && (localObject2.equals(localObject3))) {
              continue;
            }
          }
          while (i5 < arrayOfzbqc.length)
          {
            localzbqc = arrayOfzbqc[i5];
            if (localzbqc.y != -1)
            {
              if (m < localzbqc.q) {
                m = localzbqc.q;
              }
              zf.a(localArrayList1, localzbqc);
              if (localHashMap1.containsKey(localzbqc.s)) {
                bool1 = true;
              }
            }
            i5++;
          }
        }
        if (localArrayList1.size() != 0)
        {
          localObject1 = new int[] { n };
          a(paramCells, (int[])localObject1, localArrayList1, localHashMap1, bool1, paramArrayList, localHashMap2);
          n = localObject1[0];
          for (int i6 = 0; i6 < localArrayList1.size(); i6++)
          {
            localzbqc = (zbqc)localArrayList1.get(i6);
            localzbqc.y = -1;
          }
          for (i6 = 0; i6 < localArrayList2.size(); i6++)
          {
            localzbqc = (zbqc)localArrayList2.get(i6);
            localzbqc.y = n;
          }
          localHashMap2 = a(localHashMap2, paramICellsDataTable, paramArrayList, n);
          m = 0;
          localArrayList1.clear();
          bool1 = false;
        }
      }
      else
      {
        localHashMap2 = a(localHashMap2, paramICellsDataTable, paramArrayList, n);
      }
      for (i4 = 0; i4 < paramArrayList.size(); i4++)
      {
        localzbqc = (zbqc)paramArrayList.get(i4);
        if (localzbqc.a == 2)
        {
          paramCells.a(n, localzbqc.c, false).setFormula(zbqd.a(localzbqc.r, n, localzbqc.c));
        }
        else
        {
          localObject1 = paramICellsDataTable.get(localzbqc.t);
          if ((localzbqc.w) && (localzbqc.b == n) && (zbqd.a(localObject1))) {
            paramCells.a(n, localzbqc.c, false).f();
          } else if ((localzbqc.w) && (localzbqc.y != n))
          {
            if (localzbqc.A == 1) {
              a(localzbqc, n, localzbqc.c, paramCells, localObject1);
            }
          }
          else if (localzbqc.a == 0) {
            a(localzbqc, n, localzbqc.c, paramCells, localObject1);
          }
        }
      }
      n++;
    }
    for (int i4 = 0; i4 < paramArrayList.size(); i4++)
    {
      localzbqc = (zbqc)paramArrayList.get(i4);
      if ((localzbqc.w) && (localzbqc.y != -1)) {
        zf.a(localArrayList1, localzbqc);
      }
      if ((localzbqc.a != 2) && (localHashMap1.containsKey(localzbqc.s))) {
        bool1 = true;
      }
    }
    int[] arrayOfInt = { n };
    a(paramCells, arrayOfInt, localArrayList1, localHashMap1, bool1, paramArrayList, localHashMap2);
    n = arrayOfInt[0];
  }
  
  private void a(Cells paramCells, int[] paramArrayOfInt, ArrayList paramArrayList1, HashMap paramHashMap1, boolean paramBoolean, ArrayList paramArrayList2, HashMap paramHashMap2)
  {
    zbqc localzbqc = null;
    int m = paramArrayOfInt[0];
    Row localRow1 = null;
    boolean bool = false;
    for (int n = paramArrayList2.size() - 1; n >= 0; n--)
    {
      localzbqc = (zbqc)paramArrayList2.get(n);
      if (localzbqc.H != null) {
        localRow1 = localzbqc.H;
      }
      if (localzbqc.i) {
        bool = localzbqc.i;
      }
    }
    if ((paramBoolean) && (bool) && (localRow1 != null) && (paramArrayOfInt[0] != localRow1.getIndex()))
    {
      Row localRow2 = paramCells.getRows().a(paramArrayOfInt[0], false, true, false);
      localRow2.a(localRow1);
      for (i2 = 0; i2 < localRow1.a(); i2++)
      {
        Cell localCell1 = localRow1.getCellByIndex(i2);
        localRow2.c(localCell1.getColumn()).b(localCell1.s());
      }
    }
    int i1 = 0;
    for (int i2 = paramArrayList1.size() - 1; i2 >= 0; i2--)
    {
      localzbqc = (zbqc)paramArrayList1.get(i2);
      int i3 = 0;
      int i4 = 16383;
      int i5 = -1;
      int i6 = localzbqc.y;
      int i7 = 0;
      if (paramBoolean)
      {
        Object localObject2;
        if (paramHashMap1.containsKey(localzbqc.s))
        {
          ArrayList localArrayList = (ArrayList)paramHashMap1.get(localzbqc.s);
          for (int i9 = 0; i9 < localArrayList.size(); i9++)
          {
            localObject2 = (zbqc)localArrayList.get(i9);
            Cell localCell2 = paramCells.a(paramArrayOfInt[0], ((zbqc)localObject2).c, false);
            Object localObject3;
            if (((zbqc)localObject2).C != null)
            {
              localCell2.setFormula(zbqd.a(((zbqc)localObject2).C, true, i6, ((zbqc)localObject2).c, paramArrayOfInt[0] - 1, ((zbqc)localObject2).c));
            }
            else
            {
              localObject3 = CellsHelper.a(i6, ((zbqc)localObject2).c, paramArrayOfInt[0] - 1, ((zbqc)localObject2).c);
              localCell2.setFormula("=SUBTOTAL(" + ((zbqc)localObject2).B + "," + (String)localObject3 + ")");
            }
            if (((zbqc)localObject2).G != -1) {
              localCell2.b(((zbqc)localObject2).G);
            }
            if ((((zbqc)localObject2).E != null) && (((zbqc)localObject2).E.get(localzbqc.s) != null))
            {
              localObject3 = (zbqe)((zbqc)localObject2).E.get(localzbqc.s);
              localCell2 = paramCells.a(paramArrayOfInt[0], ((zbqc)localObject2).c + ((zbqe)localObject3).b, false);
              localCell2.putValue(zw.a(((zbqe)localObject3).a, new Object[] { paramHashMap2.get(Integer.valueOf(localzbqc.t)) }));
              if (((zbqe)localObject3).c != 65281) {
                localCell2.b(((zbqe)localObject3).c);
              }
              if ((localzbqc.A == 2) && (((zbqc)localObject2).c + ((zbqe)localObject3).b == localzbqc.e)) {
                i7 = 1;
              }
              if ((((zbqe)localObject3).d) && (((zbqe)localObject3).b < 0))
              {
                if (localCell2.getColumn() < i4) {
                  i4 = localCell2.getColumn();
                }
                if (((zbqc)localObject2).c > i5) {
                  i5 = ((zbqc)localObject2).c;
                }
              }
            }
          }
          i3++;
        }
        Object localObject1;
        for (int i8 = 0; i8 < paramArrayList2.size(); i8++)
        {
          localObject1 = (zbqc)paramArrayList2.get(i8);
          if (((zbqc)localObject1).I != null)
          {
            localObject2 = paramCells.a(paramArrayOfInt[0], ((zbqc)localObject1).c, false);
            ((Cell)localObject2).b(((zbqc)localObject1).G);
            if (((zbqc)localObject1).J) {
              ((Cell)localObject2).setFormula(zbqd.a(((zbqc)localObject1).I, ((Cell)localObject2).getRow(), ((Cell)localObject2).getColumn()));
            } else {
              ((Cell)localObject2).putValue(((zbqc)localObject1).I);
            }
          }
          else if ((((zbqc)localObject1).G != -1) && (paramHashMap1.containsKey(localzbqc.s)))
          {
            localObject2 = paramCells.a(paramArrayOfInt[0], ((zbqc)localObject1).c, false);
            ((Cell)localObject2).b(((zbqc)localObject1).G);
          }
        }
        if (i5 > 0) {
          for (i8 = i4; i8 < i5; i8++)
          {
            localObject1 = paramCells.a(paramArrayOfInt[0], i8, false);
            localObject2 = ((Cell)localObject1).getStyle(false);
            if (((Style)localObject2).getBorders().getByBorderType(2).getLineStyle() != 0)
            {
              ((Style)localObject2).getBorders().getByBorderType(2).setLineStyle(0);
              ((Cell)localObject1).setStyle((Style)localObject2);
            }
          }
        }
      }
      switch (localzbqc.A)
      {
      case 2: 
        paramCells.merge(i6, localzbqc.c, paramArrayOfInt[0] - i6 + i3 - i7, 1);
        break;
      case 0: 
        break;
      }
      if (localzbqc.q > 0) {
        if (i3 != 0) {
          i3 += localzbqc.q;
        } else if (localzbqc.q > i1) {
          i1 = localzbqc.q;
        }
      }
      paramArrayOfInt[0] += i3;
    }
    paramArrayOfInt[0] += i1;
  }
  
  private void a(Cells paramCells, zbqc paramzbqc, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    throws Exception
  {
    zh localzh = new zh((byte[])paramArrayOfByte);
    if (paramzbqc.P)
    {
      zj localzj = zj.a(localzh);
      int n = paramCells.getColumnWidthPixel(paramInt2);
      int i1 = paramCells.getRowHeightPixel(paramInt1);
      int i2 = (int)(i1 * 100.0F / localzj.h() + 0.5D);
      int i3 = (int)(n * 100.0F / localzj.i() + 0.5D);
      paramCells.g().getPictures().a(paramInt1, paramInt2, localzh, i3, i2);
    }
    else if (paramzbqc.Q)
    {
      paramCells.g().getPictures().a(paramInt1, paramInt2, localzh, paramzbqc.aa, paramzbqc.Z);
    }
    else
    {
      int m = paramCells.g().getPictures().a(paramInt1, paramInt2, localzh);
      Picture localPicture = paramCells.g().getPictures().get(m);
      if (paramzbqc.R) {
        localPicture.setLeft(paramzbqc.S);
      }
      if (paramzbqc.T) {
        localPicture.setTop(paramzbqc.U);
      }
      if (paramzbqc.V) {
        localPicture.setWidth(paramzbqc.W);
      }
      if (paramzbqc.X) {
        localPicture.setHeight(paramzbqc.Y);
      }
    }
    Cell localCell = paramCells.checkCell(paramInt1, paramInt2);
    if (localCell != null) {
      localCell.putValue((String)null);
    }
  }
  
  private void a(Cell paramCell, boolean paramBoolean, String paramString, zbqc paramzbqc)
  {
    try
    {
      String str1 = paramString.substring("subtotal".length());
      int m = str1.indexOf(':');
      if (m == -1)
      {
        paramzbqc.B = zp.a(str1.substring(0));
      }
      else
      {
        paramzbqc.B = zp.a(str1.substring(0, 1));
        Object localObject1 = zw.d(str1.substring(m + 1), '&');
        String[] arrayOfString1;
        if ((localObject1[(localObject1.length - 1)] != null) && (localObject1[(localObject1.length - 1)].startsWith("formula")))
        {
          Object localObject2 = localObject1[(localObject1.length - 1)];
          for (int i1 = "formula".length(); i1 < ((String)localObject2).length(); i1++) {
            if (((String)localObject2).charAt(i1) == '=')
            {
              paramzbqc.C = ((String)localObject2).substring(i1);
              break;
            }
          }
          if (paramzbqc.C != null)
          {
            arrayOfString1 = new String[localObject1.length - 1];
            System.arraycopy(localObject1, 0, arrayOfString1, 0, arrayOfString1.length);
            localObject1 = arrayOfString1;
          }
        }
        paramzbqc.D = new String[localObject1.length];
        for (int n = 0; n < localObject1.length; n++)
        {
          arrayOfString1 = localObject1[n];
          String[] arrayOfString2 = zbqd.a(arrayOfString1);
          String[] arrayOfString3 = zw.d(arrayOfString2[0], '.');
          arrayOfString3[1] = zbqd.b(arrayOfString3[1]);
          paramzbqc.D[n] = arrayOfString3[1];
          if (arrayOfString2.length > 1)
          {
            if (paramzbqc.E == null) {
              paramzbqc.E = new HashMap();
            }
            zbqe localzbqe = new zbqe();
            paramzbqc.E.put(paramzbqc.D[n], localzbqe);
            for (int i2 = 1; i2 < arrayOfString2.length; i2++)
            {
              m = arrayOfString2[i2].indexOf(':');
              String str2 = arrayOfString2[i2];
              String str3 = "";
              if (m != -1)
              {
                str2 = arrayOfString2[i2].substring(0, 0 + m).trim();
                str3 = arrayOfString2[i2].substring(m + 1);
              }
              switch (k.a(str2.toLowerCase()))
              {
              case 0: 
                String str4 = str3;
                if (str4.charAt(0) == '"') {
                  str4 = str4.substring(1, 1 + (str4.length() - 2));
                }
                localzbqe.a = str4;
                break;
              case 1: 
                localzbqe.b = zp.a(str3.trim());
                break;
              case 2: 
                if (!"".equals(str3)) {
                  localzbqe.c = zp.a(str3.trim());
                } else {
                  localzbqe.c = localzbqe.b;
                }
                Cell localCell = paramCell.d.get(paramCell.getRow() + (paramBoolean ? 0 : 1), paramCell.getColumn() + localzbqe.c);
                localzbqe.c = localCell.s();
                break;
              case 3: 
                localzbqe.d = true;
              }
            }
          }
        }
      }
    }
    catch (Exception localException) {}
  }
  
  void a(Cell paramCell, zbqc paramzbqc, ArrayList paramArrayList, boolean paramBoolean)
  {
    String str1 = paramCell.k().substring(2);
    String str2 = null;
    int m;
    zc localzc;
    Object localObject1;
    if ((str1.charAt(0) == '=') || (str1.charAt(0) == '&'))
    {
      m = str1.lastIndexOf('~');
      if (m != -1)
      {
        str2 = str1.substring(m + 1);
        localzc = this.e.a(str2);
        if (localzc.c())
        {
          str1 = str1.substring(0, 0 + m);
          str2 = localzc.b().a(1).b();
        }
        else
        {
          str2 = null;
        }
      }
    }
    else if (str1.charAt(0) == '[')
    {
      m = str1.indexOf("].[");
      if (m != -1)
      {
        m = str1.indexOf(']', m + 2) + 1;
        if (m >= str1.length())
        {
          str2 = "";
        }
        else
        {
          str2 = str1.substring(m);
          if ((str2 != null) && (!"".equals(str2)) && (str2.charAt(0) == '(') && (str2.charAt(str2.length() - 1) == ')')) {
            str2 = str2.substring(1, 1 + (str2.length() - 2));
          }
        }
        str1 = str1.substring(0, 0 + m);
      }
      else
      {
        localzc = this.d.a(str1);
        if (localzc.c())
        {
          str2 = localzc.b().a(1).b();
          str1 = str1.substring(0, 0 + str1.indexOf("("));
        }
      }
    }
    else
    {
      localObject1 = this.d.a(str1);
      if (((zc)localObject1).c())
      {
        str2 = ((zc)localObject1).b().a(1).b();
        str1 = str1.substring(0, 0 + str1.indexOf("("));
      }
    }
    String[] arrayOfString1;
    Object localObject5;
    int i8;
    if (str2 != null)
    {
      arrayOfString1 = zw.d(str2, ',');
      if (arrayOfString1.length > 0) {
        for (String str3 : arrayOfString1)
        {
          localObject5 = str3.trim().toLowerCase();
          switch (k.a((String)localObject5))
          {
          case 4: 
            paramzbqc.g = true;
            break;
          case 5: 
            paramzbqc.f = true;
            break;
          case 6: 
            paramzbqc.j = true;
            paramzbqc.n = paramCell.s();
            break;
          case 7: 
            paramzbqc.h = false;
            break;
          case 8: 
            paramzbqc.i = false;
            break;
          case 9: 
            paramzbqc.v = true;
            break;
          case 10: 
            paramzbqc.i = false;
            paramzbqc.o = true;
            break;
          case 11: 
            paramzbqc.w = true;
            break;
          case 12: 
            paramzbqc.O = true;
            paramzbqc.Q = true;
            break;
          case 13: 
            paramzbqc.N = true;
            break;
          case 14: 
            paramzbqc.M = true;
            break;
          default: 
            if (((String)localObject5).indexOf("skip:") != -1)
            {
              try
              {
                paramzbqc.q = zp.a(((String)localObject5).substring(5));
              }
              catch (Exception localException1) {}
            }
            else if (((String)localObject5).indexOf("shift:") != -1)
            {
              try
              {
                paramzbqc.i = false;
                paramzbqc.o = true;
                paramzbqc.p = zp.a(((String)localObject5).substring(5));
              }
              catch (Exception localException2) {}
            }
            else if (((String)localObject5).indexOf("subtotal") != -1)
            {
              a(paramCell, false, str3, paramzbqc);
            }
            else if (((String)localObject5).indexOf("group:") != -1)
            {
              paramzbqc.w = true;
              localObject5 = ((String)localObject5).substring("group:".length());
              switch (k.a((String)localObject5))
              {
              case 15: 
                paramzbqc.A = 0;
                break;
              case 16: 
                paramzbqc.A = 1;
                break;
              case 17: 
                paramzbqc.A = 2;
                break;
              }
            }
            else if (((String)localObject5).indexOf("grouporder:") != -1)
            {
              paramzbqc.w = true;
              localObject5 = ((String)localObject5).substring("grouporder:".length());
              paramzbqc.x = zp.a((String)localObject5);
            }
            else if (((String)localObject5).indexOf("ascending:") != -1)
            {
              paramzbqc.L = true;
              localObject5 = ((String)localObject5).substring("ascending:".length()).trim();
              paramzbqc.K = zp.a((String)localObject5);
            }
            else if (((String)localObject5).indexOf("descending:") != -1)
            {
              paramzbqc.L = false;
              localObject5 = ((String)localObject5).substring("descending:".length()).trim();
              paramzbqc.K = zp.a((String)localObject5);
            }
            else if (((String)localObject5).indexOf("picture:") != -1)
            {
              paramzbqc.O = true;
              localObject5 = ((String)localObject5).substring("picture:".length()).trim().toLowerCase();
              if ("fittocell".equals(localObject5))
              {
                paramzbqc.P = true;
              }
              else if (((String)localObject5).startsWith("scale"))
              {
                try
                {
                  paramzbqc.Q = true;
                  localObject5 = ((String)localObject5).substring("scale".length());
                  int i6 = ((String)localObject5).indexOf('&');
                  if (i6 != -1)
                  {
                    paramzbqc.aa = zp.a(((String)localObject5).substring(0, 0 + i6));
                    paramzbqc.Z = zp.a(((String)localObject5).substring(i6 + 1));
                  }
                  else
                  {
                    paramzbqc.aa = (paramzbqc.Z = zp.a((String)localObject5));
                  }
                }
                catch (Exception localException3) {}
              }
              else
              {
                paramzbqc.Q = false;
                String[] arrayOfString2 = zw.d((String)localObject5, '&');
                for (i8 = 0; i8 < arrayOfString2.length; i8++) {
                  if (arrayOfString2[i8].startsWith("left:"))
                  {
                    paramzbqc.R = true;
                    paramzbqc.S = zbqd.a(arrayOfString2[i8].substring("left:".length()).trim(), zbxp.a());
                  }
                  else if (arrayOfString2[i8].startsWith("top:"))
                  {
                    paramzbqc.T = true;
                    paramzbqc.U = zbqd.a(arrayOfString2[i8].substring("top:".length()).trim(), zbxp.a());
                  }
                  else if (arrayOfString2[i8].startsWith("width:"))
                  {
                    paramzbqc.V = true;
                    paramzbqc.W = zbqd.a(arrayOfString2[i8].substring("width:".length()).trim(), zbxp.a());
                  }
                  else if (arrayOfString2[i8].startsWith("height:"))
                  {
                    paramzbqc.X = true;
                    paramzbqc.Y = zbqd.a(arrayOfString2[i8].substring("Height:".length()).trim(), zbxp.a());
                  }
                }
              }
            }
            break;
          }
        }
      }
    }
    Object localObject4;
    if (!paramzbqc.i)
    {
      int n = paramzbqc.b;
      ??? = paramzbqc.c;
      localObject4 = paramCell.d.o();
      for (int i3 = 0; i3 < ((zapd)localObject4).getCount(); i3++)
      {
        localObject5 = ((zapd)localObject4).a(i3);
        if ((((CellArea)localObject5).StartRow <= n) && (((CellArea)localObject5).EndRow >= n) && (((CellArea)localObject5).StartColumn <= ???) && (((CellArea)localObject5).EndColumn >= ???))
        {
          paramzbqc.k = (((CellArea)localObject5).EndRow - ((CellArea)localObject5).StartRow + 1);
          paramzbqc.l = (((CellArea)localObject5).EndColumn - ((CellArea)localObject5).StartColumn + 1);
          if (!paramzbqc.j) {
            break;
          }
          paramzbqc.m = new int[paramzbqc.k][];
          for (int i7 = ((CellArea)localObject5).StartRow; i7 <= ((CellArea)localObject5).EndRow; i7++)
          {
            paramzbqc.m[(i7 - localObject5.StartRow)] = new int[paramzbqc.l];
            for (i8 = ((CellArea)localObject5).StartColumn; i8 <= ((CellArea)localObject5).EndColumn; i8++)
            {
              Cell localCell = paramCell.d.a(i7, i8, true);
              if (localCell != null) {
                paramzbqc.m[(i7 - localObject5.StartRow)][(i8 - localObject5.StartColumn)] = localCell.s();
              }
            }
          }
          break;
        }
      }
    }
    Object localObject2;
    switch (str1.charAt(0))
    {
    case '&': 
      paramzbqc.r = str1.substring(1, 1 + (str1.length() - 1));
      if ((paramzbqc.r != null) && (!"".equals(paramzbqc.r))) {
        paramzbqc.a = 2;
      }
      break;
    case '$': 
      paramzbqc.r = (paramzbqc.s = str1.substring(1));
      paramzbqc.t = 0;
      localObject2 = a(paramzbqc.r);
      if (!paramBoolean) {
        paramCell.putValue((String)null);
      }
      if (localObject2 != null)
      {
        paramzbqc.z = ((ICellsDataTable)localObject2).getCount();
        paramzbqc.a = 0;
      }
      break;
    case '=': 
      paramzbqc.a = 1;
      paramzbqc.r = str1;
      break;
    default: 
      if (!paramBoolean) {
        paramCell.putValue((String)null);
      }
      arrayOfString1 = zw.d(str1, '.');
      localObject2 = zbqd.b(arrayOfString1[0]);
      if ((localObject2 == null) || ("".equals(localObject2))) {
        return;
      }
      Object localObject3 = a((String)localObject2);
      if (localObject3 == null) {
        return;
      }
      int i4;
      if (arrayOfString1.length == 2)
      {
        if ((paramzbqc.M) && (localObject3 != null) && ((localObject3 instanceof ziu)))
        {
          localObject4 = "__________" + (String)localObject2 + "__________Copy";
          ICellsDataTable localICellsDataTable = a((String)localObject4);
          if (localICellsDataTable == null)
          {
            ((ICellsDataTable)localObject3).beforeFirst();
            ((ICellsDataTable)localObject3).next();
            localObject5 = ((ICellsDataTable)localObject3).get(0);
            ArrayList localArrayList = new ArrayList();
            zf.a(localArrayList, localObject5);
            localObject3 = zbqd.a(localArrayList);
            a((String)localObject4, (ICellsDataTable)localObject3);
          }
          else
          {
            localObject3 = localICellsDataTable;
          }
          localObject2 = localObject4;
        }
        localObject4 = zbqd.b(arrayOfString1[1]);
        i4 = -1;
        if (localObject3 != null) {
          i4 = zbqd.a(((ICellsDataTable)localObject3).getColumns(), (String)localObject4);
        }
        if ((localObject3 != null) && (i4 != -1))
        {
          paramzbqc.r = ((String)localObject2);
          paramzbqc.s = ((String)localObject4);
          paramzbqc.t = i4;
          paramzbqc.a = 0;
          paramzbqc.z = ((ICellsDataTable)localObject3).getCount();
          return;
        }
      }
      else if ((arrayOfString1.length > 2) && (localObject3 != null))
      {
        localObject4 = zbqd.b(arrayOfString1[1]);
        i4 = zbqd.a(((ICellsDataTable)localObject3).getColumns(), (String)localObject4);
        if (i4 != -1)
        {
          paramzbqc.r = ((String)localObject2);
          paramzbqc.s = ((String)localObject4);
          paramzbqc.t = i4;
          paramzbqc.ab = new String[arrayOfString1.length - 2];
          for (int i5 = 2; i5 < arrayOfString1.length; i5++) {
            paramzbqc.ab[(i5 - 2)] = zbqd.b(arrayOfString1[i5]);
          }
          paramzbqc.a = 0;
          paramzbqc.z = zbqd.a((ICellsDataTable)localObject3, paramzbqc, paramzbqc.ab);
          return;
        }
      }
      break;
    }
  }
  
  private int a(Cells paramCells, int paramInt, ArrayList paramArrayList, String paramString, boolean[] paramArrayOfBoolean)
  {
    zbqc localzbqc = null;
    int m = 0;
    paramArrayOfBoolean[0] = false;
    int n = 0;
    int i2;
    for (int i1 = paramArrayList.size() - 1; i1 >= 0; i1--)
    {
      localzbqc = (zbqc)paramArrayList.get(i1);
      if (localzbqc.i) {
        paramArrayOfBoolean[0] = true;
      } else if (localzbqc.o) {
        n = 1;
      }
      Object localObject1;
      if (localzbqc.B <= 0)
      {
        Cell localCell = paramCells.checkCell(paramInt + 1, localzbqc.c);
        if (localCell != null) {
          if (localCell.getType() == 5)
          {
            localObject1 = localCell.k();
            if (((String)localObject1).toLowerCase().startsWith("&=subtotal"))
            {
              localObject1 = ((String)localObject1).substring(2);
              a(localCell, true, (String)localObject1, localzbqc);
              localzbqc.F = true;
              localzbqc.G = localCell.s();
              m = 1;
              localCell.f();
              localCell.b(15);
              localzbqc.H = paramCells.checkRow(paramInt + 1);
            }
            else if (((String)localObject1).toLowerCase().startsWith("&=&="))
            {
              localzbqc.I = ((String)localObject1);
              localzbqc.G = localCell.s();
              localzbqc.J = true;
              localzbqc.I = ((String)localObject1).substring(3);
              localCell.f();
              localCell.b(15);
            }
          }
          else
          {
            localzbqc.G = localCell.s();
          }
        }
      }
      if ((localzbqc.B > 0) && (localzbqc.D == null)) {
        for (i2 = i1 - 1; i2 >= 0; i2--)
        {
          localObject1 = (zbqc)paramArrayList.get(i2);
          if (((zbqc)localObject1).w)
          {
            localzbqc.D = new String[] { ((zbqc)localObject1).s };
            break;
          }
        }
      }
    }
    if ((paramArrayOfBoolean[0] != 0) || (n != 0))
    {
      HashMap localHashMap1 = null;
      i2 = 0;
      for (int i3 = 0; i3 < paramArrayList.size(); i3++)
      {
        localzbqc = (zbqc)paramArrayList.get(i3);
        if (localzbqc.w)
        {
          localzbqc.y = -1;
          if (localzbqc.x == -1) {
            localzbqc.x = i2;
          }
          i2++;
        }
      }
      zbqc[] arrayOfzbqc = new zbqc[i2];
      for (int i4 = 0; i4 < paramArrayList.size(); i4++)
      {
        localzbqc = (zbqc)paramArrayList.get(i4);
        if (localzbqc.w) {
          arrayOfzbqc[localzbqc.x] = localzbqc;
        }
      }
      HashMap localHashMap2 = new HashMap();
      for (int i5 = 0; i5 < paramArrayList.size(); i5++)
      {
        localzbqc = (zbqc)paramArrayList.get(i5);
        if ((!localzbqc.w) && (localzbqc.D != null)) {
          for (i6 = 0; i6 < localzbqc.D.length; i6++) {
            if (!localHashMap2.containsKey(localzbqc.D[i6])) {
              localHashMap2.put(localzbqc.D[i6], Boolean.valueOf(false));
            }
          }
        }
      }
      i5 = 0;
      int i6 = 0;
      ICellsDataTable localICellsDataTable = a(paramString);
      int i7 = localICellsDataTable.getCount();
      ArrayList localArrayList = new ArrayList();
      localICellsDataTable.beforeFirst();
      while (localICellsDataTable.next()) {
        if (localHashMap1 == null)
        {
          localHashMap1 = a(localHashMap1, localICellsDataTable, paramArrayList, 1);
        }
        else
        {
          i6 = 0;
          i5 = 0;
          i8 = 1;
          for (i9 = 0; i9 < arrayOfzbqc.length; i9++)
          {
            localzbqc = arrayOfzbqc[i9];
            if ((localzbqc.a == 0) && (localzbqc.w))
            {
              Object localObject2 = localHashMap1.get(Integer.valueOf(localzbqc.t));
              Object localObject3 = localICellsDataTable.get(localzbqc.t);
              boolean bool1 = zbqd.a(localObject2);
              boolean bool2 = zbqd.a(localObject3);
              if (bool1)
              {
                if (bool2) {
                  continue;
                }
                if (localzbqc.y == -1)
                {
                  localzbqc.y = paramInt;
                  localHashMap1.put(Integer.valueOf(localzbqc.t), localObject3);
                  continue;
                }
              }
              else
              {
                if ((!bool2) && (localObject2.equals(localObject3))) {
                  continue;
                }
              }
              i8 = 0;
              while (i9 < arrayOfzbqc.length)
              {
                localzbqc = arrayOfzbqc[i9];
                if ((localzbqc.a == 0) && (localzbqc.y != -1))
                {
                  zf.a(localArrayList, localzbqc);
                  if (localHashMap2.containsKey(localzbqc.s))
                  {
                    i5++;
                    i6 += localzbqc.q;
                  }
                  else if (i6 < localzbqc.q)
                  {
                    i6 = localzbqc.q;
                  }
                }
                i9++;
              }
            }
          }
          i7 += i5 + i6;
          if (i8 == 0)
          {
            for (i9 = 0; i9 < localArrayList.size(); i9++) {
              ((zbqc)localArrayList.get(i9)).y = -1;
            }
            localArrayList.clear();
            localHashMap1 = a(localHashMap1, localICellsDataTable, paramArrayList, 1);
          }
        }
      }
      int i8 = 1;
      for (int i9 = 0; i9 < paramArrayList.size(); i9++)
      {
        localzbqc = (zbqc)paramArrayList.get(i9);
        if ((localzbqc.w) && (localzbqc.y != -1) && (localHashMap2.containsKey(localzbqc.s)))
        {
          i7++;
          if (i8 == 0) {
            i7 += localzbqc.q;
          } else {
            i8 = 0;
          }
        }
      }
      if (m != 0) {
        i7--;
      }
      return i7 - 1;
    }
    return 0;
  }
  
  private void b(Cells paramCells, int paramInt, ArrayList paramArrayList)
  {
    int m = 0;
    int n = 0;
    zbqc localzbqc = null;
    int i1 = 0;
    int i2 = 0;
    ArrayList localArrayList = new ArrayList();
    Object localObject2;
    for (int i3 = 0; i3 < paramArrayList.size(); i3++)
    {
      localzbqc = (zbqc)paramArrayList.get(i3);
      if (localzbqc.w)
      {
        String str = localzbqc.r;
        int i5 = 0;
        boolean[] arrayOfBoolean1 = { i5 };
        localObject2 = a(paramArrayList, str, true, arrayOfBoolean1, true);
        i5 = arrayOfBoolean1[0];
        boolean[] arrayOfBoolean2 = { m };
        int i7 = a(paramCells, paramInt, (ArrayList)localObject2, str, arrayOfBoolean2);
        m = arrayOfBoolean2[0];
        if (i7 > 0) {
          if (m != 0)
          {
            if (i7 > i1) {
              i1 = i7;
            }
          }
          else
          {
            if (i7 > i2) {
              i2 = i7;
            }
            zf.a(localArrayList, localObject2);
            zf.a(localArrayList, Integer.valueOf(i7));
          }
        }
        i3 = -1;
      }
    }
    for (i3 = 0; i3 < paramArrayList.size(); i3++)
    {
      localzbqc = (zbqc)paramArrayList.get(i3);
      switch (localzbqc.a)
      {
      case 2: 
        n = 1;
        break;
      case 0: 
        if (localzbqc.i) {
          m = 1;
        }
        break;
      }
    }
    i3 = 0;
    for (int i4 = 0; i4 < paramArrayList.size(); i4++)
    {
      localzbqc = (zbqc)paramArrayList.get(i4);
      i3 = localzbqc.c();
      if (localzbqc.i)
      {
        if (i3 > i1) {
          i1 = localzbqc.c();
        }
      }
      else if (localzbqc.o)
      {
        i3 = localzbqc.d();
        if (i3 > i2) {
          i2 = localzbqc.d();
        }
      }
    }
    if (m != 0) {
      a(paramCells, paramInt, i1, paramArrayList);
    }
    if (i2 - i1 > 0)
    {
      Object localObject1;
      for (i4 = 0; i4 < paramArrayList.size(); i4++)
      {
        localzbqc = (zbqc)paramArrayList.get(i4);
        if ((localzbqc.o) && (localzbqc.d() - i1 > 0))
        {
          localObject1 = new CellArea();
          ((CellArea)localObject1).StartRow = (localzbqc.b + 1);
          ((CellArea)localObject1).StartColumn = localzbqc.c;
          ((CellArea)localObject1).EndRow = (localzbqc.b + 1);
          ((CellArea)localObject1).EndColumn = localzbqc.c;
          a(paramCells, (CellArea)localObject1, localzbqc.d() - i1, 0);
        }
      }
      if (localArrayList.size() > 0) {
        for (i4 = 0; i4 < localArrayList.size(); i4 += 2)
        {
          localObject1 = (ArrayList)localArrayList.get(i4);
          int i6 = ((Integer)localArrayList.get(i4 + 1)).intValue();
          if (i6 > i1)
          {
            localObject2 = new CellArea();
            label685:
            while (((ArrayList)localObject1).size() > 0)
            {
              localzbqc = (zbqc)((ArrayList)localObject1).get(0);
              ((CellArea)localObject2).StartRow = (localzbqc.b + 1);
              ((CellArea)localObject2).StartColumn = localzbqc.c;
              ((CellArea)localObject2).EndRow = (localzbqc.b + 1);
              ((CellArea)localObject2).EndColumn = localzbqc.c;
              for (;;)
              {
                if (((ArrayList)localObject1).size() <= 0) {
                  break label685;
                }
                ((ArrayList)localObject1).remove(0);
                if (((ArrayList)localObject1).size() > 0)
                {
                  localzbqc = (zbqc)((ArrayList)localObject1).get(0);
                  if (localzbqc.c != ((CellArea)localObject2).EndColumn + 1) {
                    break;
                  }
                  localObject2.EndColumn += 1;
                }
              }
            }
            a(paramCells, (CellArea)localObject2, i6 - i1, 0);
          }
        }
      }
    }
    if (n != 0) {
      for (i4 = 0; i4 < paramArrayList.size(); i4++)
      {
        localzbqc = (zbqc)paramArrayList.get(i4);
        if (localzbqc.a == 2) {
          localzbqc.u = ((i1 > i2 ? i1 : i2) + 1);
        }
      }
    }
  }
  
  public boolean getUpdateReference()
  {
    return this.g;
  }
  
  public void setUpdateReference(boolean value)
  {
    this.g = value;
  }
  
  public boolean getCalculateFormula()
  {
    return this.h;
  }
  
  public void setCalculateFormula(boolean value)
  {
    this.h = value;
  }
  
  public ISmartMarkerCallBack getCallBack()
  {
    return this.f;
  }
  
  public void setCallBack(ISmartMarkerCallBack value)
  {
    this.f = value;
  }
  
  public void process()
    throws Exception
  {
    process(false);
  }
  
  public void process(boolean isPreserved)
    throws Exception
  {
    ArrayList localArrayList = new ArrayList();
    zbqh localzbqh;
    for (int m = 0; m < this.a.getWorksheets().getCount(); m++)
    {
      localzbqh = a(m, isPreserved);
      if ((localzbqh != null) && (localzbqh.getCount() > 0)) {
        zf.a(localArrayList, localzbqh);
      }
    }
    for (m = 0; m < localArrayList.size(); m++)
    {
      localzbqh = (zbqh)localArrayList.get(m);
      if ((localzbqh != null) && (localzbqh.getCount() != 0)) {
        a(localzbqh);
      }
    }
    m = 0;
    if (this.h)
    {
      m = 1;
      this.a.getSettings().setCreateCalcChain(false);
      this.a.calculateFormula();
    }
    for (int n = 0; n < this.a.getWorksheets().getCount(); n++)
    {
      PivotTableCollection localPivotTableCollection = this.a.getWorksheets().get(n).getPivotTables();
      if (localPivotTableCollection.getCount() != 0) {
        for (int i1 = 0; i1 < localPivotTableCollection.getCount(); i1++) {
          if (a(localArrayList, localPivotTableCollection.get(i1)))
          {
            if (!localPivotTableCollection.get(i1).getRefreshDataOnOpeningFile()) {
              localPivotTableCollection.get(i1).setRefreshDataOnOpeningFile(true);
            }
            if (m == 0)
            {
              m = 1;
              this.a.getSettings().setCreateCalcChain(false);
              this.a.calculateFormula();
            }
            localPivotTableCollection.get(i1).setRefreshDataFlag(true);
            try
            {
              localPivotTableCollection.get(i1).refreshData();
            }
            catch (Exception localException) {}
          }
        }
      }
    }
  }
  
  private boolean a(ArrayList paramArrayList, PivotTable paramPivotTable)
  {
    if ((paramPivotTable.d == null) || (paramPivotTable.d.f == null)) {
      return false;
    }
    int m = paramArrayList.size();
    zbqh localzbqh = null;
    for (int n = 0; n < m; n++)
    {
      localzbqh = (zbqh)paramArrayList.get(n);
      if ((localzbqh != null) && (localzbqh.getCount() != 0) && (paramPivotTable.d.a(localzbqh.a()))) {
        return true;
      }
    }
    return false;
  }
  
  public void process(int sheetIndex, boolean isPreserved)
    throws Exception
  {
    zbqh localzbqh = a(sheetIndex, isPreserved);
    if (localzbqh == null) {
      return;
    }
    a(localzbqh);
  }
  
  private boolean a(Cell paramCell, ArrayList paramArrayList)
  {
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      CellArea localCellArea = (CellArea)paramArrayList.get(m);
      if ((paramCell.getRow() >= localCellArea.StartRow) && (paramCell.getRow() <= localCellArea.EndRow) && (paramCell.getColumn() >= localCellArea.StartColumn) && (paramCell.getColumn() <= localCellArea.EndColumn)) {
        return true;
      }
    }
    return false;
  }
  
  private zbqh a(int paramInt, boolean paramBoolean)
  {
    Worksheet localWorksheet = this.a.getWorksheets().get(paramInt);
    zbqh localzbqh = new zbqh(localWorksheet);
    this.i = localzbqh;
    zbqc localzbqc1 = null;
    ArrayList localArrayList1 = new ArrayList();
    Cells localCells = localWorksheet.getCells();
    ArrayList localArrayList2 = localCells.t();
    int i2;
    Object localObject;
    for (int m = localCells.getRows().getCount() - 1; m >= 0; m--)
    {
      Row localRow = localCells.getRows().getRowByIndex(m);
      int i1 = 0;
      String str;
      for (i2 = localRow.a() - 1; i2 >= 0; i2--)
      {
        localObject = localRow.getCellByIndex(i2);
        if ((((Cell)localObject).c.c == 4) && ((localArrayList2 == null) || (!a((Cell)localObject, localArrayList2))))
        {
          str = ((Cell)localObject).k();
          if (str.toLowerCase().startsWith("&=subtotal"))
          {
            i1 = 1;
            break;
          }
        }
      }
      for (i2 = localRow.a() - 1; i2 >= 0; i2--)
      {
        localObject = localRow.getCellByIndex(i2);
        if ((((Cell)localObject).c.c == 4) && ((localArrayList2 == null) || (!a((Cell)localObject, localArrayList2))))
        {
          str = ((Cell)localObject).k();
          if ((str.startsWith("&=")) && (!str.toLowerCase().startsWith("&=subtotal")) && ((i1 == 0) || (!str.startsWith("&=&="))))
          {
            localzbqc1 = new zbqc(((Cell)localObject).getRow(), ((Cell)localObject).getColumn());
            a((Cell)localObject, localzbqc1, localArrayList1, paramBoolean);
            if (localzbqc1.a != 3)
            {
              localzbqh.a(0, localzbqc1);
              if (localzbqc1.h) {
                localArrayList1.add(0, localzbqc1);
              }
            }
          }
        }
      }
      if (localArrayList1.size() > 0)
      {
        b(localCells, localRow.getIndex(), localArrayList1);
        localArrayList1.clear();
      }
    }
    if (localzbqh.getCount() == 0) {
      return null;
    }
    if ((this.j != null) && (localCells.o().getCount() > 0))
    {
      ArrayList localArrayList3 = new ArrayList(localCells.o().getCount());
      for (int n = 0; n < localCells.o().getCount(); n++) {
        zf.a(localArrayList3, localCells.o().a(n));
      }
      for (n = 0; n < this.j.size(); n++)
      {
        zapc localzapc = (zapc)this.j.get(n);
        for (i2 = 0; i2 < localArrayList3.size(); i2++)
        {
          localObject = (CellArea)localArrayList3.get(i2);
          if ((((CellArea)localObject).StartRow == localzapc.c) && (((CellArea)localObject).EndRow == localzapc.c))
          {
            int i3 = localzapc.b;
            int i4 = ((CellArea)localObject).StartColumn;
            int i5 = 0;
            Iterator localIterator = localzapc.a.iterator();
            while (localIterator.hasNext())
            {
              zbqc localzbqc2 = (zbqc)localIterator.next();
              if (localzbqc2.c == i4)
              {
                i5 = localzbqc2.q;
                break;
              }
            }
            int i6 = ((CellArea)localObject).EndColumn - i4 + 1;
            for (int i7 = 1 + i5; i7 <= i3; i7++)
            {
              localCells.merge(localzapc.c + i7, i4, 1, i6);
              i7 += i5;
            }
          }
        }
      }
      this.j.clear();
    }
    a(localCells, localzbqh);
    return localzbqh;
  }
  
  private ArrayList a(zbqh paramzbqh, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    for (int m = 0; m < paramzbqh.getCount(); m++) {
      if ((paramzbqh.a(m).c == paramInt) && (!paramzbqh.a(m).h))
      {
        zf.a(localArrayList, paramzbqh.a(m));
        if (paramBoolean) {
          paramzbqh.removeAt(m--);
        }
      }
    }
    return localArrayList;
  }
  
  private void a(Cells paramCells, zbqh paramzbqh)
  {
    int m = 0;
    int n = 0;
    int i1 = 0;
    ArrayList localArrayList = null;
    int i2 = paramCells.b((short)0);
    for (int i3 = i2; i3 >= 0; i3--)
    {
      localArrayList = a(paramzbqh, i3, false);
      if (localArrayList.size() != 0)
      {
        m = 0;
        n = 0;
        i1 = 0;
        zbqc localzbqc = null;
        int i5;
        for (int i4 = 0; i4 < localArrayList.size(); i4++)
        {
          localzbqc = (zbqc)localArrayList.get(i4);
          if (localzbqc.b() > i1) {
            i1 = localzbqc.b();
          }
          i5 = 0;
          if (localzbqc.i)
          {
            i5 = localzbqc.c();
            if (i5 > m) {
              m = localzbqc.c();
            }
          }
          else if (localzbqc.o)
          {
            i5 = localzbqc.d();
            if (i5 > n) {
              n = localzbqc.d();
            }
          }
        }
        if (m != 0) {
          a(paramCells, localzbqc, m);
        }
        if (n > m) {
          for (i4 = 0; i4 < localArrayList.size(); i4++)
          {
            localzbqc = (zbqc)localArrayList.get(i4);
            if (localzbqc.o)
            {
              i5 = localzbqc.d();
              if (i5 > m)
              {
                CellArea localCellArea = new CellArea();
                localCellArea.StartRow = localzbqc.b;
                localCellArea.StartColumn = (localzbqc.c + 1);
                localCellArea.EndRow = localzbqc.b;
                localCellArea.EndColumn = (localzbqc.c + 1);
                a(paramCells, localCellArea, n - m, 3);
              }
            }
          }
        }
        for (i4 = 0; i4 < localArrayList.size(); i4++)
        {
          localzbqc = (zbqc)localArrayList.get(i4);
          if ((localzbqc.a == 2) && (!localzbqc.h)) {
            localzbqc.u = i1;
          }
        }
      }
    }
  }
  
  private void a(zbqc paramzbqc, int paramInt1, int paramInt2, Cells paramCells, Object paramObject)
    throws Exception
  {
    paramzbqc.ac = 1;
    if ((this.f != null) && (paramzbqc.b == paramInt1) && (paramzbqc.c == paramInt2)) {
      this.f.process(paramCells.g().getIndex(), paramInt1, paramInt2, paramzbqc.r, paramzbqc.s);
    }
    if (paramzbqc.O)
    {
      if ((paramObject != null) && ((paramObject instanceof byte[]))) {
        a(paramCells, paramzbqc, paramInt1, paramInt2, (byte[])paramObject);
      }
    }
    else if (paramzbqc.N)
    {
      paramCells.a(paramInt1, paramInt2, false).setHtmlString(zs.a(paramObject));
    }
    else if ((paramObject != null) && (paramzbqc.ab != null))
    {
      ArrayList localArrayList = zv.a(paramzbqc.ab, paramObject);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        a(paramzbqc, paramCells, paramInt1, paramInt2, localObject);
        if (paramzbqc.h) {
          paramInt1 += paramzbqc.q + 1;
        } else {
          paramInt2 += paramzbqc.q + 1;
        }
      }
      paramzbqc.ac = localArrayList.size();
    }
    else
    {
      a(paramzbqc, paramCells, paramInt1, paramInt2, paramObject);
    }
  }
  
  private void a(zbqc paramzbqc, Cells paramCells, Object paramObject)
    throws Exception
  {
    int m = paramzbqc.d;
    int n = paramzbqc.e;
    a(paramzbqc, m, n, paramCells, paramObject);
  }
  
  private void a(zbqc paramzbqc, Cells paramCells, int paramInt1, int paramInt2, Object paramObject)
  {
    Cell localCell1 = paramCells.a(paramInt1, paramInt2, false);
    if ((paramzbqc.g) && ((paramObject instanceof String))) {
      localCell1.setFormula((String)paramObject);
    } else if ((paramzbqc.v) && (paramObject != null) && ((paramObject instanceof String))) {
      localCell1.putValue((String)paramObject, true);
    } else {
      localCell1.putValue(paramObject);
    }
    if (paramzbqc.j)
    {
      localCell1.b(paramzbqc.n);
      if ((!paramzbqc.i) && ((paramzbqc.k != 0) || (paramzbqc.l != 0)))
      {
        paramCells.merge(paramInt1, paramInt2, paramzbqc.k, paramzbqc.l);
        for (int m = 0; m < paramzbqc.k; m++) {
          for (int n = 0; n < paramzbqc.l; n++) {
            if (paramzbqc.m[m][n] != 0)
            {
              Cell localCell2 = localCell1.d.get(m + paramInt1, n + paramInt2);
              localCell2.b(paramzbqc.m[m][n]);
            }
          }
        }
      }
    }
  }
  
  private void a(zbqc paramzbqc, Cells paramCells, int paramInt1, int paramInt2)
  {
    String str1 = paramzbqc.r;
    Cell localCell = paramCells.a(paramzbqc.d, paramzbqc.e, false);
    String str2 = zbqd.a(str1, paramzbqc.d, paramzbqc.e);
    if (paramzbqc.f) {
      localCell.setArrayFormula(str2, 1, 1);
    } else {
      localCell.setFormula(str2);
    }
    if (paramzbqc.j) {
      localCell.b(paramzbqc.n);
    }
  }
  
  private void b(Cells paramCells, zbqh paramzbqh)
    throws Exception
  {
    ArrayList localArrayList1 = null;
    Object localObject1 = null;
    int m = paramCells.b((short)0);
    for (int n = m; n >= 0; n--)
    {
      localArrayList1 = a(paramzbqh, n, true);
      if (localArrayList1.size() != 0)
      {
        Object localObject2;
        for (int i1 = 0; i1 < localArrayList1.size(); i1++)
        {
          zbqc localzbqc2 = (zbqc)localArrayList1.get(i1);
          localzbqc2.a();
          if (localzbqc2.a == 1)
          {
            localObject2 = zbqd.a(localzbqc2.r, localzbqc2.b, localzbqc2.c);
            paramCells.a(localzbqc2.b, localzbqc2.c, false).setFormula((String)localObject2);
            localArrayList1.remove(i1--);
          }
        }
        while (localArrayList1.size() > 0)
        {
          zbqc localzbqc1 = null;
          for (int i2 = 0; i2 < localArrayList1.size(); i2++)
          {
            localzbqc1 = (zbqc)localArrayList1.get(i2);
            if (localzbqc1.a == 0) {
              break;
            }
            localzbqc1 = null;
          }
          if (localzbqc1 == null) {
            break;
          }
          i2 = 0;
          localObject2 = new boolean[] { i2 };
          ArrayList localArrayList2 = a(localArrayList1, localzbqc1.r, true, (boolean[])localObject2, false);
          i2 = localObject2[0];
          ICellsDataTable localICellsDataTable = a(localzbqc1.r);
          localICellsDataTable.beforeFirst();
          while (localICellsDataTable.next()) {
            for (int i3 = 0; i3 < localArrayList2.size(); i3++)
            {
              localzbqc1 = (zbqc)localArrayList2.get(i3);
              switch (localzbqc1.a)
              {
              case 0: 
                localObject1 = localICellsDataTable.get(localzbqc1.t);
                a(localzbqc1, paramCells, localObject1);
                localzbqc1.e += localzbqc1.q + 1;
                break;
              case 2: 
                a(localzbqc1, paramCells, localzbqc1.d, localzbqc1.e);
                localzbqc1.e += 1 + localzbqc1.q;
              }
            }
          }
        }
      }
    }
  }
  
  private void a(Cells paramCells, zbqc paramzbqc, int paramInt)
  {
    int m = paramzbqc.b;
    int n = paramzbqc.c;
    int i1 = n + 1;
    Object localObject;
    for (int i2 = 0; i2 < paramCells.o().getCount(); i2++)
    {
      localObject = paramCells.o().a(i2);
      if ((((CellArea)localObject).StartRow <= m) && (((CellArea)localObject).EndRow >= m) && (((CellArea)localObject).StartColumn <= n) && (((CellArea)localObject).EndColumn >= n))
      {
        i1 = ((CellArea)localObject).EndColumn + 1;
        break;
      }
    }
    for (i2 = 0; i2 < this.i.getCount(); i2++)
    {
      localObject = this.i.a(i2);
      if (((zbqc)localObject).c > n) {
        localObject.c += paramInt;
      }
    }
    if (paramzbqc.j)
    {
      paramCells.getRows().e(i1, paramInt);
      if (i1 <= paramCells.getMaxColumn()) {
        paramCells.a((short)(paramCells.getMaxColumn() + paramInt));
      }
      paramCells.getColumns().c(i1, paramInt);
    }
    else
    {
      paramCells.insertColumns(i1, paramInt);
    }
    a(paramCells, -1, i1 - 1, false, paramInt, true, -1);
  }
  
  private void a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, int paramInt4)
  {
    Object localObject1;
    for (int m = 0; m < paramCells.getRows().getCount(); m++)
    {
      localObject1 = paramCells.getRows().getRowByIndex(m);
      for (int i1 = 0; i1 < ((Row)localObject1).a(); i1++)
      {
        Cell localCell = ((Row)localObject1).getCellByIndex(i1);
        if (localCell.v() != null) {
          localCell.a(zaaq.a(paramCells.g(), true, paramInt1, paramInt2, paramBoolean1, paramInt3, paramBoolean2, paramInt4, -1, -1, localCell.v()));
        }
      }
    }
    Object localObject2;
    for (m = 0; m < paramCells.p().getCount(); m++)
    {
      localObject1 = paramCells.p().get(m);
      localObject2 = ((Worksheet)localObject1).getCharts();
      for (int i2 = 0; i2 < ((ChartCollection)localObject2).getCount(); i2++)
      {
        Chart localChart = ((ChartCollection)localObject2).get(i2);
        for (int i3 = 0; i3 < localChart.getNSeries().getCount(); i3++)
        {
          Series localSeries = localChart.getNSeries().get(i3);
          if ((localSeries.o() != null) && (localSeries.o().c != null)) {
            localSeries.o().c = zaaq.a(paramCells.g(), localObject1 == paramCells.g(), 0, 0, paramBoolean1, paramInt3, paramBoolean2, paramInt4, -1, -1, localSeries.o().c);
          }
          if ((localSeries.m() != null) && (localSeries.m().c != null)) {
            localSeries.m().c = zaaq.a(paramCells.g(), localObject1 == paramCells.g(), 0, 0, paramBoolean1, paramInt3, paramBoolean2, paramInt4, -1, -1, localSeries.m().c);
          }
        }
      }
    }
    NameCollection localNameCollection = paramCells.p().getNames();
    for (int n = 0; n < localNameCollection.getCount(); n++)
    {
      localObject2 = localNameCollection.get(n);
      if (((Name)localObject2).b() != null)
      {
        ((Name)localObject2).a(zaaq.a(paramCells.g(), false, paramInt1, paramInt2, paramBoolean1, paramInt3, paramBoolean2, paramInt4, -1, -1, ((Name)localObject2).b()));
        ((Name)localObject2).h(null);
      }
    }
  }
  
  private void a(Cells paramCells, CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    for (int m = 0; m < this.i.getCount(); m++)
    {
      zbqc localzbqc = this.i.a(m);
      switch (paramInt2)
      {
      case 0: 
        if ((paramCellArea.StartColumn <= localzbqc.c) && (paramCellArea.EndColumn >= localzbqc.c) && (localzbqc.b > paramCellArea.StartRow)) {
          localzbqc.b += paramInt1;
        }
        break;
      case 3: 
        if ((paramCellArea.StartRow <= localzbqc.b) && (paramCellArea.EndRow >= localzbqc.b) && (localzbqc.c > paramCellArea.StartColumn)) {
          localzbqc.c += paramInt1;
        }
        break;
      }
    }
    paramCells.insertRange(paramCellArea, paramInt1, paramInt2, false);
    if ((paramInt1 <= 0) && (paramInt2 == 0)) {
      a(paramCells, paramCellArea.StartRow - 1, paramCellArea.StartColumn, true, paramInt1, false, paramCellArea.EndColumn);
    }
  }
  
  private void a(Cells paramCells, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    if (paramInt2 == 0) {
      return;
    }
    Object localObject2;
    for (int m = 0; m < this.i.getCount(); m++)
    {
      localObject2 = this.i.a(m);
      if (((zbqc)localObject2).b > paramInt1) {
        localObject2.b += paramInt2;
      }
    }
    paramCells.insertRows(paramInt1 + 1, paramInt2, this.g);
    a(paramCells, paramInt1, -1, true, paramInt2, true, -1);
    Object localObject1;
    if (paramCells.o().getCount() != 0)
    {
      if (this.j == null) {
        this.j = new ArrayList();
      } else {
        for (m = 0; m < this.j.size(); m++)
        {
          localObject2 = (zapc)this.j.get(m);
          if (((zapc)localObject2).c > paramInt1) {
            localObject2.c += paramInt2;
          }
        }
      }
      localObject1 = new ArrayList();
      zf.a((ArrayList)localObject1, paramArrayList);
      zf.a(this.j, new zapc(paramInt2, paramInt1, (ArrayList)localObject1));
    }
    if (paramCells.g().getListObjects().getCount() != 0)
    {
      localObject1 = paramCells.g().getListObjects();
      for (int i1 = 0; i1 < ((ListObjectCollection)localObject1).getCount(); i1++)
      {
        ListObject localListObject = ((ListObjectCollection)localObject1).get(i1);
        if (localListObject.getEndRow() == paramInt1) {
          localListObject.c(localListObject.getEndRow() + paramInt2);
        }
      }
    }
    if (paramCells.p().W().getCount() != 0) {
      for (int n = 0; n < paramCells.p().W().getCount(); n++) {
        paramCells.p().W().a(n).a(paramInt1, paramInt2, paramCells.g());
      }
    }
  }
  
  public String[] getSmartMarkers()
  {
    return ((zbst)this.a.getWorksheets().g).g();
  }
  
  public void setDataSource(String dataSource, ICellsDataTable cellsDataTable)
  {
    a(dataSource, cellsDataTable);
  }
  
  public void setDataSource(String dataSource, ResultSet rs, int rowCount)
  {
    try
    {
      if (dataSource == null)
      {
        ResultSetMetaData localResultSetMetaData = rs.getMetaData();
        dataSource = localResultSetMetaData.getTableName(1);
      }
    }
    catch (Exception localException1)
    {
      throw new CellsException(6, "Invalid data source of smart marker");
    }
    a(dataSource, new zin(rs, rowCount));
  }
  
  public void setDataSource(String dataSource, ResultSet rs)
  {
    setDataSource(dataSource, rs, -1);
  }
  
  public void setDataSource(ResultSet rs)
  {
    setDataSource(null, rs, -1);
  }
  
  private ArrayList a(ArrayList paramArrayList, String paramString, boolean paramBoolean1, boolean[] paramArrayOfBoolean, boolean paramBoolean2)
  {
    ArrayList localArrayList = new ArrayList();
    paramArrayOfBoolean[0] = false;
    for (int m = 0; m < paramArrayList.size(); m++)
    {
      zbqc localzbqc1 = (zbqc)paramArrayList.get(m);
      switch (localzbqc1.a)
      {
      case 2: 
        if (paramBoolean1)
        {
          int n = 0;
          zbqc localzbqc3;
          if (localArrayList.size() == 0)
          {
            for (int i1 = m + 1; i1 < paramArrayList.size(); i1++)
            {
              localzbqc3 = (zbqc)paramArrayList.get(i1);
              if (localzbqc3.a == 0)
              {
                if (!zw.b(localzbqc3.r, paramString)) {
                  break;
                }
                n = 1;
                break;
              }
            }
          }
          else
          {
            zbqc localzbqc2 = m == 0 ? null : (zbqc)paramArrayList.get(m - 1);
            localzbqc3 = (zbqc)localArrayList.get(localArrayList.size() - 1);
            if (localzbqc3.a(paramBoolean2) + 1 == localzbqc1.a(paramBoolean2))
            {
              n = 1;
            }
            else
            {
              int i2 = localzbqc1.a(paramBoolean2) - localzbqc3.a(paramBoolean2);
              int i3 = Integer.MAX_VALUE;
              if (localzbqc2 != null) {
                i3 = localzbqc1.a(paramBoolean2) - localzbqc2.a(paramBoolean2);
              }
              if (i3 > i2) {
                if (m + 1 == paramArrayList.size())
                {
                  n = 1;
                }
                else
                {
                  int i4 = 1;
                  for (int i5 = m + 1; i5 < paramArrayList.size(); i5++)
                  {
                    zbqc localzbqc4 = (zbqc)paramArrayList.get(i5);
                    if (localzbqc4.a == 0)
                    {
                      i4 = 0;
                      if (zw.b(localzbqc4.r, paramString))
                      {
                        n = 1;
                        break;
                      }
                      int i6 = localzbqc4.a(paramBoolean2) - localzbqc1.a(paramBoolean2);
                      if ((i6 != i5 - m) && (i2 <= i6)) {
                        n = 1;
                      }
                      break;
                    }
                  }
                  if (i4 != 0) {
                    n = 1;
                  }
                }
              }
            }
          }
          if (n != 0)
          {
            zf.a(localArrayList, localzbqc1);
            paramArrayList.remove(m--);
          }
        }
        break;
      default: 
        if (zw.a(paramString, localzbqc1.r, true) == 0)
        {
          zf.a(localArrayList, localzbqc1);
          paramArrayList.remove(m--);
        }
        if (localzbqc1.w) {
          paramArrayOfBoolean[0] = true;
        }
        break;
      }
    }
    return localArrayList;
  }
  
  private void a(String paramString, ICellsDataTable paramICellsDataTable)
  {
    this.b.put(paramString.toUpperCase(), paramICellsDataTable);
  }
  
  private ICellsDataTable a(String paramString)
  {
    return (ICellsDataTable)this.b.get(paramString.toUpperCase());
  }
  
  private HashMap a(HashMap paramHashMap, ICellsDataTable paramICellsDataTable, ArrayList paramArrayList, int paramInt)
  {
    int m;
    zbqc localzbqc;
    Object localObject;
    if (paramHashMap == null)
    {
      paramHashMap = new HashMap();
      for (m = 0; m < paramArrayList.size(); m++)
      {
        localzbqc = (zbqc)paramArrayList.get(m);
        if (localzbqc.w)
        {
          localObject = paramICellsDataTable.get(localzbqc.t);
          paramHashMap.put(Integer.valueOf(localzbqc.t), localObject);
          if ((localzbqc.y == -1) && (!zbqd.a(localObject))) {
            localzbqc.y = paramInt;
          }
        }
      }
    }
    else
    {
      for (m = 0; m < paramArrayList.size(); m++)
      {
        localzbqc = (zbqc)paramArrayList.get(m);
        if (localzbqc.w)
        {
          localObject = paramICellsDataTable.get(localzbqc.t);
          paramHashMap.put(Integer.valueOf(localzbqc.t), localObject);
          if ((localzbqc.y == -1) && (!zbqd.a(localObject))) {
            localzbqc.y = paramInt;
          }
        }
      }
    }
    return paramHashMap;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WorkbookDesigner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */