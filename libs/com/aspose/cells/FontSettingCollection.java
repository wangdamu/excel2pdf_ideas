package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class FontSettingCollection
  extends CollectionBase
{
  WorksheetCollection a;
  Object b;
  String c;
  ShapeTextAlignment d;
  zane e;
  private int g = -1;
  zqk f = null;
  
  short a()
  {
    return (short)h().q();
  }
  
  public void setWordArtStyle(int style)
    throws Exception
  {
    String str = getText();
    clear();
    setText(str);
    zalg.a(style, this, get(getCount() == 1 ? 0 : 1).getTextOptions(), false);
  }
  
  public ShapeTextAlignment getTextAlignment()
    throws Exception
  {
    if (this.d.a != null)
    {
      zcjy localzcjy = zauy.a(this.d.a, false);
      localzcjy.a(0);
      localzcjy.d();
      zalg.a(localzcjy, this.d);
      this.d.a = null;
    }
    return this.d;
  }
  
  zane b()
  {
    if (this.e == null) {
      this.e = new zane();
    }
    if ((!this.e.b) && (this.e.a != null))
    {
      zaux.a(this.e, this);
      this.e.b = true;
    }
    return this.e;
  }
  
  Font c()
  {
    if (getCount() == 2) {
      return get(1).q != null ? get(1).getFont() : get(0).getFont();
    }
    return get(0).getFont();
  }
  
  void a(Font paramFont)
  {
    n();
    c(paramFont);
  }
  
  TextOptions d()
  {
    if (getCount() == 2) {
      return get(1).q != null ? get(1).getTextOptions() : get(0).getTextOptions();
    }
    return get(0).getTextOptions();
  }
  
  void a(TextOptions paramTextOptions)
  {
    n();
    c(paramTextOptions);
  }
  
  private void c(Font paramFont)
  {
    boolean bool = paramFont.l();
    CopyOptions localCopyOptions = new CopyOptions();
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      FontSetting localFontSetting = (FontSetting)localIterator.next();
      if (localFontSetting.q != paramFont) {
        if (bool) {
          localFontSetting.getTextOptions().a(paramFont, localCopyOptions);
        } else {
          localFontSetting.getFont().a(paramFont, localCopyOptions);
        }
      }
    }
  }
  
  Font e()
  {
    if (getCount() == 2) {
      return get(1).q == null ? get(0).q : get(1).q;
    }
    return get(0).q;
  }
  
  int f()
  {
    return h().g();
  }
  
  public TextParagraphCollection getTextParagraphs()
  {
    return new TextParagraphCollection(this);
  }
  
  int g()
  {
    int i = 0;
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      FontSetting localFontSetting = (FontSetting)localIterator.next();
      if (localFontSetting.getType() == 1) {
        i++;
      }
    }
    return i;
  }
  
  public Iterator getParagraphEnumerator()
  {
    return new zbwb(this);
  }
  
  public String getText()
  {
    return this.c;
  }
  
  public void setText(String value)
  {
    n();
    if (zw.b(this.c, value)) {
      return;
    }
    this.c = value;
    this.g = -1;
    if ((value == null) || ("".equals(value)))
    {
      clear();
      return;
    }
    Font localFont = null;
    if (get(0).p > 0) {
      localFont = get(0).q;
    } else if (getCount() > 1) {
      localFont = get(1).q;
    }
    if ((localFont == null) && (getCount() > 0)) {
      localFont = get(0).q;
    }
    clear();
    if ((this.c == null) || ("".equals(this.c))) {
      return;
    }
    this.c = a(this.c);
    a(0, 0, this.c.toCharArray(), localFont);
  }
  
  public void appendText(String text)
  {
    if ((text == null) || ("".equals(text))) {
      return;
    }
    l();
    text = a(text);
    Font localFont = localFont = get(getCount() - 1).q;
    a(getCount(), o(), text.toCharArray(), localFont);
    this.c += text;
  }
  
  public void insertText(int index, String text)
  {
    if ((this.c == null) || ("".equals(this.c)))
    {
      setText(text);
      return;
    }
    if ((text == null) || ("".equals(text))) {
      return;
    }
    if (index >= o())
    {
      appendText(text);
      return;
    }
    text = a(text);
    l();
    for (int i = getCount() - 1; i >= 0; i--)
    {
      FontSetting localFontSetting1 = get(i);
      if (localFontSetting1.o <= index)
      {
        int j = i;
        Font localFont = localFontSetting1.q;
        if ((localFontSetting1.getType() != 1) && (localFontSetting1.o != index))
        {
          int k = localFontSetting1.p;
          localFontSetting1.p = (index - localFontSetting1.o);
          FontSetting localFontSetting2 = new FontSetting(index, k - localFontSetting1.p, this.a, this);
          localFontSetting2.q = d(localFont);
          this.InnerList.add(i + 1, localFontSetting2);
          j++;
        }
        a(j, index, text.toCharArray(), localFont);
        break;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c.substring(0, 0 + index));
    localStringBuilder.append(text);
    localStringBuilder.append(this.c.substring(index));
    this.c = zs.a(localStringBuilder);
  }
  
  public void replace(int index, int count, String text)
  {
    Font localFont = c(index, count);
    deleteText(index, count);
    insertText(index, text);
    if (localFont != null) {
      a(index, text.length()).q = localFont;
    }
  }
  
  public void deleteText(int index, int count)
  {
    int i = o();
    if (i == 0) {
      return;
    }
    int j = index + count;
    if (j > i) {
      count = i - index;
    }
    if ((index == 0) && (count >= i))
    {
      setText(null);
      return;
    }
    int k = index + count - 1;
    for (int m = getCount() - 1; m >= 0; m--)
    {
      FontSetting localFontSetting = get(m);
      int n = localFontSetting.o + localFontSetting.p - 1;
      if (index > n) {
        break;
      }
      if (k >= localFontSetting.o)
      {
        if (k <= n)
        {
          int i1;
          if (index <= localFontSetting.o)
          {
            if (k == n)
            {
              removeAt(m);
              k = localFontSetting.o - 1;
            }
            else
            {
              i1 = k - localFontSetting.o + 1;
              localFontSetting.p -= i1;
              k = localFontSetting.o - 1;
              localFontSetting.o = (localFontSetting.o + i1 - count);
            }
            if (k < index) {
              break;
            }
            if ((localFontSetting.getType() == 0) && (get(m - 1).getType() == 1))
            {
              removeAt(m - 1);
              m--;
            }
          }
          else
          {
            i1 = k - index + 1;
            localFontSetting.p -= i1;
            break;
          }
        }
      }
      else {
        localFontSetting.o -= count;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c.substring(0, 0 + index));
    localStringBuilder.append(this.c.substring(index + count));
    this.c = zs.a(localStringBuilder);
  }
  
  private static String a(String paramString)
  {
    return zw.a(paramString, "\r\n", "\n");
  }
  
  private Font d(Font paramFont)
  {
    if (paramFont == null) {
      return null;
    }
    if (paramFont.l())
    {
      localObject = new TextOptions(this.a, this.b);
      ((TextOptions)localObject).a(paramFont, null);
      return (Font)localObject;
    }
    Object localObject = new Font(this.a, this.b, this.b != null);
    ((Font)localObject).a(paramFont, null);
    return (Font)localObject;
  }
  
  private void a(int paramInt1, int paramInt2, char[] paramArrayOfChar, Font paramFont)
  {
    int i = 0;
    int j = paramInt1;
    if ((paramInt1 < getCount()) && (get(paramInt1).getType() == 1))
    {
      i = get(paramInt1).p > 0 ? 1 : 0;
      get(paramInt1).p = 0;
      j = paramInt1 + 1;
    }
    int k = 0;
    for (int m = 0; m < paramArrayOfChar.length; m++)
    {
      Object localObject;
      if (paramArrayOfChar[m] == '\n')
      {
        if (m == k)
        {
          get(j - 1).p += 1;
          paramInt2++;
        }
        else
        {
          localObject = new FontSetting(paramInt2, m - k + 1, this.a, this);
          this.InnerList.add(j, localObject);
          ((FontSetting)localObject).q = d(paramFont);
          j++;
          paramInt2 += ((FontSetting)localObject).p;
        }
        localObject = new TextParagraph(paramInt2, 0, this.a.p(), this);
        ((TextParagraph)localObject).q = d(paramFont);
        this.InnerList.add(j, localObject);
        j++;
        k = m + 1;
      }
      else if ((m + 1 == paramArrayOfChar.length) && (m >= k))
      {
        localObject = new FontSetting(paramInt2, m - k + 1, this.a, this);
        this.InnerList.add(j, localObject);
        ((FontSetting)localObject).q = d(paramFont);
        j++;
        paramInt2 += ((FontSetting)localObject).p;
        break;
      }
    }
    if (i != 0) {
      get(j - 1).p += 1;
    }
    for (m = j; m < getCount(); m++) {
      get(m).o += paramArrayOfChar.length;
    }
  }
  
  public String getHtmlString()
    throws Exception
  {
    return zgv.a(this);
  }
  
  public void setHtmlString(String value)
  {
    n();
    if (this.b != null)
    {
      Shape localShape = (Shape)this.b;
      zgv.a(localShape, this, value);
    }
  }
  
  TextParagraph h()
  {
    return (TextParagraph)get(0);
  }
  
  TextParagraph i()
  {
    for (int i = getCount() - 1; i >= 0; i--) {
      if (get(i).getType() == 1) {
        return (TextParagraph)get(i);
      }
    }
    return (TextParagraph)get(0);
  }
  
  boolean j()
  {
    if ((getCount() == 2) && (h().d != null)) {
      return true;
    }
    return getCount() > 2;
  }
  
  FontSettingCollection(WorksheetCollection sheets, Object parent)
  {
    this.a = sheets;
    this.b = parent;
    this.d = new ShapeTextAlignment(this);
    TextParagraph localTextParagraph = new TextParagraph(0, 0, sheets.p(), this);
    a(localTextParagraph);
  }
  
  private FontSetting a(int paramInt1, int paramInt2, Font paramFont, StyleFlag paramStyleFlag)
  {
    int i = o();
    Font localFont = c();
    FontSetting localFontSetting1;
    if (paramInt1 != 0)
    {
      localFontSetting1 = b(0, paramInt1);
      localFontSetting1.getFont().a(localFont, null);
    }
    FontSetting localFontSetting2 = b(paramInt1, paramInt2);
    localFontSetting2.getFont().a(localFont, null);
    if (paramFont != null) {
      zbtc.a(localFontSetting2.getFont(), paramFont, paramStyleFlag);
    }
    int j = paramInt1 + paramInt2;
    if (j != i)
    {
      localFontSetting1 = b(j, i - j);
      localFontSetting1.getFont().a(localFont, null);
    }
    return localFontSetting2;
  }
  
  private Font c(int paramInt1, int paramInt2)
  {
    int i = o();
    Font localFont = c();
    if (paramInt1 >= i) {
      return null;
    }
    if (paramInt1 + paramInt2 > i) {
      paramInt2 = i - paramInt1;
    }
    if (getCount() == 1) {
      return null;
    }
    for (int j = 0; j < getCount(); j++)
    {
      FontSetting localFontSetting = get(j);
      if ((localFontSetting.getStartIndex() >= paramInt1) && (localFontSetting.getLength() + localFontSetting.getStartIndex() <= paramInt1 + paramInt2)) {
        return localFontSetting.getFont();
      }
    }
    return null;
  }
  
  FontSetting a(int paramInt1, int paramInt2)
  {
    int i = o();
    Font localFont = c();
    if (paramInt1 >= i) {
      return null;
    }
    if (paramInt1 + paramInt2 > i) {
      paramInt2 = i - paramInt1;
    }
    if (getCount() == 1) {
      return a(paramInt1, paramInt2, null, null);
    }
    for (int j = 0; j < getCount(); j++)
    {
      localFontSetting1 = get(j);
      if ((localFontSetting1.getLength() == paramInt2) && (localFontSetting1.getStartIndex() == paramInt1)) {
        return localFontSetting1;
      }
    }
    FontSetting localFontSetting1 = new FontSetting(paramInt1, paramInt2, this.a);
    j = 0;
    for (int k = 0; k < getCount(); k++)
    {
      FontSetting localFontSetting2 = get(k);
      if ((localFontSetting2.getStartIndex() <= paramInt1) && (localFontSetting2.getLength() + localFontSetting2.getStartIndex() >= paramInt2 + paramInt1))
      {
        j = 1;
        localFontSetting1.getFont().a(localFontSetting2.getFont(), null);
      }
    }
    if (j == 0) {
      localFontSetting1.getFont().a(localFont, null);
    }
    localFontSetting1.getFont().o();
    a(localFontSetting1);
    if (this.g == -1) {
      this.g = (getCount() - 1);
    }
    return localFontSetting1;
  }
  
  private Font a(Font paramFont1, Font paramFont2, StyleFlag paramStyleFlag, Font paramFont3)
  {
    if (paramFont1 != null) {
      return paramFont1;
    }
    paramFont1 = new Font(this.a, this.b, this.b != null);
    paramFont1.a(paramFont3, null);
    paramFont1.o();
    zbtc.a(paramFont2, paramFont1, paramStyleFlag);
    return paramFont1;
  }
  
  public void format(int startIndex, int length, Font font, StyleFlag flag)
  {
    int i = o();
    if (startIndex >= i) {
      return;
    }
    Font localFont = c();
    if (startIndex + length > i) {
      length = i - startIndex;
    }
    if (getCount() == 1)
    {
      a(startIndex, length, font, flag);
    }
    else
    {
      l();
      b(startIndex, length, font, flag);
    }
  }
  
  private void b(int paramInt1, int paramInt2, Font paramFont, StyleFlag paramStyleFlag)
  {
    int i = o();
    if (paramInt1 >= i) {
      return;
    }
    Font localFont1 = c();
    if (paramInt1 + paramInt2 > i) {
      paramInt2 = i - paramInt1;
    }
    Font localFont2 = null;
    FontSetting localFontSetting1 = null;
    for (int j = 1; j < getCount(); j++)
    {
      FontSetting localFontSetting3 = get(j);
      if (localFontSetting3.getType() == 0)
      {
        int k = paramInt1 + paramInt2 - 1;
        int m = localFontSetting3.getStartIndex() + localFontSetting3.getLength() - 1;
        if ((k == m) && (localFontSetting3.getStartIndex() == paramInt1))
        {
          zbtc.a(paramFont, localFontSetting3.getFont(), paramStyleFlag);
          return;
        }
        if (paramInt1 <= localFontSetting3.getStartIndex())
        {
          if (localFontSetting3.getStartIndex() > k)
          {
            localFont2 = a(localFont2, paramFont, paramStyleFlag, localFont1);
            localFontSetting1 = b(j, paramInt1, paramInt2);
            localFontSetting1.q = localFont2;
            return;
          }
          if (paramInt1 != localFontSetting3.getStartIndex())
          {
            localFont2 = a(localFont2, paramFont, paramStyleFlag, localFont1);
            localFontSetting1 = b(j, paramInt1, localFontSetting3.getStartIndex() - paramInt1);
            j++;
            paramInt2 -= localFontSetting3.getStartIndex() - paramInt1;
            paramInt1 = localFontSetting3.getStartIndex();
          }
          if (m > k)
          {
            localFontSetting1 = b(j, localFontSetting3.getStartIndex(), paramInt2);
            localFontSetting1.a(localFontSetting3, null);
            zbtc.a(paramFont, localFontSetting1.getFont(), paramStyleFlag);
            localFontSetting3.o += localFontSetting1.getLength();
            localFontSetting3.p -= localFontSetting1.getLength();
            return;
          }
          zbtc.a(paramFont, localFontSetting3.getFont(), paramStyleFlag);
          paramInt2 -= localFontSetting3.getLength();
          paramInt1 += localFontSetting3.getLength();
        }
        else if (paramInt1 <= m)
        {
          localFontSetting1 = b(j, localFontSetting3.getStartIndex(), paramInt1 - localFontSetting3.getStartIndex());
          localFontSetting1.a(localFontSetting3, null);
          j++;
          localFontSetting3.o = paramInt1;
          localFontSetting3.p -= localFontSetting1.getLength();
          if (m <= k)
          {
            zbtc.a(paramFont, localFontSetting3.getFont(), paramStyleFlag);
            paramInt2 -= localFontSetting3.getLength();
            paramInt1 += localFontSetting3.getLength();
          }
          else
          {
            localFontSetting1 = b(j, paramInt1, paramInt2);
            localFontSetting1.a(localFontSetting3, null);
            zbtc.a(paramFont, localFontSetting1.getFont(), paramStyleFlag);
            localFontSetting3.p -= paramInt2;
            localFontSetting3.o += paramInt2;
            return;
          }
        }
        if (paramInt2 == 0) {
          return;
        }
      }
    }
    if (paramInt2 != 0)
    {
      FontSetting localFontSetting2 = b(paramInt1, paramInt2);
      if (localFont2 != null) {
        localFontSetting2.q = localFont2;
      }
    }
  }
  
  public FontSetting get(int index)
  {
    return (FontSetting)this.InnerList.get(index);
  }
  
  int a(FontSetting paramFontSetting)
  {
    zf.a(this.InnerList, paramFontSetting);
    return getCount() - 1;
  }
  
  FontSetting b(int paramInt1, int paramInt2)
  {
    FontSetting localFontSetting = new FontSetting(paramInt1, paramInt2, this.a, this);
    a(localFontSetting);
    return localFontSetting;
  }
  
  FontSetting a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = null;
    switch (paramInt1)
    {
    case 2: 
      TextParagraph localTextParagraph = i();
      localObject = new ztw(this.a.p(), localTextParagraph, localTextParagraph);
      break;
    case 1: 
      localObject = new TextParagraph(paramInt2, paramInt3, this.a.p(), this);
      break;
    case 0: 
      localObject = new FontSetting(paramInt2, paramInt3, this.a, this);
    }
    a((FontSetting)localObject);
    return (FontSetting)localObject;
  }
  
  FontSetting b(int paramInt1, int paramInt2, int paramInt3)
  {
    FontSetting localFontSetting = new FontSetting(paramInt2, paramInt3, this.a, this);
    this.InnerList.add(paramInt1, localFontSetting);
    return localFontSetting;
  }
  
  void a(FontSettingCollection paramFontSettingCollection, CopyOptions paramCopyOptions)
  {
    this.c = paramFontSettingCollection.c;
    this.d.a(paramFontSettingCollection.d, paramCopyOptions);
    this.g = paramFontSettingCollection.g;
    this.InnerList.clear();
    for (int i = 0; i < paramFontSettingCollection.getCount(); i++)
    {
      FontSetting localFontSetting1 = paramFontSettingCollection.get(i);
      FontSetting localFontSetting2 = a(localFontSetting1.getType(), localFontSetting1.getStartIndex(), localFontSetting1.getLength());
      localFontSetting2.a(localFontSetting1, paramCopyOptions);
    }
    if ((paramFontSettingCollection.getCount() == 2) && (paramFontSettingCollection.get(1).getType() == 0) && (paramFontSettingCollection.get(1).q == paramFontSettingCollection.get(0).q)) {
      get(0).q = get(1).q;
    }
  }
  
  ArrayList a(boolean paramBoolean1, boolean paramBoolean2)
  {
    l();
    ArrayList localArrayList = new ArrayList(getCount());
    Object localObject = iterator();
    while (((Iterator)localObject).hasNext())
    {
      FontSetting localFontSetting = (FontSetting)((Iterator)localObject).next();
      if (paramBoolean1) {
        zf.a(localArrayList, localFontSetting);
      } else if (localFontSetting.getLength() != 0) {
        zf.a(localArrayList, localFontSetting);
      }
    }
    if ((!paramBoolean1) && (paramBoolean2))
    {
      localObject = get(getCount() - 1);
      if ((((FontSetting)localObject).getType() == 1) && (((FontSetting)localObject).p == 0)) {
        zf.a(localArrayList, localObject);
      }
    }
    return localArrayList;
  }
  
  ArrayList a(Shape paramShape)
  {
    if ((!paramShape.C()) || (paramShape.p == null) || (paramShape.p.b == null)) {
      return a(false, false);
    }
    l();
    ArrayList localArrayList = new ArrayList(getCount());
    for (int i = 0; i < getCount(); i++)
    {
      FontSetting localFontSetting1 = get(i);
      if ((i != 0) && (localFontSetting1.getType() == 1))
      {
        FontSetting localFontSetting2 = get(i - 1);
        if ((localFontSetting2.getType() == 0) && (localFontSetting2.p > 1) && (this.c.charAt(localFontSetting1.getStartIndex() - 1) == '\n'))
        {
          FontSetting localFontSetting3 = new FontSetting(localFontSetting2.o, localFontSetting2.p - 1, paramShape.P(), this);
          localFontSetting3.a(localFontSetting2);
          localArrayList.remove(localArrayList.size() - 1);
          zf.a(localArrayList, localFontSetting3);
          FontSetting localFontSetting4 = new FontSetting(localFontSetting2.getStartIndex() + localFontSetting2.p, 1, paramShape.P(), this);
          localFontSetting4.q = paramShape.p.c;
          zf.a(localArrayList, localFontSetting4);
        }
      }
      if (localFontSetting1.getLength() != 0) {
        zf.a(localArrayList, localFontSetting1);
      }
    }
    return localArrayList;
  }
  
  ArrayList k()
  {
    l();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getCount(); i++) {
      if ((get(i) instanceof ztw)) {
        zf.a(localArrayList, get(i));
      }
    }
    return localArrayList;
  }
  
  static StyleFlag b(Font paramFont)
  {
    StyleFlag localStyleFlag = new StyleFlag();
    if (paramFont.f(13)) {
      localStyleFlag.setFontName(true);
    }
    if (paramFont.f(12)) {
      localStyleFlag.setFontSize(true);
    }
    if (paramFont.f(16)) {
      localStyleFlag.setFontColor(true);
    }
    if (paramFont.f(18)) {
      localStyleFlag.setFontItalic(true);
    }
    if (paramFont.f(20)) {
      localStyleFlag.setFontStrike(true);
    }
    if (paramFont.f(23)) {
      localStyleFlag.setFontScript(true);
    }
    if (paramFont.f(19)) {
      localStyleFlag.setFontUnderline(true);
    }
    if (paramFont.f(17)) {
      localStyleFlag.setFontBold(true);
    }
    return localStyleFlag;
  }
  
  void l()
  {
    int i = o();
    if (this.g != -1)
    {
      ArrayList localArrayList = new ArrayList();
      for (int k = this.g; k < getCount(); k++) {
        localArrayList.add(get(k));
      }
      zf.a(this.InnerList, this.g, getCount() - this.g);
      for (k = 0; k < localArrayList.size(); k++)
      {
        FontSetting localFontSetting2 = (FontSetting)localArrayList.get(k);
        StyleFlag localStyleFlag = b(localFontSetting2.getFont());
        b(localFontSetting2.getStartIndex(), localFontSetting2.getLength(), localFontSetting2.getFont(), localStyleFlag);
      }
      this.g = -1;
    }
    for (int j = getCount() - 1; j >= 0; j--)
    {
      FontSetting localFontSetting1 = get(j);
      if (localFontSetting1.getType() != 0) {
        break;
      }
      if (localFontSetting1.getStartIndex() >= i)
      {
        removeAt(j);
      }
      else
      {
        localFontSetting1.p = (i - localFontSetting1.getStartIndex());
        break;
      }
    }
  }
  
  int m()
    throws Exception
  {
    for (int i = 0; i < getCount(); i++)
    {
      FontSetting localFontSetting = get(i);
      if (localFontSetting.getType() == 1)
      {
        TextParagraph localTextParagraph = (TextParagraph)localFontSetting;
        if ((i + 1 < getCount()) && (get(i + 1).getType() != 1) && (localTextParagraph.g(4096))) {
          return localTextParagraph.getAlignmentType();
        }
      }
    }
    return getTextAlignment().m();
  }
  
  void a(int paramInt)
    throws Exception
  {
    n();
    getTextAlignment().f(paramInt);
    h().setAlignmentType(paramInt);
  }
  
  private int o()
  {
    return this.c == null ? 0 : this.c.length();
  }
  
  void n() {}
  
  public void clear()
  {
    this.g = -1;
    zf.a(this.InnerList, 1, getCount() - 1);
    get(0).p = 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FontSettingCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */