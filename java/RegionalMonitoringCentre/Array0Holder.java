package RegionalMonitoringCentre;


/**
* RegionalMonitoringCentre/Array0Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/rmc.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class Array0Holder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public Array0Holder ()
  {
  }

  public Array0Holder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RegionalMonitoringCentre.Array0Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RegionalMonitoringCentre.Array0Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RegionalMonitoringCentre.Array0Helper.type ();
  }

}
