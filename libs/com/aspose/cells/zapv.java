package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zapv
{
  private WorksheetCollection b;
  private Worksheet c;
  private ShapeCollection d;
  private zrg e;
  private zkr f;
  private ArrayList g;
  byte[] a;
  
  zapv(WorksheetCollection paramWorksheetCollection, Worksheet paramWorksheet, ShapeCollection paramShapeCollection, zrg paramzrg)
  {
    this.b = paramWorksheetCollection;
    this.c = paramWorksheet;
    this.d = paramShapeCollection;
    this.e = paramzrg;
    this.g = new ArrayList();
    b();
  }
  
  private void b()
  {
    int i = 0;
    int j = 0;
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Shape)localIterator.next();
      switch (((Shape)localObject).getAutoShapeType())
      {
      case 19: 
        i += 16;
        j++;
        break;
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        i += 32;
        j++;
        break;
      case 20: 
        if (((Shape)localObject).g != null)
        {
          i += 32;
          j++;
        }
        break;
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 61: 
      case 62: 
      case 63: 
      case 77: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 83: 
      case 106: 
      case 178: 
      case 179: 
      case 180: 
      case 181: 
        i += 16;
        j++;
      }
    }
    if (i == 0) {
      return;
    }
    this.a = new byte[i + 8];
    this.a[0] = ((byte)(0xF | (j & 0xF) << 4));
    this.a[1] = ((byte)(j >> 4));
    this.a[2] = 5;
    this.a[3] = -16;
    System.arraycopy(zc.a(i), 0, this.a, 4, 4);
    int k = 8;
    Object localObject = { -1, -1, -1, -1, -1, -1, -1, -1 };
    for (int m = 0; m < this.d.getCount(); m++)
    {
      Shape localShape = this.d.get(m);
      switch (localShape.getAutoShapeType())
      {
      case 19: 
        this.a[(k + 2)] = 20;
        this.a[(k + 3)] = -16;
        this.a[(k + 4)] = 8;
        System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k + 8, 4);
        System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k + 12, 4);
        k += 16;
        break;
      case 20: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
        if ((localShape.getAutoShapeType() != 20) || (localShape.g != null))
        {
          this.a[k] = 1;
          this.a[(k + 2)] = 18;
          this.a[(k + 3)] = -16;
          this.a[(k + 4)] = 24;
          k += 8;
          znn localznn = localShape.g;
          System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k, 4);
          System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k + 12, 4);
          if ((localznn == null) || (localznn.a == -1) || (localznn.c == -1))
          {
            System.arraycopy(localObject, 0, this.a, k + 16, 8);
          }
          else
          {
            System.arraycopy(zc.a(this.d.get(localznn.a).R().j().c()), 0, this.a, k + 4, 4);
            System.arraycopy(zc.a(this.d.get(localznn.c).R().j().c()), 0, this.a, k + 8, 4);
            System.arraycopy(zc.a(localznn.b), 0, this.a, k + 16, 4);
            System.arraycopy(zc.a(localznn.d), 0, this.a, k + 20, 4);
          }
          k += 24;
        }
        break;
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 51: 
      case 52: 
      case 61: 
      case 62: 
      case 63: 
      case 77: 
      case 78: 
      case 79: 
      case 80: 
      case 81: 
      case 83: 
      case 106: 
      case 178: 
      case 179: 
      case 180: 
      case 181: 
        this.a[(k + 2)] = 23;
        this.a[(k + 3)] = -16;
        this.a[(k + 4)] = 8;
        System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k + 8, 4);
        System.arraycopy(zc.a(localShape.R().j().c()), 0, this.a, k + 12, 4);
        k += 16;
      }
    }
  }
  
  void a()
    throws Exception
  {
    boolean bool = true;
    Object localObject = this.d.iterator();
    Shape localShape;
    while (((Iterator)localObject).hasNext())
    {
      localShape = (Shape)((Iterator)localObject).next();
      localShape.R().m();
    }
    localObject = this.d.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localShape = (Shape)((Iterator)localObject).next();
      if (!localShape.W())
      {
        if (localShape.isGroup()) {
          a((GroupShape)localShape, bool);
        } else if (localShape.Y()) {
          a(localShape, bool);
        } else {
          b(localShape, bool);
        }
        bool = false;
      }
    }
    if (this.a != null)
    {
      localObject = this.a;
      if (localObject.length <= 8224)
      {
        this.e.b(60);
        this.e.b(localObject.length);
        this.e.a((byte[])localObject);
        return;
      }
      int i = 0;
      int j = 0;
      zaon localzaon = new zaon(this);
      for (;;)
      {
        j = localObject.length - i;
        if (j <= 8224)
        {
          localzaon.a((byte[])localObject, i, j);
          localzaon.a(this.e);
          break;
        }
        localzaon.a((byte[])localObject, i, 8224);
        localzaon.a(this.e);
        i += 8224;
      }
    }
  }
  
  void a(GroupShape paramGroupShape, boolean paramBoolean)
    throws Exception
  {
    b(paramGroupShape, paramBoolean);
    paramBoolean = false;
    Shape[] arrayOfShape1 = paramGroupShape.getGroupedShapes();
    for (Shape localShape : arrayOfShape1) {
      if (localShape.isGroup()) {
        a((GroupShape)localShape, paramBoolean);
      } else {
        b(localShape, paramBoolean);
      }
    }
    this.g.remove(this.g.size() - 1);
  }
  
  void a(Shape paramShape, boolean paramBoolean)
    throws Exception
  {
    zaon localzaon = new zaon(this);
    int i = 0;
    if (paramBoolean) {
      i = localzaon.a(this.d, paramShape);
    }
    ComboBox localComboBox = (ComboBox)paramShape;
    Object localObject1;
    int j;
    int k;
    Object localObject2;
    if ((localComboBox.a() instanceof AutoFilter))
    {
      localObject1 = (AutoFilter)localComboBox.a();
      j = ((AutoFilter)localObject1).h();
      k = ((AutoFilter)localObject1).i().StartColumn;
      localObject2 = new zarm();
      int m = paramShape.O();
      while (k <= ((AutoFilter)localObject1).i().EndColumn)
      {
        int i1 = k + 1;
        zapd localzapd = this.c.getCells().o();
        for (int i3 = 0; i3 < localzapd.getCount(); i3++)
        {
          CellArea localCellArea = localzapd.a(i3);
          if (((j & 0xFFFF) >= localCellArea.StartRow) && ((j & 0xFFFF) <= localCellArea.EndRow) && (k >= localCellArea.StartColumn) && (k <= localCellArea.EndColumn))
          {
            if (localCellArea.EndColumn > ((AutoFilter)localObject1).i().EndColumn)
            {
              i1 = ((AutoFilter)localObject1).i().EndColumn + 1;
              break;
            }
            i1 = localCellArea.EndColumn + 1;
            break;
          }
        }
        localComboBox.R().j().c(localComboBox.R().j().c() + 1);
        localzaon.a(localComboBox, i, j, k, i1);
        localzaon.a(this.e);
        ((zarm)localObject2).a(paramShape, m++);
        ((zarm)localObject2).a(this.e);
        i = 0;
        if (k == 255) {
          break;
        }
        k = i1;
      }
    }
    else
    {
      Object localObject3;
      if ((localComboBox.a() instanceof ValidationCollection))
      {
        localObject1 = localComboBox.Q().getActiveCell();
        j = 0;
        k = 0;
        localObject2 = new int[] { j };
        int[] arrayOfInt = { k };
        CellsHelper.a((String)localObject1, (int[])localObject2, arrayOfInt);
        j = localObject2[0];
        k = arrayOfInt[0];
        localzaon.a(localComboBox, i, j, (byte)k);
        localzaon.a(this.e);
        localObject3 = new zarm();
        ((zarm)localObject3).a(paramShape, paramShape.O());
        ((zarm)localObject3).a(this.e);
      }
      else if ((localComboBox.a() instanceof PivotTable))
      {
        localObject1 = (PivotTable)localComboBox.a();
        j = ((PivotTable)localObject1).i;
        k = (byte)(((PivotTable)localObject1).k + 1);
        localObject2 = new zarm();
        int n = paramShape.O();
        localObject3 = ((PivotTable)localObject1).getPageFields();
        for (int i2 = 0; i2 < ((PivotFieldCollection)localObject3).getCount(); i2++)
        {
          j = ((PivotTable)localObject1).i - 1 - (((PivotFieldCollection)localObject3).getCount() - i2);
          localComboBox.R().j().c(localComboBox.R().j().c() + 1);
          localzaon.a(localComboBox, i, j, k & 0xFF, (byte)((k & 0xFF) + 1) & 0xFF);
          localzaon.a(this.e);
          ((zarm)localObject2).a(paramShape, n++);
          ((zarm)localObject2).a(this.e);
          i = 0;
          if ((k & 0xFF) == 255) {
            break;
          }
        }
      }
    }
  }
  
  void b(Shape paramShape, boolean paramBoolean)
    throws Exception
  {
    zaon localzaon = new zaon(this);
    int i = 0;
    if (paramBoolean) {
      i = localzaon.a(this.d, paramShape);
    }
    localzaon.a(paramShape, i, this.g);
    localzaon.a(this.e);
    zarm localzarm = new zarm();
    localzarm.a(paramShape);
    localzarm.a(this.e);
    if ((paramShape.F()) || (paramShape.getMsoDrawingType() == 5)) {
      a(paramShape);
    }
  }
  
  void a(Shape paramShape)
    throws Exception
  {
    switch (paramShape.getMsoDrawingType())
    {
    case 5: 
      if (this.f == null) {
        this.f = new zkr(this.b, this.c.getIndex(), this.c.getCharts(), this.e);
      }
      this.f.a(((ChartShape)paramShape).a());
      break;
    case 25: 
      a(paramShape, ((CommentShape)paramShape).a().b());
      break;
    case 6: 
      a(paramShape, ((TextBox)paramShape).getTextBody());
      break;
    case 11: 
      a(paramShape, ((CheckBox)paramShape).getTextBody());
      break;
    case 12: 
      a(paramShape, ((RadioButton)paramShape).getTextBody());
      break;
    case 14: 
      a(paramShape, ((Label)paramShape).getTextBody());
      break;
    case 7: 
      a(paramShape, ((Button)paramShape).getTextBody());
      break;
    case 19: 
      a(paramShape, ((GroupBox)paramShape).getTextBody());
      break;
    case 30: 
      if (paramShape.x != null) {
        a(paramShape, ((CellsDrawing)paramShape).getTextBody());
      }
      break;
    case 2: 
      if (paramShape.x != null) {
        a(paramShape, ((RectangleShape)paramShape).getTextBody());
      }
      break;
    case 3: 
      if (paramShape.x != null) {
        a(paramShape, ((Oval)paramShape).getTextBody());
      }
      break;
    case 4: 
      if (paramShape.x != null) {
        a(paramShape, ((ArcShape)paramShape).getTextBody());
      }
      break;
    }
  }
  
  void a(Shape paramShape, FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    zaon localzaon = new zaon(this);
    localzaon.a();
    localzaon.a(this.e);
    zbvg localzbvg = new zbvg();
    int i = 0;
    if (!zw.b(paramFontSettingCollection.getText())) {
      i = paramFontSettingCollection.getText().length() & 0xFFFF;
    }
    int j = paramFontSettingCollection.f();
    ArrayList localArrayList = localzbvg.a(paramShape, paramFontSettingCollection, j, i);
    localzbvg.a(this.e);
    if (i == 0) {
      return;
    }
    znt localznt = new znt();
    localznt.a(paramFontSettingCollection.getText(), this.e);
    localznt.a(this.e);
    localznt.a(localArrayList);
    localznt.a(this.e);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */