

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Base type for types defining key/value feature (e.g. uima.tt.Lemma type)
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class KeyStringEntry extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(KeyStringEntry.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected KeyStringEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public KeyStringEntry(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public KeyStringEntry(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: key

  /** getter for key - gets A key/value feature (e.g. lemma string in uima.tt.Lemma type)
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (KeyStringEntry_Type.featOkTst && ((KeyStringEntry_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "uima.tt.KeyStringEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KeyStringEntry_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets A key/value feature (e.g. lemma string in uima.tt.Lemma type) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (KeyStringEntry_Type.featOkTst && ((KeyStringEntry_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "uima.tt.KeyStringEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KeyStringEntry_Type)jcasType).casFeatCode_key, v);}    
  }

    