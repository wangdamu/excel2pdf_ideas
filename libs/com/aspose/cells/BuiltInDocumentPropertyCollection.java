package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

public class BuiltInDocumentPropertyCollection
  extends DocumentPropertyCollection
{
  private static HashMap a;
  private static ArrayList b = new ArrayList();
  
  public DocumentProperty get(String name)
  {
    zbrg.a(name, "name");
    String str = (String)a.get(name);
    if (str == null) {
      str = name;
    }
    DocumentProperty localDocumentProperty = super.get(str);
    if (localDocumentProperty == null)
    {
      zaxx localzaxx = a(name);
      if (localzaxx != null) {
        localDocumentProperty = super.a(localzaxx.a, localzaxx.b, localzaxx.c, localzaxx.a(), false);
      }
    }
    return localDocumentProperty;
  }
  
  public String getAuthor()
  {
    return zs.a(get("Author"));
  }
  
  public void setAuthor(String value)
  {
    get("Author").setValue(value);
  }
  
  /**
   * @deprecated
   */
  public int getBytes()
  {
    return get("Bytes").toInt();
  }
  
  /**
   * @deprecated
   */
  public void setBytes(int value)
  {
    get("Bytes").setValue(Integer.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  public int getCharacters()
  {
    return get("Characters").toInt();
  }
  
  /**
   * @deprecated
   */
  public void setCharacters(int value)
  {
    get("Characters").setValue(Integer.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  public int getCharactersWithSpaces()
  {
    return get("CharactersWithSpaces").toInt();
  }
  
  /**
   * @deprecated
   */
  public void setCharactersWithSpaces(int value)
  {
    get("CharactersWithSpaces").setValue(Integer.valueOf(value));
  }
  
  public String getComments()
  {
    return zs.a(get("Comments"));
  }
  
  public void setComments(String value)
  {
    get("Comments").setValue(value);
  }
  
  public String getCategory()
  {
    return zs.a(get("Category"));
  }
  
  public void setCategory(String value)
  {
    get("Category").setValue(value);
  }
  
  public String getContentType()
  {
    return zs.a(get("ContentType"));
  }
  
  public void setContentType(String value)
  {
    get("ContentType").setValue(value);
  }
  
  public String getContentStatus()
  {
    return zs.a(get("ContentStatus"));
  }
  
  public void setContentStatus(String value)
  {
    get("ContentStatus").setValue(value);
  }
  
  public String getCompany()
  {
    return zs.a(get("Company"));
  }
  
  public void setCompany(String value)
  {
    get("Company").setValue(value);
  }
  
  public String getHyperlinkBase()
  {
    return zs.a(get("HyperlinkBase"));
  }
  
  public void setHyperlinkBase(String value)
  {
    get("HyperlinkBase").setValue(value);
  }
  
  public DateTime getCreatedTime()
  {
    return get("CreateTime").toDateTime();
  }
  
  public void setCreatedTime(DateTime value)
  {
    get("CreateTime").setValue(value);
  }
  
  public String getKeywords()
  {
    return zs.a(get("Keywords"));
  }
  
  public void setKeywords(String value)
  {
    get("Keywords").setValue(value);
  }
  
  public DateTime getLastPrinted()
  {
    return get("LastPrinted").toDateTime();
  }
  
  public void setLastPrinted(DateTime value)
  {
    get("LastPrinted").setValue(value);
  }
  
  public String getLastSavedBy()
  {
    return zs.a(get("LastSavedBy"));
  }
  
  public void setLastSavedBy(String value)
  {
    get("LastSavedBy").setValue(value);
  }
  
  public DateTime getLastSavedTime()
  {
    return get("LastSavedTime").toDateTime();
  }
  
  public void setLastSavedTime(DateTime value)
  {
    get("LastSavedTime").setValue(value);
  }
  
  /**
   * @deprecated
   */
  public int getLines()
  {
    return get("Lines").toInt();
  }
  
  /**
   * @deprecated
   */
  public void setLines(int value)
  {
    get("Lines").setValue(Integer.valueOf(value));
  }
  
  public String getManager()
  {
    return zs.a(get("Manager"));
  }
  
  public void setManager(String value)
  {
    get("Manager").setValue(value);
  }
  
  public String getNameOfApplication()
  {
    return zs.a(get("NameOfApplication"));
  }
  
  public void setNameOfApplication(String value)
  {
    get("NameOfApplication").setValue(value);
  }
  
  public int getPages()
  {
    return get("Pages").toInt();
  }
  
  public void setPages(int value)
  {
    get("Pages").setValue(Integer.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  public int getParagraphs()
  {
    return get("Paragraphs").toInt();
  }
  
  /**
   * @deprecated
   */
  public void setParagraphs(int value)
  {
    get("Paragraphs").setValue(Integer.valueOf(value));
  }
  
  /**
   * @deprecated
   */
  public int getRevisionNumber()
  {
    String str = getRevision();
    try
    {
      return (int)zp.a(str);
    }
    catch (Exception localException) {}
    return 0;
  }
  
  /**
   * @deprecated
   */
  public void setRevisionNumber(int value)
  {
    setRevision(zp.a(value));
  }
  
  public String getRevision()
  {
    String str = zs.a(get("RevisionNumber"));
    return zw.b(str) ? "0" : str;
  }
  
  public void setRevision(String value)
  {
    get("RevisionNumber").setValue(value);
  }
  
  int a()
  {
    return get("Security").toInt();
  }
  
  void a(int paramInt)
  {
    get("Security").setValue(Integer.valueOf(paramInt));
  }
  
  public String getSubject()
  {
    return zs.a(get("Subject"));
  }
  
  public void setSubject(String value)
  {
    get("Subject").setValue(value);
  }
  
  public String getTemplate()
  {
    return zs.a(get("Template"));
  }
  
  public void setTemplate(String value)
  {
    get("Template").setValue(value);
  }
  
  public String getTitle()
  {
    return zs.a(get("Title"));
  }
  
  public void setTitle(String value)
  {
    get("Title").setValue(value);
  }
  
  public double getTotalEditingTime()
  {
    return get("TotalEditingTime").toDouble();
  }
  
  public void setTotalEditingTime(double value)
  {
    get("TotalEditingTime").setValue(Double.valueOf(value));
  }
  
  public String getVersion()
  {
    DocumentProperty localDocumentProperty = get("Version");
    return zs.a(localDocumentProperty);
  }
  
  public void setVersion(String value)
  {
    get("Version").setValue(value);
  }
  
  public boolean getScaleCrop()
  {
    return get("ScaleCrop").toBool();
  }
  
  public void setScaleCrop(boolean value)
  {
    get("ScaleCrop").setValue(Boolean.valueOf(value));
  }
  
  public boolean getLinksUpToDate()
  {
    return get("LinksUpToDate").toBool();
  }
  
  public void setLinksUpToDate(boolean value)
  {
    get("LinksUpToDate").setValue(Boolean.valueOf(value));
  }
  
  public int getWords()
  {
    return get("Words").toInt();
  }
  
  public void setWords(int value)
  {
    get("Words").setValue(Integer.valueOf(value));
  }
  
  static String a(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < b.size(); i++)
    {
      zaxx localzaxx = (zaxx)b.get(i);
      if ((localzaxx.b == paramInt1) && (localzaxx.a == paramInt2)) {
        return localzaxx.c;
      }
    }
    return null;
  }
  
  private static zaxx a(String paramString)
  {
    for (int i = 0; i < b.size(); i++)
    {
      zaxx localzaxx = (zaxx)b.get(i);
      if (zw.a(localzaxx.c, paramString, true) == 0) {
        return localzaxx;
      }
    }
    return null;
  }
  
  static
  {
    zf.a(b, new zaxx(0, 2, "Title", 4));
    zf.a(b, new zaxx(0, 3, "Subject", 4));
    zf.a(b, new zaxx(0, 4, "Author", 4));
    zf.a(b, new zaxx(0, 5, "Keywords", 4));
    zf.a(b, new zaxx(0, 6, "Comments", 4));
    zf.a(b, new zaxx(0, 7, "Template", 4));
    zf.a(b, new zaxx(0, 8, "LastSavedBy", 4));
    zf.a(b, new zaxx(0, 9, "RevisionNumber", 4));
    zf.a(b, new zaxx(0, 10, "TotalEditingTime", 2));
    zf.a(b, new zaxx(0, 11, "LastPrinted", 1));
    zf.a(b, new zaxx(0, 12, "CreateTime", 1));
    zf.a(b, new zaxx(0, 13, "LastSavedTime", 1));
    zf.a(b, new zaxx(0, 14, "Pages", 3));
    zf.a(b, new zaxx(0, 15, "Words", 3));
    zf.a(b, new zaxx(0, 16, "Characters", 3));
    zf.a(b, new zaxx(0, 19, "Security", 3));
    zf.a(b, new zaxx(0, 18, "NameOfApplication", 4));
    zf.a(b, new zaxx(1, 2, "Category", 4));
    zf.a(b, new zaxx(1, 2, "ContentType", 4));
    zf.a(b, new zaxx(1, 2, "ContentStatus", 4));
    zf.a(b, new zaxx(1, 3, "Format", 4));
    zf.a(b, new zaxx(1, 4, "Bytes", 3));
    zf.a(b, new zaxx(1, 5, "Lines", 3));
    zf.a(b, new zaxx(1, 6, "Paragraphs", 3));
    zf.a(b, new zaxx(1, 7, "Slides", 3));
    zf.a(b, new zaxx(1, 8, "Notes", 3));
    zf.a(b, new zaxx(1, 9, "HiddenSlides", 3));
    zf.a(b, new zaxx(1, 10, "MultimediaClips", 3));
    zf.a(b, new zaxx(1, 11, "ScaleCrop", 0));
    zf.a(b, new zaxx(1, 14, "Manager", 4));
    zf.a(b, new zaxx(1, 15, "Company", 4));
    zf.a(b, new zaxx(1, 20, "HyperlinkBase", 4));
    zf.a(b, new zaxx(1, 16, "LinksUpToDate", 0));
    zf.a(b, new zaxx(1, 17, "CharactersWithSpaces", 3));
    zf.a(b, new zaxx(1, 23, "Version", 4));
    zf.a(b, new zaxx(1, 24, "DigSig", 5));
    a = new HashMap();
    a.put("Last Author", "LastSavedBy");
    a.put("Revision Number", "RevisionNumber");
    a.put("Total Editing Time", "TotalEditingTime");
    a.put("Last Print Date", "LastPrinted");
    a.put("Creation Date", "CreateTime");
    a.put("Last Save Time", "LastSavedTime");
    a.put("Number of Pages", "Pages");
    a.put("Number of Words", "Words");
    a.put("Number of Characters", "Characters");
    a.put("Application Name", "NameOfApplication");
    a.put("Number of Bytes", "Bytes");
    a.put("Number of Lines", "Lines");
    a.put("Number of Paragraphs", "Paragraphs");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/BuiltInDocumentPropertyCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */