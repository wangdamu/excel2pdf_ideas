package com.aspose.cells;

import com.aspose.cells.a.c.zd;
import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zw;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ShapeCollection
  extends CollectionBase
{
  private WorksheetCollection b;
  private Worksheet c;
  private Object d;
  private int e;
  private zsc f;
  byte[] a = null;
  private ArrayList g = null;
  
  ArrayList a()
  {
    return this.g;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  ShapeCollection(WorksheetCollection sheets, Worksheet sheet, zse dggContainer, Object parent, int dgId)
  {
    this.d = parent;
    this.b = sheets;
    this.c = sheet;
    if (dgId == -1) {
      this.f = dggContainer.a(this, dggContainer);
    } else {
      this.f = new zsc(this, dggContainer, dgId);
    }
    this.e = 0;
  }
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 2;
    case 19: 
      return 4;
    case 3: 
      return 3;
    }
    return 30;
  }
  
  void b()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.x != null)
      {
        if ((localShape.p != null) && (localShape.x.g() > 1)) {
          j().a(localShape.p.a());
        }
        WorksheetCollection.a(j(), localShape.getTextBody(), 0);
      }
      if (localShape.getMsoDrawingType() == 5)
      {
        Chart localChart = ((ChartShape)localShape).a();
        localChart.a(j().A());
      }
    }
  }
  
  void c()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.x != null) {
        localShape.x.l();
      }
      if (localShape.getMsoDrawingType() == 5)
      {
        Chart localChart = ((ChartShape)localShape).a();
        localChart.a(j().A());
      }
    }
  }
  
  zsc d()
  {
    return this.f;
  }
  
  zse e()
  {
    return this.f.a();
  }
  
  public Shape get(int index)
  {
    return (Shape)this.InnerList.get(index);
  }
  
  public Shape get(String name)
  {
    for (int i = 0; i < getCount(); i++) {
      if (zw.a(get(i).getName(), name, true) == 0) {
        return get(i);
      }
    }
    return null;
  }
  
  public Shape addCopy(Shape sourceShape, int upperLeftRow, int top, int upperLeftColumn, int left)
    throws Exception
  {
    if (sourceShape.W()) {
      return null;
    }
    CopyOptions localCopyOptions = new CopyOptions(2, sourceShape.Q(), k());
    Shape localShape = a(sourceShape, null, localCopyOptions);
    localShape.a(upperLeftRow, top, upperLeftColumn, left);
    localShape.setWidth(sourceShape.getWidth());
    localShape.setHeight(sourceShape.getHeight());
    localShape.setName(null);
    return localShape;
  }
  
  CheckBox a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (g()) {
      return null;
    }
    CheckBox localCheckBox = new CheckBox(this);
    localCheckBox.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localCheckBox);
    this.c.getCheckBoxes().a(localCheckBox);
    return localCheckBox;
  }
  
  TextBox b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    TextBox localTextBox = new TextBox(this);
    localTextBox.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localTextBox);
    if (!g()) {
      this.c.getTextBoxes().a(localTextBox);
    }
    return localTextBox;
  }
  
  Spinner c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (g()) {
      return null;
    }
    Spinner localSpinner = new Spinner(this);
    localSpinner.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localSpinner);
    return localSpinner;
  }
  
  ScrollBar d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (g()) {
      return null;
    }
    ScrollBar localScrollBar = new ScrollBar(this);
    localScrollBar.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localScrollBar);
    return localScrollBar;
  }
  
  RadioButton e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    RadioButton localRadioButton = new RadioButton(this);
    localRadioButton.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localRadioButton);
    return localRadioButton;
  }
  
  ListBox f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    ListBox localListBox = new ListBox(this);
    localListBox.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localListBox);
    return localListBox;
  }
  
  ComboBox g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    ComboBox localComboBox = new ComboBox(this);
    localComboBox.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localComboBox);
    return localComboBox;
  }
  
  GroupBox h(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    throws Exception
  {
    GroupBox localGroupBox = new GroupBox(this);
    localGroupBox.R().i().a(1);
    localGroupBox.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    localGroupBox.getTextBody().c().setSize(8);
    localGroupBox.getTextBody().c().a("Tahoma", false, 0);
    localGroupBox.getTextBody().getTextAlignment().c(true);
    c(localGroupBox);
    return localGroupBox;
  }
  
  Button i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    Button localButton = new Button(this);
    localButton.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localButton);
    return localButton;
  }
  
  Label j(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    Label localLabel = new Label(this);
    localLabel.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localLabel);
    return localLabel;
  }
  
  public Label addLabelInChart(int top, int left, int height, int width)
  {
    if (!g()) {
      return null;
    }
    Label localLabel = new Label(this);
    c(localLabel);
    localLabel.a(2, left, top, width, height);
    return localLabel;
  }
  
  public TextBox addTextBoxInChart(int top, int left, int height, int width)
  {
    if (!g()) {
      return null;
    }
    TextBox localTextBox = new TextBox(this);
    c(localTextBox);
    localTextBox.a(2, left, top, width, height);
    return localTextBox;
  }
  
  public Shape addTextEffectInChart(int effect, String text, String fontName, int size, boolean fontBold, boolean fontItalic, int top, int left, int height, int width)
  {
    if (!g()) {
      return null;
    }
    CellsDrawing localCellsDrawing = new CellsDrawing(this);
    c(localCellsDrawing);
    localCellsDrawing.a(2, left, top, width, height);
    TextEffectFormat localTextEffectFormat = new TextEffectFormat(localCellsDrawing);
    localTextEffectFormat.setTextEffect(effect);
    localTextEffectFormat.setText(text);
    localTextEffectFormat.setFontName(fontName);
    localTextEffectFormat.setFontSize(size);
    localTextEffectFormat.setFontBold(fontBold);
    localTextEffectFormat.setFontItalic(fontItalic);
    return localCellsDrawing;
  }
  
  public Shape addTextEffect(int effect, String text, String fontName, int size, boolean fontBold, boolean fontItalic, int upperLeftRow, int top, int upperLeftColumn, int left, int height, int width)
  {
    CellsDrawing localCellsDrawing = new CellsDrawing(this);
    localCellsDrawing.f(true);
    localCellsDrawing.a(upperLeftRow, top, upperLeftColumn, left, height, width);
    TextEffectFormat localTextEffectFormat = new TextEffectFormat(localCellsDrawing);
    localTextEffectFormat.setTextEffect(effect);
    localTextEffectFormat.setText(text);
    localTextEffectFormat.setFontName(fontName);
    localTextEffectFormat.setFontSize(size);
    localTextEffectFormat.setFontBold(fontBold);
    localTextEffectFormat.setFontItalic(fontItalic);
    c(localCellsDrawing);
    return localCellsDrawing;
  }
  
  public Shape addWordArt(int style, String text, int upperLeftRow, int top, int upperLeftColumn, int left, int height, int width)
    throws Exception
  {
    RectangleShape localRectangleShape = new RectangleShape(this);
    localRectangleShape.a(upperLeftRow, top, upperLeftColumn, left, height, width);
    localRectangleShape.p = null;
    localRectangleShape.getFill().setFillType(1);
    localRectangleShape.setText(text);
    zalg.a(style, localRectangleShape.getTextBody(), localRectangleShape.getTextBody().get(1).getTextOptions(), false);
    c(localRectangleShape);
    return localRectangleShape;
  }
  
  RectangleShape k(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    RectangleShape localRectangleShape = new RectangleShape(this);
    localRectangleShape.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localRectangleShape);
    return localRectangleShape;
  }
  
  Oval l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    Oval localOval = new Oval(this);
    localOval.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localOval);
    return localOval;
  }
  
  LineShape m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    LineShape localLineShape = new LineShape(this);
    localLineShape.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localLineShape);
    return localLineShape;
  }
  
  public Shape addFreeFloatingShape(int type, int top, int left, int height, int width, byte[] imageData, boolean isOriginalSize)
  {
    Object localObject = null;
    switch (type)
    {
    case 1: 
      localObject = new LineShape(this);
      c((Shape)localObject);
      break;
    case 8: 
      Picture localPicture = new Picture(this);
      localObject = localPicture;
      if (imageData != null)
      {
        localPicture.a(a(localPicture, imageData));
        zcf localzcf = localPicture.a();
        if ((isOriginalSize) && (localzcf != null))
        {
          width = localzcf.k();
          height = localzcf.l();
        }
      }
      else
      {
        c((Shape)localObject);
      }
      this.c.getPictures().a(localPicture);
      break;
    }
    if (localObject != null) {
      ((Shape)localObject).a(0, false, left, top, width, height);
    }
    return (Shape)localObject;
  }
  
  public Shape addShapeInChart(int type, int placement, int left, int top, int right, int bottom, byte[] imageData)
  {
    Object localObject = null;
    switch (type)
    {
    case 1: 
      localObject = new LineShape(this);
      c((Shape)localObject);
      break;
    case 6: 
      localObject = new TextBox(this);
      c((Shape)localObject);
      break;
    case 4: 
      localObject = new ArcShape(this);
      c((Shape)localObject);
      break;
    case 7: 
      localObject = new Button(this);
      c((Shape)localObject);
      break;
    case 11: 
      localObject = new CheckBox(this);
      c((Shape)localObject);
      break;
    case 20: 
      localObject = new ComboBox(this);
      c((Shape)localObject);
      break;
    case 19: 
      localObject = new GroupBox(this);
      c((Shape)localObject);
      break;
    case 18: 
      localObject = new ListBox(this);
      c((Shape)localObject);
      break;
    case 14: 
      localObject = new Label(this);
      c((Shape)localObject);
      break;
    case 3: 
      localObject = new Oval(this);
      c((Shape)localObject);
      break;
    case 12: 
      localObject = new RadioButton(this);
      c((Shape)localObject);
      break;
    case 2: 
      localObject = new RectangleShape(this);
      c((Shape)localObject);
      break;
    case 17: 
      localObject = new ScrollBar(this);
      c((Shape)localObject);
      break;
    case 16: 
      localObject = new Spinner(this);
      c((Shape)localObject);
      break;
    case 24: 
      OleObject localOleObject = new OleObject(this);
      localObject = localOleObject;
      localOleObject.a(a((Shape)localObject, imageData));
      break;
    case 8: 
      Picture localPicture = new Picture(this);
      localObject = localPicture;
      if (imageData != null) {
        localPicture.a(a(localPicture, imageData));
      } else {
        c((Shape)localObject);
      }
      break;
    case 0: 
      GroupShape localGroupShape = new GroupShape(this);
      localObject = localGroupShape;
      c((Shape)localObject);
      break;
    case 29: 
      localObject = new Shape(this, 29, this);
      c((Shape)localObject);
      break;
    }
    if (localObject != null) {
      ((Shape)localObject).a(placement, left, top, right - left, bottom - top);
    }
    return (Shape)localObject;
  }
  
  public Shape addShapeInChart(int type, int placement, int left, int top, int right, int bottom)
  {
    return addShapeInChart(type, placement, left, top, right, bottom, null);
  }
  
  ArcShape n(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    ArcShape localArcShape = new ArcShape(this);
    localArcShape.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    c(localArcShape);
    return localArcShape;
  }
  
  public Shape addShape(int type, int upperLeftRow, int top, int upperLeftColumn, int left, int height, int width)
    throws Exception
  {
    switch (type)
    {
    case 1: 
      return m(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 2: 
      return k(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 4: 
      return n(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 3: 
      return l(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 7: 
      return i(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 11: 
      return a(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 20: 
      return g(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 19: 
      return h(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 14: 
      return j(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 18: 
      return f(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 12: 
      return e(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 17: 
      return d(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 16: 
      return c(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 6: 
      return b(upperLeftRow, top, upperLeftColumn, left, height, width);
    }
    CellsDrawing localCellsDrawing = new CellsDrawing(this);
    localCellsDrawing.a(upperLeftRow, top, upperLeftColumn, left, height, width);
    c(localCellsDrawing);
    return localCellsDrawing;
  }
  
  public Shape addAutoShape(int type, int upperLeftRow, int top, int upperLeftColumn, int left, int height, int width)
  {
    switch (type)
    {
    case 1: 
      return k(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 19: 
      return n(upperLeftRow, top, upperLeftColumn, left, height, width);
    case 3: 
      return l(upperLeftRow, top, upperLeftColumn, left, height, width);
    }
    CellsDrawing localCellsDrawing = new CellsDrawing(this, type);
    localCellsDrawing.a(upperLeftRow, top, upperLeftColumn, left, height, width);
    c(localCellsDrawing);
    return localCellsDrawing;
  }
  
  public Shape addAutoShapeInChart(int type, int top, int left, int height, int width)
  {
    if (!g()) {
      return null;
    }
    Object localObject = null;
    switch (type)
    {
    case 1: 
      localObject = new RectangleShape(this);
      break;
    case 19: 
      localObject = new ArcShape(this);
      break;
    case 3: 
      localObject = new Oval(this);
      break;
    default: 
      localObject = new CellsDrawing(this, type);
    }
    ((Shape)localObject).a(2, left, top, width, height);
    c((Shape)localObject);
    return (Shape)localObject;
  }
  
  public Shape addActiveXControl(int type, int topRow, int top, int leftColumn, int left, int width, int height)
    throws Exception
  {
    Picture localPicture = new Picture(this);
    byte[] arrayOfByte = null;
    zh localzh = new zh();
    try
    {
      localzd = new zd(width, height);
      localzd.a(localzh, 5);
      localzh.b();
      arrayOfByte = localzh.o();
    }
    finally
    {
      if (localzh != null) {
        localzh.a();
      }
    }
    localPicture.a(a(localPicture, arrayOfByte));
    localPicture.a(topRow, top, leftColumn, left, height, width);
    this.c.getPictures().a(localPicture);
    localPicture.z = new zqn(true);
    zd localzd = null;
    localPicture.z.l = ActiveXControlBase.a(type, localzd, localPicture);
    localPicture.z.a = localPicture.A();
    localPicture.z.l.b();
    return localPicture;
  }
  
  public Picture addPicture(int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn, InputStream stream)
  {
    zh localzh = null;
    if (stream != null) {
      localzh = zx.a(stream);
    }
    return a(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, localzh);
  }
  
  Picture a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, zm paramzm)
  {
    if (g()) {
      return null;
    }
    zamm.a(paramInt1, paramInt2, paramInt3, paramInt4);
    Picture localPicture = new Picture(this);
    localPicture.a(a(localPicture, zx.a(paramzm, false)));
    localPicture.moveToRange(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c.getPictures().a(localPicture);
    return localPicture;
  }
  
  public Picture addPicture(int upperLeftRow, int upperLeftColumn, InputStream stream, int widthScale, int heightScale)
  {
    zh localzh = null;
    if (stream != null) {
      localzh = zx.a(stream);
    }
    return a(upperLeftRow, upperLeftColumn, localzh, widthScale, heightScale);
  }
  
  Picture a(int paramInt1, int paramInt2, zm paramzm, int paramInt3, int paramInt4)
  {
    if ((paramInt3 <= 0) || (paramInt4 <= 0)) {
      throw new CellsException(6, "Scale of image should be larger than 0.");
    }
    zamm.a(paramInt1, paramInt2);
    Picture localPicture = new Picture(this);
    localPicture.a(a(localPicture, zx.a(paramzm, false)));
    zcf localzcf = localPicture.a();
    int i = 0;
    int j = 0;
    if (localzcf != null)
    {
      i = (int)(localzcf.k() * paramInt3 / 100.0F + 0.5D);
      j = (int)(localzcf.l() * paramInt4 / 100.0F + 0.5D);
    }
    localPicture.a(paramInt1, 0, paramInt2, 0, j, i);
    this.c.getPictures().a(localPicture);
    return localPicture;
  }
  
  public Picture addLinkedPicture(int upperLeftRow, int upperLeftColumn, int height, int width, String sourceFullName)
  {
    Picture localPicture = new Picture(this);
    c(localPicture);
    localPicture.setSourceFullName(sourceFullName);
    localPicture.a(upperLeftRow, 0, upperLeftColumn, 0, height, width);
    this.c.getPictures().a(localPicture);
    return localPicture;
  }
  
  public OleObject addOleObjectWithLinkedImage(int upperLeftRow, int upperLeftColumn, int height, int width, String sourceFullName)
  {
    OleObject localOleObject = new OleObject(this);
    c(localOleObject);
    localOleObject.setImageSourceFullName(sourceFullName);
    j().d += 1;
    localOleObject.f(j().d);
    localOleObject.a(upperLeftRow, 0, upperLeftColumn, 0, height, width);
    this.c.getOleObjects().a(localOleObject);
    return localOleObject;
  }
  
  public Picture addPictureInChart(int top, int left, InputStream stream, int widthScale, int heightScale)
  {
    zh localzh = null;
    if (stream != null) {
      localzh = zx.a(stream);
    }
    return b(top, left, localzh, widthScale, heightScale);
  }
  
  Picture b(int paramInt1, int paramInt2, zm paramzm, int paramInt3, int paramInt4)
  {
    if (!g()) {
      return null;
    }
    if ((paramInt3 <= 0) || (paramInt4 <= 0)) {
      throw new CellsException(6, "Scale of image should be larger than 0.");
    }
    Picture localPicture = new Picture(this);
    localPicture.a(a(localPicture, zx.a(paramzm, false)));
    zcf localzcf = localPicture.a();
    int i = 0;
    int j = 0;
    if (localzcf != null)
    {
      i = (int)(localzcf.k() * paramInt3 / 100.0F + 0.5D);
      j = (int)(localzcf.l() * paramInt4 / 100.0F + 0.5D);
    }
    Chart localChart = (Chart)this.d;
    i = (int)(i * 4000.0F / localChart.getChartObject().getWidth() + 0.5D);
    j = (int)(j * 4000.0F / localChart.getChartObject().getHeight() + 0.5D);
    if (i + paramInt2 > 4000) {
      i = 4000 - paramInt2;
    }
    if (j + paramInt1 > 4000) {
      j = 4000 - paramInt1;
    }
    localPicture.a(2, paramInt2, paramInt1, i, j);
    return localPicture;
  }
  
  public OleObject addOleObject(int upperLeftRow, int top, int upperLeftColumn, int left, int height, int width, byte[] imageData)
  {
    if (g()) {
      return null;
    }
    zamm.a(upperLeftRow, upperLeftColumn);
    OleObject localOleObject = new OleObject(this);
    if (imageData != null)
    {
      localOleObject.a(a(localOleObject, imageData));
      localOleObject.R().i().a(1);
      localOleObject.a(upperLeftRow, top, upperLeftColumn, left, height, width);
    }
    else
    {
      a(localOleObject, null);
    }
    j().d += 1;
    localOleObject.f(j().d);
    this.c.getOleObjects().a(localOleObject);
    return localOleObject;
  }
  
  int f()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    this.e = (paramInt & 0xFFFF);
  }
  
  public void copyCommentsInRange(ShapeCollection shapes, CellArea ca, int destRow, int destColumn)
  {
    int i = shapes.getCount();
    CommentShape localCommentShape = null;
    CopyOptions localCopyOptions = new CopyOptions(2, shapes.k(), k());
    for (int j = 0; j < i; j++)
    {
      Shape localShape = shapes.get(j);
      if ((!localShape.W()) && (localShape.getMsoDrawingType() == 25))
      {
        Comment localComment1 = ((CommentShape)localShape).a();
        if ((localComment1.getRow() >= ca.StartRow) && (localComment1.getRow() <= ca.EndRow) && (localComment1.getColumn() >= ca.StartColumn) && (localComment1.getColumn() <= ca.EndColumn))
        {
          Comment localComment2 = new Comment(k().getComments(), destRow, localComment1.getColumn());
          localComment2.getCommentShape().a((CommentShape)localShape, localCopyOptions);
          localCommentShape = localComment2.getCommentShape();
          c(localComment2.getCommentShape());
          k().getComments().a(localComment2);
          int k = 1;
          if (destRow != 0) {
            k = localCommentShape.c(0, 0, destRow - 1, 105);
          }
          localCommentShape.setTopToCorner(k);
        }
      }
    }
  }
  
  public void copyInRange(ShapeCollection sourceShapes, CellArea ca, int destRow, int destColumn, boolean isContained)
    throws Exception
  {
    int i = sourceShapes.getCount();
    int j = 0;
    int k = 0;
    CopyOptions localCopyOptions = new CopyOptions(2, sourceShapes.k(), k());
    for (int m = 0; m < i; m++)
    {
      k = 0;
      Shape localShape1 = sourceShapes.get(m);
      if ((!localShape1.W()) && (localShape1.getMsoDrawingType() != 25))
      {
        int n = localShape1.getUpperLeftRow();
        int i1 = localShape1.getUpperLeftColumn();
        int i2 = localShape1.getLowerDeltaY() == 0 ? localShape1.getLowerRightRow() - 1 : localShape1.getLowerRightRow();
        int i3 = localShape1.getLowerDeltaX() == 0 ? localShape1.getLowerRightColumn() - 1 : localShape1.getLowerRightColumn();
        if (isContained)
        {
          if ((n >= ca.StartRow) && (i1 >= ca.StartColumn) && (i2 <= ca.EndRow) && (i3 <= ca.EndColumn)) {
            k = 1;
          }
        }
        else if ((n >= ca.StartRow - 1) && (i1 >= ca.StartColumn - 1) && (n <= ca.EndRow) && (i1 <= ca.EndColumn) && (i2 >= ca.StartRow) && (i3 >= ca.StartColumn) && (i2 <= ca.EndRow + 1) && (i3 <= ca.EndColumn + 1)) {
          k = 1;
        }
        if (k != 0)
        {
          j = getCount();
          a(localShape1, null, localCopyOptions);
          Shape localShape2 = get(j);
          int i4 = localShape2.getPlacement();
          localShape2.setPlacement(1);
          localShape2.setUpperLeftRow(localShape2.getUpperLeftRow() - ca.StartRow + destRow);
          localShape2.setUpperLeftColumn(localShape2.getUpperLeftColumn() - ca.StartColumn + destColumn);
          localShape2.setPlacement(i4);
        }
      }
    }
  }
  
  public void deleteInRange(CellArea ca)
  {
    int i = getCount();
    int j = 1;
    for (int k = 0; k < i; k++)
    {
      Shape localShape = get(k);
      if ((!localShape.W()) && (localShape.getMsoDrawingType() != 25) && (localShape.getUpperLeftRow() >= ca.StartRow) && (localShape.getUpperLeftColumn() >= ca.StartColumn))
      {
        int m = localShape.getLowerDeltaY() == 0 ? localShape.getLowerRightRow() - 1 : localShape.getLowerRightRow();
        int n = localShape.getLowerDeltaX() == 0 ? localShape.getLowerRightColumn() - 1 : localShape.getLowerRightColumn();
        if ((m <= ca.EndRow) && (n <= ca.EndColumn))
        {
          j = localShape.y();
          b(localShape);
          k -= j;
          i -= j;
          if (k < -1) {
            k = -1;
          }
        }
      }
    }
  }
  
  public void deleteShape(Shape shape)
  {
    if ((shape.W()) || (shape.getMsoDrawingType() == 25)) {
      return;
    }
    b(shape);
  }
  
  void a(ShapeCollection paramShapeCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    if ((paramInt1 == paramInt2) && (paramShapeCollection == this)) {
      return;
    }
    k().getComments().a(paramShapeCollection.k().getComments(), paramInt1, paramInt2, paramInt3);
    k().getCharts().a(paramShapeCollection.k().getCharts(), paramInt1, paramInt2, paramInt3);
  }
  
  void b(ShapeCollection paramShapeCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
    throws Exception
  {
    if ((paramInt1 == paramInt2) && (paramShapeCollection == this)) {
      return;
    }
    int i = paramInt1;
    int j = paramInt1 + paramInt3 - 1;
    int k = paramInt2 - paramInt1;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    Shape localShape1 = null;
    int i3 = paramShapeCollection.getCount();
    for (int i4 = 0; i4 < i3; i4++)
    {
      Shape localShape2 = paramShapeCollection.get(i4);
      if ((localShape2.getWidth() >= Double.MIN_VALUE) && (localShape2.getHeight() >= Double.MIN_VALUE) && (!localShape2.W())) {
        if (localShape2.getMsoDrawingType() == 25)
        {
          CommentShape localCommentShape = (CommentShape)localShape2;
          Comment localComment1 = localCommentShape.a();
          if ((localComment1.getRow() >= paramInt1) && (localComment1.getRow() < paramInt1 + paramInt3))
          {
            int i5 = k().getComments().add(paramInt2 + localComment1.getRow() - paramInt1, localComment1.getColumn());
            Comment localComment2 = k().getComments().get(i5);
            localComment2.a(localComment1, paramCopyOptions);
            localComment2.getCommentShape().setWidth(localCommentShape.getWidth());
            localComment2.getCommentShape().setHeight(localCommentShape.getHeight());
          }
        }
        else if (localShape2.getPlacement() != 0)
        {
          m = localShape2.getUpperLeftRow();
          n = localShape2.getLowerRightRow();
          i1 = localShape2.getUpperDeltaY() == zkx.b ? m + 1 : m;
          i2 = localShape2.getLowerDeltaY() == 0 ? n - 1 : n;
          if ((i1 >= i) && (i2 <= j))
          {
            localShape1 = a(localShape2, null, paramCopyOptions);
            switch (localShape1.getPlacement())
            {
            case 1: 
              localShape1.R().i().b(m + k);
              break;
            case 2: 
              localShape1.R().i().b(m + k);
              localShape1.R().i().f(n + k);
            }
          }
        }
      }
    }
  }
  
  void a(ShapeCollection paramShapeCollection, CellArea paramCellArea1, CellArea paramCellArea2, CopyOptions paramCopyOptions)
    throws Exception
  {
    int i = paramShapeCollection.getCount();
    for (int j = 0; j < i; j++)
    {
      Shape localShape1 = paramShapeCollection.get(j);
      if ((!localShape1.W()) && (localShape1.getMsoDrawingType() != 25))
      {
        int k = localShape1.getPlacement();
        localShape1.setPlacement(2);
        int m = localShape1.getUpperDeltaX() == zkx.a ? localShape1.getUpperLeftColumn() + 1 : localShape1.getUpperLeftColumn();
        int n = localShape1.getLowerDeltaX() == 0 ? localShape1.getLowerRightColumn() - 1 : localShape1.getLowerRightColumn();
        int i1 = localShape1.getUpperDeltaY() == zkx.b ? localShape1.getUpperLeftRow() + 1 : localShape1.getUpperLeftRow();
        int i2 = localShape1.getLowerDeltaY() == 0 ? localShape1.getLowerRightRow() - 1 : localShape1.getLowerRightRow();
        int i3 = paramCellArea2.StartRow - paramCellArea1.StartRow;
        int i4 = paramCellArea2.StartColumn - paramCellArea1.StartColumn;
        if ((m >= paramCellArea1.StartColumn) && (n <= paramCellArea1.EndColumn) && (i1 >= paramCellArea1.StartRow) && (i2 <= paramCellArea1.EndRow))
        {
          localShape1.setPlacement(1);
          Shape localShape2 = a(localShape1, null, paramCopyOptions);
          localShape2.R().i().b(localShape2.R().i().f() + i3);
          localShape2.R().i().d(localShape2.R().i().i() + i4);
          localShape2.setPlacement(k);
        }
        localShape1.setPlacement(k);
      }
    }
  }
  
  void a(ShapeCollection paramShapeCollection, CopyOptions paramCopyOptions)
    throws Exception
  {
    int i = getCount();
    int j = 0;
    if (i == 0)
    {
      j = (paramCopyOptions.a()) || ((this.b == paramShapeCollection.b) && (g() == paramShapeCollection.g())) ? 1 : 0;
      if (j != 0) {
        this.g = paramShapeCollection.g;
      }
    }
    this.a = paramShapeCollection.a;
    Iterator localIterator = paramShapeCollection.iterator();
    while (localIterator.hasNext())
    {
      Shape localShape1 = (Shape)localIterator.next();
      if (!localShape1.W()) {
        if (localShape1.getMsoDrawingType() == 29)
        {
          if ((j != 0) && (localShape1.h != null) && (!localShape1.h.j))
          {
            Shape localShape2;
            if (localShape1.T()) {
              localShape2 = addShapeInChart(29, 1, 0, 0, 0, 0);
            } else {
              localShape2 = addShape(29, 0, 0, 0, 0, 0, 0);
            }
            localShape2.h = new zqu();
            localShape2.h.f = localShape1.h.f;
            localShape2.h.h = localShape1.h.h;
          }
        }
        else {
          a(localShape1, null, paramCopyOptions);
        }
      }
    }
  }
  
  Shape a(Shape paramShape, GroupShape paramGroupShape, CopyOptions paramCopyOptions)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject3;
    switch (paramShape.getMsoDrawingType())
    {
    case 5: 
      Chart localChart = new Chart(this.c);
      localChart.getChartObject().a((ChartShape)paramShape, paramCopyOptions);
      localObject1 = localChart.getChartObject();
      c(localChart.getChartObject());
      if (!g()) {
        this.b.get(this.c.getIndex()).getCharts().a(localChart);
      }
      break;
    case 25: 
      Comment localComment1 = ((CommentShape)paramShape).a();
      Comment localComment2 = new Comment(k().getComments(), localComment1.getRow(), localComment1.getColumn());
      localComment2.getCommentShape().a((CommentShape)paramShape, paramCopyOptions);
      localObject1 = localComment2.getCommentShape();
      c(localComment2.getCommentShape());
      if (!g()) {
        this.b.get(this.c.getIndex()).getComments().a(localComment2);
      }
      break;
    case 6: 
      TextBox localTextBox1 = (TextBox)paramShape;
      TextBox localTextBox2 = new TextBox(this);
      localObject1 = localTextBox2;
      c(localTextBox2);
      localTextBox2.a(localTextBox1, paramCopyOptions);
      if (!g()) {
        this.b.get(this.c.getIndex()).getTextBoxes().a(localTextBox2);
      }
      break;
    case 11: 
      CheckBox localCheckBox1 = (CheckBox)paramShape;
      CheckBox localCheckBox2 = new CheckBox(this);
      localObject1 = localCheckBox2;
      c(localCheckBox2);
      localCheckBox2.a(localCheckBox1, paramCopyOptions);
      this.b.get(this.c.getIndex()).getCheckBoxes().a(localCheckBox2);
      break;
    case 12: 
      RadioButton localRadioButton1 = (RadioButton)paramShape;
      RadioButton localRadioButton2 = new RadioButton(this);
      localObject1 = localRadioButton2;
      c(localRadioButton2);
      localRadioButton2.a(localRadioButton1, paramCopyOptions);
      break;
    case 7: 
      Button localButton1 = (Button)paramShape;
      Button localButton2 = new Button(this);
      localObject1 = localButton2;
      c(localButton2);
      localButton2.a(localButton1, paramCopyOptions);
      break;
    case 19: 
      GroupBox localGroupBox1 = (GroupBox)paramShape;
      GroupBox localGroupBox2 = new GroupBox(this);
      localObject1 = localGroupBox2;
      c(localGroupBox2);
      localGroupBox2.a(localGroupBox1, paramCopyOptions);
      break;
    case 14: 
      Label localLabel1 = (Label)paramShape;
      Label localLabel2 = new Label(this);
      localObject1 = localLabel2;
      c(localLabel2);
      localLabel2.a(localLabel1, paramCopyOptions);
      break;
    case 20: 
      ComboBox localComboBox1 = (ComboBox)paramShape;
      ComboBox localComboBox2 = new ComboBox(this);
      localObject1 = localComboBox2;
      c(localComboBox2);
      localComboBox2.a(localComboBox1, paramCopyOptions);
      break;
    case 18: 
      ListBox localListBox1 = (ListBox)paramShape;
      ListBox localListBox2 = new ListBox(this);
      localObject1 = localListBox2;
      c(localListBox2);
      localListBox2.a(localListBox1, paramCopyOptions);
      break;
    case 17: 
      ScrollBar localScrollBar1 = (ScrollBar)paramShape;
      ScrollBar localScrollBar2 = new ScrollBar(this);
      localObject1 = localScrollBar2;
      c(localScrollBar2);
      localScrollBar2.a(localScrollBar1, paramCopyOptions);
      break;
    case 16: 
      Spinner localSpinner1 = (Spinner)paramShape;
      Spinner localSpinner2 = new Spinner(this);
      localObject1 = localSpinner2;
      c(localSpinner2);
      localSpinner2.a(localSpinner1, paramCopyOptions);
      break;
    case 0: 
      GroupShape localGroupShape1 = (GroupShape)paramShape;
      GroupShape localGroupShape2 = new GroupShape(this);
      localObject1 = localGroupShape2;
      c(localGroupShape2);
      localGroupShape2.a(localGroupShape1, paramCopyOptions);
      Shape[] arrayOfShape = localGroupShape1.getGroupedShapes();
      if ((arrayOfShape != null) && (arrayOfShape.length != 0)) {
        for (localObject3 : arrayOfShape) {
          a((Shape)localObject3, localGroupShape2, paramCopyOptions);
        }
      } else {
        localGroupShape2.e();
      }
      break;
    case 8: 
      ??? = (Picture)paramShape;
      Picture localPicture = new Picture(this);
      c(localPicture);
      localObject1 = localPicture;
      localPicture.copy((Picture)???, paramCopyOptions);
      if (!g()) {
        this.b.get(this.c.getIndex()).getPictures().a(localPicture);
      }
      break;
    case 24: 
      OleObject localOleObject = (OleObject)paramShape;
      localObject3 = new OleObject(this);
      localObject1 = localObject3;
      ((OleObject)localObject3).a(localOleObject, paramCopyOptions);
      c((Shape)localObject3);
      if (!g()) {
        this.b.get(this.c.getIndex()).getOleObjects().a((OleObject)localObject3);
      }
      break;
    case 4: 
      ArcShape localArcShape1 = (ArcShape)paramShape;
      ArcShape localArcShape2 = new ArcShape(this);
      localObject1 = localArcShape2;
      localArcShape2.a(localArcShape1, paramCopyOptions);
      c(localArcShape2);
      break;
    case 1: 
      LineShape localLineShape1 = (LineShape)paramShape;
      LineShape localLineShape2 = new LineShape(this);
      localObject1 = localLineShape2;
      localLineShape2.a(localLineShape1, paramCopyOptions);
      c(localLineShape2);
      break;
    case 3: 
      Oval localOval1 = (Oval)paramShape;
      Oval localOval2 = new Oval(this);
      localObject1 = localOval2;
      localOval2.a(localOval1, paramCopyOptions);
      c(localOval2);
      break;
    case 9: 
      zaxm localzaxm1 = (zaxm)paramShape;
      zaxm localzaxm2 = new zaxm(this);
      localObject1 = localzaxm2;
      localzaxm2.a(localzaxm1, paramCopyOptions);
      c(localzaxm2);
      break;
    case 2: 
      RectangleShape localRectangleShape1 = (RectangleShape)paramShape;
      RectangleShape localRectangleShape2 = new RectangleShape(this);
      localObject1 = localRectangleShape2;
      localRectangleShape2.a(localRectangleShape1, paramCopyOptions);
      c(localRectangleShape2);
      break;
    case 30: 
      CellsDrawing localCellsDrawing1 = (CellsDrawing)paramShape;
      CellsDrawing localCellsDrawing2 = new CellsDrawing(this);
      localObject1 = localCellsDrawing2;
      localCellsDrawing2.a(localCellsDrawing1, paramCopyOptions);
      c(localCellsDrawing2);
      break;
    case 10: 
    case 13: 
    case 15: 
    case 21: 
    case 22: 
    case 23: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    default: 
      localObject1 = new Shape(this, paramShape.getMsoDrawingType(), this);
      ((Shape)localObject1).a(paramShape, paramCopyOptions);
      c((Shape)localObject1);
    }
    if ((j() != paramShape.P()) && (((Shape)localObject1).S() != null) && (!paramCopyOptions.a())) {
      ((Shape)localObject1).S().a = null;
    }
    if ((j() != paramShape.P()) && (paramCopyOptions.a()) && (paramShape.O() != ((Shape)localObject1).O()))
    {
      ((Shape)localObject1).g(paramShape.O());
      if (this.e < ((Shape)localObject1).O()) {
        this.e = ((Shape)localObject1).O();
      }
    }
    if (paramGroupShape != null) {
      paramGroupShape.a((Shape)localObject1);
    }
    return (Shape)localObject1;
  }
  
  public GroupShape group(Shape[] groupItems)
  {
    if (h()) {
      return null;
    }
    GroupShape localGroupShape = new GroupShape(this);
    c(localGroupShape);
    int[][] arrayOfInt = new int[groupItems.length][];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    for (int n = 0; n < groupItems.length; n++)
    {
      if (groupItems[n].N() != this) {
        throw new CellsException(10, "Please add the shape to here.");
      }
      if (groupItems[n].isGroup()) {
        throw new CellsException(10, "Please ungroup the shape before grouping shapes");
      }
      if (groupItems[n].S().e()) {
        throw new CellsException(10, "Could not be grouped.");
      }
      groupItems[n].R().j().b(true);
      int[] arrayOfInt1 = new int[4];
      if (g())
      {
        arrayOfInt1 = groupItems[n].c(false);
        switch (groupItems[0].getPlacement())
        {
        case 1: 
          Chart localChart = (Chart)groupItems[n].N().i();
          arrayOfInt1[2] = ((int)(arrayOfInt1[2] * 4000.0F / localChart.getChartObject().getWidth() + 0.5D));
          arrayOfInt1[3] = ((int)(arrayOfInt1[3] * 4000.0F / localChart.getChartObject().getHeight() + 0.5D));
        }
      }
      else
      {
        arrayOfInt1 = groupItems[n].c(true);
      }
      arrayOfInt[n] = arrayOfInt1;
      if (n == 0)
      {
        i = arrayOfInt1[0];
        j = arrayOfInt1[1];
        k = arrayOfInt1[2] + arrayOfInt1[0];
        m = arrayOfInt1[3] + arrayOfInt1[1];
      }
      else
      {
        if (i > arrayOfInt1[0]) {
          i = arrayOfInt1[0];
        }
        if (j > arrayOfInt1[1]) {
          j = arrayOfInt1[1];
        }
        if (k < arrayOfInt1[0] + arrayOfInt1[2]) {
          k = arrayOfInt1[0] + arrayOfInt1[2];
        }
        if (m < arrayOfInt1[1] + arrayOfInt1[3]) {
          m = arrayOfInt1[1] + arrayOfInt1[3];
        }
      }
    }
    n = k - i;
    int i1 = m - j;
    localGroupShape.a(0, false, i, j, n, i1);
    localGroupShape.a().a = i;
    localGroupShape.a().c = j;
    localGroupShape.a().b = n;
    localGroupShape.a().d = i1;
    if (!g()) {
      localGroupShape.setPlacement(2);
    }
    for (int i2 = 0; i2 < groupItems.length; i2++)
    {
      int[] arrayOfInt2 = arrayOfInt[i2];
      groupItems[i2].a(0, false, (int)((arrayOfInt2[0] - i) * 4000.0F / n + 0.5D), (int)((arrayOfInt2[1] - j) * 4000.0F / i1 + 0.5D), (int)(arrayOfInt2[2] * 4000.0F / n + 0.5D), (int)(arrayOfInt2[3] * 4000.0F / i1 + 0.5D));
      localGroupShape.a(groupItems[i2]);
    }
    return localGroupShape;
  }
  
  void a(GroupShape paramGroupShape, Shape[] paramArrayOfShape)
  {
    for (int i = 0; i < paramArrayOfShape.length; i++) {
      paramArrayOfShape[i].R().j().b(true);
    }
    i = paramGroupShape.a().a;
    int j = paramGroupShape.a().c;
    int k = paramGroupShape.a().b;
    int m = paramGroupShape.a().d;
    for (int n = 0; n < paramArrayOfShape.length; n++)
    {
      int[] arrayOfInt = paramArrayOfShape[n].K();
      paramArrayOfShape[n].a(0, false, (int)(arrayOfInt[0] / k * 4000.0D + 0.5D), (int)(arrayOfInt[1] / m * 4000.0D + 0.5D), (int)(arrayOfInt[2] / k * 4000.0D + 0.5D), (int)(arrayOfInt[3] / m * 4000.0D + 0.5D));
      paramGroupShape.a(paramArrayOfShape[n]);
    }
  }
  
  public void ungroup(GroupShape group)
  {
    if (!group.isGroup()) {
      return;
    }
    if (group.W()) {
      return;
    }
    Shape[] arrayOfShape = group.getGroupedShapes();
    int j;
    int k;
    int m;
    Object localObject;
    int[] arrayOfInt4;
    if (g())
    {
      int i = 0;
      j = 0;
      k = 0;
      m = 0;
      int[] arrayOfInt2 = { i };
      int[] arrayOfInt3 = { j };
      localObject = new int[] { k };
      arrayOfInt4 = new int[] { m };
      group.a(arrayOfInt2, arrayOfInt3, (int[])localObject, arrayOfInt4);
      i = arrayOfInt2[0];
      j = arrayOfInt3[0];
      k = localObject[0];
      m = arrayOfInt4[0];
      for (int i2 = 0; i2 < arrayOfShape.length; i2++)
      {
        Shape localShape = arrayOfShape[i2];
        localShape.n = group.n;
        localShape.R().j().b(false);
        int[] arrayOfInt5 = localShape.c(false);
        arrayOfInt5[0] = ((int)(k * arrayOfInt5[0] / 4000.0F + 0.5D + i));
        arrayOfInt5[1] = ((int)(m * arrayOfInt5[1] / 4000.0F + 0.5D + j));
        arrayOfInt5[2] = ((int)(k * arrayOfInt5[2] / 4000.0F + 0.5D + arrayOfInt5[0]));
        arrayOfInt5[3] = ((int)(m * arrayOfInt5[3] / 4000.0F + 0.5D + arrayOfInt5[1]));
        localShape.a(0, true, arrayOfInt5[0], arrayOfInt5[1], arrayOfInt5[2], arrayOfInt5[3]);
      }
    }
    else
    {
      int[] arrayOfInt1 = group.c(true);
      j = arrayOfInt1[0];
      k = arrayOfInt1[1];
      m = arrayOfInt1[2];
      int n = arrayOfInt1[3];
      for (int i1 = 0; i1 < arrayOfShape.length; i1++)
      {
        localObject = arrayOfShape[i1];
        ((Shape)localObject).R().j().b(false);
        ((Shape)localObject).n = group.n;
        arrayOfInt4 = arrayOfShape[i1].c(false);
        arrayOfInt4[0] = ((int)(m * arrayOfInt4[0] / 4000.0F + j + 0.5D));
        arrayOfInt4[1] = ((int)(n * arrayOfInt4[1] / 4000.0F + k + 0.5D));
        arrayOfInt4[2] = ((int)(m * arrayOfInt4[2] / 4000.0F + 0.5D));
        arrayOfInt4[3] = ((int)(n * arrayOfInt4[3] / 4000.0F + 0.5D));
        arrayOfShape[i1].a(0, false, arrayOfInt4[0], arrayOfInt4[1], arrayOfInt4[2], arrayOfInt4[3]);
      }
    }
    group.f();
    b(group);
  }
  
  public void removeAt(int index)
  {
    b(get(index));
  }
  
  public void remove(Shape shape)
  {
    deleteShape(shape);
  }
  
  public void clear()
  {
    if (!g())
    {
      k().getCharts().clear();
      k().getPictures().clear();
      k().getTextBoxes().clear();
      k().getCheckBoxes().clear();
      k().getComments().b();
    }
    this.InnerList.clear();
  }
  
  public void updateSelectedValue()
    throws Exception
  {
    for (int i = 0; i < getCount(); i++)
    {
      get(i).updateSelectedValue();
      if ((get(i) instanceof ChartShape))
      {
        Chart localChart = ((ChartShape)get(i)).getChart();
        Iterator localIterator = localChart.getShapes().iterator();
        while (localIterator.hasNext())
        {
          Shape localShape = (Shape)localIterator.next();
          if ((!localShape.isHidden()) && (localShape.getMsoDrawingType() != 5)) {
            localShape.updateSelectedValue();
          }
        }
      }
    }
  }
  
  void c(int paramInt)
  {
    b(get(paramInt));
  }
  
  void d(int paramInt)
  {
    this.InnerList.remove(paramInt);
  }
  
  void a(int paramInt, Shape paramShape)
  {
    if (paramInt >= getCount()) {
      zf.a(this.InnerList, paramShape);
    } else {
      this.InnerList.add(paramInt, paramShape);
    }
  }
  
  void a(Shape paramShape)
  {
    this.InnerList.remove(paramShape);
  }
  
  void e(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.O() == paramInt)
      {
        b(localShape);
        break;
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramInt2 == 0) {
      return;
    }
    if (k().getComments().getCount() != 0) {
      k().getComments().b(paramInt1, paramInt2);
    }
    if (k().getCharts().getCount() != 0) {
      k().getCharts().a(paramInt1, paramInt2, paramWorksheet, paramBoolean);
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      Object localObject1;
      if (localShape.af() != null)
      {
        localObject1 = localShape.af();
        zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, localObject1.length - 1, (byte[])localObject1);
      }
      Object localObject2;
      switch (localShape.getMsoDrawingType())
      {
      case 18: 
        localObject1 = (ListBox)localShape;
        if (((ListBox)localObject1).ah() != null)
        {
          localObject2 = ((ListBox)localObject1).ah();
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, localObject2.length - 1, (byte[])localObject2);
        }
        break;
      case 20: 
        localObject2 = (ComboBox)localShape;
        if (((ComboBox)localObject2).ah() != null)
        {
          byte[] arrayOfByte = ((ComboBox)localObject2).ah();
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, arrayOfByte.length - 1, arrayOfByte);
        }
        break;
      }
      if (!localShape.W()) {
        localShape.a(paramInt1, paramInt2, paramWorksheet, paramBoolean);
      }
    }
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramInt2 == 0) {
      return;
    }
    if (k().getComments().getCount() != 0) {
      k().getComments().c(paramInt1, paramInt2);
    }
    if (k().getCharts().getCount() != 0) {
      k().getCharts().b(paramInt1, paramInt2, paramWorksheet, paramBoolean);
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      Object localObject1;
      if (localShape.af() != null)
      {
        localObject1 = localShape.af();
        zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, localObject1.length - 1, (byte[])localObject1);
      }
      Object localObject2;
      switch (localShape.getMsoDrawingType())
      {
      case 18: 
        localObject1 = (ListBox)localShape;
        if (((ListBox)localObject1).ah() != null)
        {
          localObject2 = ((ListBox)localObject1).ah();
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, localObject2.length - 1, (byte[])localObject2);
        }
        break;
      case 20: 
        localObject2 = (ComboBox)localShape;
        if (((ComboBox)localObject2).ah() != null)
        {
          byte[] arrayOfByte = ((ComboBox)localObject2).ah();
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, 0, arrayOfByte.length - 1, arrayOfByte);
        }
        break;
      }
      if (!localShape.W()) {
        localShape.b(paramInt1, paramInt2, paramWorksheet, paramBoolean);
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    if (paramInt1 == 0) {
      return;
    }
    if ((paramBoolean) && (k().getComments().getCount() != 0)) {
      k().getComments().b(paramCellArea, paramInt1, paramInt2);
    }
    Shape localShape;
    if (paramBoolean) {
      for (int i = getCount() - 1; i >= 0; i--)
      {
        localShape = get(i);
        if ((!localShape.W()) && (localShape.getMsoDrawingType() != 25) && (localShape.getPlacement() != 0)) {
          switch (paramInt2)
          {
          case 3: 
            localShape.a(paramCellArea, paramInt1);
            break;
          case 0: 
            localShape.b(paramCellArea, paramInt1);
            break;
          case 1: 
            if (localShape.c(paramCellArea, paramInt1)) {
              removeAt(i);
            }
            break;
          case 4: 
            if (localShape.d(paramCellArea, paramInt1)) {
              removeAt(i);
            }
            break;
          }
        }
      }
    }
    if (k().getCharts().getCount() != 0) {
      k().getCharts().a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean);
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localShape = (Shape)localIterator.next();
      Object localObject1;
      if (localShape.af() != null)
      {
        localObject1 = localShape.af();
        zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, (byte[])localObject1, 0, localObject1.length - 1, 0, 0, 0, 0);
      }
      Object localObject2;
      switch (localShape.getMsoDrawingType())
      {
      case 18: 
        localObject1 = (ListBox)localShape;
        if (((ListBox)localObject1).ah() != null)
        {
          localObject2 = ((ListBox)localObject1).ah();
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, (byte[])localObject2, 0, localObject2.length - 1, 0, 0, 0, 0);
        }
        break;
      case 20: 
        localObject2 = (ComboBox)localShape;
        if (((ComboBox)localObject2).ah() != null)
        {
          byte[] arrayOfByte = ((ComboBox)localObject2).ah();
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, 0, arrayOfByte.length - 1, 0, 0, 0, 0);
        }
        break;
      }
    }
  }
  
  private void d(Shape paramShape)
  {
    int i = paramShape.w();
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      znn localznn = localShape.g;
      if (localznn != null)
      {
        if (localznn.a == i) {
          localznn.a = -1;
        } else if (localznn.a > i) {
          localznn.a -= 1;
        }
        if (localznn.c == i) {
          localznn.c = -1;
        } else if (localznn.c > i) {
          localznn.c -= 1;
        }
      }
    }
  }
  
  void b(Shape paramShape)
  {
    Object localObject;
    if (paramShape.isGroup())
    {
      localObject = (GroupShape)paramShape;
      Shape[] arrayOfShape1 = ((GroupShape)localObject).getGroupedShapes();
      if ((arrayOfShape1 != null) && (arrayOfShape1.length != 0)) {
        for (Shape localShape : arrayOfShape1) {
          b(localShape);
        }
      }
    }
    if (paramShape.W())
    {
      localObject = paramShape.getGroup();
      if (((GroupShape)localObject).d() != null) {
        for (int i = 0; i < ((GroupShape)localObject).d().size(); i++) {
          if (((GroupShape)localObject).d().get(i) == paramShape)
          {
            ((GroupShape)localObject).d().remove(i);
            break;
          }
        }
      }
    }
    d(paramShape);
    this.InnerList.remove(paramShape);
    if ((this.d instanceof Worksheet)) {
      switch (paramShape.getMsoDrawingType())
      {
      case 8: 
        localObject = (Picture)paramShape;
        this.c.getPictures().b((Picture)localObject);
        f(((Picture)localObject).b());
        break;
      case 6: 
        this.c.getTextBoxes().b((TextBox)paramShape);
        break;
      case 25: 
        this.c.getComments().b(((CommentShape)paramShape).a());
        break;
      case 24: 
        this.c.getOleObjects().b((OleObject)paramShape);
        break;
      case 11: 
        this.c.getCheckBoxes().b((CheckBox)paramShape);
        break;
      case 5: 
        this.c.getCharts().remove(((ChartShape)paramShape).a());
        break;
      case 20: 
        d().c().a(d().c().b() - 1);
        break;
      }
    }
    if (paramShape.W())
    {
      localObject = paramShape.getGroup();
      if ((((GroupShape)localObject).d() == null) || (((GroupShape)localObject).d().size() == 0)) {
        b((Shape)localObject);
      }
    }
  }
  
  void f(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    if (g(paramInt))
    {
      this.f.a().b().a(paramInt - 1).j();
      return;
    }
    this.f.a().b().removeAt(paramInt - 1);
    i(paramInt);
  }
  
  boolean g(int paramInt)
  {
    for (int i = 0; i < j().getCount(); i++)
    {
      Worksheet localWorksheet = j().get(i);
      if ((localWorksheet.w() != null) && (localWorksheet.getShapes().getCount() > 0) && (localWorksheet.getShapes().h(paramInt))) {
        return true;
      }
    }
    return false;
  }
  
  boolean h(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      switch (localShape.getMsoDrawingType())
      {
      case 8: 
      case 24: 
        int i = localShape.R().d().c(16644, 0);
        if ((i != 0) && (i == paramInt)) {
          return true;
        }
        break;
      case 5: 
        if (((ChartShape)localShape).a().g(paramInt)) {
          return true;
        }
        break;
      default: 
        if ((localShape.q != null) && (localShape.q.a != null) && (localShape.q.a.getFillType() == 4))
        {
          TextureFill localTextureFill = localShape.getFill().getTextureFill();
          if (localTextureFill.c + 1 == paramInt) {
            return true;
          }
        }
        break;
      }
    }
    return false;
  }
  
  void i(int paramInt)
  {
    for (int i = 0; i < j().getCount(); i++)
    {
      Worksheet localWorksheet = j().get(i);
      if ((localWorksheet.w() != null) && (localWorksheet.getShapes().getCount() > 0)) {
        localWorksheet.getShapes().j(paramInt);
      }
    }
  }
  
  void j(int paramInt)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      switch (localShape.getMsoDrawingType())
      {
      case 8: 
      case 24: 
        int i = localShape.R().d().c(16644, 0);
        if ((i != 0) && (i > paramInt)) {
          localShape.R().d().a(16644, 0, Integer.valueOf(i - 1));
        }
        break;
      case 5: 
        ((ChartShape)localShape).a().h(paramInt);
        break;
      default: 
        if ((localShape.q != null) && (localShape.q.a != null) && (localShape.q.a.getFillType() == 4))
        {
          TextureFill localTextureFill = localShape.getFill().getTextureFill();
          if ((localTextureFill.c != -1) && (localTextureFill.c + 1 >= paramInt)) {
            localTextureFill.c -= 1;
          }
        }
        break;
      }
    }
  }
  
  int a(Shape paramShape, byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramShape.O() == 0)
    {
      this.e += 1;
      paramShape.g(this.e);
      i = this.f.a(paramShape, paramArrayOfByte);
    }
    zf.a(this.InnerList, paramShape);
    return i;
  }
  
  void c(Shape paramShape)
  {
    if (paramShape.O() == 0)
    {
      this.e += 1;
      paramShape.g(this.e);
      this.f.a(paramShape);
    }
    zf.a(this.InnerList, paramShape);
  }
  
  void a(Shape paramShape, zm paramzm)
  {
    zf.a(this.InnerList, paramShape);
  }
  
  boolean g()
  {
    return this.d instanceof Chart;
  }
  
  boolean h()
  {
    return this.d instanceof PageSetup;
  }
  
  Object i()
  {
    return this.d;
  }
  
  WorksheetCollection j()
  {
    return this.b;
  }
  
  void a(HashMap paramHashMap)
  {
    if (this.c.getCharts().getCount() > 0) {
      this.c.getCharts().a(paramHashMap);
    }
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.af() != null) {
        zaaq.b(localShape.af(), 0, localShape.af().length - 1, paramHashMap, this.b);
      }
      if (localShape.ah() != null) {
        zaaq.b(localShape.ah(), 0, localShape.ah().length - 1, paramHashMap, this.b);
      }
      if (localShape.S() != null) {
        localShape.S().a(paramHashMap, j());
      }
    }
  }
  
  Worksheet k()
  {
    return this.c;
  }
  
  boolean l()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.getMsoDrawingType() == 19) {
        return true;
      }
    }
    return false;
  }
  
  void a(zcw paramzcw)
  {
    byte[] arrayOfByte = null;
    ShapeCollection localShapeCollection = this;
    for (int i = 0; i < localShapeCollection.getCount(); i++)
    {
      Shape localShape = localShapeCollection.get(i);
      if ((localShape.i != null) && (!"".equals(localShape.i)) && (localShape.S() != null)) {
        localShape.S().a(this.b, this.c, localShape.i);
      }
      if (localShape.getMsoDrawingType() == 5)
      {
        Chart localChart = ((ChartShape)localShape).a();
        localChart.a(paramzcw);
      }
      arrayOfByte = localShape.af();
      if (arrayOfByte != null) {
        localShape.c(paramzcw.a(arrayOfByte, 0));
      }
      arrayOfByte = localShape.ah();
      if (arrayOfByte != null) {
        localShape.e(paramzcw.a(arrayOfByte, 0));
      }
      arrayOfByte = localShape.y;
      if (arrayOfByte != null) {
        localShape.y = paramzcw.a(arrayOfByte, 0);
      }
    }
  }
  
  void m()
  {
    byte[] arrayOfByte = null;
    ShapeCollection localShapeCollection = this;
    for (int i = 0; i < localShapeCollection.getCount(); i++)
    {
      Shape localShape = localShapeCollection.get(i);
      if (localShape.getMsoDrawingType() == 5)
      {
        Chart localChart = ((ChartShape)localShape).a();
        localChart.K();
      }
      arrayOfByte = localShape.af();
      if (arrayOfByte != null) {
        localShape.c(zcv.a(arrayOfByte, 0, 0, 0, false, null));
      }
      arrayOfByte = localShape.ah();
      if (arrayOfByte != null) {
        localShape.e(zcv.a(arrayOfByte, 0, 0, 0, false, null));
      }
      arrayOfByte = localShape.y;
      if (arrayOfByte != null) {
        localShape.y = zcv.a(arrayOfByte, 0, 0, 0, false, null);
      }
    }
  }
  
  Shape a(int paramInt1, int paramInt2)
  {
    Object localObject = null;
    switch (paramInt1)
    {
    case 4: 
      localObject = new ArcShape(this);
      break;
    case 7: 
      localObject = new Button(this);
      break;
    case 11: 
      localObject = new CheckBox(this);
      if (!g()) {
        k().getCheckBoxes().a((CheckBox)localObject);
      }
      break;
    case 20: 
      localObject = new ComboBox(this);
      break;
    case 19: 
      localObject = new GroupBox(this);
      break;
    case 14: 
      localObject = new Label(this);
      break;
    case 18: 
      localObject = new ListBox(this);
      break;
    case 3: 
      localObject = new Oval(this);
      break;
    case 12: 
      localObject = new RadioButton(this);
      break;
    case 2: 
      localObject = new RectangleShape(this);
      break;
    case 17: 
      localObject = new ScrollBar(this);
      break;
    case 16: 
      localObject = new Spinner(this);
      break;
    case 6: 
      localObject = new TextBox(this);
      if (!g()) {
        k().getTextBoxes().a((TextBox)localObject);
      }
      break;
    case 1: 
      localObject = new LineShape(this);
      break;
    case 24: 
      OleObject localOleObject = new OleObject(this);
      localObject = localOleObject;
      j().d += 1;
      localOleObject.f(j().d);
      this.c.getOleObjects().a(localOleObject);
      break;
    case 8: 
      Picture localPicture = new Picture(this);
      localObject = localPicture;
      if (!g()) {
        this.c.getPictures().a(localPicture);
      }
      break;
    case 0: 
      localObject = new GroupShape(this);
      break;
    case 5: 
      Chart localChart = new Chart(k());
      localObject = localChart.getChartObject();
      if (!g()) {
        this.c.getCharts().a(localChart);
      }
      break;
    case 9: 
    case 10: 
    case 13: 
    case 15: 
    case 21: 
    case 22: 
    case 23: 
    default: 
      if (paramInt2 != 4095) {
        switch (paramInt2)
        {
        case 1: 
          localObject = new RectangleShape(this);
          break;
        case 19: 
          localObject = new ArcShape(this);
          break;
        case 3: 
          localObject = new Oval(this);
          break;
        case 20: 
          localObject = new LineShape(this);
          break;
        default: 
          localObject = new CellsDrawing(this, paramInt2);
          break;
        }
      } else {
        localObject = new CellsDrawing(this, paramInt2);
      }
      break;
    }
    ((Shape)localObject).q = null;
    ((Shape)localObject).x = null;
    ((Shape)localObject).p = null;
    c((Shape)localObject);
    return (Shape)localObject;
  }
  
  void b(int paramInt1, int paramInt2)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if (localShape.af() != null) {
        localShape.c(zaaq.a(localShape.af(), 0, localShape.af().length, j(), paramInt1, paramInt2, 0, 0));
      }
      if (localShape.ah() != null) {
        localShape.e(zaaq.a(localShape.ah(), 0, localShape.ah().length, j(), paramInt1, paramInt2, 0, 0));
      }
      if (localShape.y != null) {
        localShape.y = zaaq.a(localShape.y, 0, localShape.y.length, j(), paramInt1, paramInt2, 0, 0);
      }
      if (localShape.getMsoDrawingType() == 5)
      {
        Chart localChart = ((ChartShape)localShape).a();
        localChart.a(paramInt1, paramInt2);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */