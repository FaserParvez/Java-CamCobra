package RegionalMonitoringCentre;


/**
* RegionalMonitoringCentre/StationsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/rmc.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class StationsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public StationsHolder ()
  {
  }

  public StationsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RegionalMonitoringCentre.StationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RegionalMonitoringCentre.StationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RegionalMonitoringCentre.StationsHelper.type ();
  }

}
