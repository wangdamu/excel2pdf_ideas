package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class zaws
  extends zawp
{
  byte a()
  {
    return this.f.c();
  }
  
  boolean b()
  {
    return this.f.e();
  }
  
  int c()
  {
    if (this.i == null) {
      return 0;
    }
    int i = 0;
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
    {
      zbtv localzbtv = (zbtv)localIterator.next();
      if ((!localzbtv.m()) && (!localzbtv.o)) {
        i++;
      }
    }
    return i;
  }
  
  int d()
  {
    if ((this.h != null) && (this.h.a != null)) {
      return this.h.a.size();
    }
    if ((this.f != null) && (this.f.c() == 1))
    {
      Range localRange = ((zboy)this.f).g();
      if (localRange != null) {
        return ((zboy)this.f).g().getRowCount() - 1;
      }
    }
    return 0;
  }
  
  String[] e()
  {
    if (this.f == null) {
      return null;
    }
    return this.f.d();
  }
  
  boolean a(PivotTable paramPivotTable)
  {
    Iterator localIterator1 = this.e.a.iterator();
    while (localIterator1.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator1.next();
      if (localWorksheet.b != null)
      {
        Iterator localIterator2 = localWorksheet.getPivotTables().iterator();
        while (localIterator2.hasNext())
        {
          PivotTable localPivotTable = (PivotTable)localIterator2.next();
          if ((localPivotTable != paramPivotTable) && (localPivotTable.d == this)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  zaws(zawq paramzawq, byte paramByte, String[] paramArrayOfString, PivotPageFields paramPivotPageFields, boolean paramBoolean, int paramInt, Worksheet paramWorksheet)
  {
    this.e = paramzawq;
    this.g = 37;
    this.b = paramInt;
    this.k = new DateTime();
    Object localObject;
    switch (paramByte)
    {
    case 1: 
      localObject = new zboy(this);
      ((zboy)localObject).a(paramArrayOfString, paramWorksheet);
      ((zboy)localObject).a();
      this.f = ((zawr)localObject);
      a((zboy)localObject);
      break;
    case 4: 
      localObject = new zno(this, paramArrayOfString, paramPivotPageFields, paramBoolean);
      ((zno)localObject).a(paramArrayOfString, paramWorksheet);
      ((zno)localObject).a();
      this.f = ((zawr)localObject);
      a((zno)localObject);
      break;
    default: 
      throw new IllegalArgumentException("Unsupported PivotTable source type.");
    }
    this.s = new zawo();
    this.s.a(this);
  }
  
  zaws(zawq paramzawq)
  {
    this.e = paramzawq;
    this.k = new DateTime();
    this.s = new zawo();
  }
  
  boolean a(Worksheet paramWorksheet)
  {
    Object localObject;
    switch (this.f.c())
    {
    case 1: 
      localObject = ((zboy)this.f).g();
      return (localObject != null) && (((Range)localObject).b.g() == paramWorksheet);
    case 4: 
      localObject = (zno)this.f;
      for (int i = 0; i < ((zno)localObject).b.length; i++)
      {
        Range localRange = localObject.b[i].b.g();
        if ((localRange != null) && (localRange.b.g() == paramWorksheet)) {
          return true;
        }
      }
    }
    return false;
  }
  
  void a(zawp paramzawp, CopyOptions paramCopyOptions)
  {
    this.f = zawr.a(this, paramzawp.a());
    this.f.a(paramzawp.f, paramCopyOptions);
    this.g = paramzawp.g;
    if (paramCopyOptions.a())
    {
      this.b = paramzawp.b;
      this.c = paramzawp.c;
    }
    this.d = paramzawp.d;
    this.n = paramzawp.n;
    this.o = paramzawp.o;
    this.p = paramzawp.p;
    this.q = paramzawp.q;
    this.r = paramzawp.r;
    this.t = paramzawp.t;
    this.x = paramzawp.x;
    this.k = paramzawp.k;
    this.u = paramzawp.u;
    this.v = paramzawp.v;
    if (null != paramzawp.y) {
      this.y = ((byte[])za.a(paramzawp.y));
    }
    if (null != paramzawp.z) {
      this.z = ((byte[])za.a(paramzawp.z));
    }
    this.w = paramzawp.w;
    if (paramzawp.h != null)
    {
      this.h = new zawu(this);
      this.h.a(paramzawp.h);
    }
    int i;
    int j;
    Object localObject;
    if (paramzawp.i != null)
    {
      i = paramzawp.i.size();
      this.i = new ArrayList(i);
      for (j = 0; j < i; j++)
      {
        localObject = new zbtv(this);
        ((zbtv)localObject).a((zbtv)paramzawp.i.get(j));
        zf.a(this.i, localObject);
      }
    }
    if (paramzawp.j != null)
    {
      i = paramzawp.j.size();
      this.i = new ArrayList(i);
      for (j = 0; j < i; j++)
      {
        localObject = new zbtv(this);
        ((zbtv)localObject).a((zbtv)paramzawp.j.get(j));
        zf.a(this.i, localObject);
      }
    }
    if (paramzawp.m != null)
    {
      i = paramzawp.m.getCount();
      this.m = new zawz();
      for (j = 0; j < i; j++)
      {
        localObject = new zaxa(this);
        ((zaxa)localObject).a(paramzawp.m.a(j));
        this.m.a((zaxa)localObject);
      }
    }
    if (paramzawp.s != null)
    {
      this.s = new zawo();
      this.s.a(paramzawp.s);
    }
  }
  
  int a(String paramString)
  {
    ArrayList localArrayList1 = this.i;
    String str = paramString.toUpperCase();
    if ((str != null) && (str.charAt(0) == '\'')) {
      str = str.substring(1, 1 + (str.length() - 2));
    }
    this.B = ((zbtv)this.i.get(this.i.size() - 1));
    ArrayList localArrayList2 = this.B.f;
    int i = -1;
    for (int j = 0; j < localArrayList2.size(); j++)
    {
      zbui localzbui = (zbui)localArrayList2.get(j);
      if (((zbtv)localArrayList1.get(localzbui.b & 0xFFFF)).a.toUpperCase().equals(str))
      {
        i = j;
        break;
      }
    }
    if (i == -1) {
      for (j = 0; j < localArrayList1.size(); j++) {
        if (((zbtv)localArrayList1.get(j)).a.toUpperCase().equals(str))
        {
          i = localArrayList2.size();
          zf.a(localArrayList2, new zbui(j));
          break;
        }
      }
    }
    return i;
  }
  
  void a(String paramString1, String paramString2)
  {
    this.A = -1;
    for (int i = 0; i < this.i.size(); i++)
    {
      localObject1 = (zbtv)this.i.get(i);
      if ((((zbtv)localObject1).a != null) && (zw.b(((zbtv)localObject1).a, paramString1)))
      {
        if ((!zw.b(paramString2)) && (!paramString2.equals(((zbtv)localObject1).d)))
        {
          ((zbtv)localObject1).d = paramString2;
          localObject2 = this.e.a;
          ((WorksheetCollection)localObject2).a(this);
          ((zbtv)localObject1).e = ((WorksheetCollection)localObject2).y().a(-1, paramString2, 0, 0, 0, 64, false, false, false);
        }
        this.A = i;
        return;
      }
    }
    zbtv localzbtv1 = new zbtv(this, paramString1, paramString2);
    zf.a(this.i, localzbtv1);
    Object localObject1 = this.e.a;
    ((WorksheetCollection)localObject1).a(this);
    localzbtv1.e = ((WorksheetCollection)localObject1).y().a(-1, paramString2, 0, 0, 0, 64, false, false, false);
    ((WorksheetCollection)localObject1).a(null);
    Object localObject2 = this.e.a.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Worksheet localWorksheet = (Worksheet)((Iterator)localObject2).next();
      if ((localWorksheet.b != null) && (localWorksheet.b.getCount() != 0)) {
        for (int j = 0; j < localWorksheet.b.getCount(); j++) {
          if (localWorksheet.b.get(j).d == this)
          {
            localWorksheet.b.get(j).getBaseFields().a(localzbtv1);
            for (int k = 0; k < this.i.size(); k++)
            {
              zbtv localzbtv2 = (zbtv)this.i.get(k);
              if ((localzbtv2.m()) && (localzbtv2 != localzbtv1) && (localWorksheet.b.get(j).getBaseFields().a(localzbtv2.a) == null)) {
                localWorksheet.b.get(j).getBaseFields().a(localzbtv2);
              }
            }
          }
        }
      }
    }
  }
  
  int f()
  {
    for (int i = 0; i < this.e.getCount(); i++) {
      if (this.e.a(i) == this) {
        return i;
      }
    }
    return -1;
  }
  
  void a(int paramInt)
  {
    zbtv localzbtv = (zbtv)this.i.get(paramInt);
    for (int i = 0; i < localzbtv.c.size(); i++)
    {
      zbos localzbos = (zbos)localzbtv.c.get(i);
      if ((localzbos.a instanceof Double)) {
        localzbtv.d(true);
      } else if ((localzbos.a instanceof Integer)) {
        localzbtv.c(true);
      } else if ((localzbos.a instanceof String)) {
        localzbtv.e(true);
      } else if (localzbos.a == null) {
        localzbtv.j(true);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    this.f.a(paramInt1, paramInt2, paramWorksheet);
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    this.f.b(paramInt1, paramInt2, paramWorksheet);
  }
  
  private String j()
  {
    GlobalizationSettings localGlobalizationSettings = this.e.a.p().getSettings().getGlobalizationSettings();
    return localGlobalizationSettings.getEmptyDataName();
  }
  
  String b(int paramInt)
  {
    if (this.B == null) {
      return "";
    }
    ArrayList localArrayList = this.B.f;
    zbui localzbui = (zbui)localArrayList.get(paramInt);
    zbtv localzbtv = (zbtv)this.i.get(localzbui.b & 0xFFFF);
    String str1 = localzbtv.a;
    String str2 = "";
    if (str1 == null) {
      str2 = j();
    } else {
      str2 = str1;
    }
    if (zaap.b(str2)) {
      str2 = '\'' + str2 + '\'';
    }
    return str2;
  }
  
  void a(zahh paramzahh, int paramInt)
  {
    if (this.B == null) {
      return;
    }
    ArrayList localArrayList = this.B.f;
    zbui localzbui = (zbui)localArrayList.get(paramInt);
    zbtv localzbtv = (zbtv)this.i.get(localzbui.b & 0xFFFF);
    String str1 = localzbtv.a;
    String str2 = "";
    if (str1 == null) {
      str2 = j();
    } else {
      str2 = str1;
    }
    if (zabq.b(str2))
    {
      paramzahh.a('\'');
      paramzahh.a(str2);
      paramzahh.a('\'');
    }
    else
    {
      paramzahh.a(str2);
    }
  }
  
  void a(ArrayList paramArrayList)
  {
    for (int i = 0; i < this.i.size(); i++)
    {
      zbtv localzbtv = (zbtv)this.i.get(i);
      if ((localzbtv.d != null) || (localzbtv.m()) || ((localzbtv.c != null) && (localzbtv.c.size() == 0) && (localzbtv.j != null))) {
        zf.a(paramArrayList, localzbtv);
      }
    }
  }
  
  private ArrayList a(zbtv paramzbtv)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramzbtv.c != null) {
      for (int i = 0; i < paramzbtv.c.size(); i++)
      {
        zbos localzbos = (zbos)paramzbtv.c.get(i);
        if ((localzbos != null) && (localzbos.b)) {
          zf.a(localArrayList, localzbos);
        }
      }
    }
    return localArrayList;
  }
  
  void g()
  {
    if (this.m == null) {
      return;
    }
    int i = this.m.getCount();
    zaxa localzaxa = null;
    ArrayList localArrayList1 = null;
    zbtz localzbtz = null;
    int j = 0;
    ArrayList localArrayList2 = null;
    int k = 0;
    for (int m = 0; m < i; m++)
    {
      localzaxa = this.m.a(m);
      if ((null != localzaxa.g) && (null != localzaxa.g.e))
      {
        localArrayList1 = localzaxa.g.e;
        j = localArrayList1.size();
        for (int n = 0; n < j; n++)
        {
          localzbtz = (zbtz)localArrayList1.get(n);
          localArrayList2 = localzbtz.c;
          k = localArrayList2.size();
          for (int i1 = 0; i1 < k; i1++)
          {
            int i2 = a(((Integer)localArrayList2.get(i1)).intValue(), ((zbtv)this.j.get(localzbtz.b() & 0xFFFF)).c, ((zbtv)this.i.get(localzbtz.b() & 0xFFFF)).c);
            if (i2 != -1) {
              localArrayList2.set(i1, Integer.valueOf(i2));
            }
          }
        }
      }
    }
  }
  
  private int a(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if ((null == paramArrayList1) || (paramInt >= paramArrayList1.size()) || (paramArrayList2 == null)) {
      return -1;
    }
    zbos localzbos1 = (zbos)paramArrayList1.get(paramInt);
    int i = paramArrayList2.size();
    zbos localzbos2 = null;
    for (int j = 0; j < i; j++)
    {
      localzbos2 = (zbos)paramArrayList2.get(j);
      if (localzbos2.a == localzbos1.a) {
        return j;
      }
    }
    return -1;
  }
  
  void h()
  {
    switch (this.f.c())
    {
    case 1: 
      a((zboy)this.f);
      break;
    case 4: 
      a((zno)this.f);
      break;
    }
  }
  
  private void a(zboy paramzboy)
  {
    ArrayList localArrayList1 = new ArrayList();
    if (this.i != null) {
      a(localArrayList1);
    }
    Range localRange = paramzboy.g();
    if (localRange == null) {
      return;
    }
    Cells localCells = localRange.b;
    int i = localRange.getFirstRow();
    int j = localRange.getFirstColumn();
    int k = localRange.getColumnCount();
    this.j = this.i;
    this.i = new ArrayList(localRange.getColumnCount());
    int m = localRange.getFirstRow() + localRange.getRowCount() - 1;
    m = Math.min(localCells.getMaxDataRow() + 1, m);
    if (m <= localRange.getFirstRow()) {
      m = localRange.getFirstRow() + 1;
    }
    int n = m - localRange.getFirstRow();
    this.h = new zawu(this, n, k);
    Cell localCell = null;
    int i1 = -1;
    Object[] arrayOfObject = new Object[2];
    HashMap localHashMap = new HashMap();
    int i2 = 2;
    Object localObject1;
    Object localObject2;
    for (int i3 = 0; i3 < localRange.getColumnCount(); i3++)
    {
      localCell = localCells.a(i, i3 + j, false);
      if (!localHashMap.containsKey(localCell.k()))
      {
        localHashMap.put(localCell.k(), Integer.valueOf(i3));
        zf.a(this.i, new zbtv(this, localCell.k(), true));
      }
      else
      {
        localObject1 = localCell.k() + i2++;
        localHashMap.put(localObject1, Integer.valueOf(i3));
        zf.a(this.i, new zbtv(this, (String)localObject1, true));
      }
      localObject1 = (zbtv)this.i.get(i3);
      i1 = -1;
      localObject2 = new HashMap();
      ArrayList localArrayList2 = new ArrayList();
      int i4 = 0;
      this.h.b[i3] = true;
      for (int i5 = 1; i5 <= n; i5++)
      {
        localCell = localCells.checkCell(i5 + i, i3 + j);
        a(localCell == null ? null : localCell.m(), (zbtv)localObject1, (HashMap)localObject2, arrayOfObject);
        Object localObject4;
        if (arrayOfObject[1] == null)
        {
          if (i1 == -1)
          {
            localObject4 = new zbos();
            ((zbos)localObject4).a = null;
            zf.a(localArrayList2, localObject4);
            i1 = i4++;
            ((zbtv)localObject1).j(true);
          }
          ((Object[])this.h.a.get(i5 - 1))[i3] = Integer.valueOf(i1);
        }
        else
        {
          localObject4 = ((HashMap)localObject2).get(arrayOfObject[0]);
          if (localObject4 == null)
          {
            ((Object[])this.h.a.get(i5 - 1))[i3] = Integer.valueOf(i4);
            ((HashMap)localObject2).put(arrayOfObject[0], Integer.valueOf(i4++));
            zbos localzbos = new zbos();
            localzbos.a = arrayOfObject[1];
            zf.a(localArrayList2, localzbos);
          }
          else
          {
            ((Object[])this.h.a.get(i5 - 1))[i3] = ((Integer)localObject4);
          }
        }
      }
      Object localObject3;
      if ((this.j != null) && (i3 < this.j.size()))
      {
        localObject3 = a((zbtv)this.j.get(i3));
        if (((ArrayList)localObject3).size() > 0)
        {
          zf.a(localArrayList2, (Collection)localObject3);
          ((zbtv)localObject1).e(true);
        }
      }
      ((zbtv)localObject1).c = localArrayList2;
      if ((this.j != null) && (i3 < this.j.size()))
      {
        localObject3 = (zbtv)this.j.get(i3);
        if (((zbtv)localObject1).j())
        {
          ((zbtv)localObject1).k = localObject1.x()[0];
          ((zbtv)localObject1).l = localObject1.x()[1];
        }
        ((zbtv)localObject1).j = ((zbtv)localObject3).j;
        ((zbtv)localObject1).q = ((zbtv)localObject3).q;
      }
      if (((zbtv)localObject1).j != null) {
        ((zbtv)localObject1).h(true);
      }
    }
    for (i3 = 0; i3 < localArrayList1.size(); i3++) {
      zf.a(this.i, localArrayList1.get(i3));
    }
    for (i3 = 0; i3 < this.i.size(); i3++)
    {
      localObject1 = (zbtv)this.i.get(i3);
      if ((localObject1 != null) && (this.j != null) && (!((zbtv)localObject1).m()) && (i3 < this.j.size()))
      {
        localObject2 = (zbtv)this.j.get(i3);
        if (!zw.b(((zbtv)localObject1).a, ((zbtv)localObject2).a))
        {
          this.x = true;
          break;
        }
      }
    }
  }
  
  private void a(zno paramzno, int paramInt, zbtv paramzbtv)
  {
    int i = 1;
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int j = 0;
    int[] arrayOfInt = new int[paramzno.b.length];
    for (int k = 0; k < paramzno.b.length; k++) {
      arrayOfInt[k] = paramzno.b[k].a[paramInt];
    }
    k = 0;
    int m = 0;
    int i1;
    for (int n = 0; n < arrayOfInt.length; n++)
    {
      m = 0;
      for (i1 = arrayOfInt.length - 2; i1 >= n; i1--) {
        if (arrayOfInt[(i1 + 1)] < arrayOfInt[i1])
        {
          k = arrayOfInt[(i1 + 1)];
          arrayOfInt[(i1 + 1)] = arrayOfInt[i1];
          arrayOfInt[i1] = k;
          m = 1;
        }
      }
      if (m == 0) {
        break;
      }
    }
    for (n = 0; n < arrayOfInt.length; n++)
    {
      i1 = arrayOfInt[n];
      if (i1 == -1)
      {
        if (i != 0) {
          i = 0;
        }
      }
      else
      {
        for (int i2 = 0; (i2 < n) && (i1 != arrayOfInt[i2]); i2++) {}
        if (i2 == n)
        {
          localHashMap.put(paramzno.c[paramInt][i1], Integer.valueOf(j++));
          zbos localzbos2 = new zbos();
          localzbos2.a = paramzno.c[paramInt][i1];
          zf.a(localArrayList, localzbos2);
        }
      }
    }
    if (i == 0)
    {
      zbos localzbos1 = new zbos();
      localzbos1.a = null;
      zf.a(localArrayList, localzbos1);
    }
    paramzbtv.c = localArrayList;
    paramzbtv.e(true);
  }
  
  Object a(Object paramObject, zbtv paramzbtv, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    paramArrayOfBoolean1[0] = false;
    paramArrayOfBoolean2[0] = false;
    if (paramObject == null) {
      return null;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 18: 
      paramArrayOfBoolean1[0] = true;
      String str = (String)paramObject;
      if (str.length() > 255) {
        if (this.a) {
          str = str.substring(0, 255);
        } else {
          paramzbtv.p = true;
        }
      }
      if (!paramzbtv.i()) {
        paramzbtv.e(true);
      }
      return str;
    case 16: 
      paramArrayOfBoolean2[0] = true;
      DateTime localDateTime = (DateTime)paramObject;
      if (localDateTime.getMillisecond() != 0) {
        if (localDateTime.getMillisecond() > 500) {
          localDateTime = localDateTime.addMilliseconds(1000 - localDateTime.getMillisecond());
        } else {
          localDateTime = localDateTime.addMilliseconds(-localDateTime.getMillisecond());
        }
      }
      if (!paramzbtv.j()) {
        paramzbtv.f(true);
      }
      return localDateTime;
    case 14: 
      if (!paramzbtv.h()) {
        paramzbtv.d(true);
      }
      double d = ((Double)paramObject).doubleValue();
      if ((Math.abs(d) <= 2.147483647E9D) && (d == (int)d))
      {
        if (!paramzbtv.f()) {
          paramzbtv.c(true);
        }
        return Integer.valueOf((int)d);
      }
      if ((Math.abs(d) <= 9.223372036854776E18D) && (d == d))
      {
        if (!paramzbtv.f()) {
          paramzbtv.c(true);
        }
        return Long.valueOf(d);
      }
      if (paramzbtv.g()) {
        paramzbtv.c(false);
      }
      return Double.valueOf(d);
    case 9: 
      if (!paramzbtv.f()) {
        paramzbtv.c(true);
      }
      break;
    case 3: 
      if (!paramzbtv.i()) {
        paramzbtv.e(true);
      }
      break;
    }
    return paramObject;
  }
  
  private void a(Object paramObject, zbtv paramzbtv, HashMap paramHashMap, Object[] paramArrayOfObject)
  {
    paramArrayOfObject[0] = paramObject;
    paramArrayOfObject[1] = paramObject;
    if (paramObject == null) {
      return;
    }
    switch (zaoj.a(paramObject.getClass()))
    {
    case 18: 
      String str1 = (String)paramObject;
      if (str1.length() > 255) {
        if (this.a) {
          str1 = str1.substring(0, 255);
        } else {
          paramzbtv.p = true;
        }
      }
      if (!paramzbtv.i()) {
        paramzbtv.e(true);
      }
      paramArrayOfObject[0] = str1.toUpperCase();
      paramArrayOfObject[1] = str1;
      break;
    case 16: 
      DateTime localDateTime = (DateTime)paramObject;
      if (localDateTime.getMillisecond() != 0) {
        if (localDateTime.getMillisecond() > 500) {
          localDateTime = localDateTime.addMilliseconds(1000 - localDateTime.getMillisecond());
        } else {
          localDateTime = localDateTime.addMilliseconds(-localDateTime.getMillisecond());
        }
      }
      if (!paramzbtv.j()) {
        paramzbtv.f(true);
      }
      paramArrayOfObject[0] = (zs.a(localDateTime).toUpperCase() + localDateTime.e() / 10000000L);
      paramArrayOfObject[1] = localDateTime;
      break;
    case 14: 
      if (paramHashMap.get(paramObject) != null) {
        return;
      }
      double d = ((Double)paramObject).doubleValue();
      String str2 = zauj.b(d);
      d = zauj.C(str2);
      if ((Math.abs(d) <= 2.147483647E9D) && (d == (int)d))
      {
        if (!paramzbtv.f()) {
          paramzbtv.c(true);
        }
        paramObject = Integer.valueOf((int)d);
      }
      else if ((Math.abs(d) <= 9.223372036854776E18D) && (d == d))
      {
        if (!paramzbtv.f()) {
          paramzbtv.c(true);
        }
        paramObject = Long.valueOf(d);
      }
      else
      {
        paramObject = Double.valueOf(d);
      }
      if ((!paramzbtv.h()) && ((paramObject instanceof Double))) {
        paramzbtv.d(true);
      }
      paramArrayOfObject[0] = paramObject;
      paramArrayOfObject[1] = paramObject;
      break;
    case 9: 
      if (!paramzbtv.f()) {
        paramzbtv.c(true);
      }
      break;
    case 3: 
      if (!paramzbtv.i()) {
        paramzbtv.e(true);
      }
      break;
    }
  }
  
  private void a(zno paramzno)
  {
    int i = paramzno.c == null ? 0 : paramzno.c.length;
    int j = 3 + i;
    this.i = new ArrayList(j);
    zbtv localzbtv1 = new zbtv(this, "Row", true);
    zf.a(this.i, localzbtv1);
    zbtv localzbtv2 = new zbtv(this, "Column", true);
    zf.a(this.i, localzbtv2);
    zbtv localzbtv3 = new zbtv(this, "Value", false);
    zf.a(this.i, localzbtv3);
    if (paramzno.c != null) {
      for (k = 0; k < paramzno.c.length; k++)
      {
        zf.a(this.i, new zbtv(this, "Page" + (k + 1), true));
        a(paramzno, k, (zbtv)this.i.get(3 + k));
      }
    }
    int k = 0;
    for (int m = 0; m < paramzno.b.length; m++)
    {
      localObject1 = paramzno.b[m].b.g();
      k += (((Range)localObject1).getRowCount() - 1) * (((Range)localObject1).getColumnCount() - 1);
    }
    this.h = new zawu(this, k, j);
    HashMap localHashMap1 = new HashMap();
    Object localObject1 = new ArrayList();
    localzbtv1.c = ((ArrayList)localObject1);
    int n = 0;
    HashMap localHashMap2 = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localzbtv2.c = localArrayList;
    int i1 = 0;
    int i2 = 0;
    Cell localCell = null;
    int i3 = 0;
    int i4 = -1;
    int i5 = -1;
    int i6 = 0;
    int i7 = 0;
    for (int i8 = 0; i8 < paramzno.b.length; i8++)
    {
      Range localRange = paramzno.b[i8].b.g();
      Cells localCells = localRange.b;
      int i9 = localRange.getFirstRow();
      int i10 = localRange.getRowCount() - 1;
      int i11 = localRange.getFirstColumn();
      int i12 = localRange.getColumnCount() - 1;
      int[] arrayOfInt1 = null;
      if (paramzno.b[i8].a != null)
      {
        arrayOfInt1 = new int[paramzno.b[i8].a.length];
        for (int i13 = 0; i13 < arrayOfInt1.length; i13++) {
          if (paramzno.b[i8].a[i13] == -1) {
            arrayOfInt1[i13] = (((zbtv)this.i.get(3 + i8)).c.size() - 1);
          } else {
            arrayOfInt1[i13] = paramzno.b[i8].a[i13];
          }
        }
      }
      int[] arrayOfInt2 = new int[i12];
      Object localObject2;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      zbos localzbos;
      for (int i14 = 1; i14 <= i12; i14++)
      {
        localCell = localCells.a(i9, i11 + i14, false);
        if (localCell.getType() == 3)
        {
          if (i4 == -1)
          {
            localObject2 = new zbos();
            ((zbos)localObject2).a = null;
            zf.a(localArrayList, localObject2);
            i4 = i1++;
          }
          arrayOfInt2[(i14 - 1)] = i4;
        }
        else
        {
          localObject2 = new boolean[] { i6 };
          localObject3 = new boolean[] { i7 };
          localObject4 = a(localCell.getValue(), localzbtv2, (boolean[])localObject2, (boolean[])localObject3);
          i6 = localObject2[0];
          i7 = localObject3[0];
          if (localObject4 == null)
          {
            if (i4 == -1)
            {
              localObject5 = new zbos();
              ((zbos)localObject5).a = null;
              zf.a(localArrayList, localObject5);
              i4 = i1++;
            }
            arrayOfInt2[(i14 - 1)] = i4;
          }
          else
          {
            localObject5 = null;
            if (i6 != 0) {
              localObject5 = localHashMap2.get(((String)localObject4).toUpperCase());
            } else if (i7 != 0) {
              localObject5 = localHashMap2.get(zs.a(localObject4).toUpperCase());
            } else {
              localObject5 = localHashMap2.get(localObject4);
            }
            if (localObject5 == null)
            {
              i3 = i1;
              if (i6 != 0) {
                localHashMap2.put(((String)localObject4).toUpperCase(), Integer.valueOf(i1++));
              } else if (i7 != 0) {
                localHashMap2.put(zs.a(localObject4).toUpperCase(), Integer.valueOf(i1++));
              } else {
                localHashMap2.put(localObject4, Integer.valueOf(i1++));
              }
              localzbos = new zbos();
              localzbos.a = localObject4;
              zf.a(localArrayList, localzbos);
            }
            else
            {
              i3 = ((Integer)localObject5).intValue();
            }
            arrayOfInt2[(i14 - 1)] = i3;
          }
        }
      }
      for (i14 = 1; i14 <= i10; i14++)
      {
        localCell = localCells.a(i14 + i9, i11, false);
        if (localCell.getType() == 3)
        {
          if (i5 == -1)
          {
            localObject2 = new zbos();
            ((zbos)localObject2).a = null;
            zf.a((ArrayList)localObject1, localObject2);
            i5 = n++;
          }
          i3 = i5;
        }
        else
        {
          localObject2 = new boolean[] { i6 };
          localObject3 = new boolean[] { i7 };
          localObject4 = a(localCell.getValue(), localzbtv1, (boolean[])localObject2, (boolean[])localObject3);
          i6 = localObject2[0];
          i7 = localObject3[0];
          if (localObject4 == null)
          {
            if (i5 == -1)
            {
              i5 = n++;
              localObject5 = new zbos();
              ((zbos)localObject5).a = null;
              zf.a((ArrayList)localObject1, localObject5);
            }
            i3 = i5;
          }
          else
          {
            localObject5 = null;
            if (i6 != 0) {
              localObject5 = localHashMap1.get(((String)localObject4).toUpperCase());
            } else if (i7 != 0) {
              localObject5 = localHashMap1.get(zs.a(localObject4).toUpperCase());
            } else {
              localObject5 = localHashMap1.get(localObject4);
            }
            if (localObject5 == null)
            {
              i3 = n;
              if (i6 != 0) {
                localHashMap1.put(((String)localObject4).toUpperCase(), Integer.valueOf(n++));
              } else if (i7 != 0) {
                localHashMap1.put(zs.a(localObject4).toUpperCase(), Integer.valueOf(n++));
              } else {
                localHashMap1.put(localObject4, Integer.valueOf(n++));
              }
              localzbos = new zbos();
              localzbos.a = localObject4;
              zf.a((ArrayList)localObject1, localzbos);
            }
            else
            {
              i3 = ((Integer)localObject5).intValue();
            }
          }
        }
        for (int i15 = 0; i15 < i12; i15++)
        {
          localObject3 = (Object[])this.h.a.get(i2);
          localObject3[0] = Integer.valueOf(i3);
          localObject3[1] = Integer.valueOf(arrayOfInt2[i15]);
          localCell = localCells.checkCell(i14 + i9, i11 + i15 + 1);
          if (localCell == null) {
            localObject3[2] = null;
          } else {
            localObject3[2] = localCell.getValue();
          }
          for (int i16 = 0; i16 < arrayOfInt1.length; i16++) {
            localObject3[(3 + i16)] = Integer.valueOf(arrayOfInt1[i16] & 0xFFFF);
          }
          i2++;
        }
      }
    }
  }
  
  boolean i()
  {
    return c(4);
  }
  
  void a(boolean paramBoolean)
  {
    a(paramBoolean, 4);
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.g &= (paramInt ^ 0xFFFFFFFF);
    this.g |= (paramBoolean ? paramInt & 0xFFFF : 0);
  }
  
  boolean c(int paramInt)
  {
    return (this.g & 0xFFFF & paramInt) != 0;
  }
  
  void a(boolean paramBoolean, zcw paramzcw)
  {
    Object localObject;
    switch (this.f.c())
    {
    case 1: 
      localObject = (zboy)this.f;
      ((zboy)localObject).a(paramBoolean, paramzcw);
      break;
    case 4: 
      localObject = (zno)this.f;
      for (int i = 0; i < ((zno)localObject).b.length; i++) {
        localObject.b[i].b.a(paramBoolean, paramzcw);
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */