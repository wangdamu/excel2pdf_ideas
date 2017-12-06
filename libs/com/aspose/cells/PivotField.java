package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

public class PivotField
{
  ArrayList a = null;
  PivotFieldCollection b;
  zbuu c;
  zbuv d;
  PivotItemCollection e;
  zbur f;
  int g;
  zbtv h;
  zbtq i;
  zbuo j;
  PivotField k;
  PivotTable l;
  int m;
  boolean n;
  boolean o;
  boolean p;
  boolean q;
  boolean r;
  String s = "{2946ED86-A175-432a-8AC1-64E0C546D7DE}";
  int t;
  boolean u;
  private boolean v;
  
  private String n()
  {
    GlobalizationSettings localGlobalizationSettings = this.b.b.a.a.getWorkbook().getSettings().getGlobalizationSettings();
    return localGlobalizationSettings.getEmptyDataName();
  }
  
  public PivotItemCollection getPivotItems()
  {
    return this.e;
  }
  
  public SxRng getRange()
  {
    if (this.h != null) {
      return this.h.j;
    }
    return null;
  }
  
  void a()
  {
    if ((this.h != null) && (this.h.j != null)) {
      this.h.j = null;
    }
  }
  
  void b()
  {
    PivotItem localPivotItem = new PivotItem(this.e);
    this.e.a(localPivotItem);
    localPivotItem.setIndex(0);
  }
  
  public PivotFilter getPivotFilterByType(int type)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.l.getPivotFilters().getCount(); i1++)
    {
      PivotFilter localPivotFilter = this.l.getPivotFilters().get(i1);
      if ((localPivotFilter.b == type) && (this.t == localPivotFilter.a)) {
        return localPivotFilter;
      }
    }
    return null;
  }
  
  public ArrayList getPivotFilters()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.l.getPivotFilters().getCount(); i1++)
    {
      PivotFilter localPivotFilter = this.l.getPivotFilters().get(i1);
      if (this.t == localPivotFilter.a) {
        zf.a(localArrayList, localPivotFilter);
      }
    }
    return localArrayList;
  }
  
  PivotField(PivotTable pivotTable, PivotFieldCollection dataFields)
  {
    this.l = pivotTable;
    this.b = pivotTable.getBaseFields();
    this.e = new PivotItemCollection(this);
    this.m = 1;
    for (int i1 = 0; (i1 < 2) && (i1 < dataFields.getCount()); i1++)
    {
      PivotItem localPivotItem = new PivotItem(this.e);
      this.e.a(localPivotItem);
      localPivotItem.setIndex(i1);
      localPivotItem.e = dataFields.get(i1);
    }
    this.k = this;
  }
  
  PivotField(PivotFieldCollection pivotFields)
  {
    this.b = pivotFields;
    this.i = new zbtq();
    this.j = new zbuo(this);
    this.c = new zbuu(this);
    this.d = new zbuv(this);
    this.e = new PivotItemCollection(this);
    this.k = this;
  }
  
  PivotField(PivotFieldCollection pivotFields, PivotField pivotField)
  {
    this.b = pivotFields;
    this.k = pivotField;
    this.i = new zbtq(this);
    this.m = 8;
  }
  
  PivotField()
  {
    this.e = new PivotItemCollection(this);
  }
  
  void a(PivotField paramPivotField)
  {
    if (this.c != null) {
      this.c.a(paramPivotField.c);
    }
    if (this.d != null) {
      this.d.a(paramPivotField.d);
    }
    if (this.i != null) {
      this.i.a(paramPivotField.i);
    }
    if (this.j != null) {
      this.j.a(paramPivotField.j);
    }
    if (paramPivotField.f != null)
    {
      this.f = new zbur();
      this.f.a(paramPivotField.f);
    }
    setShowCompact(paramPivotField.getShowCompact());
    this.o = paramPivotField.o;
    this.u = paramPivotField.u;
    setRepeatItemLabels(paramPivotField.isRepeatItemLabels());
    if ((this.e != null) && (paramPivotField.e != null))
    {
      this.e.b = new ArrayList(paramPivotField.e.getCount());
      for (int i1 = 0; i1 < paramPivotField.e.getCount(); i1++) {
        this.e.a(paramPivotField.e.get(i1));
      }
    }
  }
  
  int c()
  {
    return this.t;
  }
  
  void a(int paramInt)
  {
    this.t = paramInt;
  }
  
  public void initPivotItems()
  {
    if ((this.e.getCount() == 0) && (this.h != null) && (this.h.c != null))
    {
      int i1 = this.h.c.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        PivotItem localPivotItem = new PivotItem(this.e);
        this.e.a(localPivotItem);
        localPivotItem.setIndex(i2);
      }
    }
  }
  
  void d()
  {
    if ((this.e.getCount() == 0) && (this.h != null) && (this.h.j.d != null))
    {
      int i1 = this.h.j.d.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        PivotItem localPivotItem = new PivotItem(this.e);
        this.e.a(localPivotItem);
        localPivotItem.setIndex(i2);
      }
    }
  }
  
  void e()
  {
    this.e = new PivotItemCollection(this);
  }
  
  void f()
  {
    int i1 = this.e.getCount();
    if (i1 > 0) {
      for (int i2 = 0; i2 < i1; i2++)
      {
        PivotItem localPivotItem = this.e.get(i2);
        localPivotItem.i = localPivotItem.getValue();
      }
    }
  }
  
  boolean g()
  {
    return this.k.h.e();
  }
  
  boolean h()
  {
    return this.k.u;
  }
  
  void a(boolean paramBoolean)
  {
    this.k.u = paramBoolean;
  }
  
  public boolean isCalculatedField()
  {
    if ((this.k == null) || (this.k.h == null)) {
      return false;
    }
    return this.k.h.m();
  }
  
  public String getCalculatedFieldFormula()
  {
    if ((this.k == null) || (this.k.h == null)) {
      return null;
    }
    return zauj.L(this.k.h.d);
  }
  
  boolean i()
  {
    return (this.t == -2) || (this.t == 65534);
  }
  
  public int getBaseIndex()
  {
    return this.k.c();
  }
  
  public void setBaseIndex(int value)
  {
    this.k.a(value);
  }
  
  void b(int paramInt)
  {
    this.k.a(paramInt);
  }
  
  public int getPosition()
  {
    PivotFieldCollection localPivotFieldCollection = this.b.b.fields(this.m);
    return localPivotFieldCollection.d(this);
  }
  
  public String getName()
  {
    if (i()) {
      return this.l.b.h;
    }
    if (this.k.h != null) {
      return this.k.h.a;
    }
    return null;
  }
  
  boolean j()
  {
    return (this.b != null) && (this.b.c == 8);
  }
  
  public String getDisplayName()
  {
    if (i()) {
      return this.l.b.h;
    }
    if (j()) {
      return this.i.b();
    }
    return this.c.b;
  }
  
  public void setDisplayName(String value)
  {
    if (i())
    {
      this.l.b.h = value;
      return;
    }
    if (j()) {
      this.i.b(value);
    } else {
      this.c.b = value;
    }
  }
  
  public void setSubtotals(int subtotalType, boolean shown)
  {
    o();
    if ((h()) && (this.m == 8)) {
      throw new CellsException(12, "Subtotals are only valid for nondata fields");
    }
    this.b.b.s = false;
    switch (subtotalType)
    {
    case 1: 
      if (isAutoSubtotals() != shown) {
        if (shown) {
          this.c.a = subtotalType;
        } else {
          this.c.a = 0;
        }
      }
      break;
    case 0: 
      if (shown) {
        this.c.a = subtotalType;
      } else if (getSubtotals(0)) {
        this.c.a = 1;
      }
      break;
    default: 
      if (getSubtotals(subtotalType) != shown)
      {
        if (isAutoSubtotals()) {
          this.c.a &= 0xFE;
        }
        int i1 = subtotalType;
        this.c.a &= (i1 & 0xFFFF ^ 0xFFFFFFFF);
        this.c.a |= (shown ? i1 & 0xFFFF : 0);
      }
      break;
    }
  }
  
  public boolean getSubtotals(int subtotalType)
  {
    if ((i()) || ((h()) && (this.m == 8))) {
      return false;
    }
    switch (subtotalType)
    {
    case 1: 
      return this.c.a == 1;
    case 0: 
      return this.c.a == 0;
    }
    return (this.c.a & 0xFFFF & subtotalType & 0xFFFF) != 0;
  }
  
  boolean k()
  {
    if ((i()) || ((h()) && (m() != 1) && (this.m == 8))) {
      return true;
    }
    return this.c.a == 0;
  }
  
  public boolean isAutoSubtotals()
  {
    if (i()) {
      return true;
    }
    if (k()) {
      return false;
    }
    return this.c.a == 1;
  }
  
  public void setAutoSubtotals(boolean value)
  {
    o();
    if (j()) {
      throw new CellsException(12, "Subtotals are only valid for nondata fields");
    }
    if (value) {
      this.c.a = 1;
    } else if (this.c.a == 1) {
      this.c.a = 0;
    }
    this.b.b.s = false;
  }
  
  public boolean getDragToColumn()
  {
    if (i()) {
      return true;
    }
    return this.k.d.a(4);
  }
  
  public void setDragToColumn(boolean value)
  {
    if (i()) {
      return;
    }
    this.k.d.a(value, 4);
  }
  
  public boolean getDragToHide()
  {
    if (i()) {
      return true;
    }
    return this.k.d.a(16);
  }
  
  public void setDragToHide(boolean value)
  {
    if (i()) {
      return;
    }
    this.k.d.a(value, 16);
  }
  
  public boolean getDragToRow()
  {
    if (i()) {
      return true;
    }
    return this.k.d.a(2);
  }
  
  public void setDragToRow(boolean value)
  {
    if (i()) {
      return;
    }
    this.k.d.a(value, 2);
  }
  
  public boolean getDragToPage()
  {
    if (i()) {
      return false;
    }
    return this.k.d.a(8);
  }
  
  public void setDragToPage(boolean value)
  {
    if (i()) {
      return;
    }
    this.k.d.a(value, 8);
  }
  
  public boolean getDragToData()
  {
    if (i()) {
      return true;
    }
    return !this.k.d.a(32);
  }
  
  public void setDragToData(boolean value)
  {
    this.k.d.a(!value, 32);
  }
  
  public boolean isMultipleItemSelectionAllowed()
  {
    return this.n;
  }
  
  public void setMultipleItemSelectionAllowed(boolean value)
  {
    this.n = value;
  }
  
  public boolean isRepeatItemLabels()
  {
    return this.q;
  }
  
  public void setRepeatItemLabels(boolean value)
  {
    this.q = value;
  }
  
  public boolean isIncludeNewItemsInFilter()
  {
    return this.r;
  }
  
  public void setIncludeNewItemsInFilter(boolean value)
  {
    this.r = value;
  }
  
  public boolean isInsertPageBreaksBetweenItems()
  {
    return this.k.d.a(16384);
  }
  
  public void setInsertPageBreaksBetweenItems(boolean value)
  {
    this.k.d.a(value, 16384);
  }
  
  public boolean getShowAllItems()
  {
    if (i()) {
      return true;
    }
    return this.k.d.a(1);
  }
  
  public void setShowAllItems(boolean value)
  {
    if (i()) {
      return;
    }
    this.k.d.a(value, 1);
  }
  
  public boolean isAutoSort()
  {
    if (i()) {
      return true;
    }
    switch (this.m)
    {
    case 1: 
    case 2: 
    case 4: 
      return this.d.a(512);
    }
    return false;
  }
  
  public void setAutoSort(boolean value)
  {
    if (i()) {
      return;
    }
    switch (this.m)
    {
    case 1: 
    case 2: 
    case 4: 
      this.d.a(value, 512);
    }
    this.b.b.s = false;
  }
  
  public boolean isAscendSort()
  {
    if (i()) {
      return true;
    }
    if (!isAutoSort()) {
      return true;
    }
    return this.d.a(1024);
  }
  
  public void setAscendSort(boolean value)
  {
    o();
    if (isAutoSort())
    {
      this.d.a(value, 1024);
      setAutoSort(true);
    }
    this.b.b.s = false;
  }
  
  public int getAutoSortField()
  {
    if (i()) {
      return -1;
    }
    switch (this.m)
    {
    case 1: 
    case 2: 
    case 4: 
      return this.d.c();
    }
    return -1;
  }
  
  public void setAutoSortField(int value)
  {
    o();
    switch (this.m)
    {
    case 1: 
    case 2: 
    case 4: 
      if (!isAutoSort()) {
        return;
      }
      if ((value == -1) || (this.d.h == (short)value)) {
        return;
      }
      Object localObject;
      if (this.f == null)
      {
        this.f = new zbur();
        localObject = new zbtz();
        ((zbtz)localObject).b(65534);
        ((zbtz)localObject).a((byte)8);
        zf.a(((zbtz)localObject).c, Integer.valueOf(value));
        zf.a(this.f.e, localObject);
      }
      else if (this.f.e.size() == 0)
      {
        localObject = new zbtz();
        ((zbtz)localObject).b(65534);
        ((zbtz)localObject).a((byte)8);
        zf.a(((zbtz)localObject).c, Integer.valueOf(value));
        zf.a(this.f.e, localObject);
      }
      else
      {
        localObject = ((zbtz)this.f.e.get(0)).c;
        if (((ArrayList)localObject).size() == 0) {
          zf.a((ArrayList)localObject, Integer.valueOf(value));
        } else {
          ((ArrayList)localObject).set(0, Integer.valueOf(value));
        }
      }
      this.d.h = ((short)value);
      this.b.b.s = false;
    }
  }
  
  public boolean isAutoShow()
  {
    if ((i()) || (h())) {
      return false;
    }
    return this.d.a(2048);
  }
  
  public void setAutoShow(boolean value)
  {
    o();
    if (!h()) {
      this.d.a(value, 2048);
    }
    this.b.b.s = false;
  }
  
  public boolean isAscendShow()
  {
    if (isAutoShow()) {
      return this.d.a(4096);
    }
    return true;
  }
  
  public void setAscendShow(boolean value)
  {
    o();
    if (isAutoShow()) {
      this.d.a(value, 4096);
    }
    this.b.b.s = false;
  }
  
  public int getAutoShowCount()
  {
    if ((i()) || (h())) {
      return 10;
    }
    if (this.g > 0) {
      return this.g;
    }
    return this.d.c;
  }
  
  public void setAutoShowCount(int value)
  {
    o();
    if (isAutoShow())
    {
      this.d.c = ((byte)value);
      this.b.b.s = false;
    }
  }
  
  public int getAutoShowField()
  {
    if ((i()) || (h())) {
      return -1;
    }
    return this.d.b();
  }
  
  public void setAutoShowField(int value)
  {
    o();
    if ((h()) || (!isAutoShow())) {
      return;
    }
    this.d.i = ((short)value);
  }
  
  public int getFunction()
  {
    if (i()) {
      return 0;
    }
    if (h()) {
      return this.i.a;
    }
    return 0;
  }
  
  public void setFunction(int value)
  {
    o();
    if (h()) {
      this.i.a = value;
    }
    this.b.b.s = false;
  }
  
  public int getDataDisplayFormat()
  {
    if (i()) {
      return 0;
    }
    if (h()) {
      return this.i.b;
    }
    return 0;
  }
  
  public void setDataDisplayFormat(int value)
  {
    o();
    if (h())
    {
      this.b.b.s = false;
      this.i.b = value;
      switch (value)
      {
      case 0: 
        this.i.c = 0;
        this.i.d = 0;
        break;
      case 1: 
      case 2: 
        break;
      case 3: 
      case 5: 
      case 6: 
      case 7: 
        this.i.e = 10;
        break;
      case 4: 
      case 8: 
        this.i.e = 10;
        this.i.d = 0;
        break;
      case 11: 
        this.i.e = 10;
        this.i.f = null;
        break;
      }
    }
  }
  
  /**
   * @deprecated
   */
  public int getBaseField()
  {
    return getBaseFieldIndex();
  }
  
  /**
   * @deprecated
   */
  public void setBaseField(int value)
  {
    setBaseFieldIndex(value);
  }
  
  /**
   * @deprecated
   */
  public int getBaseItem()
  {
    return getBaseItemIndex();
  }
  
  /**
   * @deprecated
   */
  public void setBaseItem(int value)
  {
    setBaseItemIndex(value);
  }
  
  public int getBaseFieldIndex()
  {
    if (i()) {
      return 0;
    }
    if (h()) {
      return this.i.c;
    }
    return 0;
  }
  
  public void setBaseFieldIndex(int value)
  {
    o();
    if (h())
    {
      switch (this.i.b)
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 11: 
        PivotField localPivotField = this.b.b.getBaseFields().get(value);
        this.i.c = value;
        break;
      }
      this.b.b.s = false;
    }
  }
  
  public int getBaseItemPosition()
  {
    if (i()) {
      return 2;
    }
    if (h())
    {
      switch (this.i.d)
      {
      case 32763: 
      case 1048828: 
        return 0;
      case 32764: 
      case 1048829: 
        return 1;
      }
      return 2;
    }
    return 2;
  }
  
  public void setBaseItemPosition(int value)
  {
    o();
    if (h())
    {
      switch (value)
      {
      case 0: 
        if (this.b.b.a.a.d().h()) {
          this.i.d = 1048828;
        } else {
          this.i.d = 32763;
        }
        break;
      case 1: 
        if (this.b.b.a.a.d().h()) {
          this.i.d = 1048829;
        } else {
          this.i.d = 32764;
        }
        break;
      case 2: 
      default: 
        this.i.d = 0;
      }
      this.b.b.s = false;
    }
  }
  
  public int getBaseItemIndex()
  {
    if (i()) {
      return 0;
    }
    if (h()) {
      return this.i.d;
    }
    return 0;
  }
  
  public void setBaseItemIndex(int value)
  {
    o();
    if (h())
    {
      switch (this.i.b)
      {
      case 1: 
      case 2: 
      case 3: 
        PivotItem localPivotItem = this.b.b.getBaseFields().get(this.i.c).e.get(value);
        this.i.d = value;
        break;
      }
      this.b.b.s = false;
    }
  }
  
  public short getCurrentPageItem()
  {
    if (this.k.j != null) {
      return this.k.j.b;
    }
    return 32765;
  }
  
  public void setCurrentPageItem(short value)
  {
    if (this.k.j != null)
    {
      this.k.j.b = value;
      this.b.b.s = false;
    }
  }
  
  public int getNumber()
  {
    if (i()) {
      return 0;
    }
    if (j()) {
      return this.i.e;
    }
    return this.d.d;
  }
  
  public void setNumber(int value)
  {
    o();
    if (j())
    {
      this.i.a(null);
      this.i.e = ((short)value);
    }
    else
    {
      this.d.a(null);
      this.d.d = ((short)value);
    }
    this.b.b.s = false;
  }
  
  public boolean getInsertBlankRow()
  {
    if (i()) {
      return true;
    }
    return (this.d.b & 0xFF & 0x40) != 0;
  }
  
  public void setInsertBlankRow(boolean value)
  {
    if (i()) {
      return;
    }
    if (value)
    {
      zbuv tmp16_13 = this.d;
      tmp16_13.b = ((byte)(tmp16_13.b | 0x40));
    }
    else
    {
      zbuv tmp34_31 = this.d;
      tmp34_31.b = ((byte)(tmp34_31.b & 0xBF));
    }
  }
  
  public boolean getShowSubtotalAtTop()
  {
    if (i()) {
      return true;
    }
    return (this.d.b & 0xFF & 0x80) != 0;
  }
  
  public void setShowSubtotalAtTop(boolean value)
  {
    if (i()) {
      return;
    }
    if (value)
    {
      zbuv tmp16_13 = this.d;
      tmp16_13.b = ((byte)(tmp16_13.b | 0x80));
    }
    else
    {
      zbuv tmp35_32 = this.d;
      tmp35_32.b = ((byte)(tmp35_32.b & 0x7F));
    }
  }
  
  public boolean getShowInOutlineForm()
  {
    if (i()) {
      return true;
    }
    return (this.d.b & 0xFF & 0x20) != 0;
  }
  
  public void setShowInOutlineForm(boolean value)
  {
    if (i()) {
      return;
    }
    if (value)
    {
      zbuv tmp16_13 = this.d;
      tmp16_13.b = ((byte)(tmp16_13.b | 0x20));
    }
    else
    {
      zbuv tmp34_31 = this.d;
      tmp34_31.b = ((byte)(tmp34_31.b & 0xDF));
    }
  }
  
  void c(int paramInt)
  {
    if (j()) {
      this.i.e = ((short)paramInt);
    } else {
      this.d.d = ((short)paramInt);
    }
  }
  
  public String getNumberFormat()
  {
    String str = "";
    if (i()) {
      str = "";
    } else if (j()) {
      str = this.i.a();
    } else {
      str = this.d.a();
    }
    if (str == null) {
      str = "";
    }
    return str;
  }
  
  public void setNumberFormat(String value)
  {
    o();
    if (j())
    {
      this.i.e = 0;
      this.i.a(value);
    }
    else
    {
      this.d.d = 0;
      this.d.a(value);
    }
    this.b.b.s = false;
  }
  
  public boolean isHiddenItem(int index)
  {
    if (h()) {
      return false;
    }
    if (this.e.getCount() == 0) {
      return false;
    }
    return this.e.get(index).isHidden();
  }
  
  public void hideItem(int index, boolean isHidden)
  {
    if (j()) {
      throw new CellsException(12, "You can't hide/unhide one of the ");
    }
    this.e.get(index).setHidden(isHidden);
  }
  
  public boolean isHiddenItemDetail(int index)
  {
    if (h()) {
      return false;
    }
    if (this.e.getCount() == 0) {
      return false;
    }
    return this.e.get(index).a();
  }
  
  public void hideItemDetail(int index, boolean isHiddenDetail)
  {
    if (j()) {
      throw new CellsException(12, "You can't hide/unhide detail one of the item");
    }
    this.e.get(index).a(isHiddenDetail);
  }
  
  public void hideDetail(boolean isHiddenDetail)
  {
    if (j()) {
      throw new CellsException(12, "You can't hide/unhide data field's detail");
    }
    for (int i1 = 0; i1 < this.e.getCount(); i1++) {
      this.e.get(i1).a(isHiddenDetail);
    }
  }
  
  public void hideItem(String itemValue, boolean isHidden)
  {
    if (j()) {
      throw new CellsException(12, "You can't hide/unhide one of the ");
    }
    PivotItem localPivotItem = this.e.get(itemValue);
    if (localPivotItem != null) {
      localPivotItem.setHidden(isHidden);
    }
  }
  
  public String[] getItems()
  {
    int i1 = this.e.getCount();
    String[] arrayOfString = new String[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      arrayOfString[i2] = this.e.get(i2).getName();
      if (arrayOfString[i2] == null) {
        arrayOfString[i2] = n();
      }
    }
    return arrayOfString;
  }
  
  public String[] getOriginalItems()
  {
    if ((this.h == null) || (this.h.c == null)) {
      return null;
    }
    if (this.h.c.size() == 0)
    {
      if (this.h.t()) {
        return null;
      }
      if (this.h.a().h != null) {
        this.h.a().h.a(this.h);
      }
      if (this.h.t()) {
        return null;
      }
    }
    int i1 = this.h.c.size();
    String[] arrayOfString = new String[i1];
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = ((zbos)this.h.c.get(i2)).a;
      if (localObject == null) {
        arrayOfString[i2] = n();
      } else {
        arrayOfString[i2] = zs.a(localObject);
      }
    }
    return arrayOfString;
  }
  
  public int getItemCount()
  {
    return this.e.getCount();
  }
  
  public void addCalculatedItem(String name, String formula)
  {
    switch (this.m)
    {
    case 4: 
    case 8: 
      return;
    }
    zaxa localzaxa = null;
    PivotField localPivotField = this.k;
    if (this.k == null) {
      localPivotField = this;
    } else {
      localPivotField = this.k;
    }
    zawp localzawp = localPivotField.b.b.d;
    if (localPivotField.h.c == null) {
      localPivotField.h.c = new ArrayList();
    }
    localzaxa = new zaxa(localzawp, this, name, formula, this.m, localPivotField.h.c.size());
    zbos localzbos = new zbos();
    localzbos.b = true;
    localzbos.a = name;
    zf.a(localPivotField.h.c, localzbos);
    localzawp.a(c());
    if (localzawp.m == null) {
      localzawp.m = new zawz();
    }
    localzawp.m.a(localzaxa);
    localzaxa.a(getBaseIndex(), formula);
    if ((this.k != null) && (this.e != null))
    {
      PivotItem localPivotItem = new PivotItem(this.e);
      localPivotItem.setIndex(this.e.getCount());
      this.e.a(localPivotItem);
      localPivotItem.b(true);
    }
  }
  
  boolean l()
  {
    if (this.e != null) {
      for (int i1 = 0; i1 < this.e.getCount(); i1++)
      {
        PivotItem localPivotItem = this.e.get(i1);
        if (localPivotItem.b()) {
          return true;
        }
      }
    }
    return false;
  }
  
  int m()
  {
    return this.c.a();
  }
  
  public boolean getShowCompact()
  {
    return this.v;
  }
  
  public void setShowCompact(boolean value)
  {
    this.v = value;
  }
  
  private void o()
  {
    if (i()) {
      throw new CellsException(12, "You can't operate the field ");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */