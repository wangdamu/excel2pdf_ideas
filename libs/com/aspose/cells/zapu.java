package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

class zapu
{
  private zcal a;
  private byte[] b;
  private zqj c;
  private int d;
  private byte[] e;
  private int f;
  private WorksheetCollection g;
  private Worksheet h;
  private ShapeCollection i;
  private Object j;
  private boolean k;
  private Range l;
  private ArrayList m = null;
  private boolean n = false;
  private static final za o = new za(new String[] { "application/vnd.ms-office.DrsConnector+xml", "application/vnd.ms-office.DrsShape+xml", "application/vnd.ms-office.DrsPicture+xml", "application/vnd.ms-office.DrsE2oDoc+xml" });
  
  zapu(zcal paramzcal, zqj paramzqj, WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet, Object paramObject)
  {
    this.a = paramzcal;
    this.c = paramzqj;
    this.b = new byte[2];
    this.h = paramWorksheet;
    this.g = paramWorksheetCollection;
    this.j = paramObject;
  }
  
  boolean a()
  {
    return this.j instanceof Chart;
  }
  
  void b()
    throws Exception
  {
    if (this.m == null) {
      this.m = new ArrayList();
    }
    this.c.a(-2);
    this.k = false;
    this.l = null;
    if (!a())
    {
      localObject = this.g.getNames().a("_FilterDatabase", this.h.getIndex());
      if (localObject != null)
      {
        this.l = ((Name)localObject).getRange();
        if (this.l != null) {
          this.k = true;
        }
      }
    }
    Object localObject = null;
    for (;;)
    {
      this.d = this.c.b(this.b);
      int i3;
      switch (this.d)
      {
      case 127: 
        c();
        int i1 = zc.a(this.e, 4);
        int i2 = i1 - ((this.f & 0xFFFF) - 4);
        while (i2 > 0)
        {
          this.d = this.c.b(this.b);
          i3 = this.c.b(this.b) & 0xFFFF;
          this.c.a(i3);
          i2 -= i3;
        }
      case 60: 
      case 236: 
        c();
        i3 = 0;
        int i4;
        byte[] arrayOfByte3;
        if ((this.e[2] == 2) && ((this.e[3] & 0xFF) == 240))
        {
          i4 = zc.b(this.e, i3 + 8) >> 4;
          this.i = new ShapeCollection(this.g, this.h, this.g.L(), this.j, i4);
          if (i4 > (this.g.L().d().d() & 0xFFFF)) {
            this.g.L().d().a(i4);
          }
          a(this.i);
          i3 += 16;
          this.i.d().c().a(zc.a(this.e, i3));
          this.i.d().c().b(zc.a(this.e, i3 + 4));
          i3 += 8;
          arrayOfByte3 = null;
          int i5 = 0;
          for (;;)
          {
            i5 = zc.e(this.e, i3 + 2);
            switch (i5)
            {
            case 61720: 
              i3 += 8 + zc.a(this.e, i3 + 4);
              break;
            case 61728: 
              arrayOfByte3 = new byte[8 + zc.a(this.e, i3 + 4)];
              System.arraycopy(this.e, i3, arrayOfByte3, 0, arrayOfByte3.length);
              this.i.d().d().b = arrayOfByte3;
              i3 += arrayOfByte3.length;
              break;
            case 61443: 
              i3 += 8;
              i3 += 8 + zc.a(this.e, i3 + 4);
            }
            if (i5 != 61443) {
              if (i3 >= (this.f & 0xFFFF)) {
                break;
              }
            }
          }
        }
        if (i3 < (this.f & 0xFFFF))
        {
          if (this.i == null) {
            this.i = this.h.getShapes();
          }
          if ((this.e[(i3 + 2)] == 5) && (this.e[(i3 + 3)] == -16))
          {
            i4 = zc.a(this.e, i3 + 4) + 8;
            if (i4 != 0)
            {
              arrayOfByte3 = new byte[i4];
              a(0, i3, arrayOfByte3, 0, i4);
              a(arrayOfByte3);
            }
            return;
          }
          byte[] arrayOfByte1 = new byte[(this.f & 0xFFFF) - i3];
          System.arraycopy(this.e, i3, arrayOfByte1, 0, (this.f & 0xFFFF) - i3);
          for (this.d = this.c.b(this.b); ((this.d & 0xFFFF) == 60) || ((this.d & 0xFFFF) == 236); this.d = this.c.b(this.b))
          {
            c();
            byte[] arrayOfByte2 = new byte[arrayOfByte1.length + (this.f & 0xFFFF)];
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
            System.arraycopy(this.e, 0, arrayOfByte2, arrayOfByte1.length, this.f & 0xFFFF);
            arrayOfByte1 = arrayOfByte2;
          }
          if ((this.d & 0xFFFF) != 93)
          {
            this.c.a(-2);
            return;
          }
          c();
          localObject = a(arrayOfByte1, 0, a(this.e[4]));
          if ((localObject != null) && (((this.a.a & 0x100) != 0) || ((this.a.a & 0x200) != 0)))
          {
            this.i.a((Shape)localObject, null);
            c((Shape)localObject);
            b((Shape)localObject);
          }
        }
        break;
      }
    }
    this.c.a(-2);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    for (int i1 = 0; i1 < this.i.getCount(); i1++) {
      localHashMap.put(Integer.valueOf(this.i.get(i1).R().j().c()), Integer.valueOf(i1));
    }
    i1 = 8;
    while (i1 < paramArrayOfByte.length)
    {
      long l1 = zc.d(paramArrayOfByte, i1);
      int i2 = zc.a(paramArrayOfByte, i1 + 4);
      i1 += 8;
      if ((l1 & 0xFFFFFFFF) == 4027711489L)
      {
        int i3 = zc.a(paramArrayOfByte, i1 + 4);
        int i4 = zc.a(paramArrayOfByte, i1 + 8);
        int i5 = zc.a(paramArrayOfByte, i1 + 12);
        int i6 = zc.a(paramArrayOfByte, i1 + 16);
        int i7 = zc.a(paramArrayOfByte, i1 + 20);
        if ((i6 != -1) && (i7 != -1) && (localHashMap.get(Integer.valueOf(i3)) != null) && (localHashMap.get(Integer.valueOf(i4)) != null) && (localHashMap.get(Integer.valueOf(i5)) != null))
        {
          i3 = ((Integer)localHashMap.get(Integer.valueOf(i3))).intValue();
          i4 = ((Integer)localHashMap.get(Integer.valueOf(i4))).intValue();
          i5 = ((Integer)localHashMap.get(Integer.valueOf(i5))).intValue();
          this.i.get(i5).g = new znn(i3, i6, i4, i7);
        }
      }
      i1 += i2;
    }
  }
  
  private Shape a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2;
    int i1;
    int[] arrayOfInt;
    Object localObject3;
    switch (paramInt2)
    {
    case 0: 
      localObject2 = new GroupShape(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      break;
    case 5: 
      if ((this.a.a & 0x100) != 0)
      {
        localObject2 = new Chart(this.g.get(this.h.getIndex()), this.i);
        if (!a()) {
          this.h.getCharts().a((Chart)localObject2);
        }
        localObject1 = ((Chart)localObject2).getChartObject();
        i1 = 0;
        arrayOfInt = new int[] { i1 };
        localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
        i1 = arrayOfInt[0];
        localObject3 = new zkp(this.a, this.c, this.g, this.h);
        ((zkp)localObject3).a((Chart)localObject2);
      }
      else
      {
        this.a.d(this.c);
        return null;
      }
      break;
    case 25: 
      localObject2 = new Comment(this.h.getComments());
      localObject1 = ((Comment)localObject2).getCommentShape();
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((Comment)localObject2).b(), true);
      break;
    case 6: 
      localObject2 = new TextBox(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if (i1 > 0) {
        a((Shape)localObject1, ((TextBox)localObject2).getTextBody(), true);
      }
      if ((!a()) && (!((Shape)localObject1).C())) {
        this.h.getTextBoxes().a((TextBox)localObject2);
      }
      break;
    case 11: 
      localObject2 = new CheckBox(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((CheckBox)localObject2).getTextBody(), true);
      a((CheckBox)localObject2);
      if ((!a()) && (!((Shape)localObject1).C())) {
        this.h.getCheckBoxes().a((CheckBox)localObject2);
      }
      break;
    case 8: 
      localObject2 = new Picture(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Picture)localObject2);
      if (a((Shape)localObject1))
      {
        localObject3 = new OleObject(this.i);
        CopyOptions localCopyOptions = new CopyOptions(0, this.g.p(), this.g.p());
        localCopyOptions.g = true;
        ((OleObject)localObject3).a((Shape)localObject1, localCopyOptions);
        ((OleObject)localObject3).g(((Shape)localObject1).O());
        if (a((OleObject)localObject3))
        {
          localObject1 = localObject3;
          if ((!a()) && (!((Shape)localObject1).C())) {
            this.h.getOleObjects().a((OleObject)localObject3);
          }
          ((OleObject)localObject3).a(true);
        }
        else if ((!a()) && (!((Shape)localObject1).C()))
        {
          this.h.getPictures().a((Picture)localObject2);
        }
      }
      else if ((!a()) && (!((Shape)localObject1).C()))
      {
        this.h.getPictures().a((Picture)localObject2);
      }
      break;
    case 7: 
      localObject2 = new Button(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((Button)localObject2).getTextBody(), true);
      break;
    case 20: 
      localObject2 = new ComboBox(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if ((this.l != null) && (this.k) && (this.m.size() == 0))
      {
        localObject3 = ((Shape)localObject1).R().i();
        int i2 = ((zkx)localObject3).i();
        int i3 = ((zkx)localObject3).o();
        if ((i2 == 255) && (i3 == 0)) {
          i3 = 256;
        }
        if ((((zkx)localObject3).f() == this.l.a().StartRow) && (((zkx)localObject3).l() == this.l.a().StartRow + 1) && (i3 - i2 >= 1) && (i3 <= this.l.a().EndColumn + 1) && (i2 >= this.l.a().StartColumn)) {
          return null;
        }
      }
      a((ComboBox)localObject2);
      break;
    case 12: 
      localObject2 = new RadioButton(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((RadioButton)localObject2).getTextBody(), true);
      a((RadioButton)localObject2);
      break;
    case 18: 
      localObject2 = new ListBox(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((ListBox)localObject2);
      break;
    case 14: 
      localObject2 = new Label(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((Label)localObject2).getTextBody(), true);
      break;
    case 19: 
      localObject2 = new GroupBox(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Shape)localObject1, ((GroupBox)localObject2).getTextBody(), true);
      break;
    case 17: 
      localObject2 = new ScrollBar(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((ScrollBar)localObject2);
      break;
    case 16: 
      localObject2 = new Spinner(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      a((Spinner)localObject2);
      break;
    case 30: 
      localObject2 = new CellsDrawing(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if (i1 != 0) {
        d((Shape)localObject1);
      }
      break;
    case 3: 
      localObject2 = new Oval(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if (i1 != 0) {
        d((Shape)localObject1);
      }
      break;
    case 2: 
      localObject2 = new RectangleShape(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if (i1 != 0) {
        a((Shape)localObject1, ((RectangleShape)localObject2).getTextBody(), true);
      }
      break;
    case 4: 
      localObject2 = new ArcShape(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      if (i1 != 0) {
        a((Shape)localObject1, ((ArcShape)localObject2).getTextBody(), true);
      }
      break;
    case 1: 
      localObject2 = new LineShape(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      break;
    case 9: 
      localObject2 = new zaxm(this.i);
      localObject1 = localObject2;
      i1 = 0;
      arrayOfInt = new int[] { i1 };
      localObject1 = a(arrayOfInt, (Shape)localObject1, paramArrayOfByte, 0, this.e);
      i1 = arrayOfInt[0];
      break;
    case 10: 
    case 13: 
    case 15: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    default: 
      localObject1 = new Shape(this.i, paramInt2, this.i);
    }
    return (Shape)localObject1;
  }
  
  private void b(Shape paramShape)
    throws Exception
  {
    paramShape.r = (!paramShape.C());
    zaqb localzaqb = new zaqb(paramShape);
    localzaqb.h();
  }
  
  private void c(Shape paramShape)
  {
    if (this.m.size() != 0)
    {
      int i1 = this.m.size();
      if (paramShape.getMsoDrawingType() == 0)
      {
        i1--;
        if (i1 > 0) {
          ((GroupShape)this.m.get(i1 - 1)).a(paramShape);
        }
      }
      else
      {
        ((GroupShape)this.m.get(i1 - 1)).a(paramShape);
      }
      for (int i2 = i1 - 1; (i2 >= 0) && (((GroupShape)this.m.get(i2)).b() == 0); i2--)
      {
        GroupShape localGroupShape = (GroupShape)this.m.get(i2);
        ArrayList localArrayList = localGroupShape.d();
        int i3 = 0;
        double d1 = 1.0D;
        double d2 = 1.0D;
        int i4 = 0;
        for (int i5 = 0; i5 < localArrayList.size(); i5++)
        {
          Shape localShape1 = (Shape)localArrayList.get(i5);
          if (localShape1.C())
          {
            i4 = 1;
            break;
          }
        }
        int i10;
        int i11;
        if ((i4 == 0) && (!localGroupShape.W()) && (localGroupShape.getWidth() != 0) && (localGroupShape.getHeight() != 0))
        {
          i5 = localGroupShape.a().b + localGroupShape.a().a;
          int i6 = localGroupShape.a().d + localGroupShape.a().c;
          for (int i7 = 0; i7 < localArrayList.size(); i7++)
          {
            Shape localShape3 = (Shape)localArrayList.get(i7);
            int[] arrayOfInt2 = localShape3.c(false);
            i10 = arrayOfInt2[0] + arrayOfInt2[2];
            if (i10 > i5) {
              i5 = i10;
            }
            i11 = arrayOfInt2[1] + arrayOfInt2[3];
            if (i11 > i6) {
              i6 = i11;
            }
          }
          i3 = (i5 > localGroupShape.a().b + localGroupShape.a().a + 5) || (i6 > localGroupShape.a().d + localGroupShape.a().c + 5) ? 1 : 0;
          if (i3 != 0)
          {
            double d3 = i5 - localGroupShape.a().a;
            d1 = d3 / localGroupShape.a().b;
            double d4 = i6 - localGroupShape.a().c;
            d2 = d4 / localGroupShape.a().d;
            localGroupShape.a().b = (i5 - localGroupShape.a().a);
            localGroupShape.a().d = (i6 - localGroupShape.a().c);
          }
        }
        for (i5 = 0; i5 < localArrayList.size(); i5++)
        {
          Shape localShape2 = (Shape)localArrayList.get(i5);
          int[] arrayOfInt1 = localShape2.c(false);
          int i8 = (int)((arrayOfInt1[0] - localGroupShape.a().a) / localGroupShape.a().b * 4000.0D + 0.5D);
          int i9 = (int)((arrayOfInt1[1] - localGroupShape.a().c) / localGroupShape.a().d * 4000.0D + 0.5D);
          i10 = (int)(arrayOfInt1[2] / localGroupShape.a().b * 4000.0D + 0.5D);
          i11 = (int)(arrayOfInt1[3] / localGroupShape.a().d * 4000.0D + 0.5D);
          localShape2.a(0, false, i8, i9, i10, i11);
        }
        if ((i3 != 0) && (!localGroupShape.W())) {
          if (localGroupShape.R().i().c != null)
          {
            localGroupShape.R().i().c.j = d1;
            localGroupShape.R().i().c.k = d2;
          }
          else
          {
            localGroupShape.setWidth((int)(localGroupShape.getWidth() * d1));
            localGroupShape.setHeight((int)(localGroupShape.getHeight() * d2));
          }
        }
        this.m.remove(i2);
      }
    }
  }
  
  int a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
    case 13: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    case 11: 
      return 11;
    case 12: 
      return 12;
    case 14: 
      return 14;
    case 15: 
      return 15;
    case 16: 
      return 16;
    case 17: 
      return 17;
    case 18: 
      return 18;
    case 19: 
      return 19;
    case 20: 
      return 20;
    case 24: 
      return 2;
    case 25: 
      return 25;
    case 30: 
      return 30;
    case 29: 
      return 29;
    }
    throw new IllegalArgumentException("Unsupported mso drawing type.");
  }
  
  ArrayList a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i1 = paramInt;
    ArrayList localArrayList1 = new ArrayList();
    byte[] arrayOfByte1 = null;
    int i2 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      switch (paramArrayOfByte[i1])
      {
      case 19: 
        i2 = zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF;
        int i3 = paramArrayOfByte.length - i1;
        if ((i2 != 0) && (i2 + 4 < i3) && (i2 + i1 + 4 == paramArrayOfByte.length - 1))
        {
          ArrayList localArrayList2 = new ArrayList();
          for (;;)
          {
            this.d = this.c.b(this.b);
            if ((this.d & 0xFFFF) != 60)
            {
              this.c.a(-2);
              break;
            }
            c();
            if (((this.f & 0xFFFF) > 4) && (this.e[0] == 15) && (this.e[1] == 0) && ((this.e[2] == 4) || (this.e[2] == 2)) && ((this.e[3] & 0xFF) == 240))
            {
              this.c.a(-((this.f & 0xFFFF) + 4));
              break;
            }
            zf.a(localArrayList2, this.e);
            i3 += (this.f & 0xFFFF);
          }
          arrayOfByte1 = new byte[i3];
          System.arraycopy(paramArrayOfByte, i1, arrayOfByte1, 0, paramArrayOfByte.length - i1);
          i3 = paramArrayOfByte.length - i1;
          for (int i4 = 0; i4 < localArrayList2.size(); i4++)
          {
            byte[] arrayOfByte2 = (byte[])localArrayList2.get(i4);
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i3, arrayOfByte2.length);
            i3 += arrayOfByte2.length;
          }
          zf.a(localArrayList1, arrayOfByte1);
        }
        else
        {
          arrayOfByte1 = new byte[paramArrayOfByte.length - i1];
          System.arraycopy(paramArrayOfByte, i1, arrayOfByte1, 0, arrayOfByte1.length);
          zf.a(localArrayList1, arrayOfByte1);
        }
        return localArrayList1;
      }
      if (i1 + 2 >= paramArrayOfByte.length) {
        return localArrayList1;
      }
      i2 = zc.e(paramArrayOfByte, i1 + 2) & 0xFFFF;
      arrayOfByte1 = new byte[i2 + 4];
      System.arraycopy(paramArrayOfByte, i1, arrayOfByte1, 0, arrayOfByte1.length);
      zf.a(localArrayList1, arrayOfByte1);
      if (paramArrayOfByte[i1] == 0) {
        return localArrayList1;
      }
      i1 += arrayOfByte1.length;
    }
    return localArrayList1;
  }
  
  boolean a(Shape paramShape)
  {
    ArrayList localArrayList = paramShape.S().a;
    boolean bool = false;
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return false;
    }
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      byte[] arrayOfByte = (byte[])localArrayList.get(i1);
      if (arrayOfByte[0] == 9)
      {
        int i2 = zc.e(arrayOfByte, 2) & 0xFFFF;
        int i3 = (zc.e(arrayOfByte, 4) & 0xFFFF) + 2;
        if (i2 - i3 == 4) {
          return true;
        }
        return bool;
      }
      if ((arrayOfByte[0] == 8) && (arrayOfByte.length > 4)) {
        bool = (arrayOfByte[4] & 0xFF & 0x2) != 0;
      }
    }
    return false;
  }
  
  boolean a(OleObject paramOleObject)
  {
    ArrayList localArrayList1 = paramOleObject.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return true;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte = null;
    int i1 = 0;
    for (int i2 = 0; i2 < localArrayList1.size(); i2++)
    {
      arrayOfByte = (byte[])localArrayList1.get(i2);
      switch (arrayOfByte[0])
      {
      case 0: 
      case 7: 
        break;
      case 8: 
        paramOleObject.a(arrayOfByte[4]);
        switch (paramOleObject.b())
        {
        case 0: 
        case 1: 
        case 3: 
        case 5: 
        case 8: 
        case 9: 
          break;
        case 2: 
        case 4: 
        case 6: 
        case 7: 
        default: 
          return true;
        }
        break;
      case 9: 
        i1 = 2;
        int i3 = zc.e(arrayOfByte, i1) & 0xFFFF;
        int i4;
        int i5;
        switch (paramOleObject.b())
        {
        case 0: 
        case 1: 
        case 5: 
        case 8: 
        case 9: 
          i4 = zc.e(arrayOfByte, i1 + 2) & 0xFFFF;
          i1 = 18;
          i5 = zc.e(arrayOfByte, i1) & 0xFFFF;
          if (arrayOfByte[(i1 + 2)] == 0) {
            paramOleObject.setProgID(zct.a(arrayOfByte, i1 + 3, i5));
          } else {
            paramOleObject.setProgID(Encoding.getUnicode().a(arrayOfByte, i1 + 3, i5 * 2));
          }
          i1 = i4 + 6;
          paramOleObject.f(zc.a(arrayOfByte, i1));
          break;
        case 3: 
          i4 = zc.e(arrayOfByte, i1 + 2) & 0xFFFF;
          int i6;
          if (i4 + 2 == i3)
          {
            i5 = zc.b(arrayOfByte, 13);
            i6 = zc.a(arrayOfByte, 15) - 1;
            paramOleObject.d(i5);
            paramOleObject.e(i6);
            return true;
          }
          if (i4 + 6 == i3)
          {
            i5 = zc.e(arrayOfByte, i1 + 2) & 0xFFFF;
            i1 = 18;
            i6 = zc.e(arrayOfByte, i1) & 0xFFFF;
            if (arrayOfByte[(i1 + 2)] == 0) {
              paramOleObject.setProgID(zct.a(arrayOfByte, i1 + 3, i6));
            } else {
              paramOleObject.setProgID(Encoding.getUnicode().a(arrayOfByte, i1 + 3, i6 * 2));
            }
            i1 = i5 + 6;
            paramOleObject.f(zc.a(arrayOfByte, i1));
          }
          else
          {
            return true;
          }
          break;
        }
        break;
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      default: 
        zf.a(localArrayList2, arrayOfByte);
      }
    }
    if (localArrayList2.size() > 0) {
      paramOleObject.S().a = localArrayList2;
    } else {
      paramOleObject.S().a = null;
    }
    return true;
  }
  
  void a(Picture paramPicture)
    throws Exception
  {
    ArrayList localArrayList = paramPicture.S().a;
    if ((localArrayList == null) || (localArrayList.size() == 0)) {
      return;
    }
    byte[] arrayOfByte1 = null;
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      arrayOfByte1 = (byte[])localArrayList.get(i1);
      switch (arrayOfByte1[0])
      {
      case 0: 
      case 7: 
        break;
      case 8: 
        if (arrayOfByte1[2] == 2) {
          paramPicture.a(zc.b(arrayOfByte1, 4));
        }
        break;
      case 9: 
        int i2 = zc.e(arrayOfByte1, 4) & 0xFFFF;
        if (i2 != 0)
        {
          int i3 = zc.e(arrayOfByte1, 6) & 0xFFFF;
          if (arrayOfByte1[12] != 2)
          {
            paramPicture.y = new byte[i3];
            System.arraycopy(arrayOfByte1, 12, paramPicture.y, 0, i3);
            paramPicture.d = false;
          }
          else
          {
            try
            {
              zh localzh = this.a.c.a().a("Ctls");
              if ((paramPicture.e()) && (!paramPicture.f()) && (localzh != null))
              {
                int i4 = 6 + i2;
                int i5 = zc.a(arrayOfByte1, i4);
                int i6 = zc.a(arrayOfByte1, i4 + 4);
                i4 += 8;
                localzh.a(i5, 0);
                byte[] arrayOfByte2 = new byte[i6];
                localzh.a(arrayOfByte2, 0, i6);
                zqn localzqn = new zqn(false);
                localzqn.l = new UnknownControl(paramPicture, arrayOfByte2, 3);
                localzqn.a = paramPicture.getName();
                localzqn.b = zauj.z(paramPicture.R().j().c());
                paramPicture.z = localzqn;
                int i7 = zc.a(arrayOfByte1, i4);
                i4 += 4 + i7;
                int i8 = zc.b(arrayOfByte1, i4);
                i4 += 2;
                int i9;
                if (i8 != 0)
                {
                  i9 = zc.b(arrayOfByte1, i4);
                  paramPicture.c(new byte[i9]);
                  System.arraycopy(arrayOfByte1, i4 + 6, paramPicture.af(), 0, i9);
                  i4 += i8;
                }
                i8 = zc.b(arrayOfByte1, i4);
                i4 += 2;
                if (i8 != 0)
                {
                  i9 = zc.b(arrayOfByte1, i4);
                  paramPicture.w = new byte[i9];
                  System.arraycopy(arrayOfByte1, i4 + 6, paramPicture.w, 0, i9);
                  i4 += i8;
                }
              }
            }
            catch (Exception localException) {}
          }
        }
      }
    }
  }
  
  void a(CheckBox paramCheckBox)
  {
    ArrayList localArrayList1 = paramCheckBox.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte1 = null;
    int i1 = 0;
    for (int i2 = localArrayList1.size() - 1; i2 >= 0; i2--)
    {
      arrayOfByte1 = (byte[])localArrayList1.get(i2);
      switch (arrayOfByte1[0])
      {
      case 0: 
        break;
      case 10: 
      case 18: 
        i1 = 4;
        switch (arrayOfByte1[i1])
        {
        case 0: 
          paramCheckBox.a(0);
          break;
        case 1: 
          paramCheckBox.a(1);
          break;
        case 2: 
          paramCheckBox.a(2);
        }
        if (arrayOfByte1[0] == 18) {
          paramCheckBox.setShadow((arrayOfByte1[10] & 0xFF & 0x1) == 0);
        }
        break;
      case 20: 
        i1 = 4;
        int i3 = arrayOfByte1[i1] & 0xFF;
        i1 += 6;
        byte[] arrayOfByte2 = new byte[i3];
        System.arraycopy(arrayOfByte1, i1, arrayOfByte2, 0, i3);
        paramCheckBox.c(arrayOfByte2);
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte1);
      }
    }
    if (localArrayList2.size() > 0) {
      paramCheckBox.S().a = localArrayList2;
    } else {
      paramCheckBox.S().a = null;
    }
  }
  
  void a(RadioButton paramRadioButton)
  {
    ArrayList localArrayList1 = paramRadioButton.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte1 = null;
    int i1 = 0;
    for (int i2 = localArrayList1.size() - 1; i2 >= 0; i2--)
    {
      arrayOfByte1 = (byte[])localArrayList1.get(i2);
      switch (arrayOfByte1[0])
      {
      case 0: 
      case 11: 
      case 17: 
        break;
      case 10: 
      case 18: 
        i1 = 4;
        paramRadioButton.a(arrayOfByte1[i1] == 1);
        if (arrayOfByte1[0] == 18) {
          paramRadioButton.setShadow((arrayOfByte1[10] & 0xFF & 0x1) == 0);
        }
        break;
      case 20: 
        i1 = 4;
        int i3 = arrayOfByte1[i1] & 0xFF;
        i1 += 6;
        byte[] arrayOfByte2 = new byte[i3];
        System.arraycopy(arrayOfByte1, i1, arrayOfByte2, 0, i3);
        paramRadioButton.c(arrayOfByte2);
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte1);
      }
    }
    if (localArrayList2.size() > 0) {
      paramRadioButton.S().a = localArrayList2;
    } else {
      paramRadioButton.S().a = null;
    }
  }
  
  void a(ComboBox paramComboBox)
  {
    if (paramComboBox.R().i().b()) {
      return;
    }
    ArrayList localArrayList1 = paramComboBox.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte1 = null;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = localArrayList1.size() - 1; i3 >= 0; i3--)
    {
      arrayOfByte1 = (byte[])localArrayList1.get(i3);
      Object localObject;
      switch (arrayOfByte1[0])
      {
      case 0: 
        break;
      case 19: 
        i1 = 4;
        int i4 = zc.e(arrayOfByte1, i1) & 0xFFFF;
        i2 = arrayOfByte1[(i1 + 2)] & 0xFF;
        i1 += 2;
        if (i4 != 0)
        {
          byte[] arrayOfByte2 = new byte[i2];
          System.arraycopy(arrayOfByte1, i1 + 6, arrayOfByte2, 0, i2);
          paramComboBox.e(arrayOfByte2);
          i1 += i4;
        }
        i1 += 2;
        int i5 = (zc.e(arrayOfByte1, i1) & 0xFFFF) - 1;
        if (i5 >= 0) {
          paramComboBox.a(i5);
        }
        paramComboBox.setShadow((arrayOfByte1[(i1 + 2)] & 0xFF & 0x8) == 0);
        int i6 = (arrayOfByte1[(i1 + 2)] & 0xFF & 0x2) != 0 ? 1 : 0;
        i1 += 6;
        if (paramComboBox.getMsoDrawingType() == 20)
        {
          paramComboBox.setDropDownLines(zc.e(arrayOfByte1, i1 + 2));
          i1 += 6;
          int i7 = i1;
          int[] arrayOfInt = { i1 };
          String str = zct.a(arrayOfByte1, arrayOfInt);
          i1 = arrayOfInt[0];
          if ((i1 - i7) % 2 == 1) {
            i1++;
          }
        }
        if ((i6 != 0) && (i4 == 0) && (i2 != 0) && (i1 < arrayOfByte1.length))
        {
          localObject = new ArrayList();
          for (int i8 = 0; (i8 < i2) && (i1 < arrayOfByte1.length); i8++)
          {
            i4 = zc.e(arrayOfByte1, i1) & 0xFFFF;
            if (arrayOfByte1[(i1 + 2)] == 0)
            {
              zf.a((ArrayList)localObject, Encoding.getASCII().a(arrayOfByte1, i1 + 3, i4));
              i1 += 3 + i4;
            }
            else
            {
              zf.a((ArrayList)localObject, Encoding.getUnicode().a(arrayOfByte1, i1 + 3, i4 * 2));
              i1 += 3 + i4 * 2;
            }
          }
          paramComboBox.a = new String[((ArrayList)localObject).size()];
          for (i8 = 0; i8 < ((ArrayList)localObject).size(); i8++) {
            paramComboBox.a[i8] = ((String)((ArrayList)localObject).get(i8));
          }
        }
        break;
      case 14: 
        i1 = 4;
        i2 = zc.e(arrayOfByte1, i1) & 0xFFFF;
        i1 += 6;
        localObject = new byte[i2];
        System.arraycopy(arrayOfByte1, i1, localObject, 0, i2);
        paramComboBox.c((byte[])localObject);
        break;
      case 12: 
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte1);
      }
    }
    if (localArrayList2.size() > 0) {
      paramComboBox.S().a = localArrayList2;
    } else {
      paramComboBox.S().a = null;
    }
  }
  
  private void a(Shape paramShape, byte[] paramArrayOfByte)
  {
    int i1 = 4;
    int i2 = zc.e(paramArrayOfByte, i1) & 0xFFFF;
    i1 += 6;
    byte[] arrayOfByte = new byte[i2];
    System.arraycopy(paramArrayOfByte, i1, arrayOfByte, 0, i2);
    paramShape.c(arrayOfByte);
  }
  
  void a(Spinner paramSpinner)
  {
    ArrayList localArrayList1 = paramSpinner.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte = null;
    int i1 = 0;
    for (int i2 = localArrayList1.size() - 1; i2 >= 0; i2--)
    {
      arrayOfByte = (byte[])localArrayList1.get(i2);
      switch (arrayOfByte[0])
      {
      case 0: 
        break;
      case 4: 
        paramSpinner.S().b = arrayOfByte;
        break;
      case 14: 
        a(paramSpinner, arrayOfByte);
        break;
      case 12: 
        i1 = 8;
        paramSpinner.a = zc.e(arrayOfByte, i1);
        paramSpinner.b = zc.e(arrayOfByte, i1 + 2);
        paramSpinner.c = zc.e(arrayOfByte, i1 + 4);
        paramSpinner.d = zc.e(arrayOfByte, i1 + 6);
        paramSpinner.e = zc.e(arrayOfByte, i1 + 8);
        paramSpinner.setHorizontal(arrayOfByte[(i1 + 10)] == 1);
        paramSpinner.setShadow((arrayOfByte[(i1 + 14)] & 0xFF & 0x80) == 0);
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte);
      }
    }
    paramSpinner.S().a = null;
  }
  
  void a(ScrollBar paramScrollBar)
  {
    ArrayList localArrayList1 = paramScrollBar.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte = null;
    int i1 = 0;
    for (int i2 = localArrayList1.size() - 1; i2 >= 0; i2--)
    {
      arrayOfByte = (byte[])localArrayList1.get(i2);
      switch (arrayOfByte[0])
      {
      case 0: 
        break;
      case 4: 
        paramScrollBar.S().b = arrayOfByte;
        break;
      case 14: 
        a(paramScrollBar, arrayOfByte);
        break;
      case 12: 
        i1 = 8;
        paramScrollBar.a = zc.e(arrayOfByte, i1);
        paramScrollBar.b = zc.e(arrayOfByte, i1 + 2);
        paramScrollBar.c = zc.e(arrayOfByte, i1 + 4);
        paramScrollBar.d = zc.e(arrayOfByte, i1 + 6);
        paramScrollBar.e = zc.e(arrayOfByte, i1 + 8);
        paramScrollBar.setHorizontal(arrayOfByte[(i1 + 10)] == 1);
        paramScrollBar.setShadow((arrayOfByte[(i1 + 14)] & 0xFF & 0x80) == 0);
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte);
      }
    }
    paramScrollBar.S().a = null;
  }
  
  void a(ListBox paramListBox)
  {
    if (paramListBox.R().i().b()) {
      return;
    }
    ArrayList localArrayList1 = paramListBox.S().a;
    if ((localArrayList1 == null) || (localArrayList1.size() == 0)) {
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    byte[] arrayOfByte1 = null;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = localArrayList1.size() - 1; i3 >= 0; i3--)
    {
      arrayOfByte1 = (byte[])localArrayList1.get(i3);
      switch (arrayOfByte1[0])
      {
      case 0: 
        break;
      case 19: 
        i1 = 4;
        int i4 = zc.e(arrayOfByte1, i1) & 0xFFFF;
        i2 = arrayOfByte1[(i1 + 2)] & 0xFF;
        i1 += 2;
        if (i4 != 0)
        {
          byte[] arrayOfByte2 = new byte[i2];
          System.arraycopy(arrayOfByte1, i1 + 6, arrayOfByte2, 0, i2);
          paramListBox.e(arrayOfByte2);
          i1 += i4;
        }
        i1 += 2;
        paramListBox.setShadow((arrayOfByte1[(i1 + 2)] & 0xFF & 0x8) == 0);
        switch (arrayOfByte1[(i1 + 2)] & 0xFF & 0x30)
        {
        case 0: 
          paramListBox.setSelectionType(0);
          break;
        case 16: 
          paramListBox.setSelectionType(1);
          break;
        case 32: 
          paramListBox.setSelectionType(2);
        }
        int i5 = (zc.e(arrayOfByte1, i1) & 0xFFFF) - 1;
        if ((i5 >= 0) && (paramListBox.getSelectionType() == 0)) {
          paramListBox.setSelectedIndex(i5);
        }
        i1 += 6;
        int i6 = paramListBox.getItemCount();
        if (paramListBox.getSelectionType() != 0)
        {
          paramListBox.a(new ArrayList());
          for (int i7 = 0; (i7 < i6) && (i1 + i7 < arrayOfByte1.length); i7++) {
            if (arrayOfByte1[(i1 + i7)] != 0) {
              zf.a(paramListBox.a(), Integer.valueOf(i7));
            }
          }
        }
        break;
      case 14: 
        i1 = 4;
        i2 = zc.e(arrayOfByte1, i1) & 0xFFFF;
        i1 += 6;
        byte[] arrayOfByte3 = new byte[i2];
        System.arraycopy(arrayOfByte1, i1, arrayOfByte3, 0, i2);
        paramListBox.c(arrayOfByte3);
        break;
      case 12: 
        i1 = 8;
        paramListBox.b(zc.e(arrayOfByte1, i1));
        paramListBox.c(zc.e(arrayOfByte1, i1 + 2));
        paramListBox.d(zc.e(arrayOfByte1, i1 + 4));
        paramListBox.e(zc.e(arrayOfByte1, i1 + 6));
        paramListBox.setPageChange(zc.e(arrayOfByte1, i1 + 8));
        paramListBox.setShadow((arrayOfByte1[(i1 + 14)] & 0xFF & 0x80) == 0);
        break;
      default: 
        zf.a(localArrayList2, arrayOfByte1);
      }
    }
    if (localArrayList2.size() > 0) {
      paramListBox.S().a = localArrayList2;
    } else {
      paramListBox.S().a = null;
    }
  }
  
  private void b(Shape paramShape, byte[] paramArrayOfByte)
    throws Exception
  {
    paramShape.g(zc.e(paramArrayOfByte, 6));
    if (paramShape.O() > paramShape.N().f()) {
      paramShape.N().b(paramShape.O());
    }
    paramShape.S().a((paramArrayOfByte[8] & 0xFF & 0x1) != 0);
    paramShape.S().b((paramArrayOfByte[8] & 0xFF & 0x10) != 0);
    paramShape.S().e((paramArrayOfByte[9] & 0xFF & 0x1) != 0);
    paramShape.S().c((paramArrayOfByte[9] & 0xFF & 0x20) != 0);
    paramShape.S().d((paramArrayOfByte[9] & 0xFF & 0x40) != 0);
    if (paramArrayOfByte.length > 26) {
      paramShape.S().a = a(paramArrayOfByte, 22);
    }
  }
  
  private Shape a(int[] paramArrayOfInt, Shape paramShape, byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
    throws Exception
  {
    this.n = false;
    int i1 = paramInt;
    int i2 = i1;
    b(paramShape, paramArrayOfByte2);
    paramShape.R().d().a();
    paramShape.R().f();
    GroupShape localGroupShape = null;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 1;
    int i9 = 0;
    boolean bool = false;
    int i11;
    for (;;)
    {
      int i3 = zc.e(paramArrayOfByte1, i1 + 2);
      int i14;
      int i16;
      int i17;
      int i19;
      int i20;
      int i21;
      int i22;
      switch (i3)
      {
      case 61443: 
        i9 = 1;
        int i10 = zc.a(paramArrayOfByte1, i1 + 4);
        if (this.m.size() != 0)
        {
          localGroupShape = (GroupShape)this.m.get(this.m.size() - 1);
          localGroupShape.a(localGroupShape.b() - (8 + i10));
          bool = true;
        }
        if (!(paramShape instanceof GroupShape))
        {
          paramShape = new GroupShape(this.i);
          b(paramShape, paramArrayOfByte2);
        }
        localGroupShape = (GroupShape)paramShape;
        localGroupShape.a(i10);
        zf.a(this.m, localGroupShape);
        i1 += 8;
        break;
      case 61444: 
        i5 = zc.a(paramArrayOfByte1, i1 + 4) + 8;
        i4 = 0;
        if (this.m.size() != 0)
        {
          localGroupShape = (GroupShape)this.m.get(this.m.size() - 1);
          localGroupShape.a(localGroupShape.b() - i5);
          bool = true;
        }
        i1 += 8;
        break;
      case 61449: 
        i9 = 1;
        i1 += 8;
        i4 = 16;
        localGroupShape = (GroupShape)this.m.get(this.m.size() - 1);
        localGroupShape.a().a = zc.a(paramArrayOfByte1, i1);
        localGroupShape.a().c = zc.a(paramArrayOfByte1, i1 + 4);
        localGroupShape.a().b = (zc.a(paramArrayOfByte1, i1 + 8) - localGroupShape.a().a);
        localGroupShape.a().d = (zc.a(paramArrayOfByte1, i1 + 12) - localGroupShape.a().c);
        i1 += 16;
        break;
      case 61450: 
        i4 = 8;
        paramShape.R().j().a((short)((zc.e(paramArrayOfByte1, i1) & 0xFFFF) >> 4));
        i1 += 8;
        paramShape.R().j().c(zc.a(paramArrayOfByte1, i1));
        paramShape.R().j().d(zc.a(paramArrayOfByte1, i1 + 4));
        i1 += 8;
        break;
      case 61451: 
        i11 = zc.b(paramArrayOfByte1, i1) >> 4;
        i4 = zc.a(paramArrayOfByte1, i1 + 4);
        i1 += 8;
        int i12 = i1 + i11 * 6;
        int i13 = i1;
        for (i14 = 0; i14 < i11; i14++)
        {
          i6 = zc.e(paramArrayOfByte1, i1);
          i7 = zc.a(paramArrayOfByte1, i1 + 2);
          if ((i6 & 0xFFFF) == 904)
          {
            i1 += 6;
          }
          else
          {
            if ((i6 & 0xFFFF & 0x8000) != 0)
            {
              if (i7 == 0)
              {
                i1 += 6;
                continue;
              }
              if (zaum.b(i6, i7))
              {
                int i15 = zc.e(paramArrayOfByte1, i12 + 4) & 0xFFFF;
                if (i15 == 65520) {
                  i15 = 4;
                }
                i16 = (zc.e(paramArrayOfByte1, i12) & 0xFFFF) * i15;
                if (i16 == i7) {
                  i7 += 6;
                } else if (i16 + 6 != i7) {
                  i7 += 6;
                }
                byte[] arrayOfByte2 = new byte[i7];
                System.arraycopy(paramArrayOfByte1, i12, arrayOfByte2, 0, i7);
                paramShape.R().d().a(i6, 5, arrayOfByte2);
                i12 += i7;
              }
              else
              {
                byte[] arrayOfByte1 = new byte[i7];
                System.arraycopy(paramArrayOfByte1, i12, arrayOfByte1, 0, i7);
                paramShape.R().d().a(i6, 4, arrayOfByte1);
                i12 += i7;
              }
            }
            else
            {
              switch (i6)
              {
              case 4: 
                double d1 = zaum.f(i7);
                if ((paramShape.isFlippedHorizontally() ^ paramShape.isFlippedVertically()))
                {
                  d1 = -d1;
                  if (d1 < 0.0D) {
                    d1 += 360.0D;
                  }
                }
                paramShape.R().d().b(i6, (float)d1);
                break;
              default: 
                paramShape.R().d().a(i6, 0, Integer.valueOf(i7));
              }
            }
            i1 += 6;
          }
        }
        i4 = i12 - i13;
        i1 = i12;
        break;
      case 61730: 
        i14 = zc.b(paramArrayOfByte1, i1) >> 4;
        Shape localShape = paramShape;
        if ((i5 == 0) && (this.i.getCount() != 0))
        {
          localShape = this.i.get(this.i.getCount() - 1);
          i8 = 0;
        }
        i4 = zc.a(paramArrayOfByte1, i1 + 4);
        i1 += 8;
        i16 = i1 + i14 * 6;
        for (i17 = 0; i17 < i14; i17++)
        {
          i6 = zc.e(paramArrayOfByte1, i1);
          i7 = zc.a(paramArrayOfByte1, i1 + 2);
          if ((i6 & 0xFFFF) == 904)
          {
            i1 += 6;
          }
          else
          {
            if ((i6 & 0xFFFF & 0x8000) != 0)
            {
              if (i7 == 0)
              {
                i1 += 6;
                continue;
              }
              if (zaum.b(i6, i7))
              {
                int i18 = (zc.e(paramArrayOfByte1, i16) & 0xFFFF) * (zc.e(paramArrayOfByte1, i16 + 4) & 0xFFFF);
                if (i18 + 6 != i7) {
                  i7 += 6;
                }
                byte[] arrayOfByte5 = new byte[i7];
                System.arraycopy(paramArrayOfByte1, i16, arrayOfByte5, 0, i7);
                localShape.R().g().a(i6, 5, arrayOfByte5);
                i16 += i7;
              }
              else
              {
                byte[] arrayOfByte3 = new byte[i7];
                System.arraycopy(paramArrayOfByte1, i16, arrayOfByte3, 0, i7);
                localShape.R().g().a(i6, 4, arrayOfByte3);
                i16 += i7;
              }
            }
            else
            {
              localShape.R().g().a(i6, 0, Integer.valueOf(i7));
            }
            i1 += 6;
          }
        }
        i1 = i16;
        break;
      case 61456: 
        i4 = 18;
        i1 += 8;
        i17 = 2;
        switch (paramArrayOfByte1[i1])
        {
        case 3: 
          i17 = 0;
          break;
        case 2: 
          if (a()) {
            i17 = 1;
          } else {
            i17 = 1;
          }
          break;
        case 1: 
          i17 = 2;
          paramShape.R().i().a(true);
          break;
        default: 
          i17 = 2;
        }
        i1 += 2;
        if (a())
        {
          i19 = zc.a(paramArrayOfByte1, i1 + 0);
          i20 = zc.a(paramArrayOfByte1, i1 + 4);
          i21 = zc.a(paramArrayOfByte1, i1 + 8);
          i22 = zc.a(paramArrayOfByte1, i1 + 12);
          paramShape.a(2, i19, i20, i21 - i19, i22 - i20);
          paramShape.R().i().a(2);
        }
        else
        {
          i19 = zc.e(paramArrayOfByte1, i1) & 0xFFFF;
          i20 = zc.e(paramArrayOfByte1, i1 + 2) & 0xFFFF;
          i21 = zc.e(paramArrayOfByte1, i1 + 4) & 0xFFFF;
          i22 = zc.e(paramArrayOfByte1, i1 + 6) & 0xFFFF;
          int i23 = zc.e(paramArrayOfByte1, i1 + 8) & 0xFFFF;
          int i24 = zc.e(paramArrayOfByte1, i1 + 10) & 0xFFFF;
          int i25 = zc.e(paramArrayOfByte1, i1 + 12) & 0xFFFF;
          int i26 = zc.e(paramArrayOfByte1, i1 + 14) & 0xFFFF;
          paramShape.a(i17, i21, i22, i19, i20, i25, i26, i23, i24);
        }
        i1 += 16;
        break;
      case 61455: 
        i1 += 8;
        i4 = 16;
        if ((paramShape instanceof GroupShape)) {
          localGroupShape = (GroupShape)this.m.get(this.m.size() - 2);
        } else {
          localGroupShape = (GroupShape)this.m.get(this.m.size() - 1);
        }
        i19 = zc.a(paramArrayOfByte1, i1);
        i20 = zc.a(paramArrayOfByte1, i1 + 4);
        i21 = zc.a(paramArrayOfByte1, i1 + 8) - i19;
        i22 = zc.a(paramArrayOfByte1, i1 + 12) - i20;
        if ((i21 == 0) && (i22 == 0))
        {
          i19 = localGroupShape.a().a;
          i20 = localGroupShape.a().c;
        }
        paramShape.a(paramShape.getPlacement(), false, i19, i20, i21, i22);
        i1 += 16;
        break;
      case 61457: 
        i4 = 0;
        i1 += 8;
        break;
      default: 
        i4 = zc.a(paramArrayOfByte1, i1 + 4);
        byte[] arrayOfByte4 = new byte[i4 + 8];
        System.arraycopy(paramArrayOfByte1, i1, arrayOfByte4, 0, arrayOfByte4.length);
        zf.a(paramShape.R().c(), arrayOfByte4);
        i1 += 8 + i4;
      }
      if (i8 != 0)
      {
        i5 -= i4 + 8;
        if (i5 == 0) {
          break;
        }
        if (i1 == paramArrayOfByte1.length) {
          break;
        }
      }
      else if (i1 == paramArrayOfByte1.length)
      {
        paramArrayOfInt[0] = 0;
        return paramShape;
      }
      i8 = 1;
    }
    if ((!bool) && (!paramShape.T())) {
      paramShape = a(paramShape, bool);
    }
    if ((i9 == 0) && (paramShape.getMsoDrawingType() == 0) && (paramShape.R().d().a(16644)))
    {
      Picture localPicture = new Picture(this.i);
      paramShape = localPicture;
      i11 = 0;
      int[] arrayOfInt = { i11 };
      paramShape = a(arrayOfInt, paramShape, paramArrayOfByte1, 0, this.e);
      i11 = arrayOfInt[0];
      paramArrayOfInt[0] = i11;
      return paramShape;
    }
    paramArrayOfInt[0] = i5;
    return paramShape;
  }
  
  private Shape a(Shape paramShape, boolean paramBoolean)
    throws Exception
  {
    int i1 = this.i.getCount();
    byte[] arrayOfByte = paramShape.R().b();
    if (arrayOfByte == null) {
      return paramShape;
    }
    zi localzi = zi.a(new zh(arrayOfByte));
    LoadOptions localLoadOptions = new LoadOptions();
    zalq localzalq = new zalq(this.g.p(), localLoadOptions);
    zqi localzqi = new zqi(localzalq.b, this.h);
    String str = a(localzi);
    if (str == null) {
      return paramShape;
    }
    localzalq.c = localzi;
    localzalq.a(localzqi, null, str, paramBoolean);
    if (i1 < this.i.getCount())
    {
      Shape localShape = paramShape;
      paramShape = this.i.get(this.i.getCount() - 1);
      CopyOptions localCopyOptions = new CopyOptions(0);
      localCopyOptions.h = false;
      localCopyOptions.g = true;
      localCopyOptions.i = (!paramBoolean);
      paramShape.R().j().b(localShape.R().j().a());
      paramShape.R().a(localShape.R(), localCopyOptions);
      if (localShape.S() != null)
      {
        zapt localzapt = new zapt(paramShape.getMsoDrawingType());
        localzapt.a(localShape.S());
        paramShape.a(localzapt);
      }
      this.i.d(this.i.getCount() - 1);
      this.n = true;
    }
    return paramShape;
  }
  
  private String a(zi paramzi)
    throws Exception
  {
    String str1 = "[Content_Types].xml";
    zcjy localzcjy = zauy.a(paramzi, str1, true);
    localzcjy.k();
    if (localzcjy.o()) {
      return null;
    }
    localzcjy.d();
    while (zauz.a(localzcjy))
    {
      if ("Override".equals(localzcjy.q()))
      {
        String str2 = localzcjy.a("PartName");
        String str3 = localzcjy.a("ContentType");
        switch (o.a(str3))
        {
        case 0: 
        case 1: 
        case 2: 
        case 3: 
          return str2;
        }
      }
      localzcjy.a();
    }
    return null;
  }
  
  private Shape d(Shape paramShape)
    throws Exception
  {
    this.d = this.c.b(this.b);
    if (((this.d & 0xFFFF) != 236) && ((this.d & 0xFFFF) != 60))
    {
      this.c.a(-2);
      return paramShape;
    }
    c();
    byte[] arrayOfByte1 = this.e;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i5 = 0;
    byte[] arrayOfByte2;
    for (;;)
    {
      if (i1 + 2 >= arrayOfByte1.length) {
        return paramShape;
      }
      int i4 = zc.e(arrayOfByte1, i1 + 2);
      switch (i4)
      {
      case 61453: 
        a(paramShape, paramShape.getTextBody(), false);
        return paramShape;
      case 61443: 
      case 61444: 
        c(paramShape);
        this.d = this.c.b(this.b);
        if ((this.d & 0xFFFF) != 93)
        {
          this.c.a(-2);
          return paramShape;
        }
        c();
        this.i.a(paramShape, null);
        c(paramShape);
        return a(arrayOfByte1, i1, a(this.e[4]));
      case 61730: 
        int i6 = zc.b(arrayOfByte1, i1) >> 4;
        i2 = zc.a(arrayOfByte1, i1 + 4);
        i1 += 8;
        int i7 = i1 + i6 * 6;
        for (i8 = 0; i8 < i6; i8++)
        {
          i3 = zc.e(arrayOfByte1, i1);
          i5 = zc.a(arrayOfByte1, i1 + 2);
          if ((i3 & 0xFFFF) == 904)
          {
            i1 += 6;
          }
          else
          {
            if ((i3 & 0xFFFF & 0x8000) != 0)
            {
              if (i5 == 0)
              {
                i1 += 6;
                continue;
              }
              if (zaum.b(i3, i5))
              {
                int i9 = (zc.e(arrayOfByte1, i7) & 0xFFFF) * (zc.e(arrayOfByte1, i7 + 4) & 0xFFFF);
                if (i9 + 6 != i5) {
                  i5 += 6;
                }
                byte[] arrayOfByte3 = new byte[i5];
                System.arraycopy(arrayOfByte1, i7, arrayOfByte3, 0, i5);
                paramShape.R().g().a(i3, 5, arrayOfByte3);
                i7 += i5;
              }
              else
              {
                arrayOfByte2 = new byte[i5];
                System.arraycopy(arrayOfByte1, i7, arrayOfByte2, 0, i5);
                paramShape.R().g().a(i3, 4, arrayOfByte2);
                i7 += i5;
              }
            }
            else
            {
              paramShape.R().g().a(i3, 0, Integer.valueOf(i5));
            }
            i1 += 6;
          }
        }
        i1 = i7;
      }
    }
    int i8 = zc.a(this.e, i1 + 4) + 8;
    if (i8 != 0)
    {
      arrayOfByte2 = new byte[i8];
      a(0, i1, arrayOfByte2, 0, i8);
      a(arrayOfByte2);
      i1 += i8;
    }
    return paramShape;
    return paramShape;
  }
  
  private void a(Shape paramShape, FontSettingCollection paramFontSettingCollection, boolean paramBoolean)
    throws Exception
  {
    int i1 = !this.n ? 1 : 0;
    if (paramBoolean)
    {
      this.d = this.c.b(this.b);
      if (((this.d & 0xFFFF) != 236) && ((this.d & 0xFFFF) != 60))
      {
        this.c.a(-2);
        return;
      }
      this.f = this.c.b(this.b);
      this.c.a(this.f & 0xFFFF);
    }
    this.d = this.c.b(this.b);
    if ((this.d & 0xFFFF) != 438)
    {
      this.c.a(-2);
      return;
    }
    c();
    if (i1 != 0)
    {
      ShapeTextAlignment localShapeTextAlignment = paramFontSettingCollection.getTextAlignment();
      switch ((this.e[0] & 0xFF & 0xF) >> 1)
      {
      case 1: 
        localShapeTextAlignment.f(7);
        break;
      case 2: 
        localShapeTextAlignment.f(1);
        break;
      case 3: 
        localShapeTextAlignment.f(8);
        break;
      case 4: 
        localShapeTextAlignment.f(6);
        break;
      case 7: 
        localShapeTextAlignment.f(3);
      }
      switch ((this.e[0] & 0xFF & 0xF0) >> 4)
      {
      case 1: 
        localShapeTextAlignment.g(9);
        break;
      case 2: 
        localShapeTextAlignment.g(1);
        break;
      case 3: 
        localShapeTextAlignment.g(0);
        break;
      case 4: 
        localShapeTextAlignment.g(6);
        break;
      case 7: 
        localShapeTextAlignment.g(3);
      }
      localShapeTextAlignment.c((this.e[1] & 0xFF & 0x2) != 0);
      switch (this.e[2])
      {
      case 0: 
        localShapeTextAlignment.h(2);
        break;
      case 1: 
        localShapeTextAlignment.h(3);
        break;
      case 2: 
        localShapeTextAlignment.h(1);
        break;
      case 3: 
        localShapeTextAlignment.h(0);
      }
    }
    int i2 = zc.e(this.e, 10) & 0xFFFF;
    int i3 = zc.e(this.e, 12) & 0xFFFF;
    int i4 = zc.e(this.e, 16) & 0xFFFF;
    if (i4 != 0)
    {
      i4 = zc.e(this.e, 18) & 0xFFFF;
      byte[] arrayOfByte = new byte[i4];
      System.arraycopy(this.e, 24, arrayOfByte, 0, i4);
      if (i1 != 0) {
        paramShape.c(arrayOfByte);
      }
    }
    int i5 = i2 != 0 ? 1 : 0;
    if (i5 != 0)
    {
      String str = "";
      while (i2 != 0)
      {
        this.d = this.c.b(this.b);
        if ((this.d & 0xFFFF) != 60) {
          throw new IOException("File is corrupted");
        }
        c();
        if (this.e[0] == 0)
        {
          str = str + zct.a(this.e, 1, (this.f & 0xFFFF) - 1);
          i2 -= (this.f & 0xFFFF) - 1;
        }
        else
        {
          str = str + Encoding.getUnicode().a(this.e, 1, (this.f & 0xFFFF) - 1);
          i2 -= ((this.f & 0xFFFF) - 1) / 2;
        }
      }
      if (i1 != 0) {
        paramFontSettingCollection.c = str;
      }
      this.d = this.c.b(this.b);
      if ((this.d & 0xFFFF) != 60) {
        throw new IOException("File is corrupted");
      }
      c();
      if (i1 != 0)
      {
        int i6 = 0;
        if (i3 / 8 <= 2)
        {
          i6 = zc.e(this.e, 2) & 0xFFFF;
          if (i6 > 4) {
            i6--;
          }
          FontSetting localFontSetting1 = paramFontSettingCollection.b(0, str.length());
          if (i6 < this.g.A().size())
          {
            localFontSetting1.getFont().a((Font)this.g.A().get(i6), null);
            paramFontSettingCollection.get(0).q = localFontSetting1.getFont();
          }
        }
        else
        {
          int i7 = 0;
          int i8 = 0;
          for (int i9 = 0; i9 < (this.f & 0xFFFF) - 8; i9 += 8)
          {
            i8 = zc.e(this.e, i9) & 0xFFFF;
            i7 = zc.e(this.e, i9 + 8) & 0xFFFF;
            i6 = zc.e(this.e, i9 + 2) & 0xFFFF;
            int i10 = i6;
            if (i6 > 4) {
              i6--;
            }
            if (i7 != i8)
            {
              FontSetting localFontSetting2 = paramFontSettingCollection.b(i8, i7 - i8);
              if (i6 < this.g.A().size())
              {
                localFontSetting2.r = i6;
                localFontSetting2.getFont().a((Font)this.g.A().get(i6), null);
              }
              if (i9 != 0) {}
            }
          }
        }
      }
    }
    else
    {
      this.d = this.c.b(this.b);
      if ((this.d & 0xFFFF) == 60)
      {
        this.f = this.c.b(this.b);
        if ((this.f & 0xFFFF) != 1)
        {
          this.c.a(-4);
          return;
        }
        this.c.a(1);
      }
      else
      {
        this.c.a(-2);
        return;
      }
      this.d = this.c.b(this.b);
      if ((this.d & 0xFFFF) == 60)
      {
        this.f = this.c.b(this.b);
        this.c.a(this.f & 0xFFFF);
      }
      else
      {
        this.c.a(-2);
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4)
    throws Exception
  {
    if (paramInt2 + paramInt4 <= (this.f & 0xFFFF))
    {
      System.arraycopy(this.e, paramInt2, paramArrayOfByte, paramInt3, paramInt4);
      paramInt2 += paramInt4;
      return paramInt2;
    }
    int i1 = 0;
    for (;;)
    {
      if (paramInt4 - paramInt3 <= (this.f & 0xFFFF))
      {
        i1 = paramInt4 - paramInt3;
        System.arraycopy(this.e, paramInt2, paramArrayOfByte, paramInt3, i1);
        paramInt2 += i1;
        return paramInt2;
      }
      i1 = (this.f & 0xFFFF) - paramInt2;
      System.arraycopy(this.e, paramInt2, paramArrayOfByte, paramInt3, i1);
      paramInt3 += i1;
      d();
      paramInt2 = paramInt1;
    }
  }
  
  private void d()
    throws Exception
  {
    this.d = this.c.b(this.b);
    switch (this.d)
    {
    case 60: 
    case 235: 
    case 236: 
      c();
      if ((this.f & 0xFFFF) == 0) {
        d();
      }
      break;
    default: 
      throw new CellsException(18, "File is corrupted");
    }
  }
  
  private void a(ShapeCollection paramShapeCollection)
  {
    this.i = paramShapeCollection;
    Object localObject;
    if ((this.j instanceof Chart))
    {
      localObject = (Chart)this.j;
      ((Chart)localObject).a(paramShapeCollection);
    }
    else
    {
      localObject = (Worksheet)this.j;
      ((Worksheet)localObject).a(paramShapeCollection);
    }
  }
  
  void c()
    throws Exception
  {
    this.a.a(this.c);
    this.e = this.a.a();
    this.f = this.a.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */