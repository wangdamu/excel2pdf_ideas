package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CopyOptions
{
  private Worksheet m;
  private Worksheet n;
  private boolean o = false;
  boolean a = true;
  boolean b;
  HashMap c = null;
  HashMap d;
  int e;
  private HashMap p;
  boolean f;
  private boolean q;
  private boolean r = true;
  boolean g = false;
  boolean h = true;
  boolean i = true;
  private HashMap s;
  private int t = -1;
  Workbook j;
  Workbook k;
  private int u = -1;
  private HashMap[] v;
  private boolean w = false;
  private boolean x = true;
  zaml l;
  private boolean y;
  private int z;
  
  public CopyOptions()
  {
    this.e = 1;
    if (!a()) {
      this.d = new HashMap();
    }
  }
  
  CopyOptions(int copyType)
  {
    this.e = copyType;
  }
  
  CopyOptions(int copyType, Cell source, Cell dest)
  {
    this.e = copyType;
    Worksheet localWorksheet1 = source.d.g();
    Worksheet localWorksheet2 = dest.d.g();
    this.j = localWorksheet1.c().p();
    this.k = localWorksheet2.c().p();
    if (!a()) {
      this.d = new HashMap();
    }
    this.m = localWorksheet1;
    this.n = localWorksheet2;
  }
  
  CopyOptions(int copyType, Workbook source, Workbook dest)
  {
    this.e = copyType;
    this.j = source;
    this.k = dest;
    if (!a()) {
      this.d = new HashMap();
    }
  }
  
  CopyOptions(int copyType, Worksheet sourceSheet, Worksheet destSheet)
  {
    this.e = copyType;
    this.j = sourceSheet.c().p();
    this.k = destSheet.c().p();
    if (!a()) {
      this.d = new HashMap();
    }
    this.m = sourceSheet;
    this.n = destSheet;
  }
  
  public boolean getExtendToAdjacentRange()
  {
    return this.o;
  }
  
  public void setExtendToAdjacentRange(boolean value)
  {
    this.o = value;
  }
  
  void a(int paramInt)
  {
    this.p = new HashMap();
    ArrayList localArrayList = new ArrayList();
    NameCollection localNameCollection1 = this.j.getWorksheets().getNames();
    NameCollection localNameCollection2 = this.k.getWorksheets().getNames();
    String str;
    int i7;
    int i8;
    int i2;
    Object localObject;
    switch (this.e)
    {
    case 3: 
      WorksheetCollection localWorksheetCollection = this.j.getWorksheets();
      if ((localWorksheetCollection.getNames() != null) && (localWorksheetCollection.getNames().getCount() > 0))
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put(Integer.valueOf(-1), Integer.valueOf(-1));
        for (int i3 = 0; i3 < localWorksheetCollection.getCount(); i3++)
        {
          int i4 = i3 + paramInt;
          localHashMap.put(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        for (i3 = 0; i3 < localWorksheetCollection.getNames().getCount(); i3++)
        {
          Name localName1 = localWorksheetCollection.getNames().get(i3);
          int i6 = localName1.getSheetIndex() - 1;
          str = localName1.getText();
          if ((i6 == -1) && (localNameCollection2.a(str, i6, false) != -1))
          {
            i7 = localName1.s();
            if ((i7 < 0) || (i7 >= localWorksheetCollection.getCount()) || (i7 == i6)) {
              str = str + "_1";
            } else {
              i6 = i7;
            }
          }
          i7 = -1;
          if (i6 != -1) {
            i7 = ((Integer)localHashMap.get(Integer.valueOf(i6))).intValue();
          }
          i8 = localNameCollection2.a(i7, str);
          this.p.put(Integer.valueOf(i3), Integer.valueOf(i8));
          zf.a(localArrayList, Integer.valueOf(i3));
        }
      }
      break;
    case 1: 
    case 2: 
      int i1 = !c() ? 1 : 0;
      if ((this.e == 2) && (b())) {
        i1 = 0;
      }
      if (i1 != 0)
      {
        i2 = localNameCollection1.getCount();
        localObject = new ArrayList();
        for (int i5 = 0; i5 < i2; i5++)
        {
          Name localName3 = localNameCollection1.get(i5);
          str = localName3.getText();
          i7 = localName3.getSheetIndex() - 1;
          i8 = 0;
          int i9 = 0;
          int i10;
          if (i7 == -1)
          {
            i7 = localName3.s();
            if (i7 == this.m.getIndex())
            {
              i9 = 1;
              i8 = this.n.getIndex();
              if (!b())
              {
                i10 = localNameCollection2.a(localName3.getText(), -1, false);
                if (i10 == -1) {
                  i8 = -1;
                } else if ((i10 < i2) && (localNameCollection2.a(localName3.getText(), i7, false) != -1)) {
                  i9 = 0;
                }
              }
            }
            else if (localName3.getRefersTo() == null)
            {
              i10 = localNameCollection2.a(localName3.getText(), -1, false);
              if (i10 == -1)
              {
                i9 = 1;
                i8 = -1;
              }
            }
          }
          else if (i7 == this.m.getIndex())
          {
            i9 = 1;
            i8 = this.n.getIndex();
          }
          if (i9 != 0)
          {
            i10 = localNameCollection2.c(i8, str);
            Name localName4 = localNameCollection2.get(i10);
            if (!((ArrayList)localObject).contains(localName4))
            {
              zf.a((ArrayList)localObject, localName4);
              this.p.put(Integer.valueOf(i5), Integer.valueOf(i10));
              zf.a(localArrayList, Integer.valueOf(i5));
            }
          }
        }
      }
      break;
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      i2 = ((Integer)localIterator.next()).intValue();
      localObject = localNameCollection1.get(i2);
      Name localName2 = localNameCollection2.get(((Integer)this.p.get(Integer.valueOf(i2))).intValue());
      localName2.a((Name)localObject, this);
    }
  }
  
  boolean a()
  {
    return this.e == 0;
  }
  
  boolean b()
  {
    return this.j == this.k;
  }
  
  boolean c()
  {
    return (this.m != null) && (this.m == this.n);
  }
  
  Range a(Range paramRange)
  {
    if (paramRange == null) {
      return null;
    }
    WorksheetCollection localWorksheetCollection = this.j.getWorksheets();
    Worksheet localWorksheet1 = paramRange.b.g();
    if ((a()) || (b()) || (this.e == 3)) {
      return this.k.getWorksheets().get(paramRange.b.g().getName()).getCells().createRange(paramRange.getFirstRow(), paramRange.getFirstColumn(), paramRange.getRowCount(), paramRange.getColumnCount());
    }
    int i1 = this.j.getWorksheets().r().f(localWorksheetCollection.v(), localWorksheet1.getIndex(), localWorksheet1.getIndex());
    if ((this.s != null) && (this.s.get(Integer.valueOf(i1)) != null))
    {
      int i2 = ((Integer)this.s.get(Integer.valueOf(i1))).intValue();
      int i3 = this.k.getWorksheets().r().d(i2, this.k.getWorksheets().v());
      if ((i3 >= 0) && (i3 < this.k.getWorksheets().getCount()))
      {
        Worksheet localWorksheet2 = this.k.getWorksheets().get(i3);
        return localWorksheet2.getCells().createRange(paramRange.getFirstRow(), paramRange.getFirstColumn(), paramRange.getRowCount(), paramRange.getColumnCount());
      }
    }
    return null;
  }
  
  void d()
  {
    boolean bool = false;
    if (a()) {
      bool = true;
    } else if (b()) {
      bool = true;
    } else if (this.k.getWorksheets().T().a(this.j.getWorksheets().T())) {
      bool = true;
    }
    this.f = bool;
  }
  
  public boolean getCopyNames()
  {
    return this.r;
  }
  
  public void setCopyNames(boolean value)
  {
    this.r = value;
  }
  
  int e()
  {
    if (this.t == -1) {
      this.t = this.k.getWorksheets().r().a(this.k.getWorksheets().v(), true);
    }
    return this.t;
  }
  
  private void l()
  {
    zbti localzbti = new zbti(this.j);
    int i1 = this.k.getWorksheets().w().b(localzbti);
    int i2 = i1 != -1 ? 1 : 0;
    if (i1 == -1) {
      i1 = this.k.getWorksheets().w().a(localzbti);
    } else {
      localzbti = this.k.getWorksheets().w().a(i1);
    }
    if (this.s == null) {
      this.s = new HashMap();
    }
    int i6;
    if (i2 == 0)
    {
      int i3 = this.j.getWorksheets().v();
      for (int i5 = 0; i5 < this.j.getWorksheets().r().getCount(); i5++)
      {
        zwp localzwp = this.j.getWorksheets().r().b(i5);
        if (((localzwp.a & 0xFFFF) == i3) && (this.s.get(Integer.valueOf(i5)) == null))
        {
          int i8 = this.k.getWorksheets().r().b(i1 & 0xFFFF, localzwp.b & 0xFFFF, localzwp.c & 0xFFFF);
          this.s.put(Integer.valueOf(i5), Integer.valueOf(i8));
        }
      }
    }
    else
    {
      NameCollection localNameCollection = this.j.getWorksheets().getNames();
      Object localObject;
      if (localNameCollection.getCount() > 0)
      {
        if (localzbti.b() == null) {
          localzbti.a(new ArrayList());
        }
        ArrayList localArrayList = localzbti.b();
        for (i7 = 0; i7 < localNameCollection.getCount(); i7++)
        {
          localObject = localNameCollection.get(i7);
          zwh localzwh = new zwh(localzbti);
          localzwh.a(((Name)localObject).getText());
          localzwh.c(((Name)localObject).getSheetIndex());
          int i10 = localzbti.a(localzwh, i7);
          if (i10 == -1)
          {
            localzwh.a(this.k.getWorksheets(), ((Name)localObject).getRefersTo());
            zf.a(localArrayList, localzwh);
            i10 = localArrayList.size() - 1;
          }
          if (i7 != i10) {
            a(i1, i7, i10);
          }
        }
      }
      i6 = this.j.getWorksheets().v();
      for (int i7 = 0; i7 < this.j.getWorksheets().r().getCount(); i7++)
      {
        localObject = this.j.getWorksheets().r().b(i7);
        if (((((zwp)localObject).a & 0xFFFF) == i6) && (this.s.get(Integer.valueOf(i7)) == null))
        {
          int i9 = this.k.getWorksheets().r().a(i1 & 0xFFFF, ((zwp)localObject).b & 0xFFFF, ((zwp)localObject).c & 0xFFFF, true);
          this.s.put(Integer.valueOf(i7), Integer.valueOf(i9));
        }
      }
    }
    if (this.j.getWorksheets().getNames().getCount() > 0)
    {
      int i4 = 65534;
      i6 = this.j.getWorksheets().r().f(this.j.getWorksheets().v(), i4, i4);
      if (i6 != -1) {
        i6 = ((Integer)this.s.get(Integer.valueOf(i6))).intValue();
      } else {
        i6 = this.k.getWorksheets().r().b(i1 & 0xFFFF, i4, i4);
      }
      this.u = i6;
    }
  }
  
  private void k(int paramInt)
  {
    zbti localzbti1 = this.j.getWorksheets().w().a(paramInt);
    zbti localzbti2 = new zbti(this.k);
    localzbti2.b(localzbti1);
    int i1 = this.k.getWorksheets().w().a(localzbti2);
    for (int i2 = 0; i2 < this.j.getWorksheets().r().getCount(); i2++)
    {
      zwp localzwp = this.j.getWorksheets().r().b(i2);
      if (((localzwp.a & 0xFFFF) == paramInt) && (this.s.get(Integer.valueOf(i2)) == null))
      {
        int i3 = this.k.getWorksheets().r().b(i1 & 0xFFFF, localzwp.b & 0xFFFF, localzwp.c & 0xFFFF);
        this.s.put(Integer.valueOf(i2), Integer.valueOf(i3));
      }
    }
  }
  
  void a(Worksheet paramWorksheet1, Worksheet paramWorksheet2)
  {
    this.j = paramWorksheet1.c().p();
    this.k = paramWorksheet2.c().p();
    this.m = paramWorksheet1;
    this.n = paramWorksheet2;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.v == null) {
      this.v = new HashMap[this.j.getWorksheets().w().getCount()];
    }
    if (this.v[paramInt1] == null) {
      this.v[paramInt1] = new HashMap();
    }
    this.v[paramInt1].put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    zbth localzbth1 = this.j.getWorksheets().w();
    zbth localzbth2 = this.k.getWorksheets().w();
    zbti localzbti1 = localzbth1.a(paramInt1);
    zbti localzbti2 = localzbth2.a(paramInt2);
    if ((localzbti1.b() == null) || (localzbti1.b().size() == 0)) {
      localzbti1.a(localzbti2.b());
    } else if (localzbti2.b() != null) {
      for (int i1 = 0; i1 < localzbti1.b().size(); i1++)
      {
        localObject = (zwh)localzbti1.b().get(i1);
        i2 = localzbti2.a((zwh)localObject, i1);
        if (i2 != i1)
        {
          if (i2 == -1)
          {
            if (localzbti2.b() == null) {
              localzbti2.a(new ArrayList());
            }
            zf.a(localzbti2.b(), localObject);
            i2 = localzbti2.b().size() - 1;
          }
          a(paramInt1, i1, i2);
        }
      }
    }
    zwq localzwq = this.j.getWorksheets().r();
    Object localObject = this.k.getWorksheets().r();
    for (int i2 = 0; i2 < localzwq.getCount(); i2++)
    {
      zwp localzwp = localzwq.b(i2);
      if ((localzwp.a & 0xFFFF) == paramInt1) {
        this.s.put(Integer.valueOf(i2), Integer.valueOf(((zwq)localObject).a(paramInt2, localzwp.b & 0xFFFF, localzwp.c & 0xFFFF, true)));
      }
    }
  }
  
  void b(int paramInt)
  {
    if (this.s != null) {
      return;
    }
    int i1;
    int i2;
    Object localObject1;
    Object localObject2;
    int i5;
    Object localObject3;
    Object localObject5;
    switch (this.e)
    {
    case 0: 
      
    case 3: 
      this.s = new HashMap();
      i1 = this.j.getWorksheets().v();
      i2 = this.k.getWorksheets().v();
      localObject1 = this.j.getWorksheets().w();
      localObject2 = this.k.getWorksheets().w();
      for (int i3 = 0; i3 < ((zbth)localObject1).getCount(); i3++)
      {
        localObject4 = ((zbth)localObject1).a(i3);
        if ((((zbti)localObject4).a() != 1) && (((zbti)localObject4).l() != null))
        {
          i5 = ((zbth)localObject2).b((zbti)localObject4);
          if (i5 != -1) {
            c(i3, i5);
          } else {
            i5 = ((zbth)localObject2).a(this.j.getWorksheets(), this.k.getWorksheets(), (zbti)localObject4);
          }
        }
      }
      localObject3 = this.j.getWorksheets().r();
      Object localObject4 = this.k.getWorksheets().r();
      for (i5 = 0; i5 < ((zwq)localObject3).getCount(); i5++)
      {
        localObject5 = ((zwq)localObject3).b(i5);
        if ((((zwp)localObject5).a & 0xFFFF) == i1)
        {
          int i6 = -1;
          if ((((zwp)localObject5).b & 0xFFFF) == 65534) {
            i6 = g();
          } else if (((((zwp)localObject5).b & 0xFFFF) >= this.j.getWorksheets().getCount()) || ((((zwp)localObject5).b & 0xFFFF) < 0)) {
            i6 = e();
          } else if (((zwp)localObject5).b == ((zwp)localObject5).c) {
            i6 = ((zwq)localObject4).b(i2, (((zwp)localObject5).b & 0xFFFF) + paramInt);
          } else {
            i6 = ((zwq)localObject4).b(i2, (((zwp)localObject5).b & 0xFFFF) + paramInt, (((zwp)localObject5).c & 0xFFFF) + paramInt);
          }
          this.s.put(Integer.valueOf(i5), Integer.valueOf(i6));
        }
      }
      break;
    case 1: 
    case 2: 
      if (c()) {
        return;
      }
      i1 = this.j.getWorksheets().v();
      i2 = this.k.getWorksheets().v();
      localObject1 = this.j.getWorksheets().r();
      localObject2 = this.k.getWorksheets().r();
      localObject3 = ((zwq)localObject1).c(i1, this.m.getIndex());
      int i4 = ((zwq)localObject2).b(i2, this.n.getIndex());
      this.s = new HashMap();
      if ((this.e != 2) || (!b()) || (getReferToDestinationSheet())) {
        for (i5 = 0; i5 < localObject3.length; i5++) {
          this.s.put(Integer.valueOf(localObject3[i5]), Integer.valueOf(i4));
        }
      }
      if ((!b()) && (getReferToSheetWithSameName()))
      {
        Worksheet localWorksheet1;
        for (i5 = 0; i5 < ((zwq)localObject1).getCount(); i5++)
        {
          localObject5 = ((zwq)localObject1).b(i5);
          if ((((zwp)localObject5).a & 0xFFFF) == i1)
          {
            Worksheet localWorksheet2;
            if (((zwp)localObject5).b == ((zwp)localObject5).c)
            {
              if (((((zwp)localObject5).b & 0xFFFF) >= 0) && ((((zwp)localObject5).c & 0xFFFF) < this.m.c().getCount()))
              {
                localWorksheet1 = this.m.c().get(((zwp)localObject5).b & 0xFFFF);
                if (localWorksheet1 != this.m)
                {
                  localWorksheet2 = this.n.c().get(localWorksheet1.getName());
                  if (localWorksheet2 != null)
                  {
                    i4 = this.n.c().r().b(this.n.c().v(), localWorksheet2.getIndex());
                    this.s.put(Integer.valueOf(i5), Integer.valueOf(i4));
                  }
                }
              }
            }
            else if (((((zwp)localObject5).b & 0xFFFF) >= 0) && ((((zwp)localObject5).c & 0xFFFF) < this.m.c().getCount()) && ((((zwp)localObject5).c & 0xFFFF) >= 0) && ((((zwp)localObject5).c & 0xFFFF) < this.m.c().getCount()))
            {
              localWorksheet1 = this.m.c().get(((zwp)localObject5).b & 0xFFFF);
              localWorksheet2 = this.m.c().get(((zwp)localObject5).c & 0xFFFF);
              Worksheet localWorksheet3 = this.n.c().get(localWorksheet1.getName());
              Worksheet localWorksheet4 = this.n.c().get(localWorksheet2.getName());
              if ((localWorksheet3 != null) && (localWorksheet4 != null)) {
                this.s.put(Integer.valueOf(i5), Integer.valueOf(this.n.c().r().a(this.n.c().v(), localWorksheet3.getIndex(), localWorksheet4.getIndex(), true)));
              }
            }
          }
        }
        for (i5 = 0; i5 < this.m.c().getCount(); i5++)
        {
          localObject5 = this.m.c().get(i5);
          if (localObject5 != this.m)
          {
            localWorksheet1 = this.n.c().get(((Worksheet)localObject5).getName());
            if (localWorksheet1 != null)
            {
              localObject3 = this.m.c().r().c(this.m.c().v(), ((Worksheet)localObject5).getIndex());
              i4 = this.n.c().r().b(this.n.c().v(), localWorksheet1.getIndex());
              for (int i7 = 0; i7 < localObject3.length; i7++) {
                this.s.put(Integer.valueOf(localObject3[i7]), Integer.valueOf(i4));
              }
            }
          }
        }
      }
      if (getCopyInvalidFormulasAsValues()) {
        f();
      }
      break;
    }
  }
  
  void f()
  {
    if (getCopyInvalidFormulasAsValues())
    {
      for (int i1 = 0; i1 < this.m.c().r().getCount(); i1++) {
        if (this.s.get(Integer.valueOf(i1)) == null) {
          this.s.put(Integer.valueOf(i1), znq.i);
        }
      }
      if (this.p == null) {
        this.p = new HashMap();
      }
      HashMap localHashMap = new HashMap();
      for (int i2 = 0; i2 < this.m.c().getNames().getCount(); i2++)
      {
        Name localName = this.m.c().getNames().get(i2);
        if (localName.b() != null) {
          if (zaaq.a(localName.b(), -1, -1, this.m.c(), this.s, localHashMap))
          {
            localHashMap.put(Integer.valueOf(i2), znq.d);
            this.p.put(Integer.valueOf(i2), znq.i);
          }
          else
          {
            localHashMap.put(Integer.valueOf(i2), znq.e);
          }
        }
      }
    }
  }
  
  int g()
  {
    return this.k.getWorksheets().r().b(this.k.getWorksheets().v() & 0xFFFF, true);
  }
  
  int c(int paramInt)
  {
    if ((a()) || (c())) {
      return paramInt;
    }
    if (this.s == null) {
      b(0);
    }
    Object localObject = this.s.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      if (getCopyInvalidFormulasAsValues()) {
        return -1;
      }
      if (b()) {
        return paramInt;
      }
      zwp localzwp1 = this.j.getWorksheets().r().b(paramInt);
      if ((localzwp1.a & 0xFFFF) == this.j.getWorksheets().v())
      {
        if (((localzwp1.b & 0xFFFF) >= 0) && ((localzwp1.b & 0xFFFF) < this.j.getWorksheets().getCount())) {
          l();
        } else {
          this.s.put(Integer.valueOf(paramInt), Integer.valueOf(e()));
        }
      }
      else
      {
        zbti localzbti = this.j.getWorksheets().w().a(localzwp1.a & 0xFFFF);
        int i1 = this.k.getWorksheets().w().b(localzbti);
        if (i1 == -1)
        {
          k(localzwp1.a & 0xFFFF);
        }
        else
        {
          int i2 = localzwp1.a & 0xFFFF;
          for (int i3 = 0; i3 < this.j.getWorksheets().r().getCount(); i3++)
          {
            zwp localzwp2 = this.j.getWorksheets().r().b(i3);
            if ((localzwp2.a == localzwp1.a) && (this.s.get(Integer.valueOf(i3)) == null))
            {
              int i4 = this.k.getWorksheets().r().a(i1 & 0xFFFF, localzwp2.b & 0xFFFF, localzwp2.c & 0xFFFF, true);
              this.s.put(Integer.valueOf(i3), Integer.valueOf(i4));
            }
          }
        }
      }
    }
    if (localObject == null) {
      localObject = this.s.get(Integer.valueOf(paramInt));
    }
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    return e();
  }
  
  int d(int paramInt)
  {
    if ((a()) || (b())) {
      return paramInt;
    }
    if (this.d == null) {
      this.d = new HashMap();
    }
    int i1 = paramInt;
    if (paramInt >= this.j.getWorksheets().C().b()) {
      i1 = 15;
    }
    Object localObject = this.d.get(Integer.valueOf(i1));
    if (localObject != null) {
      return ((Integer)localObject).intValue();
    }
    Style localStyle = this.j.getWorksheets().C().a(paramInt);
    int i2 = this.k.getWorksheets().C().a(localStyle, this);
    this.d.put(Integer.valueOf(paramInt), Integer.valueOf(i2));
    return i2;
  }
  
  int e(int paramInt)
  {
    Name localName = this.j.getWorksheets().getNames().get(paramInt);
    int i1 = this.k.getWorksheets().getNames().a(localName.getText(), this.n == null ? -1 : this.n.getIndex(), true);
    if (i1 == -1)
    {
      i1 = this.k.getWorksheets().getNames().a(this.n == null ? -1 : this.n.getIndex(), localName.getText());
      if (this.p == null) {
        this.p = new HashMap();
      }
    }
    this.p.put(Integer.valueOf(paramInt), Integer.valueOf(i1));
    return i1;
  }
  
  int f(int paramInt)
  {
    if ((this.p != null) && (this.p.get(Integer.valueOf(paramInt)) != null)) {
      return ((Integer)this.p.get(Integer.valueOf(paramInt))).intValue();
    }
    if (b()) {
      return paramInt;
    }
    Name localName = this.j.getWorksheets().getNames().get(paramInt);
    NameCollection localNameCollection = this.k.getWorksheets().getNames();
    String str = localName.k();
    int i1 = localNameCollection.a(str, -1, false);
    int i2;
    if (i1 == -1)
    {
      i2 = localNameCollection.c(-1, str);
      if (this.p == null) {
        this.p = new HashMap();
      }
      this.p.put(Integer.valueOf(paramInt), Integer.valueOf(i2));
      localNameCollection.get(i2).a(localName, this);
      return i2;
    }
    if ((this.e == 1) || (this.e == 2))
    {
      i2 = localNameCollection.a(str, this.n.getIndex(), false);
      if (i2 == -1)
      {
        if ((this.e == 2) && (i1 != -1)) {
          return i1;
        }
        int i3 = localNameCollection.c(this.n.getIndex(), str);
        if (this.p == null) {
          this.p = new HashMap();
        }
        this.p.put(Integer.valueOf(paramInt), Integer.valueOf(i3));
        localNameCollection.get(i3).a(localName, this);
        return i3;
      }
      return i2;
    }
    return -1;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    zwp localzwp = this.j.getWorksheets().r().b(paramInt1);
    if ((this.v != null) && (this.v[(localzwp.a & 0xFFFF)] != null))
    {
      Object localObject = this.v[(localzwp.a & 0xFFFF)].get(Integer.valueOf(paramInt2));
      if (localObject != null) {
        return ((Integer)localObject).intValue();
      }
    }
    return paramInt2;
  }
  
  int[] g(int paramInt)
  {
    Name localName = this.j.getWorksheets().getNames().get(paramInt);
    if ((localName.b() == null) || (localName.o()) || (localName.getRefersTo() == null) || ("".equals(localName.getRefersTo()))) {
      return null;
    }
    if (this.u == -1) {
      l();
    }
    int[] arrayOfInt = new int[2];
    if ((this.v == null) || (this.v[this.j.getWorksheets().v()] == null))
    {
      arrayOfInt[0] = this.u;
      arrayOfInt[1] = paramInt;
    }
    else
    {
      arrayOfInt[0] = this.u;
      arrayOfInt[1] = ((Integer)this.v[this.j.getWorksheets().v()].get(Integer.valueOf(paramInt))).intValue();
    }
    return arrayOfInt;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if (!a())
    {
      if (this.c == null) {
        this.c = new HashMap();
      }
      this.c.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
    }
  }
  
  int h(int paramInt)
  {
    if (this.c != null)
    {
      Object localObject = this.c.get(Integer.valueOf(paramInt));
      if (localObject != null) {
        return ((Integer)localObject).intValue();
      }
    }
    if (b()) {
      return paramInt;
    }
    return -1;
  }
  
  public boolean getCopyInvalidFormulasAsValues()
  {
    return this.q;
  }
  
  public void setCopyInvalidFormulasAsValues(boolean value)
  {
    this.q = value;
    h();
  }
  
  void h()
  {
    this.s = null;
    this.p = null;
    this.v = null;
  }
  
  public boolean getColumnCharacterWidth()
  {
    return this.w;
  }
  
  public void setColumnCharacterWidth(boolean value)
  {
    this.w = value;
  }
  
  public boolean getReferToSheetWithSameName()
  {
    return this.x;
  }
  
  public void setReferToSheetWithSameName(boolean value)
  {
    this.x = value;
  }
  
  int i()
  {
    return this.j.f();
  }
  
  int j()
  {
    return this.k.f();
  }
  
  public boolean getReferToDestinationSheet()
  {
    return this.y;
  }
  
  public void setReferToDestinationSheet(boolean value)
  {
    this.y = value;
  }
  
  boolean k()
  {
    if (a()) {
      return true;
    }
    if (i(1)) {
      return a(1, true);
    }
    boolean bool = this.j.d().b(this.k.d());
    b(1, bool);
    return bool;
  }
  
  boolean a(int paramInt, boolean paramBoolean)
  {
    if (i(paramInt)) {
      return (this.z & paramInt) != 0;
    }
    return paramBoolean;
  }
  
  void b(int paramInt, boolean paramBoolean)
  {
    j(paramInt);
    if (paramBoolean) {
      this.z |= paramInt;
    } else {
      this.z &= (paramInt ^ 0xFFFFFFFF);
    }
  }
  
  boolean i(int paramInt)
  {
    return (this.z >> 16 & paramInt) != 0;
  }
  
  void j(int paramInt)
  {
    this.z |= paramInt << 16;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CopyOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */